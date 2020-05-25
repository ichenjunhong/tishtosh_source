package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.g */
public abstract class C23693g<T extends Fragment> extends C0677p {

    /* renamed from: a */
    protected final int f63197a;

    /* renamed from: b */
    private HashMap<Integer, T> f63198b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49115a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49116a(HashMap<Integer, T> hashMap) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo49117c(int i);

    public int getCount() {
        return this.f63197a;
    }

    public void notifyDataSetChanged() {
        if (this.f63198b != null) {
            this.f63198b.clear();
            mo49116a(this.f63198b);
        }
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        Fragment c = mo49117c(i);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder("createFragment(position=");
        sb.append(i);
        sb.append(" 没有返回Fragment实例),检查代码确保createFragment方法覆盖所有position");
        throw new UnsupportedOperationException(sb.toString());
    }

    public C23693g(C0654k kVar, int i) {
        super(kVar);
        this.f63197a = i;
        this.f63198b = new LinkedHashMap(i);
        mo49116a(this.f63198b);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Fragment fragment = (Fragment) instantiateItem;
        mo49115a(fragment, i);
        this.f63198b.put(Integer.valueOf(i), fragment);
        mo49116a(this.f63198b);
        return instantiateItem;
    }
}
