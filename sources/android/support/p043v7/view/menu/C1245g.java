package android.support.p043v7.view.menu;

import android.support.p043v7.view.menu.C1264p.C1265a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public final class C1245g extends BaseAdapter {

    /* renamed from: a */
    public C1246h f4207a;

    /* renamed from: b */
    public boolean f4208b;

    /* renamed from: c */
    private int f4209c = -1;

    /* renamed from: d */
    private final boolean f4210d;

    /* renamed from: e */
    private final LayoutInflater f4211e;

    /* renamed from: f */
    private final int f4212f;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final void notifyDataSetChanged() {
        m3825a();
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m3825a() {
        C1250j jVar = this.f4207a.f4225k;
        if (jVar != null) {
            ArrayList i = this.f4207a.mo4144i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C1250j) i.get(i2)) == jVar) {
                    this.f4209c = i2;
                    return;
                }
            }
        }
        this.f4209c = -1;
    }

    public final int getCount() {
        ArrayList arrayList;
        if (this.f4210d) {
            arrayList = this.f4207a.mo4144i();
        } else {
            arrayList = this.f4207a.mo4140g();
        }
        if (this.f4209c < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: a */
    public final C1250j getItem(int i) {
        ArrayList arrayList;
        if (this.f4210d) {
            arrayList = this.f4207a.mo4144i();
        } else {
            arrayList = this.f4207a.mo4140g();
        }
        if (this.f4209c >= 0 && i >= this.f4209c) {
            i++;
        }
        return (C1250j) arrayList.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f4211e.inflate(this.f4212f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f4207a.mo4127b() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C1265a aVar = (C1265a) view;
        if (this.f4208b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1036a(getItem(i), 0);
        return view;
    }

    public C1245g(C1246h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f4210d = z;
        this.f4211e = layoutInflater;
        this.f4207a = hVar;
        this.f4212f = i;
        m3825a();
    }
}
