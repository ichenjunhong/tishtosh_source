package com.p683ss.android.ugc.trill.share;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;

/* renamed from: com.ss.android.ugc.trill.share.d */
final /* synthetic */ class C50444d implements OnClickListener {

    /* renamed from: a */
    static final OnClickListener f126494a = new C50444d();

    private C50444d() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C26890h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("cancel"));
    }
}
