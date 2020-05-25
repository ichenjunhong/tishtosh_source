package com.p683ss.android.ugc.aweme.anchor;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26879e;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.anchor.b */
public final class C22599b extends C26851b<C22674g, C22677h> implements C26879e {

    /* renamed from: a */
    public C26878d f60752a;

    /* renamed from: a */
    public final boolean mo46994a(C26882h hVar) {
        return false;
    }

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        this.f60752a = null;
    }

    /* renamed from: e */
    private void m55790e() {
        if (((C22674g) this.f70700f).f60861d) {
            ((C22677h) this.f70701g).mo47046d();
        } else {
            ((C22677h) this.f70701g).mo47045c();
        }
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (this.f70700f != null && this.f70701g != null) {
            int i = ((C22674g) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C22677h) this.f70701g).mo47017R_();
                        return;
                    case 2:
                        ((C22677h) this.f70701g).aS_();
                        return;
                }
            } else {
                ((C22677h) this.f70701g).mo47031e();
            }
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70700f != null && this.f70701g != null) {
            m55790e();
            int i = ((C22674g) this.f70700f).mListQueryType;
            boolean z = false;
            if (i != 4) {
                switch (i) {
                    case 1:
                        Collection collection = ((C22674g) this.f70700f).f60859b;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        }
                        if (z) {
                            ((C22677h) this.f70701g).aJ_();
                            return;
                        } else {
                            ((C22677h) this.f70701g).mo47018a(((C22674g) this.f70700f).getItems(), ((C22674g) this.f70700f).isHasMore());
                            return;
                        }
                    case 2:
                        ((C22677h) this.f70701g).mo47029c(((C22674g) this.f70700f).getItems(), !((C22674g) this.f70700f).isNewDataEmpty());
                        break;
                }
                return;
            }
            C22677h hVar = (C22677h) this.f70701g;
            List items = ((C22674g) this.f70700f).getItems();
            if (((C22674g) this.f70700f).isHasMore() && !((C22674g) this.f70700f).isNewDataEmpty()) {
                z = true;
            }
            hVar.mo47026b(items, z);
        }
    }

    /* renamed from: a */
    public final void mo46992a(int i) {
        if (this.f60752a != null) {
            this.f60752a.mo50466c_(i);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70700f != null && this.f70701g != null) {
            m55790e();
            int i = ((C22674g) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C22677h) this.f70701g).mo47025b(exc);
                        return;
                    case 2:
                        ((C22677h) this.f70701g).mo47024a_(exc);
                        break;
                }
                return;
            }
            ((C22677h) this.f70701g).mo47028c(exc);
        }
    }

    /* renamed from: a */
    public final void mo46993a(List list, int i) {
        if (this.f60752a != null) {
            this.f60752a.mo50461a(list, i);
        }
    }
}
