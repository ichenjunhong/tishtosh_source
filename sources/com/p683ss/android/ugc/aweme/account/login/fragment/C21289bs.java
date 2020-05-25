package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bs */
final class C21289bs {
    /* renamed from: a */
    static void m53878a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
