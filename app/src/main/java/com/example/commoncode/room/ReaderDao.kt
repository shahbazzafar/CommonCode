package com.example.commoncode.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ReaderDao {

    // Recent PDF
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecent(recentPDF: RecentPDF)

    @Query("SELECT * FROM RecentPDF ORDER BY id DESC")
    fun getRecentPDF(): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM RecentPDF WHERE pdfPath=:path")
    fun getExistedRecentPDF(path: String): List<RecentPDF>

    @Query("SELECT * FROM RecentPDF WHERE pdfName=:name")
    fun existedRecentByName(name: String): List<RecentPDF>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateRecent(recentPDF: RecentPDF)

    @Delete
    fun deleteRecent(recentPDF: RecentPDF)

    @Query("DELETE FROM RecentPDF WHERE pdfPath =:path")
    fun deleteRecentByPath(path: String)

    // Starred PDF
    @Insert
    fun insertStarred(starredPDF: StarredPDF) : Long

    @Update
    fun updateStarred(starredPDF: StarredPDF)

    @Delete
    fun deleteStarred(starredPDF: StarredPDF)

    @Query("DELETE FROM StarredPDF WHERE pdfPath=:path")
    fun deleteByPath(path: String)

    @Query("SELECT * FROM StarredPDF")
    fun allStarred() :List<StarredPDF>

    @Query("DELETE FROM StarredPDF")
    fun deleteAllStarred()

    @Query("DELETE FROM StarredPDF WHERE pdfPath =:path")
    fun deleteStarredByPath(path: String)

    @Query("SELECT * FROM StarredPDF WHERE pdfPath =:path")
    fun checkExistedStarredPDF(path: String): List<StarredPDF>

    @Query("SELECT id FROM StarredPDF WHERE pdfPath = :path")
    fun checkExistedStarred(path: String): Int

    @Query("SELECT * FROM RecentPDF WHERE extension=:extension ORDER BY id DESC")
    fun recentPDF(extension: String): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM RecentPDF WHERE extension=:extension1 OR extension=:extension2 ORDER BY id DESC")
    fun recentWord(extension1: String,extension2: String): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM RecentPDF WHERE extension=:extension1 OR extension=:extension2 ORDER BY id DESC")
    fun recentExcel(extension1: String,extension2: String): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM RecentPDF WHERE extension=:extension1 OR extension=:extension2 ORDER BY id DESC")
    fun recentPpt(extension1: String,extension2: String): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM RecentPDF WHERE extension=:extension1 OR extension=:extension2 ORDER BY id DESC")
    fun recentTxt(extension1: String,extension2: String): LiveData<List<RecentPDF>>

    @Query("SELECT * FROM StarredPDF ORDER BY id DESC")
    fun getAllStarred() : LiveData<List<StarredPDF>>

    @Query("SELECT * FROM StarredPDF WHERE extension=:extension")
    fun bookmarkPDF(extension: String): LiveData<List<StarredPDF>>

    @Query("SELECT * FROM StarredPDF WHERE extension=:extension1 OR extension=:extension2")
    fun bookmarkWord(extension1: String,extension2: String): LiveData<List<StarredPDF>>

    @Query("SELECT * FROM StarredPDF WHERE extension=:extension1 OR extension=:extension2")
    fun bookmarkExcel(extension1: String,extension2: String): LiveData<List<StarredPDF>>

    @Query("SELECT * FROM StarredPDF WHERE extension=:extension1 OR extension=:extension2")
    fun bookmarkPpt(extension1: String,extension2: String): LiveData<List<StarredPDF>>

    @Query("SELECT * FROM StarredPDF WHERE extension=:extension1 OR extension=:extension2")
    fun bookmarkTxt(extension1: String,extension2: String): LiveData<List<StarredPDF>>

    // Search History Record PDF
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSearchHistory(searchHistoryPDF: SearchHistoryRecord)

    @Query("SELECT * FROM SearchHistoryRecord ORDER BY id DESC LIMIT 10")
    fun getSearchHistoryRecord(): LiveData<List<SearchHistoryRecord>>

    @Query("DELETE FROM SearchHistoryRecord WHERE id =:id")
    suspend fun deleteSearchHistoryRecord(id: Int)

    @Query("DELETE FROM SearchHistoryRecord")
    suspend fun clearTable()

    @Query("SELECT EXISTS(SELECT 1 FROM SearchHistoryRecord WHERE historyName = :data)")
    suspend fun doesItemExist(data: String): Boolean

}