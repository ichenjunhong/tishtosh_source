package com.p683ss.android.ugc.aweme.live.settings;

import android.content.Context;
import com.bytedance.android.livesdk.feed.network.C7030a;
import com.p683ss.android.ugc.aweme.live.C36097j;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.live.settings.a */
public final class C36165a implements C36097j {

    /* renamed from: a */
    public static C36165a f92604a = new C36165a();

    /* renamed from: b */
    private LiveSDKSettingApi f92605b;

    private C36165a() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(Live.getLiveDomain());
        this.f92605b = (LiveSDKSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(sb.toString()).create(LiveSDKSettingApi.class);
    }

    /* renamed from: a */
    public final void mo74849a(Context context) {
        HashMap hashMap = new HashMap();
        C7030a.m14676a().mo13187a(hashMap);
        this.f92605b.querySettings(hashMap).mo19a((C0011g<TResult, TContinuationResult>) new C36166b<TResult,TContinuationResult>(context));
    }
}
