package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.ProgressDialog;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22137r;
import com.p683ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.p683ss.android.ugc.aweme.account.login.C21389n;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.C22040w;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.HideLoginPlatformModel;
import com.p683ss.android.ugc.aweme.account.p1272e.C20965a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22274n;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.account.view.C22310b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.service.C36681c;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity */
public abstract class BaseLoginOrRegisterActivity extends AmeBaseActivity implements C20977b, C21379m, C21389n {

    /* renamed from: k */
    public C22040w f58359k;

    /* renamed from: l */
    public C21542a f58360l;

    /* renamed from: m */
    protected long f58361m;
    @BindView(2131493155)
    ViewGroup mFragmentContainer;
    @BindView(2131493516)
    DmtStatusView mStatusView;

    /* renamed from: n */
    public String f58362n;

    /* renamed from: o */
    public C21135a f58363o;

    /* renamed from: p */
    public SparseArray<C21598l> f58364p = new SparseArray<>(4);

    /* renamed from: q */
    protected String f58365q;

    /* renamed from: r */
    protected C20965a f58366r;

    /* renamed from: s */
    private String f58367s;

    /* renamed from: t */
    private ProgressDialog f58368t;

    /* renamed from: a */
    public final int mo44778a() {
        return R.layout.ay_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo45731d();

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* renamed from: e */
    private boolean m54182e() {
        return TextUtils.equals(this.f58362n, "toutiao");
    }

    /* renamed from: b */
    public final void mo45030b() {
        try {
            getSupportFragmentManager().mo2235c();
        } catch (Exception unused) {
        }
    }

    public void onStart() {
        super.onStart();
        C23826bi.m58452a(7, 1, "");
    }

    public void dismissProgressDialog() {
        if (this.f58368t != null && this.f58368t.isShowing()) {
            this.f58368t.dismiss();
        }
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().mo2237e() == 1) {
            C22274n.m55129a(this, false, true);
        } else {
            mo45030b();
        }
    }

    public ProgressDialog showProgressDialog() {
        if (this.f58368t == null) {
            this.f58368t = C22284v.m55157b(this);
            this.f58368t.setMessage(getString(R.string.c76));
            this.f58368t.setCanceledOnTouchOutside(false);
        }
        if (!this.f58368t.isShowing()) {
            this.f58368t.show();
        }
        return this.f58368t;
    }

    public void finish() {
        super.finish();
        C20975a.m53341b(this);
        C20975a.m53337a(11);
        overridePendingTransition(0, R.anim.dj);
        ((C36698s) C23826bi.m58450a(C36698s.class)).mo47889a(this);
        int intExtra = getIntent().getIntExtra("bundle_flow_type", C21459s.f58206p);
        if ((intExtra == C21459s.f58208r || intExtra == C21459s.f58209s || intExtra == C21459s.f58210t) && (this.f58360l instanceof C21055ac) && ((C21055ac) this.f58360l).ai_()) {
            C21518u.m54176b(new BaseLoginMethod());
        }
        if (!(this.f58360l instanceof C21561ae) || ((C21561ae) this.f58360l).f58496m) {
            new Handler().postDelayed(C21570b.f58507a, 200);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f58359k != null) {
            C22040w wVar = this.f58359k;
            boolean g = C23826bi.m58466g();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("send_code_success_count", wVar.f59535a);
                jSONObject.put("send_code_failed_count", wVar.f59536b);
                jSONObject.put("send_voice_code_success_count", wVar.f59537c);
                jSONObject.put("send_voice_code_failed_count", wVar.f59538d);
                jSONObject.put("login_success_count", wVar.f59539e);
                jSONObject.put("login_failed_count", wVar.f59540f);
            } catch (Exception e) {
                C32458a.m75143a(e);
                jSONObject = new JSONObject();
            }
            C22089b.m54868a("phone_login_monitor", g ? 1 : 0, jSONObject);
        }
    }

    /* renamed from: c */
    public final void mo44878c() {
        String str;
        super.mo44878c();
        this.f58367s = getIntent().getStringExtra("enter_from");
        this.f58365q = getIntent().getStringExtra("enter_method");
        this.f58361m = System.currentTimeMillis();
        int intExtra = getIntent().getIntExtra("bundle_flow_type", C21459s.f58206p);
        this.f58362n = getIntent().getStringExtra("bundle_from");
        if (intExtra == C21459s.f58206p) {
            mo45731d();
        } else if (intExtra == C21459s.f58208r) {
            ((C36681c) C23826bi.m58450a(C36681c.class)).mo47871a("login");
            this.f58360l = new C21615r();
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                extras.putString("enter_type", "click_login");
                this.f58360l.setArguments(extras);
            }
            this.mFragmentContainer.setVisibility(0);
            m54181c(this.f58360l, false);
            this.mStatusView.setVisibility(8);
            C47700ay.m103236b(this.f58366r);
        } else if (intExtra == C21459s.f58209s) {
            ((C36681c) C23826bi.m58450a(C36681c.class)).mo47871a("login");
            this.f58360l = new C21548aa();
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                extras2.putString("enter_type", "click_login");
                this.f58360l.setArguments(extras2);
            }
            this.mFragmentContainer.setVisibility(0);
            m54181c(this.f58360l, false);
            this.mStatusView.setVisibility(8);
            C47700ay.m103236b(this.f58366r);
        } else if (intExtra == C21459s.f58210t) {
            ((C36681c) C23826bi.m58450a(C36681c.class)).mo47871a("login");
            this.f58360l = new C21561ae();
            Bundle extras3 = getIntent().getExtras();
            if (extras3 != null) {
                extras3.putString("enter_type", "click_login");
                this.f58360l.setArguments(extras3);
            }
            this.mFragmentContainer.setVisibility(0);
            m54181c(this.f58360l, false);
            this.mStatusView.setVisibility(8);
            C47700ay.m103236b(this.f58366r);
        } else if (intExtra == C21459s.f58207q) {
            try {
                if (((TelephonyManager) getSystemService("phone")) == null) {
                    str = "";
                } else {
                    str = "";
                }
            } catch (Exception unused) {
                str = "";
            }
            mo45727a(C22271m.m55123a(C21548aa.class).mo46372a("key_input_phone_num", str).mo46372a("enter_from", this.f58367s).mo46372a("enter_type", "click_login").mo46372a("enter_method", this.f58365q).mo46370a(), true);
            this.f58363o.setRawInput(str);
            this.mFragmentContainer.setVisibility(0);
        } else {
            finish();
        }
        this.f58359k = new C22040w();
    }

    /* renamed from: a */
    public final void mo45573a(boolean z) {
        if (this.f58359k != null) {
            this.f58359k.mo45573a(z);
        }
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        if (i == 4) {
            finish();
            return;
        }
        if (i == 11) {
            C20975a.m53341b(this);
            super.finish();
        }
    }

    /* renamed from: b */
    public final void mo45729b(boolean z) {
        if (this.f58359k != null) {
            C22040w wVar = this.f58359k;
            if (z) {
                wVar.f59535a++;
                return;
            }
            wVar.f59536b++;
        }
    }

    /* renamed from: c */
    public final void mo45730c(boolean z) {
        if (this.f58359k != null) {
            C22040w wVar = this.f58359k;
            if (z) {
                wVar.f59537c++;
                return;
            }
            wVar.f59538d++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bundle mo45726a(C0013i iVar) throws Exception {
        if (!iVar.mo33d()) {
            C20994a.m53367b("", "cancel", C20996b.USER_OPERATOR_AFTER_LOGIN, null, "");
            if (this.f58360l != null) {
                this.f58360l.mo45810e();
                this.f58360l = null;
            }
        }
        C23826bi.m58461b(C23826bi.m58468i());
        if (!m54182e()) {
            finish();
        }
        C20994a.m53361a("");
        return (Bundle) iVar.mo34e();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f58363o = new C21135a().setRawInput(bundle.getString("phone_number_raw_input")).setCountryCode(bundle.getInt("phone_number_country_code")).setNationalNumber(bundle.getLong("phone_number_nation_number"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("phone_number_raw_input", this.f58363o.getRawInput());
        bundle.putInt("phone_number_country_code", this.f58363o.getCountryCode());
        bundle.putLong("phone_number_nation_number", this.f58363o.getNationalNumber());
    }

    /* renamed from: a */
    public final void mo45026a(Bundle bundle) {
        if (!TextUtils.isEmpty(C21635v.f58647b)) {
            bundle.putString("enter_from", C21635v.f58647b);
        }
        if (!TextUtils.isEmpty(C21635v.f58646a)) {
            bundle.putString("enter_method", C21635v.f58646a);
        }
        if (C23826bi.m58462c()) {
            bundle.putBoolean("only_login", true);
        }
        if ("mobile".equals(bundle.getString("platform"))) {
            bundle.putInt("user_mode", 0);
            C22137r.m54940a(bundle).mo20a((C0011g<TResult, TContinuationResult>) new C21571c<TResult,TContinuationResult>(this), C0013i.f25b);
            if (m54182e()) {
                showProgressDialog();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f58363o = new C21135a().setCountryCode(C21134a.m53618a((Context) this).mo45244a(((C36699t) C23826bi.m58450a(C36699t.class)).mo47865b(), Locale.getDefault().getCountry()));
        BaseLoginMethod a = C21518u.m54170a(LoginMethodName.DEFAULT);
        if ((a instanceof PhoneLoginMethod) && getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true)) {
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) a;
            this.f58363o.setCountryCode(phoneLoginMethod.getPhoneNumber().getCountryCode());
            this.f58363o.setNationalNumber(phoneLoginMethod.getPhoneNumber().getNationalNumber());
            this.f58363o.setRawInput(String.valueOf(this.f58363o.getNationalNumber()));
        }
        this.f58366r = new C20965a(this, new C22310b(this));
        this.f58366r.setCanceledOnTouchOutside(false);
        ((HideLoginPlatformModel) C0214z.m440a((FragmentActivity) this).mo359a(HideLoginPlatformModel.class)).f59520b.setValue(getIntent().getStringExtra("need_hide_login_way"));
        super.onCreate(bundle);
        overridePendingTransition(R.anim.di, 0);
        C20975a.m53339a((C20977b) this);
    }

    /* renamed from: c */
    private void m54181c(Fragment fragment, boolean z) {
        if (fragment instanceof C21542a) {
            this.f58360l = (C21542a) fragment;
        }
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
            return;
        }
        C0679r a = getSupportFragmentManager().mo2225a();
        a.mo2191b(R.id.ajf, fragment);
        a.mo2179a((String) null);
        a.mo2195c();
    }

    /* renamed from: b */
    public final void mo45728b(Fragment fragment, boolean z) {
        if (fragment instanceof C21542a) {
            this.f58360l = (C21542a) fragment;
        }
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
        } else if (!z || getSupportFragmentManager().mo2237e() <= 1) {
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2174a(R.anim.bm, R.anim.dp, R.anim.bk, R.anim.dq);
            a.mo2191b(R.id.ajf, fragment);
            a.mo2179a((String) null);
            a.mo2195c();
        } else {
            mo45030b();
        }
    }

    /* renamed from: a */
    public final void mo45727a(Fragment fragment, boolean z) {
        if (fragment instanceof C21542a) {
            this.f58360l = (C21542a) fragment;
        }
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
        } else if (!z || getSupportFragmentManager().mo2237e() <= 1) {
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2174a(R.anim.bi, R.anim.dr, R.anim.bp, R.anim.f133575do);
            a.mo2191b(R.id.ajf, fragment);
            a.mo2179a((String) null);
            a.mo2195c();
        } else {
            mo45030b();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f58360l != null) {
            this.f58360l.onActivityResult(i, i2, intent);
        }
        if (C23826bi.m58466g()) {
            finish();
        }
    }
}
