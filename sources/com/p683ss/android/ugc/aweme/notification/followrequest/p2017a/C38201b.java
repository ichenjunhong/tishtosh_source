package com.p683ss.android.ugc.aweme.notification.followrequest.p2017a;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.a.b */
public final class C38201b extends C26851b<C38199a, C38202c> {
    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        if (this.f70701g != null && ((C38202c) this.f70701g).isViewValid() && this.f70700f != null && ((C38199a) this.f70700f).getData() != null) {
            ((C38202c) this.f70701g).mo78172a(((FollowRequestResponse) ((C38199a) this.f70700f).getData()).total);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        ((C38202c) this.f70701g).mo78174a(exc);
    }
}
