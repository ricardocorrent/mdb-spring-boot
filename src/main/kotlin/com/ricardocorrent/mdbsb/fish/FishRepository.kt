package com.ricardocorrent.mdbsb.fish

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface FishRepository : MongoRepository<Fish, UUID>
