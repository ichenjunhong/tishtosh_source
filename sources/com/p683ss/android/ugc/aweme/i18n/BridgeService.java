package com.p683ss.android.ugc.aweme.i18n;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService.C23974a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.i18n.BridgeService */
public class BridgeService extends I18nBridgeService {
    public static IBridgeService createIBridgeServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IBridgeService.class);
        if (a != null) {
            return (IBridgeService) a;
        }
        return new BridgeService();
    }

    public void initRouterConfig() {
        SmartRouter.configRouter("snssdk1180").withOtherSchemes(new String[]{"aweme", C23057c.f61423a});
    }

    public void handleOpenSdk(Intent intent, C23974a aVar) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList stringArrayList = extras.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
            ArrayList stringArrayList2 = extras.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
            if (!C9376b.m18558a((Collection<T>) stringArrayList)) {
                aVar.mo49721b(stringArrayList);
            }
            if (!C9376b.m18558a((Collection<T>) stringArrayList2)) {
                aVar.mo49720a(stringArrayList2);
            }
        }
    }
}
