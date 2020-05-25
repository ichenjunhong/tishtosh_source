package com.p683ss.android.ugc.aweme.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.h */
public class C26890h {

    /* renamed from: a */
    private static ExecutorService f70742a;

    /* renamed from: b */
    private static void m65013b(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        C26896i.m65023a(str, str2, str3, str4, j, jSONObject);
    }

    /* renamed from: a */
    public static void m65012a(String str, JSONObject jSONObject) {
        try {
            C18894a.m46006a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static ExecutorService m65003a() {
        if (f70742a == null) {
            synchronized (C26890h.class) {
                if (f70742a == null) {
                    f70742a = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("EventUpload").mo49847a());
                }
            }
        }
        return f70742a;
    }

    public static void onEventV3(String str) {
        try {
            C18894a.m46006a(str, new JSONObject());
        } catch (Exception unused) {
        }
    }

    public static void onEvent(MobClick mobClick) {
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            m65013b(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), Long.parseLong(mobClick.getExtValueStr()), mobClick.getExtJson());
        } else {
            m65013b(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtValueLong(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    /* renamed from: a */
    public static void m65009a(String str, Bundle bundle) {
        try {
            C18894a.m46005a(str, bundle);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m65014b(String str, JSONObject jSONObject) {
        try {
            C18894a.m46006a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65011a(String str, Map<String, String> map) {
        try {
            C26883g.m64995a(str, map);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65004a(Context context, String str, String str2, long j, long j2) {
        try {
            C26883g.m64992a(C11010c.m22280a(), str, str2, j, 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65005a(Context context, String str, String str2, String str3, long j) {
        try {
            C26883g.m64992a(C11010c.m22280a(), str, str2, Long.parseLong(str3), j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65007a(Context context, String str, String str2, String str3, String str4) {
        try {
            C26883g.m64992a(C11010c.m22280a(), str, str2, Long.parseLong(str3), Long.parseLong(str4));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65006a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        try {
            C26883g.m64993a(C11010c.m22280a(), str, str2, Long.parseLong(str3), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65008a(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C26883g.m64993a(C11010c.m22280a(), str, str2, Long.parseLong(str3), Long.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65010a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        try {
            C26883g.m64994a(C11010c.m22280a(), str, str2, str3, Long.parseLong(str4), j, jSONObject);
        } catch (Exception unused) {
        }
    }
}
