package com.ricardocorrent.mdbsb.lure

import com.ricardocorrent.mdbsb.model.Model
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.util.*

@Document
data class Lure(

    @Id
    val id: UUID,

    val name: String?,

    val size: BigDecimal?,

    val weight: BigDecimal?,

    val color: String?,

    @DBRef(lazy = true)
    val model: Model,

    )
