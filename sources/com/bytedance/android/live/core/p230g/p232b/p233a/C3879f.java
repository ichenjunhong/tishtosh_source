package com.bytedance.android.live.core.p230g.p232b.p233a;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.p230g.p232b.C3884c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.g.b.a.f */
public final class C3879f implements C3884c {

    /* renamed from: a */
    public static final List<String> f10894a = Arrays.asList(new String[]{"ONEPLUS A6000"});

    /* renamed from: a */
    public final boolean mo9248a(Context context) {
        return f10894a.contains(Build.MODEL);
    }
}
