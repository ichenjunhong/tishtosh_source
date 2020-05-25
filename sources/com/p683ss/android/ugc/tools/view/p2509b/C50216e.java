package com.p683ss.android.ugc.tools.view.p2509b;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.view.MotionEvent;
import com.p683ss.android.ugc.tools.view.p2509b.C50211c.C50213a;

/* renamed from: com.ss.android.ugc.tools.view.b.e */
public final class C50216e implements C1339l {

    /* renamed from: a */
    public boolean f125784a;

    /* renamed from: b */
    private RecyclerView f125785b;

    /* renamed from: c */
    private C50213a f125786c;

    /* renamed from: d */
    private boolean f125787d;

    /* renamed from: e */
    private int f125788e;

    /* renamed from: f */
    private float f125789f;

    /* renamed from: a */
    public final void mo5079a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f125789f = motionEvent.getY();
            this.f125787d = true;
        }
        if (this.f125785b != null && this.f125784a && this.f125787d && !this.f125785b.canScrollVertically(1) && this.f125789f - motionEvent.getY() > ((float) this.f125788e)) {
            if (this.f125786c != null) {
                this.f125786c.mo73964a();
            }
            this.f125784a = false;
            this.f125787d = false;
        }
        return false;
    }
}
