package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1060c.C17666bt;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountryListActivity;
import com.p683ss.android.ugc.aweme.account.login.sms.C21460a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20976a;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22241h;
import com.p683ss.android.ugc.aweme.account.shortvideo.p1306ui.PressFadeLinearLayout;
import com.p683ss.android.ugc.aweme.account.util.C22263e;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ak */
public class C21203ak extends C21168a implements OnClickListener, C20976a, C21055ac, C22241h {

    /* renamed from: A */
    private Dialog f57602A;

    /* renamed from: B */
    private String f57603B;

    /* renamed from: C */
    private String f57604C;

    /* renamed from: D */
    private String f57605D;

    /* renamed from: E */
    private TextView f57606E;

    /* renamed from: F */
    private C21460a f57607F;

    /* renamed from: G */
    private boolean f57608G = true;

    /* renamed from: H */
    private DmtTextView f57609H;

    /* renamed from: I */
    private long f57610I;

    /* renamed from: J */
    private OnFocusChangeListener f57611J = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i;
            if (view.getId() == R.id.ac1) {
                ImageView imageView = C21203ak.this.f57615r;
                if (!z || TextUtils.isEmpty(C21203ak.this.f57612o.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
    };

    /* renamed from: o */
    public EditText f57612o;

    /* renamed from: p */
    public LoginButton f57613p;

    /* renamed from: q */
    public DmtButton f57614q;

    /* renamed from: r */
    public ImageView f57615r;

    /* renamed from: s */
    public C21210a f57616s;

    /* renamed from: t */
    public String f57617t;

    /* renamed from: u */
    public DmtStatusView f57618u;

    /* renamed from: v */
    private TextView f57619v;

    /* renamed from: w */
    private PressFadeLinearLayout f57620w;

    /* renamed from: x */
    private TextView f57621x;

    /* renamed from: y */
    private TextView f57622y;

    /* renamed from: z */
    private Dialog f57623z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ak$a */
    public interface C21210a {
        /* renamed from: a */
        void mo45257a(String str, String str2, C21168a aVar);

        /* renamed from: d */
        String mo45260d();

        /* renamed from: e */
        String mo45262e();

        /* renamed from: f */
        boolean mo45263f();
    }

    /* renamed from: i */
    public final long mo45361i() {
        return System.currentTimeMillis() - this.f57610I;
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57612o);
    }

    public void onStart() {
        super.onStart();
        this.f57612o.postDelayed(new Runnable() {
            public final void run() {
                C21203ak.this.mo45322a((View) C21203ak.this.f57612o);
            }
        }, 500);
    }

    public void onStop() {
        super.onStop();
        if (this.f57607F != null) {
            this.f57607F.mo45643b();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f57623z != null) {
            C21216aq.m53744a(this.f57623z);
        }
        if (this.f57602A != null) {
            C21216aq.m53744a(this.f57602A);
        }
    }

    public void onResume() {
        super.onResume();
        if (TextUtils.equals(this.f57617t, "enter_from_bind_pre_account")) {
            this.f57610I = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo45360a() {
        if (this.f57613p == null || this.f57613p.getVisibility() != 0) {
            if (this.f57614q != null && this.f57614q.getVisibility() == 0) {
                this.f57618u.setVisibility(8);
            }
            return;
        }
        this.f57613p.mo45160a();
    }

    public final boolean ai_() {
        if (getArguments() == null || !this.f57608G || C23826bi.m58466g()) {
            return false;
        }
        int i = getArguments().getInt("init_page", 0);
        if (i == 11 || i == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m53735j() {
        if (TextUtils.isEmpty(this.f57603B) || TextUtils.isEmpty(this.f57604C) || TextUtils.isEmpty(this.f57605D)) {
            if (getArguments() != null && getArguments().getBoolean("need_auto_fill_phone_number", false)) {
                BaseLoginMethod a = C21518u.m54170a(LoginMethodName.DEFAULT);
                if (a instanceof PhoneLoginMethod) {
                    C21135a phoneNumber = ((PhoneLoginMethod) a).getPhoneNumber();
                    if (phoneNumber.getNationalNumber() != 0) {
                        this.f57612o.setText(String.valueOf(phoneNumber.getNationalNumber()));
                    }
                    C21386a a2 = C21386a.f58040h.mo45572a(phoneNumber);
                    if (a2 != null) {
                        this.f57619v.setText(a2.f58044d);
                        this.f57621x.setText(a2.f58043c);
                        return;
                    }
                }
            }
            String str = null;
            TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso();
            }
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(str)) {
                C17666bt it = C21386a.m54007b().iterator();
                while (it.hasNext()) {
                    C21386a aVar = (C21386a) it.next();
                    if (aVar.f58043c.equalsIgnoreCase(str)) {
                        this.f57619v.setText(aVar.f58044d);
                        this.f57621x.setText(aVar.f58043c);
                        return;
                    }
                }
            }
            return;
        }
        this.f57619v.setText(this.f57603B);
        this.f57621x.setText(this.f57604C);
        this.f57612o.setText(this.f57605D);
    }

    /* renamed from: a */
    public final void mo44974a(C21386a aVar) {
        if (aVar != null) {
            this.f57619v.setText(aVar.f58044d);
            this.f57621x.setText(aVar.f58043c);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null && C20975a.m53336a() != null) {
            mo44974a(C20975a.m53336a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57607F = new C21460a(this, this.f57515m);
        this.f57607F.mo45640a();
        if (getArguments() != null) {
            this.f57617t = getArguments().getString(C21459s.f58201k);
        }
    }

    public void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.on || view.getId() == R.id.o9) {
            if (view.getId() == R.id.on) {
                KeyboardUtils.m58184c(this.f57612o);
                C26890h.m65011a("click_next_for_proAccount", new C20856a().mo44774a("is_success", 1).mo44776a("method", "phone").mo44776a("page", "Set up by Phone").mo44775a("duration", System.currentTimeMillis() - this.f57610I).f56798a);
            }
            C26890h.m65011a("login_click_next", new C20856a().mo44776a("platform", "phone").f56798a);
            this.f57603B = this.f57619v.getText().toString();
            this.f57604C = this.f57621x.getText().toString();
            this.f57605D = this.f57612o.getText().toString();
            if (this.f57616s != null) {
                this.f57616s.mo45257a(this.f57619v.getText().toString(), this.f57612o.getText().toString(), this);
                return;
            }
            this.f57608G = false;
            C21168a aVar = (C21168a) C22271m.m55124a(C21217ar.m53745a(), getArguments()).mo46372a("country_code_alpha_2", this.f57621x.getText().toString()).mo46372a("country_code", this.f57619v.getText().toString()).mo46371a("order", 1).mo46372a("enter_type", this.f57516n).mo46372a("phone_number", this.f57612o.getText().toString()).mo46371a("login_type", 0).mo46370a();
            if (aVar != null) {
                C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 1).f56798a);
            }
            aVar.mo45323a(this.f57511d);
            mo45321a((Fragment) aVar, false);
            return;
        }
        if (view.getId() == R.id.f5u) {
            C18922i iVar = new C18922i("https://www.tiktok.com/passport/email/email_bind_index/");
            C47549c.m102974a();
            User b = C47549c.m102975b();
            String b2 = ((C36692m) C23826bi.m58450a(C36692m.class)).mo47887b();
            String a = ((C36692m) C23826bi.m58450a(C36692m.class)).mo47886a();
            iVar.mo38778a("lang", b2);
            iVar.mo38776a("aid", (int) C23018b.f61359a);
            iVar.mo38778a("locale", a);
            iVar.mo38778a("enterfrom", "switchtoproaccount");
            C26890h.onEventV3("set_up_by_email");
            if (!TextUtils.isEmpty(b.getEmail())) {
                iVar.mo38778a("email", b.getEmail());
                StringBuilder sb = new StringBuilder();
                sb.append(iVar.mo38774a());
                sb.append("#verify-email");
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iVar.mo38774a());
                sb2.append("#bind-email");
                str = sb2.toString();
            }
            C22263e.m55109a(getActivity(), str, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20975a.m53338a((C20976a) this);
        this.f57619v = (TextView) view.findViewById(R.id.a1f);
        this.f57620w = (PressFadeLinearLayout) view.findViewById(R.id.a1d);
        this.f57621x = (TextView) view.findViewById(R.id.a1e);
        this.f57612o = (EditText) view.findViewById(R.id.ac1);
        this.f57613p = (LoginButton) view.findViewById(R.id.o9);
        this.f57613p.setLoginBackgroundRes(R.drawable.cgr);
        this.f57613p.setLoadingBackground(R.drawable.ch1);
        this.f57614q = (DmtButton) view.findViewById(R.id.on);
        this.f57615r = (ImageView) view.findViewById(R.id.u1);
        this.f57622y = (TextView) view.findViewById(R.id.cy4);
        this.f57606E = (TextView) view.findViewById(R.id.czb);
        this.f57618u = (DmtStatusView) view.findViewById(R.id.csv);
        this.f57618u.setBuilder(C10719a.m21676a(getContext()));
        this.f57609H = (DmtTextView) view.findViewById(R.id.f5u);
        if ("third_party_login".equals(mo45330h()) && this.f57508a != null) {
            this.f57508a.setVisibility(4);
        }
        if ("third_party_login".equals(mo45330h()) && this.f57509b != null) {
            this.f57509b.setVisibility(0);
        }
        int i = 8;
        if (TextUtils.equals(this.f57617t, "enter_from_bind_pre_account")) {
            this.f57613p.setVisibility(8);
            this.f57614q.setVisibility(0);
            this.f57614q.setEnabled(false);
            this.f57609H.setVisibility(0);
            String a = C2240a.m6772a(getString(R.string.hhd), new Object[]{getString(R.string.hhb)});
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ja)), a.length() - getString(R.string.hhb).length(), a.length(), 33);
            this.f57609H.setText(spannableString);
            this.f57609H.setOnClickListener(new C21211al(this));
            ((SendVerificationCodeActivity) getActivity()).f57418c = new C21212am(this);
        }
        this.f57620w.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21203ak.this.getActivity().startActivity(new Intent(C21203ak.this.getActivity(), MusCountryListActivity.class));
            }
        });
        View findViewById = view.findViewById(R.id.o_);
        View findViewById2 = view.findViewById(R.id.oa);
        C23729p.m58259a((TextView) findViewById2, (int) R.drawable.cfg);
        findViewById2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                boolean z = true;
                if (C21203ak.this.getArguments() != null) {
                    z = C21203ak.this.getArguments().getBoolean("need_auto_fill_latest_login_info", true);
                }
                C21168a aVar = (C21168a) C22271m.m55124a(C21301f.class, C21203ak.this.getArguments()).mo46373a("need_auto_fill_account_name", z).mo46372a("enter_type", C21203ak.this.f57516n).mo46370a();
                if (aVar != null) {
                    C26890h.m65011a("switch_to_email", null);
                }
                aVar.mo45323a(C21203ak.this.f57511d);
                C21203ak.this.mo45321a((Fragment) aVar, C22298e.m55182a());
            }
        });
        findViewById2.setOnTouchListener(new C48221a(0.5f, 150, null));
        if (this.f57616s != null && !TextUtils.isEmpty(this.f57616s.mo45260d())) {
            this.f57606E.setText(this.f57616s.mo45260d());
            findViewById.setVisibility(8);
            View findViewById3 = view.findViewById(R.id.ky);
            if (this.f57616s.mo45263f()) {
                i = 0;
            }
            findViewById3.setVisibility(i);
            if (!TextUtils.isEmpty(this.f57616s.mo45262e())) {
                ((TextView) view.findViewById(R.id.ky)).setText(this.f57616s.mo45262e());
            }
        }
        this.f57613p.setOnClickListener(new C21213an(this));
        this.f57614q.setOnClickListener(new C21214ao(this));
        this.f57612o.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                int i;
                if (TextUtils.equals(C21203ak.this.f57617t, "enter_from_bind_pre_account")) {
                    C21203ak.this.f57614q.setEnabled(!TextUtils.isEmpty(C21203ak.this.f57612o.getText()));
                } else {
                    C21203ak.this.f57613p.setEnabled(!TextUtils.isEmpty(C21203ak.this.f57612o.getText()));
                }
                ImageView imageView = C21203ak.this.f57615r;
                if (!C21203ak.this.f57612o.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57612o.setFilters(new InputFilter[]{new InputFilter() {
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (charSequence == null) {
                    return null;
                }
                if (charSequence.length() > 1) {
                    return charSequence.toString().trim().replace("+", "").replace("-", "");
                }
                if (charSequence.length() <= 0 || charSequence.charAt(0) < '0' || charSequence.charAt(0) > '9') {
                    return "";
                }
                return charSequence;
            }
        }});
        this.f57612o.setOnFocusChangeListener(this.f57611J);
        this.f57615r.setOnClickListener(new C21215ap(this));
        if (this.f57616s != null) {
            if (C22298e.m55182a()) {
                this.f57622y.setText(R.string.c92);
            } else {
                this.f57622y.setText(R.string.c91);
            }
        }
        this.f57607F.f58217a = this.f57612o;
        if (this.f57616s == null) {
            this.f57607F.mo45644c();
        }
        m53735j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f57607F != null) {
            this.f57607F.mo45641a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b03, viewGroup, false);
    }
}
