package edu.eci.ieti.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LaunchActivity
        extends AppCompatActivity
{

    public static final String TOKEN_KEY = "e3u3j3n3n3udj3n3j8cjzx";

    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        SharedPreferences sharedPref =
                getSharedPreferences( getString( R.string.preference_file_key ), Context.MODE_PRIVATE );

        if(sharedPref.contains(TOKEN_KEY)){
            //TODO go to MainActivity
        }else{
            //TODO go to LoginActivity
        }
    }
}
