package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.afh.C15571a;
import com.google.android.gms.internal.ads.afh.C15571a.C15572a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class bea {

    /* renamed from: b */
    protected static volatile byh f42147b = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f42148d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f42149e = null;

    /* renamed from: a */
    bey f42150a;

    /* renamed from: c */
    protected volatile Boolean f42151c;

    public bea(bey bey) {
        this.f42150a = bey;
        bey.f42217b.execute(new bec(this));
    }

    /* renamed from: a */
    public final void mo30068a(int i, int i2, long j) {
        mo30069a(i, i2, j, null);
    }

    /* renamed from: a */
    public final void mo30069a(int i, int i2, long j, Exception exc) {
        try {
            f42148d.block();
            if (this.f42151c.booleanValue() && f42147b != null) {
                C15572a a = C15571a.m32805a().mo28775a(this.f42150a.f42216a.getPackageName()).mo28774a(j);
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    avx.m34243a(exc, new PrintWriter(stringWriter));
                    a.mo28776b(stringWriter.toString()).mo28777c(exc.getClass().getName());
                }
                byl a2 = f42147b.mo30862a(((C15571a) ((axz) a.mo29832e())).mo29580f());
                a2.mo30865b(i);
                if (i2 != -1) {
                    a2.mo30863a(i2);
                }
                a2.mo30864a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m35459a() {
        try {
            if (VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m35461c().nextInt();
        } catch (RuntimeException unused) {
            return m35461c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m35461c() {
        if (f42149e == null) {
            synchronized (bea.class) {
                if (f42149e == null) {
                    f42149e = new Random();
                }
            }
        }
        return f42149e;
    }
}
