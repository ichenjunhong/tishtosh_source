package com.bytedance.android.livesdk.p270ab;

import com.bytedance.ies.sdk.widgets.Widget;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.ab.b */
public class C4501b {

    /* renamed from: b */
    private static volatile C4501b f12273b;

    /* renamed from: a */
    public final WeakHashMap<Class, Widget> f12274a = new WeakHashMap<>();

    private C4501b() {
    }

    /* renamed from: a */
    public static C4501b m10832a() {
        if (f12273b == null) {
            synchronized (C4501b.class) {
                if (f12273b == null) {
                    f12273b = new C4501b();
                }
            }
        }
        return f12273b;
    }
}
