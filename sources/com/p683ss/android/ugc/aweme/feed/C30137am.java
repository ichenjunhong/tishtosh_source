package com.p683ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.p1340am.C22572b;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.am */
public class C30137am {

    /* renamed from: a */
    static volatile boolean f78659a;

    /* renamed from: b */
    private static volatile boolean f78660b;

    /* renamed from: a */
    private static void m70723a() {
        if (!f78660b) {
            synchronized (C30137am.class) {
                if (!f78660b) {
                    f78660b = true;
                    C11016e.m22308c().mo6545f(C30139ao.f78664a);
                    C30578o.m71567a(C30140ap.f78665a);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m70725a(boolean z) {
        if (z) {
            m70723a();
        }
        if (f78659a != z) {
            f78659a = z;
        }
    }

    /* renamed from: a */
    public static void m70724a(String str) {
        if (f78659a && !TextUtils.isEmpty(str)) {
            C0013i.m18a((Callable<TResult>) new C30138an<TResult>(C30578o.m71570d(), C30578o.m71569c(), str), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m70722a(String str, String str2, String str3) throws Exception {
        JSONObject a = new C26898j().mo54849a("top_activity", str).mo54849a("feed_tab", str2).mo54849a("err_code", str3).mo54850a();
        try {
            a.put("preloader_type", C48017a.m103960b());
        } catch (Exception e) {
            C9220a.m18311a((Throwable) e);
        }
        C26890h.onEvent(MobClick.obtain().setEventName("video_prepare_error").setLabelName("perf_monitor").setJsonObject(a));
        C26890h.m65012a("video_prepare_error", a);
        C23223a.m57035a("video_prepare_error", a);
        C22572b.m55734b("video_prepare_error", a);
        return null;
    }
}
