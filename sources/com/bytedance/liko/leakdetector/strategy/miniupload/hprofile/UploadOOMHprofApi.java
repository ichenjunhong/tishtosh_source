package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

public interface UploadOOMHprofApi {

    /* renamed from: a */
    public static final C12300a f32425a = C12300a.f32426a;

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.UploadOOMHprofApi$a */
    public static final class C12300a {

        /* renamed from: a */
        static final /* synthetic */ C12300a f32426a = new C12300a();

        private C12300a() {
        }
    }

    @C53075f(mo110603a = "/monitor/collect/c/memory_upload_check")
    C2201v<C12303c> isNeedUploadOOMHprof(@C53089t(mo110619a = "aid") int i, @C53089t(mo110619a = "os") String str);
}
