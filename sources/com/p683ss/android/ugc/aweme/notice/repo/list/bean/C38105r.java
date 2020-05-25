package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.r */
public final class C38105r {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    public final String f96946a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public final String f96947b;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: c */
    public final String f96948c;
    @C17952c(mo34828a = "log_extra")

    /* renamed from: d */
    public final String f96949d;
    @C17952c(mo34828a = "source_type")

    /* renamed from: e */
    public final int f96950e;
    @C17952c(mo34828a = "source_name")

    /* renamed from: f */
    public final String f96951f;
    @C17952c(mo34828a = "source_icon")

    /* renamed from: g */
    public final UrlModel f96952g;

    public C38105r() {
        this(null, null, null, null, 0, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38105r) {
                C38105r rVar = (C38105r) obj;
                if (C52711k.m112239a((Object) this.f96946a, (Object) rVar.f96946a) && C52711k.m112239a((Object) this.f96947b, (Object) rVar.f96947b) && C52711k.m112239a((Object) this.f96948c, (Object) rVar.f96948c) && C52711k.m112239a((Object) this.f96949d, (Object) rVar.f96949d)) {
                    if (!(this.f96950e == rVar.f96950e) || !C52711k.m112239a((Object) this.f96951f, (Object) rVar.f96951f) || !C52711k.m112239a((Object) this.f96952g, (Object) rVar.f96952g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f96946a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96947b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96948c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f96949d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f96950e) * 31;
        String str5 = this.f96951f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f96952g;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TcmNotice(title=");
        sb.append(this.f96946a);
        sb.append(", content=");
        sb.append(this.f96947b);
        sb.append(", schemaUrl=");
        sb.append(this.f96948c);
        sb.append(", logExtra=");
        sb.append(this.f96949d);
        sb.append(", sourceType=");
        sb.append(this.f96950e);
        sb.append(", sourceName=");
        sb.append(this.f96951f);
        sb.append(", sourceIcon=");
        sb.append(this.f96952g);
        sb.append(")");
        return sb.toString();
    }

    private C38105r(String str, String str2, String str3, String str4, int i, String str5, UrlModel urlModel) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, C42311c.f106865i);
        C52711k.m112240b(str3, "schemaUrl");
        C52711k.m112240b(str4, "logExtra");
        C52711k.m112240b(str5, "sourceName");
        this.f96946a = str;
        this.f96947b = str2;
        this.f96948c = str3;
        this.f96949d = str4;
        this.f96950e = i;
        this.f96951f = str5;
        this.f96952g = urlModel;
    }

    private /* synthetic */ C38105r(String str, String str2, String str3, String str4, int i, String str5, UrlModel urlModel, int i2, C52707g gVar) {
        this("", "", "", "", 0, "", null);
    }
}
