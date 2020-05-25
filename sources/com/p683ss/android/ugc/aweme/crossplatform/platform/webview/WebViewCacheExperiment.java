package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@C10178a(mo18163a = "webview_cache_urls")
/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment */
public interface WebViewCacheExperiment {
    @C10179b(mo18165a = true)
    public static final String[] CACHE_URLS = null;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment$a */
    public static class C27229a {
        /* renamed from: a */
        public static List<String> m65643a() {
            try {
                String[] strArr = (String[]) C10181b.m20511a().mo18173b(WebViewCacheExperiment.class, true, "webview_cache_urls", 31744);
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
