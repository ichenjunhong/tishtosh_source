package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.utils.C47770ck;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserAwemeCover */
public class UserAwemeCover implements Serializable {
    @C17951b(mo34826a = C47770ck.class)
    @C17952c(mo34828a = "aweme_info")
    String awemeInfo;
    @C17952c(mo34828a = "preview_end")
    int previewEnd;
    @C17952c(mo34828a = "preview_start")
    int previewStart;
    @C17952c(mo34828a = "pull_text")
    String pullText;

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i) {
        this.previewEnd = i;
    }

    public void setPreviewStart(int i) {
        this.previewStart = i;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
