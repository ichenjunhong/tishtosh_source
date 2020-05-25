package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f11709a;

    /* renamed from: b */
    private HashMap<C0997e, C4267b> f11710b = new HashMap<>();

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
        public final Parcelable f11711a;

        /* renamed from: b */
        public final int f11712b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f11711a = parcelable;
            this.f11712b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f11711a, i);
            parcel.writeInt(this.f11712b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f11711a = parcel.readParcelable(classLoader);
            this.f11712b = parcel.readInt();
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$a */
    class C4266a extends C4268a {
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo9938a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        public C4266a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo9938a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$b */
    class C4267b implements C0997e {

        /* renamed from: b */
        private final C0997e f11715b;

        public final void onPageScrollStateChanged(int i) {
            this.f11715b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo9938a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f11715b.onPageSelected(i);
        }

        public C4267b(C0997e eVar) {
            this.f11715b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo9938a() && a != null) {
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
            this.f11715b.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo9938a() {
        if (this.f11709a == 1) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f11710b.clear();
    }

    public PagerAdapter getAdapter() {
        C4266a aVar = (C4266a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f11716a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f11709a);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo9938a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(C0997e eVar) {
        C4267b bVar = new C4267b(eVar);
        this.f11710b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public void removeOnPageChangeListener(C0997e eVar) {
        C4267b bVar = (C4267b) this.f11710b.remove(eVar);
        if (bVar != null) {
            super.removeOnPageChangeListener(bVar);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C4266a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0997e eVar) {
        super.setOnPageChangeListener(new C4267b(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f11709a = savedState.f11712b;
        super.onRestoreInstanceState(savedState.f11711a);
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo9938a()) {
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
        if (i3 != this.f11709a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f11709a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
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
        if (adapter != null && mo9938a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
