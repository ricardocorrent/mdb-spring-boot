package com.ricardocorrent.mdbsb.fish

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Fish(

    @Id
    val id: UUID,

    val ordinaryName: String,

    val scientificName: String?,

)
