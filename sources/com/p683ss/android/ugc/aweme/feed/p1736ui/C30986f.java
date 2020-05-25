package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23597c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30446c;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C31237a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p683ss.android.ugc.aweme.main.C36603dv;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47450c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.f */
public abstract class C30986f<T extends C26876b> extends C30750af implements C30019aj, C30445b, C30446c, C30778av, C31237a {

    /* renamed from: b */
    protected View f81142b;

    /* renamed from: c */
    protected FeedSwipeRefreshLayout f81143c;

    /* renamed from: d */
    protected C23597c f81144d;

    /* renamed from: e */
    DmtStatusView f81145e;

    /* renamed from: e_ */
    protected LoadMoreFrameLayout f81146e_;

    /* renamed from: j */
    protected T f81147j;

    /* renamed from: k */
    protected C23600b f81148k;

    /* renamed from: l */
    private boolean f81149l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DmtStatusView mo63446a(Context context);

    /* renamed from: c */
    public void mo63448c(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract T mo63452j();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo63453l();

    /* renamed from: n */
    public void mo63455n() {
    }

    /* renamed from: g */
    public boolean mo55941g() {
        if (!mo63454m()) {
            return false;
        }
        return mo63453l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo63454m() {
        if (!this.f81147j.mo54804o()) {
            return true;
        }
        return false;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f81147j != null) {
            this.f81147j.mo46991S_();
        }
    }

    /* renamed from: a */
    public final boolean mo55934a(Aweme aweme) {
        return this.f81147j.mo54839a((Object) aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63765a(C10719a aVar) {
        if (this.f81143c != null) {
            this.f81143c.mo48779a(false, (int) C9432q.m18687b((Context) getActivity(), 49.0f), (int) C9432q.m18687b((Context) getActivity(), 113.0f));
            this.f81148k = new C36603dv(this.f81143c);
        }
    }

    /* renamed from: a */
    public final boolean mo55935a(String str) {
        boolean a = this.f81147j.mo54839a((Object) C23324d.m57378a().getAwemeById(str));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" deleteItem :");
        sb.append(a);
        C32458a.m75141a(4, "BaseFeedListFragment", sb.toString());
        return a;
    }

    /* renamed from: b */
    public final DmtStatusView mo63766b(boolean z) {
        boolean z2;
        if (this.f81145e == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && this.f81149l && getContext() != null) {
            this.f81145e = mo63446a(getContext());
            this.f81145e.setBackgroundColor(getContext().getResources().getColor(R.color.ji));
            this.f81146e_.addView(this.f81145e, new LayoutParams(-1, -1));
        }
        return this.f81145e;
    }

    /* renamed from: d_ */
    public boolean mo59855d_(boolean z) {
        if (!isViewValid()) {
            return false;
        }
        if (!(getActivity() == null || getActivity().getWindow() == null)) {
            View decorView = getActivity().getWindow().getDecorView();
            getActivity();
            decorView.setBackgroundColor(-1);
        }
        if (!C31008g.m72597a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            this.f81148k.setRefreshing(false);
            C47718bf.m103288a(new C30319aj());
            return false;
        } else if (!this.f81147j.mo54804o()) {
            return true;
        } else {
            return false;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f81149l = true;
        this.f81146e_ = (LoadMoreFrameLayout) view.findViewById(R.id.bhz);
        this.f81146e_.setOnLoadMoreUiListener(this);
        this.f81142b = view.findViewById(R.id.aem);
        this.f81143c = (FeedSwipeRefreshLayout) view.findViewById(R.id.caw);
        if (this.f81144d != null) {
            this.f81143c.setOnSwipeChangeListener(this.f81144d);
        }
        mo63765a((C10719a) null);
        this.f81143c.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                C30986f.this.mo59855d_(false);
                C47718bf.m103288a(new C47450c(0));
            }
        });
        this.f81147j = mo63452j();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((X2CFragmentFeed) C35857a.m81002b(X2CFragmentFeed.class)).getView(getContext(), R.layout.b5q);
    }
}
