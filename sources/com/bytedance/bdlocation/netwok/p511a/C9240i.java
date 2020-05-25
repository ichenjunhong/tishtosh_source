package com.bytedance.bdlocation.netwok.p511a;

import com.google.gson.p1076a.C17952c;
import java.util.Arrays;

/* renamed from: com.bytedance.bdlocation.netwok.a.i */
public class C9240i {
    @C17952c(mo34828a = "Continent")

    /* renamed from: a */
    public C9242k f25273a;
    @C17952c(mo34828a = "Country")

    /* renamed from: b */
    public C9242k f25274b;
    @C17952c(mo34828a = "Subdivisions")

    /* renamed from: c */
    public C9242k[] f25275c;
    @C17952c(mo34828a = "City")

    /* renamed from: d */
    public C9242k f25276d;
    @C17952c(mo34828a = "District")

    /* renamed from: e */
    public C9242k f25277e;
    @C17952c(mo34828a = "Place")

    /* renamed from: f */
    public C9241j f25278f;
    @C17952c(mo34828a = "GPS")

    /* renamed from: g */
    public C9238g f25279g;
    @C17952c(mo34828a = "ISP")

    /* renamed from: h */
    public String f25280h;
    @C17952c(mo34828a = "LocateMethod")

    /* renamed from: i */
    public String f25281i;
    @C17952c(mo34828a = "Timestamp")

    /* renamed from: j */
    public String f25282j;

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationResult{continent=");
        sb.append(this.f25273a);
        sb.append(", country=");
        sb.append(this.f25274b);
        sb.append(", subdivisions=");
        sb.append(Arrays.toString(this.f25275c));
        sb.append(", city=");
        sb.append(this.f25276d);
        sb.append(", district=");
        sb.append(this.f25277e);
        sb.append(", place=");
        sb.append(this.f25278f);
        sb.append(", gps=");
        sb.append(this.f25279g);
        sb.append(", isp='");
        sb.append(this.f25280h);
        sb.append('\'');
        sb.append(", locateMethod='");
        sb.append(this.f25281i);
        sb.append('\'');
        sb.append(", timestamp='");
        sb.append(this.f25282j);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
