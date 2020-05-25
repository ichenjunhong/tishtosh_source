package com.p683ss.android.ugc.aweme.utils;

import android.app.KeyguardManager;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.utils.eu */
public final class C47863eu {
    /* renamed from: a */
    public static boolean m103535a() {
        boolean z = false;
        try {
            KeyguardManager keyguardManager = (KeyguardManager) C11010c.m22280a().getSystemService("keyguard");
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
