package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.p410c.C8143c;

/* renamed from: com.bytedance.android.livesdk.rank.f.f */
final /* synthetic */ class C8179f implements OnClickListener {

    /* renamed from: a */
    private final C8177a f22332a;

    C8179f(C8177a aVar) {
        this.f22332a = aVar;
    }

    public final void onClick(View view) {
        C8177a aVar = this.f22332a;
        C8143c cVar = new C8143c();
        cVar.f22228b = true;
        switch (aVar.f22328o) {
            case 1:
                cVar.f22227a = 2;
                break;
            case 2:
                cVar.f22227a = 3;
                break;
        }
        C4495a.m10823a().mo10301a((Object) cVar);
    }
}
