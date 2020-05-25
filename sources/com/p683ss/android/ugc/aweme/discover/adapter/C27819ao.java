package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.discover.helper.C28207o;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28365g;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28365g.C28368a;
import com.p683ss.android.ugc.aweme.discover.panel.C28428b;
import com.p683ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ao */
public final class C27819ao extends C26837d implements C31756c {

    /* renamed from: e */
    public C28301a f73085e;

    /* renamed from: f */
    public boolean f73086f;

    /* renamed from: g */
    private String f73087g;

    /* renamed from: h */
    private C24579d f73088h;

    /* renamed from: i */
    private C28428b f73089i;

    /* renamed from: j */
    private C26872d f73090j;

    /* renamed from: k */
    private int f73091k;

    /* renamed from: l */
    private int f73092l;

    public final void ba_() {
    }

    public final void bb_() {
    }

    /* renamed from: k */
    public final void mo56247k() {
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9432q.m18687b(view.getContext(), 95.0f);
    }

    /* renamed from: b */
    public final void mo54789b(View view) {
        view.setPadding(0, 0, 0, (int) C9432q.m18687b(view.getContext(), 40.5f));
    }

    /* renamed from: a */
    public final void mo50303a(List<Aweme> list) {
        super.mo50303a(list);
        if (this.f73085e != null) {
            this.f73085e.f74226d = true;
            this.f73085e.mo56693a(true);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (this.f73085e != null && (vVar instanceof SearchRecommendCellBViewHolder)) {
            C28365g gVar = ((SearchRecommendCellBViewHolder) vVar).f75732f;
            this.f73085e.mo56696c(gVar);
            gVar.mo64972m();
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar.mItemViewType == 0 && this.f73089i != null && this.f73089i.mo62963bx() && this.f73090j != null) {
            this.f73090j.mo50455a(vVar);
        }
        if (vVar instanceof SearchRecommendCellBViewHolder) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = (SearchRecommendCellBViewHolder) vVar;
            searchRecommendCellBViewHolder.mo58504o();
            if (this.f73085e != null) {
                this.f73085e.mo56692a((C31854k) searchRecommendCellBViewHolder.f75732f);
            }
        }
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        if (this.f73092l == 9) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = new SearchRecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bst, viewGroup, false), this.f73087g, this.f73088h, true);
            searchRecommendCellBViewHolder.f75731e = "6frames";
            searchRecommendCellBViewHolder.f75730d = false;
            searchRecommendCellBViewHolder.mo58497a((C28368a) new C27820ap(this, searchRecommendCellBViewHolder));
            return searchRecommendCellBViewHolder;
        } else if (this.f73091k == 1) {
            return new SearchRecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsa, viewGroup, false), this.f73087g, this.f73088h);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        boolean z = false;
        if (this.f73092l == 9) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = (SearchRecommendCellBViewHolder) vVar;
            Aweme aweme = (Aweme) this.f70670n.get(i);
            if (this.f73089i == null || this.f73089i.mo62963bx()) {
                z = true;
            }
            searchRecommendCellBViewHolder.mo58499a(aweme, i, z);
        } else if (this.f73091k == 1) {
            SearchRecommendCellBViewHolder searchRecommendCellBViewHolder2 = (SearchRecommendCellBViewHolder) vVar;
            Aweme aweme2 = (Aweme) this.f70670n.get(i);
            if (this.f73089i == null || this.f73089i.mo62963bx()) {
                z = true;
            }
            searchRecommendCellBViewHolder2.mo58499a(aweme2, i, z);
        }
        C23794bh.m58403q();
    }

    public C27819ao(C28428b bVar, String str, C24579d dVar, C26872d<C30009a> dVar2, int i, int i2) {
        this.f73087g = str;
        this.f73088h = dVar;
        this.f73089i = bVar;
        this.f73090j = dVar2;
        this.f73091k = i;
        this.f73092l = i2;
        if (this.f73092l == 9) {
            this.f73086f = true;
            this.f73085e = C28207o.m67120a(bVar.mListView);
        }
    }
}
