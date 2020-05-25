package com.bytedance.android.livesdk.p328d;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.chatroom.api.BanTalkApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.d.a */
public final class C6737a {

    /* renamed from: a */
    public C6742f f18413a = this;

    /* renamed from: a */
    public final void mo12852a(boolean z, long j, long j2, String str) {
        BanTalkApi banTalkApi = (BanTalkApi) C4514j.m10883j().mo10321b().mo9550a(BanTalkApi.class);
        if (z) {
            banTalkApi.silence(j, j2, str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C6738b<Object>(this, z), (C1710e<? super Throwable>) new C6739c<Object>(this, z));
        } else {
            banTalkApi.unsilence(j, j2, str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C6740d<Object>(this, z), (C1710e<? super Throwable>) new C6741e<Object>(this, z));
        }
    }
}
