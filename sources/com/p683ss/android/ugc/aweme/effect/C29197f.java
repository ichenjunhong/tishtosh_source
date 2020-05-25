package com.p683ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;

/* renamed from: com.ss.android.ugc.aweme.effect.f */
public final class C29197f {

    /* renamed from: a */
    public static final int f76504a = (C9432q.m18670a((Context) C39629l.m88233b()) - (((int) C9432q.m18687b((Context) C39629l.m88233b(), 24.0f)) * 2));

    /* renamed from: b */
    static int[] f76505b;

    /* renamed from: a */
    static int m68746a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }
}
