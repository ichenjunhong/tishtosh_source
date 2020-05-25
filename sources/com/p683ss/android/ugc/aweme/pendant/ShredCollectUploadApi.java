package com.p683ss.android.ugc.aweme.pendant;

import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.pendant.ShredCollectUploadApi */
public interface ShredCollectUploadApi {

    /* renamed from: a */
    public static final C38570a f98080a = C38570a.f98081a;

    /* renamed from: com.ss.android.ugc.aweme.pendant.ShredCollectUploadApi$a */
    public static final class C38570a {

        /* renamed from: a */
        static final /* synthetic */ C38570a f98081a = new C38570a();

        private C38570a() {
        }
    }

    @C53084o(mo110612a = "/luckycat/ameboon/v1/task/done/redapck_segment")
    @C53074e
    C2201v<Object> uploadUserShredCount(@C53072c(mo110600a = "segments") int i);
}
