package com.dynamicheart.raven.data

import com.dynamicheart.raven.data.local.DatabaseHelper
import com.dynamicheart.raven.data.remote.RavenService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jianbangyang on 2017/9/4.
 */
@Singleton
class DataManager
@Inject constructor(private val ravenService: RavenService,
                    private val databaseHelper: DatabaseHelper){

}