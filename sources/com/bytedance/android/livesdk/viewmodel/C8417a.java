package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.chatroom.model.C5749g;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.viewmodel.a */
final /* synthetic */ class C8417a implements C1710e {

    /* renamed from: a */
    private final FansClubAutoLightViewModel f22867a;

    C8417a(FansClubAutoLightViewModel fansClubAutoLightViewModel) {
        this.f22867a = fansClubAutoLightViewModel;
    }

    public final void accept(Object obj) {
        FansClubAutoLightViewModel fansClubAutoLightViewModel = this.f22867a;
        C4175b bVar = (C4175b) obj;
        if (bVar != null && bVar.data != null) {
            List<Object> list = ((C5749g) bVar.data).f15113b;
            if (list != null) {
                fansClubAutoLightViewModel.f22839a += list.size();
            }
        }
    }
}
