package com.bytedance.android.live.core.p230g.p232b.p233a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.p230g.p232b.C3884c;
import com.bytedance.android.live.core.p230g.p232b.C3885d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.g.b.a.d */
public class C3877d implements C3884c, C3885d {

    /* renamed from: a */
    private static final List<String> f10893a = Arrays.asList(new String[]{"RLI-AN00"});

    /* renamed from: a */
    public final boolean mo9250a() {
        return f10893a.contains(Build.MODEL);
    }

    /* renamed from: a */
    public final int mo9249a(Configuration configuration) {
        if (!mo9250a()) {
            return -1;
        }
        float f = (((float) configuration.screenHeightDp) * 1.0f) / ((float) configuration.screenWidthDp);
        if (f < 0.75f || f > 1.3333334f) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo9248a(Context context) {
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
