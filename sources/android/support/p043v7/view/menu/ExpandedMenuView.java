package android.support.p043v7.view.menu;

import android.content.Context;
import android.support.p043v7.view.menu.C1246h.C1248b;
import android.support.p043v7.widget.C1451bb;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C1248b, C1264p, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f4101a = {16842964, 16843049};

    /* renamed from: b */
    private C1246h f4102b;

    /* renamed from: c */
    private int f4103c;

    public final int getWindowAnimations() {
        return this.f4103c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: a */
    public final void mo1058a(C1246h hVar) {
        this.f4102b = hVar;
    }

    /* renamed from: a */
    public final boolean mo4012a(C1250j jVar) {
        return this.f4102b.mo4113a((MenuItem) jVar, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1451bb a = C1451bb.m5032a(context, attributeSet, f4101a, i, 0);
        if (a.mo5664f(0)) {
            setBackgroundDrawable(a.mo5652a(0));
        }
        if (a.mo5664f(1)) {
            setDivider(a.mo5652a(1));
        }
        a.mo5653a();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo4012a((C1250j) getAdapter().getItem(i));
    }
}
