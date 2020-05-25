package com.bytedance.scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater.Filter;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.bytedance.scene.n */
final class C12936n extends LayoutInflater {

    /* renamed from: a */
    private final C12924i f33865a;

    /* renamed from: b */
    private LayoutInflater f33866b;

    /* renamed from: a */
    private void m25990a() {
        Context context;
        if (this.f33866b == null) {
            if (this.f33865a.f33841h == 0) {
                context = this.f33865a.mo24477v();
            } else {
                context = this.f33865a.mo24476u();
            }
            this.f33866b = this.f33865a.mo24477v().getLayoutInflater().cloneInContext(context);
            Filter filter = getFilter();
            if (filter != null) {
                this.f33866b.setFilter(filter);
            }
            Factory2 factory2 = getFactory2();
            if (factory2 != null) {
                this.f33866b.setFactory2(factory2);
                return;
            }
            Factory factory = getFactory();
            if (factory != null) {
                this.f33866b.setFactory(factory);
            }
        }
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new C12936n(context, this.f33865a);
    }

    public final void setFactory(Factory factory) {
        super.setFactory(factory);
        if (this.f33866b != null) {
            this.f33866b.setFactory(factory);
        }
    }

    public final void setFactory2(Factory2 factory2) {
        super.setFactory2(factory2);
        if (this.f33866b != null) {
            this.f33866b.setFactory2(factory2);
        }
    }

    C12936n(Context context, C12924i iVar) {
        super(context);
        this.f33865a = iVar;
    }

    public final View inflate(int i, ViewGroup viewGroup) {
        m25990a();
        return this.f33866b.inflate(i, viewGroup);
    }

    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        m25990a();
        return this.f33866b.inflate(xmlPullParser, viewGroup);
    }

    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        m25990a();
        return this.f33866b.inflate(i, viewGroup, z);
    }

    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        m25990a();
        return this.f33866b.inflate(xmlPullParser, viewGroup, z);
    }
}
