package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui.FindPswByEmailActivity;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21050f;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21632y;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.utils.C22305k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.o */
public class C21329o extends C21168a {

    /* renamed from: o */
    public static final boolean f57922o = false;

    /* renamed from: A */
    C22023a f57923A;

    /* renamed from: B */
    public boolean f57924B;

    /* renamed from: C */
    public int f57925C = -1;

    /* renamed from: D */
    public C21339b f57926D;

    /* renamed from: E */
    public C21050f f57927E;

    /* renamed from: F */
    public C21050f f57928F;

    /* renamed from: G */
    Context f57929G;

    /* renamed from: H */
    private TextView f57930H;

    /* renamed from: I */
    private boolean f57931I;

    /* renamed from: J */
    private View f57932J;

    /* renamed from: K */
    private TextView f57933K;

    /* renamed from: L */
    private TextView f57934L;

    /* renamed from: M */
    private TextView f57935M;

    /* renamed from: O */
    private View f57936O;

    /* renamed from: P */
    private View f57937P;

    /* renamed from: Q */
    private View f57938Q;

    /* renamed from: R */
    private C21338a f57939R;

    /* renamed from: S */
    private C13011d f57940S;

    /* renamed from: T */
    private int f57941T;

    /* renamed from: U */
    private int f57942U;

    /* renamed from: p */
    public String f57943p;

    /* renamed from: q */
    public String f57944q;

    /* renamed from: r */
    public String f57945r;

    /* renamed from: s */
    public EditText f57946s;

    /* renamed from: t */
    public View f57947t;

    /* renamed from: u */
    public View f57948u;

    /* renamed from: v */
    public LoginButton f57949v;

    /* renamed from: w */
    public int f57950w;

    /* renamed from: x */
    Dialog f57951x;

    /* renamed from: y */
    public View f57952y;

    /* renamed from: z */
    public String f57953z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.o$a */
    class C21338a extends C21120y {

        /* renamed from: a */
        public boolean f57962a;

        /* renamed from: c */
        public final void onNeedSecureCaptcha(C12993e<C13120s> eVar) {
            super.onNeedSecureCaptcha(eVar);
            if (C21329o.this.isViewValid()) {
                C21329o.this.mo45324a(false);
            }
            C21329o.this.f57924B = false;
        }

        /* renamed from: b */
        public final void mo45170b(C12993e<C13120s> eVar) {
            String str;
            C22097f.m54898a(1, C21329o.this.f57925C, eVar.f34000c, eVar.f34001d);
            if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                if (eVar.f34000c == 1001) {
                    if (!C20884b.m53202c()) {
                        C21329o.this.mo45479c(this.f57962a);
                    } else {
                        C21329o.this.mo45324a(false);
                        C21329o.this.f57952y.setVisibility(8);
                        C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.j1));
                        C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21329o.this.getArguments()).mo46372a("country_code_alpha_2", C21329o.this.f57943p).mo46372a("country_code", C21329o.this.f57944q).mo46372a("phone_number", C21329o.this.f57945r).mo46373a("use_whatsapp_code", this.f57962a).mo46373a("reset_ticker", C21329o.this.f57924B).mo46370a();
                        if (aVar != null) {
                            C21329o.m53929d(this.f57962a);
                        }
                        aVar.mo45323a(C21329o.this.f57511d);
                        C21329o.this.mo45321a((Fragment) aVar, false);
                    }
                } else if (eVar.f34000c == 1003 || eVar.f34000c == 1002) {
                    Toast makeText = Toast.makeText(C21329o.this.getActivity(), R.string.ca7, 0);
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(makeText);
                    }
                    makeText.show();
                } else if (eVar.f34000c == 2027 || eVar.f34000c == 2028) {
                    if (TextUtils.isEmpty(eVar.f34001d)) {
                        str = C21329o.this.getString(R.string.c2p);
                    } else {
                        str = eVar.f34001d;
                    }
                    C10691a.m21545b(C21329o.this.getContext(), str).mo19066a();
                } else {
                    C10691a.m21545b(C21329o.this.getContext(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                }
                C21329o.this.mo45324a(false);
                C21329o.this.f57924B = false;
            }
        }

        public final void onSuccess(C12993e<C13120s> eVar) {
            C22097f.m54898a(0, C21329o.this.f57925C, 0, "");
            if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                if (!C20884b.m53202c()) {
                    C21329o.this.mo45479c(this.f57962a);
                } else {
                    C21329o.this.mo45324a(false);
                    C21329o.this.f57952y.setVisibility(8);
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.j1));
                    if (!C20884b.m53201b()) {
                        C21168a aVar = (C21168a) C22271m.m55124a(C21346u.class, C21329o.this.getArguments()).mo46372a("country_code_alpha_2", C21329o.this.f57943p).mo46372a("country_code", C21329o.this.f57944q).mo46372a("phone_number", C21329o.this.f57945r).mo46371a("init_page", 0).mo46373a("use_whatsapp_code", this.f57962a).mo46373a("reset_ticker", C21329o.this.f57924B).mo46370a();
                        aVar.mo45323a(C21329o.this.f57511d);
                        C21329o.this.mo45321a((Fragment) aVar, false);
                    } else if (C21472c.m54111a()) {
                        C21168a aVar2 = (C21168a) C22271m.m55124a(C21290bt.class, C21329o.this.getArguments()).mo46372a("enter_type", C21329o.this.f57516n).mo46371a("init_page", 0).mo46372a("country_code_alpha_2", C21329o.this.f57943p).mo46372a("country_code", C21329o.this.f57944q).mo46372a("phone_number", C21329o.this.f57945r).mo46373a("use_whatsapp_code", this.f57962a).mo46373a("reset_ticker", C21329o.this.f57924B).mo46370a();
                        aVar2.mo45323a(C21329o.this.f57511d);
                        C21329o.this.mo45321a((Fragment) aVar2, false);
                    } else {
                        C21168a aVar3 = (C21168a) C22271m.m55124a(C21227aw.class, C21329o.this.getArguments()).mo46372a("country_code_alpha_2", C21329o.this.f57943p).mo46372a("country_code", C21329o.this.f57944q).mo46372a("phone_number", C21329o.this.f57945r).mo46373a("NEW_PHONE_USER", true).mo46373a("use_whatsapp_code", this.f57962a).mo46373a("reset_ticker", C21329o.this.f57924B).mo46370a();
                        if (aVar3 != null) {
                            C21329o.m53929d(this.f57962a);
                        }
                        aVar3.mo45323a(C21329o.this.f57511d);
                        C21329o.this.mo45321a((Fragment) aVar3, false);
                    }
                }
                C21329o.this.f57924B = false;
            }
        }

        public C21338a(C21108m mVar) {
            super(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.o$b */
    class C21339b implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                C21329o.this.mo45159d();
                C21329o.this.mo45328f().mo45041a(C22165u.f59767g, (C13136m) new C13136m() {
                    public final void onError(C12993e<C13117p> eVar, int i) {
                    }

                    public final void onSuccess(C12993e<C13117p> eVar) {
                        if (C21329o.this.isViewValid() && C21329o.this.getContext() != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                            C21329o.this.mo45158a(((C13117p) eVar.f34007h).f34303a, null, C22165u.f59767g, C21329o.this.f57926D);
                        }
                    }
                });
            }
        }

        private C21339b() {
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                C21329o.this.mo45159d();
                C21329o.this.f57949v.mo45161c();
                if (C21329o.this.f57950w == 0) {
                    MusLoginManager f = C21329o.this.mo45328f();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21329o.this.f57944q);
                    sb.append("-");
                    sb.append(C21329o.this.f57945r);
                    f.mo45050c(sb.toString(), C21329o.this.f57946s.getText().toString(), str, C21329o.this.f57927E);
                    return;
                }
                if (C21329o.this.f57950w == 1) {
                    C21329o.this.mo45328f().mo45048b(C21329o.this.f57953z, C21329o.this.f57946s.getText().toString(), str, C21329o.this.f57928F);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57946s);
    }

    public void onStart() {
        super.onStart();
        this.f57946s.postDelayed(new Runnable() {
            public final void run() {
                C21329o.this.mo45322a((View) C21329o.this.f57946s);
            }
        }, 500);
    }

    /* renamed from: j */
    private String m53932j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57944q);
        sb.append("-");
        sb.append(this.f57945r);
        return sb.toString();
    }

    /* renamed from: i */
    private boolean m53931i() {
        C21569a aVar;
        if (this.f57511d == null) {
            aVar = null;
        } else {
            aVar = this.f57511d.mo45024a(0);
        }
        if (aVar == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57944q);
        sb.append("-");
        sb.append(this.f57945r);
        if (!TextUtils.equals(sb.toString(), aVar.f58505a) || aVar.f58506b.f60053c == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo45473a() {
        String str;
        String str2;
        this.f57949v.mo45161c();
        mo45329g();
        C21022f fVar = new C21022f();
        if (this.f57950w == 0) {
            str = "phone";
        } else {
            str = "email";
        }
        fVar.mo44995b(str).mo44994a(this.f57514l).mo44990b();
        String str3 = "login_submit";
        C20856a a = new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("enter_type", this.f57516n).mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments()));
        String str4 = "platform";
        if (this.f57950w == 0) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        C26890h.m65011a(str3, a.mo44776a(str4, str2).f56798a);
        if (this.f57950w == 0) {
            MusLoginManager f = mo45328f();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57944q);
            sb.append("-");
            sb.append(this.f57945r);
            f.mo45050c(sb.toString(), this.f57946s.getText().toString(), "", this.f57927E);
            return;
        }
        if (this.f57950w == 1) {
            mo45328f().mo45048b(this.f57953z, this.f57946s.getText().toString(), "", this.f57928F);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f57929G = activity;
    }

    /* renamed from: d */
    public static void m53929d(boolean z) {
        if (z) {
            C26890h.m65011a("phone_login_enter_whatsapp_code", null);
        } else {
            C26890h.m65011a("phone_login_enter_sms", null);
        }
    }

    /* renamed from: a */
    public final void mo45475a(String str) {
        this.f57952y.setVisibility(0);
        this.f57933K.setText(str);
    }

    /* renamed from: c */
    public final void mo45479c(boolean z) {
        mo45324a(false);
        this.f57952y.setVisibility(8);
        this.f57948u.setBackgroundColor(getResources().getColor(R.color.j1));
        C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57943p).mo46372a("country_code", this.f57944q).mo46372a("phone_number", this.f57945r).mo46373a("use_whatsapp_code", z).mo46373a("reset_ticker", this.f57924B).mo46370a();
        if (aVar != null) {
            m53929d(z);
        }
        aVar.mo45323a(this.f57511d);
        mo45321a((Fragment) aVar, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57943p = arguments.getString("country_code_alpha_2");
            this.f57944q = arguments.getString("country_code");
            this.f57945r = arguments.getString("phone_number");
            this.f57953z = arguments.getString("email");
            this.f57950w = arguments.getInt("login_type", 0);
            this.f57931I = arguments.getBoolean("from_register", false);
        }
        this.f57939R = new C21338a(this);
        this.f57926D = new C21339b();
        this.f57927E = new C21050f() {
            /* renamed from: a */
            public final void mo45087a() {
                C22093d.m54877a(false, 1039, "not trust device");
                C21329o.this.f57949v.mo45160a();
                C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21329o.this.getArguments()).mo46372a("country_code_alpha_2", C21329o.this.f57943p).mo46372a("country_code", C21329o.this.f57944q).mo46372a("phone_number", C21329o.this.f57945r).mo46371a("code_type", 2).mo46370a();
                aVar.mo45323a(C21329o.this.f57511d);
                C21329o.this.mo45321a((Fragment) aVar, false);
            }

            /* renamed from: a */
            public final void mo45088a(String str) {
                super.mo45088a(str);
                C21329o.this.f57949v.mo45160a();
            }

            /* renamed from: c */
            public final void mo45095c(String str) {
                C22093d.m54877a(false, 1056, str);
                C21329o.this.f57949v.mo45160a();
                C10691a.m21546b(C21329o.this.getContext(), str, 0).mo19066a();
            }

            /* renamed from: b */
            public final void mo45093b(String str) {
                if (C21329o.this.f57950w == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21329o.this.f57944q);
                    sb.append("-");
                    sb.append(C21329o.this.f57945r);
                    C21221at a = C21221at.m53759a("", "email", sb.toString(), str, C21329o.this.f57953z, C21329o.this.f57946s.getText().toString(), C21329o.this.f57514l, C21329o.this.f57515m);
                    a.mo45323a((C21328n) C21329o.this.getActivity());
                    C21329o.this.mo45321a((Fragment) a, false);
                }
            }

            /* renamed from: a */
            public final void mo45090a(JSONObject jSONObject) {
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    new C21023g().mo44997b("phone").mo44996a("1").mo44990b();
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("enter_type", C21329o.this.f57516n).mo44776a("platform", "phone").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    C21329o.this.f57952y.setVisibility(8);
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.j1));
                    C20975a.m53337a(11);
                    try {
                        new C18493a();
                        C21329o.m53691a(jSONObject.optJSONObject("data"), (C13207b) C18493a.m44735b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (C21329o.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21329o.this.getArguments());
                        bundle.putString("platform", "mobile");
                        bundle.putString("login_path", "phone_password");
                        C21329o.this.f57511d.mo45026a(bundle);
                    }
                    if (C21329o.this.getArguments() != null && C21329o.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_NUMBER_PASS, C21329o.this.f57943p, C21329o.this.f57944q, C21329o.this.f57945r);
                        C21518u.m54176b(phoneLoginMethod);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45089a(String str, String str2) {
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    C21329o.this.mo45158a(str, str2, C22165u.f59767g, C21329o.this.f57926D);
                }
            }

            /* renamed from: b */
            public final void mo45094b(String str, String str2) {
                if (C21329o.this.f57950w == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21329o.this.f57944q);
                    sb.append("-");
                    sb.append(C21329o.this.f57945r);
                    C21218as a = C21218as.m53746a("", "email", sb.toString(), str, str2, C21329o.this.f57953z, C21329o.this.f57946s.getText().toString(), C21329o.this.f57514l, C21329o.this.f57515m);
                    a.mo45323a((C21328n) C21329o.this.getActivity());
                    C21329o oVar = C21329o.this;
                    if (oVar.getActivity() != null && (oVar.getActivity() instanceof C21328n)) {
                        if (oVar.f57511d == null) {
                            oVar.f57511d = (C21328n) oVar.getActivity();
                        }
                        oVar.f57511d.mo45031b(a, false);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45091a(JSONObject jSONObject, int i, String str) {
                C22093d.m54877a(false, i, str);
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", C21329o.this.f57515m).mo44776a("enter_type", C21329o.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    new C21023g().mo44997b("phone").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                    if (!C21459s.f58194d.contains(Integer.valueOf(i))) {
                        if (i == 1034) {
                            C21329o oVar = C21329o.this;
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2j);
                            }
                            oVar.mo45475a(str);
                        } else if (i == 2006 && TextUtils.isEmpty(str)) {
                            C21329o.this.mo45475a(C21329o.this.getString(R.string.c2i));
                        } else if (i == 2027 || i == 2028) {
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2p);
                            }
                            C10691a.m21545b(C21329o.this.getContext(), str).mo19066a();
                        } else {
                            Context context = C21329o.this.getContext();
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2j);
                            }
                            C10691a.m21546b(context, str, 0).mo19066a();
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo45092a(JSONObject jSONObject, String str, String str2) {
                C22093d.m54877a(false, Integer.parseInt(str), str2);
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", C21329o.this.f57515m).mo44776a("enter_type", C21329o.this.f57516n).mo44776a("carrier", "").mo44776a("error_code", str).f56798a);
                    C21329o.this.f57949v.mo45160a();
                    new C21023g().mo44997b("phone").mo44996a("0").mo44998c(str).mo44999d("/passport/user/login/").mo44990b();
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.xn));
                    C21329o oVar = C21329o.this;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = C21329o.this.getString(R.string.c2j);
                    }
                    oVar.mo45475a(str2);
                }
            }
        };
        this.f57928F = new C21050f() {
            /* renamed from: a */
            public final void mo45087a() {
                C22093d.m54876a(1, 1039, "not trust device");
                C21329o.this.f57949v.mo45160a();
            }

            /* renamed from: a */
            public final void mo45088a(String str) {
                super.mo45088a(str);
                if (C21329o.this.getActivity() != null) {
                    C21329o.this.f57949v.mo45160a();
                }
            }

            /* renamed from: c */
            public final void mo45095c(String str) {
                C22093d.m54876a(1, 1056, str);
                C21329o.this.f57949v.mo45160a();
                C10691a.m21546b(C21329o.this.getContext(), str, 0).mo19066a();
            }

            /* renamed from: b */
            public final void mo45093b(String str) {
                if (C21329o.this.f57950w == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21329o.this.f57944q);
                    sb.append("-");
                    sb.append(C21329o.this.f57945r);
                    C21221at a = C21221at.m53759a("", "email", sb.toString(), str, C21329o.this.f57953z, C21329o.this.f57946s.getText().toString(), C21329o.this.f57514l, C21329o.this.f57515m);
                    a.mo45323a((C21328n) C21329o.this.getActivity());
                    C21329o.this.mo45321a((Fragment) a, false);
                }
            }

            /* renamed from: a */
            public final void mo45090a(JSONObject jSONObject) {
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    if (C21329o.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) C21329o.this.getActivity()).f57198a = null;
                    }
                    C21329o.this.f57949v.mo45160a();
                    C21329o.this.f57952y.setVisibility(8);
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.j1));
                    new C21023g().mo44997b("email").mo44996a("1").mo44990b();
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21329o.this.f57515m).mo44776a("enter_from", C21329o.this.f57514l).mo44776a("platform", "email").mo44776a("enter_type", C21329o.this.f57516n).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    C20975a.m53337a(11);
                    try {
                        new C18493a();
                        C21329o.m53691a(jSONObject.optJSONObject("data"), (C13207b) C18493a.m44735b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (C21329o.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21329o.this.getArguments());
                        bundle.putString("platform", "mobile");
                        bundle.putString("login_path", "email_or_username");
                        C21329o.this.f57511d.mo45026a(bundle);
                    }
                    if (C21329o.this.getArguments() != null && C21329o.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21518u.m54176b(new AccountPassLoginMethod(C23826bi.m58463d(), LoginMethodName.EMAIL_PASS, C21329o.this.f57953z));
                    }
                }
            }

            /* renamed from: a */
            public final void mo45089a(String str, String str2) {
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    C21329o.this.mo45158a(str, str2, C22165u.f59767g, C21329o.this.f57926D);
                }
            }

            /* renamed from: b */
            public final void mo45094b(String str, String str2) {
                if (C21329o.this.f57950w == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21329o.this.f57944q);
                    sb.append("-");
                    sb.append(C21329o.this.f57945r);
                    C21218as a = C21218as.m53746a("", "email", sb.toString(), str, str2, C21329o.this.f57953z, C21329o.this.f57946s.getText().toString(), C21329o.this.f57514l, C21329o.this.f57515m);
                    a.mo45323a((C21328n) C21329o.this.getActivity());
                    C21329o.this.mo45321a((Fragment) a, false);
                }
            }

            /* renamed from: a */
            public final void mo45092a(JSONObject jSONObject, String str, String str2) {
                C22093d.m54876a(1, Integer.parseInt(str), str2);
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    new C21023g().mo44997b("email").mo44998c(str).mo44996a("0").mo44999d("/passport/user/login/").mo44990b();
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.xn));
                    C21329o oVar = C21329o.this;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = C21329o.this.getString(R.string.c2j);
                    }
                    oVar.mo45475a(str2);
                }
            }

            /* renamed from: a */
            public final void mo45091a(JSONObject jSONObject, int i, String str) {
                C22093d.m54876a(1, i, str);
                if (C21329o.this.isViewValid() && C21329o.this.getContext() != null) {
                    C21329o.this.f57949v.mo45160a();
                    new C21023g().mo44997b("email").mo44996a("0").mo44998c(String.valueOf(i)).mo44999d("/passport/user/login/").mo44990b();
                    if (!C21459s.f58194d.contains(Integer.valueOf(i))) {
                        if (i == 1034) {
                            C21329o oVar = C21329o.this;
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2j);
                            }
                            oVar.mo45475a(str);
                        } else if (i == 2006 && TextUtils.isEmpty(str)) {
                            C21329o.this.mo45475a(C21329o.this.getString(R.string.c2i));
                        } else if (i == 2027 || i == 2028) {
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2p);
                            }
                            C10691a.m21545b(C21329o.this.getContext(), str).mo19066a();
                        } else {
                            Context context = C21329o.this.getContext();
                            if (TextUtils.isEmpty(str)) {
                                str = C21329o.this.getString(R.string.c2j);
                            }
                            C10691a.m21546b(context, str, 0).mo19066a();
                        }
                    }
                }
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m53930e(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.m53931i()
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r5.m53932j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            if (r0 == 0) goto L_0x0013
            if (r6 != 0) goto L_0x001f
        L_0x0013:
            java.lang.String r0 = r5.m53932j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            if (r0 != 0) goto L_0x0063
            if (r6 != 0) goto L_0x0063
        L_0x001f:
            java.lang.String r0 = r5.m53932j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            java.lang.Class<com.ss.android.ugc.aweme.account.login.fragment.aw> r2 = com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.class
            android.os.Bundle r3 = r5.getArguments()
            com.ss.android.ugc.aweme.account.util.m$a r2 = com.p683ss.android.ugc.aweme.account.util.C22271m.m55124a(r2, r3)
            java.lang.String r3 = "country_code_alpha_2"
            java.lang.String r4 = r5.f57943p
            com.ss.android.ugc.aweme.account.util.m$a r2 = r2.mo46372a(r3, r4)
            java.lang.String r3 = "country_code"
            java.lang.String r4 = r5.f57944q
            com.ss.android.ugc.aweme.account.util.m$a r2 = r2.mo46372a(r3, r4)
            java.lang.String r3 = "phone_number"
            java.lang.String r4 = r5.f57945r
            com.ss.android.ugc.aweme.account.util.m$a r2 = r2.mo46372a(r3, r4)
            java.lang.String r3 = "use_whatsapp_code"
            com.ss.android.ugc.aweme.account.util.m$a r2 = r2.mo46373a(r3, r0)
            android.support.v4.app.Fragment r2 = r2.mo46370a()
            com.ss.android.ugc.aweme.account.login.fragment.a r2 = (com.p683ss.android.ugc.aweme.account.login.fragment.C21168a) r2
            if (r2 == 0) goto L_0x005a
            m53929d(r0)
        L_0x005a:
            com.ss.android.ugc.aweme.account.login.fragment.n r0 = r5.f57511d
            r2.mo45323a(r0)
            r5.mo45321a(r2, r1)
            goto L_0x0069
        L_0x0063:
            r0 = 1
            r5.f57924B = r0
        L_0x0066:
            r5.m53928a(r6, r1)
        L_0x0069:
            com.ss.android.ugc.aweme.account.login.view.a r0 = r5.f57923A
            com.p683ss.android.ugc.aweme.utils.C47700ay.m103236b(r0)
            if (r6 == 0) goto L_0x0073
            java.lang.String r6 = "phone_verification_click_whatsapp"
            goto L_0x0075
        L_0x0073:
            java.lang.String r6 = "phone_verification_click_sms"
        L_0x0075:
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r5.f57516n
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.C21329o.m53930e(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45477b(View view) {
        String string;
        String string2;
        C26890h.m65011a("switch_to_sms_verification", null);
        if (C22305k.m55195a(this.f57944q)) {
            if (getContext() != null) {
                boolean b = C22305k.m55196b(this.f57944q);
                if (this.f57923A == null) {
                    String string3 = getString(R.string.dd7);
                    String string4 = getString(R.string.dd4, m53932j());
                    if (b) {
                        string = getString(R.string.dd6);
                    } else {
                        string = getString(R.string.dd5);
                    }
                    String str = string;
                    if (b) {
                        string2 = getString(R.string.dd5);
                    } else {
                        string2 = getString(R.string.dd6);
                    }
                    C22025b bVar = new C22025b(string3, string4, str, string2, this.f57516n, m53932j());
                    this.f57923A = new C22023a(getContext(), bVar);
                }
                this.f57923A.f59502a = new C21342q(this);
                this.f57923A.f59503b = new C21343r(this, b);
                this.f57923A.f59504c = new C21344s(this, b);
                C47700ay.m103235a(this.f57923A);
            }
        } else if (m53931i()) {
            boolean e = C22305k.m55199e(m53932j());
            C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57943p).mo46372a("country_code", this.f57944q).mo46372a("phone_number", this.f57945r).mo46373a("use_whatsapp_code", e).mo46370a();
            if (aVar != null) {
                m53929d(e);
            }
            aVar.mo45323a(this.f57511d);
            mo45321a((Fragment) aVar, false);
        } else {
            m53928a(false, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45326b(boolean z) {
        if (this.f57942U == 0) {
            this.f57942U = this.f57934L.getBottom() - this.f57508a.getBottom();
        }
        if (this.f57941T == 0) {
            this.f57941T = this.f57934L.getTop() - this.f57508a.getBottom();
        }
        if (!z) {
            this.f57936O.animate().alpha(0.0f).setDuration(110).start();
            this.f57937P.animate().alpha(0.0f).setDuration(110).start();
            this.f57934L.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57938Q.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57949v.getTop() - this.f57938Q.getBottom() <= f57506j) {
            this.f57936O.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57937P.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57934L.animate().translationY((float) (-this.f57941T)).alpha(0.0f).setDuration(220).start();
            this.f57938Q.animate().translationY((float) (-this.f57942U)).setDuration(220).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45478b(boolean z, View view) {
        m53930e(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45476a(boolean z, View view) {
        m53930e(!z);
    }

    /* renamed from: a */
    private void m53928a(boolean z, boolean z2) {
        int i;
        String str;
        String str2;
        mo45324a(true);
        if (!C20884b.m53202c()) {
            i = C22165u.f59781u;
        } else {
            i = C22165u.f59761a;
        }
        this.f57925C = i;
        boolean a = C22299f.m55184a();
        this.f57939R.f57962a = z;
        if (z) {
            C20900b.m53233a(getActivity(), m53932j(), "", this.f57925C, 0, "", 1, a, this.f57939R).mo24766d();
        } else {
            this.f57940S.mo24611a(m53932j(), "", this.f57925C, 0, "", 1, a ? 1 : 0, (C13139p) this.f57939R);
        }
        if (z) {
            str = "send_whatsapp_code";
        } else {
            str = "send_sms";
        }
        C20856a aVar = new C20856a();
        String str3 = "send_method";
        if (z2) {
            str2 = "auto_system";
        } else {
            str2 = "user_click";
        }
        C26890h.m65011a(str, aVar.mo44776a(str3, str2).mo44774a("send_reason", C22165u.f59761a).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45474a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "email").f56798a);
            startActivityForResult(new Intent(this.f57929G, FindPswByEmailActivity.class), PreloadTask.BYTE_UNIT_NUMBER);
        } else if (i == 1) {
            C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "phone").f56798a);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57944q);
            sb.append("-");
            sb.append(this.f57945r);
            mo45325b(C22271m.m55124a(C21632y.class, getArguments()).mo46372a("phone_number", sb.toString()).mo46372a("enter_type", this.f57516n).mo46370a(), false);
        }
        dialogInterface.dismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f57940S = C13081d.m26312a(getContext());
        this.f57930H = (TextView) view.findViewById(R.id.bwh);
        this.f57946s = (EditText) view.findViewById(R.id.abz);
        this.f57948u = view.findViewById(R.id.abl);
        this.f57947t = view.findViewById(R.id.u0);
        this.f57949v = (LoginButton) view.findViewById(R.id.o9);
        this.f57949v.setLoginBackgroundRes(R.drawable.cgq);
        this.f57949v.setAutoMirrored(false);
        this.f57949v.setLoadingBackground(R.drawable.ch1);
        this.f57932J = view.findViewById(R.id.ob);
        this.f57952y = view.findViewById(R.id.dvj);
        this.f57933K = (TextView) view.findViewById(R.id.dvi);
        this.f57934L = (TextView) view.findViewById(R.id.title);
        this.f57935M = (TextView) view.findViewById(R.id.a_p);
        this.f57936O = view.findViewById(R.id.d3l);
        this.f57937P = view.findViewById(R.id.d3m);
        this.f57938Q = view.findViewById(R.id.zr);
        C26890h.m65011a("phone_login_enter_password", new C20856a().f56798a);
        this.f57947t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21329o.this.f57946s.setText("");
                C21329o.this.f57947t.setVisibility(8);
            }
        });
        View view2 = this.f57932J;
        if (this.f57931I) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        View findViewById = view.findViewById(R.id.oc);
        findViewById.setOnTouchListener(new C48221a(0.5f, 150, null));
        findViewById.setOnClickListener(new C21341p(this));
        this.f57946s.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                boolean isEmpty = TextUtils.isEmpty(editable.toString());
                View view = C21329o.this.f57947t;
                if (isEmpty) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                C21329o.this.f57949v.setEnabled(!isEmpty);
                if (isEmpty) {
                    C21329o.this.f57952y.setVisibility(8);
                    C21329o.this.f57948u.setBackgroundColor(C21329o.this.getResources().getColor(R.color.j1));
                }
            }
        });
        this.f57946s.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                View view2 = C21329o.this.f57947t;
                if (!z || TextUtils.isEmpty(C21329o.this.f57946s.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
            }
        });
        this.f57949v.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21329o.this.mo45473a();
            }
        });
        C213378 r7 = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21329o oVar = C21329o.this;
                if (oVar.f57929G == null) {
                    oVar.f57929G = oVar.getContext();
                }
                if (oVar.f57951x == null && oVar.f57929G != null) {
                    C26891a aVar = new C26891a(oVar.f57929G);
                    aVar.mo54844a((CharSequence[]) new String[]{oVar.getString(R.string.c9u), oVar.getString(R.string.cbj)}, (DialogInterface.OnClickListener) new C21345t(oVar));
                    oVar.f57951x = aVar.mo54842a();
                }
                if (oVar.f57951x != null && !oVar.f57951x.isShowing()) {
                    oVar.f57951x.show();
                }
            }
        };
        this.f57930H.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f57930H.setOnClickListener(r7);
        if (this.f57950w == 1) {
            this.f57934L.setText(R.string.can);
            this.f57935M.setVisibility(0);
            this.f57935M.setText(C2240a.m6772a(getResources().getString(R.string.c9v), new Object[]{this.f57953z}));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b05, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f57511d != null) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "email");
            this.f57511d.mo45026a(bundle);
        }
    }
}
