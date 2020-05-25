package android.support.p043v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
abstract class C1259m implements C1262o, C1268s, OnItemClickListener {

    /* renamed from: g */
    public Rect f4284g;

    C1259m() {
    }

    /* renamed from: a */
    public abstract void mo4067a(int i);

    /* renamed from: a */
    public final void mo1082a(Context context, C1246h hVar) {
    }

    /* renamed from: a */
    public abstract void mo4068a(C1246h hVar);

    /* renamed from: a */
    public abstract void mo4069a(View view);

    /* renamed from: a */
    public abstract void mo4070a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public final boolean mo1088a(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo1090b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo4071b(int i);

    /* renamed from: b */
    public abstract void mo4072b(boolean z);

    /* renamed from: b */
    public final boolean mo1091b(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo4073c(int i);

    /* renamed from: c */
    public abstract void mo4074c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo4079g() {
        return true;
    }

    /* renamed from: a */
    protected static C1245g m3906a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C1245g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1245g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m3907b(C1246h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C1246h hVar = m3906a(listAdapter).f4207a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo4079g()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        hVar.mo4114a(menuItem, (C1262o) this, i2);
    }

    /* renamed from: a */
    protected static int m3905a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }
}
