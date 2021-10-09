package it.ipzs.cieidsdk.nfc

class SwErrorApdu {
    companion object {
        val SW_WRONG_P1P2 = (0x6b00).toByteArray()
        val SW_END_OF_FILE = (0x6282).toByteArray()
        val SW_NO_ERROR = (0x9000).toByteArray()

        private fun Int.toByteArray() : ByteArray = byteArrayOf(toByte(), shr(8).toByte())
    }
}
