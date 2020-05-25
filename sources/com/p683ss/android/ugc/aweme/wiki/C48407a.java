package com.p683ss.android.ugc.aweme.wiki;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.wiki.a */
public final class C48407a implements Serializable {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    private final int f121766a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    private final String f121767b;

    public static /* synthetic */ C48407a copy$default(C48407a aVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f121766a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f121767b;
        }
        return aVar.copy(i, str);
    }

    public final int component1() {
        return this.f121766a;
    }

    public final String component2() {
        return this.f121767b;
    }

    public final C48407a copy(int i, String str) {
        C52711k.m112240b(str, "msg");
        return new C48407a(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48407a) {
                C48407a aVar = (C48407a) obj;
                if (!(this.f121766a == aVar.f121766a) || !C52711k.m112239a((Object) this.f121767b, (Object) aVar.f121767b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getCode() {
        return this.f121766a;
    }

    public final String getMsg() {
        return this.f121767b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f121766a) * 31;
        String str = this.f121767b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckWikiWordResult(code=");
        sb.append(this.f121766a);
        sb.append(", msg=");
        sb.append(this.f121767b);
        sb.append(")");
        return sb.toString();
    }

    public C48407a(int i, String str) {
        C52711k.m112240b(str, "msg");
        this.f121766a = i;
        this.f121767b = str;
    }
}
