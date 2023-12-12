package com.example.commoncode.projects

//https://developers.google.com/nearby/connections/android/exchange-data
//https://developers.google.com/android/reference/com/google/android/gms/nearby/connection/package-summary
//(1) Exchange data with PayLoad
//ConnectionsClient	Entry point for advertising and discovering nearby apps and services, and communicating with them over established connections.
//Connections	This interface is deprecated. Use ConnectionsClient.
//Connections.ConnectionResponseCallback	This interface is deprecated. Use ConnectionLifecycleCallback instead.
//Connections.MessageListener	This interface is deprecated. Use PayloadCallback instead.
//Connections.StartAdvertisingResult	Result delivered when a local endpoint starts being advertised.

//To share files between Android devices using Bluetooth with Connection Android API and Payload API, you can use the Nearby Connections API, which provides a higher-level interface for establishing connections and transferring payloads between devices. This API simplifies the process of discovering nearby devices, establishing connections, and exchanging data.

//Here's a basic example of how you can implement file sharing using the Nearby Connections API:

//implementation 'com.google.android.gms:play-services-nearby:18.0.0'

//<!-- Required for Nearby Connections -->
//<uses-permission android:maxSdkVersion="31" android:name="android.permission.ACCESS_WIFI_STATE" />
//<uses-permission android:maxSdkVersion="31" android:name="android.permission.CHANGE_WIFI_STATE" />
//<uses-permission android:maxSdkVersion="30" android:name="android.permission.BLUETOOTH" />
//<uses-permission android:maxSdkVersion="30" android:name="android.permission.BLUETOOTH_ADMIN" />
//<uses-permission android:maxSdkVersion="28" android:name="android.permission.ACCESS_COARSE_LOCATION" />
//<uses-permission android:minSdkVersion="29" android:maxSdkVersion="31" android:name="android.permission.ACCESS_FINE_LOCATION" />
//<uses-permission android:minSdkVersion="31" android:name="android.permission.BLUETOOTH_ADVERTISE" />
//<uses-permission android:minSdkVersion="31" android:name="android.permission.BLUETOOTH_CONNECT" />
//<uses-permission android:minSdkVersion="31" android:name="android.permission.BLUETOOTH_SCAN" />
//<uses-permission android:minSdkVersion="32" android:name="android.permission.NEARBY_WIFI_DEVICES" />
//<!-- Optional: only required for FILE payloads -->
//<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>

//Since ACCESS_FINE_LOCATION, BLUETOOTH_ADVERTISE, BLUETOOTH_CONNECT, BLUETOOTH_SCAN and READ_EXTERNAL_STORAGE are considered to be dangerous system permissions, in addition to adding them to your manifest, you must request these permissions at runtime, as described in Requesting Permissions.

//If the user does not grant all required permissions, the Nearby Connections API will refuse to allow your app to start advertising or discovering.