package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.mobilelib.view.InputCodePasswordView;
import com.p683ss.android.mobilelib.view.Register1View;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.p683ss.android.ugc.aweme.account.login.C21389n;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21091a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21112q;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21127d;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.PhonePassLoginView.C21538a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.HideLoginPlatformModel;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.experiments.WillShowFeedBack;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.r */
public final class C21615r extends C21584h<C21127d> implements InputCodePasswordView, Register1View, C21055ac, C21091a {

    /* renamed from: G */
    private ImageView f58603G;

    /* renamed from: H */
    private TextView f58604H;

    /* renamed from: I */
    private boolean f58605I;

    /* renamed from: J */
    private OnClickListener f58606J = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == R.id.dk_) {
                if (C21615r.this.getActivity() != null) {
                    C26894c.m65021a(C21615r.this.getActivity(), C21615r.this.f58513o);
                    if (C21615r.this.f58613v) {
                        C21615r.this.getActivity().onBackPressed();
                    } else {
                        C21615r.this.getActivity().finish();
                    }
                }
                if (C21615r.this.f58609r) {
                    C23826bi.m58452a(50, 1, "");
                }
            } else if (id == R.id.dkk) {
                C22300g.m55188a(C23826bi.m58460b(), "login_pad", "");
            } else if (id == R.id.cfl) {
                KeyboardUtils.m58184c(C21615r.this.f58513o);
            }
        }
    };

    /* renamed from: a */
    protected ThirdPartyLoginView f58607a;

    /* renamed from: q */
    protected PhonePassLoginView f58608q;

    /* renamed from: r */
    protected boolean f58609r;

    /* renamed from: s */
    public EditText f58610s;

    /* renamed from: t */
    protected C21127d f58611t;

    /* renamed from: u */
    protected C21112q f58612u;

    /* renamed from: v */
    public boolean f58613v;

    /* renamed from: w */
    public boolean f58614w = true;

    /* renamed from: x */
    private View f58615x;

    public final boolean aj_() {
        return false;
    }

    public final void onCheckMobileSuccess() {
    }

    public final void onCheckMobileUserExist(String str) {
    }

    public final void onResendFail() {
    }

    public final void onResendSuccess() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo45859v() {
        return 0;
    }

    /* renamed from: w */
    public final int mo45860w() {
        return C22165u.f59781u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo45868y() {
        this.f58605I = true;
        m54326i();
    }

    public final void onCheckMobileFail() {
        C18898c.m46009a(getActivity(), "registered_fail", "phone");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f58612u != null) {
            this.f58612u.cancel();
        }
    }

    public final void onStart() {
        super.onStart();
        C23826bi.m58452a(2, 1, "");
    }

    public final void onStop() {
        super.onStop();
        C23826bi.m58452a(2, 4, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo45867x() {
        if (this.f58607a.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void afterHandleRequest() {
        super.afterHandleRequest();
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f58608q.mo45160a();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void beforeHandleRequest() {
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f58608q.mo45161c();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ CommonPresent mo45812g() {
        if ((this.f58611t == null || !this.f58611t.isValid()) && getContext() != null) {
            this.f58611t = new C21127d(getContext(), this);
        }
        return this.f58611t;
    }

    public final void onPause() {
        super.onPause();
        C26894c.m65021a(getActivity(), this.f58610s);
        C26894c.m65021a(getActivity(), this.f58513o);
    }

    /* renamed from: i */
    private void m54326i() {
        if (this.f58607a.getVisibility() != 0 && !this.f58605I && !this.f58613v) {
            C9432q.m18691b(this.f58615x, 8);
        } else if (C10181b.m20511a().mo18168a(WillShowFeedBack.class, true, "is_show_feed_back", 31744, 1) == 1) {
            C9432q.m18691b(this.f58615x, 0);
        }
    }

    public final boolean ai_() {
        if (getArguments() == null || !this.f58614w || C23826bi.m58466g() || getArguments().getInt("bundle_flow_type", C21459s.f58206p) != C21459s.f58208r) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static void m54325c(View view) {
        view.requestFocus();
        KeyboardUtils.m58182a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45854b(int i) {
        if (isViewValid()) {
            this.f58610s.requestFocus();
            this.f58614w = false;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58609r = arguments.getBoolean("bundle_need_back");
            this.f58613v = arguments.getBoolean("from_one_login");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45847a(String str) {
        if (str != null) {
            if (this.f58613v || str.length() != 0) {
                this.f58607a.setVisibility(8);
                this.f58608q.setVisibility(0);
            } else {
                this.f58607a.setVisibility(0);
                this.f58608q.setVisibility(8);
                this.f58539B.setVisibility(8);
            }
        }
        this.f58538A.setEnabled(mo45840j());
        this.f58538A.setClickable(mo45840j());
        this.f58607a.getVisibility();
        m54326i();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        mo45849q();
        this.f58612u = new C21112q(this) {
            public final void onSuccess(C12993e<C13116o> eVar) {
                super.onSuccess(eVar);
                C22087a.m54862a("success");
                C21378a.m53998a().mo45512a("", "", true, "login", "", "mobile login success");
                C22089b.m54868a("aweme_phone_login_rate", 1, C23088c.m56631a().mo47825b());
                C20994a.m53360a(C20996b.LOGIN_BY_PHONE_SMS, C20995a.PHONE_SMS, "");
                if (C21615r.this.getActivity() != null) {
                    if (C21615r.this.getActivity() instanceof C21389n) {
                        ((C21389n) C21615r.this.getActivity()).mo45573a(true);
                    }
                    ((C21379m) C21615r.this.getActivity()).mo45026a(C21615r.this.mo45848b("phone_sms"));
                }
                if (C21615r.this.f58608q != null) {
                    C21615r.this.f58608q.mo45160a();
                }
                C26890h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("sms_verification").setJsonObject(C23088c.m56631a().mo47824a("enter_from", C21615r.this.f58454d).mo47824a("position", C21615r.this.f58455e).mo47825b()));
                C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21615r.this.f58455e).mo44776a("enter_from", C21615r.this.f58454d).mo44776a("platform", "sms_verification").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                if (C21615r.this.getArguments() != null && C21615r.this.getArguments().getBoolean("need_remember_login_method", true)) {
                    C21518u.m54176b(new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_SMS, C21615r.this.f58509l));
                }
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v2, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v3 */
            /* JADX WARNING: type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r4v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 186
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
            public final void mo45097a(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13116o> r13) {
                /*
                    r12 = this;
                    super.mo45097a(r13)
                    java.lang.String r0 = r13.f34001d
                    com.p683ss.android.ugc.aweme.account.p1302o.C22087a.m54862a(r0)
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.a r1 = new com.ss.android.ugc.aweme.account.a.b.a
                    r1.<init>()
                    java.lang.String r2 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.r r3 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    java.lang.String r3 = r3.f58455e
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                    java.lang.String r2 = "platform"
                    java.lang.String r3 = "sms_verification"
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                    java.lang.String r2 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.r r3 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    java.lang.String r3 = r3.f58456j
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                    java.lang.String r2 = "carrier"
                    java.lang.String r3 = ""
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
                    java.lang.String r2 = "error_code"
                    int r3 = r13.f34000c
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44774a(r2, r3)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
                    int r0 = r13.f34000c
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r13.f34001d
                    com.ss.android.ugc.aweme.account.j.a$a r2 = com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a.PHONE_SMS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.p683ss.android.ugc.aweme.account.p1277j.C20994a.m53367b(r0, r1, r4, r2, r3)
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.account.login.C21389n
                    r1 = 0
                    if (r0 == 0) goto L_0x0066
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.n r0 = (com.p683ss.android.ugc.aweme.account.login.C21389n) r0
                    r0.mo45573a(r1)
                L_0x0066:
                    java.lang.String r0 = ""
                    com.ss.android.ugc.aweme.account.login.ui.r r2 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.content.Context r2 = r2.getContext()
                    if (r2 == 0) goto L_0x0079
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    r2 = 2132546352(0x7f1c1330, float:2.074592E38)
                    java.lang.String r0 = r0.getString(r2)
                L_0x0079:
                    java.lang.String r2 = r13.f34001d
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 == 0) goto L_0x0082
                    goto L_0x0084
                L_0x0082:
                    java.lang.String r0 = r13.f34001d
                L_0x0084:
                    int r2 = r13.f34000c
                    java.lang.String r3 = r13.f34001d
                    com.p683ss.android.ugc.aweme.account.p1302o.C22093d.m54879b(r1, r2, r3)
                    java.lang.String r2 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.app.f.c r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                    java.lang.String r5 = "errorCode"
                    int r6 = r13.f34000c
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    com.ss.android.ugc.aweme.app.f.c r3 = r3.mo47822a(r5, r6)
                    java.lang.String r5 = "errorDesc"
                    java.lang.String r6 = r13.f34001d
                    com.ss.android.ugc.aweme.app.f.c r3 = r3.mo47824a(r5, r6)
                    org.json.JSONObject r3 = r3.mo47825b()
                    com.p683ss.android.ugc.aweme.account.p1302o.C22089b.m54868a(r2, r1, r3)
                    int r1 = r13.f34000c
                    r2 = 1075(0x433, float:1.506E-42)
                    if (r1 != r2) goto L_0x00fb
                    com.ss.android.ugc.aweme.account.login.f r0 = new com.ss.android.ugc.aweme.account.login.f
                    com.ss.android.ugc.aweme.account.login.ui.r r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r6 = r1.getActivity()
                    int r7 = r13.f34000c
                    T r1 = r13.f34007h
                    if (r1 == 0) goto L_0x00c8
                    T r13 = r13.f34007h
                    com.bytedance.sdk.account.f.a.o r13 = (com.bytedance.sdk.account.p861f.p862a.C13116o) r13
                    org.json.JSONObject r13 = r13.f34279l
                    r8 = r13
                    goto L_0x00c9
                L_0x00c8:
                    r8 = r4
                L_0x00c9:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r9 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r13 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS
                    com.ss.android.ugc.aweme.account.login.ui.r r2 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    com.ss.android.ugc.aweme.account.login.d.a$a r2 = r2.f58509l
                    r9.<init>(r13, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    boolean r13 = r13 instanceof com.p683ss.android.ugc.aweme.account.login.C21379m
                    if (r13 == 0) goto L_0x00e9
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r4 = r13
                    com.ss.android.ugc.aweme.account.login.m r4 = (com.p683ss.android.ugc.aweme.account.login.C21379m) r4
                L_0x00e9:
                    r10 = r4
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    java.lang.String r1 = "phone_sms"
                    android.os.Bundle r11 = r13.mo45848b(r1)
                    r5 = r0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    com.p683ss.android.ugc.aweme.account.login.C21392p.m54014a(r0)
                    goto L_0x01f5
                L_0x00fb:
                    java.util.Set<java.lang.Integer> r1 = com.p683ss.android.ugc.aweme.account.util.C22262d.f60036a
                    int r2 = r13.f34000c
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    boolean r1 = r1.contains(r2)
                    if (r1 == 0) goto L_0x0130
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    if (r13 == 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    android.content.Context r13 = r13.getApplicationContext()
                    r0 = 2132551821(0x7f1c288d, float:2.0757012E38)
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r13, r0)
                    r13.mo19066a()
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r13.finish()
                    goto L_0x01f5
                L_0x0130:
                    int r1 = r13.f34000c
                    r2 = 2027(0x7eb, float:2.84E-42)
                    if (r1 == r2) goto L_0x01d4
                    int r1 = r13.f34000c
                    r2 = 2028(0x7ec, float:2.842E-42)
                    if (r1 != r2) goto L_0x013e
                    goto L_0x01d4
                L_0x013e:
                    int r1 = r13.f34000c
                    r2 = 2003(0x7d3, float:2.807E-42)
                    if (r1 == r2) goto L_0x01af
                    int r1 = r13.f34000c
                    r2 = 2004(0x7d4, float:2.808E-42)
                    if (r1 != r2) goto L_0x014b
                    goto L_0x01af
                L_0x014b:
                    int r1 = r13.f34000c
                    r2 = 1091(0x443, float:1.529E-42)
                    if (r1 == r2) goto L_0x0165
                    int r1 = r13.f34000c
                    r2 = 1093(0x445, float:1.532E-42)
                    if (r1 != r2) goto L_0x0158
                    goto L_0x0165
                L_0x0158:
                    com.ss.android.ugc.aweme.account.login.ui.r r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.content.Context r1 = r1.getContext()
                    int r13 = r13.f34000c
                    com.p683ss.android.ugc.aweme.account.util.C22281s.m55136a(r1, r0, r13)
                    goto L_0x01f5
                L_0x0165:
                    T r0 = r13.f34007h
                    if (r0 == 0) goto L_0x0170
                    T r0 = r13.f34007h
                    com.bytedance.sdk.account.f.a.o r0 = (com.bytedance.sdk.account.p861f.p862a.C13116o) r0
                    org.json.JSONObject r0 = r0.f34279l
                    goto L_0x0171
                L_0x0170:
                    r0 = r4
                L_0x0171:
                    if (r0 == 0) goto L_0x0179
                    java.lang.String r1 = "data"
                    org.json.JSONObject r4 = r0.optJSONObject(r1)
                L_0x0179:
                    if (r4 == 0) goto L_0x01f5
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r4.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.support.v4.app.FragmentActivity r5 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r6 = r4.optString(r0)
                    int r13 = r13.f34000c
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    java.lang.String r8 = r13.f58456j
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    java.lang.String r9 = r13.f58455e
                    java.lang.String r10 = "sms_verification"
                    com.p683ss.android.ugc.aweme.account.util.C22261c.m55107a(r5, r6, r7, r8, r9, r10)
                    goto L_0x01f5
                L_0x01af:
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.content.Context r13 = r13.getContext()
                    com.bytedance.ies.uikit.dialog.b$a r13 = com.p683ss.android.ugc.aweme.account.util.C22284v.m55156a(r13)
                    r13.mo20146b(r0)
                    r0 = 2132551645(0x7f1c27dd, float:2.0756655E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21624t.f58624a
                    r13.mo20136a(r0, r1)
                    r0 = 2132542529(0x7f1c0441, float:2.0738165E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21625u.f58625a
                    r13.mo20145b(r0, r1)
                    com.bytedance.ies.uikit.dialog.b r13 = r13.mo20143a()
                    com.p683ss.android.ugc.aweme.utils.C47700ay.m103235a(r13)
                    goto L_0x01f5
                L_0x01d4:
                    java.lang.String r0 = r13.f34001d
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x01e6
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    r0 = 2132546358(0x7f1c1336, float:2.0745932E38)
                    java.lang.String r13 = r13.getString(r0)
                    goto L_0x01e8
                L_0x01e6:
                    java.lang.String r13 = r13.f34001d
                L_0x01e8:
                    com.ss.android.ugc.aweme.account.login.ui.r r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r13)
                    r13.mo19066a()
                L_0x01f5:
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r13 = r13.f58608q
                    if (r13 == 0) goto L_0x0202
                    com.ss.android.ugc.aweme.account.login.ui.r r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r13 = r13.f58608q
                    r13.mo45160a()
                L_0x0202:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21615r.C216205.mo45097a(com.bytedance.sdk.account.a.a.e):void");
            }

            /* renamed from: a */
            public final void onNeedCaptcha(C12993e<C13116o> eVar, String str) {
                super.onNeedCaptcha(eVar, str);
                if (C21615r.this.f58608q != null) {
                    C21615r.this.f58608q.mo45160a();
                }
            }
        };
        this.f58608q.setEditText(this.f58513o);
        m54326i();
        if (C9432q.m18670a(getContext()) < 720 || C9432q.m18688b(getContext()) < 1280) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f58513o.postDelayed(new C21623s(this), 500);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("need_finish_login", false)) {
                z = true;
            }
            C11104b bVar = null;
            if (intent != null) {
                str = intent.getStringExtra("toast_tips");
            } else {
                str = null;
            }
            int i3 = -1;
            if (intent != null) {
                i3 = intent.getIntExtra("error_code", -1);
            }
            if (intent != null) {
                str2 = intent.getStringExtra("description");
            } else {
                str2 = null;
            }
            if ((i3 == 2003 || i3 == 2004) && !TextUtils.isEmpty(str2)) {
                C11105a a = C22284v.m55156a(getActivity());
                a.mo20146b((CharSequence) str2);
                a.mo20136a((int) R.string.f78, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C18898c.m46009a(C21615r.this.getActivity(), "login", "login_pop_confirm");
                        ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a((Context) C21615r.this.getActivity(), C2240a.m6772a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
                    }
                });
                a.mo20145b((int) R.string.wf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C18898c.m46009a(C21615r.this.getActivity(), "login", "login_pop_cancel");
                    }
                });
                bVar = a.mo20143a();
                C47700ay.m103235a(bVar);
            } else if (i3 == 2027 || i3 == 2028) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = getString(R.string.c2p);
                }
                C10691a.m21545b(getContext(), str2).mo19066a();
            }
            if (!TextUtils.isEmpty(str) && getActivity() != null) {
                if (z) {
                    C10691a.m21545b(getActivity().getApplicationContext(), str).mo19066a();
                } else {
                    C22281s.m55136a(getContext(), str, i3);
                }
            }
            if (z && getActivity() != null) {
                C47700ay.m103236b(bVar);
                getActivity().finish();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        View inflate = layoutInflater.inflate(R.layout.ayw, viewGroup, false);
        this.f58607a = (ThirdPartyLoginView) inflate.findViewById(R.id.drx);
        this.f58608q = (PhonePassLoginView) inflate.findViewById(R.id.drf);
        this.f58513o = (EditText) inflate.findViewById(R.id.a9k);
        this.f58615x = inflate.findViewById(R.id.dkk);
        this.f58511m = inflate.findViewById(R.id.a1d);
        this.f58512n = (TextView) inflate.findViewById(R.id.a1f);
        this.f58514p = inflate.findViewById(R.id.bxg);
        this.f58538A = (TextView) inflate.findViewById(R.id.cpz);
        this.f58539B = (TextView) inflate.findViewById(R.id.aki);
        this.f58610s = (EditText) inflate.findViewById(R.id.a9p);
        this.f58615x.setOnClickListener(this.f58606J);
        this.f58603G = (ImageView) inflate.findViewById(R.id.dk_);
        this.f58603G.setOnClickListener(this.f58606J);
        this.f58608q.setEnterMethod(this.f58455e);
        this.f58604H = (TextView) inflate.findViewById(R.id.aow);
        inflate.findViewById(R.id.cfl).setOnClickListener(this.f58606J);
        inflate.findViewById(R.id.bwi).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26890h.m65011a("switch_to_phone", new C20856a().mo44776a("enter_method", C21615r.this.f58455e).f56798a);
                ((LoginOrRegisterActivity) C21615r.this.getActivity()).mo45728b(C22271m.m55124a(C21548aa.class, C21615r.this.getArguments()).mo46372a("key_input_phone_num", C21615r.this.mo45845o()).mo46372a("enter_from", C21615r.this.f58454d).mo46372a("enter_method", C21615r.this.f58455e).mo46373a("from_login_or_register", true).mo46370a(), !C21615r.this.f58613v);
            }
        });
        this.f58608q.setLifecycleOwner(this);
        this.f58608q.setLoginListener(new C21538a() {
            /* renamed from: a */
            public final void mo45788a() {
                C21615r.this.f58614w = false;
                if (!C21615r.this.mo45840j()) {
                    C22087a.m54862a("PhoneNumberIsWrong");
                    C20994a.m53364a("-1", "phone number invalid", C20996b.PHONE_NUMBER_INVALID, C20995a.PHONE_SMS, null);
                    C10691a.m21545b((Context) C23826bi.m58460b(), C21615r.this.getResources().getString(R.string.ffy)).mo19066a();
                    return;
                }
                C26890h.m65011a("login_submit", C20856a.m53173a().mo44776a("enter_from", C21615r.this.f58454d).mo44776a("enter_method", C21615r.this.f58455e).mo44776a("enter_type", C21615r.this.f58456j).mo44776a("group_id", C21021e.m53409a(C21615r.this.getArguments())).mo44776a("log_pb", C21021e.m53412b(C21615r.this.getArguments())).mo44776a("platform", "sms_verification").f56798a);
                C26890h.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName("sms_verification").setJsonObject(C23088c.m56631a().mo47824a("enter_from", C21615r.this.f58454d).mo47824a("position", C21615r.this.f58455e).mo47825b()));
                C26890h.m65011a("login_choose_platform", C20856a.m53173a().mo44776a("enter_method", C21615r.this.f58455e).mo44776a("enter_from", C21615r.this.f58454d).mo44776a("platform", "phone").f56798a);
                C21615r.this.f58608q.mo45161c();
                if (C21615r.this.f58611t != null) {
                    C21127d dVar = C21615r.this.f58611t;
                    C21112q qVar = C21615r.this.f58612u;
                    dVar.f57398a.mo24622a(C21615r.this.mo45845o(), C21615r.this.f58610s.getText().toString(), Integer.valueOf(0), "", (C13133j) qVar);
                }
                if (!TextUtils.equals(C21615r.this.f58542E, C21615r.this.mo45845o())) {
                    C23088c a = C23088c.m56631a().mo47824a("send_code_phone_number", C21615r.this.f58542E).mo47824a("formatted_phone_number", C21615r.this.mo45845o());
                    if (C21615r.this.f58513o != null) {
                        a.mo47824a("phone_number_raw_input", C21615r.this.f58513o.getText().toString());
                    }
                    C22089b.m54870a("send_code_sms_login_phone_number", a.mo47825b());
                    C20994a.m53363a(C21615r.this.f58454d, C21615r.this.f58455e, C20995a.PHONE_SMS, "SendCodeNum Equal FormattedNum");
                    return;
                }
                C22087a.m54862a("SendCodeNumNotEqualFormattedNum");
                C20994a.m53363a(C21615r.this.f58454d, C21615r.this.f58455e, C20995a.PHONE_SMS, "SendCodeNum not Equal FormattedNum");
            }
        });
        this.f58610s.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                int i;
                PhonePassLoginView phonePassLoginView = C21615r.this.f58608q;
                String obj = C21615r.this.f58610s.getText().toString();
                boolean z = false;
                if (TextUtils.isEmpty(obj)) {
                    i = 0;
                } else {
                    i = obj.length();
                }
                LoginButton loginButton = phonePassLoginView.f58410b;
                if (i == 4) {
                    z = true;
                }
                loginButton.setEnabled(z);
            }
        });
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.cso);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C11065a.m22390a((Context) getActivity());
            findViewById.setLayoutParams(layoutParams);
        }
        if (this.f58539B != null) {
            String string = getString(R.string.x6);
            String string2 = getString(R.string.b8j);
            Factory instance = Factory.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(string2);
            Spannable newSpannable = instance.newSpannable(sb.toString());
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a1o)), 0, string.length(), 17);
            this.f58539B.setText(newSpannable);
        }
        this.f58607a.setEventType(this.f58454d);
        this.f58607a.setNeedHidePlatform((String) ((HideLoginPlatformModel) C0214z.m440a(getActivity()).mo359a(HideLoginPlatformModel.class)).f59520b.getValue());
        this.f58607a.setPosition(this.f58455e);
        ThirdPartyLoginView thirdPartyLoginView = this.f58607a;
        if (getArguments() == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = getArguments();
        }
        thirdPartyLoginView.setBundle(bundle2);
        if (this.f58613v) {
            this.f58607a.setVisibility(8);
            this.f58608q.setVisibility(0);
            this.f58603G.setImageResource(R.drawable.cey);
            this.f58603G.setContentDescription(getString(R.string.buo));
        } else {
            this.f58603G.setContentDescription(getString(R.string.a41));
        }
        return inflate;
    }
}
