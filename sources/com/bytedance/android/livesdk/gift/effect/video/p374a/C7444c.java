package com.bytedance.android.livesdk.gift.effect.video.p374a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8639a;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.host.IHostPlugin;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.c */
public final class C7444c implements C8640b {

    /* renamed from: a */
    public static C7444c f20420a;

    /* renamed from: d */
    private static SparseArray<C8639a> f20421d = new SparseArray<>(2);

    /* renamed from: e */
    private static int f20422e;

    /* renamed from: b */
    private final IHostPlugin f20423b;

    /* renamed from: c */
    private Context f20424c;

    /* renamed from: a */
    public final C8639a mo13793a(int i) {
        return (C8639a) f20421d.get(i);
    }

    /* renamed from: b */
    public final void mo13795b(int i) {
        C8639a aVar = (C8639a) f20421d.get(i);
        if (aVar != null) {
            aVar.mo13786c();
            f20421d.remove(i);
        }
    }

    public C7444c(Context context, IHostPlugin iHostPlugin) {
        this.f20424c = context.getApplicationContext();
        this.f20423b = iHostPlugin;
    }

    /* renamed from: a */
    public final C8639a mo13794a(int i, C0184k kVar) {
        if (i == f20422e && mo13793a(f20422e) != null) {
            return mo13793a(f20422e);
        }
        f20422e = i;
        C7440b bVar = new C7440b(this.f20424c, this.f20423b);
        bVar.mo13779a(kVar);
        f20421d.put(i, bVar);
        return bVar;
    }
}
