package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.support.p043v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9413g;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.C21517a;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.Api;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.util.C22266h;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c */
public final class C21496c extends C21516g {

    /* renamed from: b */
    public static final boolean f58306b = false;

    /* renamed from: c */
    public static final C21497a f58307c = new C21497a(null);

    /* renamed from: a */
    public LoadingButton f58308a;

    /* renamed from: d */
    private InputWithIndicator f58309d;

    /* renamed from: e */
    private InputResultIndicator f58310e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$a */
    public static final class C21497a {
        private C21497a() {
        }

        public /* synthetic */ C21497a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$b */
    static final class C21498b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21496c f58311a;

        C21498b(C21496c cVar) {
            this.f58311a = cVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58311a.f58344h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21496c cVar = this.f58311a;
            String a = C9413g.m18629a(jSONObject, "verify_ticket", "");
            C52711k.m112236a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            cVar.mo45716d(a);
            if (TextUtils.isEmpty(this.f58311a.f58346j)) {
                this.f58311a.mo45697a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$c */
    public static final class C21499c extends C22307v {

        /* renamed from: a */
        final /* synthetic */ C21496c f58312a;

        C21499c(C21496c cVar) {
            this.f58312a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            LoadingButton loadingButton = this.f58312a.f58308a;
            if (loadingButton == null) {
                C52711k.m112237a("loadingButton");
            }
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            loadingButton.setEnabled(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$d */
    static final class C21500d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21496c f58313a;

        C21500d(C21496c cVar) {
            this.f58313a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58313a.mo45699b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$e */
    static final class C21501e<TTaskResult, TContinuationResult> implements C0011g<C21483c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21496c f58314a;

        C21501e(C21496c cVar) {
            this.f58314a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
            /*
                r4 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47957v.m103770a(r5)
                r1 = 0
                if (r0 != 0) goto L_0x001e
                com.ss.android.ugc.aweme.account.login.twostep.c r0 = r4.f58314a
                java.lang.String r2 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
                java.lang.Exception r5 = r5.mo35f()
                if (r5 == 0) goto L_0x0019
                java.lang.String r5 = r5.toString()
                goto L_0x001a
            L_0x0019:
                r5 = r1
            L_0x001a:
                r0.mo45697a(r1, r5)
                return r1
            L_0x001e:
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.Object r5 = r5.mo34e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c) r5
                java.lang.String r0 = "success"
                java.lang.String r2 = r5.f58281a
                r3 = 1
                boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r2, r3)
                if (r0 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                java.lang.String r0 = r0.f58283a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0045
                goto L_0x0051
            L_0x0045:
                com.ss.android.ugc.aweme.account.login.twostep.c r0 = r4.f58314a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                java.lang.String r5 = r5.f58283a
                r0.mo45698a(r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            L_0x0051:
                if (r5 == 0) goto L_0x005a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58282b
                if (r0 == 0) goto L_0x005a
                java.lang.Integer r0 = r0.f58285c
                goto L_0x005b
            L_0x005a:
                r0 = r1
            L_0x005b:
                if (r5 == 0) goto L_0x0064
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58282b
                if (r5 == 0) goto L_0x0064
                java.lang.String r5 = r5.f58286d
                goto L_0x0065
            L_0x0064:
                r5 = r1
            L_0x0065:
                com.ss.android.ugc.aweme.account.login.twostep.c r2 = r4.f58314a
                r2.mo45697a(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21496c.C21501e.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final void mo45699b() {
        boolean z;
        InputWithIndicator inputWithIndicator = this.f58309d;
        if (inputWithIndicator == null) {
            C52711k.m112237a("passwordInput");
        }
        String text = inputWithIndicator.getText();
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppCompatActivity d = mo45715d();
            if (d == null) {
                C52711k.m112234a();
            }
            String string = d.getString(R.string.az_);
            C52711k.m112236a((Object) string, "getActivity()!!.getStrin…ing.error_password_empty)");
            m54137b(string);
            return;
        }
        LoadingButton loadingButton = this.f58308a;
        if (loadingButton == null) {
            C52711k.m112237a("loadingButton");
        }
        loadingButton.mo46295a();
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f58265b;
        String str = this.f58346j;
        C52711k.m112240b(text, "password");
        C52711k.m112240b(str, "verifyTicket");
        Api a = twoStepAuthApi.mo45660a();
        String a2 = C22266h.m55115a(text);
        C52711k.m112236a((Object) a2, "CryptoUtils.encryptWithXor(password)");
        a.verifyPassword(null, null, null, a2, 1, str).mo20a((C0011g<TResult, TContinuationResult>) new C21501e<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: a */
    public final View mo45685a() {
        if (this.f58347k.getLayoutResource() <= 0) {
            this.f58347k.setLayoutResource(R.layout.azm);
        }
        View inflate = this.f58347k.inflate();
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.bwa);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.p…ord_authenticator_button)");
        this.f58308a = (LoadingButton) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bwe);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.p…word_authenticator_input)");
        this.f58309d = (InputWithIndicator) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.eo1);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.p…thenticator_input_result)");
        this.f58310e = (InputResultIndicator) findViewById3;
        InputWithIndicator inputWithIndicator = this.f58309d;
        if (inputWithIndicator == null) {
            C52711k.m112237a("passwordInput");
        }
        inputWithIndicator.setTextWatcher(new C21499c(this));
        LoadingButton loadingButton = this.f58308a;
        if (loadingButton == null) {
            C52711k.m112237a("loadingButton");
        }
        loadingButton.setEnabled(false);
        LoadingButton loadingButton2 = this.f58308a;
        if (loadingButton2 == null) {
            C52711k.m112237a("loadingButton");
        }
        loadingButton2.setOnClickListener(new C21500d(this));
        if (this.f58344h == null) {
            mo45697a(null, "JSON is empty");
        } else {
            C47957v.m103771b(new C21498b(this));
        }
        return inflate;
    }

    /* renamed from: b */
    private final void m54137b(String str) {
        InputResultIndicator inputResultIndicator = this.f58310e;
        if (inputResultIndicator == null) {
            C52711k.m112237a("passwordInputResult");
        }
        inputResultIndicator.mo45987a(str);
        LoadingButton loadingButton = this.f58308a;
        if (loadingButton == null) {
            C52711k.m112237a("loadingButton");
        }
        loadingButton.mo46296b();
    }

    /* renamed from: a */
    public final void mo45698a(String str) {
        InputResultIndicator inputResultIndicator = this.f58310e;
        if (inputResultIndicator == null) {
            C52711k.m112237a("passwordInputResult");
        }
        inputResultIndicator.mo45986a();
        LoadingButton loadingButton = this.f58308a;
        if (loadingButton == null) {
            C52711k.m112237a("loadingButton");
        }
        loadingButton.mo46296b();
        mo45717e(str);
    }

    /* renamed from: a */
    public final void mo45697a(Integer num, String str) {
        m54137b(mo45714b(num, str));
    }

    public C21496c(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "stub");
        C52711k.m112240b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
