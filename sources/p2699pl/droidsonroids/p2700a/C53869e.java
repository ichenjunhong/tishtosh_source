package p2699pl.droidsonroids.p2700a;

import android.os.Build;
import android.os.Build.VERSION;
import p2699pl.droidsonroids.p2700a.C53862c.C53864b;

/* renamed from: pl.droidsonroids.a.e */
final class C53869e implements C53864b {
    C53869e() {
    }

    /* renamed from: a */
    public final String[] mo113859a() {
        if (VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0) {
            return Build.SUPPORTED_ABIS;
        }
        if (!C53871g.m114515a(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        return new String[]{Build.CPU_ABI};
    }

    /* renamed from: a */
    public final void mo113858a(String str) {
        C53870f.m114513a(str);
    }

    /* renamed from: b */
    public final void mo113860b(String str) {
        C53870f.m114514b(str);
    }

    /* renamed from: d */
    public final String mo113862d(String str) {
        return str.substring(3, str.length() - 3);
    }

    /* renamed from: c */
    public final String mo113861c(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}
