package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C7070a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.repository.g */
final /* synthetic */ class C7078g implements C1710e {

    /* renamed from: a */
    private final C7070a f19282a;

    C7078g(C7070a aVar) {
        this.f19282a = aVar;
    }

    public final void accept(Object obj) {
        C7070a aVar = this.f19282a;
        Pair pair = (Pair) obj;
        if (pair.first != null) {
            aVar.f19262c = (String) pair.first;
        }
        if (pair.second != null) {
            aVar.f19263d = (String) pair.second;
        }
    }
}
