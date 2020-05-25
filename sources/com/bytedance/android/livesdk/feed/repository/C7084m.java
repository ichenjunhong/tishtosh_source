package com.bytedance.android.livesdk.feed.repository;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C7070a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.repository.m */
final /* synthetic */ class C7084m implements C1710e {

    /* renamed from: a */
    private final C7070a f19289a;

    C7084m(C7070a aVar) {
        this.f19289a = aVar;
    }

    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        new Handler(Looper.getMainLooper()).post(new C7080i(this.f19289a));
    }
}
