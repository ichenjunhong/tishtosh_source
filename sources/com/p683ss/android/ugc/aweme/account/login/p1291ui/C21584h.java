package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.p683ss.android.ugc.aweme.account.login.C21389n;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21095ad;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.login.p1283c.C21126c;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.C21600b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.account.p1277j.C21001e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22261c;
import com.p683ss.android.ugc.aweme.account.util.C22262d;
import com.p683ss.android.ugc.aweme.account.util.C22264f;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.h */
public abstract class C21584h<T extends C21126c> extends C21573e<T> implements OnClickListener {

    /* renamed from: y */
    public static final boolean f58537y = false;

    /* renamed from: A */
    protected TextView f58538A;

    /* renamed from: B */
    protected TextView f58539B;

    /* renamed from: C */
    public C21598l f58540C;

    /* renamed from: D */
    public C21600b f58541D;

    /* renamed from: E */
    public String f58542E;

    /* renamed from: F */
    protected C21120y f58543F;

    /* renamed from: a */
    private final int f58544a = 60000;

    /* renamed from: q */
    private final int f58545q = 50000;

    /* renamed from: r */
    private final int f58546r = 1000;

    /* renamed from: s */
    private boolean f58547s = true;

    /* renamed from: t */
    private boolean f58548t = true;

    /* renamed from: u */
    private C21095ad f58549u;

    /* renamed from: z */
    protected boolean f58550z = true;

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo45859v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract int mo45860w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo45867x() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo45868y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo45828z() {
        return "user_click";
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f58540C.mo45879a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo45849q() {
        super.mo45849q();
        this.f58457k = C22262d.m55108a(this.f58454d);
        if (this.f58538A != null) {
            this.f58538A.setOnClickListener(this);
        }
        if (this.f58539B != null) {
            this.f58539B.setOnClickListener(this);
        }
        if (this.f58540C != null) {
            this.f58541D = new C21600b() {
                /* renamed from: b */
                public final void mo45695b() {
                    if (C21584h.this.isViewValid()) {
                        C21584h.this.f58538A.setText(C21584h.this.getString(R.string.d81));
                        if (C21584h.this.mo45867x()) {
                            C23729p.m58257a((View) C21584h.this.f58539B, 0);
                        }
                        C21584h.this.mo45868y();
                    }
                }

                /* renamed from: a */
                public final void mo45869a(long j) {
                    if (C21584h.this.isViewValid()) {
                        C21584h.this.f58538A.setText(C21584h.this.getString(R.string.d82, Long.valueOf(j / 1000)));
                        if (j < 50000 && C21584h.this.f58539B.getVisibility() != 0 && C21584h.this.mo45867x()) {
                            C21584h.this.f58539B.setVisibility(0);
                        }
                    }
                }
            };
            this.f58540C.mo45879a(this.f58541D);
        }
        this.f58549u = new C21095ad(this) {
            public final void onSuccess(C12993e<C13120s> eVar) {
                super.onSuccess(eVar);
                C22097f.m54898a(0, C21584h.this.mo45860w(), 0, "");
                if (C21584h.this.getActivity() != null) {
                    C11105a a = C22284v.m55156a(C21584h.this.getActivity());
                    a.mo20135a((int) R.string.cob).mo20144b((int) R.string.coc).mo20145b((int) R.string.bdf, (DialogInterface.OnClickListener) null).mo20141a(false);
                    C47700ay.m103235a(a.mo20143a());
                    if (C21584h.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) C21584h.this.getActivity()).mo45730c(true);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45149a(C12993e<C13120s> eVar) {
                JSONObject jSONObject;
                C22097f.m54898a(1, C21584h.this.mo45860w(), eVar.f34000c, eVar.f34001d);
                if (C21584h.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) C21584h.this.getActivity()).mo45730c(false);
                }
                if (C21584h.this.isViewValid()) {
                    if (eVar.f34000c == 2003 || eVar.f34000c == 2004) {
                        C21584h.m54282a(eVar.f34001d, C21584h.this.getActivity());
                    } else if (eVar.f34000c == 1091 || eVar.f34000c == 1093) {
                        JSONObject jSONObject2 = null;
                        if (eVar.f34007h != null) {
                            jSONObject = ((C13120s) eVar.f34007h).f34279l;
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            jSONObject2 = jSONObject.optJSONObject("data");
                        }
                        if (!(jSONObject2 == null || TextUtils.isEmpty(jSONObject2.optString("sec_info")) || C21584h.this.getActivity() == null)) {
                            C22261c.m55107a(C21584h.this.getActivity(), jSONObject2.optString("sec_info"), Integer.valueOf(eVar.f34000c), "", "click_message", "phone");
                        }
                    } else {
                        C10691a.m21545b(C21584h.this.getContext(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                }
            }
        };
        this.f58543F = new C21120y(this) {
            public final void onSuccess(C12993e<C13120s> eVar) {
                super.onSuccess(eVar);
                C22097f.m54898a(0, C21584h.this.mo45860w(), 0, "");
                if (C21584h.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) C21584h.this.getActivity()).mo45729b(true);
                }
            }

            /* renamed from: b */
            public final void mo45170b(C12993e<C13120s> eVar) {
                JSONObject jSONObject;
                String str;
                C22097f.m54898a(1, C21584h.this.mo45860w(), eVar.f34000c, eVar.f34001d);
                if (C21584h.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) C21584h.this.getActivity()).mo45729b(false);
                }
                if (C21584h.this.isViewValid()) {
                    if (eVar.f34000c == 1057) {
                        C21584h.this.mo45864a(eVar);
                    } else if (eVar.f34000c == 2015) {
                        C21584h.this.mo45865c("anti_spam");
                        return;
                    } else if (eVar.f34000c == 2003 || eVar.f34000c == 2004) {
                        C21584h.m54282a(eVar.f34001d, C21584h.this.getActivity());
                        return;
                    } else if (eVar.f34000c == 2030 && C21584h.this.getActivity() != null) {
                        JSONObject optJSONObject = ((C13120s) eVar.f34007h).f34279l.optJSONObject("data");
                        FragmentActivity activity = C21584h.this.getActivity();
                        C21135a aVar = C21584h.this.f58509l;
                        optJSONObject.optString("sms_content", "");
                        optJSONObject.optString("channel_mobile", "");
                        optJSONObject.optString("verify_ticket", "");
                        String str2 = C21584h.this.f58454d;
                        String str3 = C21584h.this.f58455e;
                        if (C21584h.this.getArguments() == null) {
                            str = "";
                        } else {
                            str = C21584h.this.getArguments().getString("profile_key", "");
                        }
                        C52711k.m112240b(activity, "activity");
                        C52711k.m112240b(aVar, "smsUseMobile");
                        C52711k.m112240b(str, "profileKey");
                    } else if (eVar.f34000c == 1091 || eVar.f34000c == 1093) {
                        JSONObject jSONObject2 = null;
                        if (eVar.f34007h != null) {
                            jSONObject = ((C13120s) eVar.f34007h).f34279l;
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            jSONObject2 = jSONObject.optJSONObject("data");
                        }
                        if (!(jSONObject2 == null || TextUtils.isEmpty(jSONObject2.optString("sec_info")) || C21584h.this.getActivity() == null)) {
                            C22261c.m55107a(C21584h.this.getActivity(), jSONObject2.optString("sec_info"), Integer.valueOf(eVar.f34000c), "", "click_message", "phone");
                        }
                        return;
                    }
                    if (C21584h.this.f58550z && !TextUtils.isEmpty(eVar.f34001d)) {
                        if (C22281s.m55138a(eVar.f34000c)) {
                            C22281s.m55135a(C21584h.this.getContext(), eVar.f34001d);
                            C21584h.this.f58540C.mo45878a();
                            if (C21584h.this.f58541D != null) {
                                C21584h.this.f58541D.mo45695b();
                            }
                        } else if (eVar.f34000c > 0) {
                            C10691a.m21545b(C21584h.this.getContext(), eVar.f34001d).mo19066a();
                        } else if (C21584h.this.getContext() != null) {
                            C10691a.m21545b(C21584h.this.getContext(), C21584h.this.getString(R.string.cg1)).mo19066a();
                        }
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45854b(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        C21001e.m53383a(z, this.f58542E);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("send_code_phone_number", this.f58542E);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f58542E = bundle.getString("send_code_phone_number");
        }
    }

    public void onAttach(Activity activity) {
        SparseArray<C21598l> sparseArray;
        super.onAttach(activity);
        if (activity instanceof LoginOrRegisterActivity) {
            sparseArray = ((LoginOrRegisterActivity) activity).f58364p;
            this.f58540C = (C21598l) sparseArray.get(mo45859v());
        } else {
            sparseArray = null;
        }
        if (this.f58540C == null) {
            C21598l lVar = new C21598l(60000, 1000, this.f58541D);
            this.f58540C = lVar;
            if (sparseArray != null) {
                sparseArray.put(mo45859v(), this.f58540C);
            }
        }
    }

    /* renamed from: c */
    public final void mo45865c(String str) {
        if (mo45812g() != null) {
            C21378a.m53998a().mo45512a("", "", false, "send_voice_code", "", "发送语音验证码");
            this.f58542E = mo45845o();
            ((C21126c) mo45812g()).mo45238b(this.f58542E, null, this.f58549u);
            this.f58547s = false;
        }
        C26890h.m65011a("send_voice_verification_code", new C20856a().mo44776a("send_reason", String.valueOf(mo45860w())).mo44776a("send_method", str).f56798a);
        mo45854b(0);
    }

    /* renamed from: a */
    public final void mo45864a(final C12993e<C13120s> eVar) {
        String str;
        if (f58537y) {
            StringBuilder sb = new StringBuilder("Conflict optimization ");
            if (this.f58548t) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        if (!this.f58548t || TextUtils.equals(this.f58454d, "auth_login")) {
            C10691a.m21551c(getContext(), getString(R.string.cd)).mo19066a();
            return;
        }
        if (eVar != null && eVar.f34000c == 1057) {
            C26890h.m65011a("phone_bundling_conflict_alert", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(this.f58457k)).f56798a);
            new C10643a(getContext()).mo18885a((int) R.string.rr).mo18899b((int) R.string.rp).mo18886a((int) R.string.ro, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C26890h.m65011a("phone_bundling_conflict_check", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(C21584h.this.f58457k)).f56798a);
                    String str = ((C13120s) eVar.f34007h).f34317d;
                    if (!TextUtils.isEmpty(str)) {
                        Map a = C18500a.m44767a(str);
                        JSONObject jSONObject = new JSONObject();
                        for (Entry entry : a.entrySet()) {
                            try {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            } catch (Exception unused) {
                            }
                        }
                        ((C36703x) C23826bi.m58450a(C36703x.class)).mo47869a((Context) C23826bi.m58460b(), AppLog.addCommonParams(str, false), jSONObject.toString());
                    }
                    dialogInterface.dismiss();
                }
            }).mo18900b((int) R.string.rn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C26890h.m65011a("phone_bundling_conflict_cancel", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(C21584h.this.f58457k)).f56798a);
                    dialogInterface.dismiss();
                }
            }).mo18897a().mo18882b().setCanceledOnTouchOutside(false);
        }
    }

    public void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view != this.f58538A) {
            if (view == this.f58539B) {
                if (!mo45840j()) {
                    C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.ffy)).mo19066a();
                } else if (this.f58547s || !this.f58540C.mo45883e()) {
                    if (!this.f58540C.mo45883e()) {
                        this.f58540C.mo45880b();
                    }
                    mo45865c("user_click");
                } else {
                    C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.fd1)).mo19066a();
                }
            }
        } else if (!mo45840j()) {
            C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.ffy)).mo19066a();
        } else if (this.f58540C.mo45883e()) {
            C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.fd1)).mo19066a();
        } else {
            this.f58540C.mo45880b();
            if (mo45812g() != null) {
                C21378a.m53998a().mo45512a("", "", false, "register", "", "注册重发验证码");
                C26890h.m65005a((Context) getActivity(), "resend_click", "verification_code", C23826bi.m58463d(), 0);
                this.f58542E = mo45845o();
                ((C21126c) mo45812g()).mo45237a(this.f58542E, null, this.f58543F);
            }
            String str2 = "send_sms";
            C20856a aVar = new C20856a();
            String str3 = "send_method";
            if (TextUtils.equals(getString(R.string.d81), this.f58538A.getText())) {
                str = "resend";
            } else {
                str = mo45828z();
            }
            C26890h.m65011a(str2, aVar.mo44776a(str3, str).mo44774a("send_reason", mo45860w()).mo44776a("enter_method", this.f58455e).mo44776a("enter_from", this.f58454d).f56798a);
            mo45854b(2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (f58537y) {
            C22264f.m55111a("BaseVerifyCodeFragment", arguments);
        }
        if (arguments != null) {
            this.f58548t = arguments.getBoolean("bind_conflict_opt", true);
        }
    }

    /* renamed from: a */
    public static void m54282a(String str, final Context context) {
        if (!TextUtils.isEmpty(str)) {
            C11105a a = C22284v.m55156a(context);
            a.mo20146b((CharSequence) str);
            a.mo20136a((int) R.string.f78, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C18898c.m46009a(context, "login", "login_pop_confirm");
                    ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(context, C2240a.m6772a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
                }
            });
            a.mo20145b((int) R.string.wf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C18898c.m46009a(context, "login", "login_pop_cancel");
                }
            });
            C47700ay.m103235a(a.mo20143a());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001 && i2 == -1) {
            String stringExtra = intent.getStringExtra("data");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    new C18493a();
                    C23826bi.m58455a((C13207b) C18493a.m44735b(new JSONObject(stringExtra)));
                    C22282t.m55144b(true);
                    C22087a.m54862a("success");
                    C21378a.m53998a().mo45512a("", "", true, "login", "", "mobile login success");
                    C22089b.m54868a("aweme_phone_login_rate", 1, C23088c.m56631a().mo47825b());
                    C20994a.m53360a(C20996b.LOGIN_BY_PHONE_SMS, C20995a.PHONE_SMS, "");
                    if (getActivity() != null) {
                        if (getActivity() instanceof C21389n) {
                            ((C21389n) getActivity()).mo45573a(true);
                        }
                        ((C21379m) getActivity()).mo45026a(mo45848b("phone_sms"));
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("sms_verification").setJsonObject(C23088c.m56631a().mo47824a("enter_from", this.f58454d).mo47824a("position", this.f58455e).mo47825b()));
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", this.f58455e).mo44776a("enter_from", this.f58454d).mo44776a("platform", "sms_verification").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
                        C21518u.m54176b(new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_SMS, this.f58509l));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
