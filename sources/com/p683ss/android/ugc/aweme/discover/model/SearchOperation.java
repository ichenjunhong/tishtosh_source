package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperation */
public final class SearchOperation implements Serializable {
    @C17952c(mo34828a = "banner")
    private UrlModel banner;
    @C17952c(mo34828a = "activity_id")
    private String cardId;
    @C17952c(mo34828a = "link_desc")
    private String desc;
    @C17952c(mo34828a = "doc_id")
    private String docId;
    @C17952c(mo34828a = "link_url")
    private String link;
    private boolean recorded;
    @C17952c(mo34828a = "title")
    private String title;

    public static /* synthetic */ SearchOperation copy$default(SearchOperation searchOperation, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchOperation.title;
        }
        if ((i & 2) != 0) {
            str2 = searchOperation.desc;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = searchOperation.link;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            urlModel = searchOperation.banner;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 16) != 0) {
            str4 = searchOperation.cardId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            z = searchOperation.recorded;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            str5 = searchOperation.docId;
        }
        return searchOperation.copy(str, str6, str7, urlModel2, str8, z2, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.desc;
    }

    public final String component3() {
        return this.link;
    }

    public final UrlModel component4() {
        return this.banner;
    }

    public final String component5() {
        return this.cardId;
    }

    public final boolean component6() {
        return this.recorded;
    }

    public final String component7() {
        return this.docId;
    }

    public final SearchOperation copy(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5) {
        String str6 = str;
        C52711k.m112240b(str, "title");
        String str7 = str2;
        C52711k.m112240b(str2, "desc");
        String str8 = str3;
        C52711k.m112240b(str3, "link");
        UrlModel urlModel2 = urlModel;
        C52711k.m112240b(urlModel, "banner");
        String str9 = str4;
        C52711k.m112240b(str4, "cardId");
        SearchOperation searchOperation = new SearchOperation(str6, str7, str8, urlModel2, str9, z, str5);
        return searchOperation;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchOperation) {
                SearchOperation searchOperation = (SearchOperation) obj;
                if (C52711k.m112239a((Object) this.title, (Object) searchOperation.title) && C52711k.m112239a((Object) this.desc, (Object) searchOperation.desc) && C52711k.m112239a((Object) this.link, (Object) searchOperation.link) && C52711k.m112239a((Object) this.banner, (Object) searchOperation.banner) && C52711k.m112239a((Object) this.cardId, (Object) searchOperation.cardId)) {
                    if (!(this.recorded == searchOperation.recorded) || !C52711k.m112239a((Object) this.docId, (Object) searchOperation.docId)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getBanner() {
        return this.banner;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getLink() {
        return this.link;
    }

    public final boolean getRecorded() {
        return this.recorded;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.link;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.banner;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.cardId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.recorded;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str5 = this.docId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchOperation(title=");
        sb.append(this.title);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(", recorded=");
        sb.append(this.recorded);
        sb.append(", docId=");
        sb.append(this.docId);
        sb.append(")");
        return sb.toString();
    }

    public final void setDocId(String str) {
        this.docId = str;
    }

    public final void setRecorded(boolean z) {
        this.recorded = z;
    }

    public final void setBanner(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "<set-?>");
        this.banner = urlModel;
    }

    public final void setCardId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.cardId = str;
    }

    public final void setDesc(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.desc = str;
    }

    public final void setLink(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.link = str;
    }

    public final void setTitle(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.title = str;
    }

    public SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "desc");
        C52711k.m112240b(str3, "link");
        C52711k.m112240b(urlModel, "banner");
        C52711k.m112240b(str4, "cardId");
        this.title = str;
        this.desc = str2;
        this.link = str3;
        this.banner = urlModel;
        this.cardId = str4;
        this.recorded = z;
        this.docId = str5;
    }

    public /* synthetic */ SearchOperation(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5, int i, C52707g gVar) {
        boolean z2;
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str3, urlModel, str4, z2, str5);
    }
}
