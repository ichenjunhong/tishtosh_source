package com.bytedance.android.livesdk.gift.relay;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c.C7632a;

/* renamed from: com.bytedance.android.livesdk.gift.relay.j */
final /* synthetic */ class C7644j implements OnClickListener {

    /* renamed from: a */
    private final C7642i f21048a;

    /* renamed from: b */
    private final C7632a f21049b;

    C7644j(C7642i iVar, C7632a aVar) {
        this.f21048a = iVar;
        this.f21049b = aVar;
    }

    public final void onClick(View view) {
        C7642i iVar = this.f21048a;
        C7632a aVar = this.f21049b;
        if (iVar.f21045f != null) {
            iVar.f21045f.mo13992a(iVar, aVar);
        }
    }
}
