package com.p683ss.android.ugc.aweme.friends.p1789c;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendRecentModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.c.f */
public final class C32575f extends C26851b<SummonFriendRecentModel, C26877c> {

    /* renamed from: a */
    List<SummonFriendItem> f84803a;

    public C32575f() {
        mo54799a(new SummonFriendRecentModel());
    }

    /* renamed from: a */
    public final void mo65903a(final boolean z) {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                if (z) {
                    C32575f.this.f84803a = ((SummonFriendRecentModel) C32575f.this.mo54803n()).refreshData();
                } else {
                    C32575f.this.f84803a = ((SummonFriendRecentModel) C32575f.this.mo54803n()).loadMore();
                }
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        if (z) {
                            ((C26877c) C32575f.this.f70701g).mo47018a(C32575f.this.f84803a, ((SummonFriendRecentModel) C32575f.this.mo54803n()).isHasMore());
                        } else {
                            ((C26877c) C32575f.this.f70701g).mo47026b(C32575f.this.f84803a, ((SummonFriendRecentModel) C32575f.this.mo54803n()).isHasMore());
                        }
                    }
                });
            }
        });
    }
}
