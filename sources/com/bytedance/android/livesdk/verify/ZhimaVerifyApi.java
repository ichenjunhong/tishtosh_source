package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.verify.model.C8388a;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface ZhimaVerifyApi {
    @C12706h(mo23876a = "/webcast/certification/get_certification_entrance/")
    C2201v<C4177d<GetCertificationEntranceResponse>> getCertificationEntrance();

    @C12706h(mo23876a = "/webcast/certification/get_certification_status/")
    C2201v<C4177d<ZhimaStatusResponse>> getCertificationStatus();

    @C12706h(mo23876a = "/webcast/certification/query/")
    C2201v<C4177d<ZhimaPollingResponse>> queryPollingStatus(@C12724z(mo23894a = "zhima_token") String str, @C12724z(mo23894a = "transaction_id") String str2);

    @C12706h(mo23876a = "/webcast/certification/common/query/")
    C2201v<C4177d<QueryZhimaStatusResponse>> queryZhimaVerifyStatus(@C12724z(mo23894a = "zhima_token") String str);

    @C12718t(mo23886a = "/webcast/certification/common/submit/")
    @C12705g
    C2201v<C4177d<C8388a>> zhimaVerify(@C12703e(mo23873a = "return_url") String str, @C12703e(mo23873a = "certify_type") String str2);
}
