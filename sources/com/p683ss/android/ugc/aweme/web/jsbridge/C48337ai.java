package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38052c;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ai */
public final class C48337ai implements C10762d {
    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        ((C38052c) C38053d.m85113a(C38052c.class)).mo48438a(true);
        C35456b noticeSession = C33194e.m76279d().getNoticeSession("game_helper");
        if (noticeSession != null) {
            noticeSession.f91121l = 1;
            C33194e.m76279d().updateNoticeSession(noticeSession);
        }
    }
}
