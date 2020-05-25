package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o */
public class C45206o extends PagerAdapter {

    /* renamed from: a */
    static Field f114364a;

    /* renamed from: b */
    PagerAdapter f114365b;

    /* renamed from: c */
    public boolean f114366c = true;

    public int getItemPosition(Object obj) {
        return -2;
    }

    /* renamed from: c */
    public final int mo91494c() {
        return this.f114365b.getCount();
    }

    public void notifyDataSetChanged() {
        this.f114365b.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f114365b.saveState();
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f114364a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private void mo79127a() {
        try {
            DataSetObserver dataSetObserver = (DataSetObserver) f114364a.get(this.f114365b);
            if (((DataSetObserver) f114364a.get(this)) == null && dataSetObserver != null) {
                f114364a.set(this.f114365b, null);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public final int getCount() {
        try {
            f114364a.set(this.f114365b, (DataSetObserver) f114364a.get(this));
            if (!this.f114366c || mo91494c() == 1) {
                return mo91494c();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void finishUpdate(View view) {
        this.f114365b.finishUpdate(view);
    }

    public CharSequence getPageTitle(int i) {
        return this.f114365b.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f114365b.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f114365b.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f114365b.unregisterDataSetObserver(dataSetObserver);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f114365b.finishUpdate(viewGroup);
    }

    public void startUpdate(View view) {
        mo79127a();
        this.f114365b.startUpdate(view);
    }

    public C45206o(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            this.f114365b = pagerAdapter;
            return;
        }
        throw new NullPointerException();
    }

    public void startUpdate(ViewGroup viewGroup) {
        mo79127a();
        this.f114365b.startUpdate(viewGroup);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f114365b.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f114365b.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(View view, int i) {
        int count = this.f114365b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f114365b.instantiateItem(view, i % count);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int count = this.f114365b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f114365b.instantiateItem(viewGroup, i % count);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f114365b.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(View view, int i, Object obj) {
        int count = this.f114365b.getCount();
        if (count != 0) {
            this.f114365b.destroyItem(view, i / count, obj);
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f114365b.setPrimaryItem(viewGroup, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        int count = this.f114365b.getCount();
        if (count != 0) {
            this.f114365b.destroyItem(viewGroup, i / count, obj);
        }
    }
}
