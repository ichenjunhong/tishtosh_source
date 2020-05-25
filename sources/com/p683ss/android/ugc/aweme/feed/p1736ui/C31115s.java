package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31217y;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.s */
final /* synthetic */ class C31115s implements OnClickListener {

    /* renamed from: a */
    private final FeedAvatarView f81443a;

    /* renamed from: b */
    private final View f81444b;

    C31115s(FeedAvatarView feedAvatarView, View view) {
        this.f81443a = feedAvatarView;
        this.f81444b = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FeedAvatarView feedAvatarView = this.f81443a;
        View view = this.f81444b;
        if (!C23718g.m58207b().mo49153d()) {
            C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
            dialogInterface.dismiss();
            return;
        }
        if (feedAvatarView.f79016i != null) {
            C30332aw awVar = new C30332aw(38, feedAvatarView.f79011d);
            awVar.f79231d = "head_icon";
            feedAvatarView.f79016i.mo48228a("feed_internal_event", (Object) awVar);
        }
        C31217y.m72907a(true);
        dialogInterface.dismiss();
    }
}
