package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.j */
public final class C35270j {
    /* renamed from: a */
    public static void m79749a(Context context, int i, int i2, int i3, final Runnable runnable) {
        C352711 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2 || i != -1 || runnable == null) {
                    dialogInterface.dismiss();
                    return;
                }
                dialogInterface.dismiss();
                runnable.run();
            }
        };
        new C1161a(context, R.style.s8).mo3768b(i).mo3769b((int) R.string.bf_, (OnClickListener) r3).mo3759a(i3, (OnClickListener) r3).mo3772b().show();
    }

    /* renamed from: a */
    public static C1160b m79748a(Context context, String str, String str2, int i, OnClickListener onClickListener, int i2, OnClickListener onClickListener2) {
        C1161a aVar = new C1161a(context, R.style.s8);
        aVar.mo3764a((CharSequence) str).mo3770b((CharSequence) str2).mo3769b(i, onClickListener).mo3759a(i2, onClickListener2);
        C1160b b = aVar.mo3772b();
        try {
            b.show();
            b.mo3753a(-1).setTextColor(context.getResources().getColor(R.color.a3c));
        } catch (Exception unused) {
        }
        return b;
    }
}
