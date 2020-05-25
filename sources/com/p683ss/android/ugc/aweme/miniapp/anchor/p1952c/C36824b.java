package com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36829a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.b */
public abstract class C36824b<E, R extends C36829a<E>> extends C26875a<E, R> {

    /* renamed from: a */
    private int f94126a;

    /* renamed from: b */
    private List<E> f94127b = new ArrayList();

    /* renamed from: c */
    private boolean f94128c = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo76017a(int i, Object... objArr);

    public List<E> getItems() {
        return this.f94127b;
    }

    public boolean isHasMore() {
        return this.f94128c;
    }

    public void loadMoreList(Object... objArr) {
        mo76017a(this.f94126a, objArr);
    }

    public void refreshList(Object... objArr) {
        mo76017a(0, objArr);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void handleData(Object obj) {
        C36829a aVar = (C36829a) obj;
        if (aVar == null || C9376b.m18558a((Collection<T>) aVar.mo76020a())) {
            this.f94128c = false;
            this.f94126a = 0;
            this.f94127b.clear();
            return;
        }
        this.f94128c = aVar.mo76021b();
        this.f94126a = aVar.mo76022c();
        if (this.mListQueryType == 1) {
            this.f94127b.clear();
        }
        this.f94127b.addAll(aVar.mo76020a());
    }
}
