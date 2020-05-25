package com.p683ss.android.pushmanager;

import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;

/* renamed from: com.ss.android.pushmanager.b */
final class C19671b {
    /* renamed from: a */
    static String m48064a(String str) {
        try {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            if (bridgeService_Monster != null && bridgeService_Monster.isNeedReplacePushPath()) {
                if (str.equals("/service/1/update_token/")) {
                    str = "/cloudpush/update_token/";
                }
                if (str.equals("/cloudpush/update_sender/")) {
                    str = "/cloudpush/update_sender/";
                }
                if (str.equals("/service/1/app_notice_status/")) {
                    str = "/cloudpush/app_notice_status/";
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder(TutorialVideoApiManager.f96873a);
        sb.append(str);
        return sb.toString();
    }
}
