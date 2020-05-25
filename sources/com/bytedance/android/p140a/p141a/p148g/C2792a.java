package com.bytedance.android.p140a.p141a.p148g;

import android.text.TextUtils;
import com.bytedance.android.p140a.p141a.p150i.C2799a;
import com.bytedance.android.p140a.p141a.p150i.C2804f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.g.a */
public final class C2792a extends C2795b {

    /* renamed from: a */
    public C2794a f8376a;

    /* renamed from: b */
    public boolean f8377b;

    /* renamed from: c */
    public boolean f8378c;

    /* renamed from: d */
    public String f8379d;

    /* renamed from: e */
    public String f8380e;

    /* renamed from: f */
    public boolean f8381f;

    /* renamed from: g */
    public Map<String, JSONObject> f8382g;

    /* renamed from: com.bytedance.android.a.a.g.a$a */
    public static final class C2794a {

        /* renamed from: a */
        public boolean f8383a;

        /* renamed from: b */
        public boolean f8384b;

        /* renamed from: c */
        public boolean f8385c;

        /* renamed from: d */
        public String f8386d;

        /* renamed from: e */
        public JSONObject f8387e;

        /* renamed from: a */
        public final C2792a mo7400a() {
            if (this.f8387e == null) {
                this.f8387e = new JSONObject();
            }
            return new C2792a(this);
        }

        /* renamed from: a */
        public final C2794a mo7398a(JSONObject jSONObject) {
            this.f8387e = jSONObject;
            return this;
        }

        /* renamed from: b */
        public final C2794a mo7401b(boolean z) {
            this.f8385c = true;
            return this;
        }

        /* renamed from: a */
        public final C2794a mo7399a(boolean z) {
            this.f8384b = false;
            return this;
        }
    }

    private C2792a(C2794a aVar) {
        this.f8380e = "";
        this.f8376a = aVar;
        this.f8388h = aVar.f8383a;
        this.f8377b = aVar.f8384b;
        this.f8378c = aVar.f8385c;
        this.f8379d = C2804f.m7973c(aVar.f8386d);
        mo7397a(aVar.f8387e);
    }

    /* renamed from: a */
    public final void mo7397a(JSONObject jSONObject) {
        super.mo7397a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f8380e = jSONObject.optString("appid", "");
                if (this.f8382g == null) {
                    this.f8382g = new HashMap();
                }
                this.f8381f = jSONObject.optBoolean("is_enable_monitor", false);
                this.f8382g.clear();
                JSONObject optJSONObject = jSONObject.optJSONObject("settings");
                if (optJSONObject != null) {
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                            if (optJSONObject2 != null) {
                                this.f8382g.put(str, optJSONObject2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C2799a.m7954a();
                th.getMessage();
            }
        }
    }
}
