package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.FeedApiService;
import com.p683ss.android.ugc.aweme.feed.api.C30146d;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.experiment.DefaultFeedExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.preload.C30680f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.m.f */
final /* synthetic */ class C30483f implements Runnable {

    /* renamed from: a */
    private final C30480d f79669a;

    /* renamed from: b */
    private final int f79670b;

    /* renamed from: c */
    private final int f79671c;

    /* renamed from: d */
    private final String f79672d;

    /* renamed from: e */
    private final long f79673e;

    /* renamed from: f */
    private final long f79674f;

    /* renamed from: g */
    private final int f79675g;

    /* renamed from: h */
    private final Integer f79676h;

    /* renamed from: i */
    private final String f79677i;

    /* renamed from: j */
    private final String f79678j;

    /* renamed from: k */
    private final String f79679k;

    C30483f(C30480d dVar, int i, int i2, String str, long j, long j2, int i3, Integer num, String str2, String str3, String str4) {
        this.f79669a = dVar;
        this.f79670b = i;
        this.f79671c = i2;
        this.f79672d = str;
        this.f79673e = j;
        this.f79674f = j2;
        this.f79675g = i3;
        this.f79676h = num;
        this.f79677i = str2;
        this.f79678j = str3;
        this.f79679k = str4;
    }

    public final void run() {
        boolean z;
        C304811 r1;
        C30480d dVar = this.f79669a;
        int i = this.f79670b;
        int i2 = this.f79671c;
        String str = this.f79672d;
        long j = this.f79673e;
        long j2 = this.f79674f;
        int i3 = this.f79675g;
        Integer num = this.f79676h;
        String str2 = this.f79677i;
        String str3 = this.f79678j;
        String str4 = this.f79679k;
        C304811 r16 = r1;
        C9381g gVar = dVar.mHandler;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str2;
        String str9 = str6;
        String str10 = str;
        C304811 r12 = new Callable(i, i2, str, j, j2, i3, num, str7, str9, str5) {

            /* renamed from: a */
            final /* synthetic */ int f79657a;

            /* renamed from: b */
            final /* synthetic */ int f79658b;

            /* renamed from: c */
            final /* synthetic */ String f79659c;

            /* renamed from: d */
            final /* synthetic */ long f79660d;

            /* renamed from: e */
            final /* synthetic */ long f79661e;

            /* renamed from: f */
            final /* synthetic */ int f79662f;

            /* renamed from: g */
            final /* synthetic */ Integer f79663g;

            /* renamed from: h */
            final /* synthetic */ String f79664h;

            /* renamed from: i */
            final /* synthetic */ String f79665i;

            /* renamed from: j */
            final /* synthetic */ String f79666j;

            /* renamed from: a */
            static final /* synthetic */ Object m71436a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("openudid", Secure.getString(C11010c.m22280a().getContentResolver(), "android_id"));
                    if (!TextUtils.isEmpty(C30146d.f78687b)) {
                        jSONObject.put("did", C30146d.f78687b);
                    }
                    jSONObject.put("event", "feed_banned");
                    jSONObject.put("scene", C22858c.f61207c);
                } catch (JSONException unused) {
                }
                AppLog.recordMiscLog(C11010c.m22280a(), "app_perf", jSONObject);
                return null;
            }

            public final Object call() throws Exception {
                if (C10181b.m20511a().mo18172a(DefaultFeedExperiment.class, true, "force_show_default_feed", 31744, false)) {
                    return C30436k.m71373d();
                }
                C30680f.f80294b = true;
                StringBuilder sb = new StringBuilder("start commit to fetchList,type:");
                sb.append(this.f79657a);
                sb.append(",pullType:");
                sb.append(this.f79658b);
                sb.append(",aids:");
                sb.append(this.f79659c);
                C32458a.m75141a(4, "FeedFetchModel", sb.toString());
                FeedItemList fetchFeedList = FeedApiService.m70129a().fetchFeedList(this.f79657a, this.f79660d, this.f79661e, this.f79662f, this.f79663g, this.f79664h, this.f79658b, C30480d.this.f79647c, this.f79665i, this.f79659c, this.f79666j, C30480d.this.f79648d, null);
                if (!C9431p.m18664a(this.f79664h) && fetchFeedList != null) {
                    fetchFeedList.setLocalExtra("aweme_id", this.f79664h);
                }
                if (this.f79657a == 0 && fetchFeedList != null && C30163b.m70783j()) {
                    fetchFeedList.appendCache = C30163b.m70771a();
                }
                if (fetchFeedList == null || fetchFeedList.getItems() == null || fetchFeedList.getItems().size() <= 0) {
                    C0013i.m16a(C30486i.f79684a);
                } else {
                    String str = "FeedFetchModel";
                    try {
                        StringBuilder sb2 = new StringBuilder("end commit to fetchList,type:");
                        sb2.append(this.f79657a);
                        sb2.append(",pullType:");
                        sb2.append(this.f79658b);
                        sb2.append(",aids:");
                        sb2.append(this.f79659c);
                        sb2.append(",listSize:");
                        sb2.append(fetchFeedList.getItems().size());
                        C32458a.m75141a(4, str, sb2.toString());
                    } catch (Throwable unused) {
                        C32458a.m75141a(6, "FeedFetchModel", "end commit to fetchList log error,should never happen!");
                    }
                    BusinessComponentServiceUtils.getLiveStateManager().mo74802a(fetchFeedList.getItems());
                }
                if (!(fetchFeedList == null || fetchFeedList.getItems() == null)) {
                    for (int i = 0; i < fetchFeedList.getItems().size(); i++) {
                        C29650b.f77509a.getFeedOrderMap().put(((Aweme) fetchFeedList.getItems().get(i)).getAid(), Integer.valueOf(i));
                    }
                }
                return fetchFeedList;
            }

            {
                this.f79657a = r2;
                this.f79658b = r3;
                this.f79659c = r4;
                this.f79660d = r5;
                this.f79661e = r7;
                this.f79662f = r9;
                this.f79663g = r10;
                this.f79664h = r11;
                this.f79665i = r12;
                this.f79666j = r13;
            }
        };
        if (!TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str10)) {
            r1 = r16;
            z = false;
        } else {
            r1 = r16;
            z = true;
        }
        C30436k.m71362a(i, gVar, r1, 0, z);
    }
}
