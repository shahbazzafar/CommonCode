package com.example.commoncode.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.android.ar.ruler.room.models.VideosModelClass

class SharedViewModel : ViewModel() {

    var videoSortedType: Int = 1

    var videoSortedOrder: String = "ASC"

    var folderSortedType: Int = 1

    var folderSortedOrder: String = "ASC"

    var playlistSortedType: Int = 1

    var playlistSortedOrder: String = "ASC"

    var audioSortedType: Int = 1

    var audioSortedOrder: String = "ASC"

    var isFromFavouriteFragment: Boolean = false

    private var currentFragmentDestination: Int = 0

    private var previousFragmentDestination: Int? = null

    private var findNavController: NavController? = null

    fun setCurrentFragmentDestination(destination: Int) {
        previousFragmentDestination = currentFragmentDestination
        currentFragmentDestination = destination
    }
    fun getCurrentFragmentDestination(): Int {
        return currentFragmentDestination
    }

    fun getPreviousFragmentDestination(): Int? {
        return previousFragmentDestination
    }

    fun setFindNavController(navController: NavController) {
        findNavController = navController
    }

    fun getFindNavController(): NavController? {
        return findNavController
    }


}