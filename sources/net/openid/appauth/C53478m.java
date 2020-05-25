package net.openid.appauth;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import net.openid.appauth.p2682c.C53455a;

/* renamed from: net.openid.appauth.m */
public final class C53478m {

    /* renamed from: a */
    private static final Pattern f132316a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    /* renamed from: a */
    public static String m113564a() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }

    /* renamed from: a */
    public static void m113565a(String str) {
        boolean z;
        boolean z2 = false;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        C53487p.m113587a(z, (Object) "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() <= 128) {
            z2 = true;
        }
        C53487p.m113587a(z2, (Object) "codeVerifier length is longer than allowed by the PKCE specification");
        C53487p.m113587a(f132316a.matcher(str).matches(), (Object) "codeVerifier string contains illegal characters");
    }

    /* renamed from: b */
    public static String m113566b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            C53455a.m113515c("SHA-256 is not supported on this device! Using plain challenge", e);
            return str;
        } catch (UnsupportedEncodingException e2) {
            C53455a.m113516d("ISO-8859-1 encoding not supported on this device!", e2);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e2);
        }
    }
}
