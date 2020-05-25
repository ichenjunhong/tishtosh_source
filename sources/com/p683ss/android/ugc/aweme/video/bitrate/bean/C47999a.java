package com.p683ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48523a;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.a */
public final class C47999a implements C48523a {
    @C17952c(mo34828a = "param_a")

    /* renamed from: a */
    public double f120638a;
    @C17952c(mo34828a = "param_b")

    /* renamed from: b */
    public double f120639b;
    @C17952c(mo34828a = "param_c")

    /* renamed from: c */
    public double f120640c;
    @C17952c(mo34828a = "param_d")

    /* renamed from: d */
    public double f120641d;
    @C17952c(mo34828a = "min_bitrate")

    /* renamed from: e */
    public double f120642e;

    /* renamed from: a */
    public final double mo95181a() {
        return this.f120638a;
    }

    /* renamed from: b */
    public final double mo95182b() {
        return this.f120639b;
    }

    /* renamed from: c */
    public final double mo95183c() {
        return this.f120640c;
    }

    /* renamed from: d */
    public final double mo95184d() {
        return this.f120641d;
    }

    /* renamed from: e */
    public final double mo95185e() {
        return this.f120642e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBitrateSet{firstParam=");
        sb.append(this.f120638a);
        sb.append(", secondParam=");
        sb.append(this.f120639b);
        sb.append(", thirdParam=");
        sb.append(this.f120640c);
        sb.append(", fourthParam=");
        sb.append(this.f120641d);
        sb.append(", minBitrate=");
        sb.append(this.f120642e);
        sb.append('}');
        return sb.toString();
    }
}
