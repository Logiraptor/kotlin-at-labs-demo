sealed class Result {
    class Success(val message: String) : Result()

    class Error(val error: String) : Result()
}

fun process(r: Result?) = when (r) {
    is Result.Success -> r.message
    is Result.Error -> r.error
    null -> ""
}
