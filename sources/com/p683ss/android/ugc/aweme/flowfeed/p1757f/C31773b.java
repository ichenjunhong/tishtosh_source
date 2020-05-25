package com.p683ss.android.ugc.aweme.flowfeed.p1757f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.f.b */
final /* synthetic */ class C31773b implements OnClickListener {

    /* renamed from: a */
    private final C31769a f82981a;

    /* renamed from: b */
    private final Aweme f82982b;

    /* renamed from: c */
    private final List f82983c;

    C31773b(C31769a aVar, Aweme aweme, List list) {
        this.f82981a = aVar;
        this.f82982b = aweme;
        this.f82983c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f82981a.mo64709a(this.f82982b, this.f82983c, dialogInterface, i);
    }
}
