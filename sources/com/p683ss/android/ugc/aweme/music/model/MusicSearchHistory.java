package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicSearchHistory */
public class MusicSearchHistory {
    @C17952c(mo34828a = "keyword")
    public String keyword;
    @C17952c(mo34828a = "int")
    public int type;

    public MusicSearchHistory() {
    }

    public int hashCode() {
        if (this.keyword != null) {
            return this.keyword.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) obj;
        if (this.keyword != null) {
            return this.keyword.equals(musicSearchHistory.keyword);
        }
        if (musicSearchHistory.keyword == null) {
            return true;
        }
        return false;
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
