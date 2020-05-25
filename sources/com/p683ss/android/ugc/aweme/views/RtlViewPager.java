package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager */
public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f121155a;

    /* renamed from: b */
    public boolean f121156b;

    /* renamed from: c */
    private HashMap<C0997e, C48166b> f121157c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = C0965e.m2810a(new C0967f<SavedState>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object[] mo2951a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo2950a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a */
        public final Parcelable f121158a;

        /* renamed from: b */
        public final int f121159b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f121158a = parcelable;
            this.f121159b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f121158a, i);
            parcel.writeInt(this.f121159b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f121158a = parcel.readParcelable(classLoader);
            this.f121159b = parcel.readInt();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$a */
    class C48165a extends C48186e {
        /* renamed from: a */
        public final Fragment mo2309a(int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2309a(i);
        }

        /* renamed from: b */
        public final long mo2310b(int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2310b(i);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo95575a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        C48165a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo95575a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$b */
    class C48166b implements C0997e {

        /* renamed from: b */
        private final C0997e f121162b;

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo95575a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f121162b.onPageSelected(i);
        }

        public final void onPageScrollStateChanged(int i) {
            this.f121162b.onPageScrollStateChanged(i);
            if (RtlViewPager.this.f121156b && i == 0 && !RtlViewPager.this.mo95575a() && RtlViewPager.this.getCurrentItem() == 0 && RtlViewPager.this.getScrollX() > 0) {
                RtlViewPager.this.setScrollX(0);
            }
        }

        C48166b(C0997e eVar) {
            this.f121162b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.mo95575a() || a == null) {
                this.f121162b.onPageScrolled(i, f, i2);
                return;
            }
            int count = a.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = RtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f121162b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, RtlViewPager.this.getWidth() - i2);
        }
    }

    /* renamed from: a */
    public final boolean mo95575a() {
        if (this.f121155a == 1) {
            return true;
        }
        return false;
    }

    public PagerAdapter getAdapter() {
        C48165a aVar = (C48165a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f121242a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f121155a);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo95575a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.f121156b = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(C0997e eVar) {
        C48166b bVar = new C48166b(eVar);
        this.f121157c.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public void removeOnPageChangeListener(C0997e eVar) {
        super.removeOnPageChangeListener((C0997e) this.f121157c.get(eVar));
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C48165a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0997e eVar) {
        super.setOnPageChangeListener(new C48166b(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f121155a = savedState.f121159b;
        super.onRestoreInstanceState(savedState.f121158a);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo95575a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f121155a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f121155a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo95575a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
