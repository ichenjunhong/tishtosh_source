package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27821aq;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28604by;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.j */
public final class C28129j extends C28604by<SearchChallenge> implements C26877c<SearchChallenge> {

    /* renamed from: a */
    private HashMap f73867a;

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f73867a == null) {
            this.f73867a = new HashMap();
        }
        View view = (View) this.f73867a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73867a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return true;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f73867a != null) {
            this.f73867a.clear();
        }
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "tag";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo56548j();
    }

    /* renamed from: o */
    public final void mo56551o() {
        mo58239a((C26840g<D>) new C27821aq<D>(new C27797ad(false), this.f74960l, this));
    }

    /* renamed from: n */
    public final void mo56550n() {
        mo58298a((C28128i<?>) new C28133l<Object>());
        C28128i J = mo58297J();
        if (J != null) {
            ((C28133l) J).mo54799a(new C28130k());
            mo58297J().mo54800a((C26877c) this);
            mo58297J().f73866b = this;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchChallengePresenter");
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
        if (mo58250x() != null) {
            C26840g x = mo58250x();
            if (x != null) {
                ((C27821aq) x).f73083f = str;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter");
        }
    }
}
