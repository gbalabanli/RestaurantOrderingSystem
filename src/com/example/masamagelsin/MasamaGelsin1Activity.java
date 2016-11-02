package com.example.masamagelsin;


import android.os.Bundle;
import org.apache.cordova.*; 
 
public class MasamaGelsin1Activity extends DroidGap {  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {       
        super.onCreate(savedInstanceState);
        super.clearCache();   
       
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl(Config.getStartUrl(),40000);                                                                               
         
    }
}