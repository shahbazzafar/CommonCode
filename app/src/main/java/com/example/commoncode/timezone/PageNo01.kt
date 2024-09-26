package com.example.commoncode.timezone

//    // List of time zones commonly used in Russia
//    val russiaTimeZones = listOf(
//        "Europe/Moscow",
//        "Europe/Simferopol",
//        "Europe/Kirov",
//        "Europe/Volgograd",
//        "Europe/Saratov",
//        "Europe/Ulyanovsk",
//        "Europe/Astrakhan",
//        "Europe/Samara",
//        "Europe/Ufa",
//        "Europe/Barnaul",
//        "Asia/Yekaterinburg",
//        "Asia/Omsk",
//        "Asia/Novosibirsk",
//        "Asia/Novokuznetsk",
//        "Asia/Krasnoyarsk",
//        "Asia/Irkutsk",
//        "Asia/Yakutsk",
//        "Asia/Khandyga",
//        "Asia/Vladivostok",
//        "Asia/Sakhalin",
//        "Asia/Magadan",
//        "Asia/Srednekolymsk",
//        "Asia/Kamchatka",
//        "Asia/Anadyr"
//    )
//
//    val deviceTimeZone = TimeZone.getDefault().id
//    val isDeviceInRussia = containsRussiaTimeZone(russiaTimeZones,deviceTimeZone)
//
//    if (isDeviceInRussia) {
//        Toast.makeText(this@SplashActivity, "$deviceTimeZone : Russia", Toast.LENGTH_SHORT).show()
//        Log.d("isDeviceInRussia", "onCreate: Russia")
//        // Device is in Russia
//        // Your code here
//    } else {
//        Log.d("isDeviceInRussia", "onCreate: $deviceTimeZone")
//        Toast.makeText(this@SplashActivity, "$deviceTimeZone : Not Russia", Toast.LENGTH_SHORT).show()
//        // Device is not in Russia
//        // Your code here
//    }

private fun containsRussiaTimeZone(timeZoneIdList: Array<String>, timeZone: String): Boolean {
    return timeZoneIdList.any { it == timeZone }
}