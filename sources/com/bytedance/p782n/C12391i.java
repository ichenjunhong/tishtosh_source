package com.bytedance.p782n;

import com.bytedance.p782n.p784b.C12379a;
import java.util.List;

/* renamed from: com.bytedance.n.i */
final class C12391i implements C12378b {

    /* renamed from: a */
    protected C12383e f32632a;

    /* renamed from: b */
    private int f32633b;

    /* renamed from: c */
    private List<C12388h> f32634c;

    /* renamed from: d */
    private C12382d f32635d;

    /* renamed from: com.bytedance.n.i$a */
    static final class C12392a extends Exception {
        C12392a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: c */
    private C12382d m24954c(Class cls) {
        C12382d dVar = this.f32635d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f32613a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final Object mo23390a(Class cls) {
        C12382d c = m24954c(cls);
        if (c != null) {
            return c.f32614b;
        }
        StringBuilder sb = new StringBuilder("can not find pre Interceptor , class:");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final Object mo23392b(Class cls) {
        C12382d c = m24954c(cls);
        if (c != null) {
            return c.f32615c;
        }
        StringBuilder sb = new StringBuilder("can not find pre Interceptor , class:");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final Object mo23391a(Object obj) throws Exception {
        if (this.f32635d != null) {
            this.f32635d.f32615c = obj;
            C12382d dVar = this.f32635d;
            if (dVar.f32616d != null) {
                dVar.f32616d.mo18098b(dVar.f32617e, dVar);
            }
        }
        if (this.f32633b >= this.f32634c.size()) {
            return obj;
        }
        C12388h hVar = (C12388h) this.f32634c.get(this.f32633b);
        Class<? extends C12382d> cls = hVar.f32626a;
        C12382d dVar2 = (C12382d) this.f32632a.mo23397a(cls);
        if (dVar2 != null) {
            C12379a aVar = hVar.f32627b;
            C12391i iVar = new C12391i(this.f32634c, this.f32633b + 1, this.f32632a, dVar2);
            dVar2.mo23395a(iVar, this.f32635d, obj, aVar, hVar.f32628c);
            if (dVar2.f32616d != null) {
                dVar2.f32616d.mo18099c(dVar2.f32617e, dVar2);
            }
            try {
                Object a_ = dVar2.mo18063a_(iVar, obj);
                if (dVar2.f32616d != null) {
                    dVar2.f32616d.mo18097a(dVar2.f32617e, dVar2);
                }
                return a_;
            } catch (C12392a e) {
                Throwable cause = e.getCause();
                if (dVar2.f32616d != null) {
                    dVar2.f32616d.mo18149b(dVar2.f32617e, dVar2, cause);
                }
                throw e;
            } finally {
                if (dVar2.f32616d != null) {
                    dVar2.f32616d.mo18096a(dVar2.f32617e, dVar2, th);
                }
                C12392a aVar2 = new C12392a(th);
            }
        } else {
            StringBuilder sb = new StringBuilder("interceptor == null , index = ");
            sb.append(obj);
            sb.append(" , class: ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    C12391i(List<C12388h> list, int i, C12383e eVar, C12382d dVar) {
        this.f32634c = list;
        this.f32633b = i;
        this.f32632a = eVar;
        this.f32635d = dVar;
    }
}
