package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRiskModel */
public class AwemeRiskModel implements Serializable {
    @C17952c(mo34828a = "content")
    public String content;
    @C17952c(mo34828a = "notice")
    public boolean notice;
    @C17952c(mo34828a = "risk_sink")
    public boolean riskSink;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "url")
    public String url;
    @C17952c(mo34828a = "vote")
    public boolean vote;
    public int voteStatus = -1;
    @C17952c(mo34828a = "warn")
    public boolean warn;

    public String getContent() {
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVoteStatus() {
        return this.voteStatus;
    }

    public boolean isNotice() {
        return this.notice;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isVote() {
        return this.vote;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setNotice(boolean z) {
        this.notice = z;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVote(boolean z) {
        this.vote = z;
    }

    public void setVoteStatus(int i) {
        this.voteStatus = i;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
