package com.bytedance.android.livesdk.chatroom.end;

import android.graphics.Color;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5759o;
import com.bytedance.android.livesdk.chatroom.model.C5759o.C5760a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.f */
final /* synthetic */ class C5138f implements C1710e {

    /* renamed from: a */
    private final C5132e f13789a;

    C5138f(C5132e eVar) {
        this.f13789a = eVar;
    }

    public final void accept(Object obj) {
        int i;
        C5132e eVar = this.f13789a;
        C5759o oVar = (C5759o) ((C4177d) obj).data;
        if (oVar == null || oVar.f15139b == null) {
            eVar.f13783w = false;
            eVar.f13765e.setText(eVar.getResources().getString(R.string.eg0));
            eVar.f13765e.setTextColor(Color.parseColor("#a3ffffff"));
        } else {
            C5760a aVar = oVar.f15139b.size() > 0 ? (C5760a) oVar.f15139b.get(0) : null;
            if (aVar != null) {
                eVar.f13783w = true;
                eVar.f13765e.setText(aVar.f15147h);
                C5132e.f13721a = aVar.f15145f;
                try {
                    i = Color.parseColor(aVar.f15142c);
                } catch (Exception unused) {
                    i = Color.parseColor("#a3ffffff");
                }
                if (i != -1) {
                    eVar.f13765e.setTextColor(i);
                }
            } else {
                eVar.f13783w = false;
                eVar.f13765e.setText(eVar.getResources().getString(R.string.eg0));
                eVar.f13765e.setTextColor(Color.parseColor("#a3ffffff"));
            }
        }
        if (eVar.f13783w) {
            C9432q.m18691b(eVar.f13767g, 0);
        } else {
            C9432q.m18691b(eVar.f13767g, 8);
        }
        eVar.f13767g.setClickable(true);
    }
}
