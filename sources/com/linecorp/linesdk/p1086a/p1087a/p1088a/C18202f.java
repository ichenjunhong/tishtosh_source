package com.linecorp.linesdk.p1086a.p1087a.p1088a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: com.linecorp.linesdk.a.a.a.f */
final class C18202f {

    /* renamed from: a */
    private final PackageInfo f50251a;

    /* renamed from: b */
    private final String f50252b;

    /* renamed from: c */
    private String f50253c;

    /* renamed from: a */
    public final String mo36285a() {
        String str;
        String str2;
        if (this.f50253c != null) {
            return this.f50253c;
        }
        if (this.f50251a == null) {
            str = "UNK";
        } else {
            str = this.f50251a.packageName;
        }
        if (this.f50251a == null) {
            str2 = "UNK";
        } else {
            str2 = this.f50251a.versionName;
        }
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" ChannelSDK/");
        sb.append(this.f50252b);
        sb.append(" (Linux; U; Android ");
        sb.append(VERSION.RELEASE);
        sb.append("; ");
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        sb.append("; ");
        sb.append(Build.MODEL);
        sb.append(" Build/");
        sb.append(Build.ID);
        sb.append(")");
        this.f50253c = sb.toString();
        return this.f50253c;
    }

    /* renamed from: a */
    private static PackageInfo m44408a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (NameNotFoundException unused) {
            throw null;
        }
    }

    C18202f(Context context, String str) {
        this.f50251a = m44408a(context);
        this.f50252b = str;
    }
}
