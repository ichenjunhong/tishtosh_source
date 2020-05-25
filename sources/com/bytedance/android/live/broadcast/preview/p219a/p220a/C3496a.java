package com.bytedance.android.live.broadcast.preview.p219a.p220a;

import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdkapi.C8747h;
import com.bytedance.android.livesdkapi.C8747h.C8748a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.a */
public final class C3496a implements C8747h {
    /* renamed from: a */
    public final void mo8890a(C8748a aVar) {
        Context context = aVar.mo8889b().f24024a;
        if (!C3497b.m9315a(context)) {
            C4204a.m10421a(context, (int) R.string.e79);
        } else if (C9425l.m18652c(context) == C9426a.MOBILE_2G) {
            C4204a.m10421a(context, (int) R.string.ex9);
        } else if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a().childrenManagerForbidCreateLiveRoom()) {
            C4204a.m10421a(context, (int) R.string.e4y);
        } else {
            aVar.mo8888a();
        }
    }
}
