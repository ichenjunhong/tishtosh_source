package com.bytedance.jedi.p725a.p730e.p731a.p732a;

import com.bytedance.jedi.p725a.p726a.C11533b;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.e.a.a.e */
public class C11584e<V> extends C11533b<C52860x, V> {

    /* renamed from: c */
    private List<? extends V> f30965c;

    /* renamed from: e */
    public final void mo22295e() {
        this.f30965c = null;
    }

    /* renamed from: d */
    public final List<C52847n<C52860x, List<V>>> mo22294d() {
        List<? extends V> list = this.f30965c;
        if (list != null) {
            List<C52847n<C52860x, List<V>>> a = C52575l.m112092a(new C52847n(C52860x.f131107a, list));
            if (a != null) {
                return a;
            }
        }
        return C52575l.m112097a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo22291b(Object obj) {
        C52711k.m112240b((C52860x) obj, C43882k.f111137a);
        return this.f30965c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22292b(Object obj, List list) {
        C52711k.m112240b((C52860x) obj, C43882k.f111137a);
        this.f30965c = list;
    }
}
