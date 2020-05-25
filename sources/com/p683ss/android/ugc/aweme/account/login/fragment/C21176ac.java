package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p848d.C13019h;
import com.p683ss.android.ugc.aweme.account.login.C22041x;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21045a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ac */
public final class C21176ac extends C21168a implements C21045a {

    /* renamed from: y */
    private static final boolean f57535y = false;

    /* renamed from: A */
    private View f57536A;

    /* renamed from: B */
    private TextView f57537B;

    /* renamed from: C */
    private View f57538C;

    /* renamed from: D */
    private int f57539D;

    /* renamed from: E */
    private int f57540E;

    /* renamed from: F */
    private int f57541F;

    /* renamed from: o */
    public EditText f57542o;

    /* renamed from: p */
    public ImageView f57543p;

    /* renamed from: q */
    public EditText f57544q;

    /* renamed from: r */
    public ImageView f57545r;

    /* renamed from: s */
    public EditText f57546s;

    /* renamed from: t */
    public ImageView f57547t;

    /* renamed from: u */
    public LoginButton f57548u;

    /* renamed from: v */
    public View f57549v;

    /* renamed from: w */
    public TextView f57550w;

    /* renamed from: x */
    String f57551x = "";

    /* renamed from: z */
    private TextView f57552z;

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57542o);
    }

    public final void onStart() {
        super.onStart();
        this.f57542o.postDelayed(new Runnable() {
            public final void run() {
                C21176ac.this.mo45322a((View) C21176ac.this.f57542o);
            }
        }, 500);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: b */
    private void m53709b(String str) {
        mo45336c(true);
        this.f57550w.setText(str);
    }

    /* renamed from: a */
    public final void mo45080a(String str) {
        this.f57551x = str;
        if (!TextUtils.isEmpty(this.f57551x)) {
            this.f57548u.performClick();
        }
    }

    /* renamed from: c */
    public final void mo45336c(boolean z) {
        if (z) {
            this.f57549v.setVisibility(0);
        } else {
            this.f57549v.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45326b(boolean z) {
        if (this.f57541F == 0) {
            this.f57541F = (this.f57537B.getBottom() - this.f57508a.getBottom()) + this.f57539D;
        }
        if (this.f57540E == 0) {
            this.f57540E = this.f57537B.getTop() - this.f57508a.getBottom();
        }
        if (!z) {
            this.f57552z.animate().alpha(0.0f).setDuration(110).start();
            this.f57536A.animate().alpha(0.0f).setDuration(110).start();
            this.f57537B.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57538C.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57548u.getTop() - this.f57538C.getBottom() <= f57506j) {
            this.f57552z.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57536A.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57537B.animate().translationY((float) (-this.f57540E)).alpha(0.0f).setDuration(220).start();
            this.f57538C.animate().translationY((float) (-this.f57541F)).setDuration(220).start();
        }
    }

    /* renamed from: a */
    public final void mo45335a(C13019h hVar) {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        if (hVar != null) {
            int i = hVar.f34000c;
            if (hVar.f34003f != null) {
                jSONObject = hVar.f34003f.optJSONObject("data");
            } else {
                jSONObject = null;
            }
            if (i == 3 || i == 1009) {
                m53709b(getString(R.string.cbb));
            } else if (i == 1051) {
                m53709b(getString(R.string.cn_));
            } else if (i == 1056) {
                C10691a.m21546b(getContext(), hVar.f34001d, 0).mo19066a();
            } else if (i == 2002) {
                if (jSONObject != null) {
                    str = jSONObject.optString("shark_ticket");
                } else {
                    str = "";
                }
                String str5 = hVar.f34001d;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("mobile");
                } else {
                    str2 = "";
                }
                String obj = this.f57542o.getText().toString();
                String obj2 = this.f57544q.getText().toString();
                C21174ab abVar = new C21174ab();
                Bundle bundle = new Bundle();
                bundle.putString(C21174ab.f57469s, str);
                bundle.putString(C21174ab.f57470t, str5);
                bundle.putString(C21174ab.f57527y, obj);
                bundle.putString(C21174ab.f57528z, obj2);
                bundle.putString(C21174ab.f57471u, str2);
                abVar.setArguments(bundle);
                abVar.mo45323a((C21328n) getActivity());
                abVar.f57529A = this;
                mo45321a((Fragment) abVar, false);
            } else if (i != 2005) {
                if (TextUtils.isEmpty(hVar.f34001d)) {
                    str4 = getString(R.string.dn9);
                } else {
                    str4 = hVar.f34001d;
                }
                C10691a.m21546b(getContext(), str4, 0).mo19066a();
            } else {
                if (jSONObject != null) {
                    str3 = jSONObject.optString("platform");
                } else {
                    str3 = "";
                }
                String obj3 = this.f57542o.getText().toString();
                String obj4 = this.f57544q.getText().toString();
                C21224au auVar = new C21224au();
                Bundle bundle2 = new Bundle();
                bundle2.putString("platform", str3);
                bundle2.putString(C21224au.f57653t, obj3);
                bundle2.putString(C21224au.f57654u, obj4);
                auVar.setArguments(bundle2);
                auVar.f57655v = new C21190ae(this);
                mo45321a((Fragment) auVar, false);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57542o = (EditText) view.findViewById(R.id.aby);
        this.f57543p = (ImageView) view.findViewById(R.id.tz);
        this.f57544q = (EditText) view.findViewById(R.id.abx);
        this.f57545r = (ImageView) view.findViewById(R.id.ty);
        this.f57546s = (EditText) view.findViewById(R.id.ac7);
        this.f57547t = (ImageView) view.findViewById(R.id.u4);
        this.f57548u = (LoginButton) view.findViewById(R.id.nl);
        this.f57550w = (TextView) view.findViewById(R.id.dvo);
        this.f57549v = view.findViewById(R.id.dvp);
        this.f57552z = (TextView) view.findViewById(R.id.d3l);
        this.f57536A = view.findViewById(R.id.d3m);
        this.f57537B = (TextView) view.findViewById(R.id.dhb);
        this.f57538C = view.findViewById(R.id.zr);
        this.f57548u.setLoadingBackground(R.drawable.ch1);
        this.f57548u.setLoginBackgroundRes(R.drawable.cgq);
        this.f57548u.setAutoMirrored(false);
        this.f57543p.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21176ac.this.f57542o.setText("");
                C21176ac.this.f57543p.setVisibility(8);
            }
        });
        this.f57545r.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21176ac.this.f57544q.setText("");
                C21176ac.this.f57545r.setVisibility(8);
            }
        });
        this.f57547t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21176ac.this.f57546s.setText("");
                C21176ac.this.f57547t.setVisibility(8);
            }
        });
        this.f57542o.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = C21176ac.this.f57543p;
                if (!z || TextUtils.isEmpty(C21176ac.this.f57542o.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57542o.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                int i;
                super.afterTextChanged(editable);
                ImageView imageView = C21176ac.this.f57543p;
                if (!TextUtils.isEmpty(C21176ac.this.f57542o.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(C21176ac.this.f57542o.getText()) && TextUtils.isEmpty(C21176ac.this.f57544q.getText()) && TextUtils.isEmpty(C21176ac.this.f57546s.getText())) {
                    C21176ac.this.f57549v.setVisibility(8);
                }
            }
        });
        this.f57544q.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = C21176ac.this.f57545r;
                if (!z || TextUtils.isEmpty(C21176ac.this.f57544q.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57544q.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(final Editable editable) {
                int i;
                super.afterTextChanged(editable);
                C21176ac.this.f57544q.removeCallbacks(null);
                C21176ac.this.f57544q.postDelayed(new Runnable() {
                    public final void run() {
                        if (editable.toString().length() > 0 && editable.toString().length() <= 5) {
                            C21176ac.this.f57548u.setEnabled(false);
                        } else if (editable.toString().length() > 20) {
                            C21176ac.this.mo45336c(true);
                            C21176ac.this.f57550w.setText(C21176ac.this.getResources().getString(R.string.cbg));
                            C21176ac.this.f57548u.setEnabled(false);
                        } else if (TextUtils.isEmpty(editable.toString()) || C22041x.m54771a(editable.toString())) {
                            C21176ac.this.mo45336c(false);
                            C21176ac.this.f57548u.setEnabled(true);
                        } else {
                            C21176ac.this.mo45336c(true);
                            C21176ac.this.f57550w.setText(C21176ac.this.getResources().getString(R.string.cbd));
                            C21176ac.this.f57548u.setEnabled(false);
                        }
                    }
                }, 200);
                ImageView imageView = C21176ac.this.f57545r;
                if (!TextUtils.isEmpty(C21176ac.this.f57544q.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(C21176ac.this.f57542o.getText()) && TextUtils.isEmpty(C21176ac.this.f57544q.getText()) && TextUtils.isEmpty(C21176ac.this.f57546s.getText())) {
                    C21176ac.this.f57549v.setVisibility(8);
                }
            }
        });
        this.f57546s.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                ImageView imageView = C21176ac.this.f57547t;
                if (!z || TextUtils.isEmpty(C21176ac.this.f57546s.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57546s.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                int i;
                super.afterTextChanged(editable);
                ImageView imageView = C21176ac.this.f57547t;
                if (!TextUtils.isEmpty(C21176ac.this.f57546s.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(C21176ac.this.f57542o.getText()) && TextUtils.isEmpty(C21176ac.this.f57544q.getText()) && TextUtils.isEmpty(C21176ac.this.f57546s.getText())) {
                    C21176ac.this.f57549v.setVisibility(8);
                }
            }
        });
        this.f57548u.setOnClickListener(new C21189ad(this));
        this.f57539D = (int) C9432q.m18687b(getContext(), 35.0f);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.azz, viewGroup, false);
    }
}
