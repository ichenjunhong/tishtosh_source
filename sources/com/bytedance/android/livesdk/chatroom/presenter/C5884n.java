package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.presenter.C5880m.C5883a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.n */
public final /* synthetic */ class C5884n implements C1710e {

    /* renamed from: a */
    private final C5880m f15406a;

    public C5884n(C5880m mVar) {
        this.f15406a = mVar;
    }

    public final void accept(Object obj) {
        C5880m mVar = this.f15406a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            String str = null;
            if (th instanceof C2949a) {
                str = ((C2949a) th).getPrompt();
            }
            if (TextUtils.isEmpty(str)) {
                str = C5880m.m12803a((int) R.string.e99);
            }
            if (mVar.mo8518c() != null) {
                ((C5883a) mVar.mo8518c()).mo11769a(str);
            }
        }
    }
}
