package com.bytedance.p753k.p758b.p762d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.p753k.p754a.C12105a;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.live.LivePlayActivity;

/* renamed from: com.bytedance.k.b.d.a */
public class C12126a implements C12105a {

    /* renamed from: a */
    public static volatile C12105a f32049a;

    private C12126a() {
    }

    /* renamed from: a */
    public final Class mo22886a() {
        return LivePlayActivity.class;
    }

    /* renamed from: b */
    public static C12105a m24557b() {
        if (f32049a == null) {
            synchronized (C12126a.class) {
                if (f32049a == null) {
                    f32049a = new C12126a();
                }
            }
        }
        return f32049a;
    }

    /* renamed from: a */
    public final void mo22887a(Context context, long j, Bundle bundle) {
        LivePlayActivity.m81198a(context, j, bundle);
    }

    /* renamed from: a */
    public final void mo22888a(Context context, long j, Bundle bundle, String str) {
        Live.watchLive(context, j, bundle, str);
    }
}
