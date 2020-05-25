package com.p683ss.android.ttve.log;

import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.ttve.log.TELog2ClientInvoker */
public class TELog2ClientInvoker {
    static {
        C20129b.m49686c();
    }

    public static native void nativeInit();

    public static native void nativeSetLog2ClientSwitch(boolean z);

    public static void onNativeCallback_logToLocal(int i, String str) {
        C20085a.m49602a(i, str);
    }
}
