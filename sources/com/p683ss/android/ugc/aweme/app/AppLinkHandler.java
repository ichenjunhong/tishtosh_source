package com.p683ss.android.ugc.aweme.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;

/* renamed from: com.ss.android.ugc.aweme.app.AppLinkHandler */
public class AppLinkHandler extends DeepLinkHandlerActivity {

    /* renamed from: f */
    private static final String[] f61126f = {"v.douyin.com", "v16.musical.ly", "v16.tiktokv.com", "vt.tiktok.com", "vm.tiktok.com", "z.douyin.com"};

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        C23138r rVar;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onCreate", true);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && (TextUtils.equals(WebKitApi.SCHEME_HTTP, data.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, data.getScheme()))) {
            try {
                String host = data.getHost();
                if (TextUtils.equals("www.tiktok.com", host)) {
                    rVar = new C23047bc(getApplicationContext());
                } else {
                    if (!TextUtils.isEmpty(host)) {
                        String[] strArr = f61126f;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (TextUtils.equals(host, strArr[i])) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        rVar = new C23053bh(getApplicationContext());
                    } else {
                        rVar = new C23050be(getApplicationContext());
                    }
                }
                Uri a = rVar.mo47771a(data);
                if (a == null && !(rVar instanceof C23050be)) {
                    a = new C23050be(getApplicationContext()).mo47771a(data);
                }
                if (a != null) {
                    intent.setData(a);
                    this.f61151a.mo47833a("link_direct");
                    this.f61151a.mo47834b("google");
                } else {
                    Intent a2 = C23060d.m56596a(this, data.buildUpon().appendQueryParameter("url", data.toString()).build(), true);
                    if (a2 != null) {
                        if (!this.f61153c) {
                            a2.addFlags(268435456);
                        }
                        startActivity(a2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onCreate", false);
    }

    /* renamed from: a */
    public final Intent mo47293a(Uri uri, boolean z, boolean z2) {
        if (uri == null || !TextUtils.equals("shortlink", uri.getHost())) {
            return super.mo47293a(uri, z, z2);
        }
        if (m56213a()) {
            return null;
        }
        return C47659c.m103160a(this);
    }
}
