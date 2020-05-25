package androidx.work.impl.utils;

import androidx.work.WorkerParameters.C1530a;
import androidx.work.impl.C1626f;

/* renamed from: androidx.work.impl.utils.d */
public final class C1653d implements Runnable {

    /* renamed from: a */
    private C1626f f5787a;

    /* renamed from: b */
    private String f5788b;

    /* renamed from: c */
    private C1530a f5789c;

    public final void run() {
        this.f5787a.f5707f.mo5970a(this.f5788b, this.f5789c);
    }

    public C1653d(C1626f fVar, String str, C1530a aVar) {
        this.f5787a = fVar;
        this.f5788b = str;
        this.f5789c = aVar;
    }
}
