package com.p683ss.android.ugc.aweme.shortvideo.gesture;

import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44927b;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50634ao.C50635a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a */
public abstract class C43866a extends C44927b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a$a */
    public static class C43867a extends C43866a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87817a(C50634ao aoVar, MotionEvent motionEvent) {
    }

    /* renamed from: f */
    public final void mo89418f(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        int pointerCount = motionEvent.getPointerCount();
        C50634ao aoVar = new C50634ao();
        switch (action) {
            case 0:
                aoVar.f126941b = C50635a.BEGAN;
                m96327a(aoVar, motionEvent, 0);
                mo87817a(aoVar, motionEvent);
                return;
            case 1:
                aoVar.f126941b = C50635a.ENDED;
                m96327a(aoVar, motionEvent, 0);
                mo87817a(aoVar, motionEvent);
                return;
            case 2:
                aoVar.f126941b = C50635a.MOVED;
                for (int i = 0; i < pointerCount; i++) {
                    m96327a(aoVar, motionEvent, i);
                    mo87817a(aoVar, motionEvent);
                }
                return;
            case 3:
                aoVar.f126941b = C50635a.CANCELED;
                m96327a(aoVar, motionEvent, 0);
                mo87817a(aoVar, motionEvent);
                break;
            case 5:
                aoVar.f126941b = C50635a.BEGAN;
                m96327a(aoVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                mo87817a(aoVar, motionEvent);
                return;
            case 6:
                aoVar.f126941b = C50635a.ENDED;
                m96327a(aoVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                mo87817a(aoVar, motionEvent);
                return;
        }
    }

    /* renamed from: a */
    private static void m96327a(C50634ao aoVar, MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        aoVar.f126944e = motionEvent.getPressure(i);
        aoVar.f126940a = pointerId;
        aoVar.f126942c = x;
        aoVar.f126943d = y;
        aoVar.f126945f = 30.0f;
    }
}
