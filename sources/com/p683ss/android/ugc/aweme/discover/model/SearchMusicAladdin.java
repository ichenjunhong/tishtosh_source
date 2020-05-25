package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusicAladdin */
public final class SearchMusicAladdin implements Serializable {
    @C17952c(mo34828a = "doc_id")
    private String docId;
    @C17952c(mo34828a = "music_list")
    private List<MusicList> musicList;
    @C17952c(mo34828a = "title")
    private String title;

    public final String getDocId() {
        return this.docId;
    }

    public final List<MusicList> getMusicList() {
        return this.musicList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setMusicList(List<MusicList> list) {
        this.musicList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
