package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.an */
public final class C39108an implements Serializable {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    private String f99760a;
    @C17952c(mo34828a = "cover")

    /* renamed from: b */
    private final UrlModel f99761b;
    @C17952c(mo34828a = "description")

    /* renamed from: c */
    private String f99762c;
    @C17952c(mo34828a = "class_code")

    /* renamed from: d */
    private String f99763d;
    @C17952c(mo34828a = "city_code")

    /* renamed from: e */
    private String f99764e;
    @C17952c(mo34828a = "location_index")

    /* renamed from: f */
    private long f99765f;
    @C17952c(mo34828a = "schema")

    /* renamed from: g */
    private String f99766g;
    @C17952c(mo34828a = "sec_class_name")

    /* renamed from: h */
    private String f99767h;
    @C17952c(mo34828a = "backend_type_code")

    /* renamed from: i */
    private final String f99768i;
    @C17952c(mo34828a = "city_name")

    /* renamed from: j */
    private final String f99769j;
    @C17952c(mo34828a = "backend_type_name")

    /* renamed from: k */
    private final String f99770k;

    public static /* synthetic */ C39108an copy$default(C39108an anVar, String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        C39108an anVar2 = anVar;
        int i2 = i;
        return anVar.copy((i2 & 1) != 0 ? anVar2.f99760a : str, (i2 & 2) != 0 ? anVar2.f99761b : urlModel, (i2 & 4) != 0 ? anVar2.f99762c : str2, (i2 & 8) != 0 ? anVar2.f99763d : str3, (i2 & 16) != 0 ? anVar2.f99764e : str4, (i2 & 32) != 0 ? anVar2.f99765f : j, (i2 & 64) != 0 ? anVar2.f99766g : str5, (i2 & 128) != 0 ? anVar2.f99767h : str6, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? anVar2.f99768i : str7, (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? anVar2.f99769j : str8, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? anVar2.f99770k : str9);
    }

    public final String component1() {
        return this.f99760a;
    }

    public final String component10() {
        return this.f99769j;
    }

    public final String component11() {
        return this.f99770k;
    }

    public final UrlModel component2() {
        return this.f99761b;
    }

    public final String component3() {
        return this.f99762c;
    }

    public final String component4() {
        return this.f99763d;
    }

    public final String component5() {
        return this.f99764e;
    }

    public final long component6() {
        return this.f99765f;
    }

    public final String component7() {
        return this.f99766g;
    }

    public final String component8() {
        return this.f99767h;
    }

    public final String component9() {
        return this.f99768i;
    }

    public final C39108an copy(String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9) {
        C39108an anVar = new C39108an(str, urlModel, str2, str3, str4, j, str5, str6, str7, str8, str9);
        return anVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39108an) {
                C39108an anVar = (C39108an) obj;
                if (C52711k.m112239a((Object) this.f99760a, (Object) anVar.f99760a) && C52711k.m112239a((Object) this.f99761b, (Object) anVar.f99761b) && C52711k.m112239a((Object) this.f99762c, (Object) anVar.f99762c) && C52711k.m112239a((Object) this.f99763d, (Object) anVar.f99763d) && C52711k.m112239a((Object) this.f99764e, (Object) anVar.f99764e)) {
                    if (!(this.f99765f == anVar.f99765f) || !C52711k.m112239a((Object) this.f99766g, (Object) anVar.f99766g) || !C52711k.m112239a((Object) this.f99767h, (Object) anVar.f99767h) || !C52711k.m112239a((Object) this.f99768i, (Object) anVar.f99768i) || !C52711k.m112239a((Object) this.f99769j, (Object) anVar.f99769j) || !C52711k.m112239a((Object) this.f99770k, (Object) anVar.f99770k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getBackendTypeCode() {
        return this.f99768i;
    }

    public final String getBackendTypeName() {
        return this.f99770k;
    }

    public final String getCityCode() {
        return this.f99764e;
    }

    public final String getCityName() {
        return this.f99769j;
    }

    public final String getClassCode() {
        return this.f99763d;
    }

    public final UrlModel getCover() {
        return this.f99761b;
    }

    public final String getDescription() {
        return this.f99762c;
    }

    public final long getLocationIndex() {
        return this.f99765f;
    }

    public final String getSchema() {
        return this.f99766g;
    }

    public final String getSubClass() {
        return this.f99767h;
    }

    public final String getTitle() {
        return this.f99760a;
    }

    public final int hashCode() {
        String str = this.f99760a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f99761b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f99762c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f99763d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f99764e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j = this.f99765f;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        String str5 = this.f99766g;
        int hashCode6 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f99767h;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f99768i;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f99769j;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f99770k;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRankCardStruct(title=");
        sb.append(this.f99760a);
        sb.append(", cover=");
        sb.append(this.f99761b);
        sb.append(", description=");
        sb.append(this.f99762c);
        sb.append(", classCode=");
        sb.append(this.f99763d);
        sb.append(", cityCode=");
        sb.append(this.f99764e);
        sb.append(", locationIndex=");
        sb.append(this.f99765f);
        sb.append(", schema=");
        sb.append(this.f99766g);
        sb.append(", subClass=");
        sb.append(this.f99767h);
        sb.append(", backendTypeCode=");
        sb.append(this.f99768i);
        sb.append(", cityName=");
        sb.append(this.f99769j);
        sb.append(", backendTypeName=");
        sb.append(this.f99770k);
        sb.append(")");
        return sb.toString();
    }

    public final void setCityCode(String str) {
        this.f99764e = str;
    }

    public final void setClassCode(String str) {
        this.f99763d = str;
    }

    public final void setDescription(String str) {
        this.f99762c = str;
    }

    public final void setLocationIndex(long j) {
        this.f99765f = j;
    }

    public final void setSchema(String str) {
        this.f99766g = str;
    }

    public final void setSubClass(String str) {
        this.f99767h = str;
    }

    public final void setTitle(String str) {
        this.f99760a = str;
    }

    public C39108an(String str, UrlModel urlModel, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9) {
        this.f99760a = str;
        this.f99761b = urlModel;
        this.f99762c = str2;
        this.f99763d = str3;
        this.f99764e = str4;
        this.f99765f = j;
        this.f99766g = str5;
        this.f99767h = str6;
        this.f99768i = str7;
        this.f99769j = str8;
        this.f99770k = str9;
    }
}
