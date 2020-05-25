package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MusicList */
public final class MusicList implements Serializable {
    @C17952c(mo34828a = "is_selected")
    private Boolean isSelected;
    @C17952c(mo34828a = "more_url")
    private String moreUrl;
    @C17952c(mo34828a = "music")
    private List<? extends Music> music;
    @C17952c(mo34828a = "name")
    private String name;

    public final String getMoreUrl() {
        return this.moreUrl;
    }

    public final List<Music> getMusic() {
        return this.music;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setMoreUrl(String str) {
        this.moreUrl = str;
    }

    public final void setMusic(List<? extends Music> list) {
        this.music = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSelected(Boolean bool) {
        this.isSelected = bool;
    }
}
