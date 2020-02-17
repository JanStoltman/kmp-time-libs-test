package sample.format

import kotlin.test.Test
import kotlin.test.assertTrue

class FormattingProvidersTest {

    @Test
    fun `format 12_02_03 iso time`() {
        val rawTime = "12:02:03"

        testDateTimeFormatting(rawTime, RawDateFormat.Iso8601.Time, RawDateModel(hour = 12, minute = 2, second = 3))
    }

    private fun testDateTimeFormatting(rawTime: String, format: RawDateFormat, expectedResult: RawDateModel) {
        formattingProviders.forEach {
            println(it::class.simpleName)

            val result = it.formatStringToRawDateModel(
                rawDateTimeString = rawTime,
                format = format
            )

            println(result)

            assertTrue {
                result.year == expectedResult.year &&
                        result.month == expectedResult.month &&
                        result.day == expectedResult.day &&
                        result.hour == expectedResult.hour &&
                        result.minute == expectedResult.minute &&
                        result.second == expectedResult.second
            }
        }
    }
}