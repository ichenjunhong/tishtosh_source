package com.p683ss.android.ugc.aweme.shortvideo.p2178c;

import com.p683ss.android.medialib.jni.EffectThumb;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.a */
public final class C42483a extends EffectThumb {
    public final int init(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return super.init(C47926h.m103696a(str, C47804db.VIDEO));
    }

    public final int init(String str, long j, long j2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return super.init(C47926h.m103696a(str, C47804db.VIDEO), j, j2, f);
    }
}
