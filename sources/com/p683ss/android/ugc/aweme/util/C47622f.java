package com.p683ss.android.ugc.aweme.util;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.util.f */
public final /* synthetic */ class C47622f implements C1710e {

    /* renamed from: a */
    public static final C1710e f120090a = new C47622f();

    private C47622f() {
    }

    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if (C47621e.m103099b() && C47621e.m103099b()) {
                C47621e.m103098a().stopScreenshotObserver();
            }
            return;
        }
        if (C47621e.m103099b() && C47621e.m103099b()) {
            C47621e.m103098a().startScreenshotObserver();
        }
    }
}
