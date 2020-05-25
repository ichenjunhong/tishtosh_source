package com.p683ss.android.ugc.aweme.similarvideo.p2270ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.p1103ad.splash.p1123g.C18742h;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.widget.ZeusFrameLayout;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30460m;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.similarvideo.p2269b.C45645a;
import com.p683ss.android.ugc.aweme.similarvideo.p2269b.C45647b;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment */
public class SimilarVideoFragment extends C23526a implements C24579d, C26846a, C26877c<Aweme>, C30462o, C30464q {

    /* renamed from: a */
    static String f115440a;

    /* renamed from: b */
    public C45654a f115441b;

    /* renamed from: c */
    protected CellFeedFragmentPanel f115442c;

    /* renamed from: d */
    protected C23751c<Aweme> f115443d;

    /* renamed from: e */
    protected C45647b f115444e;
    ZeusFrameLayout mLayout;
    protected RecyclerView mRecyclerView;
    protected SwipeRefreshLayout mRefreshLayout;
    protected DmtStatusView mStatusView;

    /* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment$a */
    public interface C45654a {
        /* renamed from: a */
        void mo92041a();
    }

    /* renamed from: l */
    private static String m99398l() {
        return "similar_videos";
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        m99400n();
    }

    public final void aS_() {
        m99400n();
    }

    public final void aU_() {
        ar_();
    }

    /* renamed from: k */
    public final void mo56557k() {
    }

    /* renamed from: p */
    private void m99402p() {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                if (SimilarVideoFragment.this.isViewValid() && SimilarVideoFragment.this.mRefreshLayout != null) {
                    SimilarVideoFragment.this.mRefreshLayout.setRefreshing(false);
                }
            }
        }, 500);
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        B.append(C23475a.f62543b, this.f115442c);
        return B;
    }

    public final void aJ_() {
        if (isViewValid()) {
            m99401o();
        }
    }

    public final boolean aW_() {
        return ((C26875a) this.f115444e.mo54803n()).isHasMore();
    }

    public final void ar_() {
        if (isViewValid()) {
            m99399m();
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f115443d.am_();
        }
    }

    public SimilarVideoFragment() {
        if (this.f115442c == null) {
            this.f115442c = new CellFeedFragmentPanel(m99398l(), this, this, 16);
        }
        this.f115442c = this.f115442c;
    }

    /* renamed from: m */
    private void m99399m() {
        this.f115444e.mo44934a_(Integer.valueOf(4), f115440a);
    }

    /* renamed from: n */
    private void m99400n() {
        if (this.mRecyclerView.getChildCount() > 0) {
            this.mRefreshLayout.setRefreshing(true);
        } else {
            this.mStatusView.mo19212f();
        }
    }

    /* renamed from: o */
    private void m99401o() {
        m99402p();
        if (this.f115443d.f70699x) {
            this.f115443d.mo54798c(false);
            this.f115443d.notifyDataSetChanged();
        }
        this.f115443d.mo50303a(null);
        this.mStatusView.mo19213g();
    }

    /* renamed from: j */
    public final void mo92042j() {
        if (!C18742h.m45697b(getActivity())) {
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (SimilarVideoFragment.this.isViewValid()) {
                        SimilarVideoFragment.this.mStatusView.mo19214h();
                        C10691a.m21542b((Context) SimilarVideoFragment.this.getActivity(), (int) R.string.cg1).mo19066a();
                    }
                }
            }, 100);
        } else if (this.f115444e != null) {
            m99396a(f115440a);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f115444e != null) {
            this.f115444e.mo46991S_();
        }
        this.f115442c.mo55813m();
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        m99397d(exc);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f115442c.mo62772a(z);
    }

    /* renamed from: d */
    private void m99397d(Exception exc) {
        C22971a.m56493a(getContext(), (Throwable) exc);
        m99401o();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            m99397d(exc);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            m99402p();
            this.f115443d.co_();
        }
    }

    /* renamed from: a */
    private void m99396a(String str) {
        this.f115444e.mo44934a_(Integer.valueOf(1), str);
    }

    /* renamed from: b */
    public final void mo47026b(List<Aweme> list, boolean z) {
        this.f115442c.mo47026b(list, z);
    }

    /* renamed from: c */
    public final void mo47029c(List<Aweme> list, boolean z) {
        this.f115442c.mo47026b(list, z);
    }

    /* renamed from: a */
    public final void mo47018a(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            this.f115442c.mo47018a(list, z);
            this.mStatusView.mo19209d();
            if (this.f115441b != null) {
                this.f115441b.mo92041a();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f115442c.mo55808f(getUserVisibleHint());
        C10722c cVar = new C10723a(getContext()).mo19277a((int) R.drawable.b0t).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a;
        DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(getContext());
        dmtLoadingLayout.setLayoutParams(new LayoutParams(-1, -1));
        dmtLoadingLayout.setUseScreenHeight((int) C9432q.m18687b((Context) getActivity(), 494.0f));
        this.mStatusView.setBuilder(new C10719a(getContext()).mo19228a((View) dmtLoadingLayout).mo19229a(cVar).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SimilarVideoFragment.this.mo92042j();
            }
        }));
        this.mRecyclerView.setLayoutManager(new WrapGridLayoutManager(getContext(), 2, 1, false));
        this.f115442c.mo55784a(view, bundle);
        this.f115443d = this.f115442c.mo62769d();
        this.f115443d.f70682s = getResources().getColor(R.color.a1a);
        this.f115442c.f79893m = 16;
        this.f115442c.mo62764a((C1340m) new C30460m());
        this.f115442c.mo62765a((C26846a) this);
        this.f115442c.f79889i = this;
        this.mRefreshLayout.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                SimilarVideoFragment.this.mo92042j();
            }
        });
        this.f115444e = new C45647b();
        this.f115444e.mo54800a(this);
        this.f115444e.mo54838a((C26878d) this.f115442c);
        this.f115444e.mo54799a(new C45645a());
        if (isViewValid() && getUserVisibleHint()) {
            mo92042j();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.q3, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        if (!(C32800a.m75679a(view) || aweme == null || getActivity() == null)) {
            C31213v.m72896a((C26875a) this.f115444e.mo54803n());
            C41302w a = C41302w.m91042a();
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            a.mo83860a((Activity) activity, C41311y.m91065a(sb.toString()).mo83870a("refer", str).mo83870a("video_from", "from_search_similar_aweme").mo83868a("profile_enterprise_type", aweme.getEnterpriseType()).mo83868a("page_type", 16).mo83871a(), view);
            C30179b.m70792a(aweme);
            C28393ak.m67387a(view, m99398l(), aweme);
        }
    }
}
