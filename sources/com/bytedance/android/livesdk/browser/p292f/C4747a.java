package com.bytedance.android.livesdk.browser.p292f;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.android.livesdk.browser.f.a */
final class C4747a implements C4748b {
    C4747a() {
    }

    /* renamed from: a */
    public final WebResourceResponse mo10586a(Uri uri, WebView webView) {
        if (!TextUtils.equals(uri.getScheme(), "liveresource") || !TextUtils.equals(uri.getHost(), "file")) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(LeakCanaryFileProvider.f132050j);
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        File file = new File(queryParameter);
        if (!file.exists()) {
            return null;
        }
        try {
            return new WebResourceResponse("", "", new FileInputStream(file));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
