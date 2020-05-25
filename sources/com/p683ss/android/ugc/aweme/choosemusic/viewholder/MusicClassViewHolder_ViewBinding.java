package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder_ViewBinding */
public class MusicClassViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicClassViewHolder f66220a;

    public void unbind() {
        MusicClassViewHolder musicClassViewHolder = this.f66220a;
        if (musicClassViewHolder != null) {
            this.f66220a = null;
            musicClassViewHolder.mTvTitleRight = null;
            musicClassViewHolder.mTvTitleLeft = null;
            musicClassViewHolder.mRvClassContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicClassViewHolder_ViewBinding(MusicClassViewHolder musicClassViewHolder, View view) {
        this.f66220a = musicClassViewHolder;
        musicClassViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, R.id.dhi, "field 'mTvTitleRight'", TextView.class);
        musicClassViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, R.id.dhg, "field 'mTvTitleLeft'", TextView.class);
        musicClassViewHolder.mRvClassContainer = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cfw, "field 'mRvClassContainer'", RecyclerView.class);
    }
}
