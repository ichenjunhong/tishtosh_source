package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5294c.C5296b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h */
final /* synthetic */ class C5386h implements Runnable {

    /* renamed from: a */
    private final C5249a f14340a;

    /* renamed from: b */
    private final C5296b f14341b;

    C5386h(C5249a aVar, C5296b bVar) {
        this.f14340a = aVar;
        this.f14341b = bVar;
    }

    public final void run() {
        C5249a aVar = this.f14340a;
        C5296b bVar = this.f14341b;
        aVar.mo11099e();
        C0654k childFragmentManager = aVar.getChildFragmentManager();
        C0679r a = childFragmentManager.mo2225a();
        if (!aVar.f14028h.empty()) {
            a.mo2174a(R.anim.ci, R.anim.cj, R.anim.ci, R.anim.cj);
        }
        if (bVar != null) {
            a.mo2175a((int) R.id.ajf, (Fragment) bVar);
            a.mo2179a("link_dialog");
            aVar.f14028h.add(bVar);
        } else {
            childFragmentManager.mo2235c();
            Fragment a2 = childFragmentManager.mo2222a((int) R.id.ajf);
            if (a2 != null) {
                a.mo2177a(a2);
            }
            aVar.f14028h.pop();
        }
        a.mo2195c();
        if (bVar == null) {
            if (!aVar.f14028h.isEmpty()) {
                bVar = (C5296b) aVar.f14028h.peek();
                if (bVar == null) {
                    return;
                }
            } else {
                return;
            }
        }
        int a3 = C3922z.m9899a(bVar.mo11150c());
        LayoutParams layoutParams = aVar.f14022b.getLayoutParams();
        if (!aVar.f14028h.empty()) {
            int i = layoutParams.height;
            if (aVar.f14030k != null) {
                aVar.f14030k.removeAllUpdateListeners();
                aVar.f14030k.removeAllListeners();
                aVar.f14030k.cancel();
            }
            aVar.f14030k = ValueAnimator.ofInt(new int[]{i, a3});
            aVar.f14030k.addUpdateListener(new C5619i(aVar, layoutParams));
            aVar.f14030k.setDuration(300).start();
        } else {
            layoutParams.height = a3;
            aVar.f14022b.setLayoutParams(layoutParams);
        }
        aVar.f14022b.setLayoutParams(layoutParams);
    }
}
