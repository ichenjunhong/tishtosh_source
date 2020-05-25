package com.p683ss.android.ugc.aweme.music;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.k */
public final class C37390k implements Serializable {
    @C17952c(mo34828a = "digg_count")
    public int diggCount;
    @C17952c(mo34828a = "music_count")
    public int musicCount;
    @C17952c(mo34828a = "music_cover_url")
    public UrlModel musicCoverUrl;
    @C17952c(mo34828a = "music_qrcode_url")
    public UrlModel musicQrcodeUrl;
    @C17952c(mo34828a = "music_used_count")
    public int musicUseCount;

    public final int getDiggCount() {
        return this.diggCount;
    }

    public final int getMusicCount() {
        return this.musicCount;
    }

    public final UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public final UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public final int getMusicUseCount() {
        return this.musicUseCount;
    }

    public final void setDiggCount(int i) {
        this.diggCount = i;
    }

    public final void setMusicCount(int i) {
        this.musicCount = i;
    }

    public final void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public final void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public final void setMusicUseCount(int i) {
        this.musicUseCount = i;
    }
}
