package com.bytedance.p763l;

import android.content.Context;
import com.bytedance.p763l.p764a.C12140c;
import com.bytedance.p763l.p765b.C12150a;
import java.util.Map;

/* renamed from: com.bytedance.l.c */
public final class C12152c {

    /* renamed from: a */
    public static C12149b f32078a;

    /* renamed from: b */
    public static boolean f32079b;

    /* renamed from: c */
    private static Context f32080c;

    /* renamed from: d */
    private static C12137a f32081d;

    /* renamed from: a */
    public static Context m24592a() {
        return f32080c;
    }

    /* renamed from: b */
    public static C12137a m24596b() {
        return f32081d;
    }

    /* renamed from: c */
    public static Map<String, C12150a> m24597c() {
        return f32078a.mo23050a();
    }

    /* renamed from: a */
    public static C12150a m24593a(String str) {
        return f32078a.mo23053b(str);
    }

    /* renamed from: a */
    public static synchronized void m24594a(C12137a aVar) {
        synchronized (C12152c.class) {
            if (!f32079b) {
                f32081d = aVar;
                f32080c = aVar.mo23048a();
                f32078a = C12140c.m24571b();
                f32079b = true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m24595a(String str, String str2) {
        return f32078a.mo23052a(str, str2);
    }
}
