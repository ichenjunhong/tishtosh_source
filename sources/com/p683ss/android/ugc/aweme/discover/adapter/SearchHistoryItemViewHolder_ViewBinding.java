package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder_ViewBinding */
public class SearchHistoryItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchHistoryItemViewHolder f72966a;

    public void unbind() {
        SearchHistoryItemViewHolder searchHistoryItemViewHolder = this.f72966a;
        if (searchHistoryItemViewHolder != null) {
            this.f72966a = null;
            searchHistoryItemViewHolder.mDeleteView = null;
            searchHistoryItemViewHolder.mContentView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchHistoryItemViewHolder_ViewBinding(SearchHistoryItemViewHolder searchHistoryItemViewHolder, View view) {
        this.f72966a = searchHistoryItemViewHolder;
        searchHistoryItemViewHolder.mDeleteView = Utils.findRequiredView(view, R.id.azu, "field 'mDeleteView'");
        searchHistoryItemViewHolder.mContentView = (TextView) Utils.findRequiredViewAsType(view, R.id.d8j, "field 'mContentView'", TextView.class);
    }
}
