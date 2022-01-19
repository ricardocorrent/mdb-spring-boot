package com.ricardocorrent.mdbsb.lure

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LureRepository : MongoRepository<Lure, UUID>
