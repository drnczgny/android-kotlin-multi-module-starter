package com.adrian.project.ui.jsonplaceholder.model

import com.adrian.project.ui.main.service.ApiService


/**
 * Created by cadri on 2017. 08. 05..
 */

class PostsPageModel constructor(val apiService: ApiService) {

    fun callApiService() = apiService.fakeApiCall()

}