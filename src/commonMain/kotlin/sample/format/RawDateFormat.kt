package sample.format

sealed class RawDateFormat(val rawFormat: String) {
    sealed class Iso8601(rawFormat: String) : RawDateFormat(rawFormat) {
        object Complete : Iso8601("YYYY-MM-DDThh:mm:ss")
        object Date : Iso8601("YYYY-MM-DD")
        object Time : Iso8601("hh:mm:ss")
    }
}