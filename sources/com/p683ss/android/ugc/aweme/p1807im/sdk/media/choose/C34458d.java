package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1852a.C34443a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel.C34482a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35401g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d */
public final class C34458d extends C23526a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88887a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34458d.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/viewmodel/MediaChooseViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34458d.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/adapter/MediaChooseAdapter;"))};

    /* renamed from: b */
    public static final C34459a f88888b = new C34459a(null);

    /* renamed from: c */
    private final C52668f f88889c = C52732g.m112285a(new C34462d(this));

    /* renamed from: d */
    private final C52668f f88890d = C52732g.m112285a(new C34460b(this));

    /* renamed from: e */
    private HashMap f88891e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d$a */
    public static final class C34459a {
        private C34459a() {
        }

        public /* synthetic */ C34459a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d$b */
    static final class C34460b extends C52712l implements C52670a<C34443a> {

        /* renamed from: a */
        final /* synthetic */ C34458d f88892a;

        C34460b(C34458d dVar) {
            this.f88892a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34443a(this.f88892a.mo72473a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d$c */
    static final class C34461c<T> implements C0199s<C34463a> {

        /* renamed from: a */
        final /* synthetic */ C34458d f88893a;

        C34461c(C34458d dVar) {
            this.f88893a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C34463a aVar = (C34463a) obj;
            if (aVar != null) {
                this.f88893a.mo72474e().mo72465a(aVar.mo72477c());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d$d */
    static final class C34462d extends C52712l implements C52670a<MediaChooseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34458d f88894a;

        C34462d(C34458d dVar) {
            this.f88894a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f88894a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return C34482a.m78424a(activity);
        }
    }

    /* renamed from: a */
    private View m78395a(int i) {
        if (this.f88891e == null) {
            this.f88891e = new HashMap();
        }
        View view = (View) this.f88891e.get(Integer.valueOf(R.id.ca3));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.ca3);
            this.f88891e.put(Integer.valueOf(R.id.ca3), view);
        }
        return view;
    }

    /* renamed from: a */
    public final MediaChooseViewModel mo72473a() {
        return (MediaChooseViewModel) this.f88889c.getValue();
    }

    /* renamed from: e */
    public final C34443a mo72474e() {
        return (C34443a) this.f88890d.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f88891e != null) {
            this.f88891e.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo72473a().mo72511f().observe(this, new C34461c(this));
        RecyclerView recyclerView = (RecyclerView) m78395a(R.id.ca3);
        C52711k.m112236a((Object) recyclerView, "recyclerView");
        recyclerView.setAdapter(mo72474e());
        RecyclerView recyclerView2 = (RecyclerView) m78395a(R.id.ca3);
        C52711k.m112236a((Object) recyclerView2, "recyclerView");
        recyclerView2.setLayoutManager(new WrapGridLayoutManager(getActivity(), 4));
        ((RecyclerView) m78395a(R.id.ca3)).mo4798a((C1331h) new C35401g(4, (int) C9432q.m18687b((Context) getActivity(), 1.0f), false));
        C34463a aVar = (C34463a) mo72473a().mo72511f().getValue();
        if (aVar != null) {
            mo72474e().mo72465a(aVar.mo72477c());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bcm, viewGroup, false);
    }
}
