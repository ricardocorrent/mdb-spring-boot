package com.ricardocorrent.mdbsb.model

import com.ricardocorrent.mdbsb.brand.Brand
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Model(

    @Id
    val id: UUID,

    @DBRef
    val brand: Brand,

    val name: String,

    )
