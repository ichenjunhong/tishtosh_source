package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13122u;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13142s;
import com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.C22043z;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21046b;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21092aa;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ah */
public class C21197ah extends C21168a implements OnClickListener, C21046b, C21109n {

    /* renamed from: o */
    public LoginButton f57586o;

    /* renamed from: p */
    public View f57587p;

    /* renamed from: q */
    public TextView f57588q;

    /* renamed from: r */
    public Handler f57589r;

    /* renamed from: s */
    public boolean f57590s;

    /* renamed from: t */
    public int f57591t = 1;

    /* renamed from: u */
    private EditText f57592u;

    /* renamed from: v */
    private TextView f57593v;

    /* renamed from: w */
    private String f57594w;

    /* renamed from: x */
    private C13011d f57595x;

    /* renamed from: b */
    public final boolean mo45081b() {
        return this.f57590s;
    }

    /* renamed from: a */
    public final void mo45160a() {
        this.f57586o.mo45160a();
    }

    /* renamed from: c */
    public final void mo45161c() {
        this.f57586o.mo45161c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo45356j() {
        mo45322a((View) this.f57592u);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57589r != null) {
            this.f57589r.removeCallbacksAndMessages(null);
            this.f57589r = null;
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57592u);
    }

    public void onStart() {
        super.onStart();
        this.f57592u.postDelayed(new C21201ai(this), 500);
    }

    /* renamed from: i */
    public final void mo45355i() {
        if (this.f57590s) {
            Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
            AgeGateResponse ageGateResponse = new AgeGateResponse(0, "", false, 0, 1);
            intent.putExtra("age_gate_response", ageGateResponse);
            intent.putExtra("enter_from", "from_create_account_password");
            startActivity(intent);
        }
        mo45324a(false);
        getActivity().finish();
        C22043z.m54779c(true, this.f57515m);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57594w = arguments.getString("username", "");
            this.f57590s = arguments.getBoolean("ftc_detect", false);
            this.f57591t = arguments.getInt("init_page", 1);
        }
        this.f57589r = new Handler();
        if (this.f57591t != 1 || this.f57590s) {
            C22282t.m55150e(true);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ay9) {
            mo45327e();
            return;
        }
        if (id == R.id.o9) {
            mo45324a(true);
            if (this.f57590s) {
                mo45328f().mo45044a(this.f57592u.getText().toString(), (C21092aa) new C21092aa(this, this.f57592u.getText().toString(), 0) {
                    /* renamed from: a */
                    public final void mo45147a(C12993e<C13163a> eVar) {
                        if (C21197ah.this.f57591t != 1 || C21197ah.this.f57590s) {
                            C22282t.m55150e(false);
                        }
                        if (C21197ah.this.isViewValid() && C21197ah.this.getActivity() != null) {
                            C21197ah.this.mo45355i();
                        }
                    }

                    /* renamed from: b */
                    public final void mo45148b(C12993e<C13163a> eVar) {
                        if (eVar.f34000c > 0) {
                            if (C21197ah.this.f57591t != 1 || C21197ah.this.f57590s) {
                                C22282t.m55150e(false);
                            }
                            if (C21197ah.this.isViewValid() && C21197ah.this.getActivity() != null) {
                                C21197ah.this.mo45355i();
                            }
                        } else if (C21197ah.this.isViewValid() && C21197ah.this.getActivity() != null) {
                            C21197ah.this.mo45324a(false);
                            C10691a.m21543b(C21197ah.this.getContext(), (int) R.string.ccn, 0).mo19066a();
                            C22043z.m54779c(false, C21197ah.this.f57515m);
                        }
                    }
                });
                return;
            }
            this.f57595x.mo24621a(this.f57594w, this.f57592u.getText().toString(), (C13142s) new C13142s() {
                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    super.onNeedSecureCaptcha((C12993e) bVar);
                    if (C21197ah.this.isViewValid()) {
                        C21197ah.this.mo45324a(false);
                    }
                }

                public final void onSuccess(C12993e<C13122u> eVar) {
                    if (C21197ah.this.isViewValid() && C21197ah.this.getActivity() != null && eVar.f34007h != null && ((C13122u) eVar.f34007h).f34340c != null) {
                        if (C21197ah.this.f57591t != 1 || C21197ah.this.f57590s) {
                            C22282t.m55150e(false);
                        }
                        C22043z.m54779c(true, C21197ah.this.f57515m);
                        C21197ah.this.mo45324a(false);
                        C21197ah.this.f57587p.setVisibility(8);
                        C21197ah.m53691a(((C13122u) eVar.f34007h).f34340c.f34481i, ((C13122u) eVar.f34007h).f34340c);
                        Bundle bundle = new Bundle(C21197ah.this.getArguments());
                        bundle.putString("platform", "account");
                        ((MusLoginActivity) C21197ah.this.getActivity()).mo45026a(bundle);
                    }
                }

                public final void onError(C12993e<C13122u> eVar, int i) {
                    if (C21197ah.this.isViewValid() && C21197ah.this.getContext() != null) {
                        C21197ah.this.mo45324a(false);
                        C22043z.m54779c(false, C21197ah.this.f57515m);
                        if (eVar.f34000c != 1105) {
                            C21197ah.this.f57587p.setVisibility(0);
                            C21197ah.this.f57588q.setText(eVar.f34001d);
                        }
                        C21197ah.this.mo45160a();
                    }
                }
            });
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57595x = C13081d.m26312a(getContext());
        this.f57592u = (EditText) view.findViewById(R.id.acc);
        this.f57586o = (LoginButton) view.findViewById(R.id.o9);
        this.f57586o.setLoginBackgroundRes(R.drawable.cgq);
        this.f57586o.setAutoMirrored(false);
        this.f57586o.setLoadingBackground(R.drawable.ch1);
        this.f57587p = view.findViewById(R.id.dvj);
        this.f57588q = (TextView) view.findViewById(R.id.dvi);
        this.f57508a = view.findViewById(R.id.ay9);
        this.f57593v = (TextView) view.findViewById(R.id.da5);
        if (this.f57590s) {
            this.f57508a.setVisibility(8);
        }
        this.f57593v.setText(R.string.c9j);
        this.f57508a.setOnClickListener(this);
        this.f57586o.setOnClickListener(this);
        this.f57592u.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21197ah.this.f57589r.removeCallbacksAndMessages(null);
                C21197ah.this.f57589r.postDelayed(new C21202aj(this, editable), 200);
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b01, viewGroup, false);
    }
}
