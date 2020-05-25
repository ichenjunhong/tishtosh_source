package com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.l.b */
public final class C34399b {

    /* renamed from: a */
    public long f88768a;

    /* renamed from: b */
    public int f88769b;

    /* renamed from: c */
    public int f88770c;

    /* renamed from: d */
    public HashMap<String, String> f88771d;

    /* renamed from: e */
    public String f88772e;

    /* renamed from: f */
    public String f88773f;

    /* renamed from: g */
    public byte[] f88774g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("WsChannelMsg{logId=");
        sb.append(this.f88768a);
        sb.append(", service=");
        sb.append(this.f88769b);
        sb.append(", method=");
        sb.append(this.f88770c);
        sb.append(", msgHeaders=");
        sb.append(this.f88771d);
        sb.append(", payloadEncoding='");
        sb.append(this.f88772e);
        sb.append('\'');
        sb.append(", payloadType='");
        sb.append(this.f88773f);
        sb.append('\'');
        sb.append(", payload=");
        sb.append(Arrays.toString(this.f88774g));
        sb.append('}');
        return sb.toString();
    }
}
