package com.ricardocorrent.mdbsb.lure

import com.ricardocorrent.mdbsb.generics.GenericEntity
import com.ricardocorrent.mdbsb.model.Model
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document
data class Lure(
    val name: String?,

    val size: BigDecimal?,

    val weight: BigDecimal?,

    val color: String?,

    @DBRef(lazy = true)
    val model: Model,

    ) : GenericEntity()
