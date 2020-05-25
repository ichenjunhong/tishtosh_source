package com.p683ss.android.ugc.aweme.p1807im.sdk.commercialize.net;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p831b.C12715q;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12720v;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.commercialize.net.CommercializeApi */
public final class CommercializeApi {

    /* renamed from: a */
    public static final CommercializeApi f87898a = new CommercializeApi();

    /* renamed from: b */
    private static final RealApi f87899b = ((RealApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.commercialize.net.CommercializeApi$RealApi */
    public interface RealApi {
        @C12718t(mo23886a = "/aweme/v1/saiyan/im/illegal/image/upload/")
        @C12715q
        C2201v<BaseResponse> imIllegalImageUpload(@C12724z(mo23894a = "sec_to_uid") String str, @C12720v(mo23888a = "image") TypedFile typedFile);
    }

    private CommercializeApi() {
    }
}
