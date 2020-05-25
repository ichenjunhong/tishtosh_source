package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import butterknife.Unbinder;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CoverViewHolder_ViewBinding */
public class CoverViewHolder_ViewBinding implements Unbinder {
    public void unbind() {
    }

    public CoverViewHolder_ViewBinding(CoverViewHolder coverViewHolder, View view) {
        this(coverViewHolder, view.getContext());
    }

    private CoverViewHolder_ViewBinding(CoverViewHolder coverViewHolder, Context context) {
        Resources resources = context.getResources();
        coverViewHolder.mWidth = resources.getDimensionPixelSize(R.dimen.z2);
        coverViewHolder.mHeight = resources.getDimensionPixelSize(R.dimen.z1);
    }
}
