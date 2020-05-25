package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentLabel */
public class CommentLabel implements Serializable {
    private static final long serialVersionUID = 5974802910310825054L;
    @C17952c(mo34828a = "color")
    public String color;
    @C17952c(mo34828a = "text")
    public String text;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "url")
    public String url;

    public String getLabelColor() {
        return this.color;
    }

    public String getLabelText() {
        return this.text;
    }

    public int getLabelType() {
        return this.type;
    }

    public String getLabelUrl() {
        return this.url;
    }

    public void setLabelColor(String str) {
        this.color = str;
    }

    public void setLabelText(String str) {
        this.text = str;
    }

    public void setLabelType(int i) {
        this.type = i;
    }

    public void setLabelUrl(String str) {
        this.url = str;
    }
}
