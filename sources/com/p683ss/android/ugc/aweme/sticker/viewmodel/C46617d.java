package com.p683ss.android.ugc.aweme.sticker.viewmodel;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.d */
public final class C46617d {

    /* renamed from: a */
    public final int f117621a;

    /* renamed from: b */
    public final int f117622b;

    /* renamed from: c */
    public final int f117623c;

    /* renamed from: d */
    public final String f117624d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46617d) {
                C46617d dVar = (C46617d) obj;
                if (this.f117621a == dVar.f117621a) {
                    if (this.f117622b == dVar.f117622b) {
                        if (!(this.f117623c == dVar.f117623c) || !C52711k.m112239a((Object) this.f117624d, (Object) dVar.f117624d)) {
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
        int i = ((((this.f117621a * 31) + this.f117622b) * 31) + this.f117623c) * 31;
        String str = this.f117624d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerMessage(messageType=");
        sb.append(this.f117621a);
        sb.append(", arg1=");
        sb.append(this.f117622b);
        sb.append(", arg2=");
        sb.append(this.f117623c);
        sb.append(", arg3=");
        sb.append(this.f117624d);
        sb.append(")");
        return sb.toString();
    }

    public C46617d(int i, int i2, int i3, String str) {
        this.f117621a = i;
        this.f117622b = i2;
        this.f117623c = i3;
        this.f117624d = str;
    }
}
