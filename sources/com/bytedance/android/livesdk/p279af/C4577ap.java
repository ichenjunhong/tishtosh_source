package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.af.ap */
public final class C4577ap {
    /* renamed from: a */
    public static boolean m10992a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m10993b(Context context) {
        if (context == null) {
            return 0;
        }
        int a = C9432q.m18670a(context);
        int b = C9432q.m18688b(context);
        if (b < a) {
            return a;
        }
        return b;
    }

    /* renamed from: a */
    public static int m10991a(Context context) {
        if (context == null) {
            return 0;
        }
        int a = C9432q.m18670a(context);
        int b = C9432q.m18688b(context);
        if (b > a) {
            return a;
        }
        return b;
    }

    /* renamed from: a */
    public static float m10990a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m10994b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
