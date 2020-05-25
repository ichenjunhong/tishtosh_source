package com.p683ss.android.ugc.aweme.common.p1594f;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.f.b */
public class C26876b<T extends C26875a> extends C26851b<T, C26877c> implements C26879e {

    /* renamed from: c */
    protected C26878d f70734c;

    /* renamed from: a */
    public boolean mo46994a(C26882h hVar) {
        return false;
    }

    /* renamed from: S_ */
    public void mo46991S_() {
        super.mo46991S_();
        this.f70734c = null;
    }

    /* renamed from: R_ */
    public void mo44834R_() {
        if (this.f70700f != null && this.f70701g != null) {
            int i = ((C26875a) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C26877c) this.f70701g).mo47017R_();
                        return;
                    case 2:
                        ((C26877c) this.f70701g).aS_();
                        return;
                }
            } else {
                ((C26877c) this.f70701g).mo47031e();
            }
        }
    }

    /* renamed from: b */
    public void mo44838b() {
        if (this.f70700f != null && this.f70701g != null) {
            int i = ((C26875a) this.f70700f).mListQueryType;
            boolean z = true;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C26875a) this.f70700f).isDataEmpty()) {
                            ((C26877c) this.f70701g).aJ_();
                            return;
                        } else {
                            ((C26877c) this.f70701g).mo47018a(((C26875a) this.f70700f).getItems(), ((C26875a) this.f70700f).isHasMore());
                            return;
                        }
                    case 2:
                        ((C26877c) this.f70701g).mo47029c(((C26875a) this.f70700f).getItems(), true ^ ((C26875a) this.f70700f).isNewDataEmpty());
                        break;
                }
                return;
            }
            C26877c cVar = (C26877c) this.f70701g;
            List items = ((C26875a) this.f70700f).getItems();
            if (!((C26875a) this.f70700f).isHasMore() || ((C26875a) this.f70700f).isNewDataEmpty()) {
                z = false;
            }
            cVar.mo47026b(items, z);
        }
    }

    /* renamed from: a */
    public void mo54838a(C26878d dVar) {
        this.f70734c = dVar;
    }

    /* renamed from: a */
    public void mo46992a(int i) {
        if (this.f70734c != null) {
            this.f70734c.mo50466c_(i);
        }
    }

    /* renamed from: a */
    public boolean mo54839a(Object obj) {
        if (this.f70700f == null || !((C26875a) this.f70700f).deleteItem(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        if (this.f70700f != null && this.f70701g != null) {
            int i = ((C26875a) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C26877c) this.f70701g).mo47025b(exc);
                        return;
                    case 2:
                        ((C26877c) this.f70701g).mo47024a_(exc);
                        break;
                }
                return;
            }
            ((C26877c) this.f70701g).mo47028c(exc);
        }
    }

    /* renamed from: a */
    public void mo46993a(List list, int i) {
        if (this.f70734c != null) {
            this.f70734c.mo50461a(list, i);
        }
    }

    /* renamed from: a */
    public boolean mo54840a(Object obj, int i) {
        if (this.f70700f == null || !((C26875a) this.f70700f).insertItem(obj, i)) {
            return false;
        }
        return true;
    }
}
