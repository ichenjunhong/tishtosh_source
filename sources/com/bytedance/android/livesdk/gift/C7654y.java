package com.bytedance.android.livesdk.gift;

import com.bytedance.android.livesdkapi.p460m.C8843a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.y */
public final class C7654y {

    /* renamed from: c */
    private static C7654y f21083c;

    /* renamed from: a */
    public C8843a f21084a;

    /* renamed from: b */
    public final List<Object> f21085b = new ArrayList();

    private C7654y() {
    }

    /* renamed from: b */
    public final long mo14018b() {
        if (this.f21084a != null) {
            return this.f21084a.f24127a;
        }
        return 0;
    }

    /* renamed from: a */
    public static synchronized C7654y m15668a() {
        C7654y yVar;
        synchronized (C7654y.class) {
            if (f21083c == null) {
                f21083c = new C7654y();
            }
            yVar = f21083c;
        }
        return yVar;
    }
}
