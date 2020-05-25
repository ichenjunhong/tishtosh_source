package com.bytedance.p126ad.symphony.p136f;

import android.net.Uri;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.bytedance.ad.symphony.f.a */
public final class C2732a {

    /* renamed from: a */
    private String f8260a;

    /* renamed from: b */
    private String f8261b;

    /* renamed from: c */
    private String f8262c;

    /* renamed from: d */
    private String f8263d;

    /* renamed from: e */
    private String f8264e;

    /* renamed from: f */
    private String f8265f;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!C9431p.m18664a(this.f8260a)) {
            sb.append("&aid=");
            sb.append(Uri.encode(this.f8260a));
        }
        if (!C9431p.m18664a(this.f8261b)) {
            sb.append("&channel=");
            sb.append(Uri.encode(this.f8261b));
        }
        if (!C9431p.m18664a(this.f8262c)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f8262c));
        }
        if (!C9431p.m18664a(this.f8263d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f8263d));
        }
        if (!C9431p.m18664a(this.f8264e)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f8264e));
        }
        if (!C9431p.m18664a(this.f8265f)) {
            sb.append("&version_code=");
            sb.append(Uri.encode(this.f8265f));
        }
        return sb.toString();
    }
}
