package android.support.p030v4.p038f;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: android.support.v4.f.j */
public final class C0793j {
    /* renamed from: a */
    public static int m2263a(Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m2264a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
