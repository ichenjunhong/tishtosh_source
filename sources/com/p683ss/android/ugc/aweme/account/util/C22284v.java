package com.p683ss.android.ugc.aweme.account.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;

/* renamed from: com.ss.android.ugc.aweme.account.util.v */
public final class C22284v {
    /* renamed from: a */
    public static C11105a m55156a(Context context) {
        return new C11105a(context);
    }

    /* renamed from: b */
    public static ProgressDialog m55157b(Context context) {
        return m55155a(context, false);
    }

    /* renamed from: a */
    private static ProgressDialog m55155a(Context context, boolean z) {
        if (VERSION.SDK_INT >= 11) {
            return new ProgressDialog(context, 3);
        }
        return new ProgressDialog(context);
    }
}
