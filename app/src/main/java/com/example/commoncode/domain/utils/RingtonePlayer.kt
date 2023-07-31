package com.example.commoncode.domain.utils

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class RingtonePlayer {
    companion object {
        private var mp: MediaPlayer? = null
        private var isPlaying = false
        private var maxVolume = 5

        fun initializePlayer() {
            mp = MediaPlayer()
        }

        fun playSound(context: Context?, uri: Uri?, volume: Int, isLooping: Boolean) {
            if (context != null && uri != null) {
                if (mp == null) {
                    mp = MediaPlayer()
                }

                mp!!.setAudioAttributes(
                    AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build()
                )

                val am = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager?

                maxVolume = am!!.getStreamMaxVolume(
                    AudioManager.STREAM_MUSIC
                )

                //am.setStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
                am.setStreamVolume(AudioManager.STREAM_MUSIC, maxVolume, 0) //TODO: Uncomment this

                try {
                    mp?.setDataSource(context, uri)
                } catch (e: Exception) {
                    Log.i("TAG", "error setting datasource", e)
                }

                try {
                    mp?.prepare()
                } catch (E: Exception) {
                    Log.i("TAG", "error preparing media player", E)
                }

                if (isLooping) {
                    mp?.isLooping = true
                }
                mp?.start()
                isPlaying = true

                CoroutineScope(IO).launch {
                    while (isPlaying) {
                        try {
                            if (mp?.isPlaying!!) {
                                isPlaying = true
                                withContext(Main) {
                                    am.setStreamVolume(
                                        AudioManager.STREAM_MUSIC, maxVolume, 0
                                    )
                                }
                            } else {
                                isPlaying = false
                            }
                        } catch (e: Exception) {
                        }
                    }
                }
            }
        }

        fun isPlaying(): Boolean? {
            if (mp != null) {
                return mp?.isPlaying
            }

            return false
        }

        fun stopPlayer() {
            try {
                if (mp != null) {
                    if (mp?.isPlaying == true) {
                        mp?.stop()
                        mp?.reset()
                        mp?.release()
                        mp = null
                    }
                }
            } catch (e: Exception) {
            }
        }

        fun releasePlayer() {
            try {
                if (mp != null) {
                    mp!!.reset()
                    mp!!.release()
                    mp = null
                }
            } catch (e: Exception) {
            }
        }
    }
}