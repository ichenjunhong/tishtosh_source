package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C23860bm;
import com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.C22043z;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21046b;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.util.C22269k;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.util.C22287x;
import com.p683ss.android.ugc.aweme.account.util.C22288y;
import com.p683ss.android.ugc.aweme.account.utils.C22304j;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23725l;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.service.C36684f;
import com.ss.android.ugc.trill.R;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.af */
public class C21191af extends C21168a implements OnClickListener, C21046b, C21109n, C22269k {

    /* renamed from: B */
    private static final Pattern f57568B = Pattern.compile("^([\\u4e00-\\u9fa5\\w.]{1,19}[\\u4e00-\\u9fa5\\w])$");

    /* renamed from: A */
    private C22287x f57569A;

    /* renamed from: o */
    public EditText f57570o;

    /* renamed from: p */
    public LoginButton f57571p;

    /* renamed from: q */
    public View f57572q;

    /* renamed from: r */
    public TextView f57573r;

    /* renamed from: s */
    public boolean f57574s;

    /* renamed from: t */
    public boolean f57575t;

    /* renamed from: u */
    public int f57576u = 1;

    /* renamed from: v */
    private TextView f57577v;

    /* renamed from: w */
    private TextView f57578w;

    /* renamed from: x */
    private String f57579x;

    /* renamed from: y */
    private C21195a f57580y;

    /* renamed from: z */
    private boolean f57581z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.af$a */
    class C21195a implements C17824h<String> {
        private C21195a() {
        }

        public final void onFailure(Throwable th) {
            if (C21191af.this.isViewValid() && C21191af.this.getContext() != null) {
                C22043z.m54778b(false, C21191af.this.f57514l);
                C21191af.this.mo45324a(false);
                C10691a.m21543b(C21191af.this.getContext(), (int) R.string.ccn, 0).mo19066a();
            }
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            String str = (String) obj;
            C21191af.this.mo45324a(false);
            try {
                if (new JSONObject(str).optBoolean("valid")) {
                    C22043z.m54778b(true, C21191af.this.f57514l);
                    if (C21191af.this.f57576u != 1 || C21191af.this.f57574s) {
                        C22282t.m55148d(false);
                    }
                    C21191af.this.f57572q.setVisibility(8);
                    C21191af.this.mo45321a((Fragment) (C21168a) C22271m.m55124a(C21197ah.class, C21191af.this.getArguments()).mo46372a("enter_from", C21191af.this.f57514l).mo46372a("enter_method", C21191af.this.f57515m).mo46372a("username", C21191af.this.f57570o.getText().toString()).mo46371a("init_page", C21191af.this.f57576u).mo46370a(), false);
                    return;
                }
                C22043z.m54778b(false, C21191af.this.f57514l);
                C21191af.this.f57572q.setVisibility(0);
                C21191af.this.f57573r.setText(R.string.c9h);
            } catch (Exception unused) {
                C10691a.m21543b(C21191af.this.getContext(), (int) R.string.ccn, 0).mo19066a();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo45081b() {
        return true;
    }

    /* renamed from: a */
    public final void mo45160a() {
        this.f57571p.mo45160a();
    }

    /* renamed from: c */
    public final void mo45161c() {
        this.f57571p.mo45161c();
    }

    /* renamed from: j */
    private void m53715j() {
        if (this.f57576u != 1 || this.f57574s) {
            C22282t.m55148d(false);
        }
        if (getActivity() != null) {
            if (!this.f57575t) {
                mo45321a((Fragment) (C21168a) C22271m.m55124a(C21197ah.class, getArguments()).mo46372a("enter_from", this.f57514l).mo46372a("enter_method", this.f57515m).mo46372a("username", this.f57570o.getText().toString()).mo46373a("ftc_detect", true).mo46371a("init_page", this.f57576u).mo46370a(), false);
            } else if (this.f57574s) {
                Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
                AgeGateResponse ageGateResponse = new AgeGateResponse(0, "", true, 0, 1);
                intent.putExtra("age_gate_response", ageGateResponse);
                intent.putExtra("enter_from", "from_create_account_password");
                startActivity(intent);
                getActivity().finish();
            }
        }
    }

    /* renamed from: i */
    public final void mo45349i() {
        String obj = this.f57570o.getText().toString();
        if (C23725l.m58233a(obj) || obj.length() < 2 || obj.length() > 20) {
            this.f57572q.setVisibility(0);
            this.f57573r.setText(R.string.az6);
            mo45324a(false);
            C22043z.m54778b(false, this.f57514l);
        } else if (!f57568B.matcher(obj).find()) {
            this.f57572q.setVisibility(0);
            this.f57573r.setText(R.string.az6);
            mo45324a(false);
            C22043z.m54778b(false, this.f57514l);
        } else {
            this.f57572q.setVisibility(8);
            if (!this.f57574s) {
                mo45324a(true);
                mo45328f().mo45043a(obj, (C17824h<String>) this.f57580y);
            } else if (TextUtils.equals(this.f57579x, this.f57570o.getText().toString())) {
                this.f57572q.setVisibility(8);
                C22043z.m54778b(true, this.f57514l);
                mo45324a(false);
                m53715j();
            } else {
                mo45324a(true);
                C22304j jVar = new C22304j();
                jVar.f60069c = this.f57570o.getText().toString();
                this.f57569A.mo46383a(jVar.mo46385a());
            }
        }
    }

    /* renamed from: c */
    public final void mo45348c(boolean z) {
        if (z) {
            C22043z.m54778b(true, this.f57514l);
            if (this.f57576u != 1 || this.f57574s) {
                C22282t.m55148d(false);
            }
            C23826bi.m58451a(12, 1, (Object) "");
            mo45324a(false);
            this.f57572q.setVisibility(8);
            m53715j();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.o9) {
            if (!C21196ag.m53727a(getActivity())) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                return;
            }
            mo45324a(true);
            if (this.f57581z) {
                C23826bi.m58449a().getSetPasswordStatus(new C23860bm() {
                    /* renamed from: a */
                    public final void mo45352a(boolean z) {
                        C21191af.this.f57575t = z;
                        C21191af.this.mo45349i();
                    }

                    /* renamed from: a */
                    public final void mo45351a(String str) {
                        C21191af.this.mo45324a(false);
                        C10691a.m21543b(C21191af.this.getContext(), (int) R.string.ccn, 0).mo19066a();
                        C22043z.m54778b(false, C21191af.this.f57514l);
                    }
                });
                return;
            }
            mo45349i();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57580y = new C21195a();
        this.f57569A = new C22287x();
        this.f57569A.f60056a = this;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57574s = arguments.getBoolean("ftc_detect", false);
            this.f57576u = arguments.getInt("init_page", 1);
            this.f57581z = arguments.getBoolean("is_trans_login_user", false);
        }
        if (this.f57576u != 1 || this.f57574s) {
            C22282t.m55148d(true);
        }
    }

    /* renamed from: a */
    public final void mo45347a(String str, boolean z) {
        this.f57572q.setVisibility(0);
        this.f57573r.setText(str);
    }

    /* renamed from: a */
    public final void mo45346a(Exception exc, int i) {
        if (isViewValid() && this.f57569A != null) {
            mo45324a(false);
            C36684f fVar = (C36684f) C23826bi.m58450a(C36684f.class);
            if (fVar == null || !fVar.mo47875a(exc)) {
                C22043z.m54778b(false, this.f57514l);
                if (!(exc instanceof C23459a) || ((C23459a) exc).getErrorCode() != 2064) {
                    this.f57572q.setVisibility(8);
                    C10691a.m21543b(getContext(), (int) R.string.ccn, 0).mo19066a();
                } else {
                    this.f57572q.setVisibility(0);
                    this.f57573r.setText(R.string.c9h);
                }
            } else {
                fVar.mo47874a(getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        C21191af.this.mo45349i();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C22043z.m54778b(false, C21191af.this.f57514l);
                    }
                });
            }
            C32458a.m75148a((Throwable) exc);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57570o = (EditText) view.findViewById(R.id.acc);
        this.f57571p = (LoginButton) view.findViewById(R.id.o9);
        this.f57571p.setLoginBackgroundRes(R.drawable.cgq);
        this.f57571p.setAutoMirrored(false);
        this.f57571p.setLoadingBackground(R.drawable.ch1);
        this.f57572q = view.findViewById(R.id.dvj);
        this.f57573r = (TextView) view.findViewById(R.id.dvi);
        this.f57577v = (TextView) view.findViewById(R.id.da5);
        this.f57578w = (TextView) view.findViewById(R.id.d0m);
        this.f57571p.setOnClickListener(this);
        this.f57508a.setVisibility(8);
        if (this.f57574s) {
            String b = C23723j.m58219b(R.string.c_r);
            String b2 = C23723j.m58219b(R.string.c_s);
            SpannableString spannableString = new SpannableString(b);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.py)), b.length() - b2.length(), b.length(), 33);
            this.f57577v.setText(spannableString);
            this.f57508a.setVisibility(8);
            this.f57578w.setText(R.string.c_q);
            this.f57579x = C22288y.m55172a(C23826bi.m58468i());
            this.f57570o.setText(this.f57579x);
            this.f57571p.setEnabled(true);
        } else {
            this.f57577v.setText(R.string.c9f);
        }
        this.f57570o.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21191af.this.f57571p.setEnabled(!TextUtils.isEmpty(editable.toString()));
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b00, viewGroup, false);
    }
}
