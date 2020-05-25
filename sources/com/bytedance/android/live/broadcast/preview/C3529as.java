package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.broadcast.C3617q;

/* renamed from: com.bytedance.android.live.broadcast.preview.as */
final /* synthetic */ class C3529as implements OnDismissListener {

    /* renamed from: a */
    private final C3514al f10086a;

    C3529as(C3514al alVar) {
        this.f10086a = alVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3514al alVar = this.f10086a;
        if (!C3617q.INST.isLoadedRes()) {
            if (alVar.f10056k != null) {
                alVar.f10056k.mo8942a();
            } else if (alVar.getActivity() != null) {
                alVar.getActivity().finish();
            }
        }
    }
}
