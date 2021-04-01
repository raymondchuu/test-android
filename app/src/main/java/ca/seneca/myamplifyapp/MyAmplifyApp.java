package ca.seneca.myamplifyapp;
import android.util.Log;

import com.amplifyframework.*;
import com.amplifyframework.core.Amplify;

public class MyAmplifyApp extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        try {
            Amplify.configure(getApplicationContext());
            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
    }
}
