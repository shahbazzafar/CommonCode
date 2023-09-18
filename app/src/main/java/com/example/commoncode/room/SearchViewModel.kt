package com.example.commoncode.room

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.pdfReaderApp.database.RecentPDF
//import com.pdfReaderApp.database.SearchHistoryRecord
//import com.pdfReaderApp.database.StarredPDF
//import com.pdfReaderApp.utils.Coroutines
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class SearchViewModel @Inject constructor(private val pdfRepository: RepositoryRoomPDF) : ViewModel() {
//
//    // Search History Record
//    fun insertSearchHistory(searchHistoryRecord: SearchHistoryRecord) {
//        viewModelScope.launch {
//            pdfRepository.insertSearchHistory(searchHistoryRecord)
//        }
//    }
//
//    fun getSearchHistoryRecord() = pdfRepository.getSearchHistoryRecord()
//
//    fun deleteSearchHistoryRecord(id: Int){
//        viewModelScope.launch {
//            pdfRepository.deleteSearchHistoryRecord(id)
//        }
//    }
//
//    fun clearTable() {
//        viewModelScope.launch {
//            pdfRepository.clearTable()
//        }
//    }
//
//    suspend fun doesItemExist(data: String): Boolean{
//        return pdfRepository.doesItemExist(data)
//    }
//
//    fun updateRecent(recentPDF: RecentPDF) = pdfRepository.updateRecent(recentPDF)
//
//    fun removeStarred(starredPDF: StarredPDF) = pdfRepository.deleteStarred(starredPDF)
//
//    fun updateStarred(starredPDF: StarredPDF) = pdfRepository.updateStarred(starredPDF)
//
//    fun insertStarred(starredPDF: StarredPDF, returnID: (Long) -> Unit) {
//        pdfRepository.insertStarred(starredPDF) {
//            returnID(it)
//        }
//    }
//
//    fun checkRecent(pdfPath: String, returnRecent: (list: List<RecentPDF>) -> Unit) {
//        pdfRepository.existedRecent(pdfPath) {
//            returnRecent(it)
//        }
//    }
//
//    fun checkStarred(pdfPath: String, returnRecent: (list: List<StarredPDF>) -> Unit) {
//        pdfRepository.existedStarred(pdfPath) {
//            returnRecent(it)
//        }
//    }
//}