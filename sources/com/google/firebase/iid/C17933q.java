package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import com.google.android.gms.common.util.C15524o;
import com.google.firebase.C17855b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: com.google.firebase.iid.q */
public final class C17933q {

    /* renamed from: a */
    private final Context f49800a;

    /* renamed from: b */
    private String f49801b;

    /* renamed from: c */
    private String f49802c;

    /* renamed from: d */
    private int f49803d;

    /* renamed from: e */
    private int f49804e;

    public C17933q(Context context) {
        this.f49800a = context;
    }

    /* renamed from: a */
    public final synchronized int mo34782a() {
        if (this.f49804e != 0) {
            return this.f49804e;
        }
        PackageManager packageManager = this.f49800a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C15524o.m32301i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f49804e = 1;
                return this.f49804e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C15524o.m32301i()) {
                this.f49804e = 2;
            } else {
                this.f49804e = 1;
            }
            return this.f49804e;
        }
        this.f49804e = 2;
        return this.f49804e;
    }

    /* renamed from: a */
    public static String m43949a(C17855b bVar) {
        String str = bVar.mo34681b().f49692e;
        if (str != null) {
            return str;
        }
        String str2 = bVar.mo34681b().f49689b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: a */
    public static String m43950a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized String mo34783b() {
        if (this.f49801b == null) {
            m43951e();
        }
        return this.f49801b;
    }

    /* renamed from: c */
    public final synchronized String mo34784c() {
        if (this.f49802c == null) {
            m43951e();
        }
        return this.f49802c;
    }

    /* renamed from: d */
    public final synchronized int mo34785d() {
        if (this.f49803d == 0) {
            PackageInfo a = m43948a("com.google.android.gms");
            if (a != null) {
                this.f49803d = a.versionCode;
            }
        }
        return this.f49803d;
    }

    /* renamed from: e */
    private final synchronized void m43951e() {
        PackageInfo a = m43948a(this.f49800a.getPackageName());
        if (a != null) {
            this.f49801b = Integer.toString(a.versionCode);
            this.f49802c = a.versionName;
        }
    }

    /* renamed from: a */
    private final PackageInfo m43948a(String str) {
        try {
            return this.f49800a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
