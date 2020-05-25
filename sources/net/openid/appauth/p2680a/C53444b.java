package net.openid.appauth.p2680a;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: net.openid.appauth.a.b */
public final class C53444b {

    /* renamed from: a */
    public final String f132166a;

    /* renamed from: b */
    public final Set<String> f132167b;

    /* renamed from: c */
    public final String f132168c;

    /* renamed from: d */
    public final Boolean f132169d;

    public final int hashCode() {
        int hashCode = (((this.f132166a.hashCode() * 92821) + this.f132168c.hashCode()) * 92821) + (this.f132169d.booleanValue() ? 1 : 0);
        for (String hashCode2 : this.f132167b) {
            hashCode = (hashCode * 92821) + hashCode2.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    private static String m113498a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    /* renamed from: a */
    private static Set<String> m113499a(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature a : signatureArr) {
            hashSet.add(m113498a(a));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C53444b)) {
            return false;
        }
        C53444b bVar = (C53444b) obj;
        if (!this.f132166a.equals(bVar.f132166a) || !this.f132168c.equals(bVar.f132168c) || this.f132169d != bVar.f132169d || !this.f132167b.equals(bVar.f132167b)) {
            return false;
        }
        return true;
    }

    public C53444b(PackageInfo packageInfo, boolean z) {
        this(packageInfo.packageName, m113499a(packageInfo.signatures), packageInfo.versionName, z);
    }

    private C53444b(String str, Set<String> set, String str2, boolean z) {
        this.f132166a = str;
        this.f132167b = set;
        this.f132168c = str2;
        this.f132169d = Boolean.valueOf(z);
    }
}
