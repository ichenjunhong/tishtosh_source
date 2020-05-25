package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.loft.C26005b;
import com.p683ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.discover.helper.C28204l;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2125e.C41418a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView */
public final class SearchIntermediateView extends FrameLayout {

    /* renamed from: i */
    public static final C28450a f74810i = new C28450a(null);

    /* renamed from: a */
    public SearchIntermediateViewModel f74811a;

    /* renamed from: b */
    public C28452c f74812b;

    /* renamed from: c */
    C0654k f74813c;

    /* renamed from: d */
    final C28204l f74814d;

    /* renamed from: e */
    public int f74815e;

    /* renamed from: f */
    boolean f74816f;

    /* renamed from: g */
    final C0199s<Integer> f74817g;

    /* renamed from: h */
    final C0199s<Integer> f74818h;

    /* renamed from: j */
    private Fragment f74819j;

    /* renamed from: k */
    private LoftNestedRefreshLayout f74820k;

    /* renamed from: l */
    private int f74821l;

    /* renamed from: m */
    private C28451b f74822m;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$a */
    public static final class C28450a {
        private C28450a() {
        }

        public /* synthetic */ C28450a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$b */
    public interface C28451b {
        /* renamed from: a */
        void mo58109a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$c */
    public interface C28452c {
        /* renamed from: a */
        void mo58110a(C41440e eVar);

        /* renamed from: b */
        void mo58111b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$d */
    static final class C28453d<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f74823a;

        C28453d(SearchIntermediateView searchIntermediateView) {
            this.f74823a = searchIntermediateView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (this.f74823a.f74815e != num.intValue() && num.intValue() == 0) {
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f74823a.f74811a;
                    if (searchIntermediateViewModel == null) {
                        C52711k.m112237a("intermediateViewModel");
                    }
                    C41440e eVar = (C41440e) searchIntermediateViewModel.getOpenSearchParam().getValue();
                    if (eVar != null) {
                        SearchIntermediateView.m67552a(this.f74823a).mo58110a(eVar);
                    }
                }
                this.f74823a.f74815e = num.intValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$e */
    static final class C28454e<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f74824a;

        C28454e(SearchIntermediateView searchIntermediateView) {
            this.f74824a = searchIntermediateView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SearchIntermediateView.m67552a(this.f74824a).mo58111b(num.intValue());
            }
        }
    }

    public SearchIntermediateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getOpenSugFromState() {
        return this.f74821l;
    }

    /* renamed from: c */
    private final void m67556c() {
        C0654k kVar = this.f74813c;
        if (kVar == null) {
            C52711k.m112237a("fragmentManager");
        }
        Fragment a = kVar.mo2224a("RNtag_intermediate");
        if (a != null && (a instanceof C41418a)) {
            ((C41418a) a).mo58184e();
        }
    }

    /* renamed from: b */
    public final boolean mo58103b() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f74811a;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo58102a() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f74811a;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final void setLoft(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        this.f74820k = loftNestedRefreshLayout;
    }

    public final void setOpenSugFromState(int i) {
        this.f74821l = i;
    }

    public final void setOnDispatchTouchEventListener(C28451b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f74822m = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C28452c m67552a(SearchIntermediateView searchIntermediateView) {
        C28452c cVar = searchIntermediateView.f74812b;
        if (cVar == null) {
            C52711k.m112237a("responder");
        }
        return cVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C28451b bVar = this.f74822m;
        if (bVar != null) {
            bVar.mo58109a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: a */
    private final void m67554a(boolean z) {
        if (z) {
            this.f74814d.mo56618c().mo56600b();
        } else {
            this.f74814d.mo56600b();
        }
    }

    /* renamed from: a */
    public final void mo58100a(String str) {
        C52711k.m112240b(str, "keyword");
        m67555b(false);
        m67554a(false);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f74811a;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        searchIntermediateViewModel.openSearchSug(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m67555b(boolean z) {
        C0654k kVar = this.f74813c;
        if (kVar == null) {
            C52711k.m112237a("fragmentManager");
        }
        this.f74819j = kVar.mo2224a("tag_intermediate");
        if (this.f74819j == null) {
            this.f74819j = C41428h.f105000a.createSingleIntermediateFragment(z);
            C0654k kVar2 = this.f74813c;
            if (kVar2 == null) {
                C52711k.m112237a("fragmentManager");
            }
            C0679r a = kVar2.mo2225a();
            C52711k.m112236a((Object) a, "fragmentManager.beginTransaction()");
            Fragment fragment = this.f74819j;
            if (fragment == null) {
                C52711k.m112234a();
            }
            a.mo2192b(R.id.cjd, fragment, "tag_intermediate").mo2195c();
        }
        if ((this.f74819j instanceof C26005b) && this.f74820k != null) {
            Fragment fragment2 = this.f74819j;
            if (fragment2 != null) {
                C26005b bVar = (C26005b) fragment2;
                LoftNestedRefreshLayout loftNestedRefreshLayout = this.f74820k;
                if (loftNestedRefreshLayout == null) {
                    C52711k.m112234a();
                }
                bVar.mo53409a(loftNestedRefreshLayout);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.loft.ILoftPage");
        }
    }

    /* renamed from: a */
    public final void mo58101a(boolean z, boolean z2) {
        if (!mo58103b()) {
            m67555b(z2);
            m67556c();
            m67554a(z);
            SearchIntermediateViewModel searchIntermediateViewModel = this.f74811a;
            if (searchIntermediateViewModel == null) {
                C52711k.m112237a("intermediateViewModel");
            }
            searchIntermediateViewModel.openSearchSquare();
        }
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setVisibility(8);
        this.f74815e = 0;
        this.f74814d = new C28204l(context, this);
        this.f74817g = new C28453d(this);
        this.f74818h = new C28454e(this);
        this.f74821l = 1;
    }

    public /* synthetic */ SearchIntermediateView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
