class SmartCastIssueSample {
    fun castSmart(test: Any?) {
        if (test != null) {
            test.hashCode()
        }
    }
}