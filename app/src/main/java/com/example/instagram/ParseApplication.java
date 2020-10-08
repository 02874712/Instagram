package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LmZu4yIUuXskPr7nBWTZjl4wJBUICWPABqW1gPK2")
                .clientKey("Ms0qcPxVjZ4Bn4rGEdunaj2uK1qZxfuH9NACdlek")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
