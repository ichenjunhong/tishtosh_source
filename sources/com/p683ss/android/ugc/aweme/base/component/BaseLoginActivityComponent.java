package com.p683ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;

/* renamed from: com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent */
public abstract class BaseLoginActivityComponent implements C0183j, C23504f {
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
    }

    public final void cu_() {
        C20854a.m53162b().openPrivacyPolicy(C11016e.m22312g());
    }

    /* renamed from: a */
    public final void mo48660a(String str) {
        mo48658a(C11016e.m22312g(), "", "", (Bundle) null, (C23505g) null);
    }

    /* renamed from: a */
    public void mo48658a(Activity activity, String str, String str2, Bundle bundle, C23505g gVar) {
        if (activity instanceof C0184k) {
            ((C0184k) activity).getLifecycle().mo324a(this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }

    /* renamed from: a */
    public void mo48659a(Fragment fragment, String str, String str2, Bundle bundle, C23505g gVar) {
        fragment.getLifecycle().mo324a(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }
}
