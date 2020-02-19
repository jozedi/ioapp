package com.jozedix.android.samples.core.platform

abstract class Mapper<in T, out R> {

    abstract fun map(value: T): R

    fun map(values: List<T>): List<R> {
        return values.map(::map)
    }
}
