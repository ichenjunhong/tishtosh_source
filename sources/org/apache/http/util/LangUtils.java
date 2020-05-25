package org.apache.http.util;

public final class LangUtils {
    public static int hashCode(int i, int i2) {
        return (i * 37) + i2;
    }

    public static int hashCode(int i, boolean z) {
        return hashCode(i, z ? 1 : 0);
    }

    public static int hashCode(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode(i, i2);
    }
}
