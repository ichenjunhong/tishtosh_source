package com.etsy.android.grid;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.etsy.android.grid.ExtendableListView.C13469d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.etsy.android.grid.a */
public final class C13479a implements Filterable, WrapperListAdapter {

    /* renamed from: c */
    static final ArrayList<C13469d> f35154c = new ArrayList<>();

    /* renamed from: a */
    ArrayList<C13469d> f35155a;

    /* renamed from: b */
    ArrayList<C13469d> f35156b;

    /* renamed from: d */
    boolean f35157d;

    /* renamed from: e */
    private final ListAdapter f35158e;

    /* renamed from: f */
    private final boolean f35159f;

    public final ListAdapter getWrappedAdapter() {
        return this.f35158e;
    }

    /* renamed from: a */
    private int m27228a() {
        return this.f35155a.size();
    }

    /* renamed from: b */
    private int m27230b() {
        return this.f35156b.size();
    }

    public final Filter getFilter() {
        if (this.f35159f) {
            return ((Filterable) this.f35158e).getFilter();
        }
        return null;
    }

    public final int getViewTypeCount() {
        if (this.f35158e != null) {
            return this.f35158e.getViewTypeCount();
        }
        return 1;
    }

    public final boolean hasStableIds() {
        if (this.f35158e != null) {
            return this.f35158e.hasStableIds();
        }
        return false;
    }

    public final boolean areAllItemsEnabled() {
        if (this.f35158e == null) {
            return true;
        }
        if (!this.f35157d || !this.f35158e.areAllItemsEnabled()) {
            return false;
        }
        return true;
    }

    public final int getCount() {
        if (this.f35158e != null) {
            return m27230b() + m27228a() + this.f35158e.getCount();
        }
        return m27230b() + m27228a();
    }

    public final boolean isEmpty() {
        if (this.f35158e == null || this.f35158e.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f35158e != null) {
            this.f35158e.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f35158e != null) {
            this.f35158e.unregisterDataSetObserver(dataSetObserver);
        }
    }

    /* renamed from: a */
    private static boolean m27229a(ArrayList<C13469d> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C13469d) it.next()).f35112c) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long getItemId(int i) {
        int a = m27228a();
        if (this.f35158e != null && i >= a) {
            int i2 = i - a;
            if (i2 < this.f35158e.getCount()) {
                return this.f35158e.getItemId(i2);
            }
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        int a = m27228a();
        if (this.f35158e != null && i >= a) {
            int i2 = i - a;
            if (i2 < this.f35158e.getCount()) {
                return this.f35158e.getItemViewType(i2);
            }
        }
        return -2;
    }

    public final Object getItem(int i) {
        int a = m27228a();
        if (i < a) {
            return ((C13469d) this.f35155a.get(i)).f35111b;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f35158e != null) {
            i3 = this.f35158e.getCount();
            if (i2 < i3) {
                return this.f35158e.getItem(i2);
            }
        }
        return ((C13469d) this.f35156b.get(i2 - i3)).f35111b;
    }

    public final boolean isEnabled(int i) {
        int a = m27228a();
        if (i < a) {
            return ((C13469d) this.f35155a.get(i)).f35112c;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f35158e != null) {
            i3 = this.f35158e.getCount();
            if (i2 < i3) {
                return this.f35158e.isEnabled(i2);
            }
        }
        return ((C13469d) this.f35156b.get(i2 - i3)).f35112c;
    }

    public C13479a(ArrayList<C13469d> arrayList, ArrayList<C13469d> arrayList2, ListAdapter listAdapter) {
        boolean z;
        this.f35158e = listAdapter;
        this.f35159f = listAdapter instanceof Filterable;
        if (arrayList == null) {
            this.f35155a = f35154c;
        } else {
            this.f35155a = arrayList;
        }
        if (arrayList2 == null) {
            this.f35156b = f35154c;
        } else {
            this.f35156b = arrayList2;
        }
        if (!m27229a(this.f35155a) || !m27229a(this.f35156b)) {
            z = false;
        } else {
            z = true;
        }
        this.f35157d = z;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a = m27228a();
        if (i < a) {
            return ((C13469d) this.f35155a.get(i)).f35110a;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f35158e != null) {
            i3 = this.f35158e.getCount();
            if (i2 < i3) {
                return this.f35158e.getView(i2, view, viewGroup);
            }
        }
        return ((C13469d) this.f35156b.get(i2 - i3)).f35110a;
    }
}
