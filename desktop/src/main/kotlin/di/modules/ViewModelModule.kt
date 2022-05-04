package di.modules

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import presentation.screens.login_screen.LoginScreenViewModel
import presentation.screens.chats_screen.ChatsScreenViewModel
import presentation.screens.host_screen.HostScreenViewModel
import presentation.screens.main_screen.MainScreenViewModel
import presentation.screens.people_screen.PeopleScreenViewModel
import presentation.screens.profile_dialog.ProfileScreenViewModel
import presentation.screens.splash_screen.SplashScreenViewModel

val viewModelModule = DI.Module(name = "viewModelModule", allowSilentOverride = false) {
    bind { singleton { HostScreenViewModel(instance(), instance(), instance(), instance()) } }
    bind { singleton { SplashScreenViewModel(instance(), instance(), instance(), instance(), instance()) } }
    bind { singleton { LoginScreenViewModel(instance(), instance(), instance(), instance(), instance()) } }
    bind { singleton { ProfileScreenViewModel(instance()) } }
    bind { singleton { ChatsScreenViewModel(instance(), instance(), instance(), instance()) } }
    bind { singleton { PeopleScreenViewModel() } }
    bind { singleton { MainScreenViewModel() } }
}