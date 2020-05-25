package com.zhihu.matisse.internal.p2254ui.p2626a;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2254ui.C45360b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.a.c */
public final class C52533c extends C0677p {

    /* renamed from: a */
    private ArrayList<Item> f130807a = new ArrayList<>();

    /* renamed from: b */
    private C52534a f130808b = null;

    /* renamed from: com.zhihu.matisse.internal.ui.a.c$a */
    public interface C52534a {
    }

    public final int getCount() {
        return this.f130807a.size();
    }

    /* renamed from: a */
    public final void mo110065a(List<Item> list) {
        this.f130807a.addAll(list);
    }

    /* renamed from: c */
    public final Item mo110066c(int i) {
        return (Item) this.f130807a.get(i);
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        Item item = (Item) this.f130807a.get(i);
        C45360b bVar = new C45360b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", item);
        bVar.setArguments(bundle);
        return bVar;
    }

    public C52533c(C0654k kVar, C52534a aVar) {
        super(kVar);
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
