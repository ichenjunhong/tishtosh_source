package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.C13501b;
import com.facebook.GraphRequest.C13503d;

/* renamed from: com.facebook.ac */
final class C13598ac {

    /* renamed from: a */
    final long f35473a = C14533n.m29776j();

    /* renamed from: b */
    public long f35474b;

    /* renamed from: c */
    long f35475c;

    /* renamed from: d */
    public long f35476d;

    /* renamed from: e */
    private final GraphRequest f35477e;

    /* renamed from: f */
    private final Handler f35478f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25424a() {
        if (this.f35474b > this.f35475c) {
            C13501b bVar = this.f35477e.f35229k;
            if (this.f35476d > 0 && (bVar instanceof C13503d)) {
                final long j = this.f35474b;
                final long j2 = this.f35476d;
                final C13503d dVar = (C13503d) bVar;
                if (this.f35478f != null) {
                    Handler handler = this.f35478f;
                    C135991 r2 = new Runnable() {
                        public final void run() {
                        }
                    };
                    handler.post(r2);
                }
                this.f35475c = this.f35474b;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25425a(long j) {
        this.f35476d += j;
    }

    C13598ac(Handler handler, GraphRequest graphRequest) {
        this.f35477e = graphRequest;
        this.f35478f = handler;
    }
}
