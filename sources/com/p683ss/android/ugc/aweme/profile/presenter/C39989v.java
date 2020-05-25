package com.p683ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.v */
public final class C39989v extends C26876b<C26875a> {

    /* renamed from: a */
    public String f101924a;

    /* renamed from: b */
    private Object[] f101925b;

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70700f != null && this.f70701g != null) {
            int i = ((C26875a) this.f70700f).mListQueryType;
            boolean z = true;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (TextUtils.equals(this.f101924a, ((C39958b) this.f70700f).f101861c)) {
                            if (((C26875a) this.f70700f).isDataEmpty()) {
                                ((C26877c) this.f70701g).aJ_();
                                return;
                            } else {
                                ((C26877c) this.f70701g).mo47018a(((C26875a) this.f70700f).getItems(), ((C26875a) this.f70700f).isHasMore());
                                return;
                            }
                        } else if (this.f101925b != null && this.f101925b.length > 2 && (this.f101925b[2] instanceof String) && TextUtils.equals((String) this.f101925b[2], this.f101924a)) {
                            super.mo44934a_(this.f101925b);
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

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        this.f101925b = objArr;
        return super.mo44934a_(objArr);
    }
}
