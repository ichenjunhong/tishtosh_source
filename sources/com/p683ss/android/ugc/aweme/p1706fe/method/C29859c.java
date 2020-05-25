package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.c */
public final class C29859c implements C10762d {

    /* renamed from: a */
    C29848a f77952a;

    /* renamed from: b */
    C10757a f77953b;

    /* renamed from: c */
    String f77954c;

    /* renamed from: d */
    public WeakReference<Activity> f77955d;

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        hVar.f28951h = false;
        this.f77954c = hVar.f28945b;
        this.f77952a.mo60075a(hVar.f28947d);
    }

    public C29859c(Activity activity, C10757a aVar) {
        this.f77953b = aVar;
        this.f77955d = new WeakReference<>(activity);
        this.f77952a = new C29848a(activity) {
            /* renamed from: a */
            public final void mo49923a(final JSONArray jSONArray) {
                Activity activity = (Activity) C29859c.this.f77955d.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            C29859c cVar = C29859c.this;
                            JSONArray jSONArray = jSONArray;
                            cVar.f77952a.mo60074a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", 1);
                                jSONObject.put("msg", "uploadSuccess");
                                jSONObject.put("data", jSONArray);
                                cVar.f77953b.mo19455a(cVar.f77954c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f77953b.mo19455a(cVar.f77954c, (JSONObject) null);
                            }
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo49922a(final int i, final String str) {
                Activity activity = (Activity) C29859c.this.f77955d.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            C29859c cVar = C29859c.this;
                            int i = i;
                            String str = str;
                            cVar.f77952a.mo60074a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", i);
                                jSONObject.put("msg", str);
                                jSONObject.put("data", new JSONArray());
                                cVar.f77953b.mo19455a(cVar.f77954c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f77953b.mo19455a(cVar.f77954c, (JSONObject) null);
                            }
                        }
                    });
                }
            }
        };
    }
}
