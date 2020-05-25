package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.WikipediaInfo */
public final class WikipediaInfo implements Serializable {
    @C17952c(mo34828a = "keyword")
    public String keyword;
    @C17952c(mo34828a = "lang")
    public String lang;

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLang() {
        return this.lang;
    }

    public final int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WikipediaInfo)) {
            return false;
        }
        WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
        if (!C52711k.m112239a((Object) wikipediaInfo.keyword, (Object) this.keyword) || !C52711k.m112239a((Object) wikipediaInfo.lang, (Object) this.lang)) {
            return false;
        }
        return true;
    }
}
