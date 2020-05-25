package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45885d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView */
public final class DispathTouchEventView extends ProgressBar {

    /* renamed from: a */
    private C45885d f112927a;

    /* renamed from: b */
    private C44659e f112928b;

    /* renamed from: c */
    private C44642a f112929c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView$a */
    public interface C44642a {
        /* renamed from: a */
        void mo90603a(int i);
    }

    public final C44642a getClickListener() {
        return this.f112929c;
    }

    public final C45885d getListener() {
        return this.f112927a;
    }

    public final C44659e getStatusView() {
        return this.f112928b;
    }

    public final void setClickListener(C44642a aVar) {
        this.f112929c = aVar;
    }

    public final void setListener(C45885d dVar) {
        this.f112927a = dVar;
    }

    public final void setStatusView(C44659e eVar) {
        this.f112928b = eVar;
    }

    public DispathTouchEventView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        setOnClickListener(C446411.f112930a);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        Integer num2 = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C44659e eVar = this.f112928b;
            if (eVar != null) {
                num2 = eVar.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                C45885d dVar = this.f112927a;
                if (dVar != null) {
                    dVar.mo60275a(true);
                }
                return false;
            }
        } else if (num != null && num.intValue() == 1) {
            C44659e eVar2 = this.f112928b;
            if (eVar2 != null) {
                num2 = eVar2.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                return false;
            }
            C45885d dVar2 = this.f112927a;
            if (dVar2 != null) {
                dVar2.mo60275a(false);
            }
            C44642a aVar = this.f112929c;
            if (aVar != null) {
                aVar.mo90603a(getId());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DispathTouchEventView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        setOnClickListener(C446411.f112930a);
    }

    public DispathTouchEventView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setOnClickListener(C446411.f112930a);
    }
}
