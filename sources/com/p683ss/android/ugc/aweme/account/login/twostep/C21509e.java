package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.Intent;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9413g;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.C21517a;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity.C21475b;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0011g;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e */
public final class C21509e extends C21516g implements C21475b {

    /* renamed from: d */
    public static final boolean f58330d = false;

    /* renamed from: e */
    public static final C21510a f58331e = new C21510a(null);

    /* renamed from: a */
    public LoadingButton f58332a;

    /* renamed from: b */
    public ImageView f58333b;

    /* renamed from: c */
    public String f58334c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$a */
    public static final class C21510a {
        private C21510a() {
        }

        public /* synthetic */ C21510a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$b */
    static final class C21511b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21509e f58335a;

        C21511b(C21509e eVar) {
            this.f58335a = eVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            JSONObject jSONObject2 = this.f58335a.f58344h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21509e eVar = this.f58335a;
            String a = C9413g.m18629a(jSONObject, "verify_ticket", "");
            C52711k.m112236a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            eVar.mo45716d(a);
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray("platforms");
            } else {
                jSONArray = null;
            }
            if (TextUtils.isEmpty(this.f58335a.f58346j) || jSONArray == null || jSONArray.length() <= 0) {
                this.f58335a.mo45708a(null, "Verify ticket or platform is unavailable");
                return;
            }
            final int i = 0;
            this.f58335a.f58334c = jSONArray.getString(0);
            String str = this.f58335a.f58334c;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1240244679:
                        if (str.equals("google")) {
                            i = R.drawable.ceo;
                            break;
                        }
                        break;
                    case -916346253:
                        if (str.equals("twitter")) {
                            i = R.drawable.ces;
                            break;
                        }
                        break;
                    case 3765:
                        if (str.equals("vk")) {
                            i = R.drawable.cet;
                            break;
                        }
                        break;
                    case 3321844:
                        if (str.equals("line")) {
                            i = R.drawable.cer;
                            break;
                        }
                        break;
                    case 28903346:
                        if (str.equals("instagram")) {
                            i = R.drawable.cep;
                            break;
                        }
                        break;
                    case 486515695:
                        if (str.equals("kakaotalk")) {
                            i = R.drawable.ceq;
                            break;
                        }
                        break;
                    case 497130182:
                        if (str.equals("facebook")) {
                            i = R.drawable.cen;
                            break;
                        }
                        break;
                }
            }
            if (i <= 0) {
                C21509e eVar2 = this.f58335a;
                StringBuilder sb = new StringBuilder("Unknown third party platform: ");
                sb.append(this.f58335a.f58334c);
                eVar2.mo45708a(null, sb.toString());
                return;
            }
            C47957v.m103768a((Runnable) new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C21511b f58336a;

                {
                    this.f58336a = r1;
                }

                public final void run() {
                    C21509e.m54156a(this.f58336a.f58335a).setEnabled(true);
                    ImageView imageView = this.f58336a.f58335a.f58333b;
                    if (imageView == null) {
                        C52711k.m112237a("providerImage");
                    }
                    imageView.setImageResource(i);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$c */
    static final class C21513c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21509e f58338a;

        C21513c(C21509e eVar) {
            this.f58338a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21509e.m54156a(this.f58338a).mo46295a();
            Intent intent = new Intent(this.f58338a.mo45715d(), AuthorizeActivity.class);
            intent.putExtra("platform", this.f58338a.f58334c);
            intent.putExtra("is_only_fetch_token", true);
            intent.putExtra("is_login", false);
            if (this.f58338a.mo45715d() instanceof TwoStepAuthActivity) {
                AppCompatActivity d = this.f58338a.mo45715d();
                if (d != null) {
                    ((TwoStepAuthActivity) d).f58255e = this.f58338a;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity");
                }
            }
            AppCompatActivity d2 = this.f58338a.mo45715d();
            if (d2 != null) {
                d2.startActivityForResult(intent, 123);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$d */
    static final class C21514d<TTaskResult, TContinuationResult> implements C0011g<C21483c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21509e f58339a;

        C21514d(C21509e eVar) {
            this.f58339a = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
            /*
                r4 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47957v.m103770a(r5)
                r1 = 0
                if (r0 != 0) goto L_0x000f
                com.ss.android.ugc.aweme.account.login.twostep.e r5 = r4.f58339a
                java.lang.String r0 = "TwoStepAuthApi.verifyThirdParty bolts Task error"
                r5.mo45708a(r1, r0)
                return r1
            L_0x000f:
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.Object r5 = r5.mo34e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c) r5
                java.lang.String r0 = "success"
                java.lang.String r2 = r5.f58281a
                r3 = 1
                boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r2, r3)
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                java.lang.String r0 = r0.f58283a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0036
                goto L_0x0042
            L_0x0036:
                com.ss.android.ugc.aweme.account.login.twostep.e r0 = r4.f58339a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                java.lang.String r5 = r5.f58283a
                r0.mo45709a(r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            L_0x0042:
                if (r5 == 0) goto L_0x004b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x004b
                java.lang.Integer r0 = r0.f58285c
                goto L_0x004c
            L_0x004b:
                r0 = r1
            L_0x004c:
                if (r5 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                if (r5 == 0) goto L_0x0055
                java.lang.String r5 = r5.f58286d
                goto L_0x0056
            L_0x0055:
                r5 = r1
            L_0x0056:
                com.ss.android.ugc.aweme.account.login.twostep.e r2 = r4.f58339a
                r2.mo45708a(r0, r5)
                com.ss.android.ugc.aweme.account.login.twostep.e r0 = r4.f58339a
                android.support.v7.app.AppCompatActivity r0 = r0.mo45715d()
                android.content.Context r0 = (android.content.Context) r0
                com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r5)
                r5.mo19066a()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21509e.C21514d.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final View mo45685a() {
        if (this.f58347k.getLayoutResource() <= 0) {
            this.f58347k.setLayoutResource(R.layout.azo);
        }
        View inflate = this.f58347k.inflate();
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.bi1);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.lobby_authenticator_image)");
        this.f58333b = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bi0);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.lobby_authenticator_button)");
        this.f58332a = (LoadingButton) findViewById2;
        LoadingButton loadingButton = this.f58332a;
        if (loadingButton == null) {
            C52711k.m112237a("verifyButton");
        }
        C10705c.m21579a(loadingButton);
        LoadingButton loadingButton2 = this.f58332a;
        if (loadingButton2 == null) {
            C52711k.m112237a("verifyButton");
        }
        loadingButton2.setEnabled(false);
        LoadingButton loadingButton3 = this.f58332a;
        if (loadingButton3 == null) {
            C52711k.m112237a("verifyButton");
        }
        loadingButton3.setOnClickListener(new C21513c(this));
        if (this.f58344h == null) {
            mo45708a(null, "JSON is empty");
        } else {
            C47957v.m103771b(new C21511b(this));
        }
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadingButton m54156a(C21509e eVar) {
        LoadingButton loadingButton = eVar.f58332a;
        if (loadingButton == null) {
            C52711k.m112237a("verifyButton");
        }
        return loadingButton;
    }

    /* renamed from: a */
    public final void mo45709a(String str) {
        LoadingButton loadingButton = this.f58332a;
        if (loadingButton == null) {
            C52711k.m112237a("verifyButton");
        }
        loadingButton.mo46296b();
        mo45717e(str);
    }

    /* renamed from: a */
    public final void mo45708a(Integer num, String str) {
        LoadingButton loadingButton = this.f58332a;
        if (loadingButton == null) {
            C52711k.m112237a("verifyButton");
        }
        loadingButton.mo46296b();
        C10691a.m21545b((Context) mo45715d(), mo45714b(num, str)).mo19066a();
    }

    public C21509e(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "stub");
        C52711k.m112240b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r13 == null) goto L_0x0043;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, java.lang.String]
      uses: [java.lang.String, ?[OBJECT, ARRAY]]
      mth insns count: 56
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45658a(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r0 = 123(0x7b, float:1.72E-43)
            if (r13 != r0) goto L_0x0089
            r13 = -1
            r0 = 0
            r1 = 0
            if (r14 != r13) goto L_0x0070
            if (r15 == 0) goto L_0x0013
            java.lang.String r13 = "access_token"
            java.lang.String r13 = r15.getStringExtra(r13)
            r3 = r13
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            if (r15 == 0) goto L_0x001e
            java.lang.String r13 = "access_token_secret"
            java.lang.String r13 = r15.getStringExtra(r13)
            r4 = r13
            goto L_0x001f
        L_0x001e:
            r4 = r1
        L_0x001f:
            if (r15 == 0) goto L_0x0029
            java.lang.String r13 = "code"
            java.lang.String r13 = r15.getStringExtra(r13)
            r5 = r13
            goto L_0x002a
        L_0x0029:
            r5 = r1
        L_0x002a:
            if (r15 == 0) goto L_0x0038
            java.lang.String r13 = "expires_in"
            int r13 = r15.getIntExtra(r13, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6 = r13
            goto L_0x0039
        L_0x0038:
            r6 = r1
        L_0x0039:
            if (r15 == 0) goto L_0x0043
            java.lang.String r13 = "platform_id"
            java.lang.String r13 = r15.getStringExtra(r13)
            if (r13 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r13 = ""
        L_0x0045:
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi r14 = com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.f58265b
            java.lang.String r8 = r12.f58334c
            java.lang.String r11 = r12.f58346j
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r2 = r14.mo45660a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r13 == 0) goto L_0x005d
            int r13 = com.p683ss.android.ugc.aweme.account.utils.C22303i.m55193a(r13, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
        L_0x005d:
            r9 = r1
            r10 = 0
            a.i r13 = r2.verifyThirdParty(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.account.login.twostep.e$d r14 = new com.ss.android.ugc.aweme.account.login.twostep.e$d
            r14.<init>(r12)
            a.g r14 = (p001a.C0011g) r14
            java.util.concurrent.Executor r15 = p001a.C0013i.f25b
            r13.mo20a(r14, r15)
            return
        L_0x0070:
            if (r15 == 0) goto L_0x007d
            java.lang.String r13 = "error_code"
            int r13 = r15.getIntExtra(r13, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x007e
        L_0x007d:
            r13 = r1
        L_0x007e:
            if (r15 == 0) goto L_0x0086
            java.lang.String r14 = "description"
            java.lang.String r1 = r15.getStringExtra(r14)
        L_0x0086:
            r12.mo45708a(r13, r1)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21509e.mo45658a(int, int, android.content.Intent):void");
    }
}
