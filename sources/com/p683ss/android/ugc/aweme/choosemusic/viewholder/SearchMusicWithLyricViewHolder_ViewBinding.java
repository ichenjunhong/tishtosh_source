package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder_ViewBinding */
public class SearchMusicWithLyricViewHolder_ViewBinding extends MusicItemViewHolder_ViewBinding {

    /* renamed from: a */
    private SearchMusicWithLyricViewHolder f66258a;

    public void unbind() {
        SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder = this.f66258a;
        if (searchMusicWithLyricViewHolder != null) {
            this.f66258a = null;
            searchMusicWithLyricViewHolder.mTvLyric = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchMusicWithLyricViewHolder_ViewBinding(SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder, View view) {
        super(searchMusicWithLyricViewHolder, view);
        this.f66258a = searchMusicWithLyricViewHolder;
        searchMusicWithLyricViewHolder.mTvLyric = (TextView) Utils.findRequiredViewAsType(view, R.id.f38, "field 'mTvLyric'", TextView.class);
    }
}
