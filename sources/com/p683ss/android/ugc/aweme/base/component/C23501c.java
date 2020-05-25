package com.p683ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.component.c */
public final class C23501c extends C0655a {

    /* renamed from: a */
    private WeakReference<C22582c> f62591a;

    public final void onFragmentResumed(C0654k kVar, Fragment fragment) {
        super.onFragmentResumed(kVar, fragment);
    }

    public final void onFragmentStopped(C0654k kVar, Fragment fragment) {
        super.onFragmentStopped(kVar, fragment);
    }

    public final void onFragmentAttached(C0654k kVar, Fragment fragment, Context context) {
        super.onFragmentAttached(kVar, fragment, context);
        if (fragment instanceof C22582c) {
            this.f62591a = new WeakReference<>((C22582c) fragment);
        }
    }
}
