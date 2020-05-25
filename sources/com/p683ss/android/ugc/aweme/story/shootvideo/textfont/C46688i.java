package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23521a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43500al;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43503ao;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43507as;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43546a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43568f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43576n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.TextStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46669a;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46670b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.AssistLineView;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l.C46761c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.C46736b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46739b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46740c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2344b.C46745a;
import com.p683ss.android.ugc.gamora.editor.C49391cu;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i */
public final class C46688i implements C43658m, C46749a {

    /* renamed from: A */
    public C23521a<C46757l, C46757l> f117769A;

    /* renamed from: B */
    private C46723c f117770B;

    /* renamed from: C */
    private int f117771C;

    /* renamed from: D */
    private int f117772D;

    /* renamed from: E */
    private SafeHandler f117773E;

    /* renamed from: F */
    private C20347c f117774F;

    /* renamed from: G */
    private int f117775G;

    /* renamed from: H */
    private boolean f117776H;

    /* renamed from: I */
    private C46747d f117777I;

    /* renamed from: J */
    private C43576n f117778J;

    /* renamed from: K */
    private TextStickerViewModel f117779K;

    /* renamed from: a */
    public AppCompatActivity f117780a;

    /* renamed from: b */
    public List<C46757l> f117781b = new ArrayList();

    /* renamed from: c */
    public FrameLayout f117782c;

    /* renamed from: d */
    public View f117783d;

    /* renamed from: e */
    public C46696a f117784e;

    /* renamed from: f */
    public C49391cu f117785f;

    /* renamed from: g */
    public C46757l f117786g;

    /* renamed from: h */
    public C46669a f117787h;

    /* renamed from: i */
    public Rect f117788i;

    /* renamed from: j */
    public boolean f117789j = true;

    /* renamed from: k */
    public C46697b f117790k;

    /* renamed from: l */
    public boolean f117791l;

    /* renamed from: m */
    public TextStickerInputLayout f117792m;

    /* renamed from: n */
    public AssistLineView f117793n;

    /* renamed from: o */
    public long f117794o;

    /* renamed from: p */
    protected BorderLineView f117795p;

    /* renamed from: q */
    public C23522b<C46757l> f117796q;

    /* renamed from: r */
    public boolean f117797r;

    /* renamed from: s */
    public boolean f117798s;

    /* renamed from: t */
    protected C46670b f117799t;

    /* renamed from: u */
    StickerHintTextViewModel f117800u;

    /* renamed from: v */
    public EditViewModel f117801v;

    /* renamed from: w */
    public boolean f117802w = false;

    /* renamed from: x */
    public Runnable f117803x;

    /* renamed from: y */
    public Rect f117804y;

    /* renamed from: z */
    public VideoPublishEditModel f117805z;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i$a */
    public interface C46696a {
        /* renamed from: a */
        void mo93685a(C46757l lVar);

        /* renamed from: a */
        void mo93686a(C46757l lVar, int i, int i2, boolean z, boolean z2, boolean z3);

        /* renamed from: b */
        void mo93687b(C46757l lVar);

        /* renamed from: c */
        void mo93688c(C46757l lVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i$b */
    public class C46697b extends C46722b {
        public C46697b() {
        }

        /* renamed from: e */
        public final boolean mo88487e(MotionEvent motionEvent) {
            if (C46688i.this.f117791l) {
                C46688i.this.f117791l = false;
                return true;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null && lVar.f118087j.mo93871c()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null) {
                    if (!lVar.mo93891b()) {
                        z = false;
                    } else {
                        float a = lVar.mo93885a(scaleGestureDetector.getFocusY());
                        lVar.f118096s = lVar.mo93889a(scaleGestureDetector.getFocusX(), a);
                        lVar.f118087j.mo93869a(scaleGestureDetector.getFocusX(), a);
                        z = lVar.mo93902g();
                    }
                    if (z) {
                        C46688i.this.mo93653a(lVar);
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
            boolean z;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null) {
                    if (!lVar.mo93891b() || !lVar.mo93902g() || !lVar.mo93894c(scaleGestureDetector.getScaleFactor())) {
                        z = false;
                    } else {
                        lVar.f118081d *= scaleGestureDetector.getScaleFactor();
                        lVar.invalidate();
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0083 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0010 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo87826b(float r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.story.shootvideo.textfont.i r0 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.this
                boolean r0 = r0.f117789j
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                com.ss.android.ugc.aweme.story.shootvideo.textfont.i r0 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.this
                java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l> r0 = r0.f117781b
                java.util.Iterator r0 = r0.iterator()
            L_0x0010:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r2 = r0.next()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = (com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l) r2
                if (r2 == 0) goto L_0x0010
                boolean r3 = r2.mo93891b()
                r4 = 1
                if (r3 == 0) goto L_0x0080
                double r5 = (double) r10
                double r5 = java.lang.Math.toDegrees(r5)
                float r3 = (float) r5
                float r5 = java.lang.Math.abs(r3)
                r6 = 1092616192(0x41200000, float:10.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 <= 0) goto L_0x0036
                r3 = 0
            L_0x0036:
                boolean r5 = r2.mo93900f()
                if (r5 == 0) goto L_0x0080
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c r5 = r2.f118087j
                float r6 = r2.f118080c
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r7 = r5.f118026a
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r8 = r5.f118041p
                int r7 = r7.mo93671a(r8, r1, r4)
                r8 = -1
                if (r8 == r7) goto L_0x0055
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r7 = r5.f118026a
                java.lang.Float r3 = r7.mo93673a(r3)
                float r3 = r3.floatValue()
            L_0x0055:
                float r6 = r6 - r3
                r3 = 1127481344(0x43340000, float:180.0)
                r7 = 1135869952(0x43b40000, float:360.0)
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x005f
                float r6 = r6 - r7
            L_0x005f:
                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 >= 0) goto L_0x0066
                float r6 = r6 + r7
            L_0x0066:
                com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.h r3 = r3.mo58583n()
                com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickerFunctionalities
                boolean r3 = r3.mo83103a(r7)
                if (r3 == 0) goto L_0x0079
                r5.mo93867a(r1)
            L_0x0079:
                r2.f118080c = r6
                r2.invalidate()
                r2 = 1
                goto L_0x0081
            L_0x0080:
                r2 = 0
            L_0x0081:
                if (r2 == 0) goto L_0x0010
                return r4
            L_0x0084:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.C46697b.mo87826b(float):boolean");
        }

        /* renamed from: c */
        public final boolean mo87832c(MotionEvent motionEvent) {
            boolean z;
            C46688i.this.f117802w = false;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                lVar.f118087j.f118035j = 2;
            }
            for (C46757l lVar2 : C46688i.this.f117781b) {
                if (lVar2 != null) {
                    if (!lVar2.mo93891b()) {
                        z = false;
                    } else {
                        lVar2.f118092o = new C43549b(lVar2.getStickerRotate(), lVar2.getStickerScale(), lVar2.getCenterX(), lVar2.getCenterY());
                        lVar2.f118097t = motionEvent.getY() - motionEvent.getRawY();
                        z = lVar2.f118087j.mo93869a(motionEvent.getX(), lVar2.mo93885a(motionEvent.getY()));
                        if (z) {
                            lVar2.setTouching(true);
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:68:0x01ed A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0014 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo88484a(com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                com.ss.android.ugc.aweme.story.shootvideo.textfont.i r2 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.this
                boolean r2 = r2.f117789j
                r3 = 0
                if (r2 != 0) goto L_0x000c
                return r3
            L_0x000c:
                com.ss.android.ugc.aweme.story.shootvideo.textfont.i r2 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.this
                java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l> r2 = r2.f117781b
                java.util.Iterator r2 = r2.iterator()
            L_0x0014:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x01f4
                java.lang.Object r4 = r2.next()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r4 = (com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l) r4
                if (r4 == 0) goto L_0x0014
                boolean r5 = r4.mo93891b()
                if (r5 == 0) goto L_0x01ea
                boolean r5 = r4.mo93898e()
                if (r5 == 0) goto L_0x01ea
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c r4 = r4.f118087j
                android.graphics.PointF r5 = r1.f55897i
                float r5 = r5.x
                android.graphics.PointF r7 = r1.f55897i
                float r7 = r7.y
                float r8 = r4.f118032g
                float r8 = r8 + r5
                float r9 = r4.f118033h
                float r9 = r9 + r7
                float r10 = r4.f118029d
                float r10 = r8 - r10
                float r10 = java.lang.Math.abs(r10)
                float r11 = r4.f118030e
                float r11 = r9 - r11
                float r11 = java.lang.Math.abs(r11)
                r12 = 1084227584(0x40a00000, float:5.0)
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L_0x005a
                int r10 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r10 >= 0) goto L_0x005a
                goto L_0x01ea
            L_0x005a:
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r10 = r4.f118026a
                r11 = -1
                r12 = 3
                if (r10 == 0) goto L_0x00dd
                boolean r10 = r4.mo93868a()
                if (r10 != 0) goto L_0x006c
                boolean r10 = r4.mo93870b()
                if (r10 == 0) goto L_0x00dd
            L_0x006c:
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r10 = r4.f118041p
                android.graphics.RectF r15 = r10.getHelpRect()
                float r10 = r15.centerX()
                float r13 = r15.centerY()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r14 = r4.f118041p
                float r14 = r14.getStickerRotate()
                com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95252a(r15, r10, r13, r14)
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r10 = r4.f118041p
                float r10 = r10.getStickerScale()
                com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95251a(r15, r10)
                boolean r10 = r4.f118034i
                if (r10 == 0) goto L_0x0094
                boolean r10 = r4.f118034i
                r4.f118042q = r10
            L_0x0094:
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r13 = r4.f118026a
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r14 = r4.f118041p
                int r10 = r4.f118037l
                float r10 = (float) r10
                float r10 = r10 + r8
                int r10 = (int) r10
                int r6 = r4.f118038m
                float r6 = (float) r6
                float r6 = r6 + r9
                int r6 = (int) r6
                r18 = 0
                boolean r19 = r4.mo93870b()
                boolean r20 = r4.mo93872d()
                r21 = 0
                r16 = r10
                r17 = r6
                r13.mo93675a(r14, r15, r16, r17, r18, r19, r20, r21)
                boolean r6 = r4.mo93872d()
                if (r6 != 0) goto L_0x00db
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r6 = r4.f118026a
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r10 = r4.f118041p
                int r6 = r6.mo93671a(r10, r3, r3)
                if (r11 == r6) goto L_0x00db
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r10 = r4.f118026a
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r13 = r4.f118041p
                android.graphics.PointF r5 = r10.mo93672a(r13, r5, r7)
                if (r12 != r6) goto L_0x00db
                float r6 = r4.f118032g
                float r7 = r5.x
                float r6 = r6 + r7
                float r7 = r4.f118033h
                float r5 = r5.y
                float r7 = r7 + r5
                r8 = r6
                r9 = r7
            L_0x00db:
                r5 = 1
                goto L_0x00de
            L_0x00dd:
                r5 = 0
            L_0x00de:
                int r6 = r4.f118035j
                if (r6 != r12) goto L_0x010e
                r4.f118035j = r12
                float r5 = r4.f118032g
                float r5 = r8 - r5
                r4.f118027b = r5
                float r5 = r4.f118033h
                float r5 = r9 - r5
                r4.f118028c = r5
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r5 = r4.f118041p
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r4.f118041p
                float r6 = r6.getCenterX()
                float r7 = r4.f118027b
                float r6 = r6 + r7
                r5.setCenterX(r6)
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r5 = r4.f118041p
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r4.f118041p
                float r6 = r6.getCenterY()
                float r7 = r4.f118028c
                float r6 = r6 + r7
                r5.setCenterY(r6)
                goto L_0x01d6
            L_0x010e:
                int r6 = r4.f118035j
                r7 = 4
                if (r6 != r7) goto L_0x01e0
                r4.f118035j = r7
                float r5 = r4.f118032g
                float r5 = r8 - r5
                r4.f118027b = r5
                float r5 = r4.f118033h
                float r5 = r9 - r5
                r4.f118028c = r5
                float r5 = r4.f118027b
                float r6 = r4.f118028c
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r10 = r4.f118041p
                android.graphics.RectF r10 = r10.getHelpRect()
                float r10 = r10.centerX()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r12 = r4.f118041p
                android.graphics.RectF r12 = r12.getHelpRect()
                float r12 = r12.centerY()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r13 = r4.f118041p
                android.graphics.RectF r13 = r13.getRotateRect()
                float r13 = r13.centerX()
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r14 = r4.f118041p
                android.graphics.RectF r14 = r14.getRotateRect()
                float r14 = r14.centerY()
                float r5 = r5 + r13
                float r6 = r6 + r14
                float r13 = r13 - r10
                float r14 = r14 - r12
                float r5 = r5 - r10
                float r6 = r6 - r12
                float r10 = r13 * r13
                float r12 = r14 * r14
                float r10 = r10 + r12
                double r11 = (double) r10
                double r10 = java.lang.Math.sqrt(r11)
                float r10 = (float) r10
                float r11 = r5 * r5
                float r12 = r6 * r6
                float r11 = r11 + r12
                double r11 = (double) r11
                double r11 = java.lang.Math.sqrt(r11)
                float r11 = (float) r11
                float r12 = r11 / r10
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r15 = r4.f118041p
                boolean r15 = r15.mo93894c(r12)
                if (r15 == 0) goto L_0x0180
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r15 = r4.f118041p
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r7 = r4.f118041p
                float r7 = r7.getStickerScale()
                float r7 = r7 * r12
                r15.mo93892b(r7)
            L_0x0180:
                float r7 = r13 * r5
                float r12 = r14 * r6
                float r7 = r7 + r12
                float r10 = r10 * r11
                float r7 = r7 / r10
                double r10 = (double) r7
                r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
                if (r7 > 0) goto L_0x01d6
                r15 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
                if (r7 >= 0) goto L_0x0196
                goto L_0x01d6
            L_0x0196:
                double r10 = java.lang.Math.acos(r10)
                double r10 = java.lang.Math.toDegrees(r10)
                float r7 = (float) r10
                float r13 = r13 * r6
                float r5 = r5 * r14
                float r13 = r13 - r5
                r5 = 0
                int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r5 <= 0) goto L_0x01ab
                r5 = 1
                goto L_0x01ac
            L_0x01ab:
                r5 = -1
            L_0x01ac:
                float r5 = (float) r5
                float r5 = r5 * r7
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r6 = r4.f118026a
                if (r6 == 0) goto L_0x01c9
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r6 = r4.f118026a
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r7 = r4.f118041p
                r10 = 1
                int r6 = r6.mo93671a(r7, r3, r10)
                r7 = 4
                if (r7 != r6) goto L_0x01c9
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c r6 = r4.f118026a
                java.lang.Float r5 = r6.mo93673a(r5)
                float r5 = r5.floatValue()
            L_0x01c9:
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r4.f118041p
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r7 = r4.f118041p
                float r7 = r7.getStickerRotate()
                float r7 = r7 + r5
                r5 = 1
                r6.mo93886a(r7, r5)
            L_0x01d6:
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r5 = r4.f118041p
                r5.invalidate()
                r4.f118032g = r8
                r4.f118033h = r9
                r5 = 1
            L_0x01e0:
                if (r5 == 0) goto L_0x01eb
                boolean r6 = r4.f118034i
                if (r6 == 0) goto L_0x01eb
                r4.mo93867a(r3)
                goto L_0x01eb
            L_0x01ea:
                r5 = 0
            L_0x01eb:
                if (r5 == 0) goto L_0x0014
                com.ss.android.ugc.aweme.story.shootvideo.textfont.i r1 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.this
                r1.mo93643a()
                r1 = 1
                return r1
            L_0x01f4:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i.C46697b.mo88484a(com.ss.android.ugc.asve.e.a.b):boolean");
        }

        /* renamed from: d */
        public final boolean mo87834d(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null) {
                    lVar.f118091n.set(motionEvent.getRawX(), motionEvent.getRawY());
                    if (!lVar.mo93891b()) {
                        z = false;
                    } else {
                        if (lVar.f118087j.mo93871c()) {
                            if (lVar.f118092o != null) {
                                lVar.f118092o.f110203c = lVar.getCenterX() - lVar.f118092o.f110203c;
                                lVar.f118092o.f110204d = lVar.getCenterY() - lVar.f118092o.f110204d;
                            }
                            C46740c cVar = lVar.f118087j;
                            C43549b bVar = lVar.f118092o;
                            cVar.f118043r = true;
                            if (cVar.f118026a == null || (!cVar.mo93868a() && !cVar.mo93870b())) {
                                z = false;
                            } else {
                                RectF helpRect = cVar.f118041p.getHelpRect();
                                C43454a.m95252a(helpRect, helpRect.centerX(), helpRect.centerY(), cVar.f118041p.getStickerRotate());
                                C43454a.m95251a(helpRect, cVar.f118041p.getStickerScale());
                                cVar.f118026a.mo93675a(cVar.f118041p, helpRect, ((int) cVar.f118032g) + cVar.f118037l, ((int) cVar.f118033h) + cVar.f118038m, true, cVar.mo93870b(), cVar.mo93872d(), bVar);
                                if (cVar.f118042q) {
                                    if (!cVar.mo93872d() && !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    cVar.mo93867a(z2);
                                    cVar.f118042q = false;
                                }
                                cVar.f118026a.mo93671a(cVar.f118041p, true, false);
                                z = true;
                            }
                            if (cVar.f118035j != 6 || !cVar.f118041p.mo93899e(cVar.f118029d, cVar.f118030e)) {
                                if (cVar.f118035j != 7 || !cVar.f118041p.mo93897d(cVar.f118029d, cVar.f118030e)) {
                                    if (cVar.f118035j != 5 || !cVar.f118041p.mo93901f(cVar.f118029d, cVar.f118030e)) {
                                        if (cVar.f118039n) {
                                            int abs = (int) Math.abs(motionEvent.getX() - (cVar.f118029d + ((float) cVar.f118037l)));
                                            int abs2 = (int) Math.abs((motionEvent.getY() - ((float) C22452a.m55498d())) - (cVar.f118030e + ((float) cVar.f118038m)));
                                            if (System.currentTimeMillis() - cVar.f118031f <= 200 && (abs <= 5 || abs2 <= 5)) {
                                                if (cVar.f118034i || cVar.mo93872d()) {
                                                    if (cVar.f118026a != null) {
                                                        new C43507as().f110029a.storeBoolean("text_sticker_hint_set", true);
                                                        cVar.f118026a.mo93676a(cVar.f118041p, true);
                                                    }
                                                    cVar.mo93867a(false);
                                                } else {
                                                    if (cVar.f118026a != null) {
                                                        cVar.f118026a.mo93676a(cVar.f118041p, false);
                                                    }
                                                    cVar.mo93867a(true);
                                                }
                                            }
                                        }
                                    } else if (cVar.f118026a != null) {
                                        cVar.f118026a.mo93677b(cVar.f118041p);
                                    }
                                } else if (cVar.f118026a != null) {
                                    cVar.f118026a.mo93674a(cVar.f118041p);
                                }
                            } else if (cVar.f118026a != null) {
                                cVar.f118026a.mo93676a(cVar.f118041p, true);
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        lVar.f118095r = false;
                        lVar.f118094q = false;
                        lVar.f118096s = false;
                        C46740c cVar2 = lVar.f118087j;
                        cVar2.f118032g = 0.0f;
                        cVar2.f118033h = 0.0f;
                        lVar.setTouching(false);
                    }
                    if (z) {
                        C46688i.this.mo93643a();
                        if (lVar.f118087j.f118035j == 5) {
                            z3 = true;
                        }
                        if (z3) {
                            C46688i.this.f117791l = true;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87823a(C20385c cVar) {
            boolean z;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null) {
                    if (!lVar.mo93891b()) {
                        z = false;
                    } else {
                        float a = lVar.mo93885a(cVar.f55903j);
                        lVar.f118095r = lVar.mo93889a(cVar.f55902i, a);
                        lVar.f118087j.mo93869a(cVar.f55902i, a);
                        z = lVar.mo93900f();
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo88485a(C20382b bVar, float f, float f2) {
            boolean z;
            if (!C46688i.this.f117789j) {
                return false;
            }
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null) {
                    if (!lVar.mo93891b()) {
                        z = false;
                    } else {
                        float a = lVar.mo93885a(f2);
                        boolean a2 = lVar.mo93889a(f, a);
                        if (!a2) {
                            a2 = lVar.mo93895c(f, a);
                        }
                        lVar.f118094q = a2;
                        lVar.f118087j.mo93869a(f, a);
                        z = lVar.mo93898e();
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null && lVar.f118087j.mo93871c()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            for (C46757l lVar : C46688i.this.f117781b) {
                if (lVar != null && lVar.f118087j.mo93871c()) {
                    return true;
                }
            }
            if (!C46688i.this.f117802w) {
                return false;
            }
            C46688i.this.f117802w = false;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo93648a(VideoPublishEditModel videoPublishEditModel) {
        this.f117805z = videoPublishEditModel;
        this.f117775G = ((Integer) C39630m.m88234a().mo58623u().mo74244f().mo74245a()).intValue();
        if (this.f117775G == 0) {
            this.f117775G = 30;
        }
        C46679c.m101291a().mo93624a((Context) this.f117780a);
        AssistLineView assistLineView = new AssistLineView(this.f117780a);
        assistLineView.setLayoutParams(new LayoutParams(-1, -1));
        this.f117793n = assistLineView;
        this.f117777I = new C46747d(this.f117780a);
        this.f117777I.mo93878a(this);
        this.f117778J = new C43576n();
        this.f117790k = new C46697b();
        this.f117773E = new SafeHandler(this.f117780a);
        this.f117800u = (StickerHintTextViewModel) C0214z.m440a((FragmentActivity) this.f117780a).mo359a(StickerHintTextViewModel.class);
        this.f117801v = (EditViewModel) C48927d.m105736a(this.f117780a).mo96760a(EditViewModel.class);
    }

    /* renamed from: a */
    public final void mo93651a(TextStickerInputLayout textStickerInputLayout) {
        this.f117792m = textStickerInputLayout;
        this.f117792m.setTextStickerUpdateListener(new C46698j(this));
        this.f117792m.setVisibleController(new C46736b() {
            /* renamed from: b */
            public final void mo93669b() {
                C46688i.this.f117792m.mo93844f();
            }

            /* renamed from: a */
            public final void mo93668a() {
                C46688i.this.mo93656b(C46688i.this.f117786g);
            }

            /* renamed from: c */
            public final boolean mo93670c() {
                return C46717e.m101398a((BaseShortVideoContext) C46688i.this.f117805z);
            }
        });
    }

    /* renamed from: a */
    public final void mo93650a(TextStickerData textStickerData, boolean z) {
        this.f117792m.setData(textStickerData);
        final C46757l lVar = new C46757l(this.f117780a, this.f117773E, textStickerData, this.f117797r);
        this.f117781b.add(0, lVar);
        lVar.setLayoutParams(new LayoutParams(-1, -1));
        this.f117782c.addView(lVar);
        if (this.f117784e != null) {
            this.f117784e.mo93687b(lVar);
        }
        this.f117786g = lVar;
        lVar.setOnEditClickListener(new C46761c() {
            /* renamed from: b */
            public final void mo93677b(C46757l lVar) {
                C46688i.this.mo93659c(lVar);
            }

            /* renamed from: a */
            public final Float mo93673a(float f) {
                if (C46688i.this.f117795p != null) {
                    return BorderLineView.m95792a(f);
                }
                return Float.valueOf(f);
            }

            /* renamed from: a */
            public final void mo93674a(C46757l lVar) {
                C46688i.this.mo93666i().mo93612a(true);
                C46688i.this.mo93660d();
                if (C46688i.this.f117796q != null) {
                    C46688i.this.f117796q.mo48682a(lVar);
                }
            }

            /* renamed from: a */
            public final void mo93676a(C46757l lVar, boolean z) {
                if (C46688i.this.f117780a instanceof VEVideoPublishEditActivity) {
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) C46688i.this.f117780a;
                    EditLyricStickerViewModel editLyricStickerViewModel = (EditLyricStickerViewModel) C48927d.m105736a(C46688i.this.f117780a).mo96760a(EditLyricStickerViewModel.class);
                    if (editLyricStickerViewModel.mo96879f().getValue() != null && ((Boolean) editLyricStickerViewModel.mo96879f().getValue()).booleanValue()) {
                        vEVideoPublishEditActivity.f109568w.mo97168O().f123748t.mo89535G();
                        return;
                    }
                }
                if (!z || C46688i.this.mo93657b()) {
                    if (C46688i.this.f117787h != null) {
                        C46688i.this.f117787h.mo93592a(false);
                        if (lVar != null) {
                            C46688i.this.mo93653a(lVar);
                        }
                    }
                    C46688i.this.mo93660d();
                } else if (System.currentTimeMillis() - C46688i.this.f117794o > 500) {
                    C46688i.this.f117801v.mo97032a(false);
                    C46688i.this.f117786g = lVar;
                    C46688i.this.mo93656b(lVar);
                    if (C46688i.this.f117784e != null) {
                        C46688i.this.f117784e.mo93688c(lVar);
                    }
                    C46688i.this.f117794o = System.currentTimeMillis();
                }
            }

            /* renamed from: a */
            public final int mo93671a(C46757l lVar, boolean z, boolean z2) {
                if (C46688i.this.f117795p == null) {
                    return -1;
                }
                if (z) {
                    C46688i.this.f117795p.mo88856a();
                } else if (lVar != null) {
                    return C46688i.this.f117795p.mo88854a(lVar.getAnglePointListForBlock(), z2, false);
                }
                return -1;
            }

            /* renamed from: a */
            public final PointF mo93672a(C46757l lVar, float f, float f2) {
                if (C46688i.this.f117795p == null || lVar == null) {
                    return new PointF(0.0f, 0.0f);
                }
                PointF[] anglePointList = lVar.getAnglePointList();
                int length = anglePointList.length;
                for (int i = 0; i < length; i++) {
                    PointF pointF = anglePointList[i];
                    pointF.x += f;
                    pointF.y += f2;
                }
                return C46688i.this.f117795p.mo88855a(anglePointList, f, f2, false);
            }

            /* renamed from: a */
            public final void mo93675a(C46757l lVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3, C43549b bVar) {
                final C46757l lVar2 = lVar;
                int i3 = i;
                int i4 = i2;
                boolean z4 = z;
                C43549b bVar2 = bVar;
                if (lVar2 != null) {
                    if (!z4) {
                        C46688i.this.mo93653a(lVar2);
                    }
                    if (z4) {
                        AssistLineView assistLineView = C46688i.this.f117793n;
                        assistLineView.f117872b.setVisibility(8);
                        assistLineView.f117871a.setVisibility(8);
                    }
                    boolean b = C43546a.m95606b(C46688i.this.f117804y, lVar.getAnglePointList());
                    if (!z2 && !z3) {
                        if (z4) {
                            lVar2.mo93890b(0.3137255f, false);
                        }
                        boolean a = C43546a.m95605a(C46688i.this.f117788i, lVar.getAnglePointList());
                        if (C46688i.this.f117785f != null) {
                            int a2 = C46688i.this.f117785f.mo93814a(i3, i4, z4, a);
                            C46688i iVar = C46688i.this;
                            if (a2 == 1) {
                                lVar2.mo93890b(0.3137255f, false);
                            } else if (a2 == 3) {
                                iVar.mo93659c(lVar2);
                                iVar.f117802w = true;
                            } else if (a2 == 4) {
                                lVar2.mo93890b(0.3137255f, true);
                            }
                        }
                    }
                    if (C46688i.this.f117785f != null) {
                        C46688i.this.f117785f.mo93816b(i3, i4, z4, b);
                        if (b) {
                            lVar2.setAlpha(0.3137255f);
                        } else {
                            lVar2.setAlpha(1.0f);
                        }
                    }
                    if (z4 && b && lVar2 != null && bVar2 != null) {
                        final float f = bVar2.f110203c;
                        final float f2 = bVar2.f110204d;
                        final float stickerRotate = bVar2.f110201a - lVar.getStickerRotate();
                        final float stickerScale = bVar2.f110202b / lVar.getStickerScale();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(300).setInterpolator(new C43500al(1.8f));
                        ValueAnimator valueAnimator = ofFloat;
                        final C46757l lVar3 = lVar;
                        C466911 r0 = new AnimatorUpdateListener() {

                            /* renamed from: a */
                            float f117809a;

                            /* renamed from: b */
                            float f117810b;

                            /* renamed from: c */
                            float f117811c;

                            /* renamed from: d */
                            float f117812d = 1.0f;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float f = (-((Float) valueAnimator.getAnimatedValue()).floatValue()) * f;
                                float f2 = (f2 * f) / f;
                                C46757l lVar = lVar3;
                                float f3 = f - this.f117809a;
                                float f4 = f2 - this.f117810b;
                                if (lVar.mo93891b()) {
                                    C46740c cVar = lVar.f118087j;
                                    if (cVar.f118041p != null) {
                                        float f5 = cVar.f118032g + f3;
                                        float f6 = cVar.f118033h + f4;
                                        RectF helpRect = cVar.f118041p.getHelpRect();
                                        C43454a.m95252a(helpRect, helpRect.centerX(), helpRect.centerY(), cVar.f118041p.getStickerRotate());
                                        C43454a.m95251a(helpRect, cVar.f118041p.getStickerScale());
                                        cVar.f118035j = 3;
                                        cVar.f118027b = f5 - cVar.f118032g;
                                        cVar.f118028c = f6 - cVar.f118033h;
                                        cVar.f118041p.setCenterX(cVar.f118041p.getCenterX() + cVar.f118027b);
                                        cVar.f118041p.setCenterY(cVar.f118041p.getCenterY() + cVar.f118028c);
                                        cVar.f118041p.invalidate();
                                        cVar.f118032g = f5;
                                        cVar.f118033h = f6;
                                    }
                                }
                                this.f117809a = f;
                                this.f117810b = f2;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * stickerRotate;
                                C46757l lVar2 = lVar3;
                                float f7 = -(floatValue - this.f117811c);
                                if (lVar2.mo93891b()) {
                                    lVar2.f118080c -= f7;
                                    if (lVar2.f118080c > 180.0f) {
                                        lVar2.f118080c -= 360.0f;
                                    }
                                    if (lVar2.f118080c < -180.0f) {
                                        lVar2.f118080c += 360.0f;
                                    }
                                    lVar2.invalidate();
                                }
                                this.f117811c = floatValue;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * stickerScale;
                                if (floatValue2 != 0.0f) {
                                    C46757l lVar3 = lVar3;
                                    float f8 = floatValue2 / this.f117812d;
                                    if (lVar3.mo93891b()) {
                                        lVar3.f118081d *= f8;
                                        lVar3.invalidate();
                                    }
                                    this.f117812d = floatValue2;
                                }
                            }
                        };
                        valueAnimator.addUpdateListener(r0);
                        valueAnimator.addListener(new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                lVar2.f118092o = null;
                            }
                        });
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.3137255f, 1.0f});
                        ofFloat2.setDuration(150).setInterpolator(new C43500al(1.8f));
                        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                lVar2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{valueAnimator, ofFloat2});
                        animatorSet.start();
                    }
                    if (C46688i.this.f117784e != null) {
                        C46688i.this.f117784e.mo93686a(lVar, i, i2, z, z2, z3);
                    }
                }
            }
        });
        int i = this.f117771C;
        int i2 = this.f117772D;
        lVar.f118084g = i;
        lVar.f118085h = i2;
        C46740c cVar = lVar.f118087j;
        cVar.f118037l = i;
        cVar.f118038m = i2;
        if (!(lVar.f118088k == null || lVar.f118088k.getEditCenterPoint() == null)) {
            lVar.setAnimXY(lVar.f118088k.getEditCenterPoint());
        }
        this.f117792m.mo93843e();
        if (VERSION.SDK_INT < 19) {
            lVar.setShowHelpBox(true);
        }
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && !z && this.f117800u != null) {
            lVar.postDelayed(new C46704p(this, lVar), 500);
        }
        if (textStickerData.getAutoSelect()) {
            lVar.post(new C46705q(lVar));
        }
    }

    /* renamed from: a */
    public final void mo93653a(C46757l lVar) {
        if (this.f117782c != null && lVar != null && this.f117795p != null) {
            if (this.f117803x != null) {
                this.f117803x.run();
            }
            if (this.f117770B != null) {
                this.f117770B.setHightLayerListenerToFirst(this.f117790k);
            }
            if (this.f117782c.getChildCount() > 1 && this.f117782c.getChildAt(this.f117782c.getChildCount() - 1) != lVar) {
                this.f117782c.removeView(lVar);
                this.f117782c.addView(lVar);
            }
            if (this.f117781b.size() > 1 && ((C46757l) this.f117781b.get(0)) != lVar) {
                this.f117781b.remove(lVar);
                this.f117781b.add(0, lVar);
            }
            if (this.f117781b.size() > 0) {
                C46757l lVar2 = (C46757l) this.f117781b.get(0);
                if (this.f117769A != null) {
                    this.f117769A.mo48681a(lVar2, lVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93647a(C20347c cVar) {
        if (cVar != null && this.f117774F == null) {
            VESize b = cVar.mo43037b();
            if (b.width != 0 && b.height != 0) {
                this.f117774F = cVar;
                int[] a = C43503ao.m95364a(this.f117782c, b.width, b.height);
                this.f117771C = a[0];
                this.f117772D = a[1];
                m101324k();
            }
        }
    }

    /* renamed from: a */
    public final void mo93655a(boolean z) {
        this.f117789j = z;
        if (this.f117781b != null && this.f117781b.size() > 0) {
            for (C46757l enableEdit : this.f117781b) {
                enableEdit.setEnableEdit(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo93645a(long j) {
        for (C46757l lVar : this.f117781b) {
            lVar.setPlayPosition(j);
            lVar.mo93896d();
        }
    }

    /* renamed from: a */
    public final void mo93654a(String str, String str2, boolean z, boolean z2) {
        TextStickerInputLayout textStickerInputLayout = this.f117792m;
        textStickerInputLayout.f117941m = str;
        textStickerInputLayout.f117942n = str2;
        textStickerInputLayout.f117943o = z;
        textStickerInputLayout.f117944p = z2;
    }

    /* renamed from: a */
    public final boolean mo88639a(RectF rectF) {
        if (C9414h.m18630a(this.f117781b)) {
            return false;
        }
        for (C46757l anglePointList : this.f117781b) {
            RectF a = C43546a.m95604a(anglePointList.getAnglePointList());
            if (a.top >= rectF.top) {
                if (a.bottom > rectF.bottom) {
                }
            }
            return true;
        }
        return false;
    }

    public final void dismiss() {
        if (this.f117792m != null) {
            this.f117792m.dismiss(false);
        }
    }

    /* renamed from: g */
    public final void mo93664g() {
        if (this.f117785f != null) {
            this.f117785f.cp_();
        }
    }

    /* renamed from: h */
    public final boolean mo93665h() {
        if (this.f117781b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final List<C46757l> mo93667j() {
        if (this.f117781b == null) {
            this.f117781b = new ArrayList();
        }
        return this.f117781b;
    }

    /* renamed from: b */
    public final boolean mo93657b() {
        return ((TextStickerViewState) mo93666i().mo97464a(this.f117780a)).getInTimeEditView();
    }

    /* renamed from: e */
    public final void mo93662e() {
        if (this.f117770B != null) {
            this.f117785f = this.f117770B.getDeleteView();
        }
        this.f117785f.mo93815a();
    }

    /* renamed from: i */
    public final TextStickerViewModel mo93666i() {
        if (this.f117779K == null) {
            this.f117779K = (TextStickerViewModel) C48927d.m105736a(this.f117780a).mo96760a(TextStickerViewModel.class);
        }
        return this.f117779K;
    }

    /* renamed from: k */
    private void m101324k() {
        ViewGroup.LayoutParams layoutParams = this.f117782c.getLayoutParams();
        this.f117788i = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.f117795p != null) {
            this.f117782c.removeView(this.f117795p);
        }
        this.f117795p = BorderLineView.m95791a(this.f117780a, layoutParams.width, layoutParams.height, this.f117771C, this.f117772D);
        this.f117782c.addView(this.f117795p);
    }

    /* renamed from: l */
    private int m101325l() {
        if (this.f117781b == null || this.f117781b.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f117781b.size(); i2++) {
            TextStickerTextWrap textWrap = ((C46757l) this.f117781b.get(i2)).getTextWrap();
            if (textWrap != null) {
                i += ((List) textWrap.getStrPair().getSecond()).size();
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo93658c() {
        if (this.f117774F != null) {
            VESize b = this.f117774F.mo43037b();
            if (b.width != 0 && b.height != 0) {
                int[] a = C43503ao.m95364a(this.f117782c, b.width, b.height);
                this.f117771C = a[0];
                this.f117772D = a[1];
                m101324k();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo93660d() {
        if (this.f117800u != null) {
            this.f117800u.mo90441a().postValue(Boolean.valueOf(true));
        }
        if (this.f117781b == null || this.f117781b.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C46757l lVar : this.f117781b) {
            if (lVar.mo93888a()) {
                lVar.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final void mo93663f() {
        Iterator it = this.f117781b.iterator();
        while (it.hasNext()) {
            C46757l lVar = (C46757l) it.next();
            this.f117782c.removeView(lVar);
            it.remove();
            if (this.f117784e != null) {
                this.f117784e.mo93685a(lVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo93643a() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities) && this.f117800u != null) {
            this.f117800u.mo90441a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo93646a(Rect rect) {
        this.f117804y = rect;
    }

    /* renamed from: a */
    public final void mo93652a(C46745a aVar) {
        this.f117792m.setTextStickerInputMobListener(aVar);
    }

    /* renamed from: a */
    public final void mo93649a(C46670b bVar) {
        this.f117799t = bVar;
        this.f117792m.setStoryEditViewShowListener(new C46670b() {
            /* renamed from: a */
            public final void mo93593a() {
                if (C46688i.this.f117799t != null) {
                    C46688i.this.f117799t.mo93593a();
                }
            }

            public final void dismiss() {
                if (C46688i.this.f117786g != null) {
                    C46757l lVar = C46688i.this.f117786g;
                    C46739b bVar = lVar.f118086i;
                    bVar.f118019h = true;
                    bVar.f118018g = false;
                    bVar.f118012a = (-bVar.f118023l) / ((float) bVar.f118024m);
                    bVar.f118013b = (-bVar.f118022k) / ((float) bVar.f118024m);
                    bVar.f118014c = (-(bVar.f118020i - bVar.f118016e)) / ((float) bVar.f118024m);
                    bVar.f118015d = (-(bVar.f118021j - bVar.f118017f)) / ((float) bVar.f118024m);
                    bVar.f118025n.invalidate();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lVar, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(300);
                    ofFloat.start();
                }
            }
        });
    }

    /* renamed from: a */
    private static float m101321a(float f) {
        return new BigDecimal((double) f).setScale(4, 1).floatValue();
    }

    /* renamed from: c */
    public final void mo73972c(int i) {
        if (!this.f117792m.f117935g) {
            TextStickerInputLayout textStickerInputLayout = this.f117792m;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textStickerInputLayout.f117937i.getLayoutParams();
            layoutParams.bottomMargin += i;
            textStickerInputLayout.f117937i.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private PointF m101322a(PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF();
        if (this.f117774F == null) {
            i2 = C43303dy.m94971b(this.f117780a);
            i = C43303dy.m94967a((Context) this.f117780a);
        } else {
            i2 = this.f117774F.mo43037b().width;
            i = this.f117774F.mo43037b().height;
        }
        pointF2.set(m101321a((pointF.x * 1.0f) / ((float) i2)), m101321a((pointF.y * 1.0f) / ((float) i)));
        return pointF2;
    }

    /* renamed from: b */
    public final void mo93656b(C46757l lVar) {
        this.f117776H = true;
        if (lVar == null) {
            int l = m101325l();
            this.f117792m.mo93837a(C46717e.m101394a(""), 0, -1, 0, "", true, 28, l);
            this.f117786g = null;
            return;
        }
        this.f117792m.mo93837a(lVar.getTextWrap(), lVar.getCurMode(), lVar.getCurColor(), lVar.getCurAlignTxt(), lVar.getCurFontType(), false, lVar.getData().getFontSize(), m101325l());
    }

    /* renamed from: c */
    public final void mo93659c(C46757l lVar) {
        this.f117782c.removeView(lVar);
        this.f117781b.remove(lVar);
        if (this.f117784e != null) {
            this.f117784e.mo93685a(lVar);
        }
    }

    /* renamed from: b */
    public final void mo73971b(int i) {
        if (this.f117776H) {
            this.f117792m.dismiss(true);
            TextStickerTextWrap textWrap = this.f117792m.getTextWrap();
            if (textWrap.isValid()) {
                if (textWrap.getStrMap().size() != 0) {
                    if (this.f117786g != null) {
                        this.f117786g.setText(textWrap);
                        this.f117786g.mo93887a(this.f117792m.getCurTxtMode(), this.f117792m.getCurColor(), this.f117792m.getAlignTxt(), C46679c.m101291a().f117756d);
                        if (C46679c.m101291a().mo93637e() > 0) {
                            this.f117786g.setFontSize(C46679c.m101291a().mo93637e());
                        } else {
                            this.f117786g.setFontSize(28);
                        }
                    } else if (this.f117781b.size() >= this.f117775G) {
                        C10691a.m21543b(this.f117792m.getContext(), (int) R.string.bre, 0).mo19066a();
                    } else {
                        TextStickerData textStickerData = new TextStickerData("", this.f117792m.getCurTxtMode(), this.f117792m.getCurColor(), this.f117792m.getAlignTxt(), C46679c.m101291a().f117756d);
                        textStickerData.setEditCenterPoint(this.f117792m.getEditInputCenterPoint());
                        textStickerData.setTextWrap(textWrap);
                        if (C46679c.m101291a().mo93637e() > 0) {
                            textStickerData.setFontSize(C46679c.m101291a().mo93637e());
                        }
                        mo93650a(textStickerData, false);
                    }
                }
            } else if (this.f117786g != null) {
                this.f117782c.removeView(this.f117786g);
                this.f117781b.remove(this.f117786g);
            }
            this.f117776H = false;
            if (this.f117799t != null) {
                this.f117799t.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final List<InteractStickerStruct> mo93642a(List<StickerItemModel> list) {
        ArrayList arrayList = new ArrayList(this.f117781b.size());
        ArrayList arrayList2 = new ArrayList(this.f117781b);
        Collections.sort(arrayList2, new Comparator<C46757l>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((C46757l) obj).f118093p - ((C46757l) obj2).f118093p;
            }
        });
        for (int i = 0; i < arrayList2.size(); i++) {
            C46757l lVar = (C46757l) arrayList2.get(i);
            TextStickerTextWrap textWrap = lVar.getTextWrap();
            if (textWrap != null && !((List) textWrap.getStrPair().getSecond()).isEmpty()) {
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                interactStickerStruct.setType(5);
                LinkedList linkedList = new LinkedList();
                NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                normalTrackTimeStamp.setRotation(m101321a(lVar.getStickerRotate()));
                normalTrackTimeStamp.setScale(Float.valueOf(lVar.getStickerScale()));
                PointF a = m101322a(new PointF(lVar.getCenterX(), lVar.getCenterY()));
                normalTrackTimeStamp.setX(a.x);
                normalTrackTimeStamp.setY(a.y);
                PointF a2 = m101322a(new PointF((float) lVar.getContentViewWidth(), (float) lVar.getContentViewHeight()));
                normalTrackTimeStamp.setWidth(a2.x);
                normalTrackTimeStamp.setHeight(a2.y);
                normalTrackTimeStamp.setStartTime((float) lVar.mo52063a(-1));
                normalTrackTimeStamp.setEndTime((float) lVar.mo52069b(-1));
                linkedList.add(normalTrackTimeStamp);
                C43568f.m95713a(interactStickerStruct, linkedList);
                try {
                    interactStickerStruct.setTextStruct(C39629l.m88232a().mo58566D().mo34889b(new TextStruct(textWrap.getAnchorInfoList())));
                } catch (Exception e) {
                    C50203g.m108359a((Throwable) e);
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (((StickerItemModel) list.get(i2)).viewHash == lVar.hashCode()) {
                        interactStickerStruct.setIndex(((StickerItemModel) list.get(i2)).layerWeight);
                        HashMap hashMap = new HashMap();
                        hashMap.put("text_sticker_id", ((StickerItemModel) list.get(i2)).stickerId);
                        interactStickerStruct.setAttr(C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(hashMap));
                        break;
                    } else {
                        i2++;
                    }
                }
                arrayList.add(interactStickerStruct);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo73970a(int i) {
        if (this.f117776H) {
            if (this.f117786g != null) {
                C46757l lVar = this.f117786g;
                C46739b bVar = lVar.f118086i;
                float f = lVar.f118078a;
                float f2 = lVar.f118079b;
                float f3 = lVar.f118081d;
                float f4 = lVar.f118080c;
                bVar.f118018g = true;
                bVar.f118019h = false;
                bVar.f118020i = f;
                bVar.f118021j = f2;
                bVar.f118022k = f4;
                bVar.f118023l = f3;
                bVar.f118012a = bVar.f118023l / ((float) bVar.f118024m);
                bVar.f118013b = bVar.f118022k / ((float) bVar.f118024m);
                bVar.f118014c = (f - bVar.f118016e) / ((float) bVar.f118024m);
                bVar.f118015d = (f2 - bVar.f118017f) / ((float) bVar.f118024m);
                bVar.f118025n.invalidate();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lVar, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(250);
                ofFloat.start();
            }
            TextStickerInputLayout textStickerInputLayout = this.f117792m;
            if (textStickerInputLayout != null) {
                textStickerInputLayout.setVisibility(0);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textStickerInputLayout, "alpha", new float[]{0.0f, 1.0f});
                ofFloat2.setDuration(300);
                ofFloat2.addListener(new AnimatorListenerAdapter(textStickerInputLayout, null) {

                    /* renamed from: a */
                    final /* synthetic */ View f117704a;

                    /* renamed from: b */
                    final /* synthetic */ AnimatorListener f117705b;

                    public final void onAnimationEnd(Animator animator) {
                        this.f117704a.setVisibility(0);
                        if (this.f117705b != null) {
                            this.f117705b.onAnimationEnd(animator);
                        }
                        super.onAnimationEnd(animator);
                    }

                    {
                        this.f117704a = r1;
                        this.f117705b = r2;
                    }
                });
                ofFloat2.start();
            }
            if (textStickerInputLayout.f117936h != null) {
                textStickerInputLayout.f117936h.mo93593a();
            }
            if (C23715d.m58202a((Collection<T>) C46679c.m101291a().mo93629b())) {
                C10691a.m21542b(textStickerInputLayout.getContext(), (int) R.string.g1s).mo19066a();
            }
            TextStickerInputLayout textStickerInputLayout2 = this.f117792m;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textStickerInputLayout2.f117937i.getLayoutParams();
            layoutParams.bottomMargin = i;
            textStickerInputLayout2.f117937i.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo93644a(float f, boolean z) {
        if (this.f117781b.size() != 0) {
            for (C46757l b : this.f117781b) {
                b.mo93890b(f, z);
            }
        }
    }

    /* renamed from: a */
    public static JSONArray m101323a(VideoPublishEditModel videoPublishEditModel, C17410f<StickerItemModel, Boolean> fVar, C17410f<StickerItemModel, String> fVar2) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        if (videoPublishEditModel.hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                if (((Boolean) fVar.mo33734a(stickerItemModel)).booleanValue()) {
                    arrayList.add(stickerItemModel);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return jSONArray;
        }
        Collections.sort(arrayList, C46703o.f117831a);
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(fVar2.mo33734a(arrayList.get(i)));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final C0013i<List<TextStickerCompileResult>> mo93641a(String str, int i, int i2, int i3, int i4) {
        mo93660d();
        ArrayList arrayList = new ArrayList();
        for (C46757l lVar : this.f117781b) {
            arrayList.add(this.f117778J.mo88765a(lVar, this.f117782c, str, i, i2, i3, i4).mo29c(new C46706r(lVar)));
        }
        return C0013i.m15a((Collection<? extends C0013i<TResult>>) arrayList);
    }
}
