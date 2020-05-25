package com.linecorp.linesdk.p1086a;

import android.content.Context;
import com.linecorp.p1083a.p1084a.p1085a.C18188b;

/* renamed from: com.linecorp.linesdk.a.c */
public final class C18212c {

    /* renamed from: a */
    static final C18188b f50268a = new C18188b("com.linecorp.linesdk.sharedpreference.encryptionsalt");

    /* renamed from: b */
    public static volatile boolean f50269b = false;

    /* renamed from: com.linecorp.linesdk.a.c$a */
    public static class C18213a implements Runnable {

        /* renamed from: a */
        private final Context f50270a;

        public final void run() {
            C18212c.f50268a.mo36243a(this.f50270a);
        }

        public C18213a(Context context) {
            this.f50270a = context;
        }
    }
}
