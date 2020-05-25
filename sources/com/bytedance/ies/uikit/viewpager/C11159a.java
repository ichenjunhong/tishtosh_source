package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* renamed from: com.bytedance.ies.uikit.viewpager.a */
public abstract class C11159a extends PagerAdapter {

    /* renamed from: a */
    protected final LinkedList<View> f30102a = new LinkedList<>();

    /* renamed from: b */
    protected final LayoutInflater f30103b;

    /* renamed from: c */
    protected final Context f30104c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo20489a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public C11159a(Context context, LayoutInflater layoutInflater) {
        this.f30103b = layoutInflater;
        this.f30104c = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f30102a.isEmpty()) {
            view = (View) this.f30102a.removeFirst();
        } else {
            view = null;
        }
        View a = mo20489a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f30102a.add(view);
        }
    }
}
