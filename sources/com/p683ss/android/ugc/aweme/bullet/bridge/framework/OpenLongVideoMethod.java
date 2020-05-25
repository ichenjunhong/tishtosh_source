package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27095b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27375i;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27378k;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27381n;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity.C36395a;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod */
public final class OpenLongVideoMethod extends BaseBridgeMethod {

    /* renamed from: c */
    public static final C24199a f64203c = new C24199a(null);

    /* renamed from: b */
    public String f64204b = "";

    /* renamed from: d */
    private C41047a f64205d;

    /* renamed from: e */
    private final String f64206e = "open_long_video";

    /* renamed from: f */
    private C10269a f64207f = C10269a.PRIVATE;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod$a */
    public static final class C24199a {
        private C24199a() {
        }

        public /* synthetic */ C24199a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod$b */
    public static final class C24200b implements C27381n {

        /* renamed from: a */
        final /* synthetic */ OpenLongVideoMethod f64208a;

        /* renamed from: b */
        final /* synthetic */ C27378k f64209b;

        /* renamed from: c */
        final /* synthetic */ Context f64210c;

        /* renamed from: d */
        final /* synthetic */ String f64211d;

        /* renamed from: e */
        final /* synthetic */ int f64212e;

        /* renamed from: b_ */
        public final void mo49943b_(Exception exc) {
            C52711k.m112240b(exc, "e");
            this.f64208a.mo49940j();
            this.f64209b.aq_();
            this.f64209b.mo46991S_();
        }

        /* renamed from: a */
        public final void mo49942a(Aweme aweme) {
            C52711k.m112240b(aweme, "aweme");
            this.f64208a.mo49940j();
            C36395a aVar = LongVideoActivity.f93195a;
            Context context = this.f64210c;
            String str = this.f64211d;
            if (str == null) {
                str = "poi_mba";
            }
            String str2 = str;
            int i = this.f64212e;
            String str3 = this.f64208a.f64204b;
            if (str3 == null) {
                C52711k.m112234a();
            }
            C36395a.m82125a(aVar, context, aweme, str2, 0, i, str3, false, 64, null);
            this.f64209b.aq_();
            this.f64209b.mo46991S_();
        }

        C24200b(OpenLongVideoMethod openLongVideoMethod, C27378k kVar, Context context, String str, int i) {
            this.f64208a = openLongVideoMethod;
            this.f64209b = kVar;
            this.f64210c = context;
            this.f64211d = str;
            this.f64212e = i;
        }
    }

    /* renamed from: a */
    public final void mo18295a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64207f;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64206e;
    }

    /* renamed from: j */
    public final void mo49940j() {
        boolean z;
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity == null || activity.isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C41047a aVar = this.f64205d;
            if (aVar != null && aVar.isShowing()) {
                try {
                    C41047a aVar2 = this.f64205d;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64207f = aVar;
    }

    public OpenLongVideoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        C47718bf.m103290c(this);
    }

    @C53771m
    public final void onEvent(C27095b bVar) {
        OpenLongVideoMethod openLongVideoMethod;
        C52711k.m112240b(bVar, "event");
        if (TextUtils.equals(bVar.f71465a, this.f64204b)) {
            openLongVideoMethod = this;
        } else {
            openLongVideoMethod = null;
        }
        OpenLongVideoMethod openLongVideoMethod2 = openLongVideoMethod;
        if (openLongVideoMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", bVar.f71466b);
            jSONObject2.put("current_time", Float.valueOf(((float) C52753d.m112317a(bVar.f71467c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", bVar.f71468d);
            jSONObject2.put("react_id", openLongVideoMethod2.f64204b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openLongVideoMethod2.mo49905a("notification", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) throws JSONException {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String str = null;
        if (!jSONObject.has("aweme_id")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.f64204b = jSONObject.optString("react_id");
            String optString = jSONObject.optString("aweme_id");
            double optDouble = jSONObject.optDouble("current_time");
            String optString2 = jSONObject.optString("enter_from");
            Context e = mo18743e();
            if (e != null) {
                C52711k.m112236a((Object) optString, "awemeId");
                int i = (int) (optDouble * 1000.0d);
                Resources resources = e.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.c0l);
                }
                this.f64205d = C41047a.m90709a(e, str);
                C41047a aVar2 = this.f64205d;
                if (aVar2 != null) {
                    aVar2.setIndeterminate(false);
                }
                C27378k kVar = new C27378k();
                C24200b bVar = new C24200b(this, kVar, e, optString2, i);
                kVar.mo54800a(bVar);
                kVar.mo54799a(new C27375i());
                kVar.mo44934a_(optString);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo49913a(jSONObject2);
    }
}
