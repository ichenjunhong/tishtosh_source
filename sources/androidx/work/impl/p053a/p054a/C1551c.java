package androidx.work.impl.p053a.p054a;

import androidx.work.impl.p053a.C1548a;
import androidx.work.impl.p053a.p055b.C1563d;
import androidx.work.impl.p056b.C1583g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.a.c */
public abstract class C1551c<T> implements C1548a<T> {

    /* renamed from: a */
    public final List<String> f5550a = new ArrayList();

    /* renamed from: b */
    public T f5551b;

    /* renamed from: c */
    public C1563d<T> f5552c;

    /* renamed from: d */
    private C1552a f5553d;

    /* renamed from: androidx.work.impl.a.a.c$a */
    public interface C1552a {
        /* renamed from: b */
        void mo5945b(List<String> list);

        /* renamed from: c */
        void mo5946c(List<String> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo5941a(C1583g gVar);

    /* renamed from: b */
    public abstract boolean mo5942b(T t);

    /* renamed from: a */
    private void m5522a() {
        if (!this.f5550a.isEmpty() && this.f5553d != null) {
            if (this.f5551b == null || mo5942b(this.f5551b)) {
                this.f5553d.mo5946c(this.f5550a);
            } else {
                this.f5553d.mo5945b(this.f5550a);
            }
        }
    }

    /* renamed from: a */
    public final void mo5940a(T t) {
        this.f5551b = t;
        m5522a();
    }

    C1551c(C1563d<T> dVar) {
        this.f5552c = dVar;
    }

    /* renamed from: a */
    public final void mo5943a(C1552a aVar) {
        if (this.f5553d != aVar) {
            this.f5553d = aVar;
            m5522a();
        }
    }

    /* renamed from: a */
    public final void mo5944a(List<C1583g> list) {
        this.f5550a.clear();
        for (C1583g gVar : list) {
            if (mo5941a(gVar)) {
                this.f5550a.add(gVar.f5602a);
            }
        }
        if (this.f5550a.isEmpty()) {
            this.f5552c.mo5958b(this);
        } else {
            this.f5552c.mo5956a((C1548a<T>) this);
        }
        m5522a();
    }
}
