package com.p683ss.android.ugc.aweme.base.p1415f;

import android.content.Context;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.f.a */
public final class C23528a {

    /* renamed from: e */
    private static final C17971f f62629e = new C17971f();

    /* renamed from: f */
    private static final Type f62630f = new C17956a<Map<String, Map<String, Long>>>() {
    }.f49843c;

    /* renamed from: a */
    private final String f62631a;

    /* renamed from: b */
    private Context f62632b;

    /* renamed from: c */
    private C23531a f62633c;

    /* renamed from: d */
    private final String f62634d;

    /* renamed from: g */
    private Map<String, Long> f62635g;

    /* renamed from: h */
    private Map<String, Long> f62636h;

    /* renamed from: i */
    private Map<String, Long> f62637i;

    /* renamed from: j */
    private Map<String, Map<String, Long>> f62638j;

    /* renamed from: com.ss.android.ugc.aweme.base.f.a$a */
    public enum C23531a {
        PERSISTENT,
        APP_ALIVE
    }

    /* renamed from: b */
    public final synchronized JSONObject mo48689b() throws JSONException {
        return new JSONObject(mo48688a());
    }

    /* renamed from: a */
    public final synchronized String mo48688a() {
        return f62629e.mo34889b(this.f62638j);
    }

    /* renamed from: b */
    private C23543g m57701b(String str) {
        return C23541e.m57714a(this.f62632b, str);
    }

    /* renamed from: a */
    public final synchronized C23528a mo48687a(String str) {
        return m57700a(str, 1);
    }

    public C23528a(Context context, String str) {
        this(context, str, C23531a.PERSISTENT);
    }

    /* renamed from: a */
    private synchronized C23528a m57700a(String str, long j) {
        Long l;
        Long l2 = (Long) this.f62635g.get(str);
        if (l2 == null) {
            l = Long.valueOf(1);
        } else {
            l = Long.valueOf(l2.longValue() + 1);
        }
        this.f62635g.put(str, l);
        if (this.f62633c == C23531a.PERSISTENT) {
            m57701b(this.f62634d).mo48709b("raw", mo48688a());
        }
        return this;
    }

    private C23528a(Context context, String str, C23531a aVar) {
        this.f62635g = new LinkedHashMap();
        this.f62636h = new C0777a();
        this.f62637i = new LinkedHashMap();
        this.f62638j = new C0777a();
        this.f62638j.put("events", this.f62635g);
        this.f62638j.put("durations", this.f62637i);
        this.f62632b = context.getApplicationContext();
        this.f62631a = str;
        this.f62633c = aVar;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_funnel");
            this.f62634d = sb.toString();
            switch (aVar) {
                case PERSISTENT:
                    Map map = (Map) f62629e.mo34885a(m57701b(this.f62634d).mo48703a("raw", ""), f62630f);
                    if (map != null) {
                        for (Entry entry : map.entrySet()) {
                            Map map2 = (Map) this.f62638j.get(entry.getKey());
                            if (!(map2 == null || entry.getValue() == null)) {
                                map2.putAll((Map) entry.getValue());
                            }
                        }
                        return;
                    }
                    break;
                case APP_ALIVE:
                    m57701b(this.f62634d).mo48701a().clear().apply();
                    break;
            }
            return;
        }
        throw new IllegalArgumentException("name is null");
    }
}
