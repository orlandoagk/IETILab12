package edu.eci.ieti.myapplication.services;


import retrofit2.Call;
import edu.eci.ieti.myapplication.models.LoginWrapper;
import edu.eci.ieti.myapplication.models.Token;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {
    @POST("auth")
    Call<Token> login(@Body LoginWrapper loginWrapper);
}
