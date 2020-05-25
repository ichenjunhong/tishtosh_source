package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.util.SparseArray;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22013k;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity */
public final class CommonFlowActivity extends BaseAccountFlowActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59094a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommonFlowActivity.class), "originalBundle", "getOriginalBundle()Landroid/os/Bundle;"))};

    /* renamed from: e */
    public static SparseArray<C20840g> f59095e = new SparseArray<>();

    /* renamed from: f */
    public static final C21824a f59096f = new C21824a(null);

    /* renamed from: b */
    public boolean f59097b;

    /* renamed from: c */
    public Bundle f59098c;

    /* renamed from: d */
    public boolean f59099d = true;

    /* renamed from: g */
    private C21850i f59100g = C21850i.PHONE_SMS_CHANGE_PASSWORD;

    /* renamed from: h */
    private final C52668f f59101h = C52732g.m112285a(new C21825b(this));

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$a */
    public static final class C21824a {
        private C21824a() {
        }

        public /* synthetic */ C21824a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo45958a(Activity activity, C21850i iVar, C21848h hVar, Bundle bundle, C20840g gVar) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(iVar, "step");
            C52711k.m112240b(hVar, "scene");
            C52711k.m112240b(bundle, "data");
            int i = bundle.getInt("current_scene", -1);
            if (i != -1) {
                bundle.putInt("last_scene", i);
            }
            Intent intent = new Intent(activity, CommonFlowActivity.class);
            bundle.putInt("next_page", iVar.getValue());
            bundle.putInt("current_scene", hVar.getValue());
            intent.putExtras(bundle);
            intent.putExtra("action_type", hVar.getValue());
            int value = hVar.getValue();
            if (gVar != null) {
                if (activity instanceof C0184k) {
                    CommonFlowActivity.f59095e.put(value, gVar);
                    C0184k kVar = (C0184k) activity;
                    kVar.getLifecycle().mo324a(new CommonFlowActivity$Companion$addResult$1(value, kVar));
                } else {
                    throw new IllegalArgumentException("activity must be a LifecycleOwner!");
                }
            }
            activity.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$b */
    static final class C21825b extends C52712l implements C52670a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ CommonFlowActivity f59102a;

        C21825b(CommonFlowActivity commonFlowActivity) {
            this.f59102a = commonFlowActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.f59102a.getIntent();
            C52711k.m112236a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.remove("next_page");
            return extras;
        }
    }

    /* renamed from: a */
    public final Bundle mo45577a() {
        return (Bundle) this.f59101h.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        int intExtra = getIntent().getIntExtra("action_type", -1);
        if (intExtra != -1 && f59095e.get(intExtra) != null) {
            if (!this.f59099d || (this.f59099d && this.f59097b)) {
                Object obj = f59095e.get(intExtra);
                if (obj == null) {
                    C52711k.m112234a();
                }
                ((C20840g) obj).onResult(intExtra, 1, this.f59098c);
            } else {
                Object obj2 = f59095e.get(intExtra);
                if (obj2 == null) {
                    C52711k.m112234a();
                }
                ((C20840g) obj2).onResult(intExtra, 2, null);
            }
            f59095e.remove(intExtra);
        }
    }

    /* renamed from: c */
    public final void mo45955c(Bundle bundle) {
        this.f59098c = bundle;
        this.f59099d = false;
        finish();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == null) goto L_0x000d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45579b(android.os.Bundle r2) {
        /*
            r1 = this;
            r0 = 1
            r1.f59097b = r0
            if (r2 == 0) goto L_0x000d
            java.lang.String r0 = "final_data"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 != 0) goto L_0x0012
        L_0x000d:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0012:
            r1.f59098c = r2
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.base.CommonFlowActivity.mo45579b(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45578a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C21850i a = C21851a.m54529a(bundle2.getInt("next_page", C21850i.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", a.getValue());
        int i = bundle2.getInt("next_next_page", -1);
        if (i != -1) {
            bundle2.putInt("next_page", i);
            bundle2.remove("next_next_page");
        } else {
            bundle2.remove("next_page");
        }
        mo45950a(C22013k.m54758a(a), bundle2);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f59100g = C21851a.m54529a(getIntent().getIntExtra("next_page", C21850i.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        if (bundle == null) {
            C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a((FragmentActivity) this).mo359a(ActionResultModel.class)).f59091b;
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("enter_from", mo45952c());
            extras.putString("enter_method", mo45953d());
            extras.putString("enter_type", mo45954e());
            extras.putInt("next_page", this.f59100g.getValue());
            pVar.postValue(extras);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", false);
    }
}
