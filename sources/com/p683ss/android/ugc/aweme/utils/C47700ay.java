package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.ay */
public final class C47700ay {
    /* renamed from: c */
    private static void m103237c(Dialog dialog) {
        try {
            C47701az.m103238a(dialog);
        } catch (IllegalArgumentException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static void m103235a(Dialog dialog) {
        if (dialog != null) {
            Context context = dialog.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !dialog.isShowing()) {
                try {
                    dialog.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m103236b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                if (VERSION.SDK_INT >= 17) {
                    Activity activity = (Activity) baseContext;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                } else if (((Activity) baseContext).isFinishing()) {
                    return;
                }
            }
            m103237c(dialog);
        }
    }

    /* renamed from: a */
    public static C1160b m103234a(Context context, int i, int i2, OnClickListener onClickListener, int i3, OnClickListener onClickListener2) {
        C1161a aVar = new C1161a(context, R.style.s8);
        aVar.mo3768b(i).mo3769b((int) R.string.wf, onClickListener).mo3759a(i3, onClickListener2);
        C1160b b = aVar.mo3772b();
        try {
            b.show();
        } catch (Exception unused) {
        }
        return b;
    }
}
