package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.antiaddic.C22688a;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p683ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.go */
public final class C47925go implements WSHelper {
    /* renamed from: a */
    public static WSHelper m103695a() {
        if (C27991b.f73512h == null) {
            synchronized (WSHelper.class) {
                if (C27991b.f73512h == null) {
                    C27991b.f73512h = C27628bo.m66312g();
                }
            }
        }
        return (WSHelper) C27991b.f73512h;
    }

    public final void handleWsCloudMessage(C50823c cVar) {
        C52711k.m112240b(cVar, "event");
    }

    public final int getAppVersionCode() {
        return (int) C11010c.m22287h();
    }

    public final C10885e getNormalGeckoClient() {
        return C47731bq.m103348e();
    }

    public final boolean isAppBackground() {
        C23137q a = C23137q.m56698a();
        C52711k.m112236a((Object) a, "AwemeRuntime.inst()");
        return a.mo47854b();
    }

    public final String getProviderString() {
        return IESNetDepend.m84280g().mo24899a(C11010c.m22280a(), "frontier_urls", "");
    }

    public final void registerAppLifecycleObserver(C27979p pVar) {
        C52711k.m112240b(pVar, "observer");
        C22688a.m55899d().mo47071a(pVar);
    }
}
