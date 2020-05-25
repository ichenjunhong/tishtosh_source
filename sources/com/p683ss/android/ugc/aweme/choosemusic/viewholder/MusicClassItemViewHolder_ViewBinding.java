package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassItemViewHolder_ViewBinding */
public class MusicClassItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicClassItemViewHolder f66211a;

    public void unbind() {
        MusicClassItemViewHolder musicClassItemViewHolder = this.f66211a;
        if (musicClassItemViewHolder != null) {
            this.f66211a = null;
            musicClassItemViewHolder.mTvClassName = null;
            musicClassItemViewHolder.mIvClassCover = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicClassItemViewHolder_ViewBinding(MusicClassItemViewHolder musicClassItemViewHolder, View view) {
        this.f66211a = musicClassItemViewHolder;
        musicClassItemViewHolder.mTvClassName = (TextView) Utils.findRequiredViewAsType(view, R.id.d80, "field 'mTvClassName'", TextView.class);
        musicClassItemViewHolder.mIvClassCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.az4, "field 'mIvClassCover'", RemoteImageView.class);
    }
}
