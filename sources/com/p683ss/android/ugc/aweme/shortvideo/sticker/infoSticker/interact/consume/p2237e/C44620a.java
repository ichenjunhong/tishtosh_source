package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2237e;

import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44600a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44621a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a */
public final class C44620a implements OnTouchListener, C9382a {

    /* renamed from: a */
    public int f112881a;

    /* renamed from: b */
    public float f112882b;

    /* renamed from: c */
    public float f112883c;

    /* renamed from: d */
    public int f112884d;

    /* renamed from: e */
    public int f112885e;

    /* renamed from: f */
    public int f112886f = (this.f112885e * this.f112885e);

    /* renamed from: g */
    public int f112887g = (this.f112884d * this.f112884d);

    /* renamed from: h */
    public boolean f112888h;

    /* renamed from: i */
    public boolean f112889i;

    /* renamed from: j */
    public boolean f112890j;

    /* renamed from: k */
    public MotionEvent f112891k;

    /* renamed from: l */
    public MotionEvent f112892l;

    /* renamed from: m */
    public int f112893m = -1;

    /* renamed from: n */
    public C9381g f112894n = new C9381g(this);

    /* renamed from: o */
    public final Activity f112895o;

    /* renamed from: p */
    public List<C44600a> f112896p;

    /* renamed from: q */
    public C46063m f112897q;

    /* renamed from: r */
    public C44626f f112898r;

    /* renamed from: s */
    public final C44621a f112899s;

    /* renamed from: a */
    public final void mo90569a(List<C44600a> list) {
        C52711k.m112240b(list, "interactStickers");
        this.f112896p = list;
    }

    public final void handleMsg(Message message) {
        Integer num;
        long j;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.f112881a;
        if (num != null && num.intValue() == i) {
            C44621a aVar = this.f112899s;
            C44626f fVar = this.f112898r;
            if (fVar != null) {
                j = fVar.mo60220ak();
            } else {
                j = 0;
            }
            Object obj = message.obj;
            if (obj != null) {
                aVar.mo90572a(j, (MotionEvent) obj);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.MotionEvent");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r12 = 0
            if (r13 == 0) goto L_0x000c
            int r0 = r13.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x000d
        L_0x000c:
            r0 = r12
        L_0x000d:
            r1 = 0
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0015
            goto L_0x009f
        L_0x0015:
            int r5 = r0.intValue()
            if (r5 != 0) goto L_0x009f
            com.bytedance.common.utility.b.g r12 = r11.f112894n
            if (r12 == 0) goto L_0x0030
            int r0 = r11.f112881a
            boolean r12 = r12.hasMessages(r0)
            if (r12 != r3) goto L_0x0030
            com.bytedance.common.utility.b.g r12 = r11.f112894n
            if (r12 == 0) goto L_0x0030
            int r0 = r11.f112881a
            r12.removeMessages(r0)
        L_0x0030:
            android.view.MotionEvent r12 = r11.f112891k
            if (r12 == 0) goto L_0x0037
            r12.recycle()
        L_0x0037:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r13)
            r11.f112891k = r12
            r11.f112889i = r3
            r11.f112888h = r3
            float r12 = r13.getX()
            r11.f112882b = r12
            float r12 = r13.getY()
            r11.f112883c = r12
            r12 = -1
            r11.f112893m = r12
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a> r12 = r11.f112896p
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0058:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r12.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a r0 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44600a) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r5 = r0.f112827d
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f r6 = r11.f112898r
            if (r6 == 0) goto L_0x006f
            long r6 = r6.mo60220ak()
            goto L_0x0070
        L_0x006f:
            r6 = r1
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r8 = r0.f112827d
            int r8 = r8.mo90484a()
            float r9 = r13.getX()
            float r10 = r13.getY()
            boolean r5 = r5.mo90487a(r6, r8, r9, r10)
            if (r5 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r12 = r0.f112827d
            int r12 = r12.mo90484a()
            r11.f112893m = r12
            com.ss.android.ugc.aweme.sticker.m r12 = r11.f112897q
            if (r12 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.sticker.f.b r12 = r12.f116228m
            if (r12 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r0 = r0.f112827d
            int r0 = r0.mo90484a()
            r12.mo60271a(r0, r13)
        L_0x009d:
            return r3
        L_0x009e:
            return r4
        L_0x009f:
            if (r0 != 0) goto L_0x00a2
            goto L_0x00dd
        L_0x00a2:
            int r5 = r0.intValue()
            r6 = 2
            if (r5 != r6) goto L_0x00dd
            float r12 = r13.getX()
            float r0 = r11.f112882b
            float r12 = r12 - r0
            int r12 = (int) r12
            float r13 = r13.getY()
            float r0 = r11.f112883c
            float r13 = r13 - r0
            int r13 = (int) r13
            int r0 = r12 * r12
            int r13 = r13 * r13
            int r0 = r0 + r13
            int r13 = r11.f112886f
            if (r0 > r13) goto L_0x00ca
            int r12 = java.lang.Math.abs(r12)
            int r13 = r11.f112885e
            if (r12 < r13) goto L_0x00d5
        L_0x00ca:
            r11.f112889i = r4
            com.bytedance.common.utility.b.g r12 = r11.f112894n
            if (r12 == 0) goto L_0x00d5
            int r13 = r11.f112881a
            r12.removeMessages(r13)
        L_0x00d5:
            int r12 = r11.f112887g
            if (r0 <= r12) goto L_0x0198
            r11.f112888h = r4
            goto L_0x0198
        L_0x00dd:
            if (r0 != 0) goto L_0x00e1
            goto L_0x0198
        L_0x00e1:
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x0198
            boolean r0 = r11.f112889i
            if (r0 == 0) goto L_0x0197
            r11.f112890j = r4
            android.view.MotionEvent r0 = r11.f112891k
            android.view.MotionEvent r5 = r11.f112892l
            if (r0 == 0) goto L_0x0136
            if (r5 == 0) goto L_0x0136
            if (r13 != 0) goto L_0x00f8
            goto L_0x0136
        L_0x00f8:
            boolean r6 = r11.f112888h
            if (r6 == 0) goto L_0x0136
            long r6 = r13.getEventTime()
            long r8 = r5.getEventTime()
            long r6 = r6 - r8
            int r5 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r8 = (long) r5
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0136
            r8 = 40
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0115
            goto L_0x0136
        L_0x0115:
            float r5 = r0.getX()
            int r5 = (int) r5
            float r6 = r13.getX()
            int r6 = (int) r6
            int r5 = r5 - r6
            float r0 = r0.getY()
            int r0 = (int) r0
            float r6 = r13.getY()
            int r6 = (int) r6
            int r0 = r0 - r6
            int r5 = r5 * r5
            int r0 = r0 * r0
            int r5 = r5 + r0
            int r0 = r11.f112887g
            if (r5 >= r0) goto L_0x0136
            r0 = 1
            goto L_0x0137
        L_0x0136:
            r0 = 0
        L_0x0137:
            if (r0 == 0) goto L_0x014e
            r11.f112890j = r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a r0 = r11.f112899s
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f r3 = r11.f112898r
            if (r3 == 0) goto L_0x0146
            long r5 = r3.mo60220ak()
            goto L_0x0147
        L_0x0146:
            r5 = r1
        L_0x0147:
            int r3 = r11.f112893m
            android.view.MotionEvent r7 = r11.f112891k
            r0.mo90571a(r5, r3, r7)
        L_0x014e:
            boolean r0 = r11.f112890j
            if (r0 != 0) goto L_0x018a
            android.view.MotionEvent r0 = r11.f112891k
            if (r0 == 0) goto L_0x015c
            if (r13 != 0) goto L_0x0159
            goto L_0x015c
        L_0x0159:
            boolean r0 = r11.f112889i
            goto L_0x015d
        L_0x015c:
            r0 = 0
        L_0x015d:
            if (r0 == 0) goto L_0x018a
            com.bytedance.common.utility.b.g r0 = r11.f112894n
            if (r0 == 0) goto L_0x0169
            int r12 = r11.f112881a
            android.os.Message r12 = r0.obtainMessage(r12)
        L_0x0169:
            if (r12 == 0) goto L_0x016f
            android.view.MotionEvent r0 = r11.f112891k
            r12.obj = r0
        L_0x016f:
            com.bytedance.common.utility.b.g r0 = r11.f112894n
            if (r0 == 0) goto L_0x018a
            int r3 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r5 = (long) r3
            long r7 = r13.getEventTime()
            long r5 = r5 - r7
            android.view.MotionEvent r3 = r11.f112891k
            if (r3 == 0) goto L_0x0185
            long r1 = r3.getEventTime()
        L_0x0185:
            r3 = 0
            long r5 = r5 + r1
            r0.sendMessageDelayed(r12, r5)
        L_0x018a:
            android.view.MotionEvent r12 = r11.f112892l
            if (r12 == 0) goto L_0x0191
            r12.recycle()
        L_0x0191:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r13)
            r11.f112892l = r12
        L_0x0197:
            return r4
        L_0x0198:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2237e.C44620a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C44620a(Activity activity, List<C44600a> list, C46063m mVar, C44626f fVar, C44621a aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(list, "interactStickers");
        C52711k.m112240b(aVar, "clickHandle");
        this.f112895o = activity;
        this.f112896p = list;
        this.f112897q = mVar;
        this.f112898r = fVar;
        this.f112899s = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f112895o);
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(activity)");
        this.f112884d = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(this.f112895o);
        C52711k.m112236a((Object) viewConfiguration2, "ViewConfiguration.get(activity)");
        this.f112885e = viewConfiguration2.getScaledTouchSlop() * 3;
    }
}
