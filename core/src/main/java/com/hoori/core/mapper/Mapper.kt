package com.hoori.core.mapper

interface Mapper<T, E> {

    fun map(data: T): E
}
