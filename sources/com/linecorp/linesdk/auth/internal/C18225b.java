package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.StringTokenizer;

/* renamed from: com.linecorp.linesdk.auth.internal.b */
final class C18225b {

    /* renamed from: a */
    final int f50315a;

    /* renamed from: b */
    final int f50316b;

    /* renamed from: c */
    final int f50317c;

    public final int hashCode() {
        return (((this.f50315a * 31) + this.f50316b) * 31) + this.f50317c;
    }

    /* renamed from: a */
    public static C18225b m44422a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", 128).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            try {
                return new C18225b(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            } catch (NullPointerException | NumberFormatException unused) {
                return null;
            }
        } catch (NameNotFoundException unused2) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18225b bVar = (C18225b) obj;
        if (this.f50315a == bVar.f50315a && this.f50316b == bVar.f50316b && this.f50317c == bVar.f50317c) {
            return true;
        }
        return false;
    }

    public C18225b(int i, int i2, int i3) {
        this.f50315a = i;
        this.f50316b = i2;
        this.f50317c = i3;
    }
}
