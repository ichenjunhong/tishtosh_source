package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.arch.lifecycle.C0184k;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.defult.C43869b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout.C44926a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StickerGesturePresenter */
public class StickerGesturePresenter implements IGesturePresenter, C44926a {

    /* renamed from: a */
    public VideoRecordGestureLayout f117852a;

    /* renamed from: b */
    public float f117853b = 0.0f;

    /* renamed from: c */
    public boolean f117854c;

    /* renamed from: d */
    private List<C43866a> f117855d = new ArrayList();

    /* renamed from: e */
    private C43869b f117856e;

    /* renamed from: f */
    private int f117857f;

    /* renamed from: a */
    public final boolean mo87820a(MotionEvent motionEvent) {
        return false;
    }

    public void disAttachView() {
        this.f117852a.setOnGestureListener(null);
    }

    /* renamed from: a */
    public final boolean mo87818a() {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87818a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87825b() {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87825b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93795a(C43866a aVar) {
        this.f117855d.add(0, aVar);
    }

    /* renamed from: f */
    public final void mo89418f(MotionEvent motionEvent) {
        for (C43866a f : this.f117855d) {
            f.mo89418f(motionEvent);
        }
    }

    /* renamed from: b */
    public final void mo88486b(C20382b bVar) {
        for (C43866a b : this.f117855d) {
            b.mo88486b(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo87831c(float f) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87831c(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo87834d(MotionEvent motionEvent) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87834d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo88487e(MotionEvent motionEvent) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo88487e(motionEvent)) {
                return true;
            }
        }
        this.f117856e.mo88386a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final boolean mo87819a(float f) {
        this.f117856e.mo88388c(f);
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87819a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo87832c(MotionEvent motionEvent) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87832c(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87826b(float f) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87826b(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87822a(scaleGestureDetector)) {
                return true;
            }
        }
        return this.f117856e.mo88992a(scaleGestureDetector);
    }

    /* renamed from: b */
    public final boolean mo87827b(MotionEvent motionEvent) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87827b(motionEvent)) {
                return true;
            }
        }
        this.f117856e.mo88383a();
        return true;
    }

    /* renamed from: a */
    public final boolean mo88484a(C20382b bVar) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo88484a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87829b(scaleGestureDetector)) {
                return true;
            }
        }
        if (this.f117856e.mo88387b(scaleGestureDetector.getScaleFactor())) {
            return true;
        }
        return this.f117856e.mo88993b(scaleGestureDetector);
    }

    /* renamed from: a */
    public final boolean mo87823a(C20385c cVar) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87823a(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo87816a(MotionEvent motionEvent, int[] iArr) {
        for (C43866a a : this.f117855d) {
            a.mo87816a(motionEvent, iArr);
        }
    }

    /* renamed from: b */
    public final void mo87824b(MotionEvent motionEvent, int[] iArr) {
        for (C43866a b : this.f117855d) {
            b.mo87824b(motionEvent, iArr);
        }
    }

    /* renamed from: c */
    public final void mo87830c(MotionEvent motionEvent, int[] iArr) {
        for (C43866a c : this.f117855d) {
            c.mo87830c(motionEvent, iArr);
        }
    }

    /* renamed from: d */
    public final void mo87833d(MotionEvent motionEvent, int[] iArr) {
        for (C43866a d : this.f117855d) {
            d.mo87833d(motionEvent, iArr);
        }
    }

    /* renamed from: e */
    public final void mo87835e(MotionEvent motionEvent, int[] iArr) {
        for (C43866a e : this.f117855d) {
            e.mo87835e(motionEvent, iArr);
        }
    }

    public StickerGesturePresenter(C0184k kVar, C43869b bVar, View view) {
        this.f117856e = bVar;
        if (view instanceof VideoRecordGestureLayout) {
            this.f117852a = (VideoRecordGestureLayout) view;
            this.f117852a.setOnGestureListener(this);
        }
        kVar.getLifecycle().mo324a(this);
        this.f117857f = ViewConfiguration.get(C39629l.m88233b()).getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo88485a(C20382b bVar, float f, float f2) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo88485a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87821a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f117857f || abs <= abs2 || this.f117854c) {
            return false;
        }
        this.f117853b += f / ((float) this.f117852a.getWidth());
        this.f117853b = Math.min(this.f117853b, 1.0f);
        this.f117853b = Math.max(this.f117853b, -1.0f);
        this.f117856e.mo88384a(this.f117853b);
        return true;
    }

    /* renamed from: b */
    public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C43866a aVar : this.f117855d) {
            if (aVar != null && aVar.mo87828b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        if (this.f117854c || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            return false;
        }
        this.f117856e.mo88385a(f, this.f117853b);
        this.f117853b = 0.0f;
        return true;
    }
}
