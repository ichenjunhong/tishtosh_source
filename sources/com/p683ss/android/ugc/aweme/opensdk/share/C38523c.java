package com.p683ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39577ay;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.c */
public final class C38523c implements C39577ay {
    /* renamed from: a */
    public final void mo78421a(Activity activity, Object obj) {
        C26916m checkShareContextWhenPublish = I18nBridgeService.getBridgeService_Monster().checkShareContextWhenPublish(obj);
        if (I18nBridgeService.getBridgeService_Monster().isClientKeyValid(checkShareContextWhenPublish)) {
            I18nBridgeService.getBridgeService_Monster().onReturnThirdPlatformFailed(activity, checkShareContextWhenPublish, "Sharing canceled", 20013);
        }
    }
}
