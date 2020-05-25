package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.j */
final /* synthetic */ class C43632j implements OnTouchListener {

    /* renamed from: a */
    private final C43535i f110530a;

    C43632j(C43535i iVar) {
        this.f110530a = iVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C43535i iVar = this.f110530a;
        Rect rect = new Rect();
        iVar.f110166i.getHitRect(rect);
        if (motionEvent.getY() < ((float) rect.top) - C9432q.m18687b((Context) iVar.f110160c, 20.0f) || motionEvent.getY() > ((float) rect.bottom) + C9432q.m18687b((Context) iVar.f110160c, 20.0f)) {
            return false;
        }
        float height = (float) (rect.top + (rect.height() / 2));
        float x = motionEvent.getX() - ((float) rect.left);
        float f = x < 0.0f ? 0.0f : x > ((float) rect.width()) ? (float) rect.width() : x;
        return iVar.f110166i.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
    }
}
