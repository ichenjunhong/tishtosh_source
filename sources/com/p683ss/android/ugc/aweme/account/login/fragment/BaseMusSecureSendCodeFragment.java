package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21052h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountDownView;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22044a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22049e;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment */
public abstract class BaseMusSecureSendCodeFragment extends C21168a {

    /* renamed from: s */
    public static String f57469s = "sendcode_ticket";

    /* renamed from: t */
    public static String f57470t = "sendcode_description";

    /* renamed from: u */
    public static String f57471u = "mobile";
    @BindView(2131492944)
    View loginViewText;
    @BindView(2131492936)
    LoginButton mBtnLogin;
    @BindView(2131492943)
    View mBtnLoginPhonePassword;
    @BindView(2131493319)
    MusCountDownView mCountDownView;
    @BindView(2131493116)
    EditText mEdCode;
    @BindView(2131493108)
    View mEdCodeUnderline;
    @BindView(2131493157)
    TextView mGetVoiceCode;
    @BindView(2131493597)
    TextView mTvHint;
    @BindView(2131493367)
    TextView mTvPhoneNumber;
    @BindView(2131493670)
    TextView mTvWrongCode;
    @BindView(2131493671)
    View mWrongCodeContainer;

    /* renamed from: o */
    protected C21120y f57472o;

    /* renamed from: p */
    protected boolean f57473p = true;

    /* renamed from: q */
    protected boolean f57474q;

    /* renamed from: r */
    protected String f57475r;
    @BindView(2131493557)
    TextView tipTitle;

    /* renamed from: v */
    protected String f57476v;

    /* renamed from: w */
    protected C21159a f57477w;

    /* renamed from: x */
    protected C13011d f57478x;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment$a */
    class C21159a implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            int i;
            if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                BaseMusSecureSendCodeFragment.this.mo45159d();
                MusLoginManager f = BaseMusSecureSendCodeFragment.this.mo45328f();
                if (BaseMusSecureSendCodeFragment.this.f57474q) {
                    i = C22165u.f59761a;
                } else {
                    i = C22165u.f59782v;
                }
                f.mo45041a(i, (C13136m) new C13136m() {
                    public final void onSuccess(C12993e<C13117p> eVar) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C21159a.this.mo45312a(eVar);
                        }
                    }

                    public final void onError(C12993e<C13117p> eVar, int i) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C21159a.this.mo45312a(eVar);
                        }
                    }
                });
            }
        }

        private C21159a() {
        }

        /* renamed from: a */
        public final void mo45312a(C12993e<C13117p> eVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            int i;
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
            if (BaseMusSecureSendCodeFragment.this.f57474q) {
                i = C22165u.f59761a;
            } else {
                i = C22165u.f59782v;
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    BaseMusSecureSendCodeFragment.this.mo45158a(optString, null, i, BaseMusSecureSendCodeFragment.this.f57477w);
                }
            }
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            int i2;
            if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                BaseMusSecureSendCodeFragment.this.mo45159d();
                BaseMusSecureSendCodeFragment.this.mCountDownView.mo45751a(0);
                if (BaseMusSecureSendCodeFragment.this.f57474q) {
                    i2 = C22165u.f59761a;
                } else {
                    i2 = C22165u.f59782v;
                }
                boolean a = C22299f.m55184a();
                BaseMusSecureSendCodeFragment.this.f57478x.mo24611a(BaseMusSecureSendCodeFragment.this.f57476v, str, i2, 0, BaseMusSecureSendCodeFragment.this.f57475r, 1, a ? 1 : 0, (C13139p) new C21052h(BaseMusSecureSendCodeFragment.this) {
                    /* renamed from: a */
                    public final void mo45100a() {
                        C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                    }

                    /* renamed from: c */
                    public final void onNeedSecureCaptcha(C12993e<C13120s> eVar) {
                        super.onNeedSecureCaptcha(eVar);
                        C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                    }

                    /* renamed from: a */
                    public final void mo45103a(C12993e<C13120s> eVar) {
                        C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                        C10691a.m21545b(BaseMusSecureSendCodeFragment.this.getContext(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }

                    /* renamed from: a */
                    public final void mo45101a(int i) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getActivity() != null) {
                            C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            BaseMusSecureSendCodeFragment.this.mo45305a(BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.ca7));
                        }
                    }

                    /* renamed from: b */
                    public final void mo45170b(C12993e<C13120s> eVar) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            C10691a.m21543b(BaseMusSecureSendCodeFragment.this.getContext(), (int) R.string.ccn, 0).mo19066a();
                        }
                    }

                    /* renamed from: b */
                    public final void mo45105b(int i) {
                        super.mo45105b(i);
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", BaseMusSecureSendCodeFragment.this.f57515m).mo44776a("enter_type", BaseMusSecureSendCodeFragment.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                            C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                        }
                    }

                    /* renamed from: a */
                    public final void mo45102a(int i, String str) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C22308a.m55205a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = BaseMusSecureSendCodeFragment.this;
                            if (TextUtils.isEmpty(str)) {
                                str = BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.coj);
                            }
                            baseMusSecureSendCodeFragment.mo45305a(str);
                        }
                    }

                    /* renamed from: a */
                    public final void mo45104a(String str, String str2) {
                        int i;
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            if (BaseMusSecureSendCodeFragment.this.f57474q) {
                                i = C22165u.f59761a;
                            } else {
                                i = C22165u.f59782v;
                            }
                            BaseMusSecureSendCodeFragment.this.mo45158a(str, str2, i, BaseMusSecureSendCodeFragment.this.f57477w);
                        }
                    }
                });
                C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "resend").mo44774a("send_reason", i2).mo44776a("enter_method", BaseMusSecureSendCodeFragment.this.f57515m).mo44776a("enter_from", BaseMusSecureSendCodeFragment.this.f57514l).f56798a);
                C22049e.m54782a(BaseMusSecureSendCodeFragment.this.f57476v, new C22044a() {
                    /* renamed from: a */
                    public final void mo45313a(boolean z) {
                        if (BaseMusSecureSendCodeFragment.this.mCountDownView != null) {
                            BaseMusSecureSendCodeFragment.this.mCountDownView.setVoiceCodeEnabled(z);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45304a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo45306b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo45308i();

    /* renamed from: j */
    private void m53669j() {
        C26890h.m65011a("auto_fill_sms_verification", new C20856a().mo44776a("enter_method", this.f57515m).f56798a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo45307c(String str) {
        this.mEdCode.setText(str);
        m53669j();
    }

    /* renamed from: a */
    public final void mo45305a(String str) {
        C1161a aVar = new C1161a(getContext(), R.style.s8);
        aVar.mo3764a((CharSequence) "").mo3770b((CharSequence) str).mo3759a((int) R.string.ah2, (OnClickListener) null);
        try {
            aVar.mo3772b().show();
        } catch (Exception unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57475r = arguments.getString(f57469s);
            this.f57476v = arguments.getString(f57471u);
        }
        this.f57478x = C13081d.m26312a(getContext());
        this.f57477w = new C21159a();
        this.f57472o = new C21120y(this) {
            public final void onSuccess(C12993e<C13120s> eVar) {
            }

            /* renamed from: b */
            public final void mo45170b(C12993e<C13120s> eVar) {
                String str;
                if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null && eVar != null && eVar.f34000c > 0) {
                    if (eVar.f34000c == 1003) {
                        BaseMusSecureSendCodeFragment.this.mo45305a(BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.ca7));
                    } else if (eVar.f34000c == 1001) {
                        BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = BaseMusSecureSendCodeFragment.this;
                        if (TextUtils.isEmpty(eVar.f34001d)) {
                            str = BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.coj);
                        } else {
                            str = eVar.f34001d;
                        }
                        baseMusSecureSendCodeFragment.mo45305a(str);
                    } else if (eVar.f34000c != 1105) {
                        C10691a.m21537a(BaseMusSecureSendCodeFragment.this.getContext(), eVar.f34001d).mo19066a();
                    }
                }
            }
        };
    }

    @OnClick({2131493157, 2131492936})
    public void onClick(View view) {
        if (view.getId() != R.id.aki) {
            if (view.getId() == R.id.o9) {
                mo45306b(this.mEdCode.getText().toString());
            }
        } else if (this.f57473p || this.mCountDownView.getRemainTick() <= 0) {
            mo45308i();
            this.f57473p = false;
        } else {
            C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.fd1)).mo19066a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b02, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mBtnLogin.setLoginBackgroundRes(R.drawable.cgr);
        this.mBtnLogin.setLoadingBackground(R.drawable.ch1);
        this.mBtnLoginPhonePassword.setVisibility(8);
        String string = getString(R.string.x6);
        String string2 = getString(R.string.b8j);
        Factory instance = Factory.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ");
        sb.append(string2);
        Spannable newSpannable = instance.newSpannable(sb.toString());
        newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.j6)), string.length(), newSpannable.length(), 33);
        this.mGetVoiceCode.setText(newSpannable);
        this.mCountDownView.setTargetView(this.mGetVoiceCode);
        this.mCountDownView.getTimerText().setVisibility(8);
        this.mCountDownView.getResendCodeButton().setVisibility(0);
        this.mCountDownView.getResendCodeButton().setText(getString(R.string.dd3));
        if (this.f57511d != null) {
            this.mCountDownView.setTickListener(this.f57511d);
        }
        this.mCountDownView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                BaseMusSecureSendCodeFragment.this.mo45304a();
            }
        });
        this.mEdCode.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                boolean z;
                LoginButton loginButton = BaseMusSecureSendCodeFragment.this.mBtnLogin;
                if (TextUtils.isEmpty(editable.toString()) || editable.toString().length() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                loginButton.setEnabled(z);
                if (TextUtils.isEmpty(editable.toString())) {
                    BaseMusSecureSendCodeFragment.this.mWrongCodeContainer.setVisibility(8);
                    BaseMusSecureSendCodeFragment.this.mEdCodeUnderline.setBackgroundColor(BaseMusSecureSendCodeFragment.this.getResources().getColor(R.color.j1));
                }
            }
        });
        C0198r rVar = null;
        if (getActivity() instanceof MusLoginActivity) {
            rVar = ((MusLoginActivity) getActivity()).mo45037e();
        }
        if (rVar != null) {
            if (!TextUtils.isEmpty((CharSequence) rVar.getValue())) {
                this.mEdCode.setText((CharSequence) rVar.getValue());
                m53669j();
                rVar.setValue("");
            }
            rVar.observe(this, new C21327m(this));
        }
        return inflate;
    }
}
