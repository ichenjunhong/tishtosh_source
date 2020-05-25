package com.p683ss.android.ugc.aweme.shortvideo.messagecenter;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.messagecenter.a */
public final class C43992a {

    /* renamed from: a */
    public final int f111411a;

    /* renamed from: b */
    public final int f111412b;

    /* renamed from: c */
    public final int f111413c;

    /* renamed from: d */
    public final String f111414d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43992a) {
                C43992a aVar = (C43992a) obj;
                if (this.f111411a == aVar.f111411a) {
                    if (this.f111412b == aVar.f111412b) {
                        if (!(this.f111413c == aVar.f111413c) || !C52711k.m112239a((Object) this.f111414d, (Object) aVar.f111414d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f111411a * 31) + this.f111412b) * 31) + this.f111413c) * 31;
        String str = this.f111414d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EffectSDKMessage(messageType=");
        sb.append(this.f111411a);
        sb.append(", arg1=");
        sb.append(this.f111412b);
        sb.append(", arg2=");
        sb.append(this.f111413c);
        sb.append(", arg3=");
        sb.append(this.f111414d);
        sb.append(")");
        return sb.toString();
    }

    public C43992a(int i, int i2, int i3, String str) {
        this.f111411a = i;
        this.f111412b = i2;
        this.f111413c = i3;
        this.f111414d = str;
    }
}
