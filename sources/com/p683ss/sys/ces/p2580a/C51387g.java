package com.p683ss.sys.ces.p2580a;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.p1096a.p1098b.C18481a;
import com.p683ss.p1096a.p1098b.C18483c;
import java.lang.reflect.Method;

/* renamed from: com.ss.sys.ces.a.g */
public final class C51387g {
    /* renamed from: a */
    public static String m110520a(Context context) {
        String str;
        StringBuilder sb;
        String str2;
        String a;
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            Class cls = connectionInfo.getClass();
            Method declaredMethod = cls.getDeclaredMethod(new String(C18481a.m44726a("6765744253534944")), new Class[0]);
            declaredMethod.setAccessible(true);
            str2 = (String) declaredMethod.invoke(connectionInfo, new Object[0]);
            try {
                Method declaredMethod2 = cls.getDeclaredMethod(new String(C18481a.m44726a("676574497041646472657373")), new Class[0]);
                declaredMethod2.setAccessible(true);
                String num = Integer.toString(((Integer) declaredMethod2.invoke(connectionInfo, new Object[0])).intValue());
                String a2 = C18483c.m44730a(null);
                String a3 = C18483c.m44730a(str2);
                String a4 = C18483c.m44730a(num);
                sb = new StringBuilder();
                sb.append((a3 == null || a3.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a3.trim());
                sb.append("[<!>]");
                sb.append((a2 == null || a2.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a2.trim());
                sb.append("[<!>]");
                if (a4 != null && a4.length() > 0) {
                    str = a4.trim();
                    sb.append(str);
                    sb.append("[<!>]");
                    return sb.toString().trim();
                }
            } catch (Throwable th) {
                th = th;
                String a5 = C18483c.m44730a(null);
                String a6 = C18483c.m44730a(str2);
                String a7 = C18483c.m44730a(null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((a6 != null || a6.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a6.trim());
                sb2.append("[<!>]");
                sb2.append((a5 != null || a5.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a5.trim());
                sb2.append("[<!>]");
                sb2.append((a7 != null || a7.length() <= 0) ? "0" : a7.trim());
                sb2.append("[<!>]");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = null;
            String a52 = C18483c.m44730a(null);
            String a62 = C18483c.m44730a(str2);
            String a72 = C18483c.m44730a(null);
            StringBuilder sb22 = new StringBuilder();
            sb22.append((a62 != null || a62.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a62.trim());
            sb22.append("[<!>]");
            sb22.append((a52 != null || a52.length() <= 0) ? TEVideoRecorder.FACE_BEAUTY_NULL : a52.trim());
            sb22.append("[<!>]");
            sb22.append((a72 != null || a72.length() <= 0) ? "0" : a72.trim());
            sb22.append("[<!>]");
            throw th;
        }
        str = "0";
        sb.append(str);
        sb.append("[<!>]");
        return sb.toString().trim();
    }
}
