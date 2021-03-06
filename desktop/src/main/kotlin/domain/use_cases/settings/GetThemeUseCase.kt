package domain.use_cases.settings

import domain.source.settings.SettingsRepository

class GetThemeUseCase (
    private val settingsRepository: SettingsRepository
) {
    operator fun invoke() = settingsRepository.getTheme()
}