package com.p683ss.android.ugc.aweme.port.internal;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.g */
public final class C39658g implements IVideoConfigService {

    /* renamed from: a */
    private static int f101223a = 576;

    /* renamed from: b */
    private static int f101224b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f101225c = new AtomicBoolean(false);

    public final int getVideoHeight() {
        m88351a();
        return f101224b;
    }

    public final int getVideoWidth() {
        m88351a();
        return f101223a;
    }

    public final void invalidate() {
        f101225c.set(false);
    }

    /* renamed from: a */
    private void m88351a() {
        if (!f101225c.get()) {
            synchronized (f101225c) {
                if (f101225c.compareAndSet(false, true)) {
                    int[] j = C40797m.m90255j();
                    if (j != null && j.length == 2 && j[0] > 0 && j[1] > 0) {
                        f101223a = j[0];
                        f101224b = j[1];
                    }
                }
            }
        }
    }
}
