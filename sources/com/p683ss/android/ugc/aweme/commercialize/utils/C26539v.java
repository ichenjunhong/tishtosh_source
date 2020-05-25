package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.v */
final /* synthetic */ class C26539v implements OnClickListener {

    /* renamed from: a */
    private final Context f69876a;

    /* renamed from: b */
    private final Aweme f69877b;

    C26539v(Context context, Aweme aweme) {
        this.f69876a = context;
        this.f69877b = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f69876a;
        Aweme aweme = this.f69877b;
        C26088l.m63322b(context, "click_open_url_window_cancel", aweme, C26088l.m63373m(context, aweme, "raw click_open_url_window_cancel"));
        dialogInterface.dismiss();
    }
}
