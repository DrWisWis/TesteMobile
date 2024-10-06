package com.example.myapplication

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class User(
    val email: String,
    val senha: String
)

data class RegisterRequest(
    val name: String,
    val email: String,
    val senha: String
)
data class RegisterResponse(
    val message: String
)

data class LoginRequest(
    val email: String,
    val senha: String
)
data class LoginResponse(
    val access_token: String
)

interface ApiService {
    @POST("/users")
    fun registerUser(@Body request: RegisterRequest): Call<RegisterResponse>

    @POST("/login")
    fun loginUser(@Body request: LoginRequest): Call<LoginResponse>
}