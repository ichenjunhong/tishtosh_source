package com.p683ss.android.ugc.aweme.p1807im;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.b */
abstract class C33179b implements C33180c {
    C33179b() {
    }

    /* renamed from: b */
    public boolean mo70344b() {
        return C33194e.m76264a();
    }

    /* renamed from: a */
    public boolean mo70343a() {
        return C33194e.m76265b();
    }

    /* renamed from: a */
    public void mo70342a(User user) {
        C33194e.m76279d().updateIMUserFollowStatus(C33194e.m76261a(user));
    }

    /* renamed from: a */
    public void mo70341a(Context context, RemoteImageView remoteImageView, int i) {
        C33194e.m76279d().wrapperIMShareIcon(context, remoteImageView, i);
    }

    /* renamed from: a */
    public void mo70340a(Context context, int i, boolean z, Runnable runnable) {
        C33194e.m76279d().wrapperSyncXAlert(context, i, z, runnable);
    }
}
