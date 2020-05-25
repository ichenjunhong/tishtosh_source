package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.el */
final /* synthetic */ class C6151el implements OnLongClickListener {

    /* renamed from: a */
    private final C6146d f16505a;

    C6151el(C6146d dVar) {
        this.f16505a = dVar;
    }

    public final boolean onLongClick(View view) {
        C6146d dVar = this.f16505a;
        if (view == null || view.getContext() == null) {
            return false;
        }
        Object tag = view.getTag(R.id.d5d);
        if (tag instanceof C5084b) {
            C5084b bVar = (C5084b) tag;
            if (bVar.mo10980e() != null) {
                Room a = dVar.f16488c != null ? dVar.f16488c.mo12171a() : null;
                T t = bVar.f13643a;
                if (!(a == null || t == null)) {
                    C6011by byVar = new C6011by(view.getContext(), bVar.mo10980e(), a, bVar.f13646d, t);
                    byVar.show();
                    return true;
                }
            }
        }
        return false;
    }
}
