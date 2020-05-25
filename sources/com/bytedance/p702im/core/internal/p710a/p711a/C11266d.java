package com.bytedance.p702im.core.internal.p710a.p711a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p705b.C11176d;

/* renamed from: com.bytedance.im.core.internal.a.a.d */
public class C11266d {

    /* renamed from: a */
    private static volatile C11266d f30350a;

    /* renamed from: a */
    public static C11266d m22878a() {
        if (f30350a == null) {
            synchronized (C11266d.class) {
                if (f30350a == null) {
                    f30350a = new C11266d();
                }
            }
        }
        return f30350a;
    }

    /* renamed from: b */
    public final void mo20960b(String str) {
        m22881a(str, true);
    }

    /* renamed from: c */
    public static boolean m22883c(String str) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        boolean z = false;
        if (a == null) {
            return false;
        }
        try {
            a.mo21000a(str);
            z = true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("execSQL: ");
            sb.append(str);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
        }
        return z;
    }

    /* renamed from: d */
    public static C11302f m22884d(String str) {
        C11500m.m23560b();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C11299d a = C11265c.m22875a();
        if (a == null) {
            return null;
        }
        try {
            return a.mo21002b(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("compileStatement: ");
            sb.append(str);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m22880a(String str) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null) {
            C11467e.m23468b(str, "startTransaction failed by db = null");
        } else if (a.mo21004c()) {
            StringBuilder sb = new StringBuilder("is in transaction, current tid=");
            sb.append(Thread.currentThread());
            C11467e.m23465a(sb.toString(), (Throwable) new RuntimeException());
        } else {
            try {
                a.mo21005d();
                C11467e.m23468b(str, "startTransaction successfully");
            } catch (Exception e) {
                C11467e.m23465a("startTransaction", (Throwable) e);
                C11176d.m22632a(e);
            }
        }
    }

    /* renamed from: a */
    public static C11287b m22879a(String str, String[] strArr) {
        C11287b bVar;
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null) {
            return null;
        }
        try {
            bVar = a.mo20999a(str, strArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("rawQuery ");
            sb.append(str);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
            bVar = null;
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m22881a(String str, boolean z) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null) {
            C11467e.m23468b(str, "endTransaction failed by db = null");
        } else if (a.mo21004c()) {
            if (z) {
                try {
                    a.mo21006e();
                } catch (Exception e) {
                    C11467e.m23465a("endTransaction", (Throwable) e);
                    C11176d.m22632a(e);
                    return;
                }
            }
            a.mo21007f();
            C11467e.m23468b(str, "endTransaction successfully");
        } else {
            StringBuilder sb = new StringBuilder("no transaction, current tid=");
            sb.append(Thread.currentThread());
            C11467e.m23465a(sb.toString(), (Throwable) new RuntimeException());
        }
    }

    /* renamed from: a */
    public static long m22877a(String str, String str2, ContentValues contentValues) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a.mo20998a(str, (String) null, contentValues);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("insert ");
            sb.append(str);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m22882a(String str, String str2, String[] strArr) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (a.mo20997a(str, str2, strArr) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("delete sql ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static int m22876a(String str, ContentValues contentValues, String str2, String[] strArr) {
        C11500m.m23560b();
        C11299d a = C11265c.m22875a();
        if (a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a.mo20996a(str, contentValues, str2, strArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("update ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            C11467e.m23465a(sb.toString(), (Throwable) e);
            C11176d.m22632a(e);
            return -1;
        }
    }
}
