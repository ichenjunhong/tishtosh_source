package com.p683ss.android.ugc.aweme.follow.presenter;

import com.p683ss.android.ugc.aweme.common.C26874f;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.c */
final /* synthetic */ class C31880c implements C0011g {

    /* renamed from: a */
    private final C31877a f83299a;

    C31880c(C31877a aVar) {
        this.f83299a = aVar;
    }

    public final Object then(C0013i iVar) {
        C31877a aVar = this.f83299a;
        if (aVar.mNotifyListeners != null) {
            for (C26874f b : aVar.mNotifyListeners) {
                b.mo44838b();
            }
        }
        return null;
    }
}
