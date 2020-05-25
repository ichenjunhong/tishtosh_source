package com.p683ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder_ViewBinding */
public class ChallengeTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeTitleViewHolder f95102a;

    public void unbind() {
        ChallengeTitleViewHolder challengeTitleViewHolder = this.f95102a;
        if (challengeTitleViewHolder != null) {
            this.f95102a = null;
            challengeTitleViewHolder.title = null;
            challengeTitleViewHolder.rootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeTitleViewHolder_ViewBinding(ChallengeTitleViewHolder challengeTitleViewHolder, View view) {
        this.f95102a = challengeTitleViewHolder;
        challengeTitleViewHolder.title = (TextView) Utils.findRequiredViewAsType(view, R.id.s6, "field 'title'", TextView.class);
        challengeTitleViewHolder.rootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.s7, "field 'rootLayout'", LinearLayout.class);
    }
}
