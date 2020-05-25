package com.p683ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ShowLessViewHolder_ViewBinding */
public class ShowLessViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShowLessViewHolder f95146a;

    public void unbind() {
        ShowLessViewHolder showLessViewHolder = this.f95146a;
        if (showLessViewHolder != null) {
            this.f95146a = null;
            showLessViewHolder.tvShowLess = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShowLessViewHolder_ViewBinding(ShowLessViewHolder showLessViewHolder, View view) {
        this.f95146a = showLessViewHolder;
        showLessViewHolder.tvShowLess = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.dg0, "field 'tvShowLess'", LinearLayout.class);
    }
}
