package com.bytedance.android.livesdk.gift.p357e;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.livesdk.gift.p356d.C7232c;
import com.bytedance.android.livesdk.gift.p357e.C7305a.C7307a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.gift.e.e */
public final class C7314e extends C7305a {
    /* renamed from: a */
    public final C7232c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7232c a = super.onCreateViewHolder(viewGroup, i);
        a.itemView.setLayoutParams(new LayoutParams((int) C9432q.m18687b(this.f19894a, 93.0f), (int) C9432q.m18687b(this.f19894a, 104.0f)));
        return a;
    }

    public C7314e(Context context, Room room, C7307a aVar, boolean z) {
        super(context, room, aVar, false);
    }
}
