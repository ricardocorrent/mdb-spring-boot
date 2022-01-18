package com.ricardocorrent.mdbsb.lures

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Lures(
    @Id
    val id: UUID,
    val name: String,
)