package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder_ViewBinding */
public class SearchHistoryLastItemHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchHistoryLastItemHolder f72973a;

    public void unbind() {
        SearchHistoryLastItemHolder searchHistoryLastItemHolder = this.f72973a;
        if (searchHistoryLastItemHolder != null) {
            this.f72973a = null;
            searchHistoryLastItemHolder.mTipView = null;
            searchHistoryLastItemHolder.mLineView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchHistoryLastItemHolder_ViewBinding(SearchHistoryLastItemHolder searchHistoryLastItemHolder, View view) {
        this.f72973a = searchHistoryLastItemHolder;
        searchHistoryLastItemHolder.mTipView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dfh, "field 'mTipView'", DmtTextView.class);
        searchHistoryLastItemHolder.mLineView = Utils.findRequiredView(view, R.id.dr2, "field 'mLineView'");
    }
}
