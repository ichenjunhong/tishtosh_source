package com.facebook;

import android.os.Handler;
import com.facebook.C14564s.C14565a;
import com.facebook.C14564s.C14566b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.aa */
final class C13595aa extends FilterOutputStream implements C13597ab {

    /* renamed from: a */
    public final C14564s f35464a;

    /* renamed from: b */
    public long f35465b;

    /* renamed from: c */
    public long f35466c;

    /* renamed from: d */
    private final Map<GraphRequest, C13598ac> f35467d;

    /* renamed from: e */
    private final long f35468e = C14533n.m29776j();

    /* renamed from: f */
    private long f35469f;

    /* renamed from: g */
    private C13598ac f35470g;

    /* renamed from: a */
    private void m27439a() {
        if (this.f35465b > this.f35469f) {
            for (C14565a aVar : this.f35464a.f37843e) {
                if (aVar instanceof C14566b) {
                    Handler handler = this.f35464a.f37839a;
                    final C14566b bVar = (C14566b) aVar;
                    if (handler != null) {
                        handler.post(new Runnable() {
                            public final void run() {
                            }
                        });
                    }
                }
            }
            this.f35469f = this.f35465b;
        }
    }

    public final void close() throws IOException {
        super.close();
        for (C13598ac a : this.f35467d.values()) {
            a.mo25424a();
        }
        m27439a();
    }

    /* renamed from: a */
    public final void mo25418a(GraphRequest graphRequest) {
        C13598ac acVar;
        if (graphRequest != null) {
            acVar = (C13598ac) this.f35467d.get(graphRequest);
        } else {
            acVar = null;
        }
        this.f35470g = acVar;
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        m27440a(1);
    }

    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m27440a((long) bArr.length);
    }

    /* renamed from: a */
    private void m27440a(long j) {
        if (this.f35470g != null) {
            C13598ac acVar = this.f35470g;
            acVar.f35474b += j;
            if (acVar.f35474b >= acVar.f35475c + acVar.f35473a || acVar.f35474b >= acVar.f35476d) {
                acVar.mo25424a();
            }
        }
        this.f35465b += j;
        if (this.f35465b >= this.f35469f + this.f35468e || this.f35465b >= this.f35466c) {
            m27439a();
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m27440a((long) i2);
    }

    C13595aa(OutputStream outputStream, C14564s sVar, Map<GraphRequest, C13598ac> map, long j) {
        super(outputStream);
        this.f35464a = sVar;
        this.f35467d = map;
        this.f35466c = j;
    }
}
