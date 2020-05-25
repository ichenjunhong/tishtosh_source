package com.bytedance.android.livesdk.p426x;

import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.live.C8663m;

/* renamed from: com.bytedance.android.livesdk.x.i */
public class C8574i implements C8663m {

    /* renamed from: a */
    private static volatile C8574i f23510a;

    private C8574i() {
    }

    /* renamed from: a */
    public final boolean mo15065a() {
        return ((Boolean) LiveConfigSettingKeys.LIVE_LOCALIZATION_ENABLE.mo9431a()).booleanValue();
    }

    /* renamed from: b */
    public static C8574i m16953b() {
        if (f23510a == null) {
            synchronized (C8574i.class) {
                if (f23510a == null) {
                    f23510a = new C8574i();
                }
            }
        }
        return f23510a;
    }
}
