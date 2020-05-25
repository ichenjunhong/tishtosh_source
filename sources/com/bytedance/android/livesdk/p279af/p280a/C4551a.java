package com.bytedance.android.livesdk.p279af.p280a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.af.a.a */
public class C4551a {

    /* renamed from: a */
    public static volatile C4551a f12502a;

    /* renamed from: b */
    C4555e f12503b;

    /* renamed from: c */
    private C1690c f12504c;

    /* renamed from: a */
    public static long m10939a() {
        if (f12502a == null || f12502a.f12503b == null || !f12502a.f12503b.f12510a) {
            return C4574am.m10977a();
        }
        return f12502a.f12503b.mo10372b();
    }

    public C4551a(Context context) {
        String str = (String) LiveConfigSettingKeys.LIVE_NTP_SERVER_URL.mo9431a();
        if (!TextUtils.isEmpty(str)) {
            this.f12503b = C4555e.m10940a(context, str, 500);
            this.f12504c = C4585b.m11020a(60, TimeUnit.MINUTES).mo6527b(2147483647L).mo6529b(C2168a.m6519a()).mo6541d(C4552b.f12505a).mo6514a(C1667a.m5940a()).mo6505a(C4553c.f12506a, C4554d.f12507a);
        }
    }
}
