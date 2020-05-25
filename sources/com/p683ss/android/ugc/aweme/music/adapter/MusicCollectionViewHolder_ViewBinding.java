package com.p683ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder_ViewBinding */
public class MusicCollectionViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicCollectionViewHolder f95108a;

    public void unbind() {
        MusicCollectionViewHolder musicCollectionViewHolder = this.f95108a;
        if (musicCollectionViewHolder != null) {
            this.f95108a = null;
            musicCollectionViewHolder.mNameView = null;
            musicCollectionViewHolder.mCoverView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicCollectionViewHolder_ViewBinding(MusicCollectionViewHolder musicCollectionViewHolder, View view) {
        this.f95108a = musicCollectionViewHolder;
        musicCollectionViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.bpp, "field 'mNameView'", TextView.class);
        musicCollectionViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.bo2, "field 'mCoverView'", RemoteImageView.class);
    }
}
