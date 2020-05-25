package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.utils.C47850ei;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer */
public class ChallengeDisclaimer implements Serializable {
    @C17951b(mo34826a = C47850ei.class)
    @C17952c(mo34828a = "content")
    public String content;
    @C17952c(mo34828a = "title")
    public String title;

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
