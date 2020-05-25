package com.p683ss.android.ugc.awemepushlib.interaction;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.r */
final /* synthetic */ class C48467r implements Callback {

    /* renamed from: a */
    private final int f121841a;

    /* renamed from: b */
    private final int f121842b;

    /* renamed from: c */
    private final int f121843c;

    /* renamed from: d */
    private final int f121844d;

    /* renamed from: e */
    private final int f121845e;

    /* renamed from: f */
    private final Callback f121846f;

    C48467r(int i, int i2, int i3, int i4, int i5, Callback callback) {
        this.f121841a = i;
        this.f121842b = i2;
        this.f121843c = i3;
        this.f121844d = i4;
        this.f121845e = i5;
        this.f121846f = callback;
    }

    public final boolean handleMessage(Message message) {
        return C48445d.m104848a(this.f121841a, this.f121842b, this.f121843c, this.f121844d, this.f121845e, this.f121846f, message);
    }
}
