package com.p683ss.android.ugc.aweme.commerce.service.models;

import android.app.Activity;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.h */
public final class C25564h {

    /* renamed from: a */
    public final Activity f67602a;

    /* renamed from: b */
    public final CommerceUser f67603b;

    /* renamed from: c */
    public final String f67604c;

    /* renamed from: d */
    public final boolean f67605d;

    /* renamed from: e */
    public final String f67606e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25564h) {
                C25564h hVar = (C25564h) obj;
                if (C52711k.m112239a((Object) this.f67602a, (Object) hVar.f67602a) && C52711k.m112239a((Object) this.f67603b, (Object) hVar.f67603b) && C52711k.m112239a((Object) this.f67604c, (Object) hVar.f67604c)) {
                    if (!(this.f67605d == hVar.f67605d) || !C52711k.m112239a((Object) this.f67606e, (Object) hVar.f67606e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Activity activity = this.f67602a;
        int i = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        CommerceUser commerceUser = this.f67603b;
        int hashCode2 = (hashCode + (commerceUser != null ? commerceUser.hashCode() : 0)) * 31;
        String str = this.f67604c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f67605d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f67606e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortfolioParams(activity=");
        sb.append(this.f67602a);
        sb.append(", user=");
        sb.append(this.f67603b);
        sb.append(", referFrom=");
        sb.append(this.f67604c);
        sb.append(", isManager=");
        sb.append(this.f67605d);
        sb.append(", triggerAwemeId=");
        sb.append(this.f67606e);
        sb.append(")");
        return sb.toString();
    }
}
