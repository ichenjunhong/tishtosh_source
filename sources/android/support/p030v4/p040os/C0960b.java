package android.support.p030v4.p040os;

import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: android.support.v4.os.b */
public final class C0960b {
    /* renamed from: a */
    public static String m2807a(File file) {
        if (VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException unused) {
        }
        return "unknown";
    }
}
