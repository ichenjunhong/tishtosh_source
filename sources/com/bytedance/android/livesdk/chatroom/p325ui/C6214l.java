package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.l */
final /* synthetic */ class C6214l implements Runnable {

    /* renamed from: a */
    private final C5957b f16684a;

    C6214l(C5957b bVar) {
        this.f16684a = bVar;
    }

    public final void run() {
        C5957b bVar = this.f16684a;
        int[] iArr = new int[2];
        View view = (View) bVar.f15693D.f17941b.get(C6605h.MORE);
        if (view != null) {
            view.getLocationInWindow(iArr);
            if (bVar.getActivity() != null) {
                bVar.f15702M.setTranslationX((float) (C9432q.m18692c(bVar.getActivity(), (float) (iArr[0] - bVar.getActivity().getWindowManager().getDefaultDisplay().getWidth())) - 30));
            }
        }
    }
}
