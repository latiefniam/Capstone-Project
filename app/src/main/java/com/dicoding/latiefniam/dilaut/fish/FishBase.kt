package com.dicoding.latiefniam.dilaut.fish


import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
data class FishBase(
    var name: String? = null,
    var desciption: String? = null,
    var priceNow: String? = null,
    var priceLater:String? = null,
    var avatar_url: String? = "",
): Parcelable{
    constructor(parcel:Parcel):this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    companion object : Parceler<FishBase> {

        override fun FishBase.write(parcel: Parcel, flags: Int) {
            parcel.writeString(name)
            parcel.writeString(desciption)
            parcel.writeString(priceNow)
            parcel.writeString(priceLater)
            parcel.writeString(avatar_url)
        }

        override fun create(source: Parcel): FishBase {
            return FishBase(source)
        }

    }
}