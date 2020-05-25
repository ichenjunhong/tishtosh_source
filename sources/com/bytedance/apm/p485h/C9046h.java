package com.bytedance.apm.p485h;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.h.h */
public final class C9046h {

    /* renamed from: a */
    public long f24698a;

    /* renamed from: b */
    public long f24699b;

    /* renamed from: c */
    public long f24700c;

    /* renamed from: d */
    public long f24701d;

    /* renamed from: e */
    public long f24702e;

    /* renamed from: f */
    public long f24703f;

    /* renamed from: g */
    public long f24704g;

    /* renamed from: h */
    public long f24705h;

    /* renamed from: i */
    public long f24706i;

    /* renamed from: j */
    public long f24707j;

    /* renamed from: k */
    public long f24708k;

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrafficEntity{frontWifiSendBytes=");
        sb.append(this.f24698a);
        sb.append(", frontWifiRecBytes=");
        sb.append(this.f24699b);
        sb.append(", frontMobileSendBytes=");
        sb.append(this.f24700c);
        sb.append(", frontMobileRecBytes=");
        sb.append(this.f24701d);
        sb.append(", backWifiSendBytes=");
        sb.append(this.f24702e);
        sb.append(", backWifiRecBytes=");
        sb.append(this.f24703f);
        sb.append(", backMobileSendBytes=");
        sb.append(this.f24704g);
        sb.append(", backMobileRecBytes=");
        sb.append(this.f24705h);
        sb.append(", frontTotalBytes=");
        sb.append(this.f24706i);
        sb.append(", backTotalBytes=");
        sb.append(this.f24707j);
        sb.append("=");
        sb.append(this.f24708k);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final List<C9047i> mo16378a() {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24701d > 0) {
            C9047i iVar = new C9047i(this.f24701d, 1, 0, 0, currentTimeMillis);
            arrayList.add(iVar);
        }
        if (this.f24700c > 0) {
            C9047i iVar2 = new C9047i(this.f24700c, 1, 0, 1, currentTimeMillis);
            arrayList.add(iVar2);
        }
        if (this.f24699b > 0) {
            C9047i iVar3 = new C9047i(this.f24699b, 1, 1, 0, currentTimeMillis);
            arrayList.add(iVar3);
        }
        if (this.f24698a > 0) {
            C9047i iVar4 = new C9047i(this.f24698a, 1, 1, 1, currentTimeMillis);
            arrayList.add(iVar4);
        }
        if (this.f24705h > 0) {
            C9047i iVar5 = new C9047i(this.f24705h, 0, 0, 0, currentTimeMillis);
            arrayList.add(iVar5);
        }
        if (this.f24704g > 0) {
            C9047i iVar6 = new C9047i(this.f24704g, 0, 0, 1, currentTimeMillis);
            arrayList.add(iVar6);
        }
        if (this.f24703f > 0) {
            C9047i iVar7 = new C9047i(this.f24703f, 0, 1, 0, currentTimeMillis);
            arrayList.add(iVar7);
        }
        if (this.f24702e > 0) {
            C9047i iVar8 = new C9047i(this.f24702e, 0, 1, 1, currentTimeMillis);
            arrayList.add(iVar8);
        }
        return arrayList;
    }
}
