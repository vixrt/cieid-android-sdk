package it.ipzs.cieidsdk.nfc

internal class ApduResponse {

    var response: ByteArray = byteArrayOf()
    var swShort : ByteArray = byteArrayOf()

    val swHex: String
        @Throws(Exception::class)
        get() = bytesToHex(this.swShort)
    val swInt: Int
        @Throws(Exception::class)
        get() = AppUtil.toUint(this.swShort)


    @Throws(Exception::class)
    constructor(fullResponse: ByteArray) {
        this.response = fullResponse.copyOfRange(0, fullResponse.size - 2)
        this.swShort = fullResponse.copyOfRange(fullResponse.size - 2, fullResponse.size)
    }

    @Throws(Exception::class)
    constructor(res: ByteArray, sw: ByteArray) {
        this.response = res
        this.swShort = sw
    }

    @Throws(Exception::class)
    private fun bytesToHex(bytes: ByteArray): String {
        val sb = StringBuilder(bytes.size * 2)
        for (i in bytes.indices) {
            sb.append(String.format("%02x", bytes[i]))
        }
        return sb.toString()
    }

}
