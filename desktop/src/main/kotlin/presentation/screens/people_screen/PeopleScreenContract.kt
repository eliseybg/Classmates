package presentation.screens.people_screen

import domain.entities.data.UserInfo
import presentation.base.UiEffect
import presentation.base.UiEvent
import presentation.base.UiState

class PeopleScreenContract {
    sealed class Event : UiEvent {
        data class OnShowSendMessageClick(val user: UserInfo) : Event()
        data class OnSendMessageClick(val user: UserInfo, val message: String) : Event()
        data class OnAddFriendClick(val user: UserInfo) : Event()
        data class OnRemoveFriendClick(val user: UserInfo) : Event()
        data class OnAcceptSubscriberClick(val user: UserInfo) : Event()
        data class OnCancelSubscriberClick(val user: UserInfo) : Event()
        data class OnCancelSubscriptionClick(val user: UserInfo) : Event()
        data class OnSearchUserTextAppear(val text: String) : Event()
    }

    data class State(val state: PeopleScreenState) : UiState

    sealed class PeopleScreenState {
        object Idle : PeopleScreenState()
        object Loading : PeopleScreenState()
    }

    sealed class Effect : UiEffect {
        data class ShowSendMessageDialog(val user: UserInfo) : Effect()
    }
}