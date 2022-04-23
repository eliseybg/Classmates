package di.modules

import domain.use_cases.authorization.*
import domain.use_cases.chat.*
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val useCaseModule = DI.Module(name = "useCase", allowSilentOverride = false) {
    bind { singleton { CheckAuthorizationUseCase(instance()) } }
    bind { singleton { SignInUseCase(instance()) } }
    bind { singleton { SignUpUseCase(instance()) } }
    bind { singleton { SignOutUseCase(instance()) } }
    bind { singleton { DeleteAccountUseCase(instance()) } }
    bind { singleton { CopyMessageTextUseCase() } }
    bind { singleton { DeleteMessageUseCase() } }
    bind { singleton { FindChatsUseCase() } }
    bind { singleton { FindMessagesUseCase() } }
    bind { singleton { GetChatMessagesUseCase() } }
    bind { singleton { SendMessageUseCase() } }
}