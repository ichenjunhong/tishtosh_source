package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a.b */
public final class C29386b implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private final int f76967a;
    @C17952c(mo34828a = "create_time")

    /* renamed from: b */
    private final String f76968b;
    @C17952c(mo34828a = "update_time")

    /* renamed from: c */
    private final String f76969c;
    @C17952c(mo34828a = "resource_url")

    /* renamed from: d */
    private final String f76970d;
    @C17952c(mo34828a = "md5")

    /* renamed from: e */
    private final String f76971e;

    public static /* synthetic */ C29386b copy$default(C29386b bVar, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f76967a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f76968b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = bVar.f76969c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = bVar.f76970d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = bVar.f76971e;
        }
        return bVar.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f76967a;
    }

    public final String component2() {
        return this.f76968b;
    }

    public final String component3() {
        return this.f76969c;
    }

    public final String component4() {
        return this.f76970d;
    }

    public final String component5() {
        return this.f76971e;
    }

    public final C29386b copy(int i, String str, String str2, String str3, String str4) {
        C29386b bVar = new C29386b(i, str, str2, str3, str4);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29386b) {
                C29386b bVar = (C29386b) obj;
                if (!(this.f76967a == bVar.f76967a) || !C52711k.m112239a((Object) this.f76968b, (Object) bVar.f76968b) || !C52711k.m112239a((Object) this.f76969c, (Object) bVar.f76969c) || !C52711k.m112239a((Object) this.f76970d, (Object) bVar.f76970d) || !C52711k.m112239a((Object) this.f76971e, (Object) bVar.f76971e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getCreateTime() {
        return this.f76968b;
    }

    public final int getId() {
        return this.f76967a;
    }

    public final String getMd5() {
        return this.f76971e;
    }

    public final String getResourceUrl() {
        return this.f76970d;
    }

    public final String getUpdateTime() {
        return this.f76969c;
    }

    public final int hashCode() {
        int i = this.f76967a * 31;
        String str = this.f76968b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76969c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76970d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f76971e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiRes(id=");
        sb.append(this.f76967a);
        sb.append(", createTime=");
        sb.append(this.f76968b);
        sb.append(", updateTime=");
        sb.append(this.f76969c);
        sb.append(", resourceUrl=");
        sb.append(this.f76970d);
        sb.append(", md5=");
        sb.append(this.f76971e);
        sb.append(")");
        return sb.toString();
    }

    public C29386b(int i, String str, String str2, String str3, String str4) {
        this.f76967a = i;
        this.f76968b = str;
        this.f76969c = str2;
        this.f76970d = str3;
        this.f76971e = str4;
    }

    public /* synthetic */ C29386b(int i, String str, String str2, String str3, String str4, int i2, C52707g gVar) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this(i3, str, str2, str3, str4);
    }
}
