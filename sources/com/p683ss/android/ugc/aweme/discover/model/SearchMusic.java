package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusic */
public class SearchMusic implements Serializable {
    @C17952c(mo34828a = "card_type")
    private int cardType = 1;
    private boolean hasMobShow;
    @C17952c(mo34828a = "has_more")
    private boolean hasMore;
    @C17952c(mo34828a = "music")
    private Music music;
    @C17952c(mo34828a = "musics")
    private List<? extends Music> musicList;

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMobShow() {
        return this.hasMobShow;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public int hashCode() {
        Music music2 = this.music;
        if (music2 != null) {
            return music2.hashCode();
        }
        return 0;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMobShow(boolean z) {
        this.hasMobShow = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMusic(Music music2) {
        this.music = music2;
    }

    public final void setMusicList(List<? extends Music> list) {
        this.musicList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SearchMusic) && !(!C52711k.m112239a((Object) this.music, (Object) ((SearchMusic) obj).music))) {
            return true;
        }
        return false;
    }

    public final void setRequestId(String str) {
        Music music2 = this.music;
        if (music2 != null) {
            music2.setRequestId(str);
        }
        List<? extends Music> list = this.musicList;
        if (list != null) {
            for (Music requestId : list) {
                requestId.setRequestId(str);
            }
        }
    }
}
