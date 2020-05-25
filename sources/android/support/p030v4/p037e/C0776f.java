package android.support.p030v4.p037e;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.e.f */
public final class C0776f {

    /* renamed from: a */
    private static final Locale f2665a = new Locale("", "");

    /* renamed from: b */
    private static int m2190b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m2189a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f2665a)) {
            String a = C0764b.m2179a(locale);
            if (a == null) {
                return m2190b(locale);
            }
            if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
