package com.p683ss.android.ttve.editorInfo;

import com.p683ss.android.ttve.nativePort.C20129b;
import java.util.HashMap;

/* renamed from: com.ss.android.ttve.editorInfo.TEEditorInfoInvoker */
public class TEEditorInfoInvoker {
    static {
        C20129b.m49685b();
    }

    public static native void nativeInit();

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        if (C20084a.f55215a != null) {
            C20084a.f55215a.put(str, Float.valueOf(f));
        }
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        if (C20084a.f55215a != null) {
            C20084a.f55215a.put(str, Long.valueOf(j));
        }
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        if (C20084a.f55215a != null) {
            C20084a.f55215a.put(str, str2);
        }
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        if (C20084a.f55215a != null) {
            C20084a.f55215a.put(str, hashMap);
        }
    }
}
