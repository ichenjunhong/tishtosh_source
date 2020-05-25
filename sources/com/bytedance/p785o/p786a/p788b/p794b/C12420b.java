package com.bytedance.p785o.p786a.p788b.p794b;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p795c.C12425e;
import java.util.Locale;

/* renamed from: com.bytedance.o.a.b.b.b */
public final class C12420b extends C12425e {
    /* renamed from: b */
    public final String mo23475b() {
        return "OppoMessageNPEPlugin";
    }

    /* renamed from: c */
    public final boolean mo23478c() {
        boolean z;
        int i = VERSION.SDK_INT;
        if (i == 22 || i == 21) {
            try {
                String str = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str)) {
                    z = str.toLowerCase(Locale.getDefault()).contains("oppo");
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo23468a(Thread thread, Throwable th) throws Throwable {
        if (th instanceof NullPointerException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!"android.os.Message".equals(stackTraceElement.getClassName()) || !"toString".equals(stackTraceElement.getMethodName())) {
                    i++;
                } else {
                    C12409d.m24989a(mo23475b(), "Hint OppoMessageNPE case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }
}
