package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5184d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.model.C8219f;

/* renamed from: com.bytedance.android.livesdk.rank.f.l */
final /* synthetic */ class C8186l implements OnClickListener {

    /* renamed from: a */
    private final C8184a f22354a;

    /* renamed from: b */
    private final C8219f f22355b;

    C8186l(C8184a aVar, C8219f fVar) {
        this.f22354a = aVar;
        this.f22355b = fVar;
    }

    public final void onClick(View view) {
        long[] a;
        C8184a aVar = this.f22354a;
        C8219f fVar = this.f22355b;
        if (fVar.f22442a != null) {
            String str = "";
            if (aVar.f22340a == 1) {
                str = aVar.f22341b ? "last_hourly_rank" : "hourly_rank";
            } else if (aVar.f22340a == 2) {
                str = aVar.f22341b ? "last_regional_rank" : "regional_rank";
            }
            String str2 = str;
            C4495a a2 = C4495a.m10823a();
            User user = fVar.f22442a;
            long a3 = fVar.mo14364a();
            if (aVar.f22349j == null) {
                a = new long[0];
            } else {
                a = aVar.f22349j.mo14354a();
            }
            C5184d dVar = new C5184d(user, a3, a, fVar.f22444c, str2);
            a2.mo10301a((Object) dVar);
        }
    }
}
