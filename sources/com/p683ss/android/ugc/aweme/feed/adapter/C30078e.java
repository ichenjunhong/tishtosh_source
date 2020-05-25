package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.p2100q.p2101a.C40909a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.e */
public final class C30078e extends C26837d implements C31756c {

    /* renamed from: e */
    private String f78519e;

    /* renamed from: f */
    private C24579d f78520f;

    /* renamed from: g */
    private CellFeedFragmentPanel f78521g;

    /* renamed from: h */
    private C26872d f78522h;

    /* renamed from: i */
    private int f78523i;

    /* renamed from: j */
    private int f78524j;

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

    /* renamed from: d */
    public final void mo54784d(List<Aweme> list) {
        super.mo54784d(list);
        if (this.f78521g != null) {
            this.f78521g.f79890j = false;
        }
    }

    /* renamed from: a */
    public final void mo54788a(C26846a aVar) {
        super.mo54788a(aVar);
        if (this.f78521g != null) {
            this.f78521g.f79890j = false;
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar.mItemViewType == 0 && this.f78521g != null && this.f78521g.mo62963bx() && this.f78522h != null) {
            this.f78522h.mo50455a(vVar);
        }
    }

    /* renamed from: a */
    public final void mo50303a(List<Aweme> list) {
        super.mo50303a(list);
        if (this.f78521g != null) {
            this.f78521g.f79890j = false;
        }
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        if (this.f78524j == 7) {
            if (this.f78523i == 1) {
                return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm7, viewGroup, false), this.f78519e, this.f78520f);
            }
            return new LocationCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm4, viewGroup, false), this.f78519e, this.f78520f);
        } else if (this.f78524j == 12) {
            return new C40909a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm3, viewGroup, false), this.f78519e, this.f78520f);
        } else {
            if (this.f78523i == 2) {
                return new RecommendCellCViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm6, viewGroup, false), this.f78519e, this.f78520f);
            }
            if (this.f78523i == 3) {
                return new PoiDetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm5, viewGroup, false), this.f78519e, this.f78520f);
            }
            return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bm7, viewGroup, false), this.f78519e, this.f78520f);
        }
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        boolean z = false;
        if (this.f78524j == 7) {
            if (this.f78523i == 1) {
                TimeLineViewHolder timeLineViewHolder = (TimeLineViewHolder) vVar;
                Aweme aweme = (Aweme) this.f70670n.get(i);
                if (this.f78521g == null || this.f78521g.mo62963bx()) {
                    z = true;
                }
                timeLineViewHolder.mo60176a(aweme, i, z);
            } else if (this.f78523i == 2) {
                LocationCellBViewHolder locationCellBViewHolder = (LocationCellBViewHolder) vVar;
                Aweme aweme2 = (Aweme) this.f70670n.get(i);
                if (this.f78521g == null || this.f78521g.mo62963bx()) {
                    z = true;
                }
                locationCellBViewHolder.mo60172a(aweme2, i, z);
            }
        } else if (this.f78524j == 12) {
            C40909a aVar = (C40909a) vVar;
            Aweme aweme3 = (Aweme) this.f70670n.get(i);
            if (this.f78521g == null || this.f78521g.mo62963bx()) {
                z = true;
            }
            aVar.mo83393a(aweme3, i, z);
        } else if (this.f78523i == 2) {
            RecommendCellCViewHolder recommendCellCViewHolder = (RecommendCellCViewHolder) vVar;
            Aweme aweme4 = (Aweme) this.f70670n.get(i);
            if (this.f78521g == null || this.f78521g.mo62963bx()) {
                z = true;
            }
            recommendCellCViewHolder.mo60175a(aweme4, i, z);
        } else if (this.f78523i == 0) {
            TimeLineViewHolder timeLineViewHolder2 = (TimeLineViewHolder) vVar;
            Aweme aweme5 = (Aweme) this.f70670n.get(i);
            if (this.f78521g == null || this.f78521g.mo62963bx()) {
                z = true;
            }
            timeLineViewHolder2.mo60176a(aweme5, i, z);
        } else if (this.f78523i == 3) {
            PoiDetailViewHolder poiDetailViewHolder = (PoiDetailViewHolder) vVar;
            Aweme aweme6 = (Aweme) this.f70670n.get(i);
            if (this.f78521g == null || this.f78521g.mo62963bx()) {
                z = true;
            }
            poiDetailViewHolder.mo60173a(aweme6, i, z);
        }
        C23794bh.m58403q();
    }

    public C30078e(CellFeedFragmentPanel cellFeedFragmentPanel, String str, C24579d dVar, C26872d<C30009a> dVar2, int i, int i2) {
        this.f78519e = str;
        this.f78520f = dVar;
        this.f78521g = cellFeedFragmentPanel;
        this.f78522h = dVar2;
        this.f78523i = i;
        this.f78524j = i2;
    }
}
