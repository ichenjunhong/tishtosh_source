package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.p1037d.C15377d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.u */
public final class C15530u {

    /* renamed from: a */
    private static final int f40001a = Process.myUid();

    /* renamed from: b */
    private static final Method f40002b = m32314a();

    /* renamed from: c */
    private static final Method f40003c = m32318b();

    /* renamed from: d */
    private static final Method f40004d = m32319c();

    /* renamed from: e */
    private static final Method f40005e = m32320d();

    /* renamed from: f */
    private static final Method f40006f = m32321e();

    /* renamed from: g */
    private static final Method f40007g = m32322f();

    /* renamed from: h */
    private static final Method f40008h = m32323g();

    /* renamed from: a */
    private static WorkSource m32311a(int i, String str) {
        WorkSource workSource = new WorkSource();
        if (f40003c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f40003c.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (f40002b != null) {
            try {
                f40002b.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m32312a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo a = C15377d.m31951a(context).mo28318a(str, 0);
            if (a != null) {
                return m32311a(a.uid, str);
            }
            String str2 = "Could not get applicationInfo from package: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        } catch (NameNotFoundException unused) {
            String str3 = "Could not find package: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            return null;
        }
    }

    /* renamed from: b */
    private static int m32317b(WorkSource workSource) {
        if (f40004d != null) {
            try {
                return ((Integer) f40004d.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static String m32313a(WorkSource workSource, int i) {
        if (f40006f != null) {
            try {
                return (String) f40006f.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m32315a(WorkSource workSource) {
        int b = workSource == null ? 0 : m32317b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            String a = m32313a(workSource, i);
            if (!C15528s.m32308a(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m32316a(Context context) {
        if (context == null || context.getPackageManager() == null || C15377d.m31951a(context).mo28317a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Method m32314a() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m32318b() {
        if (C15524o.m32296d()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m32319c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m32320d() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m32321e() {
        if (C15524o.m32296d()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static final Method m32322f() {
        if (C15524o.m32302j()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static final Method m32323g() {
        if (C15524o.m32302j()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
