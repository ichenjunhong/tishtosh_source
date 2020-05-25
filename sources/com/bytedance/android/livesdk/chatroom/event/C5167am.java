package com.bytedance.android.livesdk.chatroom.event;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.am */
public final class C5167am {

    /* renamed from: a */
    public final C5195o f13849a;

    /* renamed from: b */
    public final boolean f13850b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5167am) {
                C5167am amVar = (C5167am) obj;
                if (C52711k.m112239a((Object) this.f13849a, (Object) amVar.f13849a)) {
                    if (this.f13850b == amVar.f13850b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C5195o oVar = this.f13849a;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        boolean z = this.f13850b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendCommentResult(subject=");
        sb.append(this.f13849a);
        sb.append(", success=");
        sb.append(this.f13850b);
        sb.append(")");
        return sb.toString();
    }

    public C5167am(C5195o oVar, boolean z) {
        C52711k.m112240b(oVar, "subject");
        this.f13849a = oVar;
        this.f13850b = z;
    }
}
