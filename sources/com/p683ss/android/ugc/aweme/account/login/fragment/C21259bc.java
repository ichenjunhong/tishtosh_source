package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p846b.C13004e;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p844a.p848d.C13018g;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13107f;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13129f;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C22041x;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21092aa;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bc */
public class C21259bc extends C21168a implements C21109n {

    /* renamed from: A */
    private C13011d f57729A;

    /* renamed from: o */
    public EditText f57730o;

    /* renamed from: p */
    public ImageView f57731p;

    /* renamed from: q */
    public View f57732q;

    /* renamed from: r */
    public LoginButton f57733r;

    /* renamed from: s */
    public View f57734s;

    /* renamed from: t */
    public TextView f57735t;

    /* renamed from: u */
    public TextView f57736u;

    /* renamed from: v */
    public Handler f57737v;

    /* renamed from: w */
    public String f57738w;

    /* renamed from: x */
    public int f57739x;

    /* renamed from: y */
    public boolean f57740y;

    /* renamed from: z */
    private TextView f57741z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return false;
    }

    /* renamed from: a */
    public final void mo45160a() {
        this.f57733r.mo45160a();
    }

    /* renamed from: c */
    public final void mo45161c() {
        this.f57733r.mo45161c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo45400j() {
        mo45322a((View) this.f57730o);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57730o);
    }

    public void onStart() {
        super.onStart();
        this.f57730o.postDelayed(new C21266bd(this), 500);
    }

    /* renamed from: k */
    private void m53834k() {
        mo45161c();
        this.f57729A.mo24609a(this.f57730o.getText().toString().trim(), (C13001b) new C13001b() {
            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                super.onNeedSecureCaptcha((C13013b) bVar);
                if (C21259bc.this.isViewValid()) {
                    C22308a.m55205a(C21259bc.this.f57733r);
                }
            }

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13013b bVar2 = (C13013b) bVar;
                if (C21259bc.this.isViewValid() && C21259bc.this.getActivity() != null) {
                    C21259bc.this.f57736u.setVisibility(8);
                    C21259bc.this.f57734s.setVisibility(8);
                    if (C21259bc.this.f57739x == 3) {
                        new C21022f().mo44995b("email").mo44994a(C21259bc.this.f57514l).mo44990b();
                        C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", C21259bc.this.f57515m).mo44776a("enter_from", C21259bc.this.f57514l).mo44776a("enter_type", C21259bc.this.f57516n).mo44776a("platform", "email").mo44776a("group_id", C21021e.m53409a(C21259bc.this.getArguments())).mo44776a("log_pb", C21021e.m53412b(C21259bc.this.getArguments())).f56798a);
                        C21259bc.this.mo45397a("");
                        return;
                    }
                    C21259bc.this.mo45399i();
                }
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C13013b bVar2 = (C13013b) bVar;
                C21259bc.this.mo45160a();
                C21259bc.this.f57736u.setVisibility(0);
                if (i != 17 || TextUtils.isEmpty(bVar2.f34001d)) {
                    C21259bc.this.f57736u.setText(R.string.cn9);
                } else {
                    C21259bc.this.f57736u.setText(bVar2.f34001d);
                }
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f57740y) {
            C23826bi.m58451a(13, 2, (Object) null);
        }
        if (this.f57737v != null) {
            this.f57737v.removeCallbacksAndMessages(null);
            this.f57737v = null;
        }
    }

    /* renamed from: i */
    public final void mo45399i() {
        mo45161c();
        mo45328f().mo45044a(this.f57730o.getText().toString(), (C21092aa) new C21092aa(this, this.f57730o.getText().toString(), 0) {
            /* renamed from: a */
            public final void mo45147a(C12993e<C13163a> eVar) {
                if (C21259bc.this.isViewValid() && C21259bc.this.getActivity() != null) {
                    if (C21259bc.this.f57739x == 2) {
                        C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", "register").mo44774a("is_success", 1).f56798a);
                    }
                    C21259bc.this.f57740y = true;
                    C23826bi.m58451a(13, 1, (Object) null);
                    C21259bc.this.mo45160a();
                    C21259bc.this.getActivity().finish();
                }
            }

            /* renamed from: b */
            public final void mo45148b(C12993e<C13163a> eVar) {
                if (C21259bc.this.isViewValid() && C21259bc.this.getActivity() != null) {
                    if (C21259bc.this.f57739x == 2) {
                        C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", "register").mo44774a("is_success", 0).mo44776a("error_code", (String) null).f56798a);
                    }
                    C21259bc.this.mo45160a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo45397a(String str) {
        mo45161c();
        mo45329g();
        this.f57729A.mo24634a(this.f57738w, this.f57730o.getText().toString(), "", str, (C13129f) new C13129f() {
            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                super.onNeedSecureCaptcha(eVar);
                C22308a.m55205a(C21259bc.this.f57733r);
                C26890h.m65011a("set_password_response", new C20856a().mo44774a("is_success", 0).mo44776a("enter_from", "register").mo44776a("platform", "email").mo44774a("error_code", eVar.f34000c).f56798a);
                C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21259bc.this.f57515m).mo44776a("enter_type", C21259bc.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
            }

            public final void onSuccess(C12993e<C13107f> eVar) {
                if (C21259bc.this.isViewValid() && C21259bc.this.getContext() != null && eVar.f34007h != null && ((C13107f) eVar.f34007h).f34257e != null) {
                    C26890h.m65011a("set_password_response", new C20856a().mo44774a("is_success", 1).mo44776a("enter_from", "register").mo44776a("platform", "email").f56798a);
                    C21259bc.this.mo45160a();
                    new C21023g().mo44996a("1").mo44997b("email").mo44990b();
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21259bc.this.f57515m).mo44776a("enter_from", C21259bc.this.f57514l).mo44776a("enter_type", C21259bc.this.f57516n).mo44776a("platform", "email").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    C23826bi.m58455a(((C13107f) eVar.f34007h).f34257e);
                    C21355h.m53975a(1, 0, "");
                    if (C21259bc.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21259bc.this.getArguments());
                        bundle.putString("platform", "email");
                        bundle.putString("login_path", "email_or_username");
                        C21259bc.this.f57511d.mo45026a(bundle);
                    }
                    if (C21259bc.this.getArguments() != null && C21259bc.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21518u.m54176b(new AccountPassLoginMethod(C23826bi.m58463d(), LoginMethodName.EMAIL_PASS, C21259bc.this.f57738w));
                    }
                }
            }

            public final void onError(C12993e<C13107f> eVar, int i) {
                if (C21259bc.this.isViewValid() && C21259bc.this.getContext() != null) {
                    C26890h.m65011a("set_password_response", new C20856a().mo44774a("is_success", 0).mo44776a("enter_from", "register").mo44776a("platform", "email").mo44774a("error_code", eVar.f34000c).f56798a);
                    if (i == 2013) {
                        C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21259bc.this.getArguments()).mo46371a("code_type", 6).mo46372a("email", C21259bc.this.f57738w).mo46372a("enter_from", C21259bc.this.f57514l).mo46372a("pass_word", C21259bc.this.f57730o.getText().toString()).mo46370a();
                        aVar.mo45323a(C21259bc.this.f57511d);
                        C21259bc.this.mo45321a((Fragment) aVar, false);
                        return;
                    }
                    new C21023g().mo44996a("0").mo44997b("email").mo44998c(String.valueOf(eVar.f34000c)).mo44999d("/passport/email/register/v2/").mo44990b();
                    C22308a.m55205a(C21259bc.this.f57733r);
                    if (eVar.f34000c != 1105) {
                        C10691a.m21545b(C21259bc.this.getContext(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                    C21355h.m53975a(0, eVar.f34000c, eVar.f34001d);
                    C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                }
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57737v = new Handler();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57738w = arguments.getString("email");
            this.f57739x = arguments.getInt("set_pass_scene", 1);
            this.f57514l = arguments.getString("enter_from");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45398b(View view) {
        if (this.f57739x == 3) {
            if (C22298e.m55182a()) {
                new C21022f().mo44995b("email").mo44994a(this.f57514l).mo44990b();
                C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("platform", "email").mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).f56798a);
                mo45397a("");
                return;
            }
            m53834k();
        } else if (this.f57739x == 4) {
            C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("platform", "email").mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments())).f56798a);
            this.f57729A.mo24639a(this.f57730o.getText().toString().trim(), getArguments().getString("ticket"), (Map) null, (String) null, (C13004e) new C13004e() {
                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C13018g gVar = (C13018g) bVar;
                    C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "email").mo44776a("enter_from", "reset_password").mo44774a("is_success", 1).f56798a);
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21259bc.this.f57515m).mo44776a("enter_from", C21259bc.this.f57514l).mo44776a("enter_type", C21259bc.this.f57516n).mo44776a("platform", "email").mo44774a("status", 1).f56798a);
                    C23826bi.m58455a(gVar.f34009h);
                    C21259bc.this.mo45160a();
                    if (C21259bc.this.getActivity() != null && !C21259bc.this.getActivity().isFinishing()) {
                        C21259bc.this.getActivity().setResult(-1);
                        C21259bc.this.getActivity().finish();
                    }
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    C13018g gVar = (C13018g) bVar;
                    C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", "email").mo44776a("enter_from", "reset_password").mo44774a("is_success", 0).mo44774a("error_code", gVar.f34000c).f56798a);
                    C21259bc.this.mo45160a();
                    C10691a.m21546b(C21259bc.this.getContext(), gVar.f34001d, 0).mo19066a();
                }
            });
        } else if (C22298e.m55182a()) {
            mo45399i();
        } else {
            m53834k();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57729A = C13081d.m26312a(getContext());
        this.f57730o = (EditText) view.findViewById(R.id.abz);
        this.f57732q = view.findViewById(R.id.ac0);
        this.f57731p = (ImageView) view.findViewById(R.id.u0);
        this.f57733r = (LoginButton) view.findViewById(R.id.nl);
        this.f57734s = view.findViewById(R.id.dvp);
        this.f57735t = (TextView) view.findViewById(R.id.dvo);
        this.f57736u = (TextView) view.findViewById(R.id.de8);
        this.f57741z = (TextView) view.findViewById(R.id.dg4);
        ImageView imageView = (ImageView) view.findViewById(R.id.ay9);
        this.f57733r.setLoginBackgroundRes(R.drawable.cgq);
        int i = 0;
        this.f57733r.setAutoMirrored(false);
        this.f57733r.setLoadingBackground(R.drawable.ch1);
        this.f57741z.setVisibility(8);
        if (this.f57739x == 2) {
            C26890h.m65011a("set_password_show", new C20856a().mo44776a("enter_from", "register").mo44776a("platform", "phone").f56798a);
            if (C22298e.m55183b()) {
                this.f57741z.setVisibility(0);
                this.f57741z.setOnClickListener(new C21267be(this));
            }
        } else if (this.f57739x == 3) {
            C26890h.m65011a("set_password_show", new C20856a().mo44776a("enter_from", "register").mo44776a("platform", "email").f56798a);
        } else if (this.f57739x == 4) {
            C26890h.m65011a("set_password_show", new C20856a().mo44776a("enter_from", "reset_password").mo44776a("platform", "email").f56798a);
        }
        this.f57731p.setOnClickListener(new C21268bf(this));
        this.f57730o.setOnFocusChangeListener(new C21269bg(this));
        this.f57730o.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(final Editable editable) {
                int i;
                C21259bc.this.f57737v.removeCallbacksAndMessages(null);
                C21259bc.this.f57737v.postDelayed(new Runnable() {
                    public final void run() {
                        if (editable.toString().length() >= 0 && editable.toString().length() < 8) {
                            C21259bc.this.f57733r.setEnabled(false);
                        } else if (editable.toString().length() > 20) {
                            C21259bc.this.f57734s.setVisibility(0);
                            C21259bc.this.f57735t.setText(C21259bc.this.getResources().getString(R.string.cbg));
                            C21259bc.this.f57732q.setBackgroundColor(C21259bc.this.getResources().getColor(R.color.xn));
                            C21259bc.this.f57733r.setEnabled(false);
                        } else if (TextUtils.isEmpty(editable.toString()) || C22041x.m54771a(editable.toString())) {
                            C21259bc.this.f57734s.setVisibility(8);
                            C21259bc.this.f57732q.setBackgroundColor(C21259bc.this.getResources().getColor(R.color.j1));
                            C21259bc.this.f57733r.setEnabled(true);
                        } else {
                            C21259bc.this.f57734s.setVisibility(0);
                            C21259bc.this.f57735t.setText(C21259bc.this.getResources().getString(R.string.cbd));
                            C21259bc.this.f57732q.setBackgroundColor(C21259bc.this.getResources().getColor(R.color.xn));
                            C21259bc.this.f57733r.setEnabled(false);
                        }
                    }
                }, 200);
                ImageView imageView = C21259bc.this.f57731p;
                if (!TextUtils.isEmpty(C21259bc.this.f57730o.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57733r.setOnClickListener(new C21270bh(this));
        if (this.f57739x == 2) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b07, viewGroup, false);
    }
}
