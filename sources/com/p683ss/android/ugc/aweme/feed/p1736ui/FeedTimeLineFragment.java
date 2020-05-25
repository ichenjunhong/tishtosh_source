package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30460m;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30480d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30487j;
import com.p683ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.main.C36603dv;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedTimeLineFragment */
public class FeedTimeLineFragment extends C30750af implements C24579d, C26846a, C30462o, C30464q {

    /* renamed from: a */
    C23600b f80423a;

    /* renamed from: b */
    public View f80424b;

    /* renamed from: c */
    private C30487j f80425c;

    /* renamed from: d */
    private CellFeedFragmentPanel f80426d = new CellFeedFragmentPanel("homepage_fresh", this, this, 2);
    ViewGroup mFlRootContanier;
    FeedSwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    View mVTabBg;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    public final void aU_() {
        ar_();
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        B.append(C23475a.f62543b, this.f80426d);
        return B;
    }

    public final void bD_() {
        this.f80423a.setRefreshing(true);
        mo59855d_(false);
    }

    public final boolean aW_() {
        C30487j jVar = this.f80425c;
        if (jVar.f70700f == null || !((C30480d) jVar.f70700f).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void ar_() {
        this.f80425c.mo44934a_(Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(2));
    }

    /* renamed from: k */
    public final void mo56557k() {
        if (!this.f80425c.mo60913e()) {
            C10691a.m21548c(getContext(), (int) R.string.chm).mo19066a();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f80425c != null) {
            this.f80425c.mo46991S_();
        }
        this.f80426d.mo55813m();
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f80426d.mo62772a(z);
    }

    /* renamed from: f */
    public final void mo63329f(boolean z) {
        super.mo63329f(z);
        this.f80426d.mo62774k();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f80426d.mo55808f(z);
    }

    /* renamed from: e */
    public final void mo63328e(boolean z) {
        if (getUserVisibleHint() && isViewValid()) {
            super.mo63328e(z);
            this.f80426d.mo62773i();
            mo63438g(true);
        }
    }

    /* renamed from: d_ */
    public final boolean mo59855d_(boolean z) {
        if (!isViewValid()) {
            return false;
        }
        if (!C30764ap.m72133a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            this.f80423a.setRefreshing(false);
            return false;
        } else if (this.f80425c.mo54804o()) {
            return false;
        } else {
            this.f80425c.mo60911a(z);
            this.f80425c.mo44934a_(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1));
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f80426d.mo55784a(view, bundle);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19224a((int) R.string.ay6));
        this.mRefreshLayout.mo48779a(false, (int) C9432q.m18687b((Context) getActivity(), 49.0f), (int) C9432q.m18687b((Context) getActivity(), 113.0f));
        this.mRefreshLayout.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                FeedTimeLineFragment.this.mo59855d_(false);
            }
        });
        this.f80426d.mo62771a("timeline_list");
        this.f80424b = getActivity().findViewById(R.id.mb);
        this.f80426d.mo62771a("timeline_list");
        this.f80423a = new C36603dv(this.mRefreshLayout);
        this.f80426d.mo62764a((C1340m) new C30460m());
        this.f80426d.mo62765a((C26846a) this);
        this.f80426d.f79889i = this;
        this.f80425c = new C30487j(this);
        this.f80425c.mo54800a(this.f80426d);
        this.f80425c.mo54799a(new C30480d(20));
        this.f80425c.mo44934a_(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0));
        this.f80579p = -1;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bm2, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        if (aweme != null && getActivity() != null) {
            C31213v.m72896a((C26875a) this.f80425c.mo54803n());
            C41302w a = C41302w.m91042a();
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            a.mo83860a((Activity) activity, C41311y.m91065a(sb.toString()).mo83870a("refer", str).mo83870a("video_from", "from_time_line").mo83871a(), view);
            C30179b.m70792a(aweme);
            C26890h.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, 0)));
        }
    }
}
