package com.p683ss.android.ugc.aweme.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.component.C23504f;
import com.p683ss.android.ugc.aweme.base.component.C23505g;

/* renamed from: com.ss.android.ugc.aweme.login.f */
public final class C27965f {

    /* renamed from: a */
    public static C23504f f73395a;

    /* renamed from: a */
    public static void m66727a(C23504f fVar) {
        f73395a = fVar;
    }

    /* renamed from: a */
    public static void m66719a(Activity activity, String str, String str2) {
        m66721a(activity, str, str2, (Bundle) null, (C23505g) null);
    }

    /* renamed from: a */
    public static void m66723a(Fragment fragment, String str, String str2) {
        m66725a(fragment, str, str2, (Bundle) null, (C23505g) null);
    }

    /* renamed from: a */
    public static void m66720a(Activity activity, String str, String str2, Bundle bundle) {
        m66721a(activity, str, str2, bundle, (C23505g) null);
    }

    /* renamed from: a */
    public static void m66722a(Activity activity, String str, String str2, C23505g gVar) {
        m66721a(activity, str, str2, (Bundle) null, gVar);
    }

    /* renamed from: a */
    public static void m66724a(Fragment fragment, String str, String str2, Bundle bundle) {
        m66725a(fragment, str, str2, bundle, (C23505g) null);
    }

    /* renamed from: a */
    public static void m66726a(Fragment fragment, String str, String str2, C23505g gVar) {
        m66725a(fragment, str, str2, (Bundle) null, gVar);
    }

    /* renamed from: a */
    public static void m66721a(Activity activity, String str, String str2, Bundle bundle, C23505g gVar) {
        if (f73395a == null && AmeActivity.getLoginComponentFactory() != null && activity != null && !activity.isFinishing()) {
            m66727a(AmeActivity.getLoginComponentFactory().mo48435a((AbsActivity) activity));
        }
        if (f73395a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (activity != null && !activity.isFinishing()) {
            f73395a.mo48658a(activity, str, str2, bundle, gVar);
        }
    }

    /* renamed from: a */
    public static void m66725a(Fragment fragment, String str, String str2, Bundle bundle, C23505g gVar) {
        if (!(f73395a != null || AmeActivity.getLoginComponentFactory() == null || fragment == null || fragment.getActivity() == null || fragment.getActivity().isFinishing())) {
            m66727a(AmeActivity.getLoginComponentFactory().mo48435a((AbsActivity) fragment.getActivity()));
        }
        if (f73395a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            f73395a.mo48659a(fragment, str, str2, bundle, gVar);
        }
    }
}
