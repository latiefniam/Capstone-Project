package com.dicoding.latiefniam.dilaut.detail


//class DetailViewModel: ViewModel() {
//    val fish = MutableLiveData<FishBaseDetail>()
//
//    fun setFishDetail(name: String){
//        isLoading.postValue(true)
//        Retrofit.apiInstance
//            .getDataFishDetail(name)
//            .enqueue(object : retrofit2.Callback<FishBaseDetail>{
//                override fun onResponse(
//                    call: Call<FishBaseDetail>,
//                    response: Response<FishBaseDetail>
//                ) {
//                   isLoading.postValue(false)
//                    if (response.isSuccessful){
//                        Log.d("<DEBUG>", "Success: " + response.body())
//                        fish.postValue(response.body())
//                    }
//                }
//
//                override fun onFailure(call: Call<FishBaseDetail>, t: Throwable) {
//                  Log.d("Failure", t.message.toString())
//                    isLoading.postValue(true)
//                }
//
//            })
//    }
//    val isLoading = MutableLiveData<Boolean>()
//    //fun getLoadingStatus(): LiveData<Boolean> = isLoading
//    fun getFishBaseDetail (): LiveData<FishBaseDetail> {
//        return fish
//    }
//}