package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f.C28079b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder */
public class SearchHistoryLastItemHolder extends C1352v {

    /* renamed from: a */
    public long f72967a;

    /* renamed from: b */
    public boolean f72968b;

    /* renamed from: c */
    public C28524b f72969c;

    /* renamed from: d */
    public C28079b f72970d;
    public View mLineView;
    public DmtTextView mTipView;

    public SearchHistoryLastItemHolder(View view, C28524b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72969c = bVar;
        view.setOnTouchListener(new C28515aw() {
            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                if (System.currentTimeMillis() - SearchHistoryLastItemHolder.this.f72967a >= 500) {
                    SearchHistoryLastItemHolder.this.f72967a = System.currentTimeMillis();
                    if (SearchHistoryLastItemHolder.this.f72969c != null) {
                        if (SearchHistoryLastItemHolder.this.f72970d == C28079b.TYPE_SHOW_MORE) {
                            SearchHistoryLastItemHolder.this.f72969c.mo58190d();
                            return;
                        }
                        if (SearchHistoryLastItemHolder.this.f72970d == C28079b.TYPE_CLEAR_ALL) {
                            SearchHistoryLastItemHolder.this.f72969c.mo58191e();
                        }
                    }
                }
            }
        });
    }
}
