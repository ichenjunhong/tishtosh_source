package com.p683ss.android.ugc.aweme.base.activity;

import p064c.p065a.C2201v;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.base.activity.CustomErrorActivityNetworkApi */
public interface CustomErrorActivityNetworkApi {
    @C53084o(mo110612a = "/faas/services/ttud2fv7n19b3idvtn/invoke/crash_create_chat")
    C2201v<CrashCreateChatResponseBean> crashCreateChat(@C53070a CrashCreateChatRequestBean crashCreateChatRequestBean);

    @C53075f(mo110603a = "/")
    C2201v<JenkinsBuildResult> getJenkinsBuildResult();

    @C53084o(mo110612a = "/faas/services/ttud2fv7n19b3idvtn/invoke/retrace")
    C2201v<RetraceResponseBean> retrace(@C53070a RetraceRequestBean retraceRequestBean);

    @C53084o(mo110612a = "/faas/services/ttud2fv7n19b3idvtn/invoke/select_latest_crash")
    C2201v<LatestCrashBean> selectLatestCrash(@C53070a SelectLatestCrashRequestBean selectLatestCrashRequestBean);

    @C53084o(mo110612a = "/faas/services/tt41066dui1tz32x31/invoke/sendMessageToUser")
    C2201v<Object> sendMessageToUser(@C53070a SendMessageToUserBean sendMessageToUserBean);
}
