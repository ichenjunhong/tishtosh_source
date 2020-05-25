package com.p683ss.android.ugc.aweme.flowfeed.p1757f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.f.c */
final /* synthetic */ class C31774c implements OnClickListener {

    /* renamed from: a */
    private final C31769a f82984a;

    /* renamed from: b */
    private final User f82985b;

    /* renamed from: c */
    private final List f82986c;

    C31774c(C31769a aVar, User user, List list) {
        this.f82984a = aVar;
        this.f82985b = user;
        this.f82986c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f82984a.mo64712a(this.f82985b, this.f82986c, dialogInterface, i);
    }
}
