package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p030v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23521a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43500al;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43503ao;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43546a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43547a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43548b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.PoiStickerView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2230e.C44565b;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.gamora.editor.C49391cu;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VESize;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.c */
public abstract class C43560c implements C43658m, C44565b {

    /* renamed from: a */
    private View f110224a;

    /* renamed from: b */
    private C43559b f110225b;

    /* renamed from: c */
    protected C46723c f110226c;

    /* renamed from: d */
    protected FrameLayout f110227d;

    /* renamed from: e */
    public boolean f110228e = true;

    /* renamed from: f */
    public C49391cu f110229f;

    /* renamed from: g */
    protected Rect f110230g;

    /* renamed from: h */
    protected int f110231h;

    /* renamed from: i */
    protected int f110232i;

    /* renamed from: j */
    protected C20347c f110233j;

    /* renamed from: k */
    public InteractStickerBaseView f110234k;

    /* renamed from: l */
    protected List<InteractStickerBaseView> f110235l = new ArrayList();

    /* renamed from: m */
    public C43547a f110236m;

    /* renamed from: n */
    protected BorderLineView f110237n;

    /* renamed from: o */
    public VESize f110238o;

    /* renamed from: p */
    public C43565a f110239p;

    /* renamed from: q */
    public boolean f110240q = true;

    /* renamed from: r */
    public boolean f110241r;

    /* renamed from: s */
    protected Context f110242s;

    /* renamed from: t */
    StickerHintTextViewModel f110243t;

    /* renamed from: u */
    public boolean f110244u = false;

    /* renamed from: v */
    public Runnable f110245v;

    /* renamed from: w */
    public C23521a<InteractStickerBaseView, InteractStickerBaseView> f110246w;

    /* renamed from: x */
    private String f110247x;

    /* renamed from: y */
    private boolean f110248y = true;

    /* renamed from: z */
    private Rect f110249z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.c$a */
    public class C43565a extends C46722b {
        public C43565a() {
        }

        /* renamed from: b */
        public final boolean mo87826b(float f) {
            boolean z;
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    if (interactStickerBaseView.f110382n) {
                        interactStickerBaseView.mo88864a((float) Math.toDegrees((double) f));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || interactStickerBaseView.f110384p) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo88487e(MotionEvent motionEvent) {
            if (!C43560c.this.f110228e) {
                return false;
            }
            if (C43560c.this.f110241r) {
                C43560c.this.f110241r = false;
                return true;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    boolean j = interactStickerBaseView.mo88888j();
                    if (j && interactStickerBaseView.f110389u) {
                        interactStickerBaseView.mo88887i();
                    }
                    interactStickerBaseView.f110389u = false;
                    interactStickerBaseView.f110384p = false;
                    if (j) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    long currentTimeMillis = System.currentTimeMillis() - interactStickerBaseView.f110388t;
                    if (currentTimeMillis < 300) {
                        interactStickerBaseView.f110388t = System.currentTimeMillis();
                    }
                    if (!interactStickerBaseView.mo88872b(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) || currentTimeMillis <= 300) {
                        z = false;
                    } else {
                        z = true;
                    }
                    interactStickerBaseView.f110383o = z;
                    if (interactStickerBaseView.f110383o || interactStickerBaseView.f110384p) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo87832c(MotionEvent motionEvent) {
            C43560c.this.f110244u = false;
            if (!C43560c.this.f110228e) {
                return false;
            }
            if (C43560c.this.f110242s != null && (C43560c.this.f110242s instanceof FragmentActivity)) {
                EditLyricStickerViewModel editLyricStickerViewModel = (EditLyricStickerViewModel) C48927d.m105736a((FragmentActivity) C43560c.this.f110242s).mo96760a(EditLyricStickerViewModel.class);
                if (editLyricStickerViewModel.mo96879f().getValue() != null && ((Boolean) editLyricStickerViewModel.mo96879f().getValue()).booleanValue()) {
                    return false;
                }
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo88709a(motionEvent)) {
                    if (C43560c.this.mo88736i()) {
                        C43560c.this.f110234k.post(new C43567e(C43560c.this));
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo88484a(C20382b bVar) {
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo88869a(bVar) || interactStickerBaseView.f110384p)) {
                    C43560c.this.mo88754l();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    if (interactStickerBaseView.f110383o) {
                        interactStickerBaseView.mo88873c(scaleGestureDetector.getScaleFactor());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || interactStickerBaseView.f110384p) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo87834d(MotionEvent motionEvent) {
            if (!C43560c.this.f110228e) {
                return false;
            }
            if (C43560c.this.f110242s != null && (C43560c.this.f110242s instanceof FragmentActivity)) {
                EditLyricStickerViewModel editLyricStickerViewModel = (EditLyricStickerViewModel) C48927d.m105736a((FragmentActivity) C43560c.this.f110242s).mo96760a(EditLyricStickerViewModel.class);
                if (editLyricStickerViewModel.mo96879f().getValue() != null && ((Boolean) editLyricStickerViewModel.mo96879f().getValue()).booleanValue()) {
                    return false;
                }
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo88711b(motionEvent)) {
                    C43560c.this.f110241r = interactStickerBaseView.f110385q;
                    C43560c.this.mo88754l();
                    return true;
                }
            }
            if (C43560c.this.f110229f != null) {
                C43560c.this.f110229f.cp_();
            }
            if (C43560c.this.f110242s != null && (C43560c.this.f110242s instanceof FragmentActivity) && !C43560c.this.mo88736i()) {
                ((EditViewModel) C48927d.m105736a((FragmentActivity) C43560c.this.f110242s).mo96760a(EditViewModel.class)).mo97033a(true, true, true);
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87823a(C20385c cVar) {
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    interactStickerBaseView.f110382n = interactStickerBaseView.mo88872b(cVar.f55902i, cVar.f55903j);
                    if (interactStickerBaseView.f110382n || interactStickerBaseView.f110384p) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo88485a(C20382b bVar, float f, float f2) {
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo88886h() || interactStickerBaseView.f110384p)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    if (interactStickerBaseView.f110381m || interactStickerBaseView.mo88889k() || System.currentTimeMillis() - interactStickerBaseView.f110388t < 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!C43560c.this.f110228e) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C43560c.this.f110235l) {
                if (interactStickerBaseView != null) {
                    if (interactStickerBaseView.f110381m || System.currentTimeMillis() - interactStickerBaseView.f110388t < 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            if (!C43560c.this.f110244u) {
                return false;
            }
            C43560c.this.f110244u = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InteractStickerBaseView mo88721a(Context context);

    /* renamed from: c */
    public boolean mo88730c() {
        return false;
    }

    /* renamed from: f */
    public int mo88733f() {
        return 2;
    }

    /* renamed from: g */
    public abstract int mo88734g();

    /* renamed from: i */
    public boolean mo88736i() {
        return false;
    }

    /* renamed from: a */
    public boolean mo88728a(InteractStickerBaseView interactStickerBaseView) {
        if (interactStickerBaseView == null) {
            return false;
        }
        if (interactStickerBaseView.getParent() != null && interactStickerBaseView.getParent() != this.f110227d) {
            return false;
        }
        this.f110227d.removeView(interactStickerBaseView);
        this.f110234k = null;
        if (this.f110236m != null) {
            this.f110236m.mo88688b();
        }
        this.f110235l.remove(interactStickerBaseView);
        this.f110244u = true;
        return true;
    }

    /* renamed from: a */
    public void mo88727a(boolean z) {
        if (this.f110234k == null) {
            this.f110234k = mo88721a(this.f110242s);
            this.f110227d.addView(this.f110234k, 0);
            this.f110234k.mo88871b(this.f110231h, this.f110232i);
            this.f110234k.setStickerEditListener(new C43548b() {
                /* renamed from: a */
                public final void mo88694a() {
                    if (C43560c.this.f110236m != null) {
                        C43560c.this.f110236m.mo88685a();
                    }
                }

                /* renamed from: b */
                public final void mo88698b() {
                    if (C43560c.this.f110236m != null) {
                        C43560c.this.f110236m.mo88686a(C43560c.this.f110234k.getDrawView());
                    }
                }

                /* renamed from: a */
                public final void mo88695a(InteractStickerBaseView interactStickerBaseView) {
                    C43560c.this.mo88728a(interactStickerBaseView);
                }

                /* renamed from: a */
                public final Float mo88693a(float f) {
                    if (C43560c.this.f110237n != null) {
                        return BorderLineView.m95792a(f);
                    }
                    return Float.valueOf(f);
                }

                /* renamed from: b */
                public final boolean mo88699b(float f) {
                    if (C43560c.this.f110237n == null) {
                        return true;
                    }
                    BorderLineView borderLineView = C43560c.this.f110237n;
                    PointF[] fourAnglePoint = C43560c.this.f110234k.getFourAnglePoint();
                    if (fourAnglePoint == null) {
                        return true;
                    }
                    RectF a = C43546a.m95604a(fourAnglePoint);
                    if (a.isEmpty()) {
                        return true;
                    }
                    a.offset((float) borderLineView.f110351b, 0.0f);
                    if (borderLineView.f110350a == null) {
                        return true;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(f, a.centerX(), a.centerY());
                    matrix.mapRect(a);
                    return borderLineView.f110350a.contains(a);
                }

                /* renamed from: c */
                public final boolean mo88701c(float f) {
                    if (C43560c.this.f110237n == null) {
                        return true;
                    }
                    BorderLineView borderLineView = C43560c.this.f110237n;
                    PointF[] fourAnglePoint = C43560c.this.f110234k.getFourAnglePoint();
                    if (fourAnglePoint == null) {
                        return true;
                    }
                    RectF a = C43546a.m95604a(fourAnglePoint);
                    if (a.isEmpty()) {
                        return true;
                    }
                    a.offset((float) borderLineView.f110351b, 0.0f);
                    if (borderLineView.f110350a == null || f < 1.0f) {
                        return true;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(f, f, a.centerX(), a.centerY());
                    matrix.mapRect(a);
                    return borderLineView.f110350a.contains(a);
                }

                /* renamed from: a */
                public final void mo88697a(boolean z) {
                    if (C43560c.this.f110236m != null) {
                        C43560c.this.f110236m.mo88689b(z);
                        if (z) {
                            C43560c.this.mo88752j();
                        }
                    }
                }

                /* renamed from: b */
                public final boolean mo88700b(float f, float f2) {
                    if (C43560c.this.f110237n == null) {
                        return true;
                    }
                    BorderLineView borderLineView = C43560c.this.f110237n;
                    PointF[] fourAnglePoint = C43560c.this.f110234k.getFourAnglePoint();
                    if (fourAnglePoint == null) {
                        return true;
                    }
                    RectF a = C43546a.m95604a(fourAnglePoint);
                    if (a.isEmpty()) {
                        return true;
                    }
                    a.offset(((float) borderLineView.f110351b) + f, f2);
                    if (borderLineView.f110350a == null) {
                        return true;
                    }
                    return borderLineView.f110350a.contains(a);
                }

                /* renamed from: a */
                public final PointF mo88691a(float f, float f2) {
                    if (C43560c.this.f110237n == null || C43560c.this.f110234k == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = C43560c.this.f110234k.getFourAnglePoint();
                    int length = fourAnglePoint.length;
                    for (int i = 0; i < length; i++) {
                        PointF pointF = fourAnglePoint[i];
                        pointF.x += 0.0f;
                        pointF.y += 0.0f;
                    }
                    BorderLineView borderLineView = C43560c.this.f110237n;
                    if (fourAnglePoint == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    RectF a = C43546a.m95604a(fourAnglePoint);
                    a.offset((float) borderLineView.f110351b, 0.0f);
                    PointF pointF2 = new PointF();
                    pointF2.x = 0.0f;
                    pointF2.y = 0.0f;
                    if (a.right - borderLineView.f110350a.right > 0.0f) {
                        pointF2.x = borderLineView.f110350a.right - a.right;
                    }
                    if (a.left - borderLineView.f110350a.left < 0.0f) {
                        pointF2.x = borderLineView.f110350a.left - a.left;
                    }
                    if (a.bottom - borderLineView.f110350a.bottom > 0.0f) {
                        pointF2.y = borderLineView.f110350a.bottom - a.bottom;
                    }
                    return pointF2;
                }

                /* renamed from: a */
                public final int mo88690a(boolean z, boolean z2, boolean z3) {
                    if (C43560c.this.f110237n != null) {
                        if (z) {
                            C43560c.this.f110237n.mo88856a();
                        } else if (C43560c.this.f110234k != null) {
                            return C43560c.this.f110237n.mo88854a(C43560c.this.f110234k.getFourAnglePoint(), z2, z3);
                        }
                    }
                    return -1;
                }

                /* renamed from: a */
                public final PointF mo88692a(float f, float f2, boolean z) {
                    if (C43560c.this.f110237n == null || C43560c.this.f110234k == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = C43560c.this.f110234k.getFourAnglePoint();
                    int length = fourAnglePoint.length;
                    for (int i = 0; i < length; i++) {
                        PointF pointF = fourAnglePoint[i];
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return C43560c.this.f110237n.mo88855a(fourAnglePoint, f, f2, z);
                }

                /* renamed from: a */
                public final void mo88696a(InteractStickerBaseView interactStickerBaseView, float f, float f2, RectF rectF, boolean z, C43549b bVar) {
                    C43560c.this.mo88745a(interactStickerBaseView, z, rectF, f, f2, bVar);
                }
            });
            this.f110235l.add(0, this.f110234k);
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && !z && this.f110243t != null && mo88734g() != 0) {
                this.f110234k.postDelayed(new C43566d(this), 500);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo88748a() {
        if (this.f110234k == null) {
            return false;
        }
        return this.f110234k.mo88888j();
    }

    /* renamed from: a */
    public final boolean mo88639a(RectF rectF) {
        if (C9414h.m18630a(this.f110235l)) {
            return false;
        }
        for (InteractStickerBaseView fourAnglePoint : this.f110235l) {
            RectF a = C43546a.m95604a(fourAnglePoint.getFourAnglePoint());
            if (a.top >= rectF.top) {
                if (a.bottom > rectF.bottom) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void mo88735h() {
        if (this.f110226c != null) {
            this.f110229f = this.f110226c.getDeleteView();
        }
    }

    /* renamed from: e */
    public void mo88732e() {
        if (this.f110234k != null) {
            mo88728a(this.f110234k);
        }
    }

    /* renamed from: m */
    public final void mo88755m() {
        if (this.f110234k != null) {
            this.f110234k.mo88887i();
            if (this.f110243t != null) {
                this.f110243t.mo90441a().postValue(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: n */
    public final String mo88756n() {
        if (this.f110247x != null) {
            return this.f110247x.replace("interact_sticker.png", "");
        }
        return "";
    }

    /* renamed from: k */
    public final void mo88753k() {
        if (this.f110233j != null) {
            VESize b = this.f110233j.mo43037b();
            if (b.width != 0 && b.height != 0) {
                int[] a = C43503ao.m95364a(this.f110227d, b.width, b.height);
                this.f110231h = a[0];
                this.f110232i = a[1];
                mo88973o();
            }
        }
    }

    /* renamed from: l */
    public final void mo88754l() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && this.f110243t != null) {
            this.f110243t.mo90441a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: b */
    private void mo88729b() {
        this.f110243t = (StickerHintTextViewModel) C0214z.m440a((FragmentActivity) this.f110242s).mo359a(StickerHintTextViewModel.class);
    }

    /* renamed from: o */
    private void mo88973o() {
        LayoutParams layoutParams = this.f110227d.getLayoutParams();
        this.f110230g = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.f110234k != null) {
            this.f110234k.mo88871b(this.f110231h, this.f110232i);
        }
        if (this.f110224a != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f110224a.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.f110224a.setLayoutParams(layoutParams2);
        }
        this.f110227d.removeView(this.f110237n);
        this.f110237n = BorderLineView.m95791a(this.f110242s, layoutParams.width, layoutParams.height, this.f110231h, this.f110232i);
        this.f110227d.addView(this.f110237n);
    }

    /* renamed from: j */
    public final void mo88752j() {
        if (this.f110227d != null && this.f110234k != null && this.f110237n != null) {
            if (this.f110245v != null) {
                this.f110245v.run();
            }
            if (this.f110226c != null) {
                this.f110226c.setHightLayerListenerToFirst(this.f110239p);
            }
            if (this.f110227d.getChildCount() > 1 && this.f110227d.getChildAt(this.f110227d.getChildCount() - 1) != this.f110234k) {
                this.f110227d.removeView(this.f110234k);
                this.f110227d.addView(this.f110234k);
            }
            if (this.f110235l.size() > 1 && this.f110235l.get(0) != this.f110234k) {
                this.f110235l.remove(this.f110234k);
                this.f110235l.add(0, this.f110234k);
            }
            if (this.f110237n != null) {
                ViewGroup viewGroup = (ViewGroup) this.f110237n.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f110237n);
                    viewGroup.addView(this.f110237n);
                }
            }
            if (this.f110235l.size() > 0) {
                InteractStickerBaseView interactStickerBaseView = (InteractStickerBaseView) this.f110235l.get(0);
                if (this.f110246w != null) {
                    this.f110246w.mo48681a(interactStickerBaseView, this.f110234k);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo88743a(Rect rect) {
        this.f110249z = rect;
    }

    /* renamed from: a */
    public final void mo88742a(float f) {
        if (this.f110234k != null) {
            this.f110234k.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo88751b(boolean z) {
        if (this.f110234k != null) {
            this.f110234k.setLockMode(z);
        }
    }

    /* renamed from: b */
    public static float m95657b(float f) {
        return new BigDecimal((double) f).setScale(4, 1).floatValue();
    }

    /* renamed from: a */
    public void mo88746a(InteractStickerStruct interactStickerStruct) {
        mo88747a(interactStickerStruct, Boolean.valueOf(true));
    }

    /* renamed from: b */
    private Point m95658b(PointF pointF) {
        int i;
        int i2;
        Point point = new Point();
        if (this.f110238o == null) {
            i2 = C43303dy.m94971b(this.f110234k.getContext());
            i = C43303dy.m94967a(this.f110234k.getContext());
        } else {
            i2 = this.f110238o.width;
            i = this.f110238o.height;
        }
        point.set((int) (((float) i2) * pointF.x), (int) (((float) i) * pointF.y));
        return point;
    }

    /* renamed from: a */
    public final PointF mo88740a(PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF();
        if (this.f110238o == null) {
            i2 = C43303dy.m94971b(this.f110234k.getContext());
            i = C43303dy.m94967a(this.f110234k.getContext());
        } else {
            i2 = this.f110238o.width;
            i = this.f110238o.height;
        }
        pointF2.set(m95657b((pointF.x * 1.0f) / ((float) i2)), m95657b((pointF.y * 1.0f) / ((float) i)));
        return pointF2;
    }

    /* renamed from: a */
    public final InteractStickerStruct mo88741a(int i) {
        if (!mo88730c() || this.f110234k == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(m95657b(this.f110234k.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f110234k.getScale()));
        PointF a = mo88740a(this.f110234k.mo88863a(this.f110238o));
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        normalTrackTimeStamp.setStartTime(0.0f);
        normalTrackTimeStamp.setEndTime(0.0f);
        PointF a2 = mo88740a(new PointF((float) this.f110234k.getContentViewWidth(), (float) this.f110234k.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C43568f.m95713a(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    /* renamed from: a */
    public void mo88744a(C20347c cVar) {
        if (cVar != null && this.f110233j == null) {
            VESize b = cVar.mo43037b();
            if (b.width != 0 && b.height != 0) {
                this.f110233j = cVar;
                int[] a = C43503ao.m95364a(this.f110227d, b.width, b.height);
                this.f110231h = a[0];
                this.f110232i = a[1];
                mo88973o();
            }
        }
    }

    /* renamed from: a */
    public void mo88726a(String str) {
        this.f110247x = str;
    }

    /* renamed from: a */
    public final void mo88747a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        if (interactStickerStruct != null) {
            NormalTrackTimeStamp a = C43577d.m95722a(interactStickerStruct);
            if (!(a == null || this.f110234k == null)) {
                Point b = m95658b(new PointF(a.getX(), a.getY()));
                PointF a2 = this.f110234k.mo88863a(this.f110238o);
                this.f110234k.mo88866a(((float) b.x) - a2.x, ((float) b.y) - a2.y, bool);
                this.f110234k.mo88875f();
                this.f110234k.mo88867a(-a.getRotation(), bool);
                this.f110234k.mo88873c(a.getScale().floatValue());
            }
        }
    }

    /* renamed from: a */
    public void mo88723a(Context context, C46723c cVar, FrameLayout frameLayout) {
        this.f110242s = context;
        this.f110227d = frameLayout;
        this.f110226c = cVar;
        this.f110239p = new C43565a();
        if (this.f110226c != null) {
            this.f110226c.mo93796a(this.f110239p);
        }
        mo88735h();
        mo88729b();
        this.f110225b = new C43559b();
    }

    /* renamed from: b */
    public final void mo88750b(Context context, C46723c cVar, FrameLayout frameLayout) {
        this.f110242s = context;
        this.f110227d = frameLayout;
        this.f110226c = null;
        this.f110239p = new C43565a();
        if (this.f110226c != null) {
            C46723c cVar2 = this.f110226c;
            cVar2.f117865a.add(0, this.f110239p);
        }
        mo88735h();
        mo88729b();
        this.f110225b = new C43559b();
    }

    /* renamed from: b */
    public final C0013i<C43569g> mo88749b(String str, int i, int i2, int i3, int i4) {
        if (this.f110234k != null) {
            this.f110234k.mo88887i();
        }
        return this.f110225b.mo88765a(this.f110234k, this.f110227d, str, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo88745a(InteractStickerBaseView interactStickerBaseView, boolean z, RectF rectF, float f, float f2, C43549b bVar) {
        boolean z2;
        boolean z3 = z;
        C43549b bVar2 = bVar;
        this.f110234k = interactStickerBaseView;
        if (this.f110234k != null) {
            if (z3) {
                this.f110234k.setAlpha(1.0f);
            }
            if (z3) {
                this.f110248y = true;
            } else if (this.f110248y) {
                mo88752j();
                this.f110248y = false;
            }
            PointF[] fourAnglePoint = interactStickerBaseView.getFourAnglePoint();
            boolean a = C43546a.m95605a(this.f110230g, fourAnglePoint);
            boolean b = C43546a.m95606b(this.f110249z, fourAnglePoint);
            PointF a2 = this.f110234k.mo88863a((VESize) null);
            if (this.f110229f != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (!mo88736i())) {
                int a3 = this.f110229f.mo93814a((int) (a2.x + ((float) this.f110231h)), (int) (a2.y + ((float) this.f110232i)), z3, a);
                InteractStickerBaseView interactStickerBaseView2 = this.f110234k;
                if (a3 == 1) {
                    if (interactStickerBaseView2 instanceof PoiStickerView) {
                        interactStickerBaseView2.setAlpha(0.3137255f);
                    }
                } else if (a3 == 3) {
                    mo88728a(interactStickerBaseView2);
                } else if (a3 == 4 && (interactStickerBaseView2 instanceof PoiStickerView)) {
                    interactStickerBaseView2.setAlpha(1.0f);
                }
            }
            if (!(this.f110229f == null || this.f110234k == null)) {
                this.f110229f.mo93816b((int) f, (int) f2, z3, b);
                if (b) {
                    this.f110234k.setAlpha(0.3137255f);
                } else {
                    this.f110234k.setAlpha(1.0f);
                }
            }
            if (z3 && b && this.f110234k != null) {
                final InteractStickerBaseView interactStickerBaseView3 = this.f110234k;
                if (!(interactStickerBaseView3 == null || bVar2 == null)) {
                    final float f3 = bVar2.f110203c;
                    final float f4 = bVar2.f110204d;
                    final float rotateAngle = bVar2.f110201a - interactStickerBaseView3.getRotateAngle();
                    final float scale = bVar2.f110202b / interactStickerBaseView3.getScale();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(300).setInterpolator(new C43500al(1.8f));
                    final InteractStickerBaseView interactStickerBaseView4 = interactStickerBaseView3;
                    C435611 r0 = new AnimatorUpdateListener() {

                        /* renamed from: a */
                        float f110250a;

                        /* renamed from: b */
                        float f110251b;

                        /* renamed from: c */
                        float f110252c;

                        /* renamed from: d */
                        float f110253d = 1.0f;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float f = (-((Float) valueAnimator.getAnimatedValue()).floatValue()) * f3;
                            float f2 = (f4 * f) / f3;
                            interactStickerBaseView4.mo88865a(f - this.f110250a, f2 - this.f110251b);
                            interactStickerBaseView4.mo88875f();
                            this.f110250a = f;
                            this.f110251b = f2;
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * rotateAngle;
                            interactStickerBaseView4.mo88870b(-(floatValue - this.f110252c));
                            this.f110252c = floatValue;
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * scale;
                            if (floatValue2 != 0.0f) {
                                interactStickerBaseView4.mo88874d(floatValue2 / this.f110253d);
                                this.f110253d = floatValue2;
                            }
                        }
                    };
                    ofFloat.addUpdateListener(r0);
                    ofFloat.addListener(new AnimatorListener() {
                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            interactStickerBaseView3.f110390v = null;
                        }
                    });
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.3137255f, 1.0f});
                    ofFloat2.setDuration(150).setInterpolator(new C43500al(1.8f));
                    ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            interactStickerBaseView3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.start();
                }
            }
            if (this.f110236m != null) {
                this.f110236m.mo88687a(z3);
            }
        }
    }
}
