package com.p683ss.android.ugc.aweme.emoji.p1680a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.emoji.a.e */
public class C29289e<DATA> extends C1352v {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59235a() {
    }

    /* renamed from: a */
    public void mo59236a(DATA data) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo59237b() {
        this.itemView.setOnTouchListener(new OnTouchListener(0.5f) {

            /* renamed from: a */
            final /* synthetic */ float f77227a;

            {
                this.f77227a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C29484l.m69577a(true, view, this.f77227a);
                            break;
                        case 1:
                            break;
                    }
                }
                C29484l.m69577a(false, view, this.f77227a);
                return false;
            }
        });
    }

    public C29289e(View view) {
        super(view);
        mo59235a();
        mo59237b();
    }
}
