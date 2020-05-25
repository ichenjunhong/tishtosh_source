package com.p683ss.android.ugc.tools.view.p2509b;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.tools.view.b.a */
public abstract class C50208a extends PagerAdapter {

    /* renamed from: c */
    protected final LinkedList<View> f125759c = new LinkedList<>();

    /* renamed from: d */
    protected final LayoutInflater f125760d;

    /* renamed from: e */
    protected final Context f125761e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo64352a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public C50208a(Context context, LayoutInflater layoutInflater) {
        this.f125760d = layoutInflater;
        this.f125761e = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f125759c.isEmpty()) {
            view = (View) this.f125759c.removeFirst();
        } else {
            view = null;
        }
        View a = mo64352a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f125759c.add(view);
        }
    }
}
