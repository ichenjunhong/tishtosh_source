package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.u */
final /* synthetic */ class C26538u implements OnClickListener {

    /* renamed from: a */
    private final Context f69873a;

    /* renamed from: b */
    private final Aweme f69874b;

    /* renamed from: c */
    private final String f69875c;

    C26538u(Context context, Aweme aweme, String str) {
        this.f69873a = context;
        this.f69874b = aweme;
        this.f69875c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f69873a;
        Aweme aweme = this.f69874b;
        String str = this.f69875c;
        C26533q.m64211a(context, aweme);
        C26088l.m63322b(context, "click_open_url_window_confirm", aweme, C26088l.m63373m(context, aweme, "raw click_open_url_window_confirm"));
        C26088l.m63340d(context, aweme, str);
        dialogInterface.dismiss();
    }
}
