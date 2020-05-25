package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo */
public class QueryCorrectInfo implements Serializable {
    static final long serialVersionUID = 1;
    @C17952c(mo34828a = "corrected_query")
    String correctedKeyword;
    @C17952c(mo34828a = "correct_level")
    int correctedLevel;
    private String requestId;

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
