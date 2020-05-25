package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1712a.C29939a;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1713b.C29942a;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService */
public final class GetUploadConfigService {

    /* renamed from: b */
    public static final C29925a f78093b = new C29925a(null);

    /* renamed from: a */
    public final UploadConfigService f78094a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService$UploadConfigService */
    public interface UploadConfigService {
        @C53075f(mo110603a = "common/upload_settings")
        C0013i<C29939a> getUploadAuthConfig();

        @C53075f(mo110603a = "common/play_url")
        C0013i<C29942a> getUploadPlayUrlResponse(@C53089t(mo110619a = "video_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService$a */
    public static final class C29925a {
        private C29925a() {
        }

        public /* synthetic */ C29925a(C52707g gVar) {
            this();
        }
    }

    public GetUploadConfigService() {
        Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create("https://ec.snssdk.com/").mo19930a(UploadConfigService.class);
        C52711k.m112236a(a, "ServiceManager.get().get…onfigService::class.java)");
        this.f78094a = (UploadConfigService) a;
    }
}
