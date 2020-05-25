package com.p683ss.android.ttplatformsdk.p1224c;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

/* renamed from: com.ss.android.ttplatformsdk.c.c */
final class C20062c implements C20060a {

    /* renamed from: a */
    private static final String f55136a = "c";

    /* renamed from: b */
    private Context f55137b;

    C20062c(Context context) {
        this.f55137b = context;
    }

    /* renamed from: a */
    private boolean m49547a(String str) {
        boolean z = false;
        if (this.f55137b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                if (this.f55137b.getPackageManager().getPackageInfo(str, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m49548b(String str) {
        ApplicationInfo applicationInfo;
        if (this.f55137b == null || TextUtils.isEmpty(str) || !m49547a(str)) {
            return -1;
        }
        try {
            PackageManager packageManager = this.f55137b.getPackageManager();
            if (TextUtils.equals(str, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(str, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getInt("TTOPEN_SDK_VERSION", 0);
            }
        } catch (NameNotFoundException unused) {
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo42111a(String str, String str2, boolean z) {
        if (this.f55137b != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_login", Boolean.valueOf(z));
                String str3 = "user_name";
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put(str3, str);
                String str4 = "user_avatar";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                contentValues.put(str4, str2);
                StringBuilder sb = new StringBuilder("content://");
                sb.append(this.f55137b.getPackageName());
                sb.append(".ttplatformapi.AccountProvider/account");
                this.f55137b.getContentResolver().insert(Uri.parse(sb.toString()), contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42110a(java.lang.String r5, long r6, java.lang.String r8, android.os.Bundle r9) {
        /*
            r4 = this;
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L_0x0094
            r9 = 2
            int r0 = r4.m49548b(r5)
            r1 = 1
            if (r0 < r9) goto L_0x0040
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = ".ttopenapi.TtEntryActivity"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r5, r2)
            r9.setComponent(r0)
            android.content.Context r0 = r4.f55137b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ActivityInfo r9 = r9.resolveActivityInfo(r0, r2)
            if (r9 == 0) goto L_0x0040
            boolean r9 = r9.exported
            if (r9 == 0) goto L_0x0040
            r9 = 1
            goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            if (r9 == 0) goto L_0x0094
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = "_tt_params_intent_type"
            r9.putInt(r0, r1)
            java.lang.String r0 = "_tt_params_extra"
            r1 = 0
            r9.putBundle(r0, r1)
            java.lang.String r0 = "_tt_params_sessionid"
            r9.putString(r0, r8)
            java.lang.String r8 = "_tt_params_userid"
            r9.putLong(r8, r6)
            java.lang.String r6 = "_tt_params_package_name"
            android.content.Context r7 = r4.f55137b
            java.lang.String r7 = r7.getPackageName()
            r9.putString(r6, r7)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r0 = ".ttopenapi.TtEntryActivity"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r5, r8)
            r6.setComponent(r7)
            r6.putExtras(r9)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r5)
            android.content.Context r5 = r4.f55137b
            r5.startActivity(r6)
            return
        L_0x0094:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "target package: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = " not supported"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttplatformsdk.p1224c.C20062c.mo42110a(java.lang.String, long, java.lang.String, android.os.Bundle):void");
    }
}
