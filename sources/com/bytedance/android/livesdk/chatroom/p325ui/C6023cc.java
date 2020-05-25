package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdk.p279af.C4609s;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cc */
final /* synthetic */ class C6023cc implements Runnable {

    /* renamed from: a */
    private final C6013bz f15987a;

    C6023cc(C6013bz bzVar) {
        this.f15987a = bzVar;
    }

    public final void run() {
        C6013bz bzVar = this.f15987a;
        if (bzVar.isAdded()) {
            bzVar.f15953e.requestFocus();
            C4609s.m11067a(bzVar.getContext(), bzVar.f15953e);
        }
    }
}
