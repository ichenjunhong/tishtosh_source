package com.bytedance.sdk.account.p844a.p848d;

import com.bytedance.sdk.account.p844a.p845a.C12990b;
import java.util.List;

/* renamed from: com.bytedance.sdk.account.a.d.d */
public class C13015d extends C12990b {

    /* renamed from: h */
    public String f34028h;

    /* renamed from: i */
    public boolean f34029i;

    /* renamed from: j */
    public boolean f34030j;

    /* renamed from: k */
    public boolean f34031k;

    /* renamed from: l */
    public boolean f34032l;

    /* renamed from: m */
    public boolean f34033m;

    /* renamed from: n */
    public String f34034n;

    /* renamed from: o */
    public List<String> f34035o;

    /* renamed from: p */
    public String f34036p;

    public String toString() {
        StringBuilder sb = new StringBuilder("GetAvailableWaysResponse{email='");
        sb.append(this.f34028h);
        sb.append('\'');
        sb.append(", hasEmail=");
        sb.append(this.f34029i);
        sb.append(", hasMobile=");
        sb.append(this.f34030j);
        sb.append(", hasOauth=");
        sb.append(this.f34031k);
        sb.append(", hasPwd=");
        sb.append(this.f34032l);
        sb.append(", isMostDevice=");
        sb.append(this.f34033m);
        sb.append(", mobile='");
        sb.append(this.f34034n);
        sb.append('\'');
        sb.append(", oauthPlatforms=");
        sb.append(this.f34035o);
        sb.append(", token='");
        sb.append(this.f34036p);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C13015d(boolean z, int i) {
        super(z, i);
    }
}
