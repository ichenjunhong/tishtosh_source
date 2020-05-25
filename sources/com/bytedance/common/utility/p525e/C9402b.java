package com.bytedance.common.utility.p525e;

import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.utility.e.b */
public final class C9402b {

    /* renamed from: a */
    static final C9404b f25650a;

    /* renamed from: com.bytedance.common.utility.e.b$a */
    static class C9403a implements C9404b {
        C9403a() {
        }

        /* renamed from: a */
        public final void mo17046a(Editor editor) {
            editor.commit();
        }
    }

    /* renamed from: com.bytedance.common.utility.e.b$b */
    interface C9404b {
        /* renamed from: a */
        void mo17046a(Editor editor);
    }

    /* renamed from: com.bytedance.common.utility.e.b$c */
    static class C9405c implements C9404b {
        C9405c() {
        }

        /* renamed from: a */
        public final void mo17046a(Editor editor) {
            editor.apply();
        }
    }

    static {
        if (VERSION.SDK_INT >= 9) {
            f25650a = new C9405c();
        } else {
            f25650a = new C9403a();
        }
    }

    /* renamed from: a */
    public static void m18594a(Editor editor) {
        if (editor != null) {
            f25650a.mo17046a(editor);
        }
    }
}
