package com.p683ss.android.ugc.aweme.account.login.fragment;

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
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui.FindPswByEmailActivity;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21125b;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21130g;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22271m.C22273a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.f */
public class C21301f extends C21168a implements TextWatcher, OnClickListener, C21055ac, C21125b {

    /* renamed from: y */
    private static final boolean f57838y = false;

    /* renamed from: A */
    private View f57839A;

    /* renamed from: B */
    private View f57840B;

    /* renamed from: C */
    private View f57841C;

    /* renamed from: D */
    private View f57842D;

    /* renamed from: E */
    private View f57843E;

    /* renamed from: F */
    private View f57844F;

    /* renamed from: G */
    private View f57845G;

    /* renamed from: H */
    private View f57846H;

    /* renamed from: I */
    private View f57847I;

    /* renamed from: J */
    private TextView f57848J;

    /* renamed from: K */
    private C21130g f57849K;

    /* renamed from: L */
    private boolean f57850L = true;

    /* renamed from: M */
    private OnFocusChangeListener f57851M = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i = 0;
            if (view.getId() == R.id.abo) {
                ImageView imageView = C21301f.this.f57857r;
                if (!z || TextUtils.isEmpty(C21301f.this.f57855p.getText())) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            if (view.getId() == R.id.ac3) {
                ImageView imageView2 = C21301f.this.f57858s;
                if (!z || TextUtils.isEmpty(C21301f.this.f57856q.getText())) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            }
        }
    };

    /* renamed from: O */
    private int f57852O = 0;

    /* renamed from: P */
    private int f57853P = 0;

    /* renamed from: o */
    public LoginButton f57854o;

    /* renamed from: p */
    public EditText f57855p;

    /* renamed from: q */
    public EditText f57856q;

    /* renamed from: r */
    public ImageView f57857r;

    /* renamed from: s */
    public ImageView f57858s;

    /* renamed from: t */
    public C21305b f57859t = new C21305b();

    /* renamed from: u */
    public String f57860u = "";

    /* renamed from: v */
    public String f57861v;

    /* renamed from: w */
    public String f57862w;

    /* renamed from: x */
    public C21303a f57863x;

    /* renamed from: z */
    private View f57864z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.f$a */
    class C21303a implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            if (C21301f.this.isViewValid() && C21301f.this.getContext() != null) {
                C21301f.this.mo45159d();
                C21301f.this.mo45328f().mo45041a(C22165u.f59767g, (C13136m) new C13136m() {
                    public final void onSuccess(C12993e<C13117p> eVar) {
                        if (C21301f.this.isViewValid() && C21301f.this.getContext() != null) {
                            C21303a.this.mo45447a(eVar);
                        }
                    }

                    public final void onError(C12993e<C13117p> eVar, int i) {
                        if (C21301f.this.isViewValid() && C21301f.this.getContext() != null) {
                            C21303a.this.mo45447a(eVar);
                        }
                    }
                });
            }
        }

        private C21303a() {
        }

        /* renamed from: a */
        public final void mo45447a(C12993e<C13117p> eVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            if (eVar.f34007h != null) {
                jSONObject = ((C13117p) eVar.f34007h).f34279l;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    C21301f.this.mo45158a(optString, null, C22165u.f59767g, C21301f.this.f57863x);
                }
            }
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            if (C21301f.this.isViewValid() && C21301f.this.getContext() != null) {
                C21301f.this.mo45159d();
                C21301f.this.f57854o.mo45161c();
                if ("email".equals(C21301f.this.f57860u)) {
                    C21301f.this.mo45328f().mo45048b(C21301f.this.f57861v, C21301f.this.f57862w, str, C21301f.this.f57859t);
                    return;
                }
                if ("username".equals(C21301f.this.f57860u)) {
                    C21301f.this.mo45328f().mo45045a(C21301f.this.f57861v, C21301f.this.f57862w, str, (C13141r) C21301f.this.f57859t);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.f$b */
    class C21305b extends C13141r {
        private C21305b() {
        }

        public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
            super.onNeedSecureCaptcha((C12993e) bVar);
            if (C21301f.this.isViewValid()) {
                C21301f.this.f57854o.mo45160a();
            }
        }

        public final void onSuccess(C12993e<C13121t> eVar) {
            if (C21301f.this.isViewValid()) {
                C21301f.this.f57854o.mo45160a();
                C21301f.this.mo45441a(((C13121t) eVar.f34007h).f34279l);
                new C21023g().mo44997b("email").mo44996a("1").mo44990b();
            }
        }

        public final void onError(C12993e<C13121t> eVar, int i) {
            JSONObject jSONObject;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (C21301f.this.isViewValid()) {
                C21301f.this.f57854o.mo45160a();
                JSONObject jSONObject2 = null;
                if (eVar.f34007h != null) {
                    jSONObject = ((C13121t) eVar.f34007h).f34279l;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("captcha");
                    if (!TextUtils.isEmpty(optString)) {
                        C21301f.this.mo45158a(optString, eVar.f34001d, C22165u.f59767g, C21301f.this.f57863x);
                        return;
                    }
                }
                if (i > 0) {
                    C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                    if ("email".equals(C21301f.this.f57860u)) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("enter_method", C21301f.this.f57515m).mo44776a("platform", "email").mo44776a("enter_type", C21301f.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    } else if ("username".equals(C21301f.this.f57860u)) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("enter_method", C21301f.this.f57515m).mo44776a("platform", "handle").mo44776a("enter_type", C21301f.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    }
                    if (!C21459s.f58194d.contains(Integer.valueOf(eVar.f34000c))) {
                        C21301f fVar = C21301f.this;
                        int i2 = eVar.f34000c;
                        String str6 = eVar.f34001d;
                        if (jSONObject2 != null) {
                            str3 = jSONObject2.optString("mobile");
                        } else {
                            str3 = "";
                        }
                        String str7 = str3;
                        if (jSONObject2 != null) {
                            str4 = jSONObject2.optString("shark_ticket");
                        } else {
                            str4 = "";
                        }
                        String str8 = str4;
                        if (jSONObject2 != null) {
                            str5 = jSONObject2.optString("platform");
                        } else {
                            str5 = "";
                        }
                        fVar.mo45440a(i2, str6, str7, str8, str5);
                    }
                    new C21023g().mo44997b("email").mo44996a("0").mo44998c(String.valueOf(eVar.f34000c)).mo44999d("/passport/user/login/").mo44990b();
                    C21355h.m53976a(0, C21301f.this.f57860u, eVar.f34000c, eVar.f34001d);
                    return;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = "";
                }
                C22093d.m54876a(1, -10000, str);
                Toast makeText = Toast.makeText(C21301f.this.getContext(), R.string.ccn, 0);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                String str9 = C21301f.this.f57860u;
                if (eVar.f34001d != null) {
                    str2 = eVar.f34001d;
                } else {
                    str2 = "";
                }
                C21355h.m53976a(0, str9, -1, str2);
                new C21023g().mo44997b("email").mo44996a("0").mo44998c("-1000").mo44999d("/passport/user/login/").mo44990b();
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57849K != null) {
            this.f57849K.mo46991S_();
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57855p);
    }

    public void onStart() {
        super.onStart();
        this.f57855p.postDelayed(new C21306g(this), 500);
    }

    /* renamed from: a */
    public final void mo45239a() {
        if (getContext() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.f57855p.getWindowToken(), 0);
                inputMethodManager.hideSoftInputFromWindow(this.f57856q.getWindowToken(), 0);
            }
        }
    }

    public final boolean ai_() {
        if (getArguments() == null || !this.f57850L || C23826bi.m58466g()) {
            return false;
        }
        int i = getArguments().getInt("init_page", 0);
        if (i == 8 || i == 9) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57863x = new C21303a();
    }

    /* renamed from: b */
    public final void mo45241b(int i) {
        this.f57845G.setBackgroundColor(getResources().getColor(R.color.xn));
        this.f57847I.setVisibility(0);
        this.f57848J.setText(R.string.c_2);
    }

    public void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        LoginButton loginButton = this.f57854o;
        int i2 = 0;
        if (TextUtils.isEmpty(this.f57855p.getText()) || TextUtils.isEmpty(this.f57856q.getText())) {
            z = false;
        } else {
            z = true;
        }
        loginButton.setEnabled(z);
        ImageView imageView = this.f57858s;
        if (!this.f57856q.hasFocus() || TextUtils.isEmpty(this.f57856q.getText())) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.f57857r;
        if (!this.f57855p.hasFocus() || TextUtils.isEmpty(this.f57855p.getText())) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        if (TextUtils.isEmpty(this.f57855p.getText()) && TextUtils.isEmpty(this.f57856q.getText())) {
            this.f57847I.setVisibility(8);
            this.f57845G.setBackgroundColor(getResources().getColor(R.color.j1));
            this.f57846H.setBackgroundColor(getResources().getColor(R.color.j1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45326b(boolean z) {
        int i;
        if (this.f57853P == 0) {
            if (getContext() != null) {
                i = (int) C9432q.m18687b(getContext(), 30.0f);
            } else {
                i = 0;
            }
            this.f57853P = (this.f57841C.getBottom() - this.f57864z.getBottom()) + i;
        }
        if (this.f57852O == 0) {
            this.f57852O = this.f57841C.getTop() - this.f57864z.getBottom();
        }
        if (!z) {
            this.f57839A.animate().alpha(0.0f).setDuration(110).start();
            this.f57840B.animate().alpha(0.0f).setDuration(110).start();
            this.f57841C.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57844F.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57854o.getTop() - this.f57844F.getBottom() <= f57506j) {
            this.f57839A.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57840B.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57841C.animate().translationY((float) (-this.f57852O)).alpha(0.0f).setDuration(220).start();
            this.f57844F.animate().translationY((float) (-this.f57853P)).setDuration(220).start();
        }
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (view != this.f57864z) {
            boolean z2 = false;
            if (view == this.f57854o) {
                this.f57854o.setEnabled(false);
                new C21022f().mo44994a(this.f57514l).mo44995b("email").mo44990b();
                C21130g gVar = this.f57849K;
                String obj = this.f57855p.getText().toString();
                String obj2 = this.f57856q.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    ((C21125b) gVar.f70701g).mo45241b(R.string.c_2);
                } else {
                    z2 = true;
                }
                if (z2) {
                    ((C21125b) gVar.f70701g).mo45240a(obj, obj2, true ^ C21145a.m53660a(obj) ? 1 : 0);
                    ((C21125b) gVar.f70701g).mo45239a();
                }
            } else if (view == this.f57842D) {
                Intent intent = new Intent(getActivity(), FindPswByEmailActivity.class);
                if (getArguments() != null) {
                    intent.putExtras(getArguments());
                }
                intent.putExtra("forget_psw_from_tt_email", true);
                startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
            } else if (view == this.f57843E) {
                C22273a a = C22271m.m55124a(C21203ak.class, getArguments());
                String str = "need_auto_fill_phone_number";
                if (getArguments() == null || getArguments().getBoolean("need_auto_fill_latest_login_info", true)) {
                    z = true;
                } else {
                    z = false;
                }
                C21168a aVar = (C21168a) a.mo46373a(str, z).mo46371a("order", 0).mo46372a("enter_type", this.f57516n).mo46370a();
                if (aVar != null) {
                    C26890h.m65011a("switch_to_phone", null);
                }
                aVar.mo45323a(this.f57511d);
                mo45321a((Fragment) aVar, true);
            } else if (view == this.f57858s) {
                this.f57858s.setVisibility(8);
                this.f57856q.setText("");
            } else if (view == this.f57857r) {
                this.f57857r.setVisibility(8);
                this.f57855p.setText("");
            }
        } else if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    public final void mo45441a(JSONObject jSONObject) {
        LoginMethodName loginMethodName;
        if ("email".equals(this.f57860u)) {
            C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("platform", "email").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
        } else if ("username".equals(this.f57860u)) {
            C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("platform", "handle").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
        }
        try {
            new C18493a();
            m53691a(jSONObject.optJSONObject("data"), (C13207b) C18493a.m44735b(jSONObject));
        } catch (Exception unused) {
        }
        if (!(this.f57511d == null || getArguments() == null)) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "mobile");
            bundle.putString("login_path", "email_or_username");
            this.f57511d.mo45026a(bundle);
        }
        C21355h.m53976a(1, this.f57860u, 0, "");
        if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
            String d = C23826bi.m58463d();
            if (TextUtils.equals("email", this.f57860u)) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            } else {
                loginMethodName = LoginMethodName.USER_NAME_PASS;
            }
            C21518u.m54176b(new AccountPassLoginMethod(d, loginMethodName, this.f57861v));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57864z = view.findViewById(R.id.ay9);
        this.f57839A = view.findViewById(R.id.dhb);
        this.f57840B = view.findViewById(R.id.d1n);
        this.f57841C = view.findViewById(R.id.dam);
        this.f57854o = (LoginButton) view.findViewById(R.id.o9);
        this.f57842D = view.findViewById(R.id.d_n);
        this.f57855p = (EditText) view.findViewById(R.id.abo);
        this.f57856q = (EditText) view.findViewById(R.id.ac3);
        this.f57845G = view.findViewById(R.id.abp);
        this.f57846H = view.findViewById(R.id.ac6);
        this.f57847I = view.findViewById(R.id.dvn);
        this.f57848J = (TextView) view.findViewById(R.id.dvm);
        this.f57857r = (ImageView) view.findViewById(R.id.tv);
        this.f57858s = (ImageView) view.findViewById(R.id.u2);
        this.f57844F = view.findViewById(R.id.zr);
        this.f57843E = view.findViewById(R.id.oe);
        this.f57843E.setOnClickListener(this);
        this.f57843E.setOnTouchListener(new C48221a(0.5f, 150, null));
        C23729p.m58259a((TextView) this.f57843E, (int) R.drawable.cfg);
        this.f57864z.setOnClickListener(this);
        this.f57854o.setOnClickListener(this);
        this.f57842D.setOnClickListener(this);
        this.f57842D.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f57855p.addTextChangedListener(this);
        this.f57856q.addTextChangedListener(this);
        this.f57855p.setOnFocusChangeListener(this.f57851M);
        this.f57856q.setOnFocusChangeListener(this.f57851M);
        this.f57858s.setOnClickListener(this);
        this.f57857r.setOnClickListener(this);
        view.findViewById(R.id.od).setVisibility(0);
        this.f57854o.setLoginBackgroundRes(R.drawable.cgq);
        this.f57854o.setAutoMirrored(false);
        this.f57854o.setLoadingBackground(R.drawable.ch1);
        if (getArguments() != null && getArguments().getBoolean("need_auto_fill_account_name", false)) {
            BaseLoginMethod a = C21518u.m54170a(LoginMethodName.DEFAULT);
            if (a instanceof AccountPassLoginMethod) {
                this.f57855p.setText(((AccountPassLoginMethod) a).getName());
                this.f57856q.requestFocus();
            }
        }
        this.f57849K = new C21130g();
        this.f57849K.mo54800a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b04, viewGroup, false);
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

    /* renamed from: a */
    public final void mo45240a(String str, String str2, int i) {
        this.f57861v = str;
        this.f57862w = str2;
        this.f57850L = false;
        mo45329g();
        this.f57854o.mo45161c();
        if (i == 0) {
            this.f57860u = "email";
            C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).mo44776a("platform", "email").f56798a);
            mo45328f().mo45048b(str, str2, "", this.f57859t);
        } else if (i == 1) {
            this.f57860u = "username";
            C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).mo44776a("platform", "handle").f56798a);
            mo45328f().mo45045a(str, str2, "", (C13141r) this.f57859t);
        } else {
            this.f57854o.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo45440a(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        int i2 = i;
        this.f57847I.setVisibility(0);
        this.f57845G.setBackgroundColor(getResources().getColor(R.color.xn));
        this.f57846H.setBackgroundColor(getResources().getColor(R.color.xn));
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i2 != 1011) {
            if (i2 == 2002) {
                C21218as asVar = null;
                if (this.f57860u.equals("email")) {
                    asVar = C21218as.m53746a("", this.f57860u, "", str2, str3, this.f57855p.getText().toString(), this.f57856q.getText().toString(), this.f57514l, this.f57515m);
                } else if (this.f57860u.equals("username")) {
                    asVar = C21218as.m53746a(this.f57855p.getText().toString(), this.f57860u, "", str2, str3, "", this.f57856q.getText().toString(), this.f57514l, this.f57515m);
                }
                if (asVar != null) {
                    asVar.mo45323a((C21328n) getActivity());
                    mo45321a((Fragment) asVar, false);
                    return;
                }
            } else if (i2 != 2005) {
                switch (i2) {
                    case 2027:
                    case 2028:
                        if (TextUtils.isEmpty(str)) {
                            str5 = getString(R.string.c2p);
                        } else {
                            str5 = str;
                        }
                        this.f57847I.setVisibility(8);
                        C10691a.m21545b(getContext(), str5).mo19066a();
                        return;
                    default:
                        TextView textView = this.f57848J;
                        if (isEmpty) {
                            str6 = getString(R.string.c2j);
                        } else {
                            str6 = str;
                        }
                        textView.setText(str6);
                        break;
                }
            } else {
                C21221at a = C21221at.m53759a(this.f57855p.getText().toString(), this.f57860u, "", str4, this.f57855p.getText().toString(), this.f57856q.getText().toString(), this.f57514l, this.f57515m);
                a.mo45323a((C21328n) getActivity());
                mo45321a((Fragment) a, false);
                return;
            }
            return;
        }
        this.f57848J.setText(R.string.c8q);
    }
}
