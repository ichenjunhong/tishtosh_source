package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.aj */
final /* synthetic */ class C40224aj implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102756a;

    /* renamed from: b */
    private final User f102757b;

    C40224aj(C40212af afVar, User user) {
        this.f102756a = afVar;
        this.f102757b = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C40010c.f101950a.mo82025a((Activity) this.f102756a.getActivity(), this.f102757b.getBioUrl());
    }
}
