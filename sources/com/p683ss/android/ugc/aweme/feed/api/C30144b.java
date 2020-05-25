package com.p683ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.feed.experiment.UsePbForRecommendFeedExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30396s;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1911j.C35708a;
import com.p683ss.android.ugc.aweme.p1911j.C35713c;
import com.p683ss.ugc.aweme.proto.aweme_v2_feed_response;

/* renamed from: com.ss.android.ugc.aweme.feed.api.b */
public final class C30144b {

    /* renamed from: a */
    private static final String f78684a;

    /* renamed from: b */
    static String m70747b() {
        if (C30396s.m71318b()) {
            return C30396s.m71319c();
        }
        return null;
    }

    static {
        StringBuilder sb = new StringBuilder("pb_convert_flag");
        sb.append(C11010c.m22293n());
        f78684a = sb.toString();
    }

    /* renamed from: a */
    static boolean m70746a() {
        boolean z = false;
        boolean z2 = C35807d.m80935a(C32463a.m75161a(), "pb_convert_flag", 0).getBoolean(f78684a, false);
        if (!z2) {
            z = C10181b.m20511a().mo18172a(UsePbForRecommendFeedExperiment.class, true, "use_pb_for_recommend_feed", 31744, true);
        }
        C23794bh.m58409w();
        StringBuilder sb = new StringBuilder("getRecommendFeedItemList,usbPb:");
        sb.append(z);
        sb.append(",errorOnce:");
        sb.append(z2);
        C32458a.m75141a(4, "FeedApi", sb.toString());
        return z;
    }

    /* renamed from: a */
    public static FeedItemList m70744a(C22977c<aweme_v2_feed_response, FeedItemList> cVar, C30157o oVar) throws Exception {
        return (FeedItemList) cVar.mo47749a(new C30145c(oVar));
    }

    /* renamed from: a */
    static final /* synthetic */ FeedItemList m70745a(C30157o oVar, aweme_v2_feed_response aweme_v2_feed_response) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FeedItemList a = C30156n.m70763a(aweme_v2_feed_response, null);
            if (oVar.f78714g.intValue() == 8) {
                a.pbData = aweme_v2_feed_response;
            }
            C30146d.f78686a = SystemClock.elapsedRealtime() - elapsedRealtime;
            return a;
        } catch (Throwable th) {
            C23131p.m56692a("service_monitor", "log_bean_copy_convert_error", C23088c.m56631a().mo47824a("errMsg", Log.getStackTraceString(th)).mo47825b());
            C30143a aVar = new C30143a(th);
            C32458a.m75148a((Throwable) aVar);
            C9220a.m18311a((Throwable) aVar);
            C35708a.f91668a.mo74317a(Log.getStackTraceString(new C35713c("不是crash 不是crash 不是crash", aVar)));
            C35807d.m80935a(C32463a.m75161a(), "pb_convert_flag", 0).edit().clear().putBoolean(f78684a, true).commit();
            return FeedApi.m70733a(oVar);
        }
    }
}
