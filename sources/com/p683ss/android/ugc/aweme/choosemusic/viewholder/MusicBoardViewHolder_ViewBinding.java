package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder_ViewBinding */
public class MusicBoardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicBoardViewHolder f66207a;

    public void unbind() {
        MusicBoardViewHolder musicBoardViewHolder = this.f66207a;
        if (musicBoardViewHolder != null) {
            this.f66207a = null;
            musicBoardViewHolder.mTvTitleRight = null;
            musicBoardViewHolder.mTvTitleLeft = null;
            musicBoardViewHolder.mVpMusicContainer = null;
            musicBoardViewHolder.mVwLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicBoardViewHolder_ViewBinding(MusicBoardViewHolder musicBoardViewHolder, View view) {
        this.f66207a = musicBoardViewHolder;
        musicBoardViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, R.id.dhi, "field 'mTvTitleRight'", TextView.class);
        musicBoardViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, R.id.dhg, "field 'mTvTitleLeft'", TextView.class);
        musicBoardViewHolder.mVpMusicContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.dsr, "field 'mVpMusicContainer'", ViewPager.class);
        musicBoardViewHolder.mVwLine = Utils.findRequiredView(view, R.id.a6f, "field 'mVwLine'");
    }
}
