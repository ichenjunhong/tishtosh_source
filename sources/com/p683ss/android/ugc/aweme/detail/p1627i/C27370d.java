package com.p683ss.android.ugc.aweme.detail.p1627i;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.i.d */
public abstract class C27370d<T extends C27369c, DATA> extends C26876b<T> {

    /* renamed from: a */
    public C30504w f72150a;

    /* renamed from: b */
    public boolean f72151b;

    /* renamed from: d */
    private boolean f72152d;

    /* renamed from: e */
    private C26878d f72153e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo55857b(DATA data);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract List<DATA> mo55858e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract List<Aweme> mo55859f();

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        this.f72153e = null;
    }

    /* renamed from: g */
    private boolean m65974g() {
        if (!this.f72152d || this.f72151b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f72150a != null) {
            this.f72150a.mo55806d(m65974g());
        }
        boolean z = false;
        this.f72152d = false;
        this.f72151b = false;
        if (this.f70700f != null) {
            int i = ((C27369c) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C27369c) this.f70700f).isDataEmpty()) {
                            if (this.f70701g != null) {
                                ((C26877c) this.f70701g).aJ_();
                                return;
                            }
                        } else if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47018a(mo55859f(), ((C27369c) this.f70700f).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47029c(mo55859f(), !((C27369c) this.f70700f).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f70701g != null) {
                C26877c cVar = (C26877c) this.f70701g;
                List f = mo55859f();
                if (((C27369c) this.f70700f).isHasMore() && !((C27369c) this.f70700f).isNewDataEmpty()) {
                    z = true;
                }
                cVar.mo47026b(f, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo54838a(C26878d dVar) {
        this.f72153e = dVar;
    }

    /* renamed from: a */
    public final void mo46992a(int i) {
        if (this.f72153e != null) {
            this.f72153e.mo50466c_(i);
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        if (this.f72150a != null) {
            this.f72150a.mo55806d(this.f72151b);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f72150a != null) {
            this.f72150a.mo55806d(m65974g());
        }
        this.f72152d = false;
        this.f72151b = false;
        super.mo44840c_(exc);
    }

    /* renamed from: a */
    public final boolean mo54839a(Object obj) {
        int i;
        int i2 = 0;
        if (obj instanceof Aweme) {
            List f = mo55859f();
            if (!C9376b.m18558a((Collection<T>) f)) {
                int size = f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), C31190f.m72838f((Aweme) f.get(i3)))) {
                        String aid = aweme.getAid();
                        if (this.f70700f != null) {
                            List e = mo55858e();
                            if (e == null) {
                                i = 0;
                            } else {
                                i = e.size();
                            }
                            while (true) {
                                if (i2 >= i) {
                                    break;
                                }
                                Object obj2 = e.get(i2);
                                String b = mo55857b(obj2);
                                if (TextUtils.isEmpty(b) || !TextUtils.equals(aid, b)) {
                                    i2++;
                                } else {
                                    C27382o oVar = ((C27369c) this.f70700f).f72149a;
                                    if (oVar != null) {
                                        oVar.mo55862c(b);
                                    }
                                    e.remove(obj2);
                                }
                            }
                        }
                        mo46992a(i3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo46993a(List list, int i) {
        if (this.f72153e != null) {
            this.f72153e.mo50461a(list, i);
        }
    }
}
