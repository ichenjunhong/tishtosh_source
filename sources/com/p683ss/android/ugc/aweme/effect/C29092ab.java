package com.p683ss.android.ugc.aweme.effect;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.effect.C29089aa.C29091b;

/* renamed from: com.ss.android.ugc.aweme.effect.ab */
final /* synthetic */ class C29092ab implements OnTouchListener {

    /* renamed from: a */
    private final C29091b f76262a;

    C29092ab(C29091b bVar) {
        this.f76262a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C29091b bVar = this.f76262a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 == adapterPosition) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    bVar.f76258c.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
                    if (C29089aa.this.f76255a != null) {
                        C29089aa.this.f76255a.mo58936a(0, adapterPosition, (EffectModel) C29089aa.this.f76253c.get(adapterPosition));
                        break;
                    }
                    break;
                case 1:
                    break;
            }
        }
        bVar.f76258c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
        if (C29089aa.this.f76255a != null) {
            C29089aa.this.f76255a.mo58936a(1, adapterPosition, (EffectModel) C29089aa.this.f76253c.get(adapterPosition));
        }
        return true;
    }
}
