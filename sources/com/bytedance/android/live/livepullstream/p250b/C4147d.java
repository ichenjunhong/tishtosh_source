package com.bytedance.android.live.livepullstream.p250b;

import com.bytedance.android.live.livepullstream.p249a.C4134a;
import com.bytedance.android.live.livepullstream.p249a.C4136b;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdk.player.C8097k;

/* renamed from: com.bytedance.android.live.livepullstream.b.d */
public class C4147d implements C4140a {

    /* renamed from: a */
    private static volatile C4147d f11327a;

    /* renamed from: a */
    public final C4189h mo9528a() {
        return (C4189h) C4141b.m10288a(C4189h.class);
    }

    /* renamed from: b */
    public final C8097k mo9529b() {
        return (C8097k) m10294a(C8097k.class);
    }

    /* renamed from: c */
    public final C4181b mo9530c() {
        return (C4181b) C4141b.m10288a(C4181b.class);
    }

    /* renamed from: d */
    public final C4136b mo9531d() {
        return (C4136b) m10294a(C4136b.class);
    }

    /* renamed from: e */
    public final C4134a mo9532e() {
        return (C4134a) m10294a(C4134a.class);
    }

    /* renamed from: f */
    public static C4140a m10295f() {
        if (f11327a == null) {
            synchronized (C4147d.class) {
                if (f11327a == null) {
                    f11327a = new C4147d();
                }
            }
        }
        return f11327a;
    }

    /* renamed from: a */
    private static <T> T m10294a(Class<T> cls) {
        return C4141b.m10288a(cls);
    }
}
