package com.p683ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.p051e.C1216d;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11837a.C11838a;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.bytedance.jedi.arch.ext.list.p744a.C11845c;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.arch.ext.list.p744a.C11851f;
import com.bytedance.jedi.ext.adapter.C11962c;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.c */
public abstract class C23463c<T> extends C23465d<JediViewHolder<? extends C11796d, ?>> implements C11837a<T> {

    /* renamed from: c */
    private final C11841b<T> f62533c;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.c$a */
    static final class C23464a extends C52712l implements C52671b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ C23463c f62534a;

        C23464a(C23463c cVar) {
            this.f62534a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue() + this.f62534a.mo48643e());
        }
    }

    public final C11841b<T> aH_() {
        return this.f62533c;
    }

    /* renamed from: d */
    public List<T> mo48637d() {
        return C11838a.m24188a(this);
    }

    public int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: c */
    public final int mo48636c() {
        return aH_().mo22594a() + mo48643e();
    }

    /* renamed from: a */
    public final void mo48634a(List<? extends T> list) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(list, "list");
        mo22590a(list, null);
    }

    /* renamed from: a */
    public final T mo22589a(int i, boolean z) {
        return C11838a.m24186a((C11837a<T>) this, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo48635b(int i, boolean z) {
        return aH_().mo22595a(i - mo48643e(), true);
    }

    /* renamed from: a */
    public final void mo22590a(List<? extends T> list, C52670a<C52860x> aVar) {
        C52711k.m112240b(list, "list");
        C11838a.m24189a((C11837a<T>) this, list, aVar);
    }

    public C23463c(C0184k kVar, C1212c<T> cVar, C11850b bVar) {
        C11848e eVar;
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(cVar, "diffCallback");
        if (bVar != null) {
            eVar = C11851f.m24206a(bVar, true, 10);
        } else {
            eVar = null;
        }
        this(kVar, eVar, C52711k.m112240b(cVar, "$this$asDifferConfig"));
    }

    private C23463c(C0184k kVar, C11848e eVar, C11845c<T> cVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(cVar, "config");
        super(kVar);
        this.f62533c = new C11841b<>((C1216d) new C11962c(this, new C23464a(this)), cVar, eVar);
    }

    public /* synthetic */ C23463c(C0184k kVar, C1212c cVar, C11850b bVar, int i, C52707g gVar) {
        this(kVar, cVar, (C11850b) null);
    }
}
