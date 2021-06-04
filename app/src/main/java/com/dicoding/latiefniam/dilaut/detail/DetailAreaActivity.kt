package com.dicoding.latiefniam.dilaut.detail


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide


import com.dicoding.latiefniam.dilaut.R
import com.dicoding.latiefniam.dilaut.databinding.ActivityDetailAreaBinding

import com.dicoding.latiefniam.dilaut.fish.FishBase

class DetailAreaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailAreaBinding
    //private lateinit var viewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val actionbar = supportActionBar
//        actionbar!!.title = getString(R.string.detail_fish)
//        actionbar.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setTitle(R.string.detail_fish)


//        val tvSetName: TextView = findViewById(R.id.tv_detail_name)
//        val imgSetPhoto: ImageView = findViewById(R.id.iv_detail_fish)
//        val tvSetDetail: TextView = findViewById(R.id.tv_detail_description)

        val tName  = intent.getParcelableExtra<FishBase>(EXTRA_NAME) as FishBase
        Log.d("<DEBUG>", "Success: ")

        //val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        //val tIden = intent.getStringExtra(EXTRA_DETAIL)

        val bundle = Bundle()
        bundle.putString(EXTRA_NAME, tName.toString())
        Log.d("<SUCCESS>", "Success juga kok: " + tName.toString())
        binding.apply {
            tvDetailName.text = tName.name
            priceNowRupiah.text =tName.price_now
            priceLaterRupiahFirst.text=tName.price_now
            priceLaterRupiahSecond.text =tName.price_later
            Glide.with(this@DetailAreaActivity)
                .load(tName.avatar_url)
                .into(ivDetailFish)
        }

//        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
//            .get(DetailViewModel::class.java)
//        viewModel.setFishDetail(tName)
//        viewModel.getFishBaseDetail().observe(this,{
//            if (it != null){
//                binding.apply {
//                    tvDetailName.text = it.name
//                    tvDayLaterFirst.text = it.priceNow
//                    tvPriceLater.text = it.priceLater
//                    Glide.with(this@DetailAreaActivity)
//                        .load(it.avatar_url)
//                        .into(ivDetailFish)
//
//                }
//            }
//        })


//        tvSetName.text = tName
//        Glide.with(this)
//                .load(tImg)
//                .apply(RequestOptions())
//                .into(imgSetPhoto)
//        tvSetDetail.text = tIden
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        //const val EXTRA_PHOTO = "extra_photo"
        //const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}