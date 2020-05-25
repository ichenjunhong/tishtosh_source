package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bs */
public final class C37584bs {

    /* renamed from: a */
    public static final C37584bs f95867a = new C37584bs();

    private C37584bs() {
    }

    /* renamed from: a */
    public static final boolean m84027a() {
        return AVExternalServiceImpl.getAVServiceImpl_Monster().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload();
    }

    /* renamed from: a */
    public static final boolean m84028a(Context context) {
        C52711k.m112240b(context, "context");
        return AVExternalServiceImpl.getAVServiceImpl_Monster().provideTakeInSameOptimize().enableTakeInSameRecordOptimize(context);
    }
}
