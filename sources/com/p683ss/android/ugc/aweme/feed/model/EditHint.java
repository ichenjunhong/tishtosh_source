package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.EditHint */
public class EditHint implements Serializable {
    @C17952c(mo34828a = "hint")
    String hint;
    @C17952c(mo34828a = "language")
    String language;

    public String getHint() {
        return this.hint;
    }

    public String getLanguage() {
        return this.language;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditHint{language='");
        sb.append(this.language);
        sb.append('\'');
        sb.append(", hint='");
        sb.append(this.hint);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
