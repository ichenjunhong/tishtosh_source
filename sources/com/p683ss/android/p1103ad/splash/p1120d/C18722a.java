package com.p683ss.android.p1103ad.splash.p1120d;

import android.net.Uri;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;

/* renamed from: com.ss.android.ad.splash.d.a */
public final class C18722a {

    /* renamed from: a */
    public String f51794a;

    /* renamed from: b */
    private String f51795b;

    /* renamed from: c */
    private String f51796c;

    /* renamed from: d */
    private String f51797d;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!C18747l.m45742a(this.f51795b)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f51795b));
        }
        if (!C18747l.m45742a(this.f51794a)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f51794a));
        }
        if (!C18747l.m45742a(this.f51797d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f51797d));
        }
        if (!C18747l.m45742a(this.f51796c)) {
            sb.append("&uuid=");
            sb.append(Uri.encode(this.f51796c));
        }
        return sb.toString();
    }
}
