package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem */
public class HotSearchMusicItem extends BaseHotSearchItem {
    @C17952c(mo34828a = "is_new")
    public boolean isNew;
    public String mEditionUid;
    @C17952c(mo34828a = "hot_value")
    public long mHotValue;
    @C17952c(mo34828a = "label")
    public int mLabel;
    @C17952c(mo34828a = "music_info")
    public Music mMusic;
    public boolean playing;
    @C17952c(mo34828a = "rank_diff")
    public int rankDiff;

    public static HotSearchMusicItem createPlaceHolder() {
        return new HotSearchMusicItem();
    }

    public boolean isPlaceholder() {
        if (this.mMusic == null) {
            return true;
        }
        return false;
    }

    public boolean isPastRanking() {
        if (!TextUtils.isEmpty(this.mEditionUid)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotSearchMusicItem{mMusic=");
        sb.append(this.mMusic);
        sb.append(", mLabel=");
        sb.append(this.mLabel);
        sb.append(", mHotValue=");
        sb.append(this.mHotValue);
        sb.append('}');
        return sb.toString();
    }
}
