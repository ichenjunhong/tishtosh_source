package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.m */
public final class C38099m extends MusNotice {

    /* renamed from: a */
    public static final C38100a f96932a = new C38100a(null);

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.m$a */
    public static final class C38100a {
        private C38100a() {
        }

        public /* synthetic */ C38100a(C52707g gVar) {
            this();
        }
    }

    public final int hashCode() {
        return Integer.valueOf(this.timeLineType).hashCode();
    }

    public C38099m(int i) {
        super(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
        this.timeLineType = i;
        this.nid = String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C38099m) && this.timeLineType == ((C38099m) obj).timeLineType) {
            return true;
        }
        return false;
    }
}
