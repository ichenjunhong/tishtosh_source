package com.bytedance.android.livesdkapi.depend.live;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.t */
public final class C8670t {
    /* renamed from: a */
    public static Bundle m17142a(Context context, int i, String str, String str2, int i2, boolean z, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("live.intent.extra.IS_MULTI", true);
        bundle2.putInt("live.intent.extra.POSITION", i);
        bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE", str);
        bundle2.putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", str2);
        bundle2.putInt("live.intent.extra.SWIPE_SWITCH_MASK", i2);
        bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle);
        bundle2.putBoolean("live.intent.extra.DISLIKE_ENABLED", z);
        return bundle2;
    }
}
