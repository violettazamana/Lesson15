package com.mobile.myapplication.model

enum class ErrorFromServer {

    ForebiddenError,
    NotFoundError,
    AutorizationError
}

class Error(
    val typeToken: String?,
    val urlError: String?,
    val typeError: ErrorFromServer
)


fun handleErrorNew(error: Error) {
    when (error.typeError) {
        ErrorFromServer.ForebiddenError -> {
            error.typeToken?.let {

            }
        }
        ErrorFromServer.NotFoundError -> {
            error.urlError?.let {

            }
        }
        ErrorFromServer.AutorizationError -> {

        }
    }
}