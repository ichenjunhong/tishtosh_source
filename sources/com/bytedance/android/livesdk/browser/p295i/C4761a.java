package com.bytedance.android.livesdk.browser.p295i;

import android.os.SystemClock;
import com.bytedance.android.live.browser.C3806b;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.browser.i.a */
public final class C4761a {

    /* renamed from: a */
    private long f12961a;

    /* renamed from: b */
    private final String f12962b;

    /* renamed from: c */
    private final String f12963c;

    /* renamed from: d */
    private C3806b f12964d;

    public C4761a(String str, String str2, C3806b bVar) {
        this.f12962b = str;
        this.f12963c = str2;
        this.f12964d = bVar;
    }

    /* renamed from: a */
    public void mo10590a(int i, int i2, String str) {
        long j = 0;
        if (i == 0) {
            this.f12961a = SystemClock.uptimeMillis();
        } else if (this.f12961a > 0) {
            long j2 = this.f12961a;
            this.f12961a = 0;
            j = SystemClock.uptimeMillis() - j2;
        } else {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("webview_scene", this.f12962b);
        hashMap.put("url", this.f12963c);
        if (i2 != 0) {
            hashMap.put("error_code", Integer.valueOf(i2));
            hashMap.put("error_msg", str);
        }
        C3837e.m9741a(C3836d.m9734a("ttlive_webview_load_status"), i, j, (Map<String, Object>) hashMap);
        if (i == 2) {
            C3837e.m9743a(C3836d.m9735b("ttlive_webview_load_status"), i, (Map<String, Object>) hashMap);
        }
        if (this.f12964d != null) {
            switch (i) {
                case 0:
                    this.f12964d.mo9176a(hashMap);
                    return;
                case 1:
                    this.f12964d.mo9175a(j, hashMap);
                    return;
                case 2:
                    this.f12964d.mo9177b(j, hashMap);
                    return;
                case 3:
                    this.f12964d.mo9178c(j, hashMap);
                    break;
            }
        }
    }
}
