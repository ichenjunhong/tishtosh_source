package com.p683ss.android.ugc.aweme.sdk.p2118a;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.sdk.p1207a.C19717a;
import com.p683ss.android.ugc.aweme.sdk.iap.C41351b;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41369b;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.a.b */
public final class C41325b extends C41324a {

    /* renamed from: e */
    private C41369b f104797e;

    /* renamed from: f */
    private C41329d f104798f;

    /* renamed from: g */
    private C41351b f104799g = new C41351b() {
        /* renamed from: a */
        public final void mo83902a(int i, Exception exc) {
            String str;
            if (i == 2) {
                try {
                    C41325b.this.f104794b.put("code", -1);
                    JSONObject jSONObject = C41325b.this.f104794b;
                    String str2 = "msg";
                    if (exc == null) {
                        str = "";
                    } else {
                        str = exc.getMessage();
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException unused) {
                }
                C41325b.this.f104796d.mo19455a(C41325b.this.f104793a.f28945b, C41325b.this.f104794b);
                C53755c.m114319a().mo112959c((Object) C41325b.this);
            }
        }

        /* renamed from: a */
        public final void mo83903a(int i, Object obj) {
            if (i == 2) {
                try {
                    C41325b.this.f104794b.put("code", 0);
                } catch (JSONException unused) {
                }
                C41325b.this.f104796d.mo19455a(C41325b.this.f104793a.f28945b, C41325b.this.f104794b);
                C53755c.m114319a().mo112959c((Object) C41325b.this);
            }
        }
    };

    @C53771m
    public final void onEvent(C19717a aVar) {
        this.f104797e.mo83948a(aVar.f54285a, aVar.f54286b, aVar.f54287c);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        super.call(hVar, jSONObject);
        if (this.f104797e == null) {
            this.f104797e = this.f104798f.mo83904a(this.f104795c, this.f104799g);
        }
        this.f104793a.f28951h = false;
        JSONObject jSONObject2 = this.f104793a.f28947d.getJSONObject("args");
        this.f104797e.mo83949a(jSONObject2.getString("iap_id"), Integer.parseInt(jSONObject2.getString("diamond_id")));
    }

    public C41325b(Context context, C10757a aVar, C41329d dVar) {
        super(context, aVar);
        this.f104798f = dVar;
    }
}
