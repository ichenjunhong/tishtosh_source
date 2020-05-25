package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicTag */
public final class MusicTag implements Serializable {
    @C17952c(mo34828a = "tag_color")
    private String tagColor;
    @C17952c(mo34828a = "tag_title")
    private String tagTitle;
    @C17952c(mo34828a = "tag_title_color")
    private String tagTitleColor;

    public final String getTagColor() {
        return this.tagColor;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTagTitleColor() {
        return this.tagTitleColor;
    }

    public final void setTagColor(String str) {
        this.tagColor = str;
    }

    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    public final void setTagTitleColor(String str) {
        this.tagTitleColor = str;
    }
}
