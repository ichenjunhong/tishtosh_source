package com.bytedance.common.utility.p521a;

import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.ClipboardManager;

/* renamed from: com.bytedance.common.utility.a.a */
public final class C9369a {

    /* renamed from: a */
    static final C9371b f25604a;

    /* renamed from: com.bytedance.common.utility.a.a$a */
    static class C9370a implements C9371b {
        C9370a() {
        }

        /* renamed from: a */
        public final void mo16987a(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((ClipboardManager) context.getSystemService("clipboard")).setText(charSequence2);
        }
    }

    /* renamed from: com.bytedance.common.utility.a.a$b */
    interface C9371b {
        /* renamed from: a */
        void mo16987a(Context context, CharSequence charSequence, CharSequence charSequence2);
    }

    /* renamed from: com.bytedance.common.utility.a.a$c */
    static class C9372c implements C9371b {
        C9372c() {
        }

        /* renamed from: a */
        public final void mo16987a(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f25604a = new C9372c();
        } else {
            f25604a = new C9370a();
        }
    }

    /* renamed from: a */
    public static void m18549a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        if (context != null && charSequence2 != null) {
            try {
                f25604a.mo16987a(context, charSequence, charSequence2);
            } catch (Throwable unused) {
            }
        }
    }
}
