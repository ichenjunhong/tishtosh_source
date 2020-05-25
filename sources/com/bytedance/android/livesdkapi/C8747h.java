package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdkapi.h */
public interface C8747h {

    /* renamed from: com.bytedance.android.livesdkapi.h$a */
    public interface C8748a {
        /* renamed from: a */
        void mo8888a();

        /* renamed from: b */
        C8749b mo8889b();
    }

    /* renamed from: com.bytedance.android.livesdkapi.h$b */
    public static class C8749b {

        /* renamed from: a */
        public Context f24024a;

        /* renamed from: b */
        public Fragment f24025b;

        /* renamed from: c */
        public HashMap<String, String> f24026c = new HashMap<>();

        public C8749b(Context context, Fragment fragment) {
            this.f24024a = context;
            this.f24025b = null;
        }
    }

    /* renamed from: a */
    void mo8890a(C8748a aVar);
}
