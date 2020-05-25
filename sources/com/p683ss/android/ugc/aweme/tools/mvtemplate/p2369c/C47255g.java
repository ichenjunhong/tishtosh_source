package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.g */
public final /* synthetic */ class C47255g implements OnClickListener {

    /* renamed from: a */
    private final OnClickListener f119325a;

    public C47255g(OnClickListener onClickListener) {
        this.f119325a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OnClickListener onClickListener = this.f119325a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
