package edu.eci.ieti.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.ieti.myapplication.R;

import edu.eci.ieti.myapplication.models.Token;

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
        Intent intent;
        if(sharedPref.contains(TOKEN_KEY)){
            intent = new Intent(this,null);
        }else{
            intent = new Intent(this,LoginActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
