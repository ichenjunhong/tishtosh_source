package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.p2617a.C52103f;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.c */
final class C52132c {

    /* renamed from: a */
    private static final SecureRandom f129764a = new SecureRandom();

    /* renamed from: b */
    private final TwitterAuthConfig f129765b;

    /* renamed from: c */
    private final TwitterAuthToken f129766c;

    /* renamed from: d */
    private final String f129767d;

    /* renamed from: e */
    private final String f129768e;

    /* renamed from: f */
    private final String f129769f;

    /* renamed from: g */
    private final Map<String, String> f129770g;

    /* renamed from: c */
    private static String m111508c() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    /* renamed from: b */
    private static String m111507b() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(System.nanoTime()));
        sb.append(String.valueOf(Math.abs(f129764a.nextLong())));
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo108847a() {
        String b = m111507b();
        String c = m111508c();
        return m111504a(b, c, m111502a(m111503a(b, c)));
    }

    /* renamed from: a */
    private String m111502a(String str) {
        String str2;
        try {
            if (this.f129766c != null) {
                str2 = this.f129766c.f129650c;
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C52103f.m111437a(this.f129765b.f129648b));
            sb.append('&');
            sb.append(C52103f.m111437a(str2));
            String sb2 = sb.toString();
            byte[] bytes = str.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(sb2.getBytes("UTF8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            byte[] doFinal = instance.doFinal(bytes);
            return ByteString.m114278of(doFinal, 0, doFinal.length).base64();
        } catch (InvalidKeyException unused) {
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            return "";
        } catch (UnsupportedEncodingException unused3) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m111505a(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i = 0;
        for (Entry entry : treeMap.entrySet()) {
            sb.append(C52103f.m111440b(C52103f.m111440b((String) entry.getKey())));
            sb.append("%3D");
            sb.append(C52103f.m111440b(C52103f.m111440b((String) entry.getValue())));
            i++;
            if (i < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m111503a(String str, String str2) {
        URI create = URI.create(this.f129769f);
        TreeMap a = C52103f.m111439a(create, true);
        if (this.f129770g != null) {
            a.putAll(this.f129770g);
        }
        if (this.f129767d != null) {
            a.put("oauth_callback", this.f129767d);
        }
        a.put("oauth_consumer_key", this.f129765b.f129647a);
        a.put("oauth_nonce", str);
        a.put("oauth_signature_method", "HMAC-SHA1");
        a.put("oauth_timestamp", str2);
        if (!(this.f129766c == null || this.f129766c.f129649b == null)) {
            a.put("oauth_token", this.f129766c.f129649b);
        }
        a.put("oauth_version", "1.0");
        StringBuilder sb = new StringBuilder();
        sb.append(create.getScheme());
        sb.append("://");
        sb.append(create.getHost());
        sb.append(create.getPath());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f129768e.toUpperCase(Locale.ENGLISH));
        sb3.append('&');
        sb3.append(C52103f.m111440b(sb2));
        sb3.append('&');
        sb3.append(m111505a(a));
        return sb3.toString();
    }

    /* renamed from: a */
    private static void m111506a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(C52103f.m111440b(str));
            sb.append("=\"");
            sb.append(C52103f.m111440b(str2));
            sb.append("\",");
        }
    }

    /* renamed from: a */
    private String m111504a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("OAuth");
        m111506a(sb, "oauth_callback", this.f129767d);
        m111506a(sb, "oauth_consumer_key", this.f129765b.f129647a);
        m111506a(sb, "oauth_nonce", str);
        m111506a(sb, "oauth_signature", str3);
        m111506a(sb, "oauth_signature_method", "HMAC-SHA1");
        m111506a(sb, "oauth_timestamp", str2);
        if (this.f129766c != null) {
            str4 = this.f129766c.f129649b;
        } else {
            str4 = null;
        }
        m111506a(sb, "oauth_token", str4);
        m111506a(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    C52132c(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.f129765b = twitterAuthConfig;
        this.f129766c = twitterAuthToken;
        this.f129767d = str;
        this.f129768e = str2;
        this.f129769f = str3;
        this.f129770g = map;
    }
}
