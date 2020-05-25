package com.bytedance.android.livesdk.p426x;

import com.bytedance.android.livesdk.browser.jsbridge.C4769b;
import com.bytedance.android.livesdkapi.depend.live.C8669s;
import java.net.URI;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.x.j */
public final class C8575j implements C8669s {
    /* renamed from: a */
    public final boolean mo15066a(String str) {
        try {
            String host = new URI(str).getHost();
            if (host != null) {
                if (!host.isEmpty()) {
                    str = host;
                }
            }
            String replace = str.replace("www.", "");
            List e = C4769b.m11329e();
            if (replace.isEmpty()) {
                return false;
            }
            return e.contains(replace);
        } catch (Exception unused) {
            return false;
        }
    }
}
