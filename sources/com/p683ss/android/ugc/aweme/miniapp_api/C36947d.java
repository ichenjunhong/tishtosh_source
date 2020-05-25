package com.p683ss.android.ugc.aweme.miniapp_api;

import com.p683ss.android.ugc.aweme.miniapp_api.model.C36968g;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.d */
public class C36947d {

    /* renamed from: h */
    private static volatile C36947d f94309h;

    /* renamed from: a */
    public C36968g f94310a;

    /* renamed from: b */
    public Map<String, Boolean> f94311b = new HashMap();

    /* renamed from: c */
    public String f94312c;

    /* renamed from: d */
    public String f94313d;

    /* renamed from: e */
    public JSONObject f94314e;

    /* renamed from: f */
    public C36948a f94315f;

    /* renamed from: g */
    public C36952a f94316g;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.d$a */
    public interface C36948a {
    }

    private C36947d() {
    }

    /* renamed from: a */
    public static C36947d m83162a() {
        if (f94309h == null) {
            synchronized (C36947d.class) {
                if (f94309h == null) {
                    f94309h = new C36947d();
                }
            }
        }
        return f94309h;
    }
}
