package com.bytedance.common.utility.p523c;

import android.os.AsyncTask;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.utility.c.a */
public final class C9384a {

    /* renamed from: a */
    static final C9386a f25614a;

    /* renamed from: com.bytedance.common.utility.c.a$a */
    static class C9386a {
        private C9386a() {
        }

        /* renamed from: a */
        public <T> void mo17013a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.bytedance.common.utility.c.a$b */
    static class C9387b extends C9386a {
        private C9387b() {
            super();
        }

        /* renamed from: a */
        public final <T> void mo17013a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(C9389c.m18568a(), tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f25614a = new C9387b();
        } else {
            f25614a = new C9386a();
        }
    }

    /* renamed from: a */
    public static <T> void m18565a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        f25614a.mo17013a(asyncTask, tArr);
    }
}
