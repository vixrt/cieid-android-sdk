package it.ipzs.cieidsdk.util

import android.util.Log
import it.ipzs.cieidsdk.common.CieIDSdk

internal class CieIDSdkLogger {

    companion object{

        private const val TAG : String = "CieIDSdkLogger"

        fun log(message : String){
            if(CieIDSdk.enableLog)
                Log.d(TAG,message)
        }
    }
}