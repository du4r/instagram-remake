package com.du4r.instagramclone.common.base

interface Cache<T> {
    fun isCached(): Boolean
    fun get(key: String): T?
    fun put(data: T?)
}