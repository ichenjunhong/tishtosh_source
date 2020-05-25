package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dc */
final /* synthetic */ class C6522dc implements C1710e {

    /* renamed from: a */
    private final LinkPKWidget f17834a;

    C6522dc(LinkPKWidget linkPKWidget) {
        this.f17834a = linkPKWidget;
    }

    public final void accept(Object obj) {
        LinkPKWidget linkPKWidget = this.f17834a;
        Long l = (Long) obj;
        linkPKWidget.f17220d.setVisibility(8);
        linkPKWidget.f17222f.setVisibility(8);
        if (linkPKWidget.f17227k == null || linkPKWidget.f17226j == null) {
            float x = (linkPKWidget.f17225i.getX() + ((float) C3922z.m9899a(-9.0f))) - linkPKWidget.f17223g.getX();
            float y = (((linkPKWidget.f17225i.getY() + ((float) linkPKWidget.f17225i.getHeight())) - ((float) C3922z.m9899a(5.0f))) - linkPKWidget.f17223g.getY()) - ((float) linkPKWidget.f17223g.getHeight());
            HashMap hashMap = new HashMap();
            hashMap.put("translationX", String.valueOf(x));
            hashMap.put("translationY", String.valueOf(y));
            StringBuilder sb = new StringBuilder("Y: ");
            sb.append(linkPKWidget.f17225i.getY());
            sb.append(", height: ");
            sb.append(linkPKWidget.f17225i.getHeight());
            hashMap.put("layoutContent", sb.toString());
            C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linkPKWidget.f17221e, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linkPKWidget.f17221e, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linkPKWidget.f17221e, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linkPKWidget.f17221e, "translationY", new float[]{0.0f, y});
            linkPKWidget.f17226j = new AnimatorSet();
            linkPKWidget.f17226j.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
            linkPKWidget.f17226j.setDuration(500);
            linkPKWidget.f17226j.start();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(linkPKWidget.f17223g, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(linkPKWidget.f17223g, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(linkPKWidget.f17223g, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(linkPKWidget.f17223g, "translationY", new float[]{0.0f, y});
            linkPKWidget.f17227k = new AnimatorSet();
            linkPKWidget.f17227k.playTogether(new Animator[]{ofFloat5, ofFloat6, ofFloat7, ofFloat8});
            linkPKWidget.f17227k.setDuration(500);
            linkPKWidget.f17227k.start();
            return;
        }
        linkPKWidget.f17227k.cancel();
        linkPKWidget.f17226j.cancel();
        linkPKWidget.f17227k.start();
        linkPKWidget.f17226j.start();
    }
}
