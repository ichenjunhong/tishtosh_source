package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.broadcast.C3617q;

/* renamed from: com.bytedance.android.live.broadcast.preview.v */
final /* synthetic */ class C3612v implements OnDismissListener {

    /* renamed from: a */
    private final C3589i f10291a;

    C3612v(C3589i iVar) {
        this.f10291a = iVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3589i iVar = this.f10291a;
        if (!C3617q.INST.isLoadedRes()) {
            if (iVar.f10254l != null) {
                iVar.f10254l.mo8942a();
            } else if (iVar.getActivity() != null) {
                iVar.getActivity().finish();
            }
        }
    }
}
