package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.C6804a.C6805a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C7070a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.repository.q */
final /* synthetic */ class C7088q implements C1710e {

    /* renamed from: a */
    private final C7070a f19293a;

    /* renamed from: b */
    private final boolean f19294b;

    C7088q(C7070a aVar, boolean z) {
        this.f19293a = aVar;
        this.f19294b = z;
    }

    public final void accept(Object obj) {
        C7070a aVar = this.f19293a;
        boolean z = this.f19294b;
        aVar.f19268i.mo12993a(z ? C6805a.REFRESH : C6805a.LOAD_MORE, z ? aVar.f19262c : aVar.f19263d, (Throwable) obj);
    }
}
