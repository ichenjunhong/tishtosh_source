package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.al */
final /* synthetic */ class C44974al implements OnClickListener {

    /* renamed from: a */
    private final PublishPermissionFragment f113904a;

    /* renamed from: b */
    private final int f113905b;

    C44974al(PublishPermissionFragment publishPermissionFragment, int i) {
        this.f113904a = publishPermissionFragment;
        this.f113905b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PublishPermissionFragment publishPermissionFragment = this.f113904a;
        int i2 = this.f113905b;
        publishPermissionFragment.f113662c = i2;
        publishPermissionFragment.mo91090a(i2);
        dialogInterface.dismiss();
        publishPermissionFragment.mo91089a();
    }
}
