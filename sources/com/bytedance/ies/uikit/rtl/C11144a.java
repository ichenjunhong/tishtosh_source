package com.bytedance.ies.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.ies.uikit.rtl.a */
public class C11144a extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f30036a;

    /* renamed from: com.bytedance.ies.uikit.rtl.a$a */
    static class C11146a extends DataSetObserver {

        /* renamed from: a */
        final C11144a f30037a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f30037a != null) {
                this.f30037a.mo20406a();
            }
        }

        private C11146a(C11144a aVar) {
            this.f30037a = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20406a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f30036a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f30036a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f30036a.saveState();
    }

    public void finishUpdate(View view) {
        this.f30036a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f30036a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f30036a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f30036a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f30036a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f30036a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f30036a.unregisterDataSetObserver(dataSetObserver);
    }

    public C11144a(PagerAdapter pagerAdapter) {
        this.f30036a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C11146a());
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f30036a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f30036a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f30036a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f30036a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f30036a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f30036a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f30036a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f30036a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f30036a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f30036a.setPrimaryItem(viewGroup, i, obj);
    }
}
