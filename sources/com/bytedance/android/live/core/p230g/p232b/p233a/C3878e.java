package com.bytedance.android.live.core.p230g.p232b.p233a;

import android.content.Context;
import com.bytedance.android.live.core.p230g.p232b.C3884c;

/* renamed from: com.bytedance.android.live.core.g.b.a.e */
public final class C3878e implements C3884c {
    /* renamed from: a */
    public final boolean mo9248a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }
}
