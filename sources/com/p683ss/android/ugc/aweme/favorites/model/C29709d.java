package com.p683ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.p1057b.p1058a.C17422l;
import com.google.p1057b.p1060c.C17699l;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29665f;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.d */
public final class C29709d extends C26875a<C46069d, C29665f> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<C46069d> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C29665f) this.mData).f77550a;
    }

    public C29709d() {
        C29665f fVar = new C29665f();
        fVar.f77550a = new ArrayList();
        fVar.mo59927a(false);
        this.mData = fVar;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C29665f) this.mData).mo59928a()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m69751a(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m69751a(((C29665f) this.mData).f77551b, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        boolean z2;
        C29665f fVar = (C29665f) obj;
        boolean z3 = false;
        if (fVar == null || C9376b.m18558a((Collection<T>) fVar.f77550a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = fVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = fVar;
                    return;
                }
                List<C46069d> list = ((C29665f) this.mData).f77550a;
                List<C46069d> list2 = fVar.f77550a;
                List<C46069d> list3 = ((C29665f) this.mData).f77550a;
                if (list3 == null || list3.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.addAll(C17699l.m43482a((Collection<E>) list2, (C17422l<? super E>) new C29711f<Object>(z2, list3)));
                ((C29665f) this.mData).f77551b = fVar.f77551b;
                C29665f fVar2 = (C29665f) this.mData;
                if (fVar.mo59928a() && ((C29665f) this.mData).mo59928a()) {
                    z3 = true;
                }
                fVar2.mo59927a(z3);
            }
        } else {
            if (this.mData != null) {
                if (this.mListQueryType == 1) {
                    ((C29665f) this.mData).f77550a.clear();
                }
                ((C29665f) this.mData).mo59927a(false);
            }
        }
    }

    /* renamed from: a */
    private void m69751a(int i, int i2) {
        C23566n.m57766a().mo48750a(this.mHandler, new C29710e(i, i2), 0);
    }
}
