package com.bytedance.p763l.p764a;

import com.google.android.play.core.p1053e.C17342g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.l.a.b */
public class C12139b {

    /* renamed from: b */
    private static volatile C12139b f32050b;

    /* renamed from: a */
    public Map<String, C17342g> f32051a = new HashMap();

    private C12139b() {
    }

    /* renamed from: a */
    public static C12139b m24568a() {
        if (f32050b == null) {
            synchronized (C12139b.class) {
                if (f32050b == null) {
                    f32050b = new C12139b();
                }
            }
        }
        return f32050b;
    }
}
