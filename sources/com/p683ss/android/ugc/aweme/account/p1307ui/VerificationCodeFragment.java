package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.p038f.C0777a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import butterknife.OnClick;
import com.C2240a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13102a;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p862a.C13105d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13124a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13126c;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13127d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21095ad;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21098c;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21101f;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21105j;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p683ss.android.ugc.aweme.account.model.C22054b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22091c;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22262d;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment */
public class VerificationCodeFragment extends BaseAccountFragment implements C9382a, C22241h {

    /* renamed from: a */
    public static final boolean f59919a = false;

    /* renamed from: A */
    boolean f59920A;

    /* renamed from: B */
    boolean f59921B;

    /* renamed from: C */
    public long f59922C = -1;

    /* renamed from: D */
    public C13011d f59923D;

    /* renamed from: E */
    public C21612a f59924E = new C21612a() {
        /* renamed from: a */
        public final void mo45150a() {
            VerificationCodeFragment.this.mo45159d();
            VerificationCodeFragment.this.f59923D.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
                public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                }

                public final void onSuccess(C12993e<C13117p> eVar) {
                    if (eVar != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                        VerificationCodeFragment.this.mo45158a(((C13117p) eVar.f34007h).f34303a, null, ((C13117p) eVar.f34007h).f34285r, VerificationCodeFragment.this.f59924E);
                    }
                }

                public final void onError(C12993e<C13117p> eVar, int i) {
                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f34001d)) {
                        VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                    }
                }
            });
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            VerificationCodeFragment.this.f59923D.mo24607a(VerificationCodeFragment.this.mEditText.getText().toString(), C22165u.f59779s, true, 0, VerificationCodeFragment.this.f59937w, VerificationCodeFragment.this.f59925F);
        }
    };

    /* renamed from: F */
    public C13143t f59925F = new C13143t() {
        public final /* synthetic */ void onSuccess(C12990b bVar) {
            C12996h hVar = (C12996h) bVar;
            if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("ticket", hVar.f34021h);
                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                VerificationCodeFragment.this.getActivity().finish();
            }
        }

        public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
            C12996h hVar = (C12996h) bVar;
            if (!TextUtils.isEmpty(str)) {
                VerificationCodeFragment.this.mo45158a(str, hVar.f34001d, C22165u.f59779s, VerificationCodeFragment.this.f59924E);
            }
        }

        public final /* synthetic */ void onError(C12990b bVar, int i) {
            C12996h hVar = (C12996h) bVar;
            if (VerificationCodeFragment.this.isViewValid()) {
                C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                VerificationCodeFragment.this.backBtn.setEnabled(true);
                if (C22262d.f60036a.contains(Integer.valueOf(hVar.f34000c))) {
                    Intent intent = new Intent();
                    intent.putExtra("error_code", hVar.f34000c);
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                } else if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f34001d)) {
                    VerificationCodeFragment.this.mo46341a(hVar.f34000c, hVar.f34001d);
                }
            }
        }
    };

    /* renamed from: G */
    private String f59926G;

    /* renamed from: H */
    private String f59927H;

    /* renamed from: I */
    private String f59928I;

    /* renamed from: J */
    private int f59929J;

    /* renamed from: K */
    private C9381g f59930K;

    /* renamed from: q */
    public boolean f59931q = true;

    /* renamed from: r */
    public int f59932r = 60;

    /* renamed from: s */
    protected int f59933s;

    /* renamed from: t */
    protected String f59934t;

    /* renamed from: u */
    public String f59935u;

    /* renamed from: v */
    public String f59936v;

    /* renamed from: w */
    public String f59937w;

    /* renamed from: x */
    public int f59938x;

    /* renamed from: y */
    boolean f59939y;

    /* renamed from: z */
    public String f59940z;

    /* renamed from: G */
    private String m55044G() {
        return this.f59934t;
    }

    /* renamed from: A */
    public final void mo46340A() {
        C23826bi.m58454a((Handler) this.f59930K, false);
    }

    /* renamed from: i */
    public final long mo45361i() {
        return System.currentTimeMillis() - this.f59922C;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f59931q = false;
    }

    /* renamed from: F */
    private void m55043F() {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                while (VerificationCodeFragment.this.f59931q) {
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (VerificationCodeFragment.this.f59932r < 0) {
                                VerificationCodeFragment.this.mo46346y();
                            } else if (VerificationCodeFragment.this.mTxtTimer != null) {
                                TextView textView = VerificationCodeFragment.this.mTxtTimer;
                                Resources resources = VerificationCodeFragment.this.getContext().getResources();
                                VerificationCodeFragment verificationCodeFragment = VerificationCodeFragment.this;
                                int i = verificationCodeFragment.f59932r;
                                verificationCodeFragment.f59932r = i - 1;
                                textView.setText(resources.getString(R.string.d83, new Object[]{Integer.valueOf(i)}));
                            }
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    /* renamed from: H */
    private String m55045H() {
        return this.mEditText.getText().toString();
    }

    public void onResume() {
        super.onResume();
        if (this.f59933s == 9) {
            this.f59922C = System.currentTimeMillis();
        }
    }

    /* renamed from: z */
    public final void mo46347z() {
        C23826bi.m58453a(this.f59929J, this.f59940z, this.f59940z, 0, new C20840g() {
            public final void onResult(int i, int i2, Object obj) {
                if (i == 14 && i2 == 1) {
                    User i3 = C23826bi.m58468i();
                    if (i3 == null || !i3.isSecret()) {
                        if (VerificationCodeFragment.this.isViewValid()) {
                            KeyboardUtils.m58184c(VerificationCodeFragment.this.backBtn);
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            VerificationCodeFragment.this.mo46346y();
                            VerificationCodeFragment.this.mo46250s();
                        }
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                        C23826bi.m58469j();
                        C23826bi.m58451a(7, 1, (Object) null);
                        C26890h.m65011a("switch_to_pro_account_success", C20856a.m53173a().mo44776a("classes", VerificationCodeFragment.this.f59940z).f56798a);
                        return;
                    }
                    VerificationCodeFragment.this.mo46340A();
                } else {
                    if (VerificationCodeFragment.this.isViewValid()) {
                        KeyboardUtils.m58184c(VerificationCodeFragment.this.backBtn);
                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                        VerificationCodeFragment.this.mo46346y();
                        VerificationCodeFragment.this.mo46250s();
                    }
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        C10691a.m21542b((Context) VerificationCodeFragment.this.getActivity(), (int) R.string.cg2).mo19066a();
                    }
                }
            }
        });
    }

    /* renamed from: E */
    private void m55042E() {
        C26890h.m65011a("auto_fill_sms_verification", new C20856a().mo44776a("enter_method", this.f58455e).f56798a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo46254w() {
        if ((this.f59933s != 5 || this.f59939y) && this.f59933s != 8 && (this.f59933s != 9 || this.f59939y)) {
            return 0;
        }
        return 3;
    }

    /* renamed from: y */
    public final void mo46346y() {
        this.f59931q = false;
        if (this.mTxtTimer != null) {
            this.mTxtTimer.setText(getString(R.string.d7e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo46253v() {
        if ((this.f59933s == 5 || this.f59933s == 9) && !this.f59939y) {
            if (this.mEditText.getText().length() != 4 || this.mPasswordEt == null || TextUtils.isEmpty(this.mPasswordEt.getText())) {
                return false;
            }
            return true;
        } else if (this.mEditText.getText().length() == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: x */
    public final void mo46345x() {
        this.f59923D.mo24642b(this.f59934t, (String) null, this.f59938x, (C13139p) new C21095ad(this) {
            /* renamed from: a */
            public final void mo45149a(C12993e<C13120s> eVar) {
            }

            public final void onSuccess(C12993e<C13120s> eVar) {
                super.onSuccess(eVar);
                if (VerificationCodeFragment.this.getActivity() != null) {
                    C11105a a = C22284v.m55156a(VerificationCodeFragment.this.getActivity());
                    a.mo20135a((int) R.string.cob).mo20144b((int) R.string.coc).mo20145b((int) R.string.bdf, (OnClickListener) null).mo20141a(false);
                    C47700ay.m103235a(a.mo20143a());
                }
            }
        });
        C26890h.m65011a("send_voice_verification_code", new C20856a().mo44776a("send_reason", String.valueOf(this.f59938x)).mo44776a("send_method", "anti_spam").f56798a);
    }

    /* renamed from: C */
    private void m55040C() {
        if (!TextUtils.isEmpty(this.f59934t)) {
            int indexOf = getString(R.string.f7e).indexOf(37);
            if (indexOf != -1) {
                SpannableString spannableString = new SpannableString(C2240a.m6772a(getString(R.string.f7e), new Object[]{this.f59934t}));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.f59934t.length() + indexOf, 17);
                this.mTxtHint.setText(spannableString);
            }
        }
    }

    /* renamed from: D */
    private void m55041D() {
        if (!TextUtils.isEmpty(this.f59934t)) {
            String a = C21134a.m53620a(this.f59934t);
            String a2 = C2240a.m6772a(getString(R.string.s1), new Object[]{a});
            int indexOf = a2.indexOf(a);
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.f59934t.length() + indexOf, 17);
            this.mTxtHint.setText(spannableString);
        }
    }

    @OnClick({2131493640})
    public void reSendCode() {
        if (this.f59932r < 0) {
            int i = 0;
            if (this.f59933s == 1) {
                i = C22165u.f59773m;
            } else if (this.f59933s == 3) {
                i = C22165u.f59785y;
            } else if (this.f59933s == 4) {
                i = C22165u.f59777q;
            } else if (this.f59933s == 5 || this.f59933s == 9) {
                i = C22165u.f59768h;
            } else if (this.f59933s == 6) {
                i = C22165u.f59779s;
            } else if (this.f59933s == 7) {
                i = C22165u.f59779s;
            } else if (this.f59933s == 8) {
                i = C22165u.f59781u;
            }
            this.f59938x = i;
            if (this.f59933s == 9) {
                C26890h.onEventV3("resend_code_phone");
            }
            this.f59923D.mo24612a(this.f59934t, "", this.f59938x, 0, this.f59926G, 1, 0, this.f59937w, this.f59928I, new C21120y(this) {
                public final void onSuccess(C12993e<C13120s> eVar) {
                    super.onSuccess(eVar);
                    C22097f.m54898a(0, VerificationCodeFragment.this.f59938x, 0, "");
                }

                /* renamed from: b */
                public final void mo45170b(C12993e<C13120s> eVar) {
                    C22097f.m54898a(1, VerificationCodeFragment.this.f59938x, eVar.f34000c, eVar.f34001d);
                    if (C22262d.f60036a.contains(Integer.valueOf(eVar.f34000c))) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", eVar.f34000c);
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().setResult(0, intent);
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                    } else if (eVar.f34000c == 2015) {
                        VerificationCodeFragment.this.mo46345x();
                    } else {
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f34001d)) {
                            VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                        }
                    }
                }
            });
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "user_click").mo44774a("send_reason", this.f59938x).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
            this.f59932r = 60;
            this.f59931q = true;
            m55043F();
            C26890h.m65005a((Context) getActivity(), "resend_click", "verification_code", C23826bi.m58463d(), 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo46252u() {
        this.backBtn.setEnabled(false);
        if (this.f59933s != 9 || !this.f59920A) {
            if (this.f59933s == 1) {
                this.f59923D.mo24609a(this.f59936v, (C13001b) new C13001b() {
                    public final /* synthetic */ void onSuccess(C12990b bVar) {
                        C13013b bVar2 = (C13013b) bVar;
                        if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null) {
                            VerificationCodeFragment.this.f59923D.mo24627a(VerificationCodeFragment.this.mEditText.getText().toString(), VerificationCodeFragment.this.f59936v, "", (C13127d) new C21105j(VerificationCodeFragment.this) {
                                /* renamed from: a */
                                public final void mo45157a(C12993e<C13105d> eVar) {
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                                        if (!TextUtils.isEmpty(eVar.f34001d)) {
                                            VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                                        }
                                    }
                                    C26890h.m65005a((Context) C23826bi.m58460b(), "toast_show", "psd_error", C23826bi.m58463d(), 0);
                                }

                                public final void onSuccess(C12993e<C13105d> eVar) {
                                    if (VerificationCodeFragment.this.isViewValid() && eVar.f34007h != null) {
                                        C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                                        C10691a.m21533a((Context) C23826bi.m58460b(), (int) R.string.a08).mo19066a();
                                        C23826bi.m58451a(8, 1, (Object) ((C13105d) eVar.f34007h).f34247b);
                                        VerificationCodeFragment.this.getActivity().setResult(-1);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                }
                            });
                        }
                    }

                    public final /* synthetic */ void onError(C12990b bVar, int i) {
                        C13013b bVar2 = (C13013b) bVar;
                        if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(bVar2.f34001d)) {
                            VerificationCodeFragment.this.mo46341a(bVar2.f34000c, bVar2.f34001d);
                        }
                    }
                });
            } else if (this.f59933s == 3) {
                C22308a.m55207b(this.mBtnLogin);
                this.f59923D.mo24607a(this.mEditText.getText().toString(), C22165u.f59785y, true, 1, "", (C13143t) new C13143t() {
                    public final /* synthetic */ void onSuccess(C12990b bVar) {
                        C12996h hVar = (C12996h) bVar;
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.mo46346y();
                        }
                        ((BaseAccountActivity) VerificationCodeFragment.this.getActivity()).mo46248a(C22240g.m55094a(C47661ab.m103163a().mo94969a("type", 1).mo94972a("ticket", hVar.f34021h).mo94972a("enter_from", VerificationCodeFragment.this.f59935u).f120139a));
                    }

                    public final /* synthetic */ void onError(C12990b bVar, int i) {
                        C12996h hVar = (C12996h) bVar;
                        C26890h.m65005a((Context) C23826bi.m58460b(), "toast_show", "psd_error", C23826bi.m58463d(), 0);
                        if (VerificationCodeFragment.this.mBtnLogin != null) {
                            C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                        }
                        if (VerificationCodeFragment.this.backBtn != null) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                        }
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f34001d)) {
                            VerificationCodeFragment.this.mo46341a(hVar.f34000c, hVar.f34001d);
                        }
                    }
                });
            } else if (this.f59933s == 4) {
                C22308a.m55207b(this.mBtnLogin);
                C0777a aVar = new C0777a();
                aVar.put("unusable_mobile_ticket", this.f59928I);
                this.f59923D.mo24638a(this.f59934t, this.mEditText.getText().toString(), "", this.f59926G, (Map) aVar, (C13126c) new C13126c() {
                    public final void onSuccess(C12993e<C13104c> eVar) {
                        C22091c.m54872b(0, "changePhone", 0, "");
                        User i = C23826bi.m58468i();
                        if (i != null) {
                            try {
                                JSONObject jSONObject = ((C13104c) eVar.f34007h).f34279l;
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("mobile");
                                    i.setPhoneBinded(true);
                                    i.setBindPhone(optString);
                                    IAccountUserService a = C23826bi.m58449a();
                                    new C18493a();
                                    a.updateUserInfo(C18493a.m44735b(jSONObject));
                                    C23826bi.m58451a(7, 1, (Object) new C27983t(optString, optJSONObject.toString()));
                                    C10691a.m21533a(VerificationCodeFragment.this.getActivity().getApplicationContext(), (int) R.string.c79).mo19066a();
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.mo46346y();
                            C10691a.m21533a(VerificationCodeFragment.this.getActivity().getApplicationContext(), (int) R.string.c79).mo19066a();
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                        if (C23826bi.m58471l().getVerificationService().isDangerZone()) {
                            C23826bi.m58471l().getVerificationService().showRebindView(VerificationCodeFragment.this.getActivity(), "phone_bundling");
                        }
                    }

                    public final void onError(C12993e<C13104c> eVar, int i) {
                        String str;
                        JSONObject jSONObject = ((C13104c) eVar.f34007h).f34279l;
                        if (jSONObject != null) {
                            String optString = jSONObject.optJSONObject("data").optString("description");
                            C22091c.m54872b(1, "changePhone", i, optString);
                            if (VerificationCodeFragment.this.isViewValid()) {
                                C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                                VerificationCodeFragment.this.backBtn.setEnabled(true);
                                if ((i == 2003 || i == 2004) && !TextUtils.isEmpty(optString)) {
                                    VerificationCodeFragment.this.mo46342d(optString);
                                } else if (i == 2027 || i == 2028) {
                                    if (TextUtils.isEmpty(optString)) {
                                        str = VerificationCodeFragment.this.getString(R.string.c2p);
                                    } else {
                                        str = optString;
                                    }
                                    C10691a.m21545b(VerificationCodeFragment.this.getContext(), str).mo19066a();
                                }
                                VerificationCodeFragment.this.mo46341a(i, optString);
                            }
                            C26890h.m65005a((Context) C23826bi.m58460b(), "toast_show", "psd_error", C23826bi.m58463d(), 0);
                        }
                    }
                });
            } else {
                if (this.f59933s == 5 || this.f59933s == 9) {
                    if (this.f59939y || !TextUtils.isEmpty(this.mPasswordEt.getText())) {
                        if (this.f59933s == 9) {
                            KeyboardUtils.m58184c(this.mEditText);
                        }
                        final String a = C22262d.m55108a(this.f59935u);
                        C26890h.m65011a("phone_bundling_submit", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(a)).f56798a);
                        mo45827r();
                        String trim = this.mPasswordEt.getText().toString().trim();
                        if (!this.f59939y) {
                            this.f59923D.mo24609a(trim, (C13001b) new C13001b() {
                                public final /* synthetic */ void onSuccess(C12990b bVar) {
                                    C13013b bVar2 = (C13013b) bVar;
                                    if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null && !TextUtils.isEmpty(VerificationCodeFragment.this.mEditText.getText())) {
                                        VerificationCodeFragment.this.mo45865c(a);
                                    }
                                }

                                public final /* synthetic */ void onError(C12990b bVar, int i) {
                                    C13013b bVar2 = (C13013b) bVar;
                                    C22091c.m54871a(1, "checkPWD", bVar2.f34000c, bVar2.f34001d);
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        C26890h.m65011a("phone_bundling_success", new C20856a().mo44776a("enter_from", "log_in").mo44774a("status", 0).mo44774a("error_code", bVar2.f34000c).mo44776a("platform", C21021e.m53410a(a)).f56798a);
                                        VerificationCodeFragment.this.mo46250s();
                                        if (!TextUtils.isEmpty(bVar2.f34001d)) {
                                            VerificationCodeFragment.this.mo46341a(bVar2.f34000c, bVar2.f34001d);
                                        }
                                    }
                                }
                            });
                        } else {
                            this.f59923D.mo24623a(m55044G(), m55045H(), "", 0, (C13125b) new C21101f(this) {
                                public final void onSuccess(C12993e<C13103b> eVar) {
                                    String str;
                                    C22091c.m54871a(0, "bindPhone", 0, "");
                                    VerificationCodeFragment.this.f59920A = true;
                                    User i = C23826bi.m58468i();
                                    if (i != null) {
                                        C18494a aVar = (C18494a) ((C13103b) eVar.f34007h).f34239f.f34475c.get("mobile");
                                        if (aVar != null) {
                                            str = aVar.f50951e;
                                        } else {
                                            str = "";
                                        }
                                        i.setPhoneBinded(true);
                                        i.setBindPhone(str);
                                        C23826bi.m58449a().updateUserInfo(((C13103b) eVar.f34007h).f34239f);
                                        if (VerificationCodeFragment.this.f59933s == 9) {
                                            VerificationCodeFragment.this.mo46347z();
                                        } else {
                                            C23826bi.m58451a(7, 1, (Object) new C27983t(str, ((C13103b) eVar.f34007h).f34239f.f34481i.toString()));
                                        }
                                    }
                                    if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.f59933s != 9) {
                                        KeyboardUtils.m58184c(VerificationCodeFragment.this.backBtn);
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        VerificationCodeFragment.this.mo46346y();
                                        VerificationCodeFragment.this.mo46250s();
                                        if (VerificationCodeFragment.this.getActivity() != null) {
                                            ((AccountOpeModel) C0214z.m440a(VerificationCodeFragment.this.getActivity()).mo359a(AccountOpeModel.class)).f59552c.postValue(new C22054b(((C13103b) eVar.f34007h).f34234a, ((C13103b) eVar.f34007h).f34239f.f34481i.toString()));
                                            VerificationCodeFragment.this.getActivity().setResult(-1);
                                            VerificationCodeFragment.this.getActivity().finish();
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final void mo45155a(C12993e<C13103b> eVar) {
                                    String str;
                                    C22091c.m54871a(1, "bindPhone", eVar.f34000c, eVar.f34001d);
                                    C26890h.m65011a("phone_bundling_success", new C20856a().mo44776a("enter_from", "log_in").mo44774a("status", 0).mo44774a("error_code", eVar.f34000c).mo44776a("platform", C21021e.m53410a(a)).f56798a);
                                    if ((eVar.f34000c == 2004 || eVar.f34000c == 2003) && !TextUtils.isEmpty(eVar.f34001d)) {
                                        VerificationCodeFragment.this.mo46342d(eVar.f34001d);
                                    } else if (eVar.f34000c == 2027 || eVar.f34000c == 2028) {
                                        if (TextUtils.isEmpty(eVar.f34001d)) {
                                            str = VerificationCodeFragment.this.getString(R.string.c2p);
                                        } else {
                                            str = eVar.f34001d;
                                        }
                                        C10691a.m21545b(VerificationCodeFragment.this.getContext(), str).mo19066a();
                                    } else {
                                        if (VerificationCodeFragment.this.isViewValid()) {
                                            VerificationCodeFragment.this.mo46250s();
                                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        }
                                        User i = C23826bi.m58468i();
                                        if (i != null) {
                                            i.setBindPhone("");
                                        }
                                        if (!(VerificationCodeFragment.this.f59933s == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                                            ((AccountOpeModel) C0214z.m440a(VerificationCodeFragment.this.getActivity()).mo359a(AccountOpeModel.class)).f59552c.postValue(new C22054b(((C13103b) eVar.f34007h).f34234a, eVar.f34001d));
                                        }
                                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f34001d)) {
                                            VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                                        }
                                        C26890h.m65005a((Context) C23826bi.m58460b(), "toast_show", "psd_error", C23826bi.m58463d(), 0);
                                    }
                                }
                            });
                        }
                    }
                } else if (this.f59933s == 6) {
                    C22308a.m55207b(this.mBtnLogin);
                    this.f59923D.mo24607a(this.mEditText.getText().toString(), C22165u.f59779s, true, 0, "", (C13143t) new C13143t() {
                        public final /* synthetic */ void onSuccess(C12990b bVar) {
                            C12996h hVar = (C12996h) bVar;
                            if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.putExtra("ticket", hVar.f34021h);
                                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                                VerificationCodeFragment.this.getActivity().finish();
                            }
                        }

                        public final /* synthetic */ void onError(C12990b bVar, int i) {
                            C12996h hVar = (C12996h) bVar;
                            if (VerificationCodeFragment.this.isViewValid()) {
                                C22308a.m55205a(VerificationCodeFragment.this.mBtnLogin);
                                VerificationCodeFragment.this.backBtn.setEnabled(true);
                                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f34001d)) {
                                    VerificationCodeFragment.this.mo46341a(hVar.f34000c, hVar.f34001d);
                                }
                            }
                        }
                    });
                } else if (this.f59933s == 7) {
                    C22308a.m55207b(this.mBtnLogin);
                    this.f59923D.mo24607a(this.mEditText.getText().toString(), C22165u.f59779s, true, 0, this.f59937w, this.f59925F);
                } else if (this.f59933s == 8) {
                    if (TextUtils.isEmpty(this.mPasswordEt.getText().toString())) {
                        C10691a.m21542b((Context) getActivity(), (int) R.string.cps).mo19066a();
                    } else {
                        C22308a.m55207b(this.mBtnLogin);
                        this.f59923D.mo24631a(this.f59934t, this.mEditText.getText().toString(), this.f59927H, "", (C13124a) new C21098c(this) {
                            public final void onSuccess(C12993e<C13102a> eVar) {
                                if (!(eVar.f34007h == null || ((C13102a) eVar.f34007h).f34233e == null)) {
                                    C23826bi.m58455a(((C13102a) eVar.f34007h).f34233e);
                                }
                                if (VerificationCodeFragment.this.getActivity() != null) {
                                    VerificationCodeFragment.this.getActivity().setResult(-1);
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            }

                            /* renamed from: a */
                            public final void mo45152a(C12993e<C13102a> eVar) {
                                if (C22262d.f60036a.contains(Integer.valueOf(eVar.f34000c))) {
                                    Intent intent = new Intent();
                                    intent.putExtra("error_code", eVar.f34000c);
                                    if (VerificationCodeFragment.this.getActivity() != null) {
                                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                    return;
                                }
                                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f34001d)) {
                                    VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                                }
                            }
                        });
                    }
                }
            }
        } else if (this.f59921B) {
            User i = C23826bi.m58468i();
            if (i != null && i.isSecret()) {
                mo46340A();
            }
        } else {
            mo46347z();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44970b() {
        /*
            r16 = this;
            r0 = r16
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "type"
            int r1 = r1.getInt(r2)
            r0.f59933s = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "mobile"
            java.lang.String r1 = r1.getString(r2)
            r0.f59934t = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "password"
            java.lang.String r1 = r1.getString(r2)
            r0.f59936v = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "ticket"
            java.lang.String r1 = r1.getString(r2)
            r0.f59926G = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "ticket"
            java.lang.String r1 = r1.getString(r2)
            r0.f59937w = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "unusable_mobile_ticket"
            java.lang.String r1 = r1.getString(r2)
            r0.f59928I = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "profile_key"
            java.lang.String r1 = r1.getString(r2)
            r0.f59927H = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "enter_from"
            java.lang.String r1 = r1.getString(r2)
            r0.f59935u = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "proaccount_switch_type"
            int r1 = r1.getInt(r2)
            r0.f59929J = r1
            android.os.Bundle r1 = r16.getArguments()
            java.lang.String r2 = "proaccount_category"
            java.lang.String r1 = r1.getString(r2)
            r0.f59940z = r1
            android.widget.EditText r1 = r0.mEditText
            r2 = 1
            android.text.InputFilter[] r3 = new android.text.InputFilter[r2]
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            r5 = 4
            r4.<init>(r5)
            r6 = 0
            r3[r6] = r4
            r1.setFilters(r3)
            android.widget.EditText r1 = r0.mEditText
            r3 = 2132545724(0x7f1c10bc, float:2.0744646E38)
            r1.setHint(r3)
            android.widget.TextView r1 = r0.mTxtTimer
            r1.setVisibility(r6)
            int r1 = r0.f59933s
            r4 = 2131951919(0x7f13012f, float:1.9540266E38)
            r7 = 3
            if (r1 != r7) goto L_0x00b5
            android.widget.TextView r1 = r0.mTitleHint
            r2 = 2132542366(0x7f1c039e, float:2.0737835E38)
            r1.setText(r2)
            r16.m55040C()
            android.view.View r1 = r0.mBtnLogin
            r1.setBackgroundResource(r4)
            java.lang.String r1 = "modify_phone"
        L_0x00b2:
            r6 = 0
            goto L_0x03ba
        L_0x00b5:
            int r1 = r0.f59933s
            r8 = 8
            r9 = 9
            r10 = -1
            if (r1 != r9) goto L_0x0316
            android.support.v4.app.FragmentActivity r1 = r16.getActivity()
            com.ss.android.ugc.aweme.account.ui.BaseBindMobileActivity r1 = (com.p683ss.android.ugc.aweme.account.p1307ui.BaseBindMobileActivity) r1
            com.ss.android.ugc.aweme.account.ui.p r4 = new com.ss.android.ugc.aweme.account.ui.p
            r4.<init>(r0)
            r1.f59809p = r4
            boolean r1 = com.p683ss.android.ugc.aweme.account.util.C22282t.m55146c()
            r0.f59939y = r1
            boolean r1 = r0.f59939y
            r4 = 2131821804(0x7f1104ec, float:1.9276362E38)
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r11 = 2131821800(0x7f1104e8, float:1.9276353E38)
            r12 = 1107296256(0x42000000, float:32.0)
            r13 = -2
            if (r1 == 0) goto L_0x00e8
            android.widget.EditText r1 = r0.mPasswordEt
            r1.setVisibility(r8)
            goto L_0x018d
        L_0x00e8:
            android.widget.EditText r1 = r0.mPasswordEt
            r1.setVisibility(r6)
            android.widget.EditText r1 = r0.mPasswordEt
            r1.setBackgroundResource(r6)
            android.widget.EditText r1 = r0.mPasswordEt
            android.content.res.Resources r14 = r16.getResources()
            r15 = 2131821803(0x7f1104eb, float:1.927636E38)
            int r14 = r14.getColor(r15)
            r1.setHintTextColor(r14)
            android.widget.EditText r1 = r0.mPasswordEt
            android.content.res.Resources r14 = r16.getResources()
            int r14 = r14.getColor(r11)
            r1.setTextColor(r14)
            android.view.View r1 = r0.mPasswordDownView
            r1.setVisibility(r6)
            android.widget.TextView r1 = r0.mPasswordTip
            r1.setGravity(r5)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r13, r13)
            android.content.Context r14 = r16.getContext()
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r12)
            int r14 = (int) r14
            android.content.Context r15 = r16.getContext()
            float r15 = com.bytedance.common.utility.C9432q.m18687b(r15, r12)
            int r15 = (int) r15
            r1.setMargins(r14, r6, r15, r6)
            r14 = 2132020767(0x7f140e1f, float:1.9679906E38)
            r1.addRule(r7, r14)
            android.content.Context r14 = r16.getContext()
            r15 = 1112014848(0x42480000, float:50.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r15)
            int r14 = (int) r14
            r1.height = r14
            android.widget.EditText r14 = r0.mPasswordEt
            r14.setLayoutParams(r1)
            android.widget.EditText r1 = r0.mPasswordEt
            r1.setPadding(r6, r6, r6, r6)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r13, r13)
            android.content.Context r14 = r16.getContext()
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r12)
            int r14 = (int) r14
            android.content.Context r15 = r16.getContext()
            r3 = 1092616192(0x41200000, float:10.0)
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r15, r3)
            int r3 = (int) r3
            android.content.Context r15 = r16.getContext()
            float r15 = com.bytedance.common.utility.C9432q.m18687b(r15, r12)
            int r15 = (int) r15
            r1.setMargins(r14, r3, r15, r6)
            r3 = 2132021510(0x7f141106, float:1.9681413E38)
            r1.addRule(r7, r3)
            android.widget.TextView r3 = r0.mPasswordTip
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.mPasswordTip
            android.content.res.Resources r3 = r16.getResources()
            int r3 = r3.getColor(r4)
            r1.setTextColor(r3)
        L_0x018d:
            android.widget.ImageView r1 = r0.backBtn
            r3 = 2131956725(0x7f1313f5, float:1.9550014E38)
            r1.setImageResource(r3)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r13, r13)
            android.content.Context r3 = r16.getContext()
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r12)
            int r3 = (int) r3
            android.content.Context r14 = r16.getContext()
            r15 = 1092616192(0x41200000, float:10.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r15)
            int r14 = (int) r14
            android.content.Context r15 = r16.getContext()
            float r15 = com.bytedance.common.utility.C9432q.m18687b(r15, r12)
            int r15 = (int) r15
            r1.setMargins(r3, r14, r15, r6)
            r3 = 2132024305(0x7f141bf1, float:1.9687082E38)
            r1.addRule(r7, r3)
            android.widget.LinearLayout r3 = r0.mLLContainer
            r3.setLayoutParams(r1)
            android.widget.EditText r1 = r0.mEditText
            r1.setPadding(r6, r6, r6, r6)
            android.widget.EditText r1 = r0.mEditText
            r1.setBackgroundResource(r6)
            android.widget.TextView r1 = r0.mTxtTimer
            r1.setBackgroundResource(r6)
            android.widget.EditText r1 = r0.mEditText
            r3 = 2132546601(0x7f1c1429, float:2.0746424E38)
            r1.setHint(r3)
            android.widget.EditText r1 = r0.mEditText
            android.content.res.Resources r3 = r16.getResources()
            r14 = 2131821803(0x7f1104eb, float:1.927636E38)
            int r3 = r3.getColor(r14)
            r1.setHintTextColor(r3)
            android.widget.EditText r1 = r0.mEditText
            android.content.res.Resources r3 = r16.getResources()
            int r3 = r3.getColor(r11)
            r1.setTextColor(r3)
            android.widget.TextView r1 = r0.mTxtTimer
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r1.setGravity(r3)
            android.widget.TextView r1 = r0.mTxtTimer
            android.content.res.Resources r3 = r16.getResources()
            int r3 = r3.getColor(r4)
            r1.setTextColor(r3)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r13, r13)
            r1.addRule(r9, r10)
            android.widget.RelativeLayout r3 = r0.mRlTitle
            int r3 = r3.getId()
            r1.addRule(r7, r3)
            android.content.Context r3 = r16.getContext()
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r12)
            int r3 = (int) r3
            android.content.Context r14 = r16.getContext()
            r15 = 1109393408(0x42200000, float:40.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r15)
            int r14 = (int) r14
            android.content.Context r15 = r16.getContext()
            float r15 = com.bytedance.common.utility.C9432q.m18687b(r15, r12)
            int r15 = (int) r15
            r1.setMargins(r3, r14, r15, r6)
            android.widget.TextView r3 = r0.mTitleHint
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.mTitleHint
            r1.setGravity(r5)
            android.widget.TextView r1 = r0.mTitleHint
            r3 = 2132542360(0x7f1c0398, float:2.0737823E38)
            r1.setText(r3)
            android.widget.TextView r1 = r0.mTitleHint
            r3 = 1101004800(0x41a00000, float:20.0)
            r1.setTextSize(r3)
            android.widget.TextView r1 = r0.mTitleHint
            android.content.res.Resources r3 = r16.getResources()
            int r3 = r3.getColor(r11)
            r1.setTextColor(r3)
            android.view.View r1 = r0.mCodeDownView
            r1.setVisibility(r6)
            java.lang.String r1 = "new_phone_in"
            java.lang.String r3 = r0.f59934t
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00b2
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r13, r13)
            android.content.Context r11 = r16.getContext()
            float r11 = com.bytedance.common.utility.C9432q.m18687b(r11, r12)
            int r11 = (int) r11
            android.content.Context r13 = r16.getContext()
            r14 = 1090519040(0x41000000, float:8.0)
            float r13 = com.bytedance.common.utility.C9432q.m18687b(r13, r14)
            int r13 = (int) r13
            android.content.Context r14 = r16.getContext()
            float r12 = com.bytedance.common.utility.C9432q.m18687b(r14, r12)
            int r12 = (int) r12
            android.content.Context r14 = r16.getContext()
            r15 = 1105199104(0x41e00000, float:28.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r15)
            int r14 = (int) r14
            r3.setMargins(r11, r13, r12, r14)
            r3.addRule(r9, r10)
            android.widget.TextView r9 = r0.mTitleHint
            int r9 = r9.getId()
            r3.addRule(r7, r9)
            java.lang.String r7 = r0.f59934t
            java.lang.String r7 = com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.m53620a(r7)
            boolean r9 = r0.f59939y
            if (r9 == 0) goto L_0x02ca
            r9 = 2132549779(0x7f1c2093, float:2.075287E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r7
            java.lang.String r2 = com.C2240a.m6772a(r9, r2)
            goto L_0x02d9
        L_0x02ca:
            r9 = 2132549780(0x7f1c2094, float:2.0752872E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r7
            java.lang.String r2 = com.C2240a.m6772a(r9, r2)
        L_0x02d9:
            android.widget.TextView r7 = r0.mTxtHint
            r7.setLayoutParams(r3)
            android.widget.TextView r3 = r0.mTxtHint
            r3.setText(r2)
            android.widget.TextView r2 = r0.mTxtHint
            r2.setGravity(r5)
            android.widget.TextView r2 = r0.mTxtHint
            android.content.res.Resources r3 = r16.getResources()
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.mBtnPreAccount
            r2.setVisibility(r6)
            android.view.View r2 = r0.mBtnLogin
            r2.setVisibility(r8)
            com.bytedance.ies.dmt.ui.widget.DmtButton r2 = r0.mBtnPreAccount
            r3 = 2132542404(0x7f1c03c4, float:2.0737912E38)
            r2.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r2 = r0.mDmtStatusView
            android.content.Context r3 = r16.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r3 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r3)
            r2.setBuilder(r3)
            goto L_0x00b2
        L_0x0316:
            int r1 = r0.f59933s
            if (r1 != r5) goto L_0x032e
            android.widget.TextView r1 = r0.mTitleHint
            r2 = 2132542367(0x7f1c039f, float:2.0737837E38)
            r1.setText(r2)
            android.view.View r1 = r0.mBtnLogin
            r1.setBackgroundResource(r4)
            java.lang.String r1 = "new_phone_in"
            r16.m55041D()
            goto L_0x00b2
        L_0x032e:
            int r1 = r0.f59933s
            if (r1 != r2) goto L_0x0358
            android.widget.TextView r1 = r0.mTitleHint
            r2 = 2132551656(0x7f1c27e8, float:2.0756677E38)
            r1.setText(r2)
            android.view.View r1 = r0.mBtnLogin
            r1.setBackgroundResource(r4)
            java.lang.String r1 = "modify_psd"
            r16.m55040C()
            int r2 = com.p683ss.android.ugc.aweme.account.C22165u.f59773m
            r0.f59938x = r2
            com.bytedance.sdk.account.a.d r2 = r0.f59923D
            java.lang.String r3 = r0.f59934t
            int r4 = com.p683ss.android.ugc.aweme.account.C22165u.f59773m
            com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment$14 r5 = new com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment$14
            r5.<init>(r0)
            r6 = 0
            r2.mo24614a(r3, r6, r4, r5)
            goto L_0x03ba
        L_0x0358:
            r6 = 0
            int r1 = r0.f59933s
            r2 = 5
            if (r1 != r2) goto L_0x0372
            boolean r1 = com.p683ss.android.ugc.aweme.account.util.C22282t.m55146c()
            r0.f59939y = r1
            android.widget.TextView r1 = r0.mTitleHint
            r2 = 2132542360(0x7f1c0398, float:2.0737823E38)
            r1.setText(r2)
            java.lang.String r1 = "new_phone_in"
            r16.m55041D()
            goto L_0x03ba
        L_0x0372:
            int r1 = r0.f59933s
            r2 = 6
            r3 = 2132551806(0x7f1c287e, float:2.0756981E38)
            if (r1 != r2) goto L_0x038f
            android.widget.TextView r1 = r0.mTitleHint
            r1.setText(r3)
            java.lang.String r1 = ""
            r16.m55040C()
            android.widget.TextView r2 = r0.mTxtTimer
            r3 = 2132544950(0x7f1c0db6, float:2.0743076E38)
            r2.setText(r3)
            r0.f59932r = r10
            goto L_0x03ba
        L_0x038f:
            int r1 = r0.f59933s
            r2 = 7
            if (r1 != r2) goto L_0x03a9
            android.widget.TextView r1 = r0.mTitleHint
            r1.setText(r3)
            java.lang.String r1 = ""
            r16.m55040C()
            android.widget.TextView r2 = r0.mTxtTimer
            r3 = 2132544950(0x7f1c0db6, float:2.0743076E38)
            r2.setText(r3)
            r0.f59932r = r10
            goto L_0x03ba
        L_0x03a9:
            int r1 = r0.f59933s
            if (r1 != r8) goto L_0x03b8
            android.widget.TextView r1 = r0.mTitleHint
            r1.setText(r3)
            java.lang.String r1 = ""
            r16.m55040C()
            goto L_0x03ba
        L_0x03b8:
            java.lang.String r1 = ""
        L_0x03ba:
            android.support.v4.app.FragmentActivity r7 = r16.getActivity()
            java.lang.String r8 = "verification_in"
            java.lang.String r9 = "verification_code"
            java.lang.String r10 = com.p683ss.android.ugc.aweme.C23826bi.m58463d()
            r11 = 0
            com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.app.f.c r1 = r2.mo47824a(r3, r1)
            org.json.JSONObject r13 = r1.mo47825b()
            com.p683ss.android.ugc.aweme.common.C26890h.m65006a(r7, r8, r9, r10, r11, r13)
            android.support.v4.app.FragmentActivity r1 = r16.getActivity()
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.account.C22162t
            if (r2 == 0) goto L_0x03e9
            com.ss.android.ugc.aweme.account.t r1 = (com.p683ss.android.ugc.aweme.account.C22162t) r1
            android.arch.lifecycle.r r1 = r1.al_()
        L_0x03e7:
            r3 = r1
            goto L_0x03f9
        L_0x03e9:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity
            if (r2 == 0) goto L_0x03f8
            com.ss.android.ugc.aweme.account.ui.BindMobileActivity r1 = (com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity) r1
            com.ss.android.ugc.aweme.account.login.sms.e r2 = r1.f59810q
            if (r2 == 0) goto L_0x03f8
            com.ss.android.ugc.aweme.account.login.sms.e r1 = r1.f59810q
            android.arch.lifecycle.r<java.lang.String> r1 = r1.f58231b
            goto L_0x03e7
        L_0x03f8:
            r3 = r6
        L_0x03f9:
            if (r3 == 0) goto L_0x0422
            java.lang.Object r1 = r3.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x041a
            android.widget.EditText r1 = r0.mEditText
            java.lang.Object r2 = r3.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r16.m55042E()
            java.lang.String r1 = ""
            r3.setValue(r1)
        L_0x041a:
            com.ss.android.ugc.aweme.account.ui.q r1 = new com.ss.android.ugc.aweme.account.ui.q
            r1.<init>(r0)
            r3.observe(r0, r1)
        L_0x0422:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1307ui.VerificationCodeFragment.mo44970b():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo46343e(String str) {
        this.mEditText.setText(str);
        m55042E();
    }

    /* renamed from: c */
    public final void mo45865c(final String str) {
        this.f59923D.mo24632a(m55044G(), m55045H(), this.mPasswordEt.getText().toString(), "", (C13125b) new C21101f(this) {
            /* renamed from: a */
            public final void mo45155a(C12993e<C13103b> eVar) {
                String str;
                C26890h.m65011a("phone_bundling_success", new C20856a().mo44776a("enter_from", "log_in").mo44774a("status", 0).mo44774a("error_code", eVar.f34000c).mo44776a("platform", C21021e.m53410a(str)).f56798a);
                if ((eVar.f34000c == 2004 || eVar.f34000c == 2003) && !TextUtils.isEmpty(eVar.f34001d)) {
                    VerificationCodeFragment.this.mo46342d(eVar.f34001d);
                } else if (eVar.f34000c == 2027 || eVar.f34000c == 2028) {
                    if (TextUtils.isEmpty(eVar.f34001d)) {
                        str = VerificationCodeFragment.this.getString(R.string.c2p);
                    } else {
                        str = eVar.f34001d;
                    }
                    C10691a.m21545b(VerificationCodeFragment.this.getContext(), str).mo19066a();
                } else {
                    if (VerificationCodeFragment.this.isViewValid()) {
                        VerificationCodeFragment.this.mo46250s();
                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                    }
                    User i = C23826bi.m58468i();
                    if (i != null) {
                        i.setBindPhone("");
                    }
                    if (!(VerificationCodeFragment.this.f59933s == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                        ((AccountOpeModel) C0214z.m440a(VerificationCodeFragment.this.getActivity()).mo359a(AccountOpeModel.class)).f59552c.postValue(new C22054b(((C13103b) eVar.f34007h).f34234a, eVar.f34001d));
                    }
                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f34001d)) {
                        VerificationCodeFragment.this.mo46341a(eVar.f34000c, eVar.f34001d);
                    }
                    C26890h.m65005a((Context) C23826bi.m58460b(), "toast_show", "psd_error", C23826bi.m58463d(), 0);
                }
            }

            public final void onSuccess(C12993e<C13103b> eVar) {
                String str;
                C22091c.m54871a(0, "bindPhone", 0, "");
                VerificationCodeFragment.this.f59920A = true;
                User i = C23826bi.m58468i();
                if (i != null) {
                    C18494a aVar = (C18494a) ((C13103b) eVar.f34007h).f34239f.f34475c.get("mobile");
                    if (aVar != null) {
                        str = aVar.f50951e;
                    } else {
                        str = "";
                    }
                    i.setPhoneBinded(true);
                    i.setBindPhone(str);
                    C23826bi.m58449a().updateUserInfo(((C13103b) eVar.f34007h).f34239f);
                    if (VerificationCodeFragment.this.f59933s == 9) {
                        C26890h.m65011a("set_up_proAccount", new C20856a().mo44776a("page", "Input Phone Captcha").mo44776a("method", "set_by_phone").mo44775a("duration", System.currentTimeMillis() - VerificationCodeFragment.this.f59922C).f56798a);
                        VerificationCodeFragment.this.mo46347z();
                    } else {
                        C23826bi.m58451a(7, 1, (Object) new C27983t(str, ((C13103b) eVar.f34007h).f34239f.f34481i.toString()));
                    }
                }
                if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.f59933s != 9) {
                    KeyboardUtils.m58184c(VerificationCodeFragment.this.backBtn);
                    VerificationCodeFragment.this.backBtn.setEnabled(true);
                    VerificationCodeFragment.this.mo46346y();
                    VerificationCodeFragment.this.mo46250s();
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        ((AccountOpeModel) C0214z.m440a(VerificationCodeFragment.this.getActivity()).mo359a(AccountOpeModel.class)).f59552c.postValue(new C22054b(((C13103b) eVar.f34007h).f34234a, ((C13103b) eVar.f34007h).f34239f.f34481i.toString()));
                        VerificationCodeFragment.this.getActivity().setResult(-1);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                }
                C26890h.m65011a("phone_bundling_success", new C20856a().mo44776a("enter_from", "log_in").mo44774a("status", 1).mo44774a("error_code", eVar.f34000c).mo44776a("platform", C21021e.m53410a(str)).f56798a);
            }
        });
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f59931q = true;
        if (this.f59933s != 6 && this.f59933s != 7) {
            m55043F();
        }
    }

    /* renamed from: d */
    public final void mo46342d(String str) {
        C11105a a = C22284v.m55156a(getActivity());
        a.mo20146b((CharSequence) str);
        a.mo20136a((int) R.string.f78, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18898c.m46009a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_confirm");
                ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a((Context) C23826bi.m58460b(), C2240a.m6772a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
            }
        });
        a.mo20145b((int) R.string.wf, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18898c.m46009a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_cancel");
            }
        });
        a.mo20148b();
    }

    public void handleMsg(Message message) {
        if ((message.obj instanceof UserResponse) && message.what == 122) {
            Object obj = message.obj;
            C23826bi.m58469j();
            C23826bi.m58451a(7, 1, (Object) null);
            C26890h.m65011a("switch_to_pro_account_success", C20856a.m53173a().mo44776a("classes", this.f59940z).f56798a);
        }
        if ((message.obj instanceof Exception) && message.what == 122) {
            if (getActivity() != null) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg2).mo19066a();
            }
            if (isViewValid()) {
                KeyboardUtils.m58184c(this.backBtn);
                this.backBtn.setEnabled(true);
                mo46346y();
                mo46250s();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f59923D = C13081d.m26312a(getContext());
        this.f59930K = new C9381g(this);
    }

    /* renamed from: a */
    public final void mo46341a(int i, String str) {
        if (C22281s.m55138a(i)) {
            if (i == 1050) {
                C22281s.m55137a(getContext(), getString(R.string.gpq), getString(R.string.bdf), false);
            } else {
                C22281s.m55135a(getContext(), str);
            }
            this.f59932r = -1;
            mo46346y();
            return;
        }
        C10691a.m21545b(getContext(), str).mo19066a();
    }

    /* renamed from: a */
    public static VerificationCodeFragment m55046a(String str, int i, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("type", i);
        bundle.putString("mobile", str2);
        bundle.putString("enter_from", str);
        VerificationCodeFragment verificationCodeFragment = new VerificationCodeFragment();
        verificationCodeFragment.setArguments(bundle);
        return verificationCodeFragment;
    }

    /* renamed from: b */
    public static VerificationCodeFragment m55047b(int i, String str, String str2, String str3, String str4) {
        return m55046a(str4, i, str, C47661ab.m103163a().mo94972a("password", str2).mo94972a("ticket", str3).f120139a);
    }
}
