package com.p683ss.android.ugc.aweme.port.internal;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.m */
public final class C39664m implements IVideoConfigService {

    /* renamed from: a */
    private static int f101237a = 576;

    /* renamed from: b */
    private static int f101238b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f101239c = new AtomicBoolean(false);

    public final int getVideoHeight() {
        m88353a();
        return f101238b;
    }

    public final int getVideoWidth() {
        m88353a();
        return f101237a;
    }

    public final void invalidate() {
        f101239c.set(false);
    }

    /* renamed from: a */
    private void m88353a() {
        if (!f101239c.get()) {
            synchronized (f101239c) {
                if (f101239c.compareAndSet(false, true)) {
                    int[] i = C40797m.m90254i();
                    if (i != null && i.length == 2 && i[0] > 0 && i[1] > 0) {
                        f101237a = i[0];
                        f101238b = i[1];
                    }
                }
            }
        }
    }
}
