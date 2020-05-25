package com.bytedance.p126ad.symphony;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9388b;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2726d;
import com.bytedance.p126ad.symphony.p134e.p135a.C2728f;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.a */
public class C2670a {

    /* renamed from: b */
    public static int f8126b = 5;

    /* renamed from: e */
    private static volatile C2670a f8127e;

    /* renamed from: a */
    public int f8128a;

    /* renamed from: c */
    int f8129c = 900;

    /* renamed from: d */
    public Context f8130d;

    /* renamed from: f */
    private ScheduledExecutorService f8131f;

    /* renamed from: com.bytedance.ad.symphony.a$a */
    public static class C2672a {

        /* renamed from: a */
        public List<C2723a> f8134a = new ArrayList();

        /* renamed from: b */
        public List<C2723a> f8135b = new ArrayList();

        /* renamed from: c */
        public List<C2723a> f8136c = new ArrayList();

        /* renamed from: d */
        public Map<String, List<String>> f8137d = new HashMap();

        /* renamed from: e */
        public C2726d f8138e;

        /* renamed from: f */
        public C2728f f8139f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public SharedPreferences mo7229b() {
        return C35807d.m80935a(this.f8130d, "new_sp_ad_config", 0);
    }

    /* renamed from: a */
    public final C2672a mo7228a() {
        SharedPreferences b = mo7229b();
        if (b == null || m7672a(b)) {
            return null;
        }
        String string = b.getString("config", "");
        if (C9431p.m18664a(string)) {
            return null;
        }
        try {
            return m7670a(new JSONObject(string));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final synchronized ScheduledExecutorService mo7230c() {
        if (this.f8131f == null) {
            this.f8131f = (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49846a((ThreadFactory) new C9388b("ad-symphony-pool")).mo49847a());
        }
        return this.f8131f;
    }

    private C2670a(Context context) {
        this.f8130d = context;
    }

    /* renamed from: a */
    private static boolean m7672a(SharedPreferences sharedPreferences) {
        int i;
        try {
            i = sharedPreferences.getInt("version_code", 0);
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C2670a m7671a(Context context) {
        if (f8127e == null) {
            synchronized (C2670a.class) {
                if (f8127e == null) {
                    f8127e = new C2670a(context);
                }
            }
        }
        return f8127e;
    }

    /* renamed from: a */
    public static C2672a m7670a(JSONObject jSONObject) {
        C2672a aVar = new C2672a();
        if (jSONObject != null) {
            aVar.f8134a = C2723a.m7783a(jSONObject.optJSONArray("native_ad_config"), 0);
            aVar.f8135b = C2723a.m7783a(jSONObject.optJSONArray("interstitial_ad_config"), 1);
            aVar.f8136c = C2723a.m7783a(jSONObject.optJSONArray("banner_ad_config"), 2);
            aVar.f8137d = C2723a.m7784a(jSONObject.optJSONArray("placement_type_map_config"));
            aVar.f8138e = C2726d.m7788a(jSONObject.optJSONArray("default_fill_strategy_config"));
            aVar.f8139f = C2728f.m7791a(jSONObject.optJSONObject("symphony_sdk_config"));
        }
        return aVar;
    }
}
