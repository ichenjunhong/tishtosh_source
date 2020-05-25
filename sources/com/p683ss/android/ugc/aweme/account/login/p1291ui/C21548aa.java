package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13111j;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.mobilelib.model.PersistentData;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21091a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21111p;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21128e;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.PhonePassLoginView.C21538a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.aa */
public class C21548aa extends C21573e<C21128e> implements C21055ac, C21091a {

    /* renamed from: a */
    public static final boolean f58469a = false;

    /* renamed from: q */
    public PhonePassLoginView f58470q;

    /* renamed from: r */
    private EditText f58471r;

    /* renamed from: s */
    private C21128e f58472s;

    /* renamed from: t */
    private View f58473t;

    /* renamed from: u */
    private C21111p f58474u;

    /* renamed from: v */
    private boolean f58475v;

    /* renamed from: w */
    private TextView f58476w;

    /* renamed from: x */
    private View f58477x;

    /* renamed from: y */
    private boolean f58478y = true;

    /* renamed from: z */
    private OnClickListener f58479z = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == R.id.aru) {
                if (C21548aa.this.getActivity() != null) {
                    C21548aa.this.mo45808a(view);
                    C21548aa.this.getActivity().onBackPressed();
                }
            } else if (id == R.id.cfl) {
                C21548aa.this.mo45808a(view);
            }
        }
    };

    public final boolean aj_() {
        return false;
    }

    /* renamed from: r */
    private String m54234r() {
        return mo45845o();
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58470q != null) {
            this.f58470q.mo45161c();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f58474u != null) {
            this.f58474u.cancel();
        }
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58470q != null) {
            this.f58470q.mo45160a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ CommonPresent mo45812g() {
        if ((this.f58472s == null || !this.f58472s.isValid()) && getActivity() != null) {
            this.f58472s = new C21128e(getActivity(), this);
        }
        return this.f58472s;
    }

    public final boolean ai_() {
        if (getArguments() == null || !this.f58478y || C23826bi.m58466g() || getArguments().getInt("bundle_flow_type", C21459s.f58206p) != C21459s.f58209s) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo45818i() {
        C20994a.m53363a(this.f58454d, this.f58455e, C20995a.PHONE_NUMBER_PASS, "");
        this.f58478y = false;
        C21378a.m53998a().mo45512a("", "", false, "login", "", "login commit");
        if (!mo45840j()) {
            C22087a.m54862a("PhoneNumberIsWrong");
            C10691a.m21542b((Context) getActivity(), (int) R.string.cof).mo19066a();
            C21378a a = C21378a.m53998a();
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.cof));
            sb.append("   ");
            sb.append(mo45845o());
            a.mo45512a(sb.toString(), "", false, "login", "", "login commit error");
            C20994a.m53367b("", "PhoneNumberIsWrong", C20996b.PHONE_NUMBER_INVALID, C20995a.PHONE_NUMBER_PASS, m54234r());
            return;
        }
        C26890h.m65011a("login_submit", C20856a.m53173a().mo44776a("enter_from", this.f58454d).mo44776a("enter_method", this.f58455e).mo44776a("enter_type", this.f58456j).mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).mo44776a("platform", "phone").f56798a);
        KeyboardUtils.m58184c(this.f58471r);
        if (this.f58472s != null) {
            this.f58472s.mo45242a(mo45845o(), this.f58471r.getText().toString(), null, this.f58474u);
            return;
        }
        C22087a.m54862a("PresenterIsNull");
        C20994a.m53367b("", "PresenterIsNull", null, C20995a.PHONE_NUMBER_PASS, m54234r());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f58477x != null) {
            this.f58477x.setOnClickListener(this.f58479z);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58475v = arguments.getBoolean("from_login_or_register", false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo45849q();
        mo45809b(this.f58513o);
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (getActivity() != null) {
            switch (i) {
                case 1009:
                case 1033:
                case 1034:
                case 2003:
                case 2004:
                case 2027:
                case 2028:
                    return;
                default:
                    super.showErrorMessage(str, i, z);
                    return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ayx, viewGroup, false);
        this.f58477x = inflate.findViewById(R.id.aru);
        this.f58477x.setOnClickListener(this.f58479z);
        inflate.findViewById(R.id.cfl).setOnClickListener(this.f58479z);
        this.f58511m = inflate.findViewById(R.id.a1d);
        this.f58513o = (EditText) inflate.findViewById(R.id.a9k);
        this.f58514p = inflate.findViewById(R.id.bxg);
        this.f58512n = (TextView) inflate.findViewById(R.id.a1f);
        this.f58470q = (PhonePassLoginView) inflate.findViewById(R.id.dre);
        this.f58471r = (EditText) inflate.findViewById(R.id.a9j);
        this.f58473t = inflate.findViewById(R.id.dkk);
        this.f58471r.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21548aa.this.f58470q.setLoginBtnEnable(!TextUtils.isEmpty(editable.toString()));
            }
        });
        this.f58476w = (TextView) inflate.findViewById(R.id.dl0);
        inflate.findViewById(R.id.dkg).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21378a.m53998a().mo45512a("", "", false, "login", "", "忘记密码");
                if (!C21548aa.this.mo45840j()) {
                    C10691a.m21542b((Context) C21548aa.this.getActivity(), (int) R.string.cof).mo19066a();
                } else {
                    C21548aa.this.mo45813h().mo45728b(C22271m.m55124a(C21559ad.class, C21548aa.this.getArguments()).mo46372a("phone_number", C21548aa.this.mo45845o()).mo46372a("mask_phone_number", C21548aa.this.mo45846p()).mo46370a(), false);
                }
            }
        });
        this.f58470q.setEditText(this.f58513o);
        this.f58470q.setEnterMethod(this.f58455e);
        this.f58470q.setLifecycleOwner(this);
        this.f58470q.setLoginListener(new C21538a() {
            /* renamed from: a */
            public final void mo45788a() {
                C21548aa.this.mo45818i();
            }
        });
        this.f58473t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21548aa.this.getContext() != null) {
                    try {
                        C41302w.m91042a().mo83861a(C32816h.m75716b().getFeedbackConf().getNotLoggedIn());
                    } catch (C10174a unused) {
                        C18922i iVar = new C18922i(C24095a.m58957n());
                        iVar.mo38778a("enter_from", "login_pad");
                        ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(C21548aa.this.getContext(), iVar.toString(), true);
                    }
                }
            }
        });
        this.f58470q.mo45776a(C22282t.m55151f().getBoolean("is_accept_term_privacy_new", false));
        C26890h.m65011a("phone_login_enter_password", new C20856a().f56798a);
        this.f58474u = new C21111p(this) {
            public final void onSuccess(C12993e<C13111j> eVar) {
                super.onSuccess(eVar);
                C22087a.m54862a("success");
                if (C21548aa.this.isViewValid()) {
                    C21548aa.this.afterHandleRequest();
                    C22089b.m54868a("aweme_phone_login_rate", 1, C23088c.m56631a().mo47825b());
                    C21378a.m53998a().mo45512a("", "", true, "login", "", "mobile login success");
                    C18898c.m46009a(C21548aa.this.getContext(), "login", "login_success");
                    C20994a.m53360a(C20996b.LOGIN_BY_PASS, C20995a.PHONE_NUMBER_PASS, "");
                    PersistentData.inst().saveLastLoginMobile(C21548aa.this.getContext(), ((C13111j) eVar.f34007h).f34271a);
                    if (C21548aa.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) C21548aa.this.getActivity()).mo45573a(true);
                        ((LoginOrRegisterActivity) C21548aa.this.getActivity()).mo45026a(C21548aa.this.mo45848b("phone_password"));
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("phone").setJsonObject(C23088c.m56631a().mo47824a("enter_from", C21548aa.this.f58454d).mo47824a("position", C21548aa.this.f58455e).mo47825b()));
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21548aa.this.f58454d).mo44776a("enter_from", C21548aa.this.f58455e).mo44776a("enter_type", C21548aa.this.f58456j).mo44776a("platform", "phone").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    if (C21548aa.this.getArguments() != null && C21548aa.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21518u.m54176b(new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_NUMBER_PASS, C21548aa.this.f58509l));
                    }
                }
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v2, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v3 */
            /* JADX WARNING: type inference failed for: r10v2, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r4v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 241
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
            public final void mo45162a(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13111j> r13) {
                /*
                    r12 = this;
                    super.mo45162a(r13)
                    java.lang.String r0 = r13.f34001d
                    com.p683ss.android.ugc.aweme.account.p1302o.C22087a.m54862a(r0)
                    int r0 = r13.f34000c
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r13.f34001d
                    com.ss.android.ugc.aweme.account.j.a$a r2 = com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a.PHONE_NUMBER_PASS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.p683ss.android.ugc.aweme.account.p1277j.C20994a.m53367b(r0, r1, r4, r2, r3)
                    int r0 = r13.f34000c
                    java.lang.String r1 = r13.f34001d
                    r2 = 0
                    com.p683ss.android.ugc.aweme.account.p1302o.C22093d.m54877a(r2, r0, r1)
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    boolean r0 = r0.isViewValid()
                    if (r0 != 0) goto L_0x0029
                    return
                L_0x0029:
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.a r1 = new com.ss.android.ugc.aweme.account.a.b.a
                    r1.<init>()
                    java.lang.String r3 = "platform"
                    java.lang.String r5 = "phone"
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r3, r5)
                    java.lang.String r3 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.aa r5 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r5 = r5.f58455e
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r3, r5)
                    java.lang.String r3 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.aa r5 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r5 = r5.f58454d
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r3, r5)
                    java.lang.String r3 = "carrier"
                    java.lang.String r5 = ""
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r3, r5)
                    java.lang.String r3 = "error_code"
                    int r5 = r13.f34000c
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44774a(r3, r5)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginOrRegisterActivity
                    if (r0 == 0) goto L_0x00b8
                    int r0 = r13.f34000c
                    r1 = 1039(0x40f, float:1.456E-42)
                    if (r0 != r1) goto L_0x00ad
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginOrRegisterActivity) r0
                    java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.i> r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21592i.class
                    com.ss.android.ugc.aweme.account.login.ui.aa r3 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.os.Bundle r3 = r3.getArguments()
                    com.ss.android.ugc.aweme.account.util.m$a r1 = com.p683ss.android.ugc.aweme.account.util.C22271m.m55124a(r1, r3)
                    java.lang.String r3 = "phone_number"
                    T r13 = r13.f34007h
                    com.bytedance.sdk.account.f.a.j r13 = (com.bytedance.sdk.account.p861f.p862a.C13111j) r13
                    java.lang.String r13 = r13.f34271a
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r1.mo46372a(r3, r13)
                    java.lang.String r1 = "enter_from"
                    com.ss.android.ugc.aweme.account.login.ui.aa r3 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r3 = r3.f58454d
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r13.mo46372a(r1, r3)
                    java.lang.String r1 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.aa r3 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r3 = r3.f58455e
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r13.mo46372a(r1, r3)
                    android.support.v4.app.Fragment r13 = r13.mo46370a()
                    r0.mo45727a(r13, r2)
                    return
                L_0x00ad:
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginOrRegisterActivity) r0
                    r0.mo45573a(r2)
                L_0x00b8:
                    java.lang.String r0 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                    java.lang.String r3 = "errorCode"
                    int r5 = r13.f34000c
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r3, r5)
                    java.lang.String r3 = "errorDesc"
                    java.lang.String r5 = r13.f34001d
                    com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r3, r5)
                    org.json.JSONObject r1 = r1.mo47825b()
                    com.p683ss.android.ugc.aweme.account.p1302o.C22089b.m54868a(r0, r2, r1)
                    com.ss.android.ugc.aweme.account.login.loginlog.a r5 = com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a.m53998a()
                    java.lang.String r6 = r13.f34001d
                    java.lang.String r7 = ""
                    r8 = 0
                    java.lang.String r9 = "login"
                    java.lang.String r10 = ""
                    java.lang.String r11 = "mobile login fail"
                    r5.mo45512a(r6, r7, r8, r9, r10, r11)
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r1 = "login"
                    java.lang.String r2 = "login_error"
                    com.p683ss.android.common.p1146d.C18898c.m46009a(r0, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    r0.afterHandleRequest()
                    int r0 = r13.f34000c
                    r1 = 1075(0x433, float:1.506E-42)
                    if (r0 != r1) goto L_0x014b
                    com.ss.android.ugc.aweme.account.login.f r0 = new com.ss.android.ugc.aweme.account.login.f
                    com.ss.android.ugc.aweme.account.login.ui.aa r1 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r6 = r1.getActivity()
                    int r7 = r13.f34000c
                    T r1 = r13.f34007h
                    if (r1 == 0) goto L_0x0119
                    T r13 = r13.f34007h
                    com.bytedance.sdk.account.f.a.j r13 = (com.bytedance.sdk.account.p861f.p862a.C13111j) r13
                    org.json.JSONObject r13 = r13.f34279l
                    r8 = r13
                    goto L_0x011a
                L_0x0119:
                    r8 = r4
                L_0x011a:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r9 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r13 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_NUMBER_PASS
                    com.ss.android.ugc.aweme.account.login.ui.aa r2 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    com.ss.android.ugc.aweme.account.login.d.a$a r2 = r2.f58509l
                    r9.<init>(r13, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    boolean r13 = r13 instanceof com.p683ss.android.ugc.aweme.account.login.C21379m
                    if (r13 == 0) goto L_0x013a
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r4 = r13
                    com.ss.android.ugc.aweme.account.login.m r4 = (com.p683ss.android.ugc.aweme.account.login.C21379m) r4
                L_0x013a:
                    r10 = r4
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r1 = "phone_password"
                    android.os.Bundle r11 = r13.mo45848b(r1)
                    r5 = r0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    com.p683ss.android.ugc.aweme.account.login.C21392p.m54014a(r0)
                    return
                L_0x014b:
                    int r0 = r13.f34000c
                    r1 = 2027(0x7eb, float:2.84E-42)
                    if (r0 == r1) goto L_0x026f
                    int r0 = r13.f34000c
                    r1 = 2028(0x7ec, float:2.842E-42)
                    if (r0 != r1) goto L_0x0159
                    goto L_0x026f
                L_0x0159:
                    int r0 = r13.f34000c
                    r1 = 2003(0x7d3, float:2.807E-42)
                    r2 = 2132542529(0x7f1c0441, float:2.0738165E38)
                    if (r0 == r1) goto L_0x0249
                    int r0 = r13.f34000c
                    r1 = 2004(0x7d4, float:2.808E-42)
                    if (r0 != r1) goto L_0x016a
                    goto L_0x0249
                L_0x016a:
                    int r0 = r13.f34000c
                    r1 = 1091(0x443, float:1.529E-42)
                    if (r0 == r1) goto L_0x0176
                    int r0 = r13.f34000c
                    r1 = 1093(0x445, float:1.532E-42)
                    if (r0 != r1) goto L_0x01c0
                L_0x0176:
                    T r0 = r13.f34007h
                    if (r0 == 0) goto L_0x0181
                    T r0 = r13.f34007h
                    com.bytedance.sdk.account.f.a.j r0 = (com.bytedance.sdk.account.p861f.p862a.C13111j) r0
                    org.json.JSONObject r0 = r0.f34279l
                    goto L_0x0182
                L_0x0181:
                    r0 = r4
                L_0x0182:
                    if (r0 == 0) goto L_0x018a
                    java.lang.String r1 = "data"
                    org.json.JSONObject r4 = r0.optJSONObject(r1)
                L_0x018a:
                    if (r4 == 0) goto L_0x01c0
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r4.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01c0
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01c0
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r5 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r6 = r4.optString(r0)
                    int r13 = r13.f34000c
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r8 = r13.f58454d
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r9 = r13.f58455e
                    java.lang.String r10 = "phone"
                    com.p683ss.android.ugc.aweme.account.util.C22261c.m55107a(r5, r6, r7, r8, r9, r10)
                    return
                L_0x01c0:
                    java.lang.String r0 = r13.f34001d
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x01df
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.content.Context r13 = r13.getContext()
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    r1 = 2132546352(0x7f1c1330, float:2.074592E38)
                    java.lang.String r0 = r0.getString(r1)
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r13, r0)
                    r13.mo19066a()
                    return
                L_0x01df:
                    int r0 = r13.f34000c
                    r1 = 1009(0x3f1, float:1.414E-42)
                    if (r0 != r1) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r13 = r13.f34001d
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r13)
                    r13.mo19066a()
                    return
                L_0x01f5:
                    int r0 = r13.f34000c
                    r1 = 1033(0x409, float:1.448E-42)
                    if (r0 != r1) goto L_0x020b
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r13 = r13.f34001d
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r13)
                    r13.mo19066a()
                    return
                L_0x020b:
                    int r0 = r13.f34000c
                    r1 = 1034(0x40a, float:1.449E-42)
                    if (r0 != r1) goto L_0x023b
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.bytedance.ies.uikit.dialog.b$a r0 = com.p683ss.android.ugc.aweme.account.util.C22284v.m55156a(r0)
                    java.lang.String r13 = r13.f34001d
                    r0.mo20146b(r13)
                    r13 = 2132545985(0x7f1c11c1, float:2.0745175E38)
                    com.ss.android.ugc.aweme.account.login.ui.ab r1 = new com.ss.android.ugc.aweme.account.login.ui.ab
                    r1.<init>(r12)
                    r0.mo20136a(r13, r1)
                    com.ss.android.ugc.aweme.account.login.ui.ac r13 = new com.ss.android.ugc.aweme.account.login.ui.ac
                    r13.<init>(r12)
                    r0.mo20145b(r2, r13)
                    com.bytedance.ies.uikit.dialog.b r13 = r0.mo20143a()
                    com.p683ss.android.ugc.aweme.utils.C47700ay.m103235a(r13)
                    return
                L_0x023b:
                    int r13 = r13.f34000c
                    boolean r13 = com.p683ss.android.ugc.aweme.account.util.C22281s.m55138a(r13)
                    if (r13 == 0) goto L_0x0248
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    r13.getContext()
                L_0x0248:
                    return
                L_0x0249:
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    java.lang.String r13 = r13.f34001d
                    android.support.v4.app.FragmentActivity r1 = r0.getActivity()
                    com.bytedance.ies.uikit.dialog.b$a r1 = com.p683ss.android.ugc.aweme.account.util.C22284v.m55156a(r1)
                    r1.mo20146b(r13)
                    r13 = 2132551645(0x7f1c27dd, float:2.0756655E38)
                    com.ss.android.ugc.aweme.account.login.ui.aa$7 r3 = new com.ss.android.ugc.aweme.account.login.ui.aa$7
                    r3.<init>()
                    r1.mo20136a(r13, r3)
                    com.ss.android.ugc.aweme.account.login.ui.aa$8 r13 = new com.ss.android.ugc.aweme.account.login.ui.aa$8
                    r13.<init>()
                    r1.mo20145b(r2, r13)
                    r1.mo20148b()
                    return
                L_0x026f:
                    java.lang.String r0 = r13.f34001d
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0281
                    com.ss.android.ugc.aweme.account.login.ui.aa r13 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    r0 = 2132546358(0x7f1c1336, float:2.0745932E38)
                    java.lang.String r13 = r13.getString(r0)
                    goto L_0x0283
                L_0x0281:
                    java.lang.String r13 = r13.f34001d
                L_0x0283:
                    com.ss.android.ugc.aweme.account.login.ui.aa r0 = com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r13)
                    r13.mo19066a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21548aa.C215535.mo45162a(com.bytedance.sdk.account.a.a.e):void");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo45821a(DialogInterface dialogInterface, int i) {
                C18898c.m46009a(C21548aa.this.getContext(), "login", "login_pop_confirm");
                C21548aa.this.mo45813h().mo45728b(C22271m.m55124a(C21559ad.class, C21548aa.this.getArguments()).mo46372a("phone_number", C21548aa.this.mo45845o()).mo46372a("mask_phone_number", C21548aa.this.mo45846p()).mo46372a("enter_from", C21548aa.this.f58454d).mo46372a("enter_method", C21548aa.this.f58455e).mo46370a(), false);
            }
        };
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.cso);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C23724k.m58225c();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
