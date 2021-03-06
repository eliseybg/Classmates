package domain.use_cases.authorization

import domain.exceptions_broadscast.ConnectionExceptionsBroadcast
import domain.source.auth.AuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SignInUseCase(
    private val authRepository: AuthRepository,
    private val exceptionsBroadcast: ConnectionExceptionsBroadcast,
) {
    suspend operator fun invoke(email: String, password: String): UseCaseAuthResult = withContext(Dispatchers.IO) {
        try {
            val authResponse = authRepository.signIn(email, password)
            return@withContext UseCaseAuthResult.Authorized(authResponse.accessToken, authResponse.isConfirmed)
        } catch (e: Exception) {
            exceptionsBroadcast.sendException(e)
        }
        return@withContext UseCaseAuthResult.UnAuthorized
    }
}