package com.p683ss.android.ugc.aweme.detail.p1619a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.p683ss.android.ugc.aweme.detail.C27383j;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.a.c */
public final class C27314c implements C27383j {

    /* renamed from: a */
    public final View f72060a;

    /* renamed from: b */
    public final Context f72061b;

    /* renamed from: c */
    public final ViewGroup f72062c;

    /* renamed from: b */
    public final void mo55760b(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f72060a.clearAnimation();
        this.f72060a.setVisibility(8);
        aVar.invoke();
    }

    /* renamed from: a */
    public final void mo55759a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f72060a.setVisibility(0);
        if (this.f72060a.getAnimation() == null) {
            this.f72060a.startAnimation(AnimationUtils.loadAnimation(this.f72061b, R.anim.eb));
        }
        aVar.invoke();
    }

    public C27314c(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f72061b = context;
        this.f72062c = viewGroup;
        View findViewById = this.f72062c.findViewById(R.id.cse);
        C52711k.m112236a((Object) findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f72060a = findViewById;
        this.f72062c.setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27314c f72063a;

            {
                this.f72063a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C52711k.m112236a((Object) motionEvent, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        C27314c cVar = this.f72063a;
                        cVar.mo55760b(C27386b.f72158a);
                        cVar.f72062c.startAnimation(AnimationUtils.loadAnimation(cVar.f72061b, R.anim.e_));
                        break;
                    case 1:
                        C27314c cVar2 = this.f72063a;
                        cVar2.mo55759a(C27385a.f72157a);
                        cVar2.f72062c.clearAnimation();
                        break;
                }
                return false;
            }
        });
    }
}
