package com.mobile.myapplication.model

sealed class ServerErrors

class ForebiddenError(val typeToken: String) : ServerErrors()
class NotFoundError(val urlError: String) : ServerErrors()
class AutorizationError : ServerErrors()

fun efsdf() {
    handleError(ForebiddenError("qwew"))
}

fun handleError(error: ServerErrors) {
//    if (error is NotFoundError) {
//        error.urlError
//    }
//
    val url = (error as? ForebiddenError)?.urlError



    if (error !is AutorizationError) {

    }

//    when (error) {
//        is ForebiddenError -> {
//            error.typeToken
//        }
//        is NotFoundError -> {
//            error.urlError
//        }
//        is AutorizationError -> {
//
//        }
//    }
}