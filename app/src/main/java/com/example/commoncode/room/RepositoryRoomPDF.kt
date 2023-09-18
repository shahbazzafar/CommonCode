package com.example.commoncode.room

//import com.pdfReaderApp.database.ReaderDao
//import com.pdfReaderApp.database.RecentPDF
//import com.pdfReaderApp.database.SearchHistoryRecord
//import com.pdfReaderApp.database.StarredPDF
//import com.pdfReaderApp.utils.Coroutines
//import javax.inject.Inject
//
//class RepositoryRoomPDF @Inject constructor(private val dao: ReaderDao) {
//
//    // Search History Record
//    suspend fun insertSearchHistory(searchHistoryRecord: SearchHistoryRecord){
//        dao.insertSearchHistory(searchHistoryRecord)
//    }
//
//    fun getSearchHistoryRecord() = dao.getSearchHistoryRecord()
//
//    suspend fun deleteSearchHistoryRecord(id: Int){
//        dao.deleteSearchHistoryRecord(id)
//    }
//
//    suspend fun clearTable(){
//        dao.clearTable()
//    }
//
//    suspend fun doesItemExist(data: String): Boolean{
//        return dao.doesItemExist(data)
//    }
//
//    // Recent PDF
//    fun insertRecent(recentPDF: RecentPDF){
//        Coroutines.io {
//            dao.insertRecent(recentPDF)
//        }
//    }
//
//    fun updateRecent(recentPDF: RecentPDF){
//        Coroutines.io {
//            dao.updateRecent(recentPDF)
//        }
//    }
//
//    // Starred PDF
//    fun insertStarred(starredPDF: StarredPDF, returnID:(Long)->Unit){
//        Coroutines.io {
//            val newID = dao.insertStarred(starredPDF)
//            Coroutines.main { returnID(newID) }
//        }
//    }
//
//    fun checkExistedStarred(path:String,id:(Int)->Unit){
//        id(dao.checkExistedStarred(path))
//    }
//
//    fun existedStarred(path:String,list:(List<StarredPDF>)->Unit){
//        Coroutines.io {
//            val starred = dao.checkExistedStarredPDF(path)
//            Coroutines.main {
//                list(starred)
//            }
//        }
//    }
//
//    fun existedRecent(path:String,list:(List<RecentPDF>)->Unit){
//        Coroutines.io {
//            val starred = dao.getExistedRecentPDF(path)
//            Coroutines.main {
//                list(starred)
//            }
//        }
//    }
//
//    fun existedRecentByName(name:String,list:(List<RecentPDF>)->Unit){
//        Coroutines.io {
//            val starred = dao.existedRecentByName(name)
//            Coroutines.main {
//                list(starred)
//            }
//        }
//    }
//
//    fun updateStarred(starredPDF: StarredPDF){
//        Coroutines.io {
//            dao.updateStarred(starredPDF)
//        }
//    }
//
//    fun deleteStarred(starredPDF: StarredPDF){
//        Coroutines.io {
//            dao.deleteStarred(starredPDF)
//        }
//    }
//
//    fun deleteAllStarred(){
//        Coroutines.io {
//            dao.deleteAllStarred()
//        }
//    }
//
//    fun deleteRecent(recentPDF: RecentPDF){
//        Coroutines.io {
//            dao.deleteRecent(recentPDF)
//        }
//    }
//
//    fun deleteRecentByPath(path: String){
//        Coroutines.io {
//            dao.deleteRecentByPath(path)
//        }
//    }
//
//    fun deleteStarredByPath(path: String){
//        Coroutines.io {
//            dao.deleteStarredByPath(path)
//        }
//    }
//
//    fun getAllStarred() = dao.getAllStarred()
//
//    fun allStarred() = dao.allStarred()
//
//    fun getRecent() = dao.getRecentPDF()
//    fun recentPDF(extension: String) = dao.recentPDF(extension)
//    fun recentWord(extension1: String,extension2: String) = dao.recentWord(extension1,extension2)
//    fun recentExcel(extension1: String,extension2: String) = dao.recentExcel(extension1,extension2)
//    fun recentPpt(extension1: String,extension2: String) = dao.recentPpt(extension1,extension2)
//    fun recentTxt(extension1: String,extension2: String) = dao.recentTxt(extension1,extension2)
//
//    fun bookmarkPDF(extension: String) = dao.bookmarkPDF(extension)
//    fun bookmarkWord(extension1: String,extension2: String) = dao.bookmarkWord(extension1,extension2)
//    fun bookmarkExcel(extension1: String,extension2: String) = dao.bookmarkExcel(extension1,extension2)
//    fun bookmarkPpt(extension1: String,extension2: String) = dao.bookmarkPpt(extension1,extension2)
//    fun bookmarkTxt(extension1: String,extension2: String) = dao.bookmarkTxt(extension1,extension2)
//}