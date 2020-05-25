package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;

/* renamed from: com.bytedance.android.livesdk.widget.i */
public class C8555i {

    /* renamed from: a */
    private static volatile C8555i f23476a;

    /* renamed from: com.bytedance.android.livesdk.widget.i$a */
    public interface C8556a {
        /* renamed from: a */
        C8556a mo14998a(View view);

        /* renamed from: b */
        C8556a mo15003b(int i, int i2, OnClickListener onClickListener);

        /* renamed from: b */
        C8556a mo15004b(int i, CharSequence charSequence, OnClickListener onClickListener);

        /* renamed from: b */
        C8556a mo15005b(OnDismissListener onDismissListener);

        /* renamed from: b */
        C8556a mo15006b(OnShowListener onShowListener);

        /* renamed from: c */
        C8556a mo15008c(int i);

        /* renamed from: c */
        C8556a mo15009c(CharSequence charSequence);

        /* renamed from: c */
        C8556a mo15010c(boolean z);

        /* renamed from: d */
        Dialog mo15011d();

        /* renamed from: d */
        C8556a mo15012d(int i);

        /* renamed from: d */
        C8556a mo15013d(CharSequence charSequence);
    }

    /* renamed from: a */
    public static C8555i m16887a() {
        if (f23476a == null) {
            synchronized (C8555i.class) {
                if (f23476a == null) {
                    f23476a = new C8555i();
                }
            }
        }
        return f23476a;
    }

    /* renamed from: a */
    public static C8556a m16886a(Context context) {
        return new C8552a(context);
    }
}
