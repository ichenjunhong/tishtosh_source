package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSugViewHolder_ViewBinding */
public class SearchSugViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchSugViewHolder f72988a;

    public void unbind() {
        SearchSugViewHolder searchSugViewHolder = this.f72988a;
        if (searchSugViewHolder != null) {
            this.f72988a = null;
            searchSugViewHolder.mSugView = null;
            searchSugViewHolder.mIvSugCompletion = null;
            searchSugViewHolder.mIvSearchIcon = null;
            searchSugViewHolder.mBottomDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchSugViewHolder_ViewBinding(SearchSugViewHolder searchSugViewHolder, View view) {
        this.f72988a = searchSugViewHolder;
        searchSugViewHolder.mSugView = (TextView) Utils.findRequiredViewAsType(view, R.id.dgv, "field 'mSugView'", TextView.class);
        searchSugViewHolder.mIvSugCompletion = (SugCompletionView) Utils.findRequiredViewAsType(view, R.id.eg1, "field 'mIvSugCompletion'", SugCompletionView.class);
        searchSugViewHolder.mIvSearchIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.efr, "field 'mIvSearchIcon'", ImageView.class);
        searchSugViewHolder.mBottomDivider = Utils.findRequiredView(view, R.id.lu, "field 'mBottomDivider'");
    }
}
