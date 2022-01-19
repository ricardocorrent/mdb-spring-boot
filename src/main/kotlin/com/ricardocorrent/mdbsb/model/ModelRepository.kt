package com.ricardocorrent.mdbsb.model

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ModelRepository : MongoRepository<Model, UUID>
