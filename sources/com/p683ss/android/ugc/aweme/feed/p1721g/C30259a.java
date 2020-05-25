package com.p683ss.android.ugc.aweme.feed.p1721g;

import android.content.SharedPreferences;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.p1162e.C19142c;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.g.a */
public class C30259a {

    /* renamed from: b */
    private static final String f79046b = "a";

    /* renamed from: c */
    private static final Comparator<C30262a> f79047c = new Comparator<C30262a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C30262a aVar = (C30262a) obj;
            C30262a aVar2 = (C30262a) obj2;
            if (aVar.f79054b == aVar2.f79054b) {
                return 0;
            }
            if (aVar.f79054b > aVar2.f79054b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: d */
    private static C19142c<C30259a> f79048d = new C19142c<C30259a>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo22768a() {
            return new C30259a();
        }
    };

    /* renamed from: a */
    public List<C30262a> f79049a;

    /* renamed from: e */
    private final SharedPreferences f79050e;

    /* renamed from: f */
    private long f79051f;

    /* renamed from: g */
    private long f79052g;

    /* renamed from: com.ss.android.ugc.aweme.feed.g.a$a */
    public static class C30262a {

        /* renamed from: a */
        public String f79053a;

        /* renamed from: b */
        long f79054b;

        C30262a() {
        }

        public final int hashCode() {
            return super.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final JSONObject mo60624a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", this.f79053a);
                jSONObject.put("time", this.f79054b);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C30262a) || !C9431p.m18665a(((C30262a) obj).f79053a, this.f79053a)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C30259a m71089a() {
        return (C30259a) f79048d.mo39084b();
    }

    /* renamed from: c */
    private void m71090c() {
        JSONArray jSONArray = new JSONArray();
        for (C30262a a : this.f79049a) {
            jSONArray.put(a.mo60624a());
        }
        this.f79050e.edit().putString("push_list", jSONArray.toString()).apply();
    }

    private C30259a() {
        this.f79049a = new ArrayList();
        this.f79051f = 604800000;
        this.f79050e = C35807d.m80935a(C32463a.m75161a(), "app_push_info", 0);
        String string = this.f79050e.getString("push_list", "[]");
        this.f79049a.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        C30262a aVar = new C30262a();
                        aVar.f79053a = optJSONObject.optString("aid", "");
                        aVar.f79054b = optJSONObject.optLong("time", 0);
                        if (!this.f79049a.contains(aVar)) {
                            this.f79049a.add(aVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: b */
    public boolean mo60622b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis - this.f79052g <= 5000) {
            return false;
        }
        this.f79052g = currentTimeMillis;
        Collections.sort(this.f79049a, f79047c);
        int size = this.f79049a.size() - 1;
        while (size >= 0) {
            C30262a aVar = (C30262a) this.f79049a.get(size);
            if (aVar != null) {
                if (currentTimeMillis <= this.f79051f + aVar.f79054b) {
                    break;
                }
                this.f79049a.remove(size);
                size--;
                z = true;
            }
        }
        if (z) {
            m71090c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo60621a(String str, long j) {
        if (!C9431p.m18664a(str)) {
            C30262a aVar = new C30262a();
            aVar.f79054b = j;
            aVar.f79053a = str;
            synchronized (this) {
                if (!this.f79049a.contains(aVar)) {
                    this.f79049a.add(aVar);
                }
                if (!mo60622b()) {
                    m71090c();
                }
            }
        }
    }
}
