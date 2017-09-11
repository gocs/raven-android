package com.dynamicheart.raven.data.remote

import com.dynamicheart.raven.data.model.house.House
import com.dynamicheart.raven.data.model.leancloud.Installation
import com.dynamicheart.raven.data.model.raven.InRaven
import com.dynamicheart.raven.data.model.raven.Raven
import com.dynamicheart.raven.data.model.token.Token
import com.dynamicheart.raven.data.model.user.User
import com.dynamicheart.raven.data.model.user.form.CreateUserForm
import com.dynamicheart.raven.data.model.user.form.LoginForm
import io.reactivex.Observable
import retrofit2.http.*
import java.util.*

interface RavenService {
    @GET("user")
    fun getUser(): Observable<User>

    @POST("users")
    fun createNewUser(@Body createUserForm: CreateUserForm): Observable<User>

    @POST("user/installation")
    fun uploadInstallation(@Body installationId: String): Observable<Installation>

    @POST("tokens")
    fun login(@Body loginForm: LoginForm): Observable<Token>

    @DELETE("tokens")
    fun logout(): Observable<Void>

    @GET("user/houses")
    fun getYourHouses(): Observable<List<House>>

    @GET("user/inravens")
    fun getYourInRavens(@Query("dateAfter") date:Date): Observable<List<InRaven>>

    @GET("user/ravens")
    fun getYourRavens(): Observable<List<Raven>>
}