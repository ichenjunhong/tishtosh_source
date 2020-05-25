package com.p683ss.android.ugc.aweme.sdk.p2118a;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sdk.iap.C41351b;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41369b;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41349b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.a.c */
public final class C41327c extends C41324a {

    /* renamed from: e */
    private C41369b f104801e;

    /* renamed from: f */
    private C41329d f104802f;

    /* renamed from: g */
    private C41351b f104803g = new C41351b() {
        /* renamed from: a */
        public final void mo83902a(int i, Exception exc) {
            String str;
            if (i == 1 || i == 0) {
                try {
                    C41327c.this.f104794b.put("code", -1);
                    JSONObject jSONObject = C41327c.this.f104794b;
                    String str2 = "msg";
                    if (exc == null) {
                        str = "";
                    } else {
                        str = exc.getMessage();
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException unused) {
                }
                C41327c.this.f104796d.mo19455a(C41327c.this.f104793a.f28945b, C41327c.this.f104794b);
            }
        }

        /* renamed from: a */
        public final void mo83903a(int i, Object obj) {
            List list;
            if (i == 1) {
                if (obj == null) {
                    list = new ArrayList(0);
                } else {
                    list = (List) obj;
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(C41349b.m91123a((C41349b) list.get(i2)));
                }
                try {
                    C41327c.this.f104794b.put("code", 0);
                    C41327c.this.f104794b.put("args", arrayList);
                } catch (JSONException unused) {
                }
                C41327c.this.f104796d.mo19455a(C41327c.this.f104793a.f28945b, C41327c.this.f104794b);
            }
        }
    };

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        super.call(hVar, jSONObject);
        if (this.f104801e == null) {
            this.f104801e = this.f104802f.mo83904a(this.f104795c, this.f104803g);
        }
        this.f104793a = hVar;
        this.f104794b = jSONObject;
        hVar.f28951h = false;
        this.f104801e.mo83947a();
    }

    public C41327c(Context context, C10757a aVar, C41329d dVar) {
        super(context, aVar);
        this.f104802f = dVar;
    }
}
