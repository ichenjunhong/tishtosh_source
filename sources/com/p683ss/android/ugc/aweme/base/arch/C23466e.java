package com.p683ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.p051e.C1216d;
import android.view.ViewGroup;
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
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.e */
public abstract class C23466e<T> extends C23465d<JediViewHolder<? extends C11796d, T>> implements C11837a<T> {

    /* renamed from: c */
    private final C11841b<T> f62536c;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.e$a */
    static final class C23467a extends C52712l implements C52671b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ C23466e f62537a;

        C23467a(C23466e eVar) {
            this.f62537a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue() + this.f62537a.mo48643e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.arch.e$b */
    static final class C23468b extends C52712l implements C52671b<ViewGroup, JediViewHolder<? extends C11796d, T>> {

        /* renamed from: a */
        final /* synthetic */ C23466e f62538a;

        C23468b(C23466e eVar) {
            this.f62538a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return this.f62538a.mo48638a(viewGroup);
        }
    }

    /* renamed from: a */
    public abstract JediViewHolder<? extends C11796d, T> mo48638a(ViewGroup viewGroup);

    public final C11841b<T> aH_() {
        return this.f62536c;
    }

    /* renamed from: d */
    public final List<T> mo48640d() {
        return C11838a.m24188a(this);
    }

    public int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: c */
    public final int mo48636c() {
        return aH_().mo22594a() + mo48643e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, T>> hVar) {
        C52711k.m112240b(hVar, "registry");
        hVar.mo22697a(0, null, (C52671b<? super ViewGroup, ? extends VH>) new C23468b<Object,Object>(this));
    }

    /* renamed from: a */
    public final T mo22589a(int i, boolean z) {
        return C11838a.m24186a((C11837a<T>) this, i, z);
    }

    /* renamed from: a */
    public final void mo22590a(List<? extends T> list, C52670a<C52860x> aVar) {
        C52711k.m112240b(list, "list");
        C11838a.m24189a((C11837a<T>) this, list, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo48635b(int i, boolean z) {
        return aH_().mo22595a(i - mo48643e(), true);
    }

    public C23466e(C0184k kVar, C1212c<T> cVar, C11850b bVar) {
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

    private C23466e(C0184k kVar, C11848e eVar, C11845c<T> cVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(cVar, "config");
        super(kVar);
        this.f62536c = new C11841b<>((C1216d) new C11962c(this, new C23467a(this)), cVar, eVar);
    }

    public /* synthetic */ C23466e(C0184k kVar, C1212c cVar, C11850b bVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            cVar = new C23461a();
        }
        this(kVar, cVar, (C11850b) null);
    }
}
