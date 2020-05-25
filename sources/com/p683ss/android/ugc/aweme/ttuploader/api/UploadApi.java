package com.p683ss.android.ugc.aweme.ttuploader.api;

import java.util.LinkedHashMap;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi */
public interface UploadApi {

    /* renamed from: a */
    public static final C47366a f119534a = C47366a.f119535a;

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi$a */
    public static final class C47366a {

        /* renamed from: a */
        static final /* synthetic */ C47366a f119535a = new C47366a();

        private C47366a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/upload/authkey/")
    @C53074e
    C2201v<Object> refreshUploadConfig(@C53073d LinkedHashMap<String, String> linkedHashMap);
}
