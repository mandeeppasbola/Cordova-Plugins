Location Service Status
===============

Plugins for Cordova 2.9

This plugin checks the status of the location service of the device.

In Cordova V2.9 there was a bug related to current location mentioned here : http://stackoverflow.com/questions/22778667/getcurrentlocation-is-working-on-cordova-phonegap-app-even-when-the-location-ser
As Cordova use the default browser's Geolocation implementation, it was a WebView bug. As a workaround this plugin use Android API to check the status of the Location Services.

Android Installation :

Step 1 : Copy the 'com' folder to 'src' folder of the project.
Step 2 : Check these permissions in AndroidManifest.xml
Step 3 : Add this line to config.xml
Step 4 : Implementation
cordova.exec(function() {/* Success handler (LocationServices are on) */}, function(e) {/* Error handler  (LocationServices are off) */}, "getLocationStatus", "execute",[]);