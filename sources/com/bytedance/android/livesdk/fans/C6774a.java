package com.bytedance.android.livesdk.fans;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.p672e.C10753b;

/* renamed from: com.bytedance.android.livesdk.fans.a */
public class C6774a {

    /* renamed from: b */
    private static int f18553b = 180000;

    /* renamed from: c */
    private static volatile C6774a f18554c;

    /* renamed from: a */
    public long f18555a;

    /* renamed from: d */
    private C10753b f18556d = C10753b.m21794a(((IHostContext) C4116c.m10249a(IHostContext.class)).context(), "live_fans_comment_guide");

    private C6774a() {
    }

    /* renamed from: a */
    public static C6774a m14202a() {
        if (f18554c == null) {
            synchronized (C6774a.class) {
                if (f18554c == null) {
                    f18554c = new C6774a();
                }
            }
        }
        return f18554c;
    }
}
