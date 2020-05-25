package com.bytedance.android.live.core.p230g.p232b.p233a;

import android.content.Context;
import com.bytedance.android.live.core.p230g.p232b.C3884c;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.common.utility.p526f.C9411c;

/* renamed from: com.bytedance.android.live.core.g.b.a.g */
public final class C3880g implements C3884c {
    /* renamed from: a */
    public final boolean mo9248a(Context context) {
        try {
            return ((Boolean) C9409b.m18610a("android.util.FtFeature").mo17052a("isFeatureSupport", (Class<?>[]) new Class[]{Integer.class}, Integer.valueOf(32)).f25654a).booleanValue();
        } catch (C9411c unused) {
            return false;
        }
    }
}
