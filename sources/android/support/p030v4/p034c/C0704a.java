package android.support.p030v4.p034c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.c.a */
public final class C0704a {
    /* renamed from: a */
    public static boolean m2035a(ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo a = C0705b.m2036a(connectivityManager);
        if (a == null) {
            return true;
        }
        switch (a.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }
}
