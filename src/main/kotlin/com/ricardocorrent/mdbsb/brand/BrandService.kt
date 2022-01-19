package com.ricardocorrent.mdbsb.brand

import com.ricardocorrent.mdbsb.generics.GenericService
import org.springframework.stereotype.Service

@Service
class BrandService(repository: BrandRepository) : GenericService<Brand>(repository)