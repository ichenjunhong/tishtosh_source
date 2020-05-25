package com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36829a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.a */
public abstract class C36823a<E, R extends C36829a<E>> extends C26875a<E, R> {

    /* renamed from: a */
    private int f94123a;

    /* renamed from: b */
    private List<E> f94124b = new ArrayList();

    /* renamed from: c */
    private boolean f94125c = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo76016a(int i);

    public List<E> getItems() {
        return this.f94124b;
    }

    public boolean isHasMore() {
        return this.f94125c;
    }

    public void loadMoreList(Object... objArr) {
        mo76016a(this.f94123a);
    }

    public void refreshList(Object... objArr) {
        mo76016a(0);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void handleData(Object obj) {
        C36829a aVar = (C36829a) obj;
        if (aVar == null || C9376b.m18558a((Collection<T>) aVar.mo76020a())) {
            this.f94125c = false;
            this.f94123a = 0;
            this.f94124b.clear();
            return;
        }
        this.f94125c = aVar.mo76021b();
        this.f94123a = aVar.mo76022c();
        if (this.mListQueryType == 1) {
            this.f94124b.clear();
        }
        this.f94124b.addAll(aVar.mo76020a());
    }
}
