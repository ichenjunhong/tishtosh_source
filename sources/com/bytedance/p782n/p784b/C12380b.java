package com.bytedance.p782n.p784b;

import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.n.b.b */
public final class C12380b extends C12379a {

    /* renamed from: a */
    private List<C12379a> f32611a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo23394a(C12379a aVar) {
        if (aVar != null) {
            this.f32611a.add(aVar);
        }
    }

    public C12380b(C12379a... aVarArr) {
        this.f32611a.addAll(Arrays.asList(aVarArr));
    }

    /* renamed from: a */
    public final <T> void mo18097a(C12378b<T> bVar, C12382d dVar) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo18097a(bVar, dVar);
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo18098b(bVar, dVar);
            }
        }
    }

    /* renamed from: c */
    public final <T> void mo18099c(C12378b<T> bVar, C12382d dVar) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo18099c(bVar, dVar);
            }
        }
    }

    /* renamed from: a */
    public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo18096a(bVar, dVar, th);
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo18149b(C12378b<T> bVar, C12382d dVar, Throwable th) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo18149b(bVar, dVar, th);
            }
        }
    }

    /* renamed from: c */
    public final <T> void mo23393c(C12378b<T> bVar, C12382d dVar, Throwable th) {
        for (C12379a aVar : this.f32611a) {
            if (aVar != null) {
                aVar.mo23393c(bVar, dVar, th);
            }
        }
    }
}
