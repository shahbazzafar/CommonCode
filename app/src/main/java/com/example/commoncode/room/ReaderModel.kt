package com.example.commoncode.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class RecentPDF(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val pdfName: String,
    val pdfPath: String,
    val sizeTime: String,
    val isStarred: Boolean,
    val extension:String
)

@Entity
data class StarredPDF(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val pdfPath: String,
    val sizeTime: String,
    val isStarred: Boolean,
    val extension:String
)

data class LanguagesModel(
    val name: String,
    val code: String,
    val myLocale: Locale
)

@Entity
data class SearchHistoryRecord(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var historyName: String
){
    // Secondary constructor that doesn't include the 'id' parameter
    constructor(historyName: String) : this(0, historyName)
}