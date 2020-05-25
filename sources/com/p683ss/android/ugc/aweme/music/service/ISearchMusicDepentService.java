package com.p683ss.android.ugc.aweme.music.service;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.music.model.MusicTag;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService */
public interface ISearchMusicDepentService {
    SpannableString getSugString(Context context, String str, List<Position> list, int i);

    void mobClickMusicCardEvent(String str, MusicModel musicModel, int i, String str2);

    void mobShowMusicCardEvent(String str, MusicModel musicModel, int i);

    void showSearchMusicTags(RecyclerView recyclerView, List<MusicTag> list, OnClickListener onClickListener);
}
