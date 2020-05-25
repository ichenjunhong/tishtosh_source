package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.chatroom.api.ProfileNotificationApi;
import com.bytedance.android.livesdk.chatroom.model.C5711ad;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.al */
public final class C5789al extends C10176b<C5790a> {

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.al$a */
    public interface C5790a extends C10175a {
        /* renamed from: a */
        void mo11674a(C5711ad adVar);

        /* renamed from: a */
        void mo11675a(Throwable th);
    }

    /* renamed from: a */
    public final void mo11673a(int i, String str) {
        ((ProfileNotificationApi) C4157e.m10322a().mo9550a(ProfileNotificationApi.class)).sendNewSetting(i, str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5791am<Object>(this), (C1710e<? super Throwable>) new C5792an<Object>(this));
    }
}
