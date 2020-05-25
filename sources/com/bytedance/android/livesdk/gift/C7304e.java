package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.network.response.C4177d;
import java.lang.ref.WeakReference;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e */
final /* synthetic */ class C7304e implements C1710e {

    /* renamed from: a */
    private final GiftManager f19889a;

    /* renamed from: b */
    private final boolean f19890b;

    /* renamed from: c */
    private final WeakReference f19891c;

    /* renamed from: d */
    private final long f19892d;

    /* renamed from: e */
    private final boolean f19893e;

    C7304e(GiftManager giftManager, boolean z, WeakReference weakReference, long j, boolean z2) {
        this.f19889a = giftManager;
        this.f19890b = z;
        this.f19891c = weakReference;
        this.f19892d = j;
        this.f19893e = z2;
    }

    public final void accept(Object obj) {
        this.f19889a.lambda$syncGiftList$0$GiftManager(this.f19890b, this.f19891c, this.f19892d, this.f19893e, (C4177d) obj);
    }
}
