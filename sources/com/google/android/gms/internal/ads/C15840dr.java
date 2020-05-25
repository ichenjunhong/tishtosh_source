package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dr */
public class C15840dr {

    /* renamed from: a */
    public static boolean f44899a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static String f44900b = "Volley";

    /* renamed from: c */
    private static final String f44901c = C15840dr.class.getName();

    /* renamed from: com.google.android.gms.internal.ads.dr$a */
    static class C15841a {

        /* renamed from: a */
        public static final boolean f44902a = C15840dr.f44899a;

        /* renamed from: b */
        private final List<C15868er> f44903b = new ArrayList();

        /* renamed from: c */
        private boolean f44904c = false;

        C15841a() {
        }

        /* renamed from: a */
        public final synchronized void mo31043a(String str, long j) {
            if (!this.f44904c) {
                List<C15868er> list = this.f44903b;
                C15868er erVar = new C15868er(str, j, SystemClock.elapsedRealtime());
                list.add(erVar);
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: a */
        public final synchronized void mo31042a(String str) {
            long j;
            this.f44904c = true;
            if (this.f44903b.size() == 0) {
                j = 0;
            } else {
                j = ((C15868er) this.f44903b.get(this.f44903b.size() - 1)).f44973c - ((C15868er) this.f44903b.get(0)).f44973c;
            }
            if (j > 0) {
                long j2 = ((C15868er) this.f44903b.get(0)).f44973c;
                Object[] objArr = {Long.valueOf(j), str};
                for (C15868er erVar : this.f44903b) {
                    long j3 = erVar.f44973c;
                    Object[] objArr2 = {Long.valueOf(j3 - j2), Long.valueOf(erVar.f44972b), erVar.f44971a};
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f44904c) {
                mo31042a("Request on the loose");
            }
        }
    }
}
