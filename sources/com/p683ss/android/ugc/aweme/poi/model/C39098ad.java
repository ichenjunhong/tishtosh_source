package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ad */
public final class C39098ad implements Serializable {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    private String f99733a;
    @C17952c(mo34828a = "cover")

    /* renamed from: b */
    private final UrlModel f99734b;
    @C17952c(mo34828a = "description")

    /* renamed from: c */
    private String f99735c;
    @C17952c(mo34828a = "location_index")

    /* renamed from: d */
    private long f99736d;
    @C17952c(mo34828a = "schema")

    /* renamed from: e */
    private String f99737e;
    @C17952c(mo34828a = "card_id")

    /* renamed from: f */
    private String f99738f;

    public static /* synthetic */ C39098ad copy$default(C39098ad adVar, String str, UrlModel urlModel, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adVar.f99733a;
        }
        if ((i & 2) != 0) {
            urlModel = adVar.f99734b;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 4) != 0) {
            str2 = adVar.f99735c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            j = adVar.f99736d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str3 = adVar.f99737e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = adVar.f99738f;
        }
        return adVar.copy(str, urlModel2, str5, j2, str6, str4);
    }

    public final String component1() {
        return this.f99733a;
    }

    public final UrlModel component2() {
        return this.f99734b;
    }

    public final String component3() {
        return this.f99735c;
    }

    public final long component4() {
        return this.f99736d;
    }

    public final String component5() {
        return this.f99737e;
    }

    public final String component6() {
        return this.f99738f;
    }

    public final C39098ad copy(String str, UrlModel urlModel, String str2, long j, String str3, String str4) {
        C39098ad adVar = new C39098ad(str, urlModel, str2, j, str3, str4);
        return adVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39098ad) {
                C39098ad adVar = (C39098ad) obj;
                if (C52711k.m112239a((Object) this.f99733a, (Object) adVar.f99733a) && C52711k.m112239a((Object) this.f99734b, (Object) adVar.f99734b) && C52711k.m112239a((Object) this.f99735c, (Object) adVar.f99735c)) {
                    if (!(this.f99736d == adVar.f99736d) || !C52711k.m112239a((Object) this.f99737e, (Object) adVar.f99737e) || !C52711k.m112239a((Object) this.f99738f, (Object) adVar.f99738f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCardId() {
        return this.f99738f;
    }

    public final UrlModel getCover() {
        return this.f99734b;
    }

    public final String getDescription() {
        return this.f99735c;
    }

    public final long getLocationIndex() {
        return this.f99736d;
    }

    public final String getSchema() {
        return this.f99737e;
    }

    public final String getTitle() {
        return this.f99733a;
    }

    public final int hashCode() {
        String str = this.f99733a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f99734b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f99735c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.f99736d;
        int i2 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.f99737e;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f99738f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiOpCardStruct(title=");
        sb.append(this.f99733a);
        sb.append(", cover=");
        sb.append(this.f99734b);
        sb.append(", description=");
        sb.append(this.f99735c);
        sb.append(", locationIndex=");
        sb.append(this.f99736d);
        sb.append(", schema=");
        sb.append(this.f99737e);
        sb.append(", cardId=");
        sb.append(this.f99738f);
        sb.append(")");
        return sb.toString();
    }

    public final void setCardId(String str) {
        this.f99738f = str;
    }

    public final void setDescription(String str) {
        this.f99735c = str;
    }

    public final void setLocationIndex(long j) {
        this.f99736d = j;
    }

    public final void setSchema(String str) {
        this.f99737e = str;
    }

    public final void setTitle(String str) {
        this.f99733a = str;
    }

    public C39098ad(String str, UrlModel urlModel, String str2, long j, String str3, String str4) {
        this.f99733a = str;
        this.f99734b = urlModel;
        this.f99735c = str2;
        this.f99736d = j;
        this.f99737e = str3;
        this.f99738f = str4;
    }
}
