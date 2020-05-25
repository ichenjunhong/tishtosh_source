package com.p683ss.android.ugc.aweme.p1340am;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.am.b */
public final class C22572b {

    /* renamed from: a */
    public static final String f60696a = f60696a;

    /* renamed from: b */
    public static final C22572b f60697b = new C22572b();

    /* renamed from: c */
    private static final String f60698c = f60698c;

    /* renamed from: d */
    private static final String f60699d = f60699d;

    private C22572b() {
    }

    /* renamed from: a */
    public static final void m55731a(String str) {
        C52711k.m112240b(str, "msg");
        if (C48017a.m103959a()) {
            C32458a.m75141a(3, f60696a, str);
        }
    }

    /* renamed from: a */
    public static String m55730a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(jSONObject, "msg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f60698c, str);
        jSONObject2.put(f60699d, jSONObject);
        String jSONObject3 = jSONObject2.toString();
        C52711k.m112236a((Object) jSONObject3, "messageObj.toString()");
        return jSONObject3;
    }

    /* renamed from: b */
    private String m55733b(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(map, "msgMap");
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return m55730a(str, jSONObject);
    }

    /* renamed from: a */
    public static final void m55732a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(map, "msg");
        if (C48017a.m103959a()) {
            String b = f60697b.m55733b(str, map);
            if (!TextUtils.isEmpty(b)) {
                m55731a(b);
            }
        }
    }

    /* renamed from: b */
    public static final void m55734b(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(jSONObject, "msg");
        if (C48017a.m103959a()) {
            String a = m55730a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                m55731a(a);
            }
        }
    }
}
