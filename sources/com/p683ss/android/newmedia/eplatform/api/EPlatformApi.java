package com.p683ss.android.newmedia.eplatform.api;

import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.newmedia.eplatform.api.EPlatformApi */
public interface EPlatformApi {

    /* renamed from: a */
    public static final C19552a f53928a = C19552a.f53929a;

    /* renamed from: com.ss.android.newmedia.eplatform.api.EPlatformApi$a */
    public static final class C19552a {

        /* renamed from: a */
        static final /* synthetic */ C19552a f53929a = new C19552a();

        private C19552a() {
        }
    }

    @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/commerce/seclink/verify/")
    C0013i<C19554b> hostVerify(@C53089t(mo110619a = "target") String str);
}
