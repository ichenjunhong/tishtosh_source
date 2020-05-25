package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.SearchAwemeViewHolder_ViewBinding */
public class SearchAwemeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchAwemeViewHolder f64959a;

    public void unbind() {
        SearchAwemeViewHolder searchAwemeViewHolder = this.f64959a;
        if (searchAwemeViewHolder != null) {
            this.f64959a = null;
            searchAwemeViewHolder.mTitleView = null;
            searchAwemeViewHolder.mDescView = null;
            searchAwemeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchAwemeViewHolder_ViewBinding(SearchAwemeViewHolder searchAwemeViewHolder, View view) {
        this.f64959a = searchAwemeViewHolder;
        searchAwemeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        searchAwemeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.a4e, "field 'mDescView'", TextView.class);
        searchAwemeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.b5q, "field 'mJoinCountView'", TextView.class);
        searchAwemeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
