package com.p683ss.android.ugc.aweme.poi.preview.view.indicator;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.C2240a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.indicator.NumberIndicator */
public class NumberIndicator extends AppCompatTextView {

    /* renamed from: b */
    public ViewPager f100132b;

    /* renamed from: c */
    public int f100133c;

    /* renamed from: d */
    private final C0997e f100134d;

    public int getCurrentItem() {
        if (this.f100132b != null) {
            return this.f100132b.getCurrentItem() % this.f100133c;
        }
        return -1;
    }

    public NumberIndicator(Context context) {
        this(context, null);
    }

    public void setRealSize(int i) {
        if (i > 0) {
            this.f100133c = i;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f100132b = viewPager;
            this.f100132b.removeOnPageChangeListener(this.f100134d);
            this.f100132b.addOnPageChangeListener(this.f100134d);
            this.f100134d.onPageSelected(this.f100132b.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f100134d = new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (NumberIndicator.this.f100132b.getAdapter() != null && NumberIndicator.this.f100133c > 0) {
                    NumberIndicator.this.setText(C2240a.m6773a(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf((i % NumberIndicator.this.f100133c) + 1), Integer.valueOf(NumberIndicator.this.f100133c)}));
                }
            }
        };
        setTextColor(-2130706433);
        setTextSize(14.0f);
    }
}
