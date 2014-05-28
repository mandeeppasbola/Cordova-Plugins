package com.custom.plugins.getLocationStatus;

import android.content.Context;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.location.LocationManager;

public class getLocationStatus extends CordovaPlugin {
	
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		try {
			
			cordova.getActivity().runOnUiThread(new Runnable() {
		        @Override
		        public void run() {
		            Context context = cordova.getActivity()
		                    .getApplicationContext();
		            
		            // Check that Network Location Provider reports enabled
		            LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		            boolean isNetLocEnabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
		            
					if(isNetLocEnabled){
						callbackContext.success();
					}
					else{
						callbackContext.error("");
					}					
		        }
		    });
			return true;
        }
		catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());			
			return false;
		}     
	}
	
	
  	
}