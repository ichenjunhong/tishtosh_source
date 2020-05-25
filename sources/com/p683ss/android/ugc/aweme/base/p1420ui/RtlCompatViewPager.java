package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.view.DmtViewPager;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager */
public class RtlCompatViewPager extends DmtViewPager {

    /* renamed from: g */
    private final boolean f63007g;

    /* renamed from: h */
    private int f63008h;

    /* renamed from: i */
    private C23635b f63009i;

    /* renamed from: j */
    private C0777a<C0997e, C23634a> f63010j = new C0777a<>();

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager$a */
    class C23634a implements C0997e {

        /* renamed from: a */
        C0997e f63011a;

        public final void onPageScrollStateChanged(int i) {
            if (this.f63011a != null) {
                this.f63011a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f63011a != null) {
                this.f63011a.onPageSelected(RtlCompatViewPager.this.mo49049a(i));
            }
        }

        C23634a(C0997e eVar) {
            this.f63011a = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f63011a != null) {
                int a = RtlCompatViewPager.this.mo49049a(i);
                if (RtlCompatViewPager.this.mo2958a()) {
                    float f2 = ((float) a) - f;
                    int i3 = (int) f2;
                    int i4 = i3;
                    f = f2 - ((float) i3);
                    a = i4;
                }
                this.f63011a.onPageScrolled(a, f, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager$b */
    static class C23635b extends PagerAdapter {

        /* renamed from: a */
        PagerAdapter f63013a;

        /* renamed from: b */
        private DataSetObserver f63014b = new DataSetObserver() {
            public final void onInvalidated() {
                onChanged();
            }

            public final void onChanged() {
                C23635b.super.notifyDataSetChanged();
            }
        };

        public final int getCount() {
            return this.f63013a.getCount();
        }

        public final void notifyDataSetChanged() {
            this.f63013a.notifyDataSetChanged();
        }

        public final Parcelable saveState() {
            return this.f63013a.saveState();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo49051a() {
            try {
                this.f63013a.unregisterDataSetObserver(this.f63014b);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private int m57958a(int i) {
            return (getCount() - i) - 1;
        }

        public final void finishUpdate(ViewGroup viewGroup) {
            this.f63013a.finishUpdate(viewGroup);
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f63013a.registerDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        public final void startUpdate(ViewGroup viewGroup) {
            this.f63013a.startUpdate(viewGroup);
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f63013a.unregisterDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        public final CharSequence getPageTitle(int i) {
            return this.f63013a.getPageTitle(m57958a(i));
        }

        public final float getPageWidth(int i) {
            return this.f63013a.getPageWidth(m57958a(i));
        }

        C23635b(PagerAdapter pagerAdapter) {
            this.f63013a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(this.f63014b);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = this.f63013a.getItemPosition(obj);
            if (itemPosition == -1 || itemPosition == -2) {
                return itemPosition;
            }
            return m57958a(itemPosition);
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return this.f63013a.isViewFromObject(view, obj);
        }

        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f63013a.restoreState(parcelable, classLoader);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            return this.f63013a.instantiateItem(viewGroup, m57958a(i));
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            this.f63013a.destroyItem(viewGroup, m57958a(i), obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            this.f63013a.setPrimaryItem(viewGroup, m57958a(i), obj);
        }
    }

    public void setOnPageChangeListener(C0997e eVar) {
    }

    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof C23635b) {
            return ((C23635b) adapter).f63013a;
        }
        return adapter;
    }

    public int getCurrentItemCompat() {
        return mo49049a(getCurrentItem());
    }

    /* renamed from: a */
    public final boolean mo2958a() {
        if (this.f63008h == 1) {
            return false;
        }
        if (this.f63007g || this.f63008h == 2) {
            return true;
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(mo49049a(i));
    }

    /* renamed from: a */
    public final void mo2957a(C0997e eVar) {
        C23634a aVar = new C23634a(eVar);
        this.f63010j.put(eVar, aVar);
        super.mo2957a((C0997e) aVar);
    }

    /* renamed from: b */
    public final void mo2959b(C0997e eVar) {
        C0997e eVar2 = (C0997e) this.f63010j.remove(eVar);
        if (eVar2 != null) {
            super.mo2959b(eVar2);
        }
    }

    public RtlCompatViewPager(Context context) {
        super(context);
        this.f63007g = m57952a(context);
    }

    /* renamed from: a */
    private static boolean m57952a(Context context) {
        if (VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo49049a(int i) {
        int i2;
        if (!mo2958a()) {
            return i;
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            i2 = 0;
        } else {
            i2 = adapter.getCount();
        }
        if (i < 0 || i >= i2) {
            return i;
        }
        return (i2 - i) - 1;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.f63009i != null) {
            this.f63009i.mo49051a();
            this.f63009i = null;
        }
        if (mo2958a() && pagerAdapter != null) {
            this.f63009i = new C23635b(pagerAdapter);
            pagerAdapter = this.f63009i;
        }
        super.setAdapter(pagerAdapter);
        if (mo2958a()) {
            mo2956a(0, false);
        }
    }

    /* renamed from: a */
    public final void mo2956a(int i, boolean z) {
        super.mo2956a(mo49049a(i), z);
    }

    public RtlCompatViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63007g = m57952a(context);
    }
}
