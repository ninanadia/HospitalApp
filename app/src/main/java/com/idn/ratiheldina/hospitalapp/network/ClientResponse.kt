package com.idn.ratiheldina.hospitalapp.network

import com.google.gson.annotations.SerializedName

data class ClientResponse(
    @field:SerializedName("nama")
    val namaRS: String? = null,

    @field:SerializedName("kode_rs")
    val kodeRS: Int? = null,

    @field:SerializedName("tempat_tidur")
    val tempat: Int? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,


)
