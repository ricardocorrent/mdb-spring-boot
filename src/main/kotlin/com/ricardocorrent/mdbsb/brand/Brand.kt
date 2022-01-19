package com.ricardocorrent.mdbsb.brand

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Brand(
    @Id
    val id: UUID,
    val name: String,
    val details: String?,
)
