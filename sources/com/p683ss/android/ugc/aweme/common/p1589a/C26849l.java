package com.p683ss.android.ugc.aweme.common.p1589a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;

/* renamed from: com.ss.android.ugc.aweme.common.a.l */
public final class C26849l implements C1339l {

    /* renamed from: a */
    public boolean f70693a;

    /* renamed from: b */
    private RecyclerView f70694b;

    /* renamed from: c */
    private C26846a f70695c;

    /* renamed from: d */
    private boolean f70696d;

    /* renamed from: e */
    private int f70697e = ViewConfiguration.get(this.f70694b.getContext()).getScaledTouchSlop();

    /* renamed from: f */
    private float f70698f;

    /* renamed from: a */
    public final void mo5079a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public C26849l(RecyclerView recyclerView, C26846a aVar) {
        this.f70694b = recyclerView;
        this.f70695c = aVar;
        this.f70694b.mo4800a((C1339l) this);
    }

    /* renamed from: a */
    public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f70698f = motionEvent.getY();
            this.f70696d = true;
        }
        if (this.f70694b != null && this.f70693a && this.f70696d && !this.f70694b.canScrollVertically(1) && this.f70698f - motionEvent.getY() > ((float) this.f70697e)) {
            if (this.f70695c != null) {
                this.f70695c.ar_();
            }
            this.f70693a = false;
            this.f70696d = false;
        }
        return false;
    }
}
