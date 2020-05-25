package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.user.C3011j;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C1680ad;

public interface UploadApi {
    @C12718t(mo23886a = "/webcast/certification/submit_cert_data/")
    C1680ad<C4177d<C3011j>> upload(@C12700b TypedOutput typedOutput);
}
