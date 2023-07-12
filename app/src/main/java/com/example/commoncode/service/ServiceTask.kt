package com.example.commoncode.service

class ServiceTask {

/**
 * Manifest
 * */

// Add this in manifest
//    <service
//    android:name="com.antivirus.scanner.virus.detector.services.ProtectionService"
//    android:enabled="true"
//    android:stopWithTask="false"
//    android:process=":ServiceProcess"
//    android:isolatedProcess="true"
//    />

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

//    By default, a service in Android runs in the same process as the application's main thread. This means that if you do not specify the android:process attribute for a service in the manifest file, the service will run in the same process as the rest of your application's components, such as activities and broadcast receivers.

//    When a service runs in the same process as the application, it shares the same memory space and resources. This allows the service to directly access the application's variables, objects, and other components.

//    For example, if your application's package name is com.example.myapp, the service will run in the process with the same name: com.example.myapp. This is the default behavior if you haven't explicitly specified a different process name for the service.

}