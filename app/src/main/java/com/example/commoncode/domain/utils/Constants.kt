package com.example.commoncode.domain.utils

class Constants {

    companion object {

        const val PREF_KEY = "AntiTheftPref"
        const val PREF_PREMIUM = "AntiTheftPremiumPref"


        /**
         * Sensor Constants
         */
        const val SENSOR_PROXIMITY = "ProximityDetection"
        const val SENSOR_MOTION = "MotionDetection"
        const val SENSOR_CHARGER = "ChargerDetection"
        const val SENSOR_HANDS_FREE = "HandsFreeDetection"
        const val SENSOR_WIFI = "WifiDetection"
        const val SENSOR_BATTERY_FULL = "BatteryFullDetection"

        //App will save detected sensor here which will be used when user turn off the alarm.
        const val DETECTED_SENSOR = "detectedSensor"
        const val ALARM_TRIGGERED = "AlarmTriggered"
        const val WIFI_DETECTION_ENABLE_TIME = "WifiDetectionEnableTime"

        /**
         * Detection Start Timer Constant
         */
        const val SENSOR_START_TIME = "SensorStartTime"

        /**
         * Pin Code Constants
         */
        const val IS_PIN_CREATED = "isPinCreated"
        const val AUTH_PIN = "AuthenticationPin"

        /**
         * Ringing Alarm Constant
         */
        const val RINGTONE = "selectedRingtone"
        const val RINGTONE_VOLUME = "ringtoneVolume"

    }
}