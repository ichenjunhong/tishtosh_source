package com.p683ss.android.ugc.aweme.watermark;

import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.j */
public final class C48248j {

    /* renamed from: a */
    public final String f121404a;

    /* renamed from: b */
    public final String f121405b;

    /* renamed from: c */
    public final int f121406c = 3000;

    /* renamed from: d */
    public int f121407d = 0;

    /* renamed from: e */
    public final String[] f121408e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48248j) {
                C48248j jVar = (C48248j) obj;
                if (C52711k.m112239a((Object) this.f121404a, (Object) jVar.f121404a) && C52711k.m112239a((Object) this.f121405b, (Object) jVar.f121405b)) {
                    if (this.f121406c == jVar.f121406c) {
                        if (!(this.f121407d == jVar.f121407d) || !C52711k.m112239a((Object) this.f121408e, (Object) jVar.f121408e)) {
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
        String str = this.f121404a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121405b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f121406c) * 31) + this.f121407d) * 31;
        String[] strArr = this.f121408e;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEndWatermarkData(endWatermarkFrame=");
        sb.append(this.f121404a);
        sb.append(", endAudioPath=");
        sb.append(this.f121405b);
        sb.append(", watermarkDuration=");
        sb.append(this.f121406c);
        sb.append(", inputMediaDuration=");
        sb.append(this.f121407d);
        sb.append(", transitions=");
        sb.append(Arrays.toString(this.f121408e));
        sb.append(")");
        return sb.toString();
    }

    public C48248j(String str, String str2, int i, int i2, String[] strArr) {
        C52711k.m112240b(str, "endWatermarkFrame");
        C52711k.m112240b(strArr, "transitions");
        this.f121404a = str;
        this.f121405b = str2;
        this.f121408e = strArr;
    }
}
