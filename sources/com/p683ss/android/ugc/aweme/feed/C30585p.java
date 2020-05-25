package com.p683ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.AppLog.ILogSessionHook;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.p */
public final class C30585p {

    /* renamed from: a */
    public static long f79876a;

    /* renamed from: b */
    public static boolean f79877b;

    /* renamed from: com.ss.android.ugc.aweme.feed.p$a */
    public static class C30587a implements ILogSessionHook {
        private C30587a() {
        }

        public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
        }

        public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
        }

        public final void onLogSessionStart(long j) {
            String currentSessionId = AppLog.getCurrentSessionId();
            if (!C11016e.m22313h() && C30585p.f79876a != 0 && SystemClock.uptimeMillis() - C30585p.f79876a >= 20000) {
                JSONObject a = new C26898j().mo54849a("0vv_session_id", currentSessionId).mo54850a();
                C26890h.onEvent(MobClick.obtain().setEventName("0vv_hot_launch").setLabelName("perf_monitor").setJsonObject(a));
                C26890h.m65014b("0vv_hot_launch", a);
            }
        }
    }
}
