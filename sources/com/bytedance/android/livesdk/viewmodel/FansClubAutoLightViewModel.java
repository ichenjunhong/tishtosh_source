package com.bytedance.android.livesdk.viewmodel;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.paging.p238c.C3952b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;

public class FansClubAutoLightViewModel extends PagingViewModel<Object> implements C3952b<Object> {

    /* renamed from: a */
    int f22839a;

    /* renamed from: p */
    private FansClubApi f22840p = ((FansClubApi) C4514j.m10883j().mo10321b().mo9550a(FansClubApi.class));

    /* renamed from: a */
    public final C2201v<Pair<List<Object>, C2974a>> mo9343a(boolean z, Long l, int i) {
        if (z) {
            this.f22839a = 0;
        }
        return this.f22840p.getAutoLightList(this.f22839a, 20).mo6540d((C1710e<? super T>) new C8417a<Object>(this)).mo6541d(C8418b.f22868a);
    }
}
