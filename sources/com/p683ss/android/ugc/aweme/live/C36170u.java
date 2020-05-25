package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.feed.tab.C7107a;
import com.bytedance.android.livesdk.p395m.C7771a;
import com.bytedance.android.livesdkapi.host.C8792b;
import com.bytedance.android.livesdkapi.p445e.C8734d;
import com.bytedance.p753k.p754a.C12105a;
import com.bytedance.p753k.p758b.p762d.C12126a;

/* renamed from: com.ss.android.ugc.aweme.live.u */
public final class C36170u implements C36093g {
    /* renamed from: a */
    public final C8734d mo74844a() {
        return C7771a.f21351a;
    }

    /* renamed from: b */
    public final String mo74846b() {
        return Live.getLiveDomain();
    }

    /* renamed from: c */
    public final C12105a mo74847c() {
        return C12126a.m24557b();
    }

    /* renamed from: d */
    public final C8792b mo74848d() {
        return new C7107a();
    }

    /* renamed from: a */
    public final Intent mo74843a(Context context) {
        return new Intent(context, LiveBillingProxyActivity.class);
    }

    /* renamed from: a */
    public final Class mo74845a(int i) {
        switch (i) {
            case 5:
                return LiveBroadcastActivity.class;
            case 6:
                return LiveBgBroadcastActivity.class;
            default:
                return null;
        }
    }
}
