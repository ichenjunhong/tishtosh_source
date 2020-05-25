package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchSugViewHolder_ViewBinding */
public class SearchSugViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchSugViewHolder f66262a;

    public void unbind() {
        SearchSugViewHolder searchSugViewHolder = this.f66262a;
        if (searchSugViewHolder != null) {
            this.f66262a = null;
            searchSugViewHolder.mSugView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchSugViewHolder_ViewBinding(SearchSugViewHolder searchSugViewHolder, View view) {
        this.f66262a = searchSugViewHolder;
        searchSugViewHolder.mSugView = (TextView) Utils.findRequiredViewAsType(view, R.id.dgv, "field 'mSugView'", TextView.class);
    }
}
