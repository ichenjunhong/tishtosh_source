package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.c */
final class C39425c {
    /* renamed from: a */
    static void m87670a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    static boolean m87671a(Context context) {
        try {
            return C23718g.m58207b().mo49153d();
        } catch (Exception unused) {
            return false;
        }
    }
}
