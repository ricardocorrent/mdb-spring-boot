package com.ricardocorrent.mdbsb.fish

import com.ricardocorrent.mdbsb.generics.GenericEntity
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Fish(
    val ordinaryName: String,
    val scientificName: String?,
) : GenericEntity()
