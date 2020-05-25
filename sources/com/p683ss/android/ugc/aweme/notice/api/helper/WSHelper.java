package com.p683ss.android.ugc.aweme.notice.api.helper;

import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.WSHelper */
public interface WSHelper {
    int getAppVersionCode();

    C10885e getNormalGeckoClient();

    String getProviderString();

    void handleWsCloudMessage(C50823c cVar);

    boolean isAppBackground();

    void registerAppLifecycleObserver(C27979p pVar);
}
