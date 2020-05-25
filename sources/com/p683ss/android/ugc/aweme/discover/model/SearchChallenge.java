package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26113ag;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallenge */
public class SearchChallenge implements Serializable {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")
    C26113ag adData;
    @C17952c(mo34828a = "items")
    List<Aweme> awemes;
    @C17952c(mo34828a = "challenge_info")
    Challenge challenge;
    @C17952c(mo34828a = "position")
    List<Position> position;
    private String requestId;

    public C26113ag getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean hasAwemeList() {
        if (this.awemes == null || this.awemes.size() <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (this.challenge != null) {
            this.challenge.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }
}
