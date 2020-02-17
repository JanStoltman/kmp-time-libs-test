package sample.format

import sample.format.klock.KlockFormattingProvider

val formattingProviders = listOf<FormattingProvider>(
    KlockFormattingProvider()
)

interface FormattingProvider {
    fun formatStringToRawDateModel(rawDateTimeString: String, format: RawDateFormat): RawDateModel
}