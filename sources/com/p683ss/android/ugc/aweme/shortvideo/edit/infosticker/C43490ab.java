package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ab */
final /* synthetic */ class C43490ab implements Runnable {

    /* renamed from: a */
    private final C43535i f109973a;

    /* renamed from: b */
    private final int f109974b;

    /* renamed from: c */
    private final int f109975c;

    /* renamed from: d */
    private final int[] f109976d;

    C43490ab(C43535i iVar, int i, int i2, int[] iArr) {
        this.f109973a = iVar;
        this.f109974b = i;
        this.f109975c = i2;
        this.f109976d = iArr;
    }

    public final void run() {
        C43535i iVar = this.f109973a;
        int i = this.f109974b;
        int i2 = this.f109975c;
        int[] iArr = this.f109976d;
        if (i != 0 && i2 != 0 && iArr != null) {
            iVar.f110179v = new Rect(0, iArr[1], i, i2 + iArr[1]);
        }
    }
}
