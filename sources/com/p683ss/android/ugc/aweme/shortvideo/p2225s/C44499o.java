package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import com.p683ss.android.ugc.aweme.shortvideo.C43211de;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.o */
final /* synthetic */ class C44499o implements Runnable {

    /* renamed from: a */
    private final C44485k f112574a;

    /* renamed from: b */
    private final C43211de f112575b;

    C44499o(C44485k kVar, C43211de deVar) {
        this.f112574a = kVar;
        this.f112575b = deVar;
    }

    public final void run() {
        C44485k kVar = this.f112574a;
        C43211de deVar = this.f112575b;
        if (kVar.f112512a != null) {
            kVar.f112512a.onProgressUpdate(kVar.f112515d.mo87841a(0, deVar.mo87844d()), false);
        }
    }
}
