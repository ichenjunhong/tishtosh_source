package com.p683ss.android.ugc.aweme.shortvideo.gesture.defult;

import android.arch.lifecycle.C0184k;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44926a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter */
public class DefaultGesturePresenter implements IGesturePresenter, C44926a {

    /* renamed from: a */
    public float f111118a = 0.0f;

    /* renamed from: b */
    public boolean f111119b;

    /* renamed from: c */
    boolean f111120c = true;

    /* renamed from: d */
    private List<C43866a> f111121d = new ArrayList();

    /* renamed from: e */
    private Map<Integer, Integer> f111122e = new HashMap();

    /* renamed from: f */
    private VideoRecordGestureLayout f111123f;

    /* renamed from: g */
    private C43869b f111124g;

    /* renamed from: h */
    private int f111125h;

    /* renamed from: a */
    public final boolean mo87823a(C20385c cVar) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87823a(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo88485a(C20382b bVar, float f, float f2) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public void disAttachView() {
        this.f111123f.setOnGestureListener(null);
    }

    /* renamed from: a */
    public final boolean mo87818a() {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87818a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87825b() {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87825b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo89421a(C43866a aVar) {
        mo89419a(1, aVar);
    }

    /* renamed from: a */
    public final void mo89420a(View view) {
        if (view instanceof VideoRecordGestureLayout) {
            this.f111123f = (VideoRecordGestureLayout) view;
            this.f111123f.setOnGestureListener(this);
        }
    }

    /* renamed from: f */
    public final void mo89418f(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo89418f(motionEvent);
            }
        }
    }

    /* renamed from: g */
    private void m96330g(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87827b(motionEvent)) {
                return;
            }
        }
        if (this.f111124g != null) {
            this.f111124g.mo88383a();
        }
    }

    /* renamed from: b */
    public final void mo88486b(C20382b bVar) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo88486b(bVar);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo87831c(float f) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87831c(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87834d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo88487e(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo88487e(motionEvent)) {
                return true;
            }
        }
        if (this.f111124g != null) {
            this.f111124g.mo88386a(motionEvent);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87832c(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87819a(float f) {
        if (this.f111124g != null) {
            this.f111124g.mo88388c(f);
        }
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87819a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87826b(float f) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87826b(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87820a(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87827b(MotionEvent motionEvent) {
        if (this.f111120c) {
            this.f111120c = false;
            new Handler().postDelayed(new C43868a(this), 300);
            m96330g(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        if (this.f111124g != null) {
            return this.f111124g.mo88992a(scaleGestureDetector);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        if (this.f111124g != null && this.f111124g.mo88387b(scaleGestureDetector.getScaleFactor())) {
            return true;
        }
        if (this.f111124g != null) {
            return this.f111124g.mo88993b(scaleGestureDetector);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo88484a(C20382b bVar) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo88484a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo87816a(MotionEvent motionEvent, int[] iArr) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo87816a(motionEvent, iArr);
            }
        }
    }

    /* renamed from: b */
    public final void mo87824b(MotionEvent motionEvent, int[] iArr) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo87824b(motionEvent, iArr);
            }
        }
    }

    /* renamed from: c */
    public final void mo87830c(MotionEvent motionEvent, int[] iArr) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo87830c(motionEvent, iArr);
            }
        }
    }

    /* renamed from: d */
    public final void mo87833d(MotionEvent motionEvent, int[] iArr) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo87833d(motionEvent, iArr);
            }
        }
    }

    /* renamed from: e */
    public final void mo87835e(MotionEvent motionEvent, int[] iArr) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null) {
                aVar.mo87835e(motionEvent, iArr);
            }
        }
    }

    /* renamed from: a */
    public final void mo89419a(int i, C43866a aVar) {
        Integer num = (Integer) this.f111122e.get(Integer.valueOf(i));
        if (num != null) {
            this.f111121d.set(num.intValue(), aVar);
            return;
        }
        this.f111121d.add(aVar);
        this.f111122e.put(Integer.valueOf(i), Integer.valueOf(this.f111121d.size() - 1));
    }

    public DefaultGesturePresenter(C0184k kVar, C43869b bVar, View view) {
        this.f111124g = bVar;
        mo89420a(view);
        kVar.getLifecycle().mo324a(this);
        this.f111125h = ViewConfiguration.get(C39629l.m88233b()).getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f111125h || abs <= abs2 || this.f111119b) {
            return false;
        }
        this.f111118a += f / ((float) this.f111123f.getWidth());
        this.f111118a = Math.min(this.f111118a, 1.0f);
        this.f111118a = Math.max(this.f111118a, -1.0f);
        if (this.f111124g != null) {
            this.f111124g.mo88384a(this.f111118a);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C43866a aVar : this.f111121d) {
            if (aVar != null && aVar.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        if (this.f111119b || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            return false;
        }
        if (this.f111124g != null) {
            this.f111124g.mo88385a(f, this.f111118a);
        }
        this.f111118a = 0.0f;
        return true;
    }
}
