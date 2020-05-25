package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.content.res.Resources;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.p1779vh.BaseForwardViewHolder;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37977h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.a */
public final class C37881a extends C31749e<FollowFeed> {
    /* renamed from: b */
    public final void mo54789b(View view) {
        if (this.f82932D) {
            view.setPadding(0, 0, 0, view.getResources().getDimensionPixelSize(R.dimen.mu));
        }
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        if (view == null) {
            return 0;
        }
        Resources resources = view.getResources();
        if (this.f82932D) {
            return resources.getDimensionPixelSize(R.dimen.ff) + resources.getDimensionPixelSize(R.dimen.mu);
        }
        return resources.getDimensionPixelSize(R.dimen.ff);
    }

    /* renamed from: b */
    public final C31782a mo64634b(ViewGroup viewGroup) {
        C37892j jVar = new C37892j((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i, this.f82932D);
        return jVar;
    }

    /* renamed from: c */
    public final C31782a mo64637c(ViewGroup viewGroup) {
        C37893k kVar = new C37893k((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82938i, this.f82932D);
        return kVar;
    }

    /* renamed from: d */
    public final BaseForwardViewHolder mo64642d(ViewGroup viewGroup) {
        C37894l lVar = new C37894l((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i, this.f82932D);
        return lVar;
    }

    /* renamed from: e */
    public final BaseForwardViewHolder mo64643e(ViewGroup viewGroup) {
        C37895m mVar = new C37895m((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i, this.f82932D);
        return mVar;
    }

    /* renamed from: f */
    public final C1352v mo64646f(ViewGroup viewGroup) {
        C37977h hVar = new C37977h((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f82940k, this.f82934e, this.f82937h, this.f82938i);
        return hVar;
    }

    public C37881a(RecyclerView recyclerView, boolean z) {
        super(recyclerView);
        this.f82932D = z;
        this.f82930B = "trends";
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C1352v a = super.mo48221a(viewGroup, i);
        if (a instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) a).mo65660b(2);
        }
        if (a instanceof C31805p) {
            ((C31805p) a).f83111aP = this;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo64624a(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, this.f82944z)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f82941l.getLayoutManager();
            for (FollowFeed followFeed : this.f70670n) {
                if (followFeed.getAweme() != null && followFeed.getFeedType() == 65280 && TextUtils.equals(followFeed.getAweme().getAid(), aweme.getAid())) {
                    linearLayoutManager.mo4721a(this.f70670n.indexOf(followFeed), 0);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64630a(String str, Aweme aweme, int i) {
        mo51186a(new FollowFeed(aweme), i);
        int d = mo64641d(str);
        m73698a(mo64635b(d));
        C1352v f = this.f82941l.mo4847f(d);
        if (f instanceof C31782a) {
            ((C31782a) f).mo64797o();
            return;
        }
        if (f instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) f).mo65645A();
        }
    }
}
