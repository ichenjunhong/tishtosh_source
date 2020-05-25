package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.Map;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.b */
public final class C52131b {
    /* renamed from: b */
    private static C52132c m111500b(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        C52132c cVar = new C52132c(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
        return cVar;
    }

    /* renamed from: a */
    public final String mo108846a(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return m111500b(twitterAuthConfig, twitterAuthToken, str, str2, str3, map).mo108847a();
    }
}
