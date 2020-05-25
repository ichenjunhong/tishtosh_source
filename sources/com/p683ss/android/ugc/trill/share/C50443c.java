package com.p683ss.android.ugc.trill.share;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c;
import com.bytedance.lobby.auth.C12318c.C12320a;
import com.bytedance.lobby.internal.C12347d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;

/* renamed from: com.ss.android.ugc.trill.share.c */
final /* synthetic */ class C50443c implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f126493a;

    C50443c(SyncShareView syncShareView) {
        this.f126493a = syncShareView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SyncShareView syncShareView = this.f126493a;
        if (syncShareView.getContext() instanceof FragmentActivity) {
            C26890h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("success"));
            syncShareView.f126386b = "twitter";
            C12318c a = new C12320a((FragmentActivity) syncShareView.getContext()).mo23309a("twitter").mo23308a((C12316a) new C50456h(syncShareView)).mo23310a();
            C12347d.m24857a();
            C12347d.m24858a(a);
        }
    }
}
