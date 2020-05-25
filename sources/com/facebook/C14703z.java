package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.z */
final class C14703z extends OutputStream implements C13597ab {

    /* renamed from: a */
    public final Map<GraphRequest, C13598ac> f38099a = new HashMap();

    /* renamed from: b */
    public int f38100b;

    /* renamed from: c */
    private final Handler f38101c;

    /* renamed from: d */
    private GraphRequest f38102d;

    /* renamed from: e */
    private C13598ac f38103e;

    public final void write(int i) {
        mo26971a(1);
    }

    C14703z(Handler handler) {
        this.f38101c = handler;
    }

    public final void write(byte[] bArr) {
        mo26971a((long) bArr.length);
    }

    /* renamed from: a */
    public final void mo25418a(GraphRequest graphRequest) {
        C13598ac acVar;
        this.f38102d = graphRequest;
        if (graphRequest != null) {
            acVar = (C13598ac) this.f38099a.get(graphRequest);
        } else {
            acVar = null;
        }
        this.f38103e = acVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26971a(long j) {
        if (this.f38103e == null) {
            this.f38103e = new C13598ac(this.f38101c, this.f38102d);
            this.f38099a.put(this.f38102d, this.f38103e);
        }
        this.f38103e.mo25425a(j);
        this.f38100b = (int) (((long) this.f38100b) + j);
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo26971a((long) i2);
    }
}
