package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

import android.content.Context;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.b */
public final class C20465b extends C20464a {

    /* renamed from: e */
    private C20457b f56112e;

    /* renamed from: b */
    public final boolean mo43422b(boolean z) {
        return !z;
    }

    /* renamed from: c */
    public final boolean mo43423c() {
        return true;
    }

    /* renamed from: a */
    public final int mo43417a() {
        if (this.f56110c) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo43419a(boolean z) {
        this.f56110c = z;
    }

    public C20465b(C20457b bVar, C20476i iVar) {
        super(iVar);
        this.f56112e = bVar;
    }

    /* renamed from: a */
    public final void mo43418a(Context context, final C19263c cVar) {
        int i;
        C20457b bVar = this.f56112e;
        if (this.f56110c) {
            i = 0;
        } else {
            i = 2;
        }
        bVar.mo43341a(i, (C19263c) new C19263c() {
            /* renamed from: a */
            public final void mo39670a(int i) {
                if (cVar != null) {
                    cVar.mo39670a(i);
                }
                C20465b.this.f56110c = !C20465b.this.f56110c;
                C20465b.this.f56108a.mo43428a(C20465b.this.f56110c);
            }

            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
                if (cVar != null) {
                    cVar.mo39671a(i, i2, str);
                }
            }
        });
    }
}
