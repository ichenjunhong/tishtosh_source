package android.arch.p010b;

import android.arch.p006a.p007a.C0040a;
import android.arch.p010b.C0082h.C0087c;
import android.support.p043v7.p048c.p049a.C1197a;
import android.support.p043v7.p048c.p049a.C1197a.C1198a;
import android.support.p043v7.p051e.C1206a;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.p051e.C1216d;
import android.support.p043v7.widget.RecyclerView.C1322a;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.a */
public final class C0055a<T> {

    /* renamed from: a */
    public final C1216d f126a;

    /* renamed from: b */
    public final C1197a<T> f127b;

    /* renamed from: c */
    Executor f128c = C0040a.m63b();

    /* renamed from: d */
    C0059a<T> f129d;

    /* renamed from: e */
    public boolean f130e;

    /* renamed from: f */
    public C0082h<T> f131f;

    /* renamed from: g */
    public C0082h<T> f132g;

    /* renamed from: h */
    public int f133h;

    /* renamed from: i */
    public C0087c f134i = new C0087c() {
        /* renamed from: a */
        public final void mo83a(int i, int i2) {
            C0055a.this.f126a.mo164a(i, i2);
        }

        /* renamed from: b */
        public final void mo84b(int i, int i2) {
            C0055a.this.f126a.mo165a(i, i2, null);
        }
    };

    /* renamed from: android.arch.b.a$a */
    interface C0059a<T> {
    }

    /* renamed from: a */
    public final int mo82a() {
        if (this.f131f != null) {
            return this.f131f.size();
        }
        if (this.f132g == null) {
            return 0;
        }
        return this.f132g.size();
    }

    public C0055a(C1322a aVar, C1212c<T> cVar) {
        this.f126a = new C1206a(aVar);
        this.f127b = new C1198a(cVar).mo3920a();
    }
}
