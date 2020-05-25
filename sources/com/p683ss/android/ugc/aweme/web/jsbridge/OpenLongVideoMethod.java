package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27095b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27375i;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27378k;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27381n;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity.C36395a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod */
public final class OpenLongVideoMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C48293a f121512b = new C48293a(null);

    /* renamed from: a */
    public String f121513a;

    /* renamed from: c */
    private C41047a f121514c;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$a */
    public static final class C48293a {
        private C48293a() {
        }

        public /* synthetic */ C48293a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$b */
    public static final class C48294b implements C27381n {

        /* renamed from: a */
        final /* synthetic */ OpenLongVideoMethod f121515a;

        /* renamed from: b */
        final /* synthetic */ C27378k f121516b;

        /* renamed from: c */
        final /* synthetic */ Context f121517c;

        /* renamed from: d */
        final /* synthetic */ String f121518d;

        /* renamed from: e */
        final /* synthetic */ int f121519e;

        /* renamed from: b_ */
        public final void mo49943b_(Exception exc) {
            C52711k.m112240b(exc, "e");
            this.f121515a.mo95790c();
            this.f121516b.aq_();
            this.f121516b.mo46991S_();
        }

        /* renamed from: a */
        public final void mo49942a(Aweme aweme) {
            C52711k.m112240b(aweme, "aweme");
            this.f121515a.mo95790c();
            C36395a aVar = LongVideoActivity.f93195a;
            Context context = this.f121517c;
            String str = this.f121518d;
            if (str == null) {
                str = "poi_mba";
            }
            String str2 = str;
            int i = this.f121519e;
            String str3 = this.f121515a.f121513a;
            if (str3 == null) {
                C52711k.m112234a();
            }
            C36395a.m82125a(aVar, context, aweme, str2, 0, i, str3, false, 64, null);
            this.f121516b.aq_();
            this.f121516b.mo46991S_();
        }

        C48294b(OpenLongVideoMethod openLongVideoMethod, C27378k kVar, Context context, String str, int i) {
            this.f121515a = openLongVideoMethod;
            this.f121516b = kVar;
            this.f121517c = context;
            this.f121518d = str;
            this.f121519e = i;
        }
    }

    public OpenLongVideoMethod() {
        this(null, 1, null);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C47718bf.m103291d(this);
    }

    /* renamed from: c */
    public final void mo95790c() {
        boolean z;
        Activity activity = (Activity) this.f77793e.get();
        if (activity == null || activity.isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C41047a aVar = this.f121514c;
            if (aVar != null && aVar.isShowing()) {
                try {
                    C41047a aVar2 = this.f121514c;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public OpenLongVideoMethod(C10757a aVar) {
        super(aVar);
        this.f121513a = "";
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        Context context = (Context) weakReference.get();
        if (context instanceof C0184k) {
            ((C0184k) context).getLifecycle().mo324a(this);
        }
        BaseCommonJavaMethod a = super.mo60035a(weakReference);
        C52711k.m112236a((Object) a, "super.attach(contextRef)");
        return a;
    }

    @C53771m
    public final void onEvent(C27095b bVar) {
        OpenLongVideoMethod openLongVideoMethod;
        C52711k.m112240b(bVar, "event");
        if (TextUtils.equals(bVar.f71465a, this.f121513a)) {
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
            jSONObject2.put("react_id", openLongVideoMethod2.f121513a);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openLongVideoMethod2.mo60037b("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        if (jSONObject != null) {
            String str = null;
            if (!jSONObject.has("aweme_id")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f121513a = jSONObject.optString("react_id");
                String optString = jSONObject.optString("aweme_id");
                double optDouble = jSONObject.optDouble("current_time");
                String optString2 = jSONObject.optString("enter_from");
                WeakReference weakReference = this.f77793e;
                if (weakReference != null) {
                    Context context = (Context) weakReference.get();
                    if (context != null) {
                        C52711k.m112236a((Object) context, "this");
                        C52711k.m112236a((Object) optString, "awemeId");
                        int i = (int) (optDouble * 1000.0d);
                        Resources resources = context.getResources();
                        if (resources != null) {
                            str = resources.getString(R.string.c0l);
                        }
                        this.f121514c = C41047a.m90709a(context, str);
                        C41047a aVar2 = this.f121514c;
                        if (aVar2 != null) {
                            aVar2.setIndeterminate(false);
                        }
                        C27378k kVar = new C27378k();
                        C48294b bVar = new C48294b(this, kVar, context, optString2, i);
                        kVar.mo54800a(bVar);
                        kVar.mo54799a(new C27375i());
                        kVar.mo44934a_(optString);
                    }
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ OpenLongVideoMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
