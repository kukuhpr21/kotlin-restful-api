package id.kukuh.restful.service

import id.kukuh.restful.model.CreateProductRequest
import id.kukuh.restful.model.ListProductRequest
import id.kukuh.restful.model.ProductResponse
import id.kukuh.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}