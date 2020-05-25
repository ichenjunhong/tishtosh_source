package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.p2617a.C52103f;
import java.util.TreeMap;
import okhttp3.C53506ae;
import p2666g.C53061b;
import p2666g.p2672c.C53078i;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

public final class OAuth1aService extends C52133d {

    /* renamed from: a */
    public OAuthApi f129750a = ((OAuthApi) this.f129774e.mo110651a(OAuthApi.class));

    public interface OAuthApi {
        @C53084o(mo110612a = "/oauth/access_token")
        C53061b<C53506ae> getAccessToken(@C53078i(mo110608a = "Authorization") String str, @C53089t(mo110619a = "oauth_verifier") String str2);

        @C53084o(mo110612a = "/oauth/request_token")
        C53061b<C53506ae> getTempToken(@C53078i(mo110608a = "Authorization") String str);
    }

    /* renamed from: a */
    public final C52068b<C53506ae> mo108830a(final C52068b<OAuthResponse> bVar) {
        return new C52068b<C53506ae>() {
            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                bVar.mo23367a(tVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ IOException -> 0x005d }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo23366a(com.twitter.sdk.android.core.C52077i<okhttp3.C53506ae> r5) {
                /*
                    r4 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r1 = 0
                    java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0056 }
                    java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
                    T r5 = r5.f129666a     // Catch:{ all -> 0x0056 }
                    okhttp3.ae r5 = (okhttp3.C53506ae) r5     // Catch:{ all -> 0x0056 }
                    java.io.InputStream r5 = r5.byteStream()     // Catch:{ all -> 0x0056 }
                    r3.<init>(r5)     // Catch:{ all -> 0x0056 }
                    r2.<init>(r3)     // Catch:{ all -> 0x0056 }
                L_0x0018:
                    java.lang.String r5 = r2.readLine()     // Catch:{ all -> 0x0053 }
                    if (r5 == 0) goto L_0x0022
                    r0.append(r5)     // Catch:{ all -> 0x0053 }
                    goto L_0x0018
                L_0x0022:
                    r2.close()     // Catch:{ IOException -> 0x005d }
                    java.lang.String r5 = r0.toString()     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.internal.oauth.OAuthResponse r0 = com.twitter.sdk.android.core.internal.oauth.OAuth1aService.m111487a(r5)     // Catch:{ IOException -> 0x005d }
                    if (r0 != 0) goto L_0x0048
                    com.twitter.sdk.android.core.b r0 = r2     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.o r1 = new com.twitter.sdk.android.core.o     // Catch:{ IOException -> 0x005d }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005d }
                    java.lang.String r3 = "Failed to parse auth response: "
                    r2.<init>(r3)     // Catch:{ IOException -> 0x005d }
                    r2.append(r5)     // Catch:{ IOException -> 0x005d }
                    java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x005d }
                    r1.<init>(r5)     // Catch:{ IOException -> 0x005d }
                    r0.mo23367a(r1)     // Catch:{ IOException -> 0x005d }
                    goto L_0x006e
                L_0x0048:
                    com.twitter.sdk.android.core.b r5 = r2     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.i r2 = new com.twitter.sdk.android.core.i     // Catch:{ IOException -> 0x005d }
                    r2.<init>(r0, r1)     // Catch:{ IOException -> 0x005d }
                    r5.mo23366a(r2)     // Catch:{ IOException -> 0x005d }
                    return
                L_0x0053:
                    r5 = move-exception
                    r1 = r2
                    goto L_0x0057
                L_0x0056:
                    r5 = move-exception
                L_0x0057:
                    if (r1 == 0) goto L_0x005f
                    r1.close()     // Catch:{ IOException -> 0x005d }
                    goto L_0x005f
                L_0x005d:
                    r5 = move-exception
                    goto L_0x0060
                L_0x005f:
                    throw r5     // Catch:{ IOException -> 0x005d }
                L_0x0060:
                    com.twitter.sdk.android.core.b r0 = r2
                    com.twitter.sdk.android.core.o r1 = new com.twitter.sdk.android.core.o
                    java.lang.String r2 = r5.getMessage()
                    r1.<init>(r2, r5)
                    r0.mo23367a(r1)
                L_0x006e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.oauth.OAuth1aService.C521251.mo23366a(com.twitter.sdk.android.core.i):void");
            }
        };
    }

    /* renamed from: a */
    public final String mo108831a(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter(C42311c.f106863g, C52225r.m111639b()).appendQueryParameter("app", twitterAuthConfig.f129647a).build().toString();
    }

    /* renamed from: a */
    public static OAuthResponse m111487a(String str) {
        long j;
        TreeMap a = C52103f.m111438a(str, false);
        String str2 = (String) a.get("oauth_token");
        String str3 = (String) a.get("oauth_token_secret");
        String str4 = (String) a.get("screen_name");
        if (a.containsKey("user_id")) {
            j = Long.parseLong((String) a.get("user_id"));
        } else {
            j = 0;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j);
    }

    public OAuth1aService(C52225r rVar, C52136q qVar) {
        super(rVar, qVar);
    }
}
