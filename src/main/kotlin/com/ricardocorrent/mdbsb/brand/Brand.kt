package com.ricardocorrent.mdbsb.brand

import com.ricardocorrent.mdbsb.generics.GenericEntity
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Brand(
    @Indexed(unique = true)
    val name: String,
    val details: String?,
) : GenericEntity()
