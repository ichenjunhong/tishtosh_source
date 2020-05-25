package com.bytedance.android.live.uikit.viewpager;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* renamed from: com.bytedance.android.live.uikit.viewpager.a */
public abstract class C4281a extends PagerAdapter {

    /* renamed from: b */
    protected final LinkedList<View> f11771b = new LinkedList<>();

    /* renamed from: c */
    protected final LayoutInflater f11772c;

    /* renamed from: d */
    protected final Context f11773d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo8729a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public C4281a(Context context, LayoutInflater layoutInflater) {
        this.f11772c = layoutInflater;
        this.f11773d = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f11771b.isEmpty()) {
            view = (View) this.f11771b.removeFirst();
        } else {
            view = null;
        }
        View a = mo8729a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f11771b.add(view);
        }
    }
}
