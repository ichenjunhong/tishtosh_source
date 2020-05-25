package com.p683ss.android.ugc.aweme.p1807im.sdk.common;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel */
public class ListViewModel<T> extends C0209x {

    /* renamed from: e */
    static final /* synthetic */ C52767h[] f87900e = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ListViewModel.class), "data", "getData()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ListViewModel.class), "refreshStatus", "getRefreshStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ListViewModel.class), "loadLatestStatus", "getLoadLatestStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ListViewModel.class), "loadMoreStatus", "getLoadMoreStatus()Lcom/ss/android/ugc/aweme/im/sdk/common/LoadStatus;"))};

    /* renamed from: a */
    private final C52668f f87901a = C52732g.m112285a(C33988a.f87905a);

    /* renamed from: b */
    private final C52668f f87902b = C52732g.m112285a(new C33991d(this));

    /* renamed from: c */
    private final C52668f f87903c = C52732g.m112285a(new C33989b(this));

    /* renamed from: d */
    private final C52668f f87904d = C52732g.m112285a(new C33990c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$a */
    static final class C33988a extends C52712l implements C52670a<C23275b<List<T>>> {

        /* renamed from: a */
        public static final C33988a f87905a = new C33988a();

        C33988a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$b */
    static final class C33989b extends C52712l implements C52670a<C33999d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f87906a;

        C33989b(ListViewModel listViewModel) {
            this.f87906a = listViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33999d(this.f87906a.mo71922b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$c */
    static final class C33990c extends C52712l implements C52670a<C33999d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f87907a;

        C33990c(ListViewModel listViewModel) {
            this.f87907a = listViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33999d(this.f87907a.mo71922b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ListViewModel$d */
    static final class C33991d extends C52712l implements C52670a<C33999d<T>> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f87908a;

        C33991d(ListViewModel listViewModel) {
            this.f87908a = listViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33999d(this.f87908a.mo71922b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23275b<List<T>> mo71922b() {
        return (C23275b) this.f87901a.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C33999d<T> mo71924c() {
        return (C33999d) this.f87902b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C33999d<T> mo71925d() {
        return (C33999d) this.f87903c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C33999d<T> mo71928h() {
        return (C33999d) this.f87904d.getValue();
    }

    /* renamed from: j */
    public final void mo71930j() {
        mo71924c().mo71937a(true);
    }

    /* renamed from: k */
    public final void mo71931k() {
        mo71928h().mo71937a(true);
    }

    /* renamed from: i */
    public final boolean mo71929i() {
        if (mo71924c().f87917c || mo71925d().f87917c || mo71928h().f87917c) {
            return true;
        }
        return false;
    }

    /* renamed from: b_ */
    public final void mo71923b_(Throwable th) {
        mo71928h().mo71936a(th);
    }

    /* renamed from: a_ */
    public final void mo71921a_(Throwable th) {
        mo71922b().setValue(new ArrayList());
        mo71924c().mo71936a(th);
    }

    /* renamed from: d */
    public final void mo71926d(List<T> list, boolean z) {
        List list2;
        C23275b b = mo71922b();
        if (list != null) {
            list2 = C52575l.m112139e((Collection<? extends T>) list);
        } else {
            list2 = null;
        }
        b.setValue(list2);
        mo71924c().f87916b = z;
        mo71924c().mo71938b(true);
    }

    /* renamed from: e */
    public final void mo71927e(List<T> list, boolean z) {
        List list2;
        C23275b b = mo71922b();
        if (list != null) {
            list2 = C52575l.m112139e((Collection<? extends T>) list);
        } else {
            list2 = null;
        }
        b.setValue(list2);
        mo71928h().f87916b = z;
        mo71928h().mo71938b(true);
    }

    /* renamed from: a */
    private void m77691a(C0184k kVar, C33993b<T> bVar, C33993b<T> bVar2, C33993b<T> bVar3) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        if (bVar != null) {
            mo71924c().mo71935a(kVar, bVar);
        }
        if (bVar2 != null) {
            mo71928h().mo71935a(kVar, bVar2);
        }
        if (bVar3 != null) {
            mo71925d().mo71935a(kVar, bVar3);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m77692a(ListViewModel listViewModel, C0184k kVar, C33993b bVar, C33993b bVar2, C33993b bVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            bVar2 = null;
        }
        if ((i & 8) != 0) {
            bVar3 = null;
        }
        listViewModel.m77691a(kVar, bVar, bVar2, bVar3);
    }
}
