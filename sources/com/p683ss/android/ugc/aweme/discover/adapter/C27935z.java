package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.z */
public abstract class C27935z<T extends Fragment> extends C27781a {

    /* renamed from: a */
    private int f73356a;

    /* renamed from: d */
    private HashMap<Integer, T> f73357d = new LinkedHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Fragment mo56278c(int i);

    public int getCount() {
        return this.f73356a;
    }

    /* renamed from: a */
    public final List<T> mo56344a() {
        return new ArrayList(this.f73357d.values());
    }

    public void notifyDataSetChanged() {
        if (this.f73357d != null) {
            this.f73357d.clear();
        }
        super.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final Fragment mo56345b(int i) {
        if (this.f73357d == null || this.f73357d.size() == 0) {
            return null;
        }
        return (Fragment) this.f73357d.get(Integer.valueOf(i));
    }

    public C27935z(C0654k kVar, int i) {
        super(kVar);
        this.f73356a = i;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo56346c(ViewGroup viewGroup, int i) {
        Fragment c = mo56278c(i);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder("createFragment(position=");
        sb.append(i);
        sb.append(" 没有返回Fragment实例),检查代码确保createFragment方法覆盖所有position");
        throw new UnsupportedOperationException(sb.toString());
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        this.f73357d.put(Integer.valueOf(i), (Fragment) instantiateItem);
        return instantiateItem;
    }
}
