package com.ricardocorrent.mdbsb.lures

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LuresRepository : MongoRepository<Lures, UUID>
