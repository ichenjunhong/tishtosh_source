package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.b */
final /* synthetic */ class C44613b implements Runnable {

    /* renamed from: a */
    private final ViewPagerBottomSheetBehavior f112871a;

    C44613b(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f112871a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f112871a;
        viewPagerBottomSheetBehavior.f112848j = new WeakReference<>(viewPagerBottomSheetBehavior.mo90552a((View) viewPagerBottomSheetBehavior.f112847i.get()));
    }
}
