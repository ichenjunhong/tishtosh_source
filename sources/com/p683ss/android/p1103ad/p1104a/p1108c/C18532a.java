package com.p683ss.android.p1103ad.p1104a.p1108c;

import android.os.Handler;
import com.p683ss.android.p1103ad.p1104a.p1105a.p1106a.C18515a;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.a.c.a */
public final class C18532a {

    /* renamed from: com.ss.android.ad.a.c.a$a */
    public interface C18535a {
        /* renamed from: a */
        void mo37808a(C18515a aVar);
    }

    /* renamed from: a */
    public static void m44850a(String str, HashMap<String, String> hashMap, String str2, int i, C18535a aVar) {
        final Handler handler = new Handler();
        final String str3 = str;
        final HashMap<String, String> hashMap2 = hashMap;
        final String str4 = str2;
        final int i2 = i;
        final C18535a aVar2 = aVar;
        C185331 r0 = new Runnable() {
            public final void run() {
                final C18515a a = C18537c.m44854a(str3, hashMap2, str4, i2);
                handler.post(new Runnable() {
                    public final void run() {
                        aVar2.mo37808a(a);
                    }
                });
            }
        };
        new Thread(r0).start();
    }
}
