package com.p683ss.android.ugc.aweme.video.bitrate.bean;

import android.util.Pair;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48526d;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.b */
public final class C48000b implements C48526d {
    @C17952c(mo34828a = "default_gear_name")

    /* renamed from: a */
    public String f120643a;
    @C17952c(mo34828a = "gear_group")

    /* renamed from: b */
    public Set<String> f120644b;
    @C17952c(mo34828a = "default_bitrate")

    /* renamed from: c */
    private double f120645c;
    @C17952c(mo34828a = "bitrate_range")

    /* renamed from: d */
    private List<Double> f120646d;

    /* renamed from: a */
    public final String mo95187a() {
        return this.f120643a;
    }

    /* renamed from: b */
    public final Set<String> mo95188b() {
        return this.f120644b;
    }

    /* renamed from: c */
    public final double mo95189c() {
        return this.f120645c;
    }

    /* renamed from: d */
    public final Pair<Double, Double> mo95190d() {
        if (this.f120646d == null || this.f120646d.size() != 2) {
            return null;
        }
        return new Pair<>(this.f120646d.get(0), this.f120646d.get(1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GearConfig{defaultGearName='");
        sb.append(this.f120643a);
        sb.append('\'');
        sb.append(", gearGroup=");
        sb.append(this.f120644b);
        sb.append('}');
        return sb.toString();
    }
}
