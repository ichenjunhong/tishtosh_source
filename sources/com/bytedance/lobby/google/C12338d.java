package com.bytedance.lobby.google;

import android.support.p030v4.app.FragmentActivity;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.d */
final /* synthetic */ class C12338d implements C15359k {

    /* renamed from: a */
    private final GoogleAuth f32510a;

    /* renamed from: b */
    private final FragmentActivity f32511b;

    /* renamed from: c */
    private final C15233f f32512c;

    C12338d(GoogleAuth googleAuth, FragmentActivity fragmentActivity, C15233f fVar) {
        this.f32510a = googleAuth;
        this.f32511b = fragmentActivity;
        this.f32512c = fVar;
    }

    /* renamed from: a */
    public final void mo23334a(C15358j jVar) {
        GoogleAuth googleAuth = this.f32510a;
        Status status = (Status) jVar;
        GoogleAuth.m24816a(this.f32511b, this.f32512c);
    }
}
