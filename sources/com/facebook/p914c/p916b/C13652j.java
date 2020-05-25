package com.facebook.p914c.p916b;

import com.facebook.p914c.p915a.C13617b.C13618a;
import com.facebook.p914c.p915a.C13619c;
import java.io.IOException;

/* renamed from: com.facebook.c.b.j */
public final class C13652j {

    /* renamed from: a */
    private static final Object f35621a = new Object();

    /* renamed from: b */
    private static C13652j f35622b;

    /* renamed from: c */
    private static int f35623c;

    /* renamed from: d */
    private C13619c f35624d;

    /* renamed from: e */
    private String f35625e;

    /* renamed from: f */
    private long f35626f;

    /* renamed from: g */
    private long f35627g;

    /* renamed from: h */
    private long f35628h;

    /* renamed from: i */
    private IOException f35629i;

    /* renamed from: j */
    private C13618a f35630j;

    /* renamed from: k */
    private C13652j f35631k;

    private C13652j() {
    }

    /* renamed from: c */
    private void m27592c() {
        this.f35624d = null;
        this.f35625e = null;
        this.f35626f = 0;
        this.f35627g = 0;
        this.f35628h = 0;
        this.f35629i = null;
        this.f35630j = null;
    }

    /* renamed from: b */
    public final void mo25526b() {
        synchronized (f35621a) {
            if (f35623c < 5) {
                m27592c();
                f35623c++;
                if (f35622b != null) {
                    this.f35631k = f35622b;
                }
                f35622b = this;
            }
        }
    }

    /* renamed from: a */
    public static C13652j m27591a() {
        synchronized (f35621a) {
            if (f35622b == null) {
                return new C13652j();
            }
            C13652j jVar = f35622b;
            f35622b = jVar.f35631k;
            jVar.f35631k = null;
            f35623c--;
            return jVar;
        }
    }

    /* renamed from: a */
    public final C13652j mo25520a(long j) {
        this.f35626f = j;
        return this;
    }

    /* renamed from: b */
    public final C13652j mo25525b(long j) {
        this.f35628h = j;
        return this;
    }

    /* renamed from: c */
    public final C13652j mo25527c(long j) {
        this.f35627g = j;
        return this;
    }

    /* renamed from: a */
    public final C13652j mo25521a(C13618a aVar) {
        this.f35630j = aVar;
        return this;
    }

    /* renamed from: a */
    public final C13652j mo25522a(C13619c cVar) {
        this.f35624d = cVar;
        return this;
    }

    /* renamed from: a */
    public final C13652j mo25523a(IOException iOException) {
        this.f35629i = iOException;
        return this;
    }

    /* renamed from: a */
    public final C13652j mo25524a(String str) {
        this.f35625e = str;
        return this;
    }
}
