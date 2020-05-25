package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bq */
final /* synthetic */ class C35259bq implements OnClickListener {

    /* renamed from: a */
    private final OnClickListener f90590a;

    C35259bq(OnClickListener onClickListener) {
        this.f90590a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OnClickListener onClickListener = this.f90590a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -1);
        }
    }
}
