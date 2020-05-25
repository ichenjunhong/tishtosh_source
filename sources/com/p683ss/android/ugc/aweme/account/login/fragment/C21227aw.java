package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p846b.C13000a;
import com.bytedance.sdk.account.p844a.p848d.C13012a;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13108g;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p862a.C13110i;
import com.bytedance.sdk.account.p861f.p862a.C13114m;
import com.bytedance.sdk.account.p861f.p862a.C13115n;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13118q;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13130g;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13131h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13134k;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13135l;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13137n;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21051g;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21052h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21100e;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21114s;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21116u;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountDownView;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a;
import com.p683ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22044a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22049e;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21024h;
import com.p683ss.android.ugc.aweme.account.p1302o.C22091c;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22241h;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22285w;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.utils.C22305k;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aw */
public class C21227aw extends C21168a implements C9382a, C21109n, C22241h {

    /* renamed from: o */
    public static final boolean f57661o = false;

    /* renamed from: A */
    public C21052h f57662A;

    /* renamed from: B */
    public C21251b f57663B;

    /* renamed from: C */
    public int f57664C;

    /* renamed from: D */
    public boolean f57665D;

    /* renamed from: E */
    String f57666E;

    /* renamed from: F */
    String f57667F;

    /* renamed from: G */
    public C21250a f57668G;

    /* renamed from: H */
    public int f57669H;

    /* renamed from: I */
    boolean f57670I = true;

    /* renamed from: J */
    public C13011d f57671J;

    /* renamed from: K */
    public String f57672K;

    /* renamed from: L */
    boolean f57673L;

    /* renamed from: M */
    boolean f57674M;

    /* renamed from: O */
    private String f57675O;

    /* renamed from: P */
    private String f57676P;

    /* renamed from: Q */
    private String f57677Q;

    /* renamed from: R */
    private String f57678R;

    /* renamed from: S */
    private TextView f57679S;

    /* renamed from: T */
    private AutoLinefeedTextView f57680T;

    /* renamed from: U */
    private View f57681U;

    /* renamed from: V */
    private LoginButton f57682V;

    /* renamed from: W */
    private DmtButton f57683W;

    /* renamed from: X */
    private DmtStatusView f57684X;

    /* renamed from: Y */
    private TextView f57685Y;

    /* renamed from: Z */
    private int f57686Z;

    /* renamed from: aa */
    private C9381g f57687aa;

    /* renamed from: p */
    final int f57688p = 6;

    /* renamed from: q */
    public boolean f57689q;

    /* renamed from: r */
    public boolean f57690r;

    /* renamed from: s */
    public boolean f57691s;

    /* renamed from: t */
    long f57692t = -1;

    /* renamed from: u */
    public EditText f57693u;

    /* renamed from: v */
    public View f57694v;

    /* renamed from: w */
    public View f57695w;

    /* renamed from: x */
    public TextView f57696x;

    /* renamed from: y */
    public MusCountDownView f57697y;

    /* renamed from: z */
    public Long f57698z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aw$a */
    public interface C21250a {
        /* renamed from: a */
        void mo45256a(String str, String str2, C21100e eVar);

        /* renamed from: b */
        String mo45259b();

        void dismiss();

        /* renamed from: g */
        void mo45265g();

        /* renamed from: h */
        String mo45266h();

        /* renamed from: i */
        int mo45267i();

        /* renamed from: j */
        int mo45269j();

        /* renamed from: k */
        String mo45270k();

        /* renamed from: l */
        C0198r<String> mo45271l();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aw$b */
    class C21251b implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                C21227aw.this.mo45159d();
                C21227aw.this.f57671J.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
                    public final void onError(C12993e<C13117p> eVar, int i) {
                    }

                    public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    }

                    public final void onSuccess(C12993e<C13117p> eVar) {
                        int i;
                        if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                            if (C21227aw.this.f57665D) {
                                i = C22165u.f59761a;
                            } else {
                                i = C22165u.f59782v;
                            }
                            C21227aw.this.mo45158a(((C13117p) eVar.f34007h).f34303a, null, i, C21227aw.this.f57663B);
                        }
                    }
                });
            }
        }

        private C21251b() {
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            int i2;
            String str2;
            if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                C21227aw.this.mo45159d();
                C21227aw.this.f57697y.mo45750a();
                if (C21227aw.this.f57665D) {
                    i2 = C22165u.f59761a;
                } else {
                    i2 = C22165u.f59782v;
                }
                String str3 = "";
                if (C21227aw.this.f57668G != null) {
                    i2 = C21227aw.this.f57668G.mo45269j();
                    str3 = C21227aw.this.f57668G.mo45266h();
                }
                String str4 = str3;
                if (C21227aw.this.f57690r) {
                    FragmentActivity activity = C21227aw.this.getActivity();
                    String l = C21227aw.this.mo45384l();
                    boolean a = C22299f.m55184a();
                    C20900b.m53233a(activity, l, str, i2, 0, str4, 1, a ? 1 : 0, C21227aw.this.f57662A).mo24766d();
                } else {
                    C13011d dVar = C21227aw.this.f57671J;
                    String l2 = C21227aw.this.mo45384l();
                    boolean a2 = C22299f.m55184a();
                    dVar.mo24611a(l2, str, i2, 0, str4, 1, a2 ? 1 : 0, (C13139p) C21227aw.this.f57662A);
                }
                C26890h.m65011a("slide_verification_response", new C20856a().f56798a);
                if (C21227aw.this.f57690r) {
                    str2 = "send_whatsapp_code";
                } else {
                    str2 = "send_sms";
                }
                C26890h.m65011a(str2, new C20856a().mo44776a("send_method", "resend").mo44774a("send_reason", i2).mo44776a("enter_method", C21227aw.this.f57515m).mo44776a("enter_from", C21227aw.this.f57514l).f56798a);
            }
        }
    }

    /* renamed from: a */
    public final void mo45160a() {
        mo45383k();
    }

    /* renamed from: c */
    public final void mo45161c() {
        this.f57682V.mo45161c();
    }

    /* renamed from: o */
    public final void mo45387o() {
        C23826bi.m58454a((Handler) this.f57687aa, false);
    }

    /* renamed from: r */
    private void m53780r() {
        if (this.f57508a != null) {
            this.f57508a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C21227aw.this.f57664C == 8) {
                        C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Input Phone Captcha").mo44775a("duration", System.currentTimeMillis() - C21227aw.this.f57698z.longValue()).f56798a);
                    }
                    if (C21227aw.this.f57668G != null) {
                        C21227aw.this.f57668G.mo45265g();
                    } else {
                        C21227aw.this.mo45327e();
                    }
                }
            });
        }
    }

    /* renamed from: i */
    public final long mo45361i() {
        return System.currentTimeMillis() - this.f57698z.longValue();
    }

    /* renamed from: m */
    public final String mo45385m() {
        return this.f57693u.getText().toString();
    }

    /* renamed from: n */
    public final void mo45386n() {
        C23826bi.m58453a(this.f57686Z, this.f57672K, this.f57672K, 0, new C20840g() {
            public final void onResult(int i, int i2, Object obj) {
                if (i == 14 && i2 == 1) {
                    C21227aw.this.f57674M = true;
                    User i3 = C23826bi.m58468i();
                    if (i3 == null || !i3.isSecret()) {
                        C23826bi.m58469j();
                        C23826bi.m58451a(7, 1, (Object) new C27983t(C21227aw.this.mo45384l(), ""));
                        C26890h.m65011a("switch_to_pro_account_success", C20856a.m53173a().mo44776a("classes", C21227aw.this.f57672K).f56798a);
                        return;
                    }
                    C21227aw.this.mo45387o();
                } else {
                    if (C21227aw.this.getActivity() != null) {
                        C10691a.m21542b((Context) C21227aw.this.getActivity(), (int) R.string.cg2).mo19066a();
                    }
                    C21227aw.this.mo45383k();
                }
            }
        });
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57693u);
    }

    public void onStart() {
        super.onStart();
        this.f57693u.postDelayed(new Runnable() {
            public final void run() {
                C21227aw.this.mo45322a((View) C21227aw.this.f57693u);
            }
        }, 500);
    }

    /* renamed from: q */
    private void m53779q() {
        C26890h.m65011a("auto_fill_sms_verification", new C20856a().mo44776a("enter_method", this.f57515m).f56798a);
    }

    /* renamed from: l */
    public final String mo45384l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57676P);
        sb.append("-");
        sb.append(this.f57677Q);
        return sb.toString();
    }

    public void onResume() {
        super.onResume();
        if (this.f57697y != null) {
            this.f57697y.mo45753b();
        }
        if (this.f57664C == 8) {
            this.f57698z = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: p */
    private void m53778p() {
        if (this.f57664C == 6) {
            this.f57697y.mo45752a(5, this.f57678R);
        } else if (this.f57664C == 7) {
            this.f57697y.mo45752a(6, this.f57678R);
        } else {
            this.f57697y.mo45752a(0, mo45384l());
        }
        if (this.f57690r) {
            C22305k.m55197c(mo45384l());
        } else {
            C22305k.m55198d(mo45384l());
        }
    }

    /* renamed from: j */
    public final void mo45382j() {
        if (this.f57682V == null || this.f57682V.getVisibility() != 0) {
            if (this.f57683W != null && this.f57683W.getVisibility() == 0) {
                this.f57684X.mo19212f();
            }
            return;
        }
        C22308a.m55207b(this.f57682V);
    }

    /* renamed from: k */
    public final void mo45383k() {
        boolean z;
        if (this.f57682V != null && this.f57682V.getVisibility() == 0) {
            C22308a.m55205a(this.f57682V);
            mo45379b(this.f57693u.getText().toString());
        } else if (this.f57683W != null && this.f57683W.getVisibility() == 0) {
            this.f57684X.setVisibility(8);
        }
        if (this.f57682V != null) {
            LoginButton loginButton = this.f57682V;
            if (this.f57693u.getText().toString().length() >= 4) {
                z = true;
            } else {
                z = false;
            }
            loginButton.setEnabled(z);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m53780r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo45381d(String str) {
        this.f57693u.setText(str);
        m53779q();
    }

    /* renamed from: a */
    public final void mo45323a(C21328n nVar) {
        super.mo45323a(nVar);
        if (this.f57697y != null && nVar != null) {
            this.f57697y.setTickListener(nVar);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            if (this.f57511d != null) {
                mo45323a(this.f57511d);
            }
            m53778p();
        }
    }

    /* renamed from: a */
    public final void mo45376a(String str) {
        if (isViewValid() && getContext() != null) {
            C1161a aVar = new C1161a(getContext(), R.style.s8);
            aVar.mo3764a((CharSequence) "").mo3770b((CharSequence) str).mo3759a((int) R.string.ah2, (DialogInterface.OnClickListener) null);
            C47700ay.m103235a(aVar.mo3772b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r7.length() == 4) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45379b(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.isViewValid()
            if (r0 == 0) goto L_0x007a
            android.content.Context r0 = r6.getContext()
            if (r0 != 0) goto L_0x000e
            goto L_0x007a
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0025
            int r0 = r6.f57664C
            if (r0 != r2) goto L_0x0022
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r6.f57683W
            r0.setEnabled(r3)
            goto L_0x005e
        L_0x0022:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57682V
            goto L_0x004c
        L_0x0025:
            int r0 = r6.f57664C
            r4 = 6
            if (r0 == r4) goto L_0x0051
            int r0 = r6.f57664C
            r5 = 7
            if (r0 != r5) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            int r0 = r6.f57664C
            r4 = 4
            if (r0 != r2) goto L_0x0043
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r6.f57683W
            int r5 = r7.length()
            if (r5 != r4) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            r0.setEnabled(r1)
            goto L_0x005e
        L_0x0043:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57682V
            int r5 = r7.length()
            if (r5 != r4) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0.setEnabled(r1)
            goto L_0x005e
        L_0x0051:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57682V
            int r5 = r7.length()
            if (r5 != r4) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            r0.setEnabled(r1)
        L_0x005e:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0079
            android.view.View r7 = r6.f57695w
            r7.setVisibility(r2)
            android.view.View r7 = r6.f57694v
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131821025(0x7f1101e1, float:1.9274782E38)
            int r0 = r0.getColor(r1)
            r7.setBackgroundColor(r0)
        L_0x0079:
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.mo45379b(java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo45380c(String str) {
        if (C20884b.m53201b()) {
            this.f57671J.mo24619a(mo45384l(), str, (C13134k) new C13134k() {
                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    super.onNeedSecureCaptcha((C12993e) bVar);
                    if (C21227aw.this.isViewValid()) {
                        C21227aw.this.mo45383k();
                    }
                }

                public final void onSuccess(C12993e<C13114m> eVar) {
                    C23826bi.m58455a(((C13114m) eVar.f34007h).f34292d);
                    C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                }

                public final void onError(C12993e<C13114m> eVar, int i) {
                    C21227aw.this.mo45374a(i, eVar.f34001d);
                }
            });
            return;
        }
        C21168a aVar = (C21168a) C22271m.m55124a(C21346u.class, getArguments()).mo46372a("country_code_alpha_2", this.f57675O).mo46372a("country_code", this.f57676P).mo46372a("phone_number", this.f57677Q).mo46372a("enter_type", this.f57516n).mo46371a("init_page", 0).mo46372a("sms_code_key", str).mo46370a();
        aVar.mo45323a(this.f57511d);
        mo45321a((Fragment) aVar, false);
    }

    public void handleMsg(Message message) {
        if ((message.obj instanceof UserResponse) && message.what == 122) {
            Object obj = message.obj;
            C23826bi.m58469j();
            C23826bi.m58451a(7, 1, (Object) new C27983t(mo45384l(), ""));
            C26890h.m65011a("switch_to_pro_account_success", C20856a.m53173a().mo44776a("classes", this.f57672K).f56798a);
        }
        if ((message.obj instanceof Exception) && message.what == 122) {
            if (getActivity() != null) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg2).mo19066a();
            }
            if (isViewValid()) {
                KeyboardUtils.m58184c(this.f57693u);
                mo45383k();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57675O = arguments.getString("country_code_alpha_2");
            this.f57676P = arguments.getString("country_code");
            this.f57677Q = arguments.getString("phone_number");
            this.f57678R = arguments.getString("email");
            this.f57689q = arguments.getBoolean("from_register", false);
            this.f57690r = arguments.getBoolean("use_whatsapp_code", false);
            this.f57691s = arguments.getBoolean("from_choose_dialog", false);
            this.f57666E = arguments.getString("captcha_string");
            this.f57667F = arguments.getString("captcha_error_msg");
            this.f57664C = arguments.getInt("code_type");
            this.f57665D = arguments.getBoolean("NEW_PHONE_USER", false);
            this.f57692t = arguments.getLong("sms_have_send_time", -1);
            this.f57514l = arguments.getString("enter_from");
            this.f57686Z = arguments.getInt(C21459s.f58202l);
            this.f57672K = arguments.getString(C21459s.f58203m);
        }
        this.f57663B = new C21251b();
        this.f57662A = new C21052h(this) {
            /* renamed from: a */
            public final void mo45100a() {
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(0, C21227aw.this.f57669H, 0, "");
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(0, C21227aw.this.f57669H, 0, "", "choose_dialog");
                } else {
                    C22097f.m54898a(0, C21227aw.this.f57669H, 0, "");
                }
                C21227aw.this.mo45383k();
            }

            /* renamed from: c */
            public final void onNeedSecureCaptcha(C12993e<C13120s> eVar) {
                super.onNeedSecureCaptcha(eVar);
                if (C21227aw.this.isViewValid()) {
                    C21227aw.this.mo45383k();
                }
            }

            /* renamed from: a */
            public final void mo45101a(int i) {
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(1, C21227aw.this.f57669H, i, "PhoneInvalid");
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(1, C21227aw.this.f57669H, i, "PhoneInvalid", "choose_dialog");
                } else {
                    C22097f.m54898a(1, C21227aw.this.f57669H, i, "PhoneInvalid");
                }
                if (C21227aw.this.isViewValid() && C21227aw.this.getActivity() != null) {
                    C21227aw.this.mo45376a(C21227aw.this.getResources().getString(R.string.ca7));
                    C21227aw.this.mo45383k();
                }
            }

            /* renamed from: b */
            public final void mo45105b(int i) {
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(1, C21227aw.this.f57669H, i, "RejectSec");
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(1, C21227aw.this.f57669H, i, "RejectSec", "choose_dialog");
                } else {
                    C22097f.m54898a(1, C21227aw.this.f57669H, i, "RejectSec");
                }
                super.mo45105b(i);
                if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                    C21227aw.this.mo45383k();
                }
            }

            /* renamed from: b */
            public final void mo45170b(C12993e<C13120s> eVar) {
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d);
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d, "choose_dialog");
                } else {
                    C22097f.m54898a(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d);
                }
                if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                    C21227aw.this.mo45383k();
                    String a = C21639a.m54348a(C21227aw.this.getContext(), eVar.f34000c, eVar.f34001d);
                    if (!TextUtils.isEmpty(a)) {
                        C10691a.m21546b(C21227aw.this.getContext(), a, 0).mo19066a();
                    }
                }
            }

            /* renamed from: a */
            public final void mo45103a(C12993e<C13120s> eVar) {
                String str;
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d);
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d, "choose_dialog");
                } else {
                    C22097f.m54898a(1, C21227aw.this.f57669H, eVar.f34000c, eVar.f34001d);
                }
                C21227aw.this.mo45383k();
                if (eVar.f34000c == 2027 || eVar.f34000c == 2028) {
                    if (TextUtils.isEmpty(eVar.f34001d)) {
                        str = C21227aw.this.getString(R.string.c2p);
                    } else {
                        str = eVar.f34001d;
                    }
                    C10691a.m21545b(C21227aw.this.getContext(), str).mo19066a();
                    return;
                }
                if (!TextUtils.isEmpty(eVar.f34001d)) {
                    C21227aw.this.mo45376a(eVar.f34001d);
                }
            }

            /* renamed from: a */
            public final void mo45102a(int i, String str) {
                String str2;
                if (C21227aw.this.f57690r) {
                    C22097f.m54900b(1, C21227aw.this.f57669H, i, "PhoneRegistered");
                } else if (C21227aw.this.f57691s) {
                    C22097f.m54899a(1, C21227aw.this.f57669H, i, "PhoneRegistered", "choose_dialog");
                } else {
                    C22097f.m54898a(1, C21227aw.this.f57669H, i, "PhoneRegistered");
                }
                if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                    String str3 = "login_failure";
                    C20856a aVar = new C20856a();
                    String str4 = "platform";
                    if (C21227aw.this.f57690r) {
                        str2 = "whatsapp";
                    } else {
                        str2 = "sms_verification";
                    }
                    C26890h.m65011a(str3, aVar.mo44776a(str4, str2).mo44776a("enter_method", C21227aw.this.f57515m).mo44776a("enter_type", C21227aw.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                    C21227aw.this.mo45383k();
                    C21227aw awVar = C21227aw.this;
                    if (TextUtils.isEmpty(str)) {
                        str = C21227aw.this.getResources().getString(R.string.coj);
                    }
                    awVar.mo45376a(str);
                }
            }

            /* renamed from: a */
            public final void mo45104a(String str, String str2) {
                int i;
                if (C21227aw.this.isViewValid() && C21227aw.this.getContext() != null) {
                    C21227aw.this.mo45383k();
                    if (C21227aw.this.f57665D) {
                        i = C22165u.f59761a;
                    } else {
                        i = C22165u.f59782v;
                    }
                    C21227aw.this.mo45158a(str, str2, i, C21227aw.this.f57663B);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo45375a(C13110i iVar) {
        String str;
        if (isViewValid() && getContext() != null && iVar != null && iVar.mo24646b() != null) {
            this.f57695w.setVisibility(8);
            this.f57694v.setBackgroundColor(getResources().getColor(R.color.a3v));
            m53777a(1, 0, "");
            if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
                if (this.f57664C == 6) {
                    C21518u.m54176b(new AccountPassLoginMethod(C23826bi.m58463d(), LoginMethodName.EMAIL_PASS, getArguments().getString("email")));
                } else if (!TextUtils.isEmpty(this.f57677Q)) {
                    PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_SMS, this.f57675O, this.f57676P, this.f57677Q);
                    C21518u.m54176b(phoneLoginMethod);
                }
            }
            String str2 = "login_success";
            C20856a a = new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n);
            String str3 = "platform";
            if (this.f57690r) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            C26890h.m65011a(str2, a.mo44776a(str3, str).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
            AgeGateResponse ageGateResponse = null;
            if (!iVar.mo24646b().f34477e || this.f57664C == 6) {
                if ((getActivity() instanceof MusLoginActivity) && this.f57689q) {
                    ((MusLoginActivity) getActivity()).f57198a = null;
                }
                if (this.f57511d != null) {
                    Bundle bundle = new Bundle(getArguments());
                    bundle.putString("platform", "mobile");
                    if (this.f57664C != 6) {
                        bundle.putString("login_path", "phone_sms");
                    } else {
                        bundle.putString("login_path", "email_or_username");
                    }
                    this.f57511d.mo45026a(bundle);
                }
                return;
            }
            if ((getActivity() instanceof MusLoginActivity) && this.f57689q) {
                ageGateResponse = ((MusLoginActivity) getActivity()).f57198a;
            }
            Bundle bundle2 = new Bundle(getArguments());
            if (ageGateResponse != null) {
                bundle2.putSerializable("age_gate_response", ageGateResponse);
            }
            bundle2.putBoolean("new_user_need_set_pass_word", true);
            bundle2.putInt("set_pass_scene", 2);
            bundle2.putString("login_path", "phone_sms");
            if (this.f57511d != null) {
                this.f57511d.mo45026a(bundle2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45378b(View view) {
        int i;
        String str;
        if (this.f57664C == 6) {
            if (getArguments() != null) {
                this.f57671J.mo24625a(getArguments().getString("email"), (String) null, getArguments().getString("pass_word"), 1, (String) null, (Map) null, (String) null, (C13131h) new C13131h() {
                    public final void onSuccess(C12993e<C13109h> eVar) {
                    }

                    public final void onError(C12993e<C13109h> eVar, int i) {
                        C10691a.m21546b(C21227aw.this.getContext(), eVar.f34001d, 0).mo19066a();
                    }
                });
                C26890h.m65011a("send_email_code", new C20856a().mo44776a("send_method", "resend").mo44776a("send_reason", "trigger_verification").f56798a);
                this.f57697y.mo45750a();
            }
        } else if (this.f57664C != 7) {
            if (this.f57665D) {
                i = C22165u.f59761a;
            } else {
                i = C22165u.f59781u;
            }
            this.f57669H = i;
            String str2 = "";
            if (this.f57668G != null) {
                this.f57669H = this.f57668G.mo45269j();
                str2 = this.f57668G.mo45266h();
            }
            String str3 = str2;
            if (this.f57690r) {
                int i2 = this.f57669H;
                boolean a = C22299f.m55184a();
                C20900b.m53233a(getActivity(), mo45384l(), "", i2, 0, str3, 1, a ? 1 : 0, this.f57662A).mo24766d();
            } else {
                int i3 = this.f57669H;
                boolean a2 = C22299f.m55184a();
                this.f57671J.mo24611a(mo45384l(), "", i3, 0, str3, 1, a2 ? 1 : 0, (C13139p) this.f57662A);
            }
            this.f57697y.mo45750a();
            if (this.f57690r) {
                str = "send_whatsapp_code";
            } else {
                str = "send_sms";
            }
            if (this.f57664C == 8) {
                C26890h.onEventV3("resend_code_phone");
            } else {
                C26890h.m65011a(str, new C20856a().mo44776a("send_method", "resend").mo44774a("send_reason", this.f57669H).mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).f56798a);
            }
        } else if (getArguments() != null) {
            this.f57671J.mo24625a(getArguments().getString("email"), (String) null, (String) null, 4, (String) null, (Map) null, (String) null, (C13131h) new C13131h() {
                public final void onSuccess(C12993e<C13109h> eVar) {
                }

                public final void onError(C12993e<C13109h> eVar, int i) {
                    C10691a.m21546b(C21227aw.this.getContext(), eVar.f34001d, 0).mo19066a();
                }
            });
            C26890h.m65011a("send_email_code", new C20856a().mo44776a("send_method", "resend").mo44776a("send_reason", "reset_password").f56798a);
            this.f57697y.mo45750a();
        }
    }

    /* renamed from: a */
    public final void mo45374a(int i, String str) {
        String str2;
        String str3;
        if (this.f57664C == 6) {
            C22093d.m54876a(1, i, str);
        } else {
            C22093d.m54879b(false, i, str);
        }
        if (isViewValid() && getContext() != null) {
            String str4 = "login_failure";
            C20856a aVar = new C20856a();
            String str5 = "platform";
            if (this.f57690r) {
                str2 = "whatsapp";
            } else {
                str2 = "sms_verification";
            }
            C26890h.m65011a(str4, aVar.mo44776a(str5, str2).mo44776a("enter_method", this.f57515m).mo44776a("enter_type", this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
            if (i == 2006) {
                this.f57695w.setVisibility(0);
                this.f57696x.setText(str);
            } else if (i == 2027 || i == 2028) {
                if (TextUtils.isEmpty(str)) {
                    str3 = getString(R.string.c2p);
                } else {
                    str3 = str;
                }
                C10691a.m21545b(getContext(), str3).mo19066a();
            } else {
                this.f57695w.setVisibility(0);
                this.f57696x.setText(getResources().getString(R.string.cd9));
            }
            this.f57694v.setBackgroundColor(getResources().getColor(R.color.xn));
            m53777a(0, i, str);
            mo45160a();
        }
    }

    /* renamed from: b */
    public final void mo45377b(int i, String str) {
        String str2;
        String str3;
        if (this.f57664C == 6) {
            C22093d.m54876a(1, i, str);
        } else {
            C22093d.m54879b(false, i, str);
        }
        if (isViewValid() && getContext() != null) {
            String str4 = "login_failure";
            C20856a aVar = new C20856a();
            String str5 = "platform";
            if (this.f57690r) {
                str2 = "whatsapp";
            } else {
                str2 = "sms_verification";
            }
            C26890h.m65011a(str4, aVar.mo44776a(str5, str2).mo44776a("enter_method", this.f57515m).mo44776a("enter_type", this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
            this.f57695w.setVisibility(0);
            if (i == 2006) {
                this.f57696x.setText(str);
            } else if (i == 2027 || i == 2028) {
                if (TextUtils.isEmpty(str)) {
                    str3 = getString(R.string.c2p);
                } else {
                    str3 = str;
                }
                C10691a.m21545b(getContext(), str3).mo19066a();
            } else {
                this.f57696x.setText(getResources().getString(R.string.c_0));
            }
            this.f57694v.setBackgroundColor(getResources().getColor(R.color.xn));
            m53777a(0, i, str);
            mo45160a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C0198r rVar;
        String str;
        boolean z;
        C21569a aVar;
        super.onViewCreated(view, bundle);
        this.f57671J = C13081d.m26312a(getContext());
        this.f57687aa = new C9381g(this);
        String str2 = null;
        if (getArguments() != null && getArguments().getBoolean("reset_ticker", false)) {
            if (this.f57511d == null) {
                aVar = null;
            } else {
                aVar = this.f57511d.mo45024a(0);
            }
            if (!(aVar == null || aVar.f58506b == null || aVar.f58506b.f60053c <= 0)) {
                C22285w wVar = aVar.f58506b;
                wVar.mo46379a();
                wVar.f60053c = 0;
                if (wVar.f60054d != null) {
                    wVar.f60054d.mo45762a(wVar.f60053c);
                }
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.d0m);
        if (this.f57668G != null && !TextUtils.isEmpty(this.f57668G.mo45259b())) {
            textView.setText(this.f57668G.mo45259b());
        }
        this.f57679S = (TextView) view.findViewById(R.id.bxj);
        this.f57693u = (EditText) view.findViewById(R.id.abz);
        this.f57694v = view.findViewById(R.id.abl);
        this.f57682V = (LoginButton) view.findViewById(R.id.o9);
        this.f57682V.setLoginBackgroundRes(R.drawable.cgq);
        this.f57682V.setAutoMirrored(false);
        this.f57682V.setLoadingBackground(R.drawable.ch1);
        this.f57683W = (DmtButton) view.findViewById(R.id.np);
        this.f57684X = (DmtStatusView) view.findViewById(R.id.csv);
        this.f57684X.setBuilder(C10719a.m21676a(getContext()));
        this.f57697y = (MusCountDownView) view.findViewById(R.id.bns);
        this.f57695w = view.findViewById(R.id.dvj);
        this.f57696x = (TextView) view.findViewById(R.id.dvi);
        this.f57680T = (AutoLinefeedTextView) view.findViewById(R.id.da5);
        this.f57681U = view.findViewById(R.id.of);
        this.f57685Y = (TextView) view.findViewById(R.id.aki);
        if (!(this.f57664C == 6 || this.f57664C == 7)) {
            this.f57697y.setTargetView(this.f57685Y);
        }
        this.f57681U.setVisibility(8);
        if (this.f57664C == 2) {
            this.f57680T.setText(R.string.c94);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57676P);
        sb.append(" ");
        sb.append(this.f57677Q);
        String sb2 = sb.toString();
        if (this.f57664C == 8) {
            this.f57680T.setText(getContext().getResources().getString(R.string.dxt, new Object[]{C21134a.m53620a(sb2)}));
            this.f57683W.setVisibility(0);
            this.f57682V.setVisibility(8);
            this.f57679S.setVisibility(8);
            ((SendVerificationCodeActivity) getActivity()).f57418c = new C21253ax(this);
        } else {
            this.f57683W.setVisibility(8);
            this.f57682V.setVisibility(0);
        }
        if (this.f57664C == 3 || this.f57664C == 4 || this.f57664C == 5 || this.f57664C == 8) {
            String a = C21134a.m53620a(sb2);
            this.f57680T.mo46080a(getString(R.string.caq, a), a);
            this.f57679S.setVisibility(8);
        } else if (this.f57664C == 6 || this.f57664C == 7) {
            textView.setText(R.string.c9r);
            this.f57680T.setText(R.string.c9p);
            this.f57679S.setText(this.f57678R);
            this.f57693u.setHint(R.string.c9b);
            this.f57693u.setInputType(128);
            if (this.f57693u.getFilters() == null) {
                this.f57693u.setFilters(new InputFilter[]{new LengthFilter(6)});
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f57693u.getFilters().length) {
                        z = false;
                        break;
                    } else if (this.f57693u.getFilters()[i2] instanceof LengthFilter) {
                        this.f57693u.getFilters()[i2] = new LengthFilter(6);
                        this.f57693u.setFilters(this.f57693u.getFilters());
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    InputFilter[] inputFilterArr = new InputFilter[(this.f57693u.getFilters().length + 1)];
                    System.arraycopy(this.f57693u.getFilters(), 0, inputFilterArr, 0, inputFilterArr.length - 1);
                    inputFilterArr[inputFilterArr.length - 1] = new LengthFilter(6);
                    this.f57693u.setFilters(inputFilterArr);
                }
            }
        } else if (!this.f57690r) {
            this.f57680T.mo46080a(getString(R.string.caq, sb2), sb2);
            this.f57679S.setVisibility(8);
        } else {
            textView.setText(R.string.ayj);
            this.f57680T.mo46080a(getString(R.string.ff5, sb2), sb2);
            this.f57679S.setVisibility(8);
        }
        if (this.f57690r) {
            i = R.string.x5;
        } else {
            i = R.string.x6;
        }
        String string = getString(i);
        String string2 = getString(R.string.b8j);
        Factory instance = Factory.getInstance();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(" ");
        sb3.append(string2);
        Spannable newSpannable = instance.newSpannable(sb3.toString());
        newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.j6)), string.length(), newSpannable.length(), 33);
        this.f57685Y.setText(newSpannable);
        this.f57685Y.setOnClickListener(new C21254ay(this));
        this.f57683W.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m58184c(C21227aw.this.f57693u);
                C21227aw.this.mo45382j();
                if (C21227aw.this.f57664C != 8 || !C21227aw.this.f57673L) {
                    if (C21227aw.this.f57668G != null) {
                        C21227aw.this.f57668G.mo45256a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), new C21100e() {
                            /* renamed from: a */
                            public final void mo45153a() {
                                C22091c.m54871a(0, "bindPhone", 0, "");
                                C21227aw.this.f57673L = true;
                                if (C21227aw.this.f57664C == 8) {
                                    C26890h.m65011a("set_up_proAccount", new C20856a().mo44776a("page", "Input Phone Captcha").mo44776a("method", "set_by_phone").mo44775a("duration", System.currentTimeMillis() - C21227aw.this.f57698z.longValue()).f56798a);
                                    C21227aw.this.mo45386n();
                                    return;
                                }
                                C23826bi.m58451a(7, 1, (Object) new C27983t(C21227aw.this.mo45384l(), ""));
                                if (C21227aw.this.getActivity() != null && C21227aw.this.isViewValid()) {
                                    C21227aw.this.f57695w.setVisibility(8);
                                    C21227aw.this.f57694v.setBackgroundColor(C21227aw.this.getResources().getColor(R.color.a3v));
                                    if (!TextUtils.isEmpty(C21227aw.this.f57668G.mo45270k())) {
                                        new C21024h().mo45000a(C21227aw.this.f57668G.mo45270k()).mo44990b();
                                    }
                                    if (C21227aw.this.f57668G != null) {
                                        C21227aw.this.f57668G.dismiss();
                                    }
                                }
                            }

                            /* renamed from: a */
                            public final void mo45154a(String str, int i) {
                                C22091c.m54871a(1, "bindPhone", i, str);
                                if (C21227aw.this.getActivity() != null && C21227aw.this.isViewValid()) {
                                    C21227aw.this.f57695w.setVisibility(0);
                                    C21227aw.this.f57694v.setBackgroundColor(C21227aw.this.getResources().getColor(R.color.xn));
                                    if (i == 1202) {
                                        C21227aw.this.f57696x.setText(C21227aw.this.getResources().getString(R.string.cd9));
                                    } else {
                                        C21227aw.this.f57696x.setText(C21227aw.this.getResources().getString(R.string.c_0));
                                    }
                                    C21227aw.this.mo45383k();
                                }
                            }
                        });
                    }
                } else if (C21227aw.this.f57674M) {
                    C21227aw.this.mo45387o();
                } else {
                    C21227aw.this.mo45386n();
                }
            }
        });
        this.f57682V.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                String str2;
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(C21227aw.this.mo45385m())) {
                    C21227aw.this.mo45382j();
                    if (C21227aw.this.f57668G != null) {
                        C21227aw.this.f57668G.mo45256a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), new C21100e() {
                            /* renamed from: a */
                            public final void mo45153a() {
                                if (C21227aw.this.f57664C == 5) {
                                    C22091c.m54871a(0, "bindPhone", 0, "");
                                } else if (C21227aw.this.f57664C == 4) {
                                    C22091c.m54872b(0, "ChangePhone", 0, "");
                                }
                                if (C21227aw.this.getActivity() != null && C21227aw.this.isViewValid()) {
                                    C21227aw.this.f57695w.setVisibility(8);
                                    C21227aw.this.f57694v.setBackgroundColor(C21227aw.this.getResources().getColor(R.color.a3v));
                                    C21227aw.this.mo45160a();
                                    if (!TextUtils.isEmpty(C21227aw.this.f57668G.mo45270k())) {
                                        new C21024h().mo45000a(C21227aw.this.f57668G.mo45270k()).mo44990b();
                                    }
                                    if (C21227aw.this.f57668G != null) {
                                        C21227aw.this.f57668G.dismiss();
                                    }
                                }
                            }

                            /* renamed from: a */
                            public final void mo45154a(String str, int i) {
                                if (C21227aw.this.f57664C == 5) {
                                    C22091c.m54871a(1, "bindPhone", i, str);
                                } else if (C21227aw.this.f57664C == 4) {
                                    C22091c.m54872b(1, "changePhone", i, str);
                                }
                                if (C21227aw.this.getActivity() != null && C21227aw.this.isViewValid()) {
                                    C21227aw.this.f57695w.setVisibility(0);
                                    C21227aw.this.f57694v.setBackgroundColor(C21227aw.this.getResources().getColor(R.color.xn));
                                    C21227aw.this.mo45160a();
                                    if (i == 1202) {
                                        C21227aw.this.f57696x.setText(C21227aw.this.getResources().getString(R.string.cd9));
                                    } else {
                                        C21227aw.this.f57696x.setText(C21227aw.this.getResources().getString(R.string.c_0));
                                    }
                                }
                            }
                        });
                    } else if (C21227aw.this.f57664C == 6) {
                        if (C21227aw.this.getArguments() != null) {
                            C21227aw.this.f57671J.mo24616a(C21227aw.this.getArguments().getString("email"), C21227aw.this.mo45385m(), 1, (Map) null, (String) null, (C13130g) new C13130g() {
                                public final void onSuccess(C12993e<C13108g> eVar) {
                                    C22093d.m54876a(0, 0, "");
                                    C26890h.m65011a("email_code_verification_result", new C20856a().mo44776a("enter_from", "register").mo44774a("is_success", 1).f56798a);
                                    C21227aw.this.mo45160a();
                                    C23826bi.m58455a(((C13108g) eVar.f34007h).f34263f);
                                    C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                                }

                                public final void onError(C12993e<C13108g> eVar, int i) {
                                    C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                                    C26890h.m65011a("email_code_verification_result", new C20856a().mo44776a("enter_from", "register").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).f56798a);
                                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21227aw.this.f57515m).mo44776a("enter_type", C21227aw.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                                    C21227aw.this.mo45160a();
                                    C10691a.m21546b(C21227aw.this.getContext(), eVar.f34001d, 0).mo19066a();
                                }
                            });
                        }
                    } else if (C21227aw.this.f57664C != 7) {
                        C21227aw.this.mo45329g();
                        String str3 = "login_submit";
                        C20856a a = new C20856a().mo44776a("enter_method", C21227aw.this.f57515m).mo44776a("enter_from", C21227aw.this.f57514l).mo44776a("enter_type", C21227aw.this.f57516n);
                        String str4 = "platform";
                        if (C21227aw.this.f57690r) {
                            str = "whatsapp";
                        } else {
                            str = "sms_verification";
                        }
                        C26890h.m65011a(str3, a.mo44776a(str4, str).mo44776a("group_id", C21021e.m53409a(C21227aw.this.getArguments())).mo44776a("log_pb", C21021e.m53412b(C21227aw.this.getArguments())).f56798a);
                        if (C21227aw.this.f57664C == 2) {
                            C21022f fVar = new C21022f();
                            if (C21227aw.this.f57664C == 2) {
                                str2 = "security_check";
                            } else {
                                str2 = C21227aw.this.f57514l;
                            }
                            C21022f b = fVar.mo44994a(str2).mo44995b("phone");
                            b.f57150b = "1039";
                            b.mo44990b();
                        } else {
                            new C21022f().mo44994a(C21227aw.this.f57514l).mo44995b("phone").mo44990b();
                        }
                        if (!C20884b.m53202c()) {
                            if (C21227aw.this.f57689q) {
                                C21227aw.this.f57671J.mo24622a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), Integer.valueOf(0), "", (C13133j) new C21051g(C21227aw.this) {
                                    /* renamed from: b */
                                    public final void mo45099b(C12993e<C13116o> eVar) {
                                        C23826bi.m58455a(((C13116o) eVar.f34007h).f34302e);
                                        C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                                    }

                                    public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                                        super.onNeedSecureCaptcha((C12993e) bVar);
                                        if (C21227aw.this.isViewValid()) {
                                            C21227aw.this.mo45383k();
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo45096a(int i, String str) {
                                        C21227aw.this.mo45374a(i, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo45098b(int i, String str) {
                                        C21227aw.this.mo45377b(i, str);
                                    }
                                });
                            } else {
                                C21227aw.this.f57671J.mo24629a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), "", (C13135l) new C21114s(C21227aw.this) {
                                    /* renamed from: a */
                                    public final void mo45165a(String str) {
                                        C21227aw.this.mo45380c(str);
                                    }

                                    public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                                        super.onNeedSecureCaptcha((C12993e) bVar);
                                        if (C21227aw.this.isViewValid()) {
                                            C21227aw.this.mo45383k();
                                        }
                                    }

                                    public final void onSuccess(C12993e<C13115n> eVar) {
                                        C23826bi.m58455a(((C13115n) eVar.f34007h).f34297e);
                                        C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                                    }

                                    /* renamed from: a */
                                    public final void mo45164a(int i, String str) {
                                        C21227aw.this.mo45374a(i, str);
                                    }
                                });
                            }
                        } else if (C21227aw.this.f57665D) {
                            C21227aw.this.f57671J.mo24635a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), "", "", (C13137n) new C21116u(C21227aw.this) {
                                /* renamed from: a */
                                public final void mo45167a(String str) {
                                    C21227aw.this.mo45380c(str);
                                }

                                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                                    super.onNeedSecureCaptcha((C12993e) bVar);
                                    if (C21227aw.this.isViewValid()) {
                                        C21227aw.this.mo45383k();
                                    }
                                }

                                public final void onSuccess(C12993e<C13118q> eVar) {
                                    C23826bi.m58455a(((C13118q) eVar.f34007h).f34308e);
                                    C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                                }

                                /* renamed from: a */
                                public final void mo45166a(int i, String str) {
                                    C21227aw.this.mo45374a(i, str);
                                }
                            });
                        } else {
                            C21227aw.this.f57671J.mo24622a(C21227aw.this.mo45384l(), C21227aw.this.mo45385m(), Integer.valueOf(0), "", (C13133j) new C21051g(C21227aw.this) {
                                /* renamed from: b */
                                public final void mo45099b(C12993e<C13116o> eVar) {
                                    C21227aw.this.mo45375a((C13110i) eVar.f34007h);
                                }

                                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                                    super.onNeedSecureCaptcha((C12993e) bVar);
                                    if (C21227aw.this.isViewValid()) {
                                        C21227aw.this.mo45383k();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo45096a(int i, String str) {
                                    C21227aw.this.mo45374a(i, str);
                                }

                                /* renamed from: b */
                                public final void mo45098b(int i, String str) {
                                    C21227aw.this.mo45377b(i, str);
                                }
                            });
                        }
                    } else if (C21227aw.this.getArguments() != null) {
                        C21227aw.this.f57671J.mo24615a(C21227aw.this.getArguments().getString("email"), C21227aw.this.mo45385m(), 4, (Map) null, (String) null, (C13000a) new C13000a() {
                            public final /* synthetic */ void onSuccess(C12990b bVar) {
                                C13012a aVar = (C13012a) bVar;
                                C21227aw.this.mo45160a();
                                C26890h.m65011a("email_code_verification_result", new C20856a().mo44776a("enter_from", "forget_password").mo44774a("is_success", 1).f56798a);
                                C21168a aVar2 = (C21168a) C22271m.m55124a(C21259bc.class, C21227aw.this.getArguments()).mo46371a("set_pass_scene", 4).mo46372a("enter_type", C21227aw.this.f57516n).mo46372a("ticket", aVar.f34024h).mo46370a();
                                aVar2.mo45323a(C21227aw.this.f57511d);
                                C21227aw.this.mo45321a((Fragment) aVar2, false);
                            }

                            public final /* synthetic */ void onError(C12990b bVar, int i) {
                                C13012a aVar = (C13012a) bVar;
                                C21227aw.this.mo45160a();
                                C10691a.m21546b(C21227aw.this.getContext(), aVar.f34001d, 0).mo19066a();
                                C26890h.m65011a("email_code_verification_result", new C20856a().mo44776a("enter_from", "forget_password").mo44774a("is_success", 0).mo44774a("error_code", aVar.f34000c).f56798a);
                            }
                        });
                    }
                }
            }
        });
        this.f57693u.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                C21227aw.this.mo45379b(editable.toString());
            }
        });
        this.f57697y.setOnClickListener(new C21255az(this));
        if (this.f57511d != null) {
            this.f57697y.setTickListener(this.f57511d);
        }
        m53778p();
        m53780r();
        if (getActivity() instanceof MusLoginActivity) {
            rVar = ((MusLoginActivity) getActivity()).mo45037e();
        } else if (this.f57668G != null) {
            rVar = this.f57668G.mo45271l();
        } else {
            rVar = null;
        }
        if (rVar != null) {
            if (!TextUtils.isEmpty((CharSequence) rVar.getValue())) {
                this.f57693u.setText((CharSequence) rVar.getValue());
                m53779q();
                rVar.setValue("");
            }
            rVar.observe(this, new C21258bb(this));
        }
        if (bundle == null) {
            this.f57679S.postDelayed(new C21257ba(this), 500);
            String str3 = this.f57676P;
            String str4 = this.f57677Q;
            C212467 r0 = new C22044a() {
                /* renamed from: a */
                public final void mo45313a(boolean z) {
                    String str;
                    if (C21227aw.f57661o) {
                        StringBuilder sb = new StringBuilder("Voice verification code ");
                        if (z) {
                            str = "available";
                        } else {
                            str = "disabled";
                        }
                        sb.append(str);
                    }
                    if (C21227aw.this.f57697y != null) {
                        C21227aw.this.f57697y.setVoiceCodeEnabled(z);
                    }
                }
            };
            CharSequence charSequence = str4;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence charSequence2 = str3;
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (str3 == null) {
                        C52711k.m112234a();
                    }
                    if (C52830p.m112456b(charSequence2, (CharSequence) "+", false, 2, (Object) null)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C52830p.m112447b(charSequence2).toString());
                        if (str4 != null) {
                            if (str4 != null) {
                                str2 = C52830p.m112447b(charSequence).toString();
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        sb4.append(str2);
                        str = sb4.toString();
                    } else {
                        StringBuilder sb5 = new StringBuilder("+");
                        sb5.append(C52830p.m112447b(charSequence2).toString());
                        if (str4 != null) {
                            if (str4 != null) {
                                str2 = C52830p.m112447b(charSequence).toString();
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        sb5.append(str2);
                        str = sb5.toString();
                    }
                    C52711k.m112236a((Object) str, "if (countryCode!!.contai…    .toString()\n        }");
                    C22049e.m54782a(str, r0);
                }
            }
            r0.mo45313a(false);
        }
    }

    /* renamed from: a */
    private void m53777a(int i, int i2, String str) {
        if (this.f57689q) {
            C21355h.m53982d(i, i2, str);
        } else {
            C21355h.m53981c(i, i2, str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b02, viewGroup, false);
    }
}
