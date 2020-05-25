package kotlinx.coroutines.p2679b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.b.i */
public abstract class C53242i implements Runnable {

    /* renamed from: f */
    public long f131857f;

    /* renamed from: g */
    public C53243j f131858g;

    /* renamed from: e */
    public final C53245l mo110827e() {
        return this.f131858g.mo110823b();
    }

    public C53242i() {
        this(0, C53241h.f131855a);
    }

    public C53242i(long j, C53243j jVar) {
        C52711k.m112240b(jVar, "taskContext");
        this.f131857f = j;
        this.f131858g = jVar;
    }
}
