package com.p683ss.android.ugc.aweme.miniapp.p1956m;

import com.p2615tt.miniapp.IWebSocketService;
import com.p2615tt.miniapp.IWebSocketService.IWebSocketServiceListener;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.miniapp.m.a */
public class C36911a implements IWebSocketService {

    /* renamed from: a */
    private IWebSocketServiceListener f94292a;

    public boolean isConnected() {
        return C38064h.m85136d().f96844c;
    }

    public C36911a() {
        if (!C47718bf.m103292e(this)) {
            C47718bf.m103290c(this);
        }
    }

    public String getCurUserId() {
        return C20854a.m53167g().getCurUserId();
    }

    public boolean isBackground() {
        return C23137q.m56698a().mo47854b();
    }

    public boolean isLogin() {
        return C20854a.m53167g().isLogin();
    }

    public boolean isSettingsEnable() {
        return C32816h.m75716b().getMiniappWonderlandEnable().booleanValue();
    }

    public void setWebSocketServiceListener(IWebSocketServiceListener iWebSocketServiceListener) {
        this.f94292a = iWebSocketServiceListener;
    }

    @C53771m
    public void onReceiveMsg(C50823c cVar) {
        this.f94292a.onReceiveMsg(cVar.f127700e, cVar.f127699d, new String(cVar.f127697b));
    }

    @C53771m(mo112977c = -1)
    public void onWSStatusChange(C50827g gVar) {
        if (gVar.f127711b == C50820a.CONNECTED) {
            this.f94292a.onWebSocketConnected();
            return;
        }
        if (gVar.f127711b == C50820a.CLOSED) {
            this.f94292a.onWebSocketClosed();
        }
    }

    public void sendMessage(String str) {
        String e = C38064h.m85136d().mo77610e();
        C50817e eVar = new C50817e(e, 1013, 0, System.currentTimeMillis(), 1, str.getBytes(), "pb", "pb", new HashMap());
        C47718bf.m103288a(new C50816d(e, eVar));
    }
}
