package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.l */
public final class C38098l {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    public String f96926a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f96927b;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: c */
    public String f96928c;
    @C17952c(mo34828a = "sub_type")

    /* renamed from: d */
    public int f96929d;
    @C17952c(mo34828a = "task_id")

    /* renamed from: e */
    public String f96930e;
    @C17952c(mo34828a = "task_name")

    /* renamed from: f */
    public String f96931f;

    public C38098l() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38098l) {
                C38098l lVar = (C38098l) obj;
                if (C52711k.m112239a((Object) this.f96926a, (Object) lVar.f96926a) && C52711k.m112239a((Object) this.f96927b, (Object) lVar.f96927b) && C52711k.m112239a((Object) this.f96928c, (Object) lVar.f96928c)) {
                    if (!(this.f96929d == lVar.f96929d) || !C52711k.m112239a((Object) this.f96930e, (Object) lVar.f96930e) || !C52711k.m112239a((Object) this.f96931f, (Object) lVar.f96931f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f96926a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96927b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96928c;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f96929d) * 31;
        String str4 = this.f96930e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f96931f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NationalTaskAssistantNotice(title=");
        sb.append(this.f96926a);
        sb.append(", content=");
        sb.append(this.f96927b);
        sb.append(", schemaUrl=");
        sb.append(this.f96928c);
        sb.append(", subType=");
        sb.append(this.f96929d);
        sb.append(", taskId=");
        sb.append(this.f96930e);
        sb.append(", taskName=");
        sb.append(this.f96931f);
        sb.append(")");
        return sb.toString();
    }

    private C38098l(String str, String str2, String str3, int i, String str4, String str5) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, C42311c.f106865i);
        C52711k.m112240b(str3, "schemaUrl");
        C52711k.m112240b(str4, "taskId");
        C52711k.m112240b(str5, "taskName");
        this.f96926a = str;
        this.f96927b = str2;
        this.f96928c = str3;
        this.f96929d = i;
        this.f96930e = str4;
        this.f96931f = str5;
    }

    private /* synthetic */ C38098l(String str, String str2, String str3, int i, String str4, String str5, int i2, C52707g gVar) {
        this("", "", "", 0, "", "");
    }
}
