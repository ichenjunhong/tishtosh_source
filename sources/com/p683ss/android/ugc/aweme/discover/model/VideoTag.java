package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.VideoTag */
public final class VideoTag implements Serializable {
    @C17952c(mo34828a = "background_color")
    private String backgroundColor;
    @C17952c(mo34828a = "font_color")
    private String fontColor;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private int f74689id;
    @C17952c(mo34828a = "title")
    private String title;

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final int getId() {
        return this.f74689id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setId(int i) {
        this.f74689id = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
