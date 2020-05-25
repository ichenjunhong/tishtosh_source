package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.ab */
final /* synthetic */ class C3504ab implements OnClickListener {

    /* renamed from: a */
    private final C3589i f9993a;

    /* renamed from: b */
    private final String f9994b;

    C3504ab(C3589i iVar, String str) {
        this.f9993a = iVar;
        this.f9994b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3589i iVar = this.f9993a;
        ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a((Context) iVar.getActivity(), C4704c.m11227b(this.f9994b).mo10506a(true).mo10505a(iVar.getContext().getResources().getString(R.string.e3o)));
        dialogInterface.dismiss();
    }
}
