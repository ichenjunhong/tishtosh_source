package com.p683ss.android.ugc.aweme.views;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.views.e */
public class C48186e extends C0677p {

    /* renamed from: a */
    public final PagerAdapter f121242a;

    /* renamed from: com.ss.android.ugc.aweme.views.e$a */
    static class C48188a extends DataSetObserver {

        /* renamed from: a */
        final C48186e f121243a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f121243a != null) {
                this.f121243a.mo95615a();
            }
        }

        private C48188a(C48186e eVar) {
            this.f121243a = eVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo95615a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f121242a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f121242a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f121242a.saveState();
    }

    public void finishUpdate(View view) {
        this.f121242a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f121242a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f121242a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f121242a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f121242a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f121242a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f121242a.unregisterDataSetObserver(dataSetObserver);
    }

    public C48186e(PagerAdapter pagerAdapter) {
        super(null);
        this.f121242a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C48188a());
    }

    /* renamed from: a */
    public Fragment mo2309a(int i) {
        return ((C0677p) this.f121242a).mo2309a(i);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f121242a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f121242a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f121242a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f121242a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f121242a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f121242a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f121242a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f121242a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f121242a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f121242a.setPrimaryItem(viewGroup, i, obj);
    }
}
