Location Service Status
===============

Plugins for Cordova 2.9

This plugin check the status of location services on device.

In Cordova V2.9 there was a bug related to current location mentioned here : http://stackoverflow.com/questions/22778667/getcurrentlocation-is-working-on-cordova-phonegap-app-even-when-the-location-ser

As Cordova use the default browser's Geolocation implementation, it was a WebView bug mentioned here : https://issues.apache.org/jira/browse/CB-6548

As a workaround this plugin use Android API to check the status of the Location Services.

<strong>Android Installation :</strong>

Step 1 : Copy the 'com' folder to 'src' folder of the project.

Step 2 : Check these permissions in AndroidManifest.xml
<pre>
&lt;uses-permission android:name=&quot;android.permission.ACCESS_COARSE_LOCATION&quot; /&gt;<br />
&lt;uses-permission android:name=&quot;android.permission.ACCESS_FINE_LOCATION&quot; /&gt;<br />
&lt;uses-permission android:name=&quot;android.permission.ACCESS_LOCATION_EXTRA_COMMANDS&quot; /&gt;
</pre>
Step 3 : Add this line to config.xml
<pre>
&lt;plugin name=&quot;getLocationStatus&quot; value=&quot;com.custom.plugins.getLocationStatus.getLocationStatus&quot; /&gt;
</pre>
Step 4 : Implementation
<pre>
cordova.exec(function() {/* Success handler (LocationServices are on) */}, function(e) {/* Error handler  (LocationServices are off) */}, "getLocationStatus", "execute",[]);
</pre>
