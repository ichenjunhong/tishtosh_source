package com.p683ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@C10178a(mo18163a = "webview_cache_pool_switch")
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment */
public interface WebViewPoolExperiment {
    @C10179b(mo18165a = true)
    public static final String[] URLS = null;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment$a */
    public static class C27104a {
        /* renamed from: a */
        public static List<String> m65413a() {
            try {
                String[] strArr = (String[]) C10181b.m20511a().mo18173b(WebViewPoolExperiment.class, true, "webview_cache_pool_switch", 31744);
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
