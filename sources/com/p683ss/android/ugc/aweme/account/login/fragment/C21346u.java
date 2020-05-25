package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13114m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13134k;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20887a;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20892f;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20893g;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C20941a;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.C22043z;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21046b;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21606o;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21606o.C21607a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.AgeGateBlockExperiment;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21014a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21015b;
import com.p683ss.android.ugc.aweme.account.util.C22260b;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.u */
public class C21346u extends C21168a implements OnClickListener, C20893g, C20941a, C21046b, C21607a {

    /* renamed from: A */
    private boolean f57973A;

    /* renamed from: B */
    private boolean f57974B;

    /* renamed from: C */
    private boolean f57975C;

    /* renamed from: D */
    private C21348a f57976D;

    /* renamed from: E */
    private int f57977E = -3001;

    /* renamed from: F */
    private C21606o f57978F;

    /* renamed from: G */
    private C13011d f57979G;

    /* renamed from: o */
    public String f57980o;

    /* renamed from: p */
    public String f57981p;

    /* renamed from: q */
    public String f57982q;

    /* renamed from: r */
    String f57983r;

    /* renamed from: s */
    boolean f57984s = true;

    /* renamed from: t */
    private View f57985t;

    /* renamed from: u */
    private TextView f57986u;

    /* renamed from: v */
    private LoginButton f57987v;

    /* renamed from: w */
    private DatePicker f57988w;

    /* renamed from: x */
    private C20892f f57989x;

    /* renamed from: y */
    private int f57990y = 1;

    /* renamed from: z */
    private String f57991z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.u$a */
    class C21348a extends C13134k {
        private C21348a() {
        }

        public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
            super.onNeedSecureCaptcha((C12993e) bVar);
            if (C21346u.this.isViewValid()) {
                C21346u.this.mo45324a(false);
            }
        }

        public final void onSuccess(C12993e<C13114m> eVar) {
            if (C21346u.this.isViewValid() && C21346u.this.getContext() != null && eVar.f34007h != null && ((C13114m) eVar.f34007h).f34292d != null) {
                C21346u.m53691a(((C13114m) eVar.f34007h).f34292d.f34481i, ((C13114m) eVar.f34007h).f34292d);
                C21355h.m53981c(1, 0, "");
                C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21346u.this.f57515m).mo44776a("enter_from", C21346u.this.f57514l).mo44776a("enter_type", C21346u.this.f57516n).mo44776a("platform", "sms_verification").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_SMS, C21346u.this.f57980o, C21346u.this.f57981p, C21346u.this.f57982q);
                C21518u.m54176b(phoneLoginMethod);
                Bundle bundle = new Bundle(C21346u.this.getArguments());
                if (((C13114m) eVar.f34007h).mo24646b().f34477e) {
                    if (C21346u.this.getActivity() instanceof MusLoginActivity) {
                        AgeGateResponse ageGateResponse = ((MusLoginActivity) C21346u.this.getActivity()).f57198a;
                        if (ageGateResponse != null) {
                            bundle.putSerializable("age_gate_response", ageGateResponse);
                        }
                    }
                    bundle.putBoolean("new_user_need_set_pass_word", true);
                    bundle.putInt("set_pass_scene", 2);
                    bundle.putString("platform", "mobile");
                    if (C21346u.this.f57511d != null) {
                        C21346u.this.f57511d.mo45026a(bundle);
                    }
                    return;
                }
                if (C21346u.this.getActivity() instanceof MusLoginActivity) {
                    ((MusLoginActivity) C21346u.this.getActivity()).f57198a = null;
                }
                if (C21346u.this.f57511d != null) {
                    bundle.putString("platform", "mobile");
                    C21346u.this.f57511d.mo45026a(bundle);
                }
            }
        }

        public final void onError(C12993e<C13114m> eVar, int i) {
            if (C21346u.this.isViewValid() && C21346u.this.getContext() != null) {
                C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "sms_verification").mo44776a("enter_method", C21346u.this.f57515m).mo44776a("enter_type", C21346u.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                C21355h.m53981c(0, eVar.f34000c, eVar.f34001d);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo45081b() {
        if (this.f57973A || this.f57990y == 4) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57989x != null) {
            this.f57989x.mo44839c();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f57978F != null) {
            this.f57978F.mo45032b(this);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f57978F != null) {
            this.f57978F.mo45028a(this);
        }
    }

    /* renamed from: i */
    public final void mo45494i() {
        if (this.f57984s) {
            new C21014a().mo44986b(this.f57983r).mo44984a("0").mo44987c(String.valueOf(this.f57977E)).mo44990b();
        }
        C22260b.m55106a("");
    }

    public final void ak_() {
        if ((getActivity() instanceof MusLoginActivity) && this.f57990y != 4) {
            ((MusLoginActivity) getActivity()).f57198a = (AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData();
        }
        new C21014a().mo44986b(this.f57983r).mo44984a("1").mo44990b();
        C22043z.m54776a(!C20884b.m53202c(), (AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData(), this.f57983r);
        if (this.f57990y == 1) {
            if (C21472c.m54111a()) {
                C21168a aVar = (C21168a) C22271m.m55124a(C21290bt.class, getArguments()).mo46372a("enter_type", this.f57516n).mo46370a();
                aVar.mo45323a(this.f57511d);
                mo45321a((Fragment) aVar, false);
                return;
            }
            C21168a aVar2 = (C21168a) C22271m.m55124a(C21226av.class, getArguments()).mo46372a("enter_type", this.f57516n).mo46370a();
            aVar2.mo45323a(this.f57511d);
            mo45321a((Fragment) aVar2, false);
        } else if (this.f57990y == 0) {
            if (!C20884b.m53202c()) {
                C13011d dVar = this.f57979G;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f57981p);
                sb.append("-");
                sb.append(this.f57982q);
                dVar.mo24619a(sb.toString(), this.f57991z, (C13134k) this.f57976D);
            } else if (C21472c.m54111a()) {
                C21168a aVar3 = (C21168a) C22271m.m55124a(C21290bt.class, getArguments()).mo46372a("enter_type", this.f57516n).mo46371a("init_page", 0).mo46372a("country_code_alpha_2", this.f57980o).mo46372a("country_code", this.f57981p).mo46372a("phone_number", this.f57982q).mo46373a("use_whatsapp_code", this.f57974B).mo46373a("reset_ticker", this.f57975C).mo46370a();
                aVar3.mo45323a(this.f57511d);
                mo45321a((Fragment) aVar3, false);
            } else {
                C21168a aVar4 = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57980o).mo46372a("country_code", this.f57981p).mo46372a("phone_number", this.f57982q).mo46373a("NEW_PHONE_USER", true).mo46373a("use_whatsapp_code", this.f57974B).mo46373a("reset_ticker", this.f57975C).mo46370a();
                aVar4.mo45323a(this.f57511d);
                mo45321a((Fragment) aVar4, false);
            }
        } else if (this.f57990y != 4) {
            if (this.f57990y == 7 && getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("age_gate_response", (Serializable) ((C20887a) this.f57989x.mo54803n()).getData());
                getActivity().setResult(-1, intent);
                getActivity().finish();
            }
        } else if (((AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData()).is_prompt()) {
            Intent intent2 = new Intent(getActivity(), DeleteVideoAlertActivity.class);
            intent2.putExtra("age_gate_response", (Serializable) ((C20887a) this.f57989x.mo54803n()).getData());
            startActivity(intent2);
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            C10643a aVar5 = new C10643a(getActivity());
            aVar5.mo18885a((int) R.string.c_t);
            aVar5.mo18899b((int) R.string.c_o);
            aVar5.mo18886a((int) R.string.b_b, (DialogInterface.OnClickListener) new C21353z(this));
            aVar5.mo18897a().mo18882b().setCancelable(false);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C21606o) {
            this.f57978F = (C21606o) activity;
        }
    }

    /* renamed from: a */
    public final void mo45324a(boolean z) {
        if (z) {
            this.f57987v.mo45161c();
        } else {
            this.f57987v.mo45160a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f57985t) {
            mo45327e();
            C22260b.m55106a("");
            return;
        }
        if (view == this.f57987v) {
            if (!C21173aa.m53705a(getContext())) {
                C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            this.f57989x.mo44837a(this.f57973A, !this.f57973A);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57980o = arguments.getString("country_code_alpha_2");
            this.f57981p = arguments.getString("country_code");
            this.f57982q = arguments.getString("phone_number");
            this.f57990y = arguments.getInt("init_page", 1);
            this.f57991z = arguments.getString("sms_code_key", "");
            this.f57973A = arguments.getBoolean("ftc_detect", false);
            this.f57974B = arguments.getBoolean("use_whatsapp_code", false);
            this.f57975C = arguments.getBoolean("reset_ticker", false);
        }
        this.f57979G = C13081d.m26312a(getContext());
        if (this.f57990y == 0) {
            str = "sms_verification";
        } else {
            str = "phone";
        }
        this.f57983r = str;
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        new C21015b().mo44988a(this.f57983r).mo44990b();
        this.f57976D = new C21348a();
        C22043z.m54777a(!C20884b.m53202c(), this.f57983r);
    }

    /* renamed from: a */
    public final void mo44801a(Exception exc) {
        if (isViewValid() && getActivity() != null) {
            if (exc instanceof C23459a) {
                C23459a aVar = (C23459a) exc;
                this.f57977E = aVar.getErrorCode();
                C10691a.m21545b((Context) getActivity(), aVar.getErrorMsg()).mo19066a();
            } else if (((C20887a) this.f57989x.mo54803n()).getData() == null || ((AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData()).getStatus_code() < 0) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                C22043z.m54776a(!C20884b.m53202c(), null, this.f57983r);
            } else if (((AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData()).getStatus_code() != 0) {
                this.f57977E = ((AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData()).getStatus_code();
                String status_msg = ((AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData()).getStatus_msg();
                if (!TextUtils.isEmpty(status_msg)) {
                    if (this.f57977E != 56004 || !C10181b.m20511a().mo18172a(AgeGateBlockExperiment.class, true, "enhace_age_gate_block", 31744, false)) {
                        C10691a.m21545b((Context) getActivity(), status_msg).mo19066a();
                        C26890h.m65011a("age_gate_eligible_toast", new C20856a().mo44776a("platform", this.f57983r).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
                    } else {
                        C26890h.m65011a("age_gate_eligible_popup", new C20856a().mo44776a("platform", this.f57983r).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
                        C10643a aVar2 = new C10643a(getActivity());
                        aVar2.mo18902b(status_msg);
                        aVar2.mo18886a((int) R.string.ahm, (DialogInterface.OnClickListener) new C21349v(this));
                        aVar2.mo18897a().mo18883c().setCancelable(false);
                    }
                }
            } else {
                if ((getActivity() instanceof MusLoginActivity) && this.f57990y != 4) {
                    ((MusLoginActivity) getActivity()).f57198a = (AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData();
                }
                if (!C20884b.m53202c()) {
                    C22043z.m54776a(!C20884b.m53202c(), (AgeGateResponse) ((C20887a) this.f57989x.mo54803n()).getData(), this.f57983r);
                    C10643a aVar3 = new C10643a(getActivity());
                    if (this.f57973A) {
                        aVar3.mo18885a((int) R.string.c_t);
                        aVar3.mo18899b((int) R.string.c_o);
                        aVar3.mo18886a((int) R.string.b_b, (DialogInterface.OnClickListener) new C21350w(this));
                    } else {
                        aVar3.mo18885a((int) R.string.b78);
                        aVar3.mo18899b((int) R.string.c8v);
                        aVar3.mo18886a((int) R.string.v_, (DialogInterface.OnClickListener) new C21351x(this));
                        if (getActivity() != null && this.f57990y == 7) {
                            Intent intent = new Intent();
                            intent.putExtra("age_gate_response", (Serializable) ((C20887a) this.f57989x.mo54803n()).getData());
                            getActivity().setResult(-99, intent);
                        }
                        C26890h.m65011a("f_special_age_popup", new C20856a().f56798a);
                    }
                    aVar3.mo18897a().mo18882b().setCancelable(false);
                    return;
                }
                C10643a aVar4 = new C10643a(getActivity());
                aVar4.mo18899b((int) R.string.c8r);
                aVar4.mo18886a((int) R.string.clf, (DialogInterface.OnClickListener) new C21352y(this));
                aVar4.mo18897a().mo18882b().setCancelable(false);
                new C21014a().mo44986b(this.f57983r).mo44984a("0").mo44987c("56004").mo44990b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45492a(DialogInterface dialogInterface, int i) {
        mo45321a(C22271m.m55124a(C21191af.class, getArguments()).mo46371a("init_page", this.f57990y).mo46370a(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45493b(DialogInterface dialogInterface, int i) {
        mo45321a(C22271m.m55124a(C21191af.class, getArguments()).mo46373a("ftc_detect", this.f57973A).mo46371a("init_page", this.f57990y).mo46370a(), false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57989x = new C20892f();
        this.f57989x.mo44836a(this);
        this.f57985t = view.findViewById(R.id.ay9);
        this.f57987v = (LoginButton) view.findViewById(R.id.ol);
        this.f57988w = (DatePicker) view.findViewById(R.id.a8f);
        this.f57986u = (TextView) view.findViewById(R.id.dx);
        this.f57985t.setOnClickListener(this);
        this.f57987v.setOnClickListener(this);
        this.f57988w.mo44936a((C20941a) this);
        C20884b.m53200a(this.f57988w);
        this.f57987v.setLoginBackgroundRes(R.drawable.cgr);
        this.f57987v.setLoadingBackground(R.drawable.ch1);
        if (this.f57973A) {
            this.f57986u.setText(R.string.c_n);
            this.f57985t.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.azy, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo44800a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        this.f57989x.mo44835a(i, i2, i3);
        this.f57987v.setEnabled(true);
    }
}
