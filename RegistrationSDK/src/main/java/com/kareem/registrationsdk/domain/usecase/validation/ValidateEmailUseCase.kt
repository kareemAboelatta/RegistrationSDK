package com.kareem.registrationsdk.domain.usecase.validation

import com.kareem.registrationsdk.domain.usecase.validation.core.BaseValidationUseCase
import com.kareem.registrationsdk.domain.usecase.validation.core.ValidationErrorType
import com.kareem.registrationsdk.domain.usecase.validation.core.ValidationResult
import javax.inject.Inject

class ValidateEmailUseCase @Inject constructor() : BaseValidationUseCase<String>() {

    override fun validate(input: String): ValidationResult {
        // TODO: Implement email validation logic
        // Placeholder
        return ValidationResult(
            isSuccessful = false,
            errorType = ValidationErrorType.FieldEmpty
        )
    }
}