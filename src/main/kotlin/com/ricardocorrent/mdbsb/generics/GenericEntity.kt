package com.ricardocorrent.mdbsb.generics

import org.springframework.data.annotation.Id
import java.util.*

abstract class GenericEntity {
    @Id
    open var id: UUID? = null

    init {
        id = id ?: UUID.randomUUID()
    }

}
