package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a */
public final class C44610a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a */
    public static class C44612a extends C1000h {

        /* renamed from: a */
        private final ViewPager f112869a;

        /* renamed from: b */
        private final ViewPagerBottomSheetBehavior<View> f112870b;

        public final void onPageSelected(int i) {
            ViewPager viewPager = this.f112869a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f112870b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new C44613b(viewPagerBottomSheetBehavior));
        }

        private C44612a(ViewPager viewPager, View view) {
            this.f112869a = viewPager;
            this.f112870b = ViewPagerBottomSheetBehavior.m97563b(view);
        }
    }
}
