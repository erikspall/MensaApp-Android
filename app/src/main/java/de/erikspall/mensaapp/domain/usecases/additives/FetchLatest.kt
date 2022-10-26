package de.erikspall.mensaapp.domain.usecases.additives

import de.erikspall.mensaapp.data.errorhandling.OptionalResult
import de.erikspall.mensaapp.data.repositories.AppRepositoryImpl
import de.erikspall.mensaapp.data.repositories.interfaces.AppRepository
import de.erikspall.mensaapp.domain.model.Additive

class FetchLatest(
    private val appRepository: AppRepository
) {
    suspend operator fun invoke(): OptionalResult<List<Additive>> {
        return appRepository.fetchAllAdditives()
    }
}