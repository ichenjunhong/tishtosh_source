package com.p683ss.android.ugc.aweme.feedback;

import android.os.Handler;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feedback.o */
final /* synthetic */ class C31286o implements C0011g {

    /* renamed from: a */
    private final C31285n f82020a;

    C31286o(C31285n nVar) {
        this.f82020a = nVar;
    }

    public final Object then(C0013i iVar) {
        C31285n nVar = this.f82020a;
        C31342s sVar = new C31342s(0, 0, -1, (long) nVar.f82012c, 5);
        new FeedbackThread2((Handler) nVar.f82011b, nVar.f82010a, sVar).start();
        return null;
    }
}
