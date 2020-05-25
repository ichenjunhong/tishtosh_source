package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13126c;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21168a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21203ak;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21203ak.C21210a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.C21250a;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21328n;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21052h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21100e;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21103h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22285w;
import com.p683ss.android.ugc.aweme.account.util.C22285w.C22286a;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity */
public class MModifyMobileActivity extends MusAbsActivity implements C21210a, C21250a, C21328n {

    /* renamed from: a */
    public static int f59876a = 0;

    /* renamed from: b */
    public static int f59877b = 1;

    /* renamed from: c */
    public C0654k f59878c;

    /* renamed from: d */
    public int f59879d = f59876a;

    /* renamed from: e */
    public C21168a f59880e;

    /* renamed from: f */
    public String f59881f = "";

    /* renamed from: g */
    private C21568ah f59882g;

    /* renamed from: h */
    private MusLoginManager f59883h;

    /* renamed from: i */
    private C21464e f59884i;

    /* renamed from: j */
    private C13011d f59885j;

    /* renamed from: a */
    public final MusLoginManager mo45023a() {
        return this.f59883h;
    }

    /* renamed from: a */
    public final void mo45026a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo45027a(Fragment fragment, boolean z) {
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

    public void dismiss() {
    }

    /* renamed from: e */
    public final String mo45262e() {
        return null;
    }

    /* renamed from: h */
    public final String mo45266h() {
        return this.f59881f;
    }

    /* renamed from: k */
    public final String mo45270k() {
        return null;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: j */
    public final int mo45269j() {
        return mo45267i();
    }

    /* renamed from: b */
    public final String mo45259b() {
        if (this.f59879d == f59877b) {
            return getString(R.string.coo);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo45263f() {
        if (this.f59879d == f59877b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo45265g() {
        try {
            getSupportFragmentManager().mo2235c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public final C0198r<String> mo45271l() {
        if (this.f59884i != null) {
            return this.f59884i.f58231b;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f59884i != null) {
            this.f59884i.mo45649c();
        }
    }

    /* renamed from: d */
    public final String mo45260d() {
        if (this.f59879d == f59876a) {
            return getString(R.string.col);
        }
        if (this.f59879d == f59877b) {
            return getString(R.string.f133600com);
        }
        return "";
    }

    /* renamed from: i */
    public final int mo45267i() {
        if (this.f59879d == f59876a) {
            return C22165u.f59785y;
        }
        if (this.f59879d == f59877b) {
            return C22165u.f59777q;
        }
        return C22165u.f59781u;
    }

    /* renamed from: a */
    public final C21569a mo45024a(int i) {
        return this.f59882g.mo45835b(0);
    }

    /* renamed from: b */
    public final C22285w mo45029b(int i) {
        return this.f59882g.mo45833a(i);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.azw);
        this.f59885j = C13081d.m26312a(getApplicationContext());
        this.f59878c = getSupportFragmentManager();
        mo46307a(this.f59878c);
        this.f59882g = new C21568ah();
        this.f59883h = new MusLoginManager();
        this.f59884i = new C21464e(this);
        this.f59884i.mo45648b();
        this.f59884i.mo45647a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.MModifyMobileActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo46307a(C0654k kVar) {
        C0679r a = kVar.mo2225a();
        C21203ak akVar = new C21203ak();
        akVar.f57616s = this;
        akVar.mo45323a((C21328n) this);
        if (C9376b.m18558a((Collection<T>) kVar.mo2238f())) {
            a.mo2175a((int) R.id.b6q, (Fragment) akVar).mo2195c();
        } else {
            a.mo2191b(R.id.b6q, akVar).mo2195c();
        }
    }

    /* renamed from: a */
    public final void mo45256a(String str, String str2, final C21100e eVar) {
        if (this.f59879d == f59876a) {
            this.f59885j.mo24608a(str2, C22165u.f59785y, true, (C13143t) new C13143t() {
                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C12996h hVar = (C12996h) bVar;
                    if (MModifyMobileActivity.this.isViewValid()) {
                        MModifyMobileActivity.this.f59881f = hVar.f34021h;
                        MModifyMobileActivity.this.f59879d = MModifyMobileActivity.f59877b;
                        if (eVar != null) {
                            eVar.mo45153a();
                        }
                        MModifyMobileActivity.this.mo46307a(MModifyMobileActivity.this.f59878c);
                    }
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    C12996h hVar = (C12996h) bVar;
                    if (MModifyMobileActivity.this.isViewValid()) {
                        if (eVar != null) {
                            eVar.mo45154a(hVar.f34001d, i);
                        }
                        C10691a.m21545b((Context) MModifyMobileActivity.this, hVar.f34001d).mo19066a();
                    }
                }
            });
            return;
        }
        if (this.f59879d == f59877b) {
            this.f59885j.mo24633a(str, str2, "", this.f59881f, (C13126c) new C21103h(new C21108m() {
                /* renamed from: a */
                public final void mo45158a(String str, String str2, int i, C21612a aVar) {
                }

                /* renamed from: d */
                public final void mo45159d() {
                }
            }) {
                /* renamed from: a */
                public final void mo45156a(C12993e<C13104c> eVar) {
                    if (MModifyMobileActivity.this.isViewValid()) {
                        if (eVar != null) {
                            eVar.mo45154a(eVar.f34001d, eVar.f34000c);
                        }
                        C10691a.m21545b((Context) MModifyMobileActivity.this, eVar.f34001d).mo19066a();
                    }
                }

                public final void onSuccess(C12993e<C13104c> eVar) {
                    String str;
                    if (MModifyMobileActivity.this.isViewValid()) {
                        User i = C23826bi.m58468i();
                        if (!(i == null || eVar.f34007h == null || ((C13104c) eVar.f34007h).f34245f == null)) {
                            C18494a aVar = (C18494a) ((C13104c) eVar.f34007h).f34245f.f34475c.get("mobile");
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
                        C10691a.m21533a((Context) C23826bi.m58460b(), (int) R.string.c79).mo19066a();
                        MModifyMobileActivity.this.finish();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo45257a(final String str, final String str2, C21168a aVar) {
        int i;
        C13011d dVar = this.f59885j;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        String sb2 = sb.toString();
        String str3 = "";
        int j = mo45269j();
        String str4 = this.f59881f;
        if (this.f59879d == f59876a) {
            i = 0;
        } else {
            i = 1;
        }
        boolean a = C22299f.m55184a();
        dVar.mo24611a(sb2, str3, j, 0, str4, i, a ? 1 : 0, (C13139p) new C21052h(aVar) {
            /* renamed from: a */
            public final void mo45104a(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo45100a() {
                C22097f.m54898a(0, MModifyMobileActivity.this.mo45267i(), 0, "");
                if (MModifyMobileActivity.this.isViewValid()) {
                    if (MModifyMobileActivity.this.f59879d == MModifyMobileActivity.f59876a) {
                        MModifyMobileActivity.this.f59880e = MModifyMobileActivity.this.mo46306a(MModifyMobileActivity.this.f59878c, str, str2, 3);
                        return;
                    }
                    if (MModifyMobileActivity.this.f59879d == MModifyMobileActivity.f59877b) {
                        MModifyMobileActivity.this.f59880e = MModifyMobileActivity.this.mo46306a(MModifyMobileActivity.this.f59878c, str, str2, 4);
                    }
                }
            }

            /* renamed from: a */
            public final void mo45101a(int i) {
                C22097f.m54898a(1, MModifyMobileActivity.this.mo45267i(), i, "PhoneInvalid");
                if (MModifyMobileActivity.this.isViewValid()) {
                    C10691a.m21542b((Context) MModifyMobileActivity.this, (int) R.string.ca7).mo19066a();
                }
            }

            /* renamed from: b */
            public final void mo45170b(C12993e<C13120s> eVar) {
                C22097f.m54898a(1, MModifyMobileActivity.this.mo45267i(), eVar.f34000c, eVar.f34001d);
                if (MModifyMobileActivity.this.isViewValid()) {
                    C10691a.m21542b((Context) MModifyMobileActivity.this, (int) R.string.ccn).mo19066a();
                }
            }

            /* renamed from: a */
            public final void mo45103a(C12993e<C13120s> eVar) {
                C22097f.m54898a(1, MModifyMobileActivity.this.mo45267i(), eVar.f34000c, eVar.f34001d);
                if (MModifyMobileActivity.this.isViewValid() && !TextUtils.isEmpty(eVar.f34001d)) {
                    C10691a.m21545b((Context) MModifyMobileActivity.this, eVar.f34001d).mo19066a();
                }
            }

            /* renamed from: a */
            public final void mo45102a(int i, String str) {
                C22097f.m54898a(1, MModifyMobileActivity.this.mo45267i(), i, "PhoneRegistered");
                if (MModifyMobileActivity.this.isViewValid()) {
                    MModifyMobileActivity mModifyMobileActivity = MModifyMobileActivity.this;
                    if (TextUtils.isEmpty(str)) {
                        str = MModifyMobileActivity.this.getResources().getString(R.string.coj);
                    }
                    C10691a.m21545b((Context) mModifyMobileActivity, str).mo19066a();
                }
            }
        });
    }

    /* renamed from: a */
    public final C21168a mo46306a(C0654k kVar, String str, String str2, int i) {
        C0679r a = kVar.mo2225a();
        C21227aw awVar = new C21227aw();
        awVar.mo45323a((C21328n) this);
        awVar.f57668G = this;
        Bundle bundle = new Bundle();
        bundle.putString("country_code", str);
        bundle.putString("phone_number", str2);
        bundle.putInt("code_type", i);
        bundle.putLong("sms_have_send_time", 60);
        awVar.setArguments(bundle);
        if (C9376b.m18558a((Collection<T>) kVar.mo2238f())) {
            a.mo2175a((int) R.id.b6q, (Fragment) awVar).mo2179a((String) null).mo2195c();
        } else {
            a.mo2191b(R.id.b6q, awVar).mo2179a((String) null).mo2195c();
        }
        return awVar;
    }

    /* renamed from: a */
    public final void mo45025a(int i, String str, long j, int i2, C22286a aVar) {
        this.f59882g.mo45834a(i, str, j, 60, aVar);
    }
}
