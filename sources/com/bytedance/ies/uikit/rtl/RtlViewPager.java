package com.bytedance.ies.uikit.rtl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

public final class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f30029a;

    /* renamed from: b */
    private HashMap<C0997e, C11143b> f30030b;

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
        public final Parcelable f30031a;

        /* renamed from: b */
        public final int f30032b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f30031a = parcelable;
            this.f30032b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f30031a, i);
            parcel.writeInt(this.f30032b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f30031a = parcel.readParcelable(classLoader);
            this.f30032b = parcel.readInt();
        }
    }

    /* renamed from: com.bytedance.ies.uikit.rtl.RtlViewPager$a */
    class C11142a extends C11144a {
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo20402a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        public C11142a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo20402a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.rtl.RtlViewPager$b */
    class C11143b implements C0997e {

        /* renamed from: b */
        private final C0997e f30035b;

        public final void onPageScrollStateChanged(int i) {
            this.f30035b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo20402a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f30035b.onPageSelected(i);
        }

        public C11143b(C0997e eVar) {
            this.f30035b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo20402a() && a != null) {
                int count = a.getCount();
                float f2 = (float) width;
                int pageWidth = ((int) ((1.0f - a.getPageWidth(i)) * f2)) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (a.getPageWidth(i) * f2);
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = ((float) i2) / (f2 * a.getPageWidth(i));
            }
            this.f30035b.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo20402a() {
        if (this.f30029a == 1) {
            return true;
        }
        return false;
    }

    public final void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f30030b.clear();
    }

    public final PagerAdapter getAdapter() {
        C11142a aVar = (C11142a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f30036a;
    }

    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f30029a);
    }

    public final int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo20402a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public final void addOnPageChangeListener(C0997e eVar) {
        C11143b bVar = new C11143b(eVar);
        this.f30030b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public final void removeOnPageChangeListener(C0997e eVar) {
        C11143b bVar = (C11143b) this.f30030b.remove(eVar);
        if (bVar != null) {
            super.removeOnPageChangeListener(bVar);
        }
    }

    public final void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C11142a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public final void setOnPageChangeListener(C0997e eVar) {
        super.setOnPageChangeListener(new C11143b(eVar));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f30029a = savedState.f30032b;
        super.onRestoreInstanceState(savedState.f30031a);
    }

    public final void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo20402a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f30029a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f30029a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
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

    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo20402a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
