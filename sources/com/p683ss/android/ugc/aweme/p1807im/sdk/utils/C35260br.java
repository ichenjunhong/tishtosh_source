package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.br */
final /* synthetic */ class C35260br implements OnClickListener {

    /* renamed from: a */
    private final OnClickListener f90591a;

    C35260br(OnClickListener onClickListener) {
        this.f90591a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OnClickListener onClickListener = this.f90591a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
