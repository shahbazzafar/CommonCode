package com.example.commoncode.service

class ServiceTask {

/**
 * Manifest
 * */

// Add this in manifest
//    <service
//    android:name="com.antivirus.scanner.virus.detector.services.ProtectionService"
//    android:enabled="true"
//    android:stopWithTask="false" />

/**
 * Service Class
 * */

//    Inside the onCreate() method, add the following line of code:
//    stopSelf(false);

//    With stopSelf(false), the service will continue running even if the task associated with it is removed from the recent tasks list. Keep in mind that if the service is explicitly stopped using stopService(), it will still be stopped regardless of the stopWithTask property value.

/**
 * Notes
 * */

//    IMPORTANT: set Autostart permission, otherwise the service will not start on boot.

//    If you want to continue your service even after killing application from Recent app's list, set stopWithTask as false in manifest:

//    And your Service should be sticky.

//    And if you want to perform some additional action when application gets removed from recent list, you can override method onTaskRemoved

//    Now in your MyService service, override method onTaskRemoved. (This will be fired only if stopWithTask is set to false).

//    In Android Studio, the stopWithTask property is used to control whether or not a service should be stopped when the task associated with it is removed from the recent tasks list. By default, the stopWithTask property is set to true, which means that the service will be stopped when the task is removed.

//    If you want to prevent the service from being stopped when the task is removed, you can set the stopWithTask property to false.

//    Within the onTaskRemoved() method, you can perform any necessary cleanup or actions before the service is stopped. It's important to note that the system will automatically stop the service after this method returns, unless you have set stopWithTask to false.
}