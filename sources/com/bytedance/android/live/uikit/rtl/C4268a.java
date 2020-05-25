package com.bytedance.android.live.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.android.live.uikit.rtl.a */
public class C4268a extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f11716a;

    /* renamed from: com.bytedance.android.live.uikit.rtl.a$a */
    static class C4270a extends DataSetObserver {

        /* renamed from: a */
        final C4268a f11717a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f11717a != null) {
                this.f11717a.mo9942a();
            }
        }

        private C4270a(C4268a aVar) {
            this.f11717a = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9942a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f11716a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f11716a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f11716a.saveState();
    }

    public void finishUpdate(View view) {
        this.f11716a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f11716a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f11716a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f11716a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f11716a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f11716a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f11716a.unregisterDataSetObserver(dataSetObserver);
    }

    public C4268a(PagerAdapter pagerAdapter) {
        this.f11716a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C4270a());
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f11716a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f11716a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f11716a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f11716a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f11716a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f11716a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f11716a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f11716a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f11716a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f11716a.setPrimaryItem(viewGroup, i, obj);
    }
}
