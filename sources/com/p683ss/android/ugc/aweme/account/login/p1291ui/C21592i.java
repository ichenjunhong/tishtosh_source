package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.p683ss.android.mobilelib.model.PersistentData;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.mobilelib.view.InputCodePasswordView;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.p683ss.android.ugc.aweme.account.login.C21389n;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21112q;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21124a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.i */
public class C21592i extends C21584h<C21124a> implements InputCodePasswordView {

    /* renamed from: a */
    protected String f58559a;

    /* renamed from: q */
    protected TextView f58560q;

    /* renamed from: r */
    public EditText f58561r;

    /* renamed from: s */
    public View f58562s;

    /* renamed from: t */
    public C21124a f58563t;

    /* renamed from: u */
    public C21112q f58564u;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo45840j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo45845o() {
        return this.f58559a;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResendFail() {
    }

    public void onResendSuccess() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo45859v() {
        return 2;
    }

    /* renamed from: w */
    public final int mo45860w() {
        return C22165u.f59781u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ CommonPresent mo45812g() {
        if ((this.f58563t == null || !this.f58563t.isValid()) && getContext() != null) {
            this.f58563t = new C21124a(getContext(), this);
        }
        return this.f58563t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45854b(int i) {
        if (isViewValid()) {
            this.f58561r.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58559a = arguments.getString("phone_number");
        } else {
            this.f58559a = PersistentData.inst().getLastLoginMobile();
        }
    }

    /* renamed from: a */
    public final void mo45874a(String str, String str2) {
        C26890h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setJsonObject(C23088c.m56631a().mo47824a("enter_from", this.f58454d).mo47824a("position", this.f58455e).mo47825b()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58560q = (TextView) view.findViewById(R.id.dkq);
        this.f58561r = (EditText) view.findViewById(R.id.a9x);
        this.f58538A = (TextView) view.findViewById(R.id.cpz);
        this.f58562s = view.findViewById(R.id.ol);
        this.f58539B = (TextView) view.findViewById(R.id.aki);
        this.f58560q.setText(this.f58559a);
        this.f58561r.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                int i;
                boolean z = false;
                if (TextUtils.isEmpty(editable.toString())) {
                    i = 0;
                } else {
                    i = editable.toString().length();
                }
                View view = C21592i.this.f58562s;
                if (i == 4) {
                    z = true;
                }
                C22308a.m55206a(view, z);
            }
        });
        C22308a.m55206a(this.f58562s, false);
        this.f58562s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(C21592i.this.f58561r.getText()) && C21592i.this.f58561r.getText().toString().length() == 4) {
                    C22308a.m55207b(C21592i.this.f58562s);
                    C21124a aVar = C21592i.this.f58563t;
                    String str = C21592i.this.f58559a;
                    String obj = C21592i.this.f58561r.getText().toString();
                    String str2 = "";
                    C21112q qVar = C21592i.this.f58564u;
                    if (aVar.isValid()) {
                        aVar.f57396a.mo24622a(str, obj, Integer.valueOf(0), str2, (C13133j) qVar);
                    }
                    C21592i.this.mo45874a("credible_auth", "click_auth");
                    C26890h.m65011a("login_submit", C20856a.m53173a().mo44776a("enter_from", C21592i.this.f58454d).mo44776a("enter_method", C21592i.this.f58455e).mo44776a("enter_type", C21592i.this.f58456j).mo44776a("group_id", C21021e.m53409a(C21592i.this.getArguments())).mo44776a("log_pb", C21021e.m53412b(C21592i.this.getArguments())).mo44776a("platform", "sms_verification").f56798a);
                }
            }
        });
        this.f58564u = new C21112q(this) {
            public final void onSuccess(C12993e<C13116o> eVar) {
                super.onSuccess(eVar);
                C21378a.m53998a().mo45512a("", "", true, "login", "", "mobile login success");
                C22089b.m54868a("aweme_phone_login_rate", 1, C23088c.m56631a().mo47825b());
                if (C21592i.this.getActivity() != null) {
                    if (C21592i.this.getActivity() instanceof C21389n) {
                        ((C21389n) C21592i.this.getActivity()).mo45573a(true);
                    }
                    ((C21379m) C21592i.this.getActivity()).mo45026a(C21592i.this.mo45848b("phone_sms"));
                }
                C22308a.m55205a(C21592i.this.f58562s);
                C21592i.this.mo45874a("credible_auth", "auth_success");
                C21592i.this.mo45874a("sign_in_success", "sms_verification");
                KeyboardUtils.m58184c(C21592i.this.f58561r);
                C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21592i.this.f58455e).mo44776a("enter_from", C21592i.this.f58454d).mo44776a("enter_type", C21592i.this.f58456j).mo44776a("platform", "sms_verification").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
            }

            /* JADX WARNING: type inference failed for: r2v12 */
            /* JADX WARNING: type inference failed for: r2v13, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r2v14, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r2v15 */
            /* JADX WARNING: type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r2v17, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r2v18 */
            /* JADX WARNING: type inference failed for: r2v19 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v12
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 161
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 4 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo45097a(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13116o> r11) {
                /*
                    r10 = this;
                    super.mo45097a(r11)
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.account.login.C21389n
                    r1 = 0
                    if (r0 == 0) goto L_0x0019
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.n r0 = (com.p683ss.android.ugc.aweme.account.login.C21389n) r0
                    r0.mo45573a(r1)
                L_0x0019:
                    int r0 = r11.f34000c
                    java.lang.String r2 = r11.f34001d
                    com.p683ss.android.ugc.aweme.account.p1302o.C22093d.m54879b(r1, r0, r2)
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.a r2 = new com.ss.android.ugc.aweme.account.a.b.a
                    r2.<init>()
                    java.lang.String r3 = "platform"
                    java.lang.String r4 = "sms_verification"
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo44776a(r3, r4)
                    java.lang.String r3 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.i r4 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    java.lang.String r4 = r4.f58455e
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo44776a(r3, r4)
                    java.lang.String r3 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.i r4 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    java.lang.String r4 = r4.f58456j
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo44776a(r3, r4)
                    java.lang.String r3 = "carrier"
                    java.lang.String r4 = ""
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo44776a(r3, r4)
                    java.lang.String r3 = "error_code"
                    int r4 = r11.f34000c
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo44774a(r3, r4)
                    java.util.Map<java.lang.String, java.lang.String> r2 = r2.f56798a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
                    java.lang.String r0 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                    java.lang.String r3 = "errorCode"
                    int r4 = r11.f34000c
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47822a(r3, r4)
                    java.lang.String r3 = "errorDesc"
                    java.lang.String r4 = r11.f34001d
                    com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
                    org.json.JSONObject r2 = r2.mo47825b()
                    com.p683ss.android.ugc.aweme.account.p1302o.C22089b.m54868a(r0, r1, r2)
                    int r0 = r11.f34000c
                    r1 = 1075(0x433, float:1.506E-42)
                    r2 = 0
                    if (r0 != r1) goto L_0x00bd
                    com.ss.android.ugc.aweme.account.login.f r0 = new com.ss.android.ugc.aweme.account.login.f
                    com.ss.android.ugc.aweme.account.login.ui.i r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r4 = r1.getActivity()
                    int r5 = r11.f34000c
                    T r1 = r11.f34007h
                    if (r1 == 0) goto L_0x0096
                    T r11 = r11.f34007h
                    com.bytedance.sdk.account.f.a.o r11 = (com.bytedance.sdk.account.p861f.p862a.C13116o) r11
                    org.json.JSONObject r11 = r11.f34279l
                    r6 = r11
                    goto L_0x0097
                L_0x0096:
                    r6 = r2
                L_0x0097:
                    r7 = 0
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    boolean r11 = r11 instanceof com.p683ss.android.ugc.aweme.account.login.C21379m
                    if (r11 == 0) goto L_0x00ab
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    r2 = r11
                    com.ss.android.ugc.aweme.account.login.m r2 = (com.p683ss.android.ugc.aweme.account.login.C21379m) r2
                L_0x00ab:
                    r8 = r2
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    java.lang.String r1 = "phone_sms"
                    android.os.Bundle r9 = r11.mo45848b(r1)
                    r3 = r0
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    com.p683ss.android.ugc.aweme.account.login.C21392p.m54014a(r0)
                    goto L_0x01bf
                L_0x00bd:
                    java.util.Set<java.lang.Integer> r0 = com.p683ss.android.ugc.aweme.account.util.C22262d.f60036a
                    int r1 = r11.f34000c
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L_0x00f2
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    if (r11 == 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    android.content.Context r11 = r11.getApplicationContext()
                    r0 = 2132551821(0x7f1c288d, float:2.0757012E38)
                    com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r11, r0)
                    r11.mo19066a()
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    r11.finish()
                    goto L_0x01bf
                L_0x00f2:
                    int r0 = r11.f34000c
                    r1 = 2003(0x7d3, float:2.807E-42)
                    if (r0 == r1) goto L_0x0199
                    int r0 = r11.f34000c
                    r1 = 2004(0x7d4, float:2.808E-42)
                    if (r0 != r1) goto L_0x0100
                    goto L_0x0199
                L_0x0100:
                    int r0 = r11.f34000c
                    r1 = 2027(0x7eb, float:2.84E-42)
                    if (r0 == r1) goto L_0x0177
                    int r0 = r11.f34000c
                    r1 = 2028(0x7ec, float:2.842E-42)
                    if (r0 != r1) goto L_0x010d
                    goto L_0x0177
                L_0x010d:
                    int r0 = r11.f34000c
                    r1 = 1091(0x443, float:1.529E-42)
                    if (r0 == r1) goto L_0x012d
                    int r0 = r11.f34000c
                    r1 = 1093(0x445, float:1.532E-42)
                    if (r0 != r1) goto L_0x011a
                    goto L_0x012d
                L_0x011a:
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r11 = com.p683ss.android.ugc.aweme.account.util.C22275o.m55130a(r11)
                    com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r11)
                    r11.mo19066a()
                    goto L_0x01bf
                L_0x012d:
                    T r0 = r11.f34007h
                    if (r0 == 0) goto L_0x0138
                    T r0 = r11.f34007h
                    com.bytedance.sdk.account.f.a.o r0 = (com.bytedance.sdk.account.p861f.p862a.C13116o) r0
                    org.json.JSONObject r0 = r0.f34279l
                    goto L_0x0139
                L_0x0138:
                    r0 = r2
                L_0x0139:
                    if (r0 == 0) goto L_0x0141
                    java.lang.String r1 = "data"
                    org.json.JSONObject r2 = r0.optJSONObject(r1)
                L_0x0141:
                    if (r2 == 0) goto L_0x01bf
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r2.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.support.v4.app.FragmentActivity r3 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r4 = r2.optString(r0)
                    int r11 = r11.f34000c
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    java.lang.String r6 = r11.f58456j
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    java.lang.String r7 = r11.f58455e
                    java.lang.String r8 = "sms_verification"
                    com.p683ss.android.ugc.aweme.account.util.C22261c.m55107a(r3, r4, r5, r6, r7, r8)
                    goto L_0x01bf
                L_0x0177:
                    java.lang.String r0 = r11.f34001d
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0189
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    r0 = 2132546358(0x7f1c1336, float:2.0745932E38)
                    java.lang.String r11 = r11.getString(r0)
                    goto L_0x018b
                L_0x0189:
                    java.lang.String r11 = r11.f34001d
                L_0x018b:
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r11)
                    r11.mo19066a()
                    goto L_0x01bf
                L_0x0199:
                    com.ss.android.ugc.aweme.account.login.ui.i r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.uikit.dialog.b$a r0 = com.p683ss.android.ugc.aweme.account.util.C22284v.m55156a(r0)
                    java.lang.String r11 = r11.f34001d
                    r0.mo20146b(r11)
                    r11 = 2132551645(0x7f1c27dd, float:2.0756655E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21596j.f58568a
                    r0.mo20136a(r11, r1)
                    r11 = 2132542529(0x7f1c0441, float:2.0738165E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21597k.f58569a
                    r0.mo20145b(r11, r1)
                    com.bytedance.ies.uikit.dialog.b r11 = r0.mo20143a()
                    com.p683ss.android.ugc.aweme.utils.C47700ay.m103235a(r11)
                L_0x01bf:
                    com.ss.android.ugc.aweme.account.login.ui.i r11 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.this
                    android.view.View r11 = r11.f58562s
                    com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a.m55205a(r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.C215953.mo45097a(com.bytedance.sdk.account.a.a.e):void");
            }
        };
        super.mo45849q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ays, viewGroup, false);
    }
}
