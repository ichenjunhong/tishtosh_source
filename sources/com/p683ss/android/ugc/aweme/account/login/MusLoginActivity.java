package com.p683ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.keva.Keva;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22137r;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui.FindPswByEmailActivity;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21168a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21176ac;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21191af;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21197ah;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21203ak;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21226av;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21259bc;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21290bt;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21301f;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21328n;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21346u;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21046b;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21606o;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21606o.C21607a;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22274n;
import com.p683ss.android.ugc.aweme.account.util.C22285w;
import com.p683ss.android.ugc.aweme.account.util.C22285w.C22286a;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginActivity */
public class MusLoginActivity extends MusAbsActivity implements C21328n, C21379m, C21606o {

    /* renamed from: a */
    public AgeGateResponse f57198a;

    /* renamed from: b */
    private C21168a f57199b;

    /* renamed from: c */
    private C21568ah f57200c;

    /* renamed from: d */
    private MusLoginManager f57201d;

    /* renamed from: e */
    private int f57202e;

    /* renamed from: f */
    private String f57203f;

    /* renamed from: g */
    private String f57204g;

    /* renamed from: h */
    private String f57205h;

    /* renamed from: i */
    private Set<C21607a> f57206i = new HashSet();

    /* renamed from: j */
    private C21464e f57207j;

    /* renamed from: k */
    private boolean f57208k = false;

    /* renamed from: a */
    public final MusLoginManager mo45023a() {
        return this.f57201d;
    }

    /* renamed from: c */
    public final int mo45033c() {
        return this.f57202e;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo45030b() {
        try {
            getSupportFragmentManager().mo2235c();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo45036d() {
        if (this.f57208k) {
            C20975a.m53337a(11);
        } else {
            C20975a.m53337a(10);
        }
    }

    /* renamed from: e */
    public final C0198r<String> mo45037e() {
        if (this.f57207j != null) {
            return this.f57207j.f58231b;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57201d = null;
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.wo).statusBarDarkFont(true).init();
    }

    public void finish() {
        super.finish();
        if (this.f57207j != null) {
            this.f57207j.mo45649c();
        }
        int intExtra = getIntent().getIntExtra("init_page", 0);
        C20884b.m53199a();
        if (intExtra == 1 || intExtra == 0) {
            if (C23826bi.m58466g()) {
                mo45036d();
            }
        } else if (intExtra == 8 || intExtra == 9 || intExtra == 10 || intExtra == 11) {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.getBoolean("from_last_login", false)) {
                if (!(this.f57199b instanceof C21055ac) || !((C21055ac) this.f57199b).ai_()) {
                    C23826bi.m58452a(7, 4, "");
                    if (!this.f57208k) {
                        C23826bi.m58451a(1, 2, (Object) "");
                    }
                } else {
                    C23826bi.m58470k().retryLogin();
                }
            }
        }
    }

    public void onBackPressed() {
        for (C21607a aVar : this.f57206i) {
            if (aVar != null) {
                aVar.mo45494i();
            }
        }
        List f = getSupportFragmentManager().mo2238f();
        if (f != null && f.size() > 0) {
            Fragment fragment = (Fragment) getSupportFragmentManager().mo2238f().get(f.size() - 1);
            if ((fragment instanceof C21046b) && ((C21046b) fragment).mo45081b()) {
                return;
            }
        }
        if (getSupportFragmentManager().mo2237e() == 1) {
            C22274n.m55129a(this, false, true);
        } else {
            mo45030b();
        }
    }

    /* renamed from: a */
    public final C21569a mo45024a(int i) {
        return this.f57200c.mo45835b(0);
    }

    /* renamed from: b */
    public final C22285w mo45029b(int i) {
        return this.f57200c.mo45833a(i);
    }

    /* renamed from: c */
    public final void mo45034c(int i) {
        this.f57202e = i;
    }

    /* renamed from: a */
    public final void mo45028a(C21607a aVar) {
        this.f57206i.add(aVar);
    }

    /* renamed from: b */
    public final void mo45032b(C21607a aVar) {
        this.f57206i.remove(aVar);
    }

    /* renamed from: a */
    public final void mo45026a(Bundle bundle) {
        this.f57208k = true;
        if (this.f57198a != null) {
            bundle.putSerializable("age_gate_response", this.f57198a);
        }
        if (!TextUtils.isEmpty(C21635v.f58647b)) {
            bundle.putString("enter_from", C21635v.f58647b);
        }
        if (!TextUtils.isEmpty(C21635v.f58646a)) {
            bundle.putString("enter_method", C21635v.f58646a);
        }
        if (C23826bi.m58462c()) {
            bundle.putBoolean("only_login", true);
        }
        C22137r.m54940a(bundle).mo20a((C0011g<TResult, TContinuationResult>) new C21054ab<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f57198a = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        if (bundle.getInt("current_fragment_id") > 0 && (getSupportFragmentManager().mo2222a(bundle.getInt("current_fragment_id")) instanceof C21168a)) {
            this.f57199b = (C21168a) getSupportFragmentManager().mo2222a(bundle.getInt("current_fragment_id"));
        }
        if (this.f57200c != null) {
            C21568ah ahVar = this.f57200c;
            ArrayList integerArrayList = bundle.getIntegerArrayList("ticker_types");
            if (integerArrayList != null) {
                Iterator it = integerArrayList.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (ahVar.f58504a.get(num.intValue()) != null) {
                        C21569a aVar = (C21569a) ahVar.f58504a.get(num.intValue());
                        StringBuilder sb = new StringBuilder("ticker_");
                        sb.append(num);
                        aVar.mo45836a(bundle.getBundle(sb.toString()));
                    } else {
                        C21569a aVar2 = new C21569a("", new C22285w(0, 0, null));
                        StringBuilder sb2 = new StringBuilder("ticker_");
                        sb2.append(num);
                        aVar2.mo45836a(bundle.getBundle(sb2.toString()));
                        ahVar.f58504a.put(num.intValue(), aVar2);
                    }
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f57198a != null) {
            bundle.putSerializable("age_gate_response", this.f57198a);
        }
        if (this.f57199b != null) {
            bundle.putInt("current_fragment_id", this.f57199b.getId());
        }
        if (this.f57200c != null) {
            C21568ah ahVar = this.f57200c;
            ArrayList arrayList = new ArrayList(ahVar.f58504a.size());
            for (int i = 0; i < ahVar.f58504a.size(); i++) {
                if (ahVar.f58504a.valueAt(i) != null) {
                    Bundle bundle2 = new Bundle();
                    C21569a aVar = (C21569a) ahVar.f58504a.valueAt(i);
                    bundle2.putString("phone_ticker_phone_number", aVar.f58505a);
                    C22285w wVar = aVar.f58506b;
                    bundle2.putLong("ticker_start_time", wVar.f60051a);
                    bundle2.putLong("ticker_duration", wVar.f60052b);
                    if (wVar.f60055e.hasMessages(BaseNotice.HASHTAG)) {
                        bundle2.putBoolean("ticker_is_running", true);
                        wVar.mo46379a();
                    }
                    StringBuilder sb = new StringBuilder("ticker_");
                    sb.append(ahVar.f58504a.keyAt(i));
                    bundle.putBundle(sb.toString(), bundle2);
                    arrayList.add(Integer.valueOf(ahVar.f58504a.keyAt(i)));
                }
            }
            if (arrayList.size() > 0) {
                bundle.putIntegerArrayList("ticker_types", arrayList);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.azv);
        this.f57203f = getIntent().getStringExtra("enter_from");
        this.f57204g = getIntent().getStringExtra("enter_method");
        this.f57205h = getIntent().getStringExtra("enter_type");
        if (getIntent().getBooleanExtra("use_find_email_pass_ticker_wrapper", false)) {
            this.f57200c = FindPswByEmailActivity.f57446a;
        }
        if (this.f57200c == null) {
            this.f57200c = new C21568ah();
        }
        this.f57201d = new MusLoginManager();
        this.f57207j = new C21464e(this);
        this.f57207j.mo45648b();
        this.f57207j.mo45647a();
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("init_page", 0);
            if (getIntent().getExtras() != null) {
                bundle2 = getIntent().getExtras();
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("enter_from", getIntent().getStringExtra("enter_from"));
            bundle2.putString("enter_method", getIntent().getStringExtra("enter_method"));
            bundle2.putString("enter_type", this.f57205h);
            if (intExtra == 1) {
                if (!C20884b.m53201b()) {
                    if (!C20884b.m53202c()) {
                        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
                    }
                    this.f57199b = new C21346u();
                    bundle2.putString("enter_type", this.f57205h);
                    this.f57199b.setArguments(bundle2);
                } else if (C21472c.m54111a()) {
                    this.f57199b = new C21290bt();
                    bundle2.putString("enter_type", this.f57205h);
                    this.f57199b.setArguments(bundle2);
                } else {
                    this.f57199b = new C21226av();
                    bundle2.putString("enter_type", this.f57205h);
                    this.f57199b.setArguments(bundle2);
                }
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 0) {
                bundle2.putBoolean("need_auto_fill_account_name", getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true));
                bundle2.putBoolean("need_auto_fill_phone_number", getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true));
                if (C22298e.m55182a()) {
                    bundle2.putString("enter_type", this.f57205h);
                    this.f57199b = new C21301f();
                    this.f57199b.setArguments(bundle2);
                } else {
                    bundle2.putString("enter_type", this.f57205h);
                    bundle2.putInt("order", 0);
                    this.f57199b = new C21203ak();
                    this.f57199b.setArguments(bundle2);
                }
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 8 || intExtra == 9) {
                bundle2.putBoolean("need_auto_fill_account_name", true);
                bundle2.putString("enter_type", this.f57205h);
                this.f57199b = new C21301f();
                this.f57199b.setArguments(bundle2);
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 11 || intExtra == 10) {
                bundle2.putBoolean("need_auto_fill_phone_number", true);
                bundle2.putString("enter_type", this.f57205h);
                bundle2.putInt("order", 0);
                this.f57199b = new C21203ak();
                this.f57199b.setArguments(bundle2);
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 2) {
                this.f57199b = new C21176ac();
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 3) {
                this.f57199b = (C21168a) C22271m.m55124a(C21259bc.class, bundle2).mo46371a("set_pass_scene", 2).mo46372a("enter_type", this.f57205h).mo46370a();
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 4) {
                this.f57199b = (C21168a) C22271m.m55124a(C21346u.class, bundle2).mo46371a("init_page", 4).mo46372a("enter_type", this.f57205h).mo46373a("ftc_detect", true).mo46370a();
                mo45027a(this.f57199b, false);
            } else if (intExtra == 5) {
                this.f57199b = (C21168a) C22271m.m55124a(C21191af.class, bundle2).mo46371a("init_page", 5).mo46372a("enter_type", this.f57205h).mo46373a("ftc_detect", true).mo46370a();
                mo45027a(this.f57199b, false);
            } else if (intExtra == 6) {
                this.f57199b = (C21168a) C22271m.m55124a(C21197ah.class, bundle2).mo46371a("init_page", 6).mo46372a("enter_type", this.f57205h).mo46373a("ftc_detect", true).mo46370a();
                mo45027a(this.f57199b, false);
            } else if (intExtra == 7) {
                this.f57199b = (C21168a) C22271m.m55124a(C21346u.class, bundle2).mo46371a("init_page", 7).mo46372a("enter_type", "click_login").mo46370a();
                mo45027a(this.f57199b, false);
            } else if (intExtra == 12) {
                this.f57199b = (C21168a) C22271m.m55124a(C21227aw.class, getIntent().getExtras()).mo46371a("code_type", 7).mo46372a("enter_type", this.f57205h).mo46370a();
                this.f57199b.mo45323a((C21328n) this);
                mo45027a(this.f57199b, false);
            } else if (intExtra == 13) {
                Serializable serializableExtra = getIntent().getSerializableExtra("age_gate_data");
                if (serializableExtra != null) {
                    this.f57198a = (AgeGateResponse) serializableExtra;
                }
                this.f57199b = (C21168a) C22271m.m55124a(C21191af.class, bundle2).mo46371a("init_page", bundle2.getInt("age_gate_init_type")).mo46370a();
                mo45027a(this.f57199b, false);
            } else {
                finish();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo45031b(Fragment fragment, boolean z) {
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

    /* renamed from: c */
    public final void mo45035c(Fragment fragment, boolean z) {
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
    public final void mo45027a(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2238f() == null) {
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, fragment).mo2195c();
        } else if (!z || getSupportFragmentManager().mo2237e() <= 1) {
            C0679r a = getSupportFragmentManager().mo2225a();
            a.mo2191b(R.id.ajf, fragment);
            a.mo2179a((String) null);
            a.mo2195c();
        } else {
            mo45030b();
        }
    }

    /* renamed from: a */
    public final void mo45025a(int i, String str, long j, int i2, C22286a aVar) {
        this.f57200c.mo45834a(i, str, j, 60, aVar);
    }
}
