package com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a;

import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a.C33258d.C33259a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.b */
public abstract class C33254b<VH extends C1352v, T> extends C26840g<T> implements C33256c<T> {

    /* renamed from: a */
    private final C33249a<T> f86274a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.b$a */
    static final class C33255a extends C52712l implements C52671b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ C33254b f86275a;

        C33255a(C33254b bVar) {
            this.f86275a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue() + this.f86275a.mo70605j());
        }
    }

    /* renamed from: g */
    public final C33249a<T> mo70604g() {
        return this.f86274a;
    }

    /* renamed from: j */
    public int mo70605j() {
        return 0;
    }

    public int getItemCount() {
        int i;
        List<? extends T> list = mo70604g().f86262c;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + mo70605j();
    }

    /* renamed from: k */
    public final List<T> mo70606k() {
        List<? extends T> list = mo70604g().f86262c;
        if (list != null) {
            return list;
        }
        List<T> emptyList = Collections.emptyList();
        C52711k.m112236a((Object) emptyList, "Collections.emptyList()");
        return emptyList;
    }

    /* renamed from: e */
    public final void mo70603e(List<? extends T> list) {
        C33249a g = mo70604g();
        g.f86262c = list;
        g.f86263d.mo70608a();
    }

    private C33254b(C1212c<T> cVar) {
        C52711k.m112240b(cVar, "diffCallback");
        C52711k.m112240b(cVar, "$this$asDifferConfig");
        this(new C33259a(cVar).mo70607a());
    }

    private C33254b(C33258d<T> dVar) {
        C52711k.m112240b(dVar, "config");
        this.f86274a = new C33249a<>(new C33262f(this, new C33255a(this)), dVar);
        this.f70699x = false;
    }

    /* renamed from: b */
    public T mo70602b(int i) {
        if (i < mo70605j() || i >= getItemCount()) {
            return null;
        }
        int j = i - mo70605j();
        List<? extends T> list = mo70604g().f86262c;
        if (list != null && j < list.size() && j >= 0) {
            return list.get(j);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo70601a(List<? extends T> list, C52670a<C52860x> aVar) {
        C33249a g = mo70604g();
        g.f86261b++;
        int i = g.f86261b;
        List<? extends T> list2 = g.f86262c;
        if (list != list2) {
            if (list == null) {
                if (list2 == null) {
                    C52711k.m112234a();
                }
                int size = list2.size();
                g.f86262c = null;
                g.f86263d.mo166b(0, size);
            } else if (list2 == null) {
                g.f86262c = list;
                g.f86263d.mo164a(0, list.size());
            } else {
                Executor executor = g.f86264e.f86277b;
                C33251b bVar = new C33251b(g, list2, list, i, aVar);
                executor.execute(bVar);
            }
        }
    }

    public /* synthetic */ C33254b(C1212c cVar, int i, C52707g gVar) {
        this((C1212c<T>) new C33263g<T>());
    }
}
