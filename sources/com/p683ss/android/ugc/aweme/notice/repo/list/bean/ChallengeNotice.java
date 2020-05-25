package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice */
public class ChallengeNotice {
    @C17952c(mo34828a = "challenge")
    Challenge challenge;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "schema")
    String schema;
    @C17952c(mo34828a = "title")
    String title;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
