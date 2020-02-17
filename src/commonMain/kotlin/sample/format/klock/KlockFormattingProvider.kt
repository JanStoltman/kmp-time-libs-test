package sample.format.klock

import com.soywiz.klock.DateFormat
import com.soywiz.klock.parse
import sample.format.FormattingProvider
import sample.format.RawDateFormat
import sample.format.RawDateModel

class KlockFormattingProvider : FormattingProvider {

    override fun formatStringToRawDateModel(rawDateTimeString: String, format: RawDateFormat) =
        DateFormat(format.rawFormat).parse(rawDateTimeString).run {
            RawDateModel(
                year = yearInt,
                month = month1,
                day = dayOfMonth,
                hour = hours,
                minute = minutes,
                second = seconds
            )
        }
}