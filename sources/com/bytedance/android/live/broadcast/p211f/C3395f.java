package com.bytedance.android.live.broadcast.p211f;

import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.p193a.C3025a;
import com.bytedance.android.live.broadcast.utils.C3634d;

/* renamed from: com.bytedance.android.live.broadcast.f.f */
public class C3395f implements C3387c {

    /* renamed from: a */
    private static volatile C3395f f9696a;

    /* renamed from: a */
    public final C3040c mo8740a() {
        return (C3040c) C3388d.m9148a(C3040c.class);
    }

    /* renamed from: b */
    public final C3203b mo8741b() {
        return (C3203b) C3388d.m9148a(C3203b.class);
    }

    /* renamed from: c */
    public final C3634d mo8742c() {
        return (C3634d) C3388d.m9148a(C3634d.class);
    }

    /* renamed from: d */
    public final C3386b mo8743d() {
        return (C3386b) C3388d.m9148a(C3386b.class);
    }

    /* renamed from: e */
    public final C3025a mo8744e() {
        return (C3025a) C3388d.m9148a(C3025a.class);
    }

    /* renamed from: f */
    public static C3387c m9156f() {
        if (f9696a == null) {
            synchronized (C3395f.class) {
                if (f9696a == null) {
                    f9696a = new C3395f();
                }
            }
        }
        return f9696a;
    }
}
