package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.e */
final /* synthetic */ class C24822e implements Runnable {

    /* renamed from: a */
    private final C24816b f65715a;

    /* renamed from: b */
    private final boolean f65716b;

    C24822e(C24816b bVar, boolean z) {
        this.f65715a = bVar;
        this.f65716b = z;
    }

    public final void run() {
        C24816b bVar = this.f65715a;
        boolean z = this.f65716b;
        if (bVar.f65696b != null) {
            C1352v f = bVar.f65696b.mo4847f(bVar.f65697c);
            if (f instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) f).mo51012a(z, true);
            }
        }
    }
}
