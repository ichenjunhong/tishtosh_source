package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20887a;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20892f;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20893g;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C20941a;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.C22043z;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22013k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.util.C22260b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a */
public final class C21862a extends C21868b implements C20893g, C20941a {

    /* renamed from: a */
    public C20892f f59188a;

    /* renamed from: b */
    public String f59189b;

    /* renamed from: c */
    public boolean f59190c;

    /* renamed from: d */
    public int f59191d;

    /* renamed from: e */
    public boolean f59192e;

    /* renamed from: j */
    private int f59193j = C21850i.AGE_GATE_SIGN_UP.getValue();

    /* renamed from: k */
    private String f59194k;

    /* renamed from: p */
    private int f59195p = -3001;

    /* renamed from: q */
    private int f59196q;

    /* renamed from: r */
    private int f59197r;

    /* renamed from: s */
    private boolean f59198s = true;

    /* renamed from: t */
    private HashMap f59199t;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$a */
    static final class C21863a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21862a f59200a;

        C21863a(C21862a aVar) {
            this.f59200a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C23826bi.m58465f().notifyFinish();
            if (this.f59200a.getActivity() != null) {
                FragmentActivity activity = this.f59200a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$b */
    static final class C21864b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21862a f59201a;

        C21864b(C21862a aVar) {
            this.f59201a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("choose_birthday_next", new C20856a().mo44776a("enter_method", this.f59201a.mo45967m()).f56798a);
            this.f59201a.f59191d = 0;
            C20892f fVar = this.f59201a.f59188a;
            if (fVar == null) {
                C52711k.m112237a("mPresenter");
            }
            fVar.mo44837a(this.f59201a.f59190c, !this.f59201a.f59190c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$c */
    static final class C21865c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21862a f59202a;

        C21865c(C21862a aVar) {
            this.f59202a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Bundle arguments = this.f59202a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C52711k.m112236a((Object) arguments, "arguments ?: Bundle()");
            arguments.putBoolean("ftc_detect", this.f59202a.f59190c);
            arguments.putInt("age_gate_init_type", C22013k.m54759b(this.f59202a.mo45965k()));
            C21862a aVar = this.f59202a;
            arguments.putInt("next_page", C21850i.CREATE_ACCOUNT.getValue());
            aVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$d */
    static final class C21866d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21862a f59203a;

        C21866d(C21862a aVar) {
            this.f59203a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Bundle arguments = this.f59203a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C52711k.m112236a((Object) arguments, "arguments ?: Bundle()");
            arguments.putInt("age_gate_init_type", C22013k.m54759b(this.f59203a.mo45965k()));
            C21862a aVar = this.f59203a;
            arguments.putInt("next_page", C21850i.CREATE_ACCOUNT.getValue());
            aVar.mo45961a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$e */
    static final class C21867e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21862a f59204a;

        C21867e(C21862a aVar) {
            this.f59204a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f59204a.f59192e) {
                this.f59204a.f59191d = -99;
            }
            FragmentActivity activity = this.f59204a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            C26890h.m65011a("age_gate_eligible_popup_confirm", new C20856a().mo44776a("platform", this.f59204a.f59189b).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59199t == null) {
            this.f59199t = new HashMap();
        }
        View view = (View) this.f59199t.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59199t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59199t != null) {
            this.f59199t.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0n;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: j */
    private final boolean m54546j() {
        if (this.f59196q == 1 || this.f59197r == 1) {
            return true;
        }
        return false;
    }

    public final void ad_() {
        ((LoadingButton) mo44862a((int) R.id.dxl)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a((int) R.id.dxl)).mo46296b();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f59188a != null) {
            C20892f fVar = this.f59188a;
            if (fVar == null) {
                C52711k.m112237a("mPresenter");
            }
            fVar.mo44839c();
        }
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        if (this.f59190c || this.f59193j == C21850i.AGE_GATE.getValue()) {
            return true;
        }
        C22260b.m55106a("");
        if (this.f59198s) {
            boolean j = m54546j();
            AgeGateResponse ageGateResponse = new AgeGateResponse(this.f59195p, "", false, 0, 0, 24, null);
            C22043z.m54776a(j, ageGateResponse, this.f59189b);
        }
        if (!this.f59192e) {
            return false;
        }
        this.f59191d = 0;
        m54547u();
        return true;
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        String str;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (!this.f59190c) {
            aVar.f59179a = getString(R.string.adw);
            str = getString(R.string.c8t);
        } else {
            aVar.f59179a = null;
            if (m54546j()) {
                str = getString(R.string.c_n);
            } else {
                str = getString(R.string.fq9);
            }
        }
        aVar.f59183e = str;
        aVar.f59182d = getString(R.string.fqa);
        aVar.f59186h = false;
        return aVar;
    }

    public final void ak_() {
        this.f59191d = -1;
        boolean j = m54546j();
        C20892f fVar = this.f59188a;
        if (fVar == null) {
            C52711k.m112237a("mPresenter");
        }
        C20887a aVar = (C20887a) fVar.mo54803n();
        C52711k.m112236a((Object) aVar, "mPresenter.model");
        C22043z.m54776a(j, (AgeGateResponse) aVar.getData(), this.f59189b);
        if (this.f59193j != C21850i.AGE_GATE.getValue()) {
            if (getActivity() instanceof SignUpOrLoginActivity) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) activity;
                    C20892f fVar2 = this.f59188a;
                    if (fVar2 == null) {
                        C52711k.m112237a("mPresenter");
                    }
                    C20887a aVar2 = (C20887a) fVar2.mo54803n();
                    C52711k.m112236a((Object) aVar2, "mPresenter.model");
                    signUpOrLoginActivity.f59173a = (AgeGateResponse) aVar2.getData();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                }
            } else {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    C52711k.m112234a();
                }
                String str = "age_gate_response";
                C20892f fVar3 = this.f59188a;
                if (fVar3 == null) {
                    C52711k.m112237a("mPresenter");
                }
                C20887a aVar3 = (C20887a) fVar3.mo54803n();
                C52711k.m112236a((Object) aVar3, "mPresenter.model");
                arguments.putSerializable(str, (Serializable) aVar3.getData());
            }
        }
        m54547u();
    }

    /* renamed from: u */
    private final void m54547u() {
        int i = this.f59193j;
        if (i != C21850i.AGE_GATE_SIGN_UP.getValue()) {
            if (i == C21850i.AGE_GATE.getValue()) {
                C20892f fVar = this.f59188a;
                if (fVar == null) {
                    C52711k.m112237a("mPresenter");
                }
                C20887a aVar = (C20887a) fVar.mo54803n();
                C52711k.m112236a((Object) aVar, "mPresenter.model");
                if (((AgeGateResponse) aVar.getData()).is_prompt()) {
                    Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
                    String str = "age_gate_response";
                    C20892f fVar2 = this.f59188a;
                    if (fVar2 == null) {
                        C52711k.m112237a("mPresenter");
                    }
                    C20887a aVar2 = (C20887a) fVar2.mo54803n();
                    C52711k.m112236a((Object) aVar2, "mPresenter.model");
                    intent.putExtra(str, (Serializable) aVar2.getData());
                    startActivity(intent);
                    if (getActivity() != null) {
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        activity.finish();
                    }
                } else {
                    C10643a aVar3 = new C10643a(getActivity());
                    aVar3.mo18885a((int) R.string.fq5);
                    aVar3.mo18899b((int) R.string.fq3);
                    aVar3.mo18886a((int) R.string.ahm, (OnClickListener) new C21863a(this));
                    aVar3.mo18897a().mo18882b().setCancelable(false);
                }
            } else if (i == C21850i.THIRD_PARTY_FTC_AGE_GATE.getValue()) {
                if (getActivity() != null) {
                    Intent intent2 = new Intent();
                    String str2 = "age_gate_response";
                    C20892f fVar3 = this.f59188a;
                    if (fVar3 == null) {
                        C52711k.m112237a("mPresenter");
                    }
                    C20887a aVar4 = (C20887a) fVar3.mo54803n();
                    C52711k.m112236a((Object) aVar4, "mPresenter.model");
                    intent2.putExtra(str2, (Serializable) aVar4.getData());
                    FragmentActivity activity2 = getActivity();
                    if (activity2 == null) {
                        C52711k.m112234a();
                    }
                    activity2.setResult(-1, intent2);
                    FragmentActivity activity3 = getActivity();
                    if (activity3 == null) {
                        C52711k.m112234a();
                    }
                    activity3.finish();
                }
            } else if (i == C21850i.AGE_GATE_LOGIN.getValue()) {
                if (C21472c.m54111a()) {
                    Bundle arguments = getArguments();
                    if (arguments == null) {
                        C52711k.m112234a();
                    }
                    arguments.putInt("next_page", C21850i.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                    arguments.putString("phone_number_format", C21134a.m53619a(C21839d.f59130a.mo45973b((Fragment) this)));
                    String str3 = "sms_code_key";
                    String str4 = this.f59194k;
                    if (str4 == null) {
                        C52711k.m112234a();
                    }
                    arguments.putString(str3, str4);
                    C52711k.m112236a((Object) arguments, "arguments!!.apply {\n    …!!)\n                    }");
                    mo45961a(arguments);
                    return;
                }
                C21829b bVar = this;
                String a = C21134a.m53619a(C21839d.f59130a.mo45973b((Fragment) this));
                C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNumber(phoneNumber)");
                String str5 = this.f59194k;
                if (str5 == null) {
                    C52711k.m112234a();
                }
                C21677s.m54407a(bVar, a, str5, C21848h.SIGN_UP, mo45965k()).mo6491b();
            } else if (i == C21850i.THIRD_PARTY_AGE_GATE.getValue()) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                C52711k.m112236a((Object) arguments2, "arguments ?: Bundle()");
                if (this.f59191d != -1 || !C21472c.m54111a()) {
                    arguments2.putInt("next_page", C21850i.FINISH.getValue());
                    arguments2.putInt("result_code", this.f59191d);
                    mo45961a(arguments2);
                } else {
                    arguments2.putInt("next_page", C21850i.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                    mo45961a(arguments2);
                }
            }
        } else if (C21472c.m54111a()) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C52711k.m112234a();
            }
            arguments3.putInt("next_page", C21850i.TERMS_CONSENT_SIGN_UP.getValue());
            C52711k.m112236a((Object) arguments3, "arguments!!.apply {\n    …ue)\n                    }");
            mo45961a(arguments3);
        } else {
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C52711k.m112234a();
            }
            arguments4.putInt("next_page", C21850i.PHONE_EMAIL_SIGN_UP.getValue());
            C52711k.m112236a((Object) arguments4, "arguments!!.apply {\n    …ue)\n                    }");
            mo45961a(arguments4);
        }
    }

    /* renamed from: a */
    public final void mo44802a(boolean z) {
        if (isViewValid()) {
            if (z) {
                ((LoadingButton) mo44862a((int) R.id.dxl)).mo46295a();
                return;
            }
            ((LoadingButton) mo44862a((int) R.id.dxl)).mo46296b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r4 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            java.lang.String r4 = "compliance_setting"
            com.bytedance.keva.Keva r4 = com.bytedance.keva.Keva.getRepo(r4)
            java.lang.String r0 = "need_to_show_ftc_age_gate_but_no_showed"
            r1 = 0
            r4.storeBoolean(r0, r1)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x001c
            java.lang.String r0 = "age_gate_action"
            int r4 = r4.getInt(r0, r1)
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            r3.f59197r = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x002c
            java.lang.String r0 = "age_gate_register_action"
            int r4 = r4.getInt(r0, r1)
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            r3.f59196q = r4
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.THIRD_PARTY_AGE_GATE
            if (r4 != r0) goto L_0x005b
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0047
            java.lang.String r0 = "platform"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.getString(r0, r2)
            if (r4 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r4 = ""
        L_0x0049:
            r3.f59189b = r4
            r4 = 1
            r3.f59192e = r4
            r3.f59198s = r1
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            int r4 = r4.getValue()
            r3.f59193j = r4
            goto L_0x008e
        L_0x005b:
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = r3.mo45965k()
            int r0 = r0.getValue()
            r3.f59193j = r0
            java.lang.String r0 = "sms_code_key"
            java.lang.String r2 = ""
            java.lang.String r0 = r4.getString(r0, r2)
            r3.f59194k = r0
            java.lang.String r0 = "ftc_detect"
            boolean r4 = r4.getBoolean(r0, r1)
            r3.f59190c = r4
        L_0x007d:
            int r4 = r3.f59193j
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.AGE_GATE_LOGIN
            int r0 = r0.getValue()
            if (r4 != r0) goto L_0x008a
            java.lang.String r4 = "sms_verification"
            goto L_0x008c
        L_0x008a:
            java.lang.String r4 = "phone"
        L_0x008c:
            r3.f59189b = r4
        L_0x008e:
            boolean r4 = r3.m54546j()
            java.lang.String r0 = r3.f59189b
            com.p683ss.android.ugc.aweme.account.login.C22043z.m54777a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21862a.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0211, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44801a(java.lang.Exception r11) {
        /*
            r10 = this;
            boolean r0 = r10.isViewValid()
            if (r0 == 0) goto L_0x035c
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            if (r0 != 0) goto L_0x000e
            goto L_0x035c
        L_0x000e:
            boolean r0 = r11 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.base.api.a.b.a r11 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r11
            int r0 = r11.getErrorCode()
            r10.f59195p = r0
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r11.getErrorMsg()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r1)
            r0.mo19066a()
            boolean r0 = r10.m54546j()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r9 = new com.ss.android.ugc.aweme.account.bean.AgeGateResponse
            int r2 = r11.getErrorCode()
            java.lang.String r3 = r11.getErrorMsg()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = r10.f59189b
            com.p683ss.android.ugc.aweme.account.login.C22043z.m54776a(r0, r9, r11)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.account.agegate.model.f r11 = r10.f59188a
            if (r11 != 0) goto L_0x0052
            java.lang.String r0 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0052:
            com.ss.android.ugc.aweme.common.a r11 = r11.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r11 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r11
            java.lang.String r0 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            java.lang.Object r11 = r11.getData()
            if (r11 != 0) goto L_0x007e
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            android.content.Context r11 = (android.content.Context) r11
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r11, r0)
            r11.mo19066a()
            boolean r11 = r10.m54546j()
            r0 = 0
            java.lang.String r1 = r10.f59189b
            com.p683ss.android.ugc.aweme.account.login.C22043z.m54776a(r11, r0, r1)
            return
        L_0x007e:
            com.ss.android.ugc.aweme.account.agegate.model.f r11 = r10.f59188a
            if (r11 != 0) goto L_0x0087
            java.lang.String r0 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0087:
            com.ss.android.ugc.aweme.common.a r11 = r11.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r11 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r11
            java.lang.String r0 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            java.lang.Object r11 = r11.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r11 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r11
            int r11 = r11.getStatus_code()
            if (r11 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.account.agegate.model.f r11 = r10.f59188a
            if (r11 != 0) goto L_0x00a7
            java.lang.String r0 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00a7:
            com.ss.android.ugc.aweme.common.a r11 = r11.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r11 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r11
            java.lang.String r0 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            java.lang.Object r11 = r11.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r11 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r11
            int r11 = r11.getStatus_code()
            r10.f59195p = r11
            com.ss.android.ugc.aweme.account.agegate.model.f r11 = r10.f59188a
            if (r11 != 0) goto L_0x00c7
            java.lang.String r0 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c7:
            com.ss.android.ugc.aweme.common.a r11 = r11.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r11 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r11
            java.lang.String r0 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            java.lang.Object r11 = r11.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r11 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r11
            java.lang.String r2 = r11.getStatus_msg()
            r11 = r2
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00f2
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            android.content.Context r11 = (android.content.Context) r11
            com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r11, r2)
            r11.mo19066a()
        L_0x00f2:
            boolean r11 = r10.m54546j()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r8 = new com.ss.android.ugc.aweme.account.bean.AgeGateResponse
            int r1 = r10.f59195p
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r10.f59189b
            com.p683ss.android.ugc.aweme.account.login.C22043z.m54776a(r11, r8, r0)
            return
        L_0x010a:
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            boolean r11 = r11 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity
            if (r11 == 0) goto L_0x0149
            int r11 = r10.f59193j
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.AGE_GATE
            int r0 = r0.getValue()
            if (r11 == r0) goto L_0x0149
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            if (r11 == 0) goto L_0x0141
            com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity r11 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity) r11
            com.ss.android.ugc.aweme.account.agegate.model.f r0 = r10.f59188a
            if (r0 != 0) goto L_0x012d
            java.lang.String r1 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x012d:
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r0 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r0
            java.lang.String r1 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r0 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r0
            r11.f59173a = r0
            goto L_0x0149
        L_0x0141:
            d.u r11 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity"
            r11.<init>(r0)
            throw r11
        L_0x0149:
            com.bytedance.ies.dmt.ui.b.a$a r11 = new com.bytedance.ies.dmt.ui.b.a$a
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            r11.<init>(r0)
            boolean r0 = r10.m54546j()
            com.ss.android.ugc.aweme.account.agegate.model.f r1 = r10.f59188a
            if (r1 != 0) goto L_0x0161
            java.lang.String r2 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0161:
            com.ss.android.ugc.aweme.common.a r1 = r1.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r1 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r1
            java.lang.String r2 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Object r1 = r1.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r1 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r1
            java.lang.String r2 = r10.f59189b
            com.p683ss.android.ugc.aweme.account.login.C22043z.m54776a(r0, r1, r2)
            boolean r0 = r10.f59190c
            r1 = 0
            if (r0 == 0) goto L_0x0212
            com.ss.android.ugc.aweme.account.agegate.model.f r0 = r10.f59188a
            if (r0 != 0) goto L_0x0185
            java.lang.String r2 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0185:
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r0 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r0
            java.lang.String r2 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r0 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r0
            int r0 = r0.getAgeGatePostAction()
            switch(r0) {
                case 1: goto L_0x01e0;
                case 2: goto L_0x019e;
                default: goto L_0x019d;
            }
        L_0x019d:
            goto L_0x0211
        L_0x019e:
            android.content.Intent r11 = new android.content.Intent
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Class<com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity> r1 = com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity.class
            r11.<init>(r0, r1)
            java.lang.String r0 = "age_gate_response"
            com.ss.android.ugc.aweme.account.agegate.model.f r1 = r10.f59188a
            if (r1 != 0) goto L_0x01b6
            java.lang.String r2 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x01b6:
            com.ss.android.ugc.aweme.common.a r1 = r1.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r1 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r1
            java.lang.String r2 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Object r1 = r1.getData()
            java.io.Serializable r1 = (java.io.Serializable) r1
            r11.putExtra(r0, r1)
            r10.startActivity(r11)
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            if (r11 == 0) goto L_0x035b
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            if (r11 != 0) goto L_0x01dc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01dc:
            r11.finish()
            goto L_0x0211
        L_0x01e0:
            r0 = 2132546681(0x7f1c1479, float:2.0746587E38)
            r11.mo18885a(r0)
            r0 = 2132546676(0x7f1c1474, float:2.0746577E38)
            r11.mo18899b(r0)
            r0 = 2132544989(0x7f1c0ddd, float:2.0743155E38)
            com.ss.android.ugc.aweme.account.login.v2.ui.a.a$c r2 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.a$c
            r2.<init>(r10)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r11.mo18886a(r0, r2)
            com.bytedance.ies.dmt.ui.b.a r11 = r11.mo18897a()
            android.app.Dialog r11 = r11.mo18882b()
            r11.setCancelable(r1)
            java.lang.String r11 = "f_special_age_popup"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)
            return
        L_0x0211:
            return
        L_0x0212:
            com.ss.android.ugc.aweme.account.agegate.model.f r0 = r10.f59188a
            if (r0 != 0) goto L_0x021b
            java.lang.String r2 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x021b:
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r0 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r0
            java.lang.String r2 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r0 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r0
            int r0 = r0.getRegisterAgeGatePostAction()
            r2 = -99
            switch(r0) {
                case 1: goto L_0x02ea;
                case 2: goto L_0x0237;
                default: goto L_0x0235;
            }
        L_0x0235:
            goto L_0x035b
        L_0x0237:
            r10.f59198s = r1
            com.ss.android.ugc.aweme.account.agegate.model.f r0 = r10.f59188a
            if (r0 != 0) goto L_0x0242
            java.lang.String r3 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0242:
            com.ss.android.ugc.aweme.common.a r0 = r0.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r0 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r0
            java.lang.String r3 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.account.bean.AgeGateResponse r0 = (com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse) r0
            java.lang.String r0 = r0.getStatus_msg()
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x035b
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.account.login.v2.AgeGateBlockExperiment> r5 = com.p683ss.android.ugc.aweme.account.login.p1292v2.AgeGateBlockExperiment.class
            r6 = 1
            java.lang.String r7 = "enhace_age_gate_block"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            boolean r3 = r4.mo18172a(r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x02b2
            java.lang.String r2 = "age_gate_eligible_popup"
            com.ss.android.ugc.aweme.account.a.b.a r3 = new com.ss.android.ugc.aweme.account.a.b.a
            r3.<init>()
            java.lang.String r4 = "platform"
            java.lang.String r5 = r10.f59189b
            com.ss.android.ugc.aweme.account.a.b.a r3 = r3.mo44776a(r4, r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58646a
            com.ss.android.ugc.aweme.account.a.b.a r3 = r3.mo44776a(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58647b
            com.ss.android.ugc.aweme.account.a.b.a r3 = r3.mo44776a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r3)
            r11.mo18902b(r0)
            r0 = 2132543394(0x7f1c07a2, float:2.073992E38)
            com.ss.android.ugc.aweme.account.login.v2.ui.a.a$e r2 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.a$e
            r2.<init>(r10)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r11.mo18886a(r0, r2)
            com.bytedance.ies.dmt.ui.b.a r11 = r11.mo18897a()
            android.app.Dialog r11 = r11.mo18883c()
            r11.setCancelable(r1)
            return
        L_0x02b2:
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            android.content.Context r11 = (android.content.Context) r11
            com.bytedance.ies.dmt.ui.d.a r11 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r11, r0)
            r11.mo19066a()
            java.lang.String r11 = "age_gate_eligible_toast"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "platform"
            java.lang.String r3 = r10.f59189b
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r3)
            java.lang.String r1 = "enter_method"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58646a
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r3)
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58647b
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)
            boolean r11 = r10.f59192e
            if (r11 == 0) goto L_0x035b
            r10.f59191d = r2
            goto L_0x035b
        L_0x02ea:
            r0 = 2132544892(0x7f1c0d7c, float:2.0742958E38)
            r11.mo18885a(r0)
            r0 = 2132546610(0x7f1c1432, float:2.0746443E38)
            r11.mo18899b(r0)
            r0 = 2132542472(0x7f1c0408, float:2.073805E38)
            com.ss.android.ugc.aweme.account.login.v2.ui.a.a$d r3 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.a$d
            r3.<init>(r10)
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            r11.mo18886a(r0, r3)
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            if (r0 == 0) goto L_0x0343
            int r0 = r10.f59193j
            com.ss.android.ugc.aweme.account.login.v2.base.i r3 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.THIRD_PARTY_FTC_AGE_GATE
            int r3 = r3.getValue()
            if (r0 != r3) goto L_0x0343
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "age_gate_response"
            com.ss.android.ugc.aweme.account.agegate.model.f r4 = r10.f59188a
            if (r4 != 0) goto L_0x0323
            java.lang.String r5 = "mPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0323:
            com.ss.android.ugc.aweme.common.a r4 = r4.mo54803n()
            com.ss.android.ugc.aweme.account.agegate.model.a r4 = (com.p683ss.android.ugc.aweme.account.agegate.model.C20887a) r4
            java.lang.String r5 = "mPresenter.model"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = r4.getData()
            java.io.Serializable r4 = (java.io.Serializable) r4
            r0.putExtra(r3, r4)
            android.support.v4.app.FragmentActivity r3 = r10.getActivity()
            if (r3 != 0) goto L_0x0340
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0340:
            r3.setResult(r2, r0)
        L_0x0343:
            com.bytedance.ies.dmt.ui.b.a r11 = r11.mo18897a()
            android.app.Dialog r11 = r11.mo18882b()
            r11.setCancelable(r1)
            java.lang.String r11 = "f_special_age_popup"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)
            return
        L_0x035b:
            return
        L_0x035c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21862a.mo44801a(java.lang.Exception):void");
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        C10691a.m21545b(getContext(), str).mo19066a();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59188a = new C20892f();
        C20892f fVar = this.f59188a;
        if (fVar == null) {
            C52711k.m112237a("mPresenter");
        }
        fVar.mo44836a(this);
        C20884b.m53200a((DatePicker) mo44862a((int) R.id.dxk));
        ((DatePicker) mo44862a((int) R.id.dxk)).mo44936a((C20941a) this);
        mo45997a((LoadingButton) mo44862a((int) R.id.dxl), new C21864b(this));
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.dxl);
        C52711k.m112236a((Object) loadingButton, "ageGateNextButton");
        loadingButton.setEnabled(false);
    }

    /* renamed from: a */
    public final void mo44800a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        C20892f fVar = this.f59188a;
        if (fVar == null) {
            C52711k.m112237a("mPresenter");
        }
        fVar.mo44835a(i, i2, i3);
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.dxl);
        C52711k.m112236a((Object) loadingButton, "ageGateNextButton");
        loadingButton.setEnabled(true);
    }
}
