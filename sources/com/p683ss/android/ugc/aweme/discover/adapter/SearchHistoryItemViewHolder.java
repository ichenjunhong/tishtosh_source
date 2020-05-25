package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder */
public class SearchHistoryItemViewHolder extends C1352v {

    /* renamed from: a */
    public SearchHistory f72960a;

    /* renamed from: b */
    public C28524b f72961b;
    public TextView mContentView;
    View mDeleteView;

    public SearchHistoryItemViewHolder(View view, C28524b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72961b = bVar;
        this.mDeleteView.setOnTouchListener(new C28515aw() {
            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                if (SearchHistoryItemViewHolder.this.f72961b != null) {
                    SearchHistoryItemViewHolder.this.f72961b.mo58189b(SearchHistoryItemViewHolder.this.f72960a, SearchHistoryItemViewHolder.this.getAdapterPosition());
                }
            }
        });
        this.mContentView.setMaxLines(2);
    }
}
