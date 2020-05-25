package com.p683ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.falconx.C9756a;
import com.bytedance.falconx.C9765b.C9767a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p688h.C10968a;
import com.bytedance.ies.p688h.C10979b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.sdk.webview.i */
public final class C19761i {

    /* renamed from: a */
    public C19762a f54441a;

    /* renamed from: b */
    private C10968a f54442b;

    /* renamed from: c */
    private C9756a f54443c;

    /* renamed from: d */
    private String f54444d;

    /* renamed from: com.ss.android.sdk.webview.i$a */
    public interface C19762a {
        /* renamed from: a */
        WebResourceResponse mo41194a(String str);
    }

    /* renamed from: a */
    private static boolean m48276a() {
        return C10181b.m20511a().mo18172a(GeckoXExperiment.class, true, "enable_gecko_x", 31744, false);
    }

    /* renamed from: a */
    public final C19761i mo41191a(C10979b bVar) {
        this.f54442b.mo19781a(bVar);
        return this;
    }

    public C19761i(String str) {
        Context a = C11010c.m22280a();
        String i = C11010c.m22288i();
        String serverDeviceId = AppLog.getServerDeviceId();
        this.f54442b = C10968a.m22224a(a, i, serverDeviceId, str);
        if (!TextUtils.isEmpty(str)) {
            this.f54444d = str.substring(str.lastIndexOf("/") + 1);
            this.f54443c = new C9756a(new C9767a(a).mo17595a(this.f54444d).mo17596a((List<Pattern>) new ArrayList<Pattern>()).mo17598b(serverDeviceId).mo17599b(Arrays.asList(new Uri[]{Uri.fromFile(new File(C11010c.m22280a().getFilesDir(), "offlineX"))})).mo17597a());
        }
    }

    /* renamed from: a */
    public final C19761i mo41192a(List<Pattern> list) {
        if (m48276a()) {
            this.f54443c = new C9756a(new C9767a(C11010c.m22280a()).mo17595a(this.f54444d).mo17596a(list).mo17599b(Arrays.asList(new Uri[]{Uri.fromFile(new File(C11010c.m22280a().getFilesDir(), "offlineX"))})).mo17598b(AppLog.getServerDeviceId()).mo17597a());
        } else {
            this.f54442b.mo19782a(list);
        }
        return this;
    }

    /* renamed from: a */
    public final C19761i mo41193a(boolean z) {
        if (!m48276a() || this.f54443c == null) {
            this.f54442b.mo19783a(z);
        } else {
            this.f54443c.f26550b = z;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.webkit.WebResourceResponse mo41190a(android.webkit.WebView r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ss.android.sdk.webview.i$a r0 = r2.f54441a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x000f
            com.ss.android.sdk.webview.i$a r0 = r2.f54441a     // Catch:{ all -> 0x002e }
            android.webkit.WebResourceResponse r0 = r0.mo41194a(r4)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = 0
            boolean r1 = m48276a()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x0024
            com.bytedance.falconx.a r1 = r2.f54443c     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x0021
            com.bytedance.falconx.a r1 = r2.f54443c     // Catch:{ Exception -> 0x002c }
            android.webkit.WebResourceResponse r3 = r1.mo17583a(r3, r4)     // Catch:{ Exception -> 0x002c }
            goto L_0x0022
        L_0x0021:
            r3 = r0
        L_0x0022:
            monitor-exit(r2)
            return r3
        L_0x0024:
            com.bytedance.ies.h.a r1 = r2.f54442b     // Catch:{ Exception -> 0x002c }
            android.webkit.WebResourceResponse r3 = r1.mo19780a(r3, r4)     // Catch:{ Exception -> 0x002c }
            monitor-exit(r2)
            return r3
        L_0x002c:
            monitor-exit(r2)
            return r0
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.sdk.webview.C19761i.mo41190a(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }
}
