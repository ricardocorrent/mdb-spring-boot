package com.ricardocorrent.mdbsb.model

import com.ricardocorrent.mdbsb.brand.Brand
import com.ricardocorrent.mdbsb.generics.GenericEntity
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Model(
    @DBRef
    val brand: Brand,

    val name: String,

    ) : GenericEntity()
