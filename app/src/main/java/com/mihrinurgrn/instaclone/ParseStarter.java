package com.mihrinurgrn.instaclone;

import android.app.Application;

import com.parse.Parse;

public class ParseStarter extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("************")
        .clientKey("**************")
        .server("***************")
        .build());
    }
}
