package com.p683ss.android.ugc.aweme.poi.preview.view.indicator;

import android.content.Context;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39160a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator */
public final class TitleIndicator extends AppCompatTextView {

    /* renamed from: b */
    public C39160a f100136b;

    /* renamed from: c */
    public final C39216a f100137c;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator$a */
    public static final class C39216a implements C0997e {

        /* renamed from: a */
        final /* synthetic */ TitleIndicator f100138a;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C39216a(TitleIndicator titleIndicator) {
            this.f100138a = titleIndicator;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageSelected(int r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator r0 = r2.f100138a
                com.ss.android.ugc.aweme.poi.preview.b.a r0 = r0.f100136b
                if (r0 == 0) goto L_0x000f
                com.ss.android.ugc.aweme.poi.preview.c.e r0 = r0.getTransferConfig()
                if (r0 == 0) goto L_0x000f
                int r0 = r0.f99934F
                goto L_0x0012
            L_0x000f:
                r0 = 2147483647(0x7fffffff, float:NaN)
            L_0x0012:
                com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator r1 = r2.f100138a
                com.ss.android.ugc.aweme.poi.preview.b.a r1 = r1.f100136b
                if (r1 == 0) goto L_0x003e
                com.ss.android.ugc.aweme.poi.preview.c.e r1 = r1.getTransferConfig()
                if (r1 == 0) goto L_0x003e
                int r3 = r3 % r0
                java.util.List<java.lang.String> r0 = r1.f99948n
                boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
                if (r0 != 0) goto L_0x003b
                if (r3 < 0) goto L_0x003b
                java.util.List<java.lang.String> r0 = r1.f99948n
                int r0 = r0.size()
                if (r3 < r0) goto L_0x0032
                goto L_0x003b
            L_0x0032:
                java.util.List<java.lang.String> r0 = r1.f99948n
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x003f
            L_0x003b:
                java.lang.String r3 = ""
                goto L_0x003f
            L_0x003e:
                r3 = 0
            L_0x003f:
                if (r3 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator r0 = r2.f100138a
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator.C39216a.onPageSelected(int):void");
        }
    }

    public TitleIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public TitleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TitleIndicator(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f100137c = new C39216a(this);
    }

    public /* synthetic */ TitleIndicator(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
