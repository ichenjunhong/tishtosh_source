package com.p683ss.android.ugc.aweme.account.loginsetting;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.e */
public final class C22049e {

    /* renamed from: a */
    public static final C22049e f59544a = new C22049e();

    /* renamed from: b */
    private static final boolean f59545b = false;

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.e$a */
    static final class C22050a<TTaskResult, TContinuationResult> implements C0011g<C22045b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22044a f59546a;

        C22050a(C22044a aVar) {
            this.f59546a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (!C47957v.m103770a(iVar)) {
                C22044a aVar = this.f59546a;
                if (aVar != null) {
                    aVar.mo45313a(false);
                }
            } else {
                C52711k.m112236a((Object) iVar, "task");
                C22045b bVar = (C22045b) iVar.mo34e();
                C22044a aVar2 = this.f59546a;
                if (aVar2 != null) {
                    aVar2.mo45313a(bVar.f59541a.f59543a);
                }
            }
            return C52860x.f131107a;
        }
    }

    private C22049e() {
    }

    /* renamed from: a */
    public static final void m54782a(String str, C22044a aVar) {
        if (!TextUtils.isEmpty(str)) {
            C0013i a = AccountApiInModule.m53226a(str);
            if (a != null) {
                a.mo19a((C0011g<TResult, TContinuationResult>) new C22050a<TResult,TContinuationResult>(aVar));
            } else if (aVar != null) {
                aVar.mo45313a(false);
            }
        } else if (aVar != null) {
            aVar.mo45313a(false);
        }
    }
}
