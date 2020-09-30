package com.rarecrew.recyclerviewadaptertemplate.Model

data class Model(
    val id: Int,
    val name: String,
    val phone: String,
    val description: String
) {
    override fun equals(other: Any?): Boolean {

        if(javaClass != other?.javaClass) {
            return false
        }

        other as Model

        if(id != other.id) { return false }
        if(name != other.name) { return false }
        if(phone != other.phone) { return false }
        if(description != other.description) { return false }

        return true
    }
}