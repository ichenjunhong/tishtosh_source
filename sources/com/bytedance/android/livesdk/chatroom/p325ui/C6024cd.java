package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdk.p279af.C4609s;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cd */
final /* synthetic */ class C6024cd implements Runnable {

    /* renamed from: a */
    private final C6013bz f15988a;

    /* renamed from: b */
    private final long f15989b;

    /* renamed from: c */
    private final int f15990c;

    /* renamed from: d */
    private final int f15991d;

    C6024cd(C6013bz bzVar, long j, int i, int i2) {
        this.f15988a = bzVar;
        this.f15989b = j;
        this.f15990c = i;
        this.f15991d = i2;
    }

    public final void run() {
        C6013bz bzVar = this.f15988a;
        long j = this.f15989b;
        int i = this.f15990c;
        int i2 = this.f15991d;
        if (bzVar.isResumed() && bzVar.f15961m) {
            C4609s.m11067a(bzVar.getContext(), bzVar.f15953e);
            bzVar.mo12013a(j, i + 1, i2);
        }
    }
}
