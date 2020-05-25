package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26906b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27826at;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener$$CC;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchObserver;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchStateListener;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28604by;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.q */
public final class C28141q extends C28604by<SearchMusic> {

    /* renamed from: a */
    private MusicPlayHelper f73908a;

    /* renamed from: c */
    private HashMap f73909c;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.q$a */
    public static final class C28142a implements C26906b {

        /* renamed from: a */
        final /* synthetic */ C28141q f73910a;

        C28142a(C28141q qVar) {
            this.f73910a = qVar;
        }

        /* renamed from: a */
        public final Object mo54858a(int i) {
            List a = this.f73910a.mo58250x().mo50673a();
            if (a == null || i < 0 || i >= a.size()) {
                return null;
            }
            return (SearchMusic) a.get(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.g.q$b */
    static final class C28143b implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C28141q f73911a;

        C28143b(C28141q qVar) {
            this.f73911a = qVar;
        }

        public final void onPageHidden() {
            SearchStateViewModel$SearchStateListener$$CC.onPageHidden(this);
        }

        public final void onPageResume() {
            SearchStateViewModel$SearchStateListener$$CC.onPageResume(this);
        }

        public final void onContentVisible(boolean z) {
            if (!z) {
                this.f73911a.mo56564h();
            }
        }
    }

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f73909c == null) {
            this.f73909c = new HashMap();
        }
        View view = (View) this.f73909c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73909c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return true;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f73909c != null) {
            this.f73909c.clear();
        }
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "music";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo56548j();
    }

    public final void onPause() {
        super.onPause();
        mo56564h();
    }

    /* renamed from: h */
    public final void mo56564h() {
        if (this.f73908a != null) {
            MusicPlayHelper musicPlayHelper = this.f73908a;
            if (musicPlayHelper == null) {
                C52711k.m112234a();
            }
            musicPlayHelper.mo56585a();
        }
    }

    public final void aJ_() {
        super.aJ_();
        C26890h.m65011a("music_search_feedback_show", C23089d.m56640a().mo47829a("enter_from", "music_search_result").f61491a);
    }

    /* renamed from: n */
    public final void mo56550n() {
        mo58298a((C28128i<?>) new C28147s<Object>());
        C28128i J = mo58297J();
        if (J != null) {
            ((C28147s) J).mo54799a(new C28144r());
            mo58297J().mo54800a((C26877c) this);
            mo58297J().f73866b = this;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMusicPresenter");
    }

    /* renamed from: o */
    public final void mo56551o() {
        mo58239a((C26840g<D>) new C27826at<D>(this.f73908a, new C27797ad(false), this.f74960l, this));
        C26904c.m65029a(mo58245s(), new C28142a(this));
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo56564h();
        }
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
        C26840g x = mo58250x();
        if (x != null) {
            ((C27826at) x).f73083f = str;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f73908a = (MusicPlayHelper) C0214z.m440a(activity).mo359a(MusicPlayHelper.class);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        C0209x a = C0214z.m440a(activity2).mo359a(SearchStateViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a;
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new C28143b(this));
        searchStateViewModel.searchState.observe(this, searchObserver);
        super.onViewCreated(view, bundle);
    }
}
