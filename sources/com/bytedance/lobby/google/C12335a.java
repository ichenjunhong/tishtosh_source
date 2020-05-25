package com.bytedance.lobby.google;

import android.support.p030v4.app.FragmentActivity;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.a */
final /* synthetic */ class C12335a implements C15359k {

    /* renamed from: a */
    private final GoogleAuth f32505a;

    /* renamed from: b */
    private final FragmentActivity f32506b;

    /* renamed from: c */
    private final C15233f f32507c;

    C12335a(GoogleAuth googleAuth, FragmentActivity fragmentActivity, C15233f fVar) {
        this.f32505a = googleAuth;
        this.f32506b = fragmentActivity;
        this.f32507c = fVar;
    }

    /* renamed from: a */
    public final void mo23334a(C15358j jVar) {
        GoogleAuth googleAuth = this.f32505a;
        Status status = (Status) jVar;
        GoogleAuth.m24816a(this.f32506b, this.f32507c);
    }
}
