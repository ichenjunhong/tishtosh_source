package com.snapchat.kit.sdk;

import android.content.Context;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.c */
public class C18249c {

    /* renamed from: a */
    public final Context f50410a;

    /* renamed from: b */
    public final String f50411b;

    /* renamed from: c */
    public final String f50412c;

    /* renamed from: d */
    final List<String> f50413d;

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.C18295c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.C18295c();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8 A[Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ExcHandler: p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x000b] */
    @com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snapchat.kit.sdk.core.security.C18301g mo36396a(com.google.gson.C17971f r10, android.content.SharedPreferences r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f50410a
            java.lang.String r1 = "com.snapchat.connect.sdk.secureSharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r1, r2)
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r3 = 0
            r1.load(r3)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r5 = 23
            if (r4 < r5) goto L_0x0028
            java.lang.String r4 = "rsa_public"
            boolean r4 = r11.contains(r4)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            if (r4 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            com.snapchat.kit.sdk.core.security.e r11 = com.snapchat.kit.sdk.core.security.C18300f.m44500a(r1)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            goto L_0x00b4
        L_0x0028:
            java.lang.String r4 = "rsa_public"
            java.lang.String r4 = r11.getString(r4, r3)     // Catch:{ p -> 0x0037, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1 }
            java.lang.Class<com.snapchat.kit.sdk.core.security.d$a> r5 = com.snapchat.kit.sdk.core.security.C18296d.C18298a.class
            java.lang.Object r4 = r10.mo34884a(r4, r5)     // Catch:{ p -> 0x0037, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1 }
            com.snapchat.kit.sdk.core.security.d$a r4 = (com.snapchat.kit.sdk.core.security.C18296d.C18298a) r4     // Catch:{ p -> 0x0037, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1 }
            goto L_0x0038
        L_0x0037:
            r4 = r3
        L_0x0038:
            com.snapchat.kit.sdk.core.security.d r5 = new com.snapchat.kit.sdk.core.security.d     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            android.content.Context r6 = r9.f50410a     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r5.<init>(r1, r6, r4)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            com.snapchat.kit.sdk.core.security.d$a r1 = r5.mo36699a()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            boolean r1 = r1.equals(r4)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0060
            android.content.SharedPreferences$Editor r6 = r11.edit()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            java.lang.String r7 = "rsa_public"
            com.snapchat.kit.sdk.core.security.d$a r8 = r5.mo36699a()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            java.lang.String r8 = r10.mo34889b(r8)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            android.content.SharedPreferences$Editor r6 = r6.putString(r7, r8)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r6.apply()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
        L_0x0060:
            if (r1 != 0) goto L_0x0083
            java.lang.String r1 = "encoded_secret"
            java.lang.String r1 = r11.getString(r1, r3)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = r5.decrypt(r1)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            if (r1 != 0) goto L_0x0071
            goto L_0x0083
        L_0x0071:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            byte[] r6 = r1.getBytes()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            int r1 = r1.length()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r7 = 32
            int r1 = r1 - r7
            java.lang.String r8 = "AES"
            r3.<init>(r6, r1, r7, r8)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
        L_0x0083:
            if (r3 != 0) goto L_0x00af
            java.lang.String r1 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r1)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r2 = 256(0x100, float:3.59E-43)
            r1.init(r2)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            javax.crypto.SecretKey r3 = r1.generateKey()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            java.lang.String r1 = "encoded_secret"
            java.lang.String r2 = new java.lang.String     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            byte[] r6 = r3.getEncoded()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r2.<init>(r6)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            java.lang.String r2 = r5.encrypt(r2)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            android.content.SharedPreferences$Editor r11 = r11.putString(r1, r2)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r11.apply()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r2 = 1
        L_0x00af:
            com.snapchat.kit.sdk.core.security.e r11 = new com.snapchat.kit.sdk.core.security.e     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r11.<init>(r3, r2)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
        L_0x00b4:
            boolean r1 = r11.f50512b     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            if (r1 == 0) goto L_0x00c3
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r1.apply()     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
        L_0x00c3:
            com.snapchat.kit.sdk.core.security.a r1 = new com.snapchat.kit.sdk.core.security.a     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            javax.crypto.SecretKey r11 = r11.f50511a     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            r1.<init>(r11, r10)     // Catch:{ p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x00d1, Exception -> 0x00cb }
            goto L_0x00d6
        L_0x00cb:
            com.snapchat.kit.sdk.core.security.c r1 = new com.snapchat.kit.sdk.core.security.c
            r1.<init>()
            goto L_0x00d6
        L_0x00d1:
            com.snapchat.kit.sdk.core.security.c r1 = new com.snapchat.kit.sdk.core.security.c
            r1.<init>()
        L_0x00d6:
            com.snapchat.kit.sdk.core.security.g r11 = new com.snapchat.kit.sdk.core.security.g
            r11.<init>(r0, r1, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C18249c.mo36396a(com.google.gson.f, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.g");
    }

    C18249c(Context context, String str, String str2, List<String> list) {
        this.f50410a = context;
        this.f50411b = str;
        this.f50412c = str2;
        this.f50413d = list;
    }
}
