package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24835d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter */
public final class MusicSheetAdapter extends C26840g<MusicCollectionItem> {

    /* renamed from: a */
    public C24835d f65678a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter$MusicSheetViewHolder */
    class MusicSheetViewHolder extends C1352v {

        /* renamed from: a */
        MusicCollectionItem f65679a;
        RemoteImageView mMusicSheetCover;
        TextView mMusicSheetName;

        MusicSheetViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.itemView.setOnClickListener(new C24830l(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter$MusicSheetViewHolder_ViewBinding */
    public class MusicSheetViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MusicSheetViewHolder f65681a;

        public void unbind() {
            MusicSheetViewHolder musicSheetViewHolder = this.f65681a;
            if (musicSheetViewHolder != null) {
                this.f65681a = null;
                musicSheetViewHolder.mMusicSheetCover = null;
                musicSheetViewHolder.mMusicSheetName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MusicSheetViewHolder_ViewBinding(MusicSheetViewHolder musicSheetViewHolder, View view) {
            this.f65681a = musicSheetViewHolder;
            musicSheetViewHolder.mMusicSheetCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.bon, "field 'mMusicSheetCover'", RemoteImageView.class);
            musicSheetViewHolder.mMusicSheetName = (TextView) Utils.findRequiredViewAsType(view, R.id.boo, "field 'mMusicSheetName'", TextView.class);
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new MusicSheetViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xg, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        MusicCollectionItem musicCollectionItem;
        MusicSheetViewHolder musicSheetViewHolder = (MusicSheetViewHolder) vVar;
        if (C9376b.m18558a((Collection<T>) this.f70670n) || i < 0 || i >= this.f70670n.size()) {
            musicCollectionItem = null;
        } else {
            musicCollectionItem = (MusicCollectionItem) this.f70670n.get(i);
        }
        if (musicCollectionItem != null) {
            musicSheetViewHolder.f65679a = musicCollectionItem;
            C23515d.m57669a(musicSheetViewHolder.mMusicSheetCover, musicCollectionItem.cover);
            musicSheetViewHolder.mMusicSheetName.setText(musicCollectionItem.mcName);
        }
    }
}
