package com.bytedance.p753k.p758b.p759a;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.p192sp.TTLiveSettingUtil;
import com.bytedance.p753k.p754a.p755a.C12110e;
import com.google.gson.C18085o;

/* renamed from: com.bytedance.k.b.a.e */
public class C12120e implements C2952b, C12110e {

    /* renamed from: a */
    private static volatile C12110e f32043a;

    private C12120e() {
    }

    /* renamed from: a */
    public static C12110e m24547a() {
        if (f32043a == null) {
            synchronized (C12120e.class) {
                if (f32043a == null) {
                    f32043a = new C12120e();
                }
            }
        }
        return f32043a;
    }

    /* renamed from: a */
    public final void mo22891a(Context context, C18085o oVar) {
        TTLiveSettingUtil.updateSettings(context, oVar);
    }
}
