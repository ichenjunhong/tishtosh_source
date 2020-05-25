package android.support.p030v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: android.support.v4.view.DmtRtlViewPager */
public class DmtRtlViewPager extends DmtViewPager {

    /* renamed from: g */
    private int f3120g;

    /* renamed from: h */
    private HashMap<C0997e, C0975c> f3121h = new HashMap<>();

    /* renamed from: android.support.v4.view.DmtRtlViewPager$SavedState */
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
        public final Parcelable f3122a;

        /* renamed from: b */
        public final int f3123b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f3122a = parcelable;
            this.f3123b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3122a, i);
            parcel.writeInt(this.f3123b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f3122a = parcel.readParcelable(classLoader);
            this.f3123b = parcel.readInt();
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$a */
    static class C0973a extends DataSetObserver {

        /* renamed from: a */
        final C0974b f3124a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f3124a != null) {
                this.f3124a.mo2976a();
            }
        }

        private C0973a(C0974b bVar) {
            this.f3124a = bVar;
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$b */
    class C0974b extends C0677p {

        /* renamed from: a */
        public final PagerAdapter f3125a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2976a() {
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            return this.f3125a.getCount();
        }

        public final Parcelable saveState() {
            return this.f3125a.saveState();
        }

        public final void finishUpdate(ViewGroup viewGroup) {
            this.f3125a.finishUpdate(viewGroup);
        }

        public final void startUpdate(ViewGroup viewGroup) {
            this.f3125a.startUpdate(viewGroup);
        }

        /* renamed from: a */
        public final Fragment mo2309a(int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return ((C0677p) this.f3125a).mo2309a(i);
        }

        /* renamed from: b */
        public final long mo2310b(int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2310b(i);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = this.f3125a.getItemPosition(obj);
            if (!DmtRtlViewPager.this.mo2958a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3125a.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3125a.getPageWidth(i);
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return this.f3125a.isViewFromObject(view, obj);
        }

        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f3125a.restoreState(parcelable, classLoader);
        }

        C0974b(PagerAdapter pagerAdapter) {
            super(null);
            this.f3125a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(new C0973a(this));
        }

        public final Object instantiateItem(View view, int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3125a.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3125a.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            this.f3125a.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            this.f3125a.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            this.f3125a.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo2958a()) {
                i = (getCount() - i) - 1;
            }
            this.f3125a.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$c */
    class C0975c implements C0997e {

        /* renamed from: b */
        private final C0997e f3128b;

        public final void onPageScrollStateChanged(int i) {
            this.f3128b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = DmtRtlViewPager.super.getAdapter();
            if (DmtRtlViewPager.this.mo2958a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f3128b.onPageSelected(i);
        }

        C0975c(C0997e eVar) {
            this.f3128b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter a = DmtRtlViewPager.super.getAdapter();
            if (!DmtRtlViewPager.this.mo2958a() || a == null) {
                this.f3128b.onPageScrolled(i, f, i2);
                return;
            }
            int count = a.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = DmtRtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f3128b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, DmtRtlViewPager.this.getWidth() - i2);
        }
    }

    public PagerAdapter getAdapter() {
        C0974b bVar = (C0974b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.f3125a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f3120g);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo2958a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    /* renamed from: a */
    public final boolean mo2958a() {
        if (this.f3120g == 1) {
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

    public DmtRtlViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo2957a(C0997e eVar) {
        C0975c cVar = new C0975c(eVar);
        this.f3121h.put(eVar, cVar);
        super.mo2957a((C0997e) cVar);
    }

    /* renamed from: b */
    public final void mo2959b(C0997e eVar) {
        super.mo2959b((C0997e) this.f3121h.get(eVar));
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C0974b(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0997e eVar) {
        super.setOnPageChangeListener(new C0975c(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3120g = savedState.f3123b;
        super.onRestoreInstanceState(savedState.f3122a);
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
        if (adapter != null && mo2958a()) {
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
        if (i3 != this.f3120g) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f3120g = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public DmtRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo2956a(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo2958a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.mo2956a(i, z);
    }

    /* access modifiers changed from: protected */
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
}
