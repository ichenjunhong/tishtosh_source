package com.p683ss.android.ugc.aweme.account.login.digitsverify;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21168a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21203ak;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21203ak.C21210a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.C21250a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21328n;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21052h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21100e;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22241h;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.util.C22285w;
import com.p683ss.android.ugc.aweme.account.util.C22285w.C22286a;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity */
public class SendVerificationCodeActivity extends MusAbsActivity implements C20977b, C21210a, C21250a, C21328n {

    /* renamed from: a */
    public C21203ak f57416a;

    /* renamed from: b */
    public String f57417b;

    /* renamed from: c */
    public C22241h f57418c;

    /* renamed from: d */
    private C21568ah f57419d;

    /* renamed from: e */
    private MusLoginManager f57420e;

    /* renamed from: f */
    private C0654k f57421f;

    /* renamed from: g */
    private C21227aw f57422g;

    /* renamed from: h */
    private String f57423h;

    /* renamed from: i */
    private C21464e f57424i;

    /* renamed from: j */
    private C13011d f57425j;

    /* renamed from: k */
    private String f57426k = "SEND_CODE_FRAGMENT_TAG";

    /* renamed from: l */
    private String f57427l = "INPUT_PHONE_TAG";

    /* renamed from: a */
    public final MusLoginManager mo45023a() {
        return this.f57420e;
    }

    /* renamed from: a */
    public final void mo45026a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo45027a(Fragment fragment, boolean z) {
    }

    /* renamed from: b */
    public final String mo45259b() {
        return null;
    }

    /* renamed from: b */
    public final void mo45031b(Fragment fragment, boolean z) {
    }

    /* renamed from: c */
    public final int mo45033c() {
        return 0;
    }

    /* renamed from: c */
    public final void mo45034c(int i) {
    }

    /* renamed from: c */
    public final void mo45035c(Fragment fragment, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo45263f() {
        return true;
    }

    /* renamed from: h */
    public final String mo45266h() {
        return "";
    }

    /* renamed from: i */
    public final int mo45267i() {
        return C22165u.f59768h;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    /* renamed from: j */
    public final int mo45269j() {
        return C22165u.f59769i;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: k */
    public final String mo45270k() {
        if ("third_party_login".equals(this.f57423h)) {
            return "log_in";
        }
        return this.f57423h;
    }

    /* renamed from: l */
    public final C0198r<String> mo45271l() {
        if (this.f57424i != null) {
            return this.f57424i.f58231b;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        C20975a.m53341b(this);
        if (this.f57424i != null) {
            this.f57424i.mo45649c();
        }
    }

    public void finish() {
        super.finish();
        if (!C23826bi.m58468i().isPhoneBinded()) {
            C23826bi.m58451a(7, 3, (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo45265g() {
        this.f57421f.mo2225a();
        C0679r a = this.f57421f.mo2225a();
        if (this.f57416a != null) {
            a.mo2192b(R.id.b6q, this.f57416a, this.f57427l).mo2189b();
        }
    }

    /* renamed from: d */
    public final String mo45260d() {
        if ("third_party_login".equals(this.f57423h)) {
            return C23723j.m58219b(R.string.coi);
        }
        if (TextUtils.equals(this.f57417b, "enter_from_bind_pre_account")) {
            return C23723j.m58219b(R.string.cvy);
        }
        return C23723j.m58219b(R.string.cok);
    }

    public void dismiss() {
        if (!TextUtils.isEmpty(this.f57423h)) {
            "third_party_login".equals(this.f57423h);
            C26890h.m65011a("phone_bundling_success", C20856a.m53173a().mo44776a("enter_from", "log_in").f56798a);
        }
        finish();
    }

    /* renamed from: e */
    public final String mo45262e() {
        if ("third_party_login".equals(this.f57423h)) {
            return C23723j.m58219b(R.string.c90);
        }
        if (TextUtils.equals(this.f57417b, "enter_from_bind_pre_account")) {
            return C23723j.m58219b(R.string.bd1);
        }
        return null;
    }

    public void onBackPressed() {
        if (TextUtils.equals(this.f57417b, "enter_from_bind_pre_account")) {
            Fragment a = this.f57421f.mo2224a(this.f57427l);
            Fragment a2 = this.f57421f.mo2224a(this.f57426k);
            if (a != null && a.isVisible()) {
                C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Set up by Phone").mo44775a("duration", this.f57418c.mo45361i()).f56798a);
            } else if (a2 != null && a2.isVisible()) {
                C26890h.m65011a("back", C20856a.m53173a().mo44776a("enter_from", "Input Phone Captcha").mo44775a("duration", this.f57418c.mo45361i()).f56798a);
            }
        }
        if (this.f57421f == null || this.f57421f.mo2238f() == null || !this.f57421f.mo2238f().contains(this.f57422g)) {
            super.onBackPressed();
        } else {
            mo45265g();
        }
    }

    /* renamed from: a */
    public final C21569a mo45024a(int i) {
        return this.f57419d.mo45835b(0);
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        if (i == 2) {
            finish();
        }
    }

    /* renamed from: b */
    public final C22285w mo45029b(int i) {
        return this.f57419d.mo45833a(i);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.azx);
        this.f57423h = getIntent().getStringExtra("ENTER_REASON");
        this.f57417b = getIntent().getStringExtra(C21459s.f58201k);
        this.f57425j = C13081d.m26312a(getApplicationContext());
        this.f57421f = getSupportFragmentManager();
        C0679r a = this.f57421f.mo2225a();
        this.f57416a = new C21203ak();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("order", 0);
        bundle2.putString("ENTER_REASON", this.f57423h);
        String str2 = C21459s.f58201k;
        if (TextUtils.isEmpty(this.f57417b)) {
            str = "";
        } else {
            str = this.f57417b;
        }
        bundle2.putString(str2, str);
        this.f57416a.setArguments(bundle2);
        this.f57416a.f57616s = this;
        this.f57416a.mo45323a((C21328n) this);
        a.mo2176a(R.id.b6q, this.f57416a, this.f57427l).mo2189b();
        this.f57419d = new C21568ah();
        this.f57420e = new MusLoginManager();
        this.f57424i = new C21464e(this);
        this.f57424i.mo45648b();
        this.f57424i.mo45647a();
        C20975a.m53339a((C20977b) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo45256a(String str, String str2, final C21100e eVar) {
        this.f57425j.mo24623a(str, str2, "", 0, (C13125b) new C13125b() {
            public final void onSuccess(C12993e<C13103b> eVar) {
                String str;
                if (SendVerificationCodeActivity.this.isViewValid()) {
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
                    }
                    if (eVar != null) {
                        eVar.mo45153a();
                    }
                    C10691a.m21538a((Context) C23826bi.m58460b(), SendVerificationCodeActivity.this.getString(R.string.bx2), 0).mo19066a();
                }
            }

            public final void onError(C12993e<C13103b> eVar, int i) {
                if (SendVerificationCodeActivity.this.isViewValid()) {
                    if (eVar != null) {
                        eVar.mo45154a(eVar.f34001d, i);
                    }
                    C10691a.m21545b((Context) SendVerificationCodeActivity.this, C22275o.m55130a((C12990b) eVar)).mo19066a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo45257a(final String str, final String str2, C21168a aVar) {
        if (this.f57416a != null) {
            C21203ak akVar = this.f57416a;
            if (akVar.f57613p != null && akVar.f57613p.getVisibility() == 0) {
                C22308a.m55207b(akVar.f57613p);
            } else if (akVar.f57614q != null && akVar.f57614q.getVisibility() == 0) {
                akVar.f57618u.mo19212f();
            }
            C13011d dVar = this.f57425j;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(str2);
            int i = mo45267i();
            String h = mo45266h();
            boolean a = C22299f.m55184a();
            dVar.mo24611a(sb.toString(), "", i, 0, h, 1, a ? 1 : 0, (C13139p) new C21052h(this.f57416a) {
                /* renamed from: a */
                public final void mo45100a() {
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    C22097f.m54898a(0, SendVerificationCodeActivity.this.mo45267i(), 0, "");
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 1).f56798a);
                    SendVerificationCodeActivity.this.mo45258a(str, str2, "", "", 60);
                }

                /* renamed from: b */
                public final void mo45170b(C12993e<C13120s> eVar) {
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    C22097f.m54898a(1, SendVerificationCodeActivity.this.mo45267i(), eVar.f34000c, eVar.f34001d);
                    C10691a.m21545b((Context) SendVerificationCodeActivity.this, C22275o.m55130a((C12990b) eVar)).mo19066a();
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44776a("error_desc", eVar.f34001d).f56798a);
                }

                /* renamed from: a */
                public final void mo45101a(int i) {
                    if (TextUtils.equals(SendVerificationCodeActivity.this.f57417b, "enter_from_bind_pre_account")) {
                        C26890h.m65011a("input_wrong_phone", new C20856a().mo44776a("page", "Set up by Phone").mo44776a("error_code", "1").f56798a);
                    }
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    C22097f.m54898a(1, SendVerificationCodeActivity.this.mo45267i(), i, "PhoneInvalid");
                    if (SendVerificationCodeActivity.this.isViewValid()) {
                        C10691a.m21542b((Context) SendVerificationCodeActivity.this, (int) R.string.ca7).mo19066a();
                    }
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 0).mo44774a("error_code", i).f56798a);
                }

                /* renamed from: a */
                public final void mo45103a(C12993e<C13120s> eVar) {
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    C22097f.m54898a(1, SendVerificationCodeActivity.this.mo45267i(), eVar.f34000c, eVar.f34001d);
                    C10691a.m21545b((Context) SendVerificationCodeActivity.this, C22275o.m55130a((C12990b) eVar)).mo19066a();
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44776a("error_desc", eVar.f34001d).f56798a);
                }

                /* renamed from: a */
                public final void mo45104a(String str, String str2) {
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 1).f56798a);
                    SendVerificationCodeActivity.this.mo45258a(str, str2, str, str2, 60);
                }

                /* renamed from: a */
                public final void mo45102a(int i, String str) {
                    if (TextUtils.equals(SendVerificationCodeActivity.this.f57417b, "enter_from_bind_pre_account")) {
                        C26890h.m65011a("input_wrong_phone", new C20856a().mo44776a("page", "Set up your Pro Account").mo44776a("error_code", "2").f56798a);
                    }
                    C22097f.m54898a(1, SendVerificationCodeActivity.this.mo45267i(), i, "PhoneRegistered");
                    if (SendVerificationCodeActivity.this.f57416a != null) {
                        SendVerificationCodeActivity.this.f57416a.mo45360a();
                    }
                    if (SendVerificationCodeActivity.this.isViewValid()) {
                        SendVerificationCodeActivity sendVerificationCodeActivity = SendVerificationCodeActivity.this;
                        if (TextUtils.isEmpty(str)) {
                            str = SendVerificationCodeActivity.this.getResources().getString(R.string.coj);
                        }
                        C10691a.m21545b((Context) sendVerificationCodeActivity, str).mo19066a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo45025a(int i, String str, long j, int i2, C22286a aVar) {
        this.f57419d.mo45834a(i, str, j, 60, aVar);
    }

    /* renamed from: a */
    public final void mo45258a(String str, String str2, String str3, String str4, long j) {
        String str5;
        C0679r a = this.f57421f.mo2225a();
        if (this.f57422g == null) {
            this.f57422g = new C21227aw();
            this.f57422g.mo45323a((C21328n) this);
            this.f57422g.f57668G = this;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ENTER_REASON", this.f57423h);
        bundle.putString("country_code", str);
        String str6 = C21459s.f58201k;
        if (TextUtils.isEmpty(this.f57417b)) {
            str5 = "";
        } else {
            str5 = this.f57417b;
        }
        bundle.putString(str6, str5);
        bundle.putString("phone_number", str2);
        bundle.putString("captcha_string", str3);
        bundle.putString("captcha_error_msg", str4);
        if (TextUtils.equals(this.f57417b, "enter_from_bind_pre_account")) {
            bundle.putInt("code_type", 8);
            if (getIntent() != null) {
                bundle.putInt(C21459s.f58202l, getIntent().getIntExtra(C21459s.f58202l, 0));
                bundle.putString(C21459s.f58203m, getIntent().getStringExtra(C21459s.f58203m));
            }
        } else {
            bundle.putInt("code_type", 5);
        }
        bundle.putLong("sms_have_send_time", 60);
        this.f57422g.setArguments(bundle);
        a.mo2192b(R.id.b6q, this.f57422g, this.f57426k).mo2195c();
    }
}
