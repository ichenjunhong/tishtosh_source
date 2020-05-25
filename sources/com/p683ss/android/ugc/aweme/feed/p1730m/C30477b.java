package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.m.b */
final /* synthetic */ class C30477b implements Callable {

    /* renamed from: a */
    private final Object[] f79623a;

    C30477b(Object[] objArr) {
        this.f79623a = objArr;
    }

    public final Object call() {
        C30478c cVar = (C30478c) this.f79623a[0];
        if (!C23098h.f61512f.mo47841a()) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(cVar.f79624a)) {
                hashMap.put("item_id", cVar.f79624a);
            }
            if (cVar.f79625b > 0) {
                hashMap.put("share_delta", String.valueOf(cVar.f79625b));
            }
            if (cVar.f79626c > 0) {
                hashMap.put("play_delta", String.valueOf(cVar.f79626c));
            }
            if (cVar.f79627d > 0) {
                hashMap.put("download_delta", String.valueOf(cVar.f79627d));
            }
            if (cVar.f79628e >= 0) {
                hashMap.put("aweme_type", String.valueOf(cVar.f79628e));
            }
            if (cVar.f79629f >= 0) {
                hashMap.put("tab_type", String.valueOf(cVar.f79629f));
            }
            if (cVar.f79630g > 0) {
                hashMap.put("item_type", String.valueOf(cVar.f79630g));
            }
            String str = cVar.f79631h;
            if (str != null) {
                hashMap.put("stats_channel", str);
            }
            if (cVar.f79632i >= 0) {
                hashMap.put("follow_status", String.valueOf(cVar.f79632i));
            }
            if (cVar.f79633j >= 0) {
                hashMap.put("follower_status", String.valueOf(cVar.f79633j));
            }
            hashMap.put("first_install_time", C32816h.m75716b().getFirstInstallTime().toString());
            hashMap.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
            AwemeStatsApi.f78666a.awemeStatsReport(hashMap).get();
        }
        return null;
    }
}
