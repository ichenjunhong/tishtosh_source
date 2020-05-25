package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.wschannel.C9454c;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.DelayInitExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38072o;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.websocket.p2539b.C50811a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.WebSocketTask */
public class WebSocketTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private static void finishDelay() {
        try {
            if (C32816h.m75716b().getWsUseNewSdk().intValue() == 1 && isWsDelayInit()) {
                C38072o.f96862i.mo77629a();
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean isWsDelayInit() {
        int a = C10181b.m20511a().mo18168a(DelayInitExperiment.class, true, "delay_init_wschannel", 31744, 1);
        if (a == 3 || (a == 2 && C23337c.m57398a())) {
            return true;
        }
        return false;
    }

    public void run(Context context) {
        boolean z;
        C32458a.m75144a("WebSocketTask");
        C38072o a = C38072o.f96862i.mo77629a();
        Application application = (Application) C11010c.m22280a();
        C52711k.m112240b(application, "context");
        if (a.f96863a) {
            C9446a aVar = a.f96866d;
            int a2 = C10181b.m20511a().mo18168a(DelayInitExperiment.class, true, "delay_init_wschannel", 31744, 1);
            if (a2 == 3 || (a2 == 2 && C23337c.m57398a())) {
                z = true;
            } else {
                z = false;
            }
            C9454c.m18758a(application, aVar, z);
            synchronized (a) {
                C47718bf.m103290c(a);
            }
        } else {
            C50811a.m109960a(application).mo99517a();
        }
        finishDelay();
    }
}
