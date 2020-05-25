package com.bytedance.android.live.base.model.feed;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.feed.b */
public final class C2976b {
    @C17952c(mo34828a = "live_feed_preload_style_one")

    /* renamed from: a */
    public int f8723a;
    @C17952c(mo34828a = "live_feed_preload_style_two")

    /* renamed from: b */
    public int f8724b;
    @C17952c(mo34828a = "live_feed_preload_in_room")

    /* renamed from: c */
    public int f8725c;
    @C17952c(mo34828a = "live_feed_preload_new_feed")

    /* renamed from: d */
    public int f8726d = 2;

    /* renamed from: a */
    public final int mo7694a() {
        return (this.f8724b - 1) * 2;
    }
}
