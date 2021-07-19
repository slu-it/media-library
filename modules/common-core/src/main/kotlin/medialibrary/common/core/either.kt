package medialibrary.common.core

import arrow.core.Either

fun <T> failure(value: T) = Either.Left(value)
fun <T> success(value: T) = Either.Right(value)
