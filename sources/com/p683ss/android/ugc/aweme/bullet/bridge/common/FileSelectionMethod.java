package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29848a;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod */
public final class FileSelectionMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24148a f64062b = new C24148a(null);

    /* renamed from: c */
    private final String f64063c = "fileSelection";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$a */
    public static final class C24148a {
        private C24148a() {
        }

        public /* synthetic */ C24148a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b */
    public static final class C24149b extends C29848a {

        /* renamed from: a */
        final /* synthetic */ Activity f64064a;

        /* renamed from: b */
        final /* synthetic */ C24112a f64065b;

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b$a */
        static final class C24150a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C24149b f64066a;

            /* renamed from: b */
            final /* synthetic */ int f64067b;

            /* renamed from: c */
            final /* synthetic */ String f64068c;

            C24150a(C24149b bVar, int i, String str) {
                this.f64066a = bVar;
                this.f64067b = i;
                this.f64068c = str;
            }

            public final void run() {
                this.f64066a.mo60074a();
                this.f64066a.f64065b.mo49910a(this.f64067b, this.f64068c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b$b */
        static final class C24151b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C24149b f64069a;

            /* renamed from: b */
            final /* synthetic */ JSONArray f64070b;

            C24151b(C24149b bVar, JSONArray jSONArray) {
                this.f64069a = bVar;
                this.f64070b = jSONArray;
            }

            public final void run() {
                this.f64069a.mo60074a();
                this.f64069a.f64065b.mo49912a(this.f64070b, 1, "uploadSuccess");
            }
        }

        /* renamed from: a */
        public final void mo49923a(JSONArray jSONArray) {
            C52711k.m112240b(jSONArray, "datas");
            this.f64064a.runOnUiThread(new C24151b(this, jSONArray));
        }

        /* renamed from: a */
        public final void mo49922a(int i, String str) {
            C52711k.m112240b(str, "msg");
            this.f64064a.runOnUiThread(new C24150a(this, i, str));
        }

        C24149b(Activity activity, C24112a aVar, Activity activity2) {
            this.f64064a = activity;
            this.f64065b = aVar;
            super(activity2);
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64063c;
    }

    public FileSelectionMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            new C24149b(activity, aVar, activity).mo60075a(jSONObject);
        }
    }
}
