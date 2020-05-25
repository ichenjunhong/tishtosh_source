package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.m.s */
public final class C30499s extends C26876b<C31877a> {

    /* renamed from: a */
    public boolean f79713a;

    /* renamed from: b */
    public C30504w f79714b;

    /* renamed from: d */
    public boolean f79715d;

    /* renamed from: e */
    public boolean f79716e;

    /* renamed from: h */
    private boolean f79717h;

    /* renamed from: i */
    private C26878d f79718i;

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        this.f79718i = null;
    }

    /* renamed from: e */
    private void m71460e() {
        if (this.f79713a) {
            this.f79713a = false;
            ((C31877a) this.f70700f).f83270d = false;
        }
        if (this.f79716e) {
            C47718bf.m103288a(new C30319aj("DISCOVER"));
        } else {
            C47718bf.m103288a(new C30319aj());
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        C2667b.m7667b(C22858c.f61207c, "follow", 0);
        m71460e();
        boolean z2 = true;
        if (this.f79714b != null) {
            C30504w wVar = this.f79714b;
            if (!this.f79717h || this.f79715d) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f79717h = false;
        this.f79715d = false;
        if (this.f70700f != null) {
            int i = ((C31877a) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C31877a) this.f70700f).isDataEmpty()) {
                            if (this.f70701g != null) {
                                ((C26877c) this.f70701g).aJ_();
                                return;
                            }
                        } else if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47018a(((C31877a) this.f70700f).mo65078b(), ((C31877a) this.f70700f).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47029c(((C31877a) this.f70700f).mo65078b(), true ^ ((C31877a) this.f70700f).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f70701g != null) {
                C26877c cVar = (C26877c) this.f70701g;
                List b = ((C31877a) this.f70700f).mo65078b();
                if (!((C31877a) this.f70700f).isHasMore() || ((C31877a) this.f70700f).isNewDataEmpty()) {
                    z2 = false;
                }
                cVar.mo47026b(b, z2);
            }
        }
    }

    /* renamed from: a */
    public final void mo54838a(C26878d dVar) {
        this.f79718i = dVar;
    }

    /* renamed from: a */
    public final void mo46992a(int i) {
        if (this.f79718i != null) {
            this.f79718i.mo50466c_(i);
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        if (this.f79714b != null) {
            this.f79714b.mo55806d(this.f79715d);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: a */
    public final boolean mo54839a(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((C31877a) this.f70700f).getItems();
            if (!C9376b.m18558a((Collection<T>) items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    FollowFeed followFeed = (FollowFeed) items.get(i);
                    if (TextUtils.equals(((Aweme) obj).getAid(), C23198ae.m56877m(followFeed.getAweme()))) {
                        ((C31877a) this.f70700f).deleteItem(followFeed);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        boolean z;
        C2667b.m7664a(C22858c.f61207c, "follow", 0, C10201a.m20660a(C11010c.m22280a(), (Throwable) exc));
        m71460e();
        if (this.f79714b != null) {
            C30504w wVar = this.f79714b;
            if (!this.f79717h || this.f79715d) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f79717h = false;
        this.f79715d = false;
        if (this.f70700f != null) {
            int i = ((C31877a) this.f70700f).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47025b(exc);
                            break;
                        }
                        break;
                    case 2:
                        if (this.f70701g != null) {
                            ((C26877c) this.f70701g).mo47024a_(exc);
                            break;
                        }
                        break;
                }
            } else if (this.f70701g != null) {
                ((C26877c) this.f70701g).mo47028c(exc);
            }
            if (exc instanceof C23459a) {
                C26890h.m65011a("homepage_follow_monitor", C23089d.m56640a().mo47829a("error_type", "follow_feed_error").mo47826a("error_code", ((C23459a) exc).getErrorCode()).f61491a);
            } else {
                C26890h.m65011a("homepage_follow_monitor", C23089d.m56640a().mo47829a("error_type", "follow_feed_error").mo47826a("error_code", 4).f61491a);
            }
        }
    }

    /* renamed from: a */
    public final void mo46993a(List list, int i) {
        if (this.f79718i != null) {
            this.f79718i.mo50461a(list, i);
        }
    }

    /* renamed from: a */
    public final boolean mo54840a(Object obj, int i) {
        List items = ((C31877a) this.f70700f).getItems();
        if (C9376b.m18558a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, (FollowFeed) obj);
        ((C31877a) this.f70700f).setItems(items);
        if (this.f70701g != null) {
            if (((C31877a) this.f70700f).isDataEmpty()) {
                ((C26877c) this.f70701g).aJ_();
            } else {
                mo46993a(((C31877a) this.f70700f).mo65078b(), i);
            }
        }
        return true;
    }
}
