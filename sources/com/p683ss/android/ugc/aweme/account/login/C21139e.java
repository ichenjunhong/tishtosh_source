package com.p683ss.android.ugc.aweme.account.login;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.e */
final /* synthetic */ class C21139e implements Runnable {

    /* renamed from: a */
    private final ViewPagerBottomSheetBehavior f57433a;

    C21139e(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f57433a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f57433a;
        if (viewPagerBottomSheetBehavior.f57224l != null) {
            viewPagerBottomSheetBehavior.f57225m = new WeakReference<>(viewPagerBottomSheetBehavior.mo45057a((View) viewPagerBottomSheetBehavior.f57224l.get()));
        }
    }
}
