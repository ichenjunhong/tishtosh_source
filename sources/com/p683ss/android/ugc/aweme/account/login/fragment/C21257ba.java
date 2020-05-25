package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13131h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ba */
final /* synthetic */ class C21257ba implements Runnable {

    /* renamed from: a */
    private final C21227aw f57727a;

    C21257ba(C21227aw awVar) {
        this.f57727a = awVar;
    }

    public final void run() {
        C21227aw awVar = this.f57727a;
        if (awVar.isViewValid() && awVar.getActivity() != null) {
            if (!TextUtils.isEmpty(awVar.f57666E)) {
                awVar.mo45158a(awVar.f57666E, awVar.f57667F, C22165u.f59782v, awVar.f57663B);
            }
            boolean z = false;
            if (awVar.f57692t != -1) {
                if (awVar.f57511d != null) {
                    awVar.f57511d.mo45029b(0).f60053c = 60 - awVar.f57692t;
                    awVar.f57697y.mo45750a();
                }
                return;
            }
            if (awVar.f57697y.getRemainTick() == 0) {
                if (awVar.f57664C == 6) {
                    if (awVar.getArguments() != null) {
                        awVar.f57697y.mo45750a();
                        awVar.f57671J.mo24625a(awVar.getArguments().getString("email"), (String) null, awVar.getArguments().getString("pass_word"), 1, (String) null, (Map) null, (String) null, (C13131h) new C13131h() {
                            public final void onSuccess(C12993e<C13109h> eVar) {
                            }

                            public final void onError(C12993e<C13109h> eVar, int i) {
                                C10691a.m21546b(C21227aw.this.getContext(), eVar.f34001d, 0).mo19066a();
                            }
                        });
                        C26890h.m65011a("send_email_code", new C20856a().mo44776a("send_method", "auto_system").mo44776a("send_reason", "trigger_verification").f56798a);
                    }
                } else if (awVar.f57664C == 7) {
                    if (awVar.getArguments() != null) {
                        awVar.f57697y.mo45750a();
                        awVar.f57671J.mo24625a(awVar.getArguments().getString("email"), (String) null, (String) null, 4, (String) null, (Map) null, (String) null, (C13131h) new C13131h() {
                            public final void onSuccess(C12993e<C13109h> eVar) {
                            }

                            public final void onError(C12993e<C13109h> eVar, int i) {
                                C10691a.m21546b(C21227aw.this.getContext(), eVar.f34001d, 0).mo19066a();
                            }
                        });
                        C26890h.m65011a("send_email_code", new C20856a().mo44776a("send_method", "auto_system").mo44776a("send_reason", "reset_password").f56798a);
                    }
                } else if (awVar.f57664C == 2) {
                    awVar.f57697y.mo45750a();
                    int i = C22165u.f59781u;
                    boolean a = C22299f.m55184a();
                    awVar.f57671J.mo24611a(awVar.mo45384l(), "", i, 0, "", 1, a ? 1 : 0, (C13139p) awVar.f57662A);
                } else if (!awVar.f57689q) {
                    awVar.f57697y.mo45750a();
                    int i2 = C22165u.f59781u;
                    String str = "";
                    if (awVar.f57668G != null) {
                        i2 = awVar.f57668G.mo45267i();
                        str = awVar.f57668G.mo45266h();
                    }
                    int i3 = i2;
                    String str2 = str;
                    if (awVar.f57668G == null && !C20884b.m53202c()) {
                        z = true;
                    }
                    if (!awVar.f57665D && !z) {
                        if (awVar.f57690r) {
                            boolean a2 = C22299f.m55184a();
                            C20900b.m53233a(awVar.getActivity(), awVar.mo45384l(), "", i3, 0, str2, 1, a2 ? 1 : 0, awVar.f57662A).mo24766d();
                            return;
                        }
                        boolean a3 = C22299f.m55184a();
                        awVar.f57671J.mo24611a(awVar.mo45384l(), "", i3, 0, str2, 1, a3 ? 1 : 0, (C13139p) awVar.f57662A);
                    }
                }
            }
        }
    }
}
