package com.p683ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.facebook.common.p920d.C13689i;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator */
public class MediaTypeNavigator extends RelativeLayout {

    /* renamed from: a */
    public LinearLayout f98396a;

    /* renamed from: b */
    public LinearLayout f98397b;

    /* renamed from: c */
    public View f98398c;

    /* renamed from: d */
    private ImageView f98399d;

    /* renamed from: e */
    private int f98400e;

    /* renamed from: f */
    private boolean f98401f;

    /* renamed from: g */
    private boolean f98402g;

    public ImageView getTabIndicator() {
        return this.f98399d;
    }

    public int getTabIndicatorWidth() {
        if (this.f98400e <= 0) {
            throw new IllegalStateException("tabWidth not initialized, can't get tab indicator width");
        } else if (!this.f98402g) {
            return this.f98400e;
        } else {
            return this.f98400e - ((int) C9432q.m18687b(getContext(), 16.0f));
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f98397b = (LinearLayout) findViewById(R.id.ejx);
        this.f98396a = (LinearLayout) findViewById(R.id.cwn);
        this.f98399d = (ImageView) findViewById(R.id.b1o);
    }

    public MediaTypeNavigator(Context context) {
        super(context);
    }

    public void setGreenScreenMode(boolean z) {
        this.f98402g = z;
    }

    public void setHasAllTab(boolean z) {
        this.f98401f = z;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        boolean z;
        C13689i.m27652a(viewPager);
        C13689i.m27652a(viewPager.getAdapter());
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27652a(Boolean.valueOf(z));
        this.f98400e = C9432q.m18670a(getContext()) / adapter.getCount();
        LayoutParams layoutParams = (LayoutParams) this.f98397b.getLayoutParams();
        if (this.f98402g) {
            int tabIndicatorWidth = getTabIndicatorWidth();
            layoutParams.leftMargin = this.f98400e - tabIndicatorWidth;
            layoutParams.width = tabIndicatorWidth;
        } else {
            layoutParams.width = this.f98400e;
        }
        this.f98397b.setLayoutParams(layoutParams);
        this.f98396a.removeAllViews();
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.av5, this.f98396a, false);
            if (this.f98401f) {
                if (i == 0) {
                    this.f98398c = textView;
                    textView.setSelected(true);
                    textView.getPaint().setFakeBoldText(true);
                    textView.setText(R.string.hjd);
                } else if (i == 1) {
                    textView.setText(R.string.fau);
                } else if (i == 2) {
                    textView.setText(R.string.bqj);
                }
            } else if (i == 0) {
                this.f98398c = textView;
                textView.setSelected(true);
                textView.getPaint().setFakeBoldText(true);
                textView.setText(R.string.fau);
            } else if (i == 1) {
                textView.setText(R.string.bqj);
            }
            if (!TextUtils.isEmpty(adapter.getPageTitle(i))) {
                textView.setText(adapter.getPageTitle(i));
            }
            textView.setOnClickListener(new C38688a(viewPager, i));
            this.f98396a.addView(textView);
        }
        viewPager.addOnPageChangeListener(new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                View childAt = MediaTypeNavigator.this.f98396a.getChildAt(i);
                if (MediaTypeNavigator.this.f98398c != null) {
                    MediaTypeNavigator.this.f98398c.setSelected(false);
                    ((TextView) MediaTypeNavigator.this.f98398c).getPaint().setFakeBoldText(false);
                }
                if (childAt != null) {
                    childAt.setSelected(true);
                    ((TextView) childAt).getPaint().setFakeBoldText(true);
                    MediaTypeNavigator.this.f98398c = childAt;
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                float tabIndicatorWidth = ((float) MediaTypeNavigator.this.getTabIndicatorWidth()) * (((float) i) + f);
                if (C47918gj.m103682a(MediaTypeNavigator.this.getContext())) {
                    tabIndicatorWidth = -tabIndicatorWidth;
                }
                MediaTypeNavigator.this.f98397b.setTranslationX(tabIndicatorWidth);
            }
        });
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
