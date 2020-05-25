package com.p683ss.android.ugc.aweme.requestcombine.api;

import com.bytedance.retrofit2.C12799u;
import java.util.Map;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53090u;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.api.SettingCombineApi */
public interface SettingCombineApi {

    /* renamed from: a */
    public static final C41230a f104678a = C41230a.f104679a;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.api.SettingCombineApi$a */
    public static final class C41230a {

        /* renamed from: a */
        static final /* synthetic */ C41230a f104679a = new C41230a();

        private C41230a() {
        }
    }

    @C53075f(mo110603a = "tfe/api/request_combine/v1/")
    C2201v<C12799u<String>> request(@C53090u Map<String, String> map);
}
