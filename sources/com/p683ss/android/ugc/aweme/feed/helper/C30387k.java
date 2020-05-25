package com.p683ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23527f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30032at;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.k */
public final class C30387k extends C23527f {

    /* renamed from: a */
    private final C30032at f79445a;

    /* renamed from: b */
    private final DataCenter f79446b;

    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public C30387k(C30032at atVar, DataCenter dataCenter) {
        this.f79445a = atVar;
        this.f79446b = dataCenter;
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        if (TextUtils.equals(str2, "NetworkFetchProducer")) {
            try {
                String str3 = (String) map.get("fetch_time");
                if (str3 != null) {
                    this.f79445a.f78392b = Long.valueOf(str3).longValue();
                }
                String str4 = (String) map.get("image_size");
                if (str4 != null) {
                    this.f79445a.f78393c = Integer.valueOf(str4).intValue();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("NETWORK_FETCH_PRODUCER->");
                sb.append(th.toString());
                C32458a.m75141a(6, "ImageNetworkInfoListener", sb.toString());
            }
        }
    }
}
