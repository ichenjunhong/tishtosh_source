package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.emoji.views.C29490b;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.e */
public final class C29326e {

    /* renamed from: a */
    public float f76747a;

    /* renamed from: b */
    public long f76748b;

    /* renamed from: c */
    public long f76749c;

    /* renamed from: d */
    public boolean f76750d = true;

    /* renamed from: e */
    public long f76751e;

    /* renamed from: f */
    public int f76752f = -1;

    /* renamed from: g */
    public final Handler f76753g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final int f76754h = 500;

    /* renamed from: i */
    public float f76755i;

    /* renamed from: j */
    public float f76756j;

    /* renamed from: k */
    C29490b f76757k;

    /* renamed from: l */
    private final int f76758l = 9;

    /* renamed from: m */
    private final int f76759m = 120;

    /* renamed from: n */
    private final int f76760n = 56;

    /* renamed from: o */
    private final int f76761o = 27;

    /* renamed from: p */
    private final float f76762p = 0.32f;

    /* renamed from: q */
    private final float f76763q = 1.42f;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.e$a */
    public static final class C29327a implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C29326e f76764a;

        /* renamed from: b */
        final /* synthetic */ List f76765b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f76766c;

        /* renamed from: d */
        final /* synthetic */ List f76767d;

        /* renamed from: e */
        final /* synthetic */ SwipeControlledViewPager f76768e;

        public C29327a(C29326e eVar, List list, RecyclerView recyclerView, List list2, SwipeControlledViewPager swipeControlledViewPager) {
            this.f76764a = eVar;
            this.f76765b = list;
            this.f76766c = recyclerView;
            this.f76767d = list2;
            this.f76768e = swipeControlledViewPager;
        }

        public final boolean onTouch(final View view, MotionEvent motionEvent) {
            C52711k.m112240b(view, "v");
            C52711k.m112240b(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f76764a.f76749c = System.currentTimeMillis();
                    this.f76764a.f76748b = 0;
                    this.f76764a.f76751e = System.currentTimeMillis();
                    this.f76764a.f76747a = motionEvent.getX();
                    this.f76765b.clear();
                    this.f76764a.f76755i = motionEvent.getX();
                    this.f76764a.f76756j = motionEvent.getY();
                    for (int i = 0; i < this.f76766c.getChildCount(); i++) {
                        List list = this.f76765b;
                        View childAt = this.f76766c.getChildAt(i);
                        C52711k.m112236a((Object) childAt, "viewGroup.getChildAt(i)");
                        list.add(childAt);
                    }
                    this.f76764a.f76753g.removeCallbacksAndMessages(null);
                    this.f76764a.f76753g.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C29327a f76769a;

                        {
                            this.f76769a = r1;
                        }

                        public final void run() {
                            this.f76769a.f76764a.mo59269a(this.f76769a.f76764a.f76755i, this.f76769a.f76764a.f76756j, this.f76769a.f76765b, this.f76769a.f76767d, view, this.f76769a.f76768e);
                        }
                    }, (long) this.f76764a.f76754h);
                    break;
                case 1:
                case 3:
                    this.f76764a.f76753g.removeCallbacksAndMessages(null);
                    C29326e eVar = this.f76764a;
                    if (eVar.f76757k != null) {
                        C29490b bVar = eVar.f76757k;
                        if (bVar == null) {
                            C52711k.m112234a();
                        }
                        if (bVar.isShowing()) {
                            C29490b bVar2 = eVar.f76757k;
                            if (bVar2 == null) {
                                C52711k.m112234a();
                            }
                            bVar2.dismiss();
                        }
                    }
                    if (this.f76764a.f76752f >= 0) {
                        View findViewById = ((View) this.f76765b.get(this.f76764a.f76752f)).findViewById(R.id.a_s);
                        if (findViewById != null) {
                            findViewById.setBackground(new ColorDrawable(0));
                        }
                    }
                    this.f76764a.f76752f = -1;
                    this.f76764a.f76750d = true;
                    this.f76768e.setSwipeEnabled(true);
                    this.f76764a.f76751e = 0;
                    this.f76764a.f76748b = System.currentTimeMillis() - this.f76764a.f76749c;
                    break;
                case 2:
                    this.f76764a.mo59269a(motionEvent.getX(), motionEvent.getY(), this.f76765b, this.f76767d, view, this.f76768e);
                    break;
            }
            if (this.f76764a.f76748b >= ((long) this.f76764a.f76754h)) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m69135a(int r17, com.p683ss.android.ugc.aweme.base.model.UrlModel r18, android.view.View r19, android.content.Context r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "urlModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            java.lang.String r5 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            int r5 = r0.f76752f
            if (r5 == r1) goto L_0x0146
            if (r3 != 0) goto L_0x001c
            goto L_0x0146
        L_0x001c:
            r5 = 2131952903(0x7f130507, float:1.9542262E38)
            r3.setBackgroundResource(r5)
            r0.f76752f = r1
            int r5 = com.bytedance.common.utility.C9432q.m18670a(r20)
            float r5 = (float) r5
            float r6 = r0.f76762p
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r0.f76758l
            int r6 = r6 * r5
            int r7 = r0.f76759m
            int r6 = r6 / r7
            int r7 = r0.f76760n
            int r7 = r7 * r6
            int r8 = r0.f76761o
            int r7 = r7 / r8
            float r8 = (float) r5
            float r9 = (float) r6
            float r10 = r0.f76763q
            float r9 = r9 * r10
            int r10 = r0.f76758l
            float r10 = (float) r10
            float r9 = r9 / r10
            float r8 = r8 - r9
            int r8 = (int) r8
            int r9 = r8 + r6
            int r1 = r1 % 4
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r20)
            r11 = 2132214524(0x7f1702fc, float:2.0072892E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r12)
            android.view.WindowManager$LayoutParams r11 = new android.view.WindowManager$LayoutParams
            r11.<init>()
            r11.width = r5
            r11.height = r9
            java.lang.String r12 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r12)
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r10.setLayoutParams(r11)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76757k
            if (r11 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76757k
            if (r11 != 0) goto L_0x0076
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0076:
            boolean r11 = r11.isShowing()
            if (r11 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76757k
            if (r11 != 0) goto L_0x0083
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0083:
            r11.dismiss()
            goto L_0x008e
        L_0x0087:
            com.ss.android.ugc.aweme.emoji.views.b r11 = new com.ss.android.ugc.aweme.emoji.views.b
            r11.<init>()
            r0.f76757k = r11
        L_0x008e:
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76757k
            if (r11 != 0) goto L_0x0095
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0095:
            r11.mo59596a(r10, r4)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76757k
            if (r11 != 0) goto L_0x009f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x009f:
            r12 = 0
            r11.f77235a = r12
            int r11 = r5 - r7
            int r13 = r11 / 2
            r14 = 2
            if (r1 != 0) goto L_0x00b2
            int r1 = r19.getWidth()
            int r1 = r1 - r7
            int r13 = r1 / 2
        L_0x00b0:
            r1 = 0
            goto L_0x00d3
        L_0x00b2:
            r15 = 1
            if (r1 == r15) goto L_0x00cb
            if (r1 != r14) goto L_0x00b8
            goto L_0x00cb
        L_0x00b8:
            r15 = 3
            if (r1 != r15) goto L_0x00b0
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r13 = r19.getWidth()
            int r13 = r13 - r7
            int r13 = r13 / r14
            int r13 = r11 - r13
            goto L_0x00d3
        L_0x00cb:
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r1 = r1 / r14
        L_0x00d3:
            r11 = 2132020090(0x7f140b7a, float:1.9678533E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r14 = "rootView.findViewById(R.id.iv_image)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r14)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r11
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            r14.width = r5
            r14.height = r5
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = com.bytedance.common.utility.C9432q.m18687b(r4, r15)
            int r15 = (int) r15
            r11.setPadding(r15, r15, r15, r15)
            r11.setLayoutParams(r14)
            r14 = 2132020252(0x7f140c1c, float:1.9678862E38)
            android.view.View r10 = r10.findViewById(r14)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r14 = "arrowView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r14)
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            if (r14 == 0) goto L_0x013e
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            r14.width = r7
            r14.height = r6
            r14.setMargins(r13, r8, r12, r12)
            android.view.ViewGroup$LayoutParams r14 = (android.view.ViewGroup.LayoutParams) r14
            r10.setLayoutParams(r14)
            com.ss.android.ugc.aweme.emoji.views.b r6 = r0.f76757k
            if (r6 != 0) goto L_0x011f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x011f:
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r7)
            float r4 = -r4
            int r4 = (int) r4
            r6.mo59595a(r3, r1, r4)
            if (r21 == 0) goto L_0x0130
            com.p683ss.android.ugc.aweme.emoji.utils.C29478h.m69558a(r11, r2)
            goto L_0x0133
        L_0x0130:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r11, r2)
        L_0x0133:
            com.ss.android.ugc.aweme.emoji.views.b r1 = r0.f76757k
            if (r1 != 0) goto L_0x013a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x013a:
            r1.update(r5, r9)
            return
        L_0x013e:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r2)
            throw r1
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29326e.m69135a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public final void mo59269a(float f, float f2, List<? extends View> list, List<? extends C29285a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view2 = (View) it.next();
            if (f <= ((float) view2.getLeft()) || f >= ((float) view2.getRight()) || f2 >= ((float) view2.getBottom()) || f2 <= ((float) view2.getTop())) {
                i++;
            } else {
                if (this.f76752f != i && System.currentTimeMillis() - this.f76751e > ((long) this.f76754h) && Math.abs(f - this.f76747a) < 20.0f) {
                    this.f76750d = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f76753g.removeCallbacksAndMessages(null);
                }
                if (this.f76752f >= 0 && i != this.f76752f) {
                    View findViewById = ((View) list.get(this.f76752f)).findViewById(R.id.a_s);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                if (!this.f76750d && i < list2.size()) {
                    View findViewById2 = ((View) list.get(i)).findViewById(R.id.a_s);
                    C29285a aVar = (C29285a) list2.get(i);
                    if (aVar.mo59210a()) {
                        int i2 = aVar.f76665a;
                        if (i2 == R.drawable.xz || i2 == R.drawable.y7) {
                            z = true;
                        }
                        if (!z && findViewById2 != null) {
                            C29366a aVar2 = aVar.f76668d;
                            C52711k.m112236a((Object) aVar2, "emoji.detailEmoji");
                            if (aVar2.getStickerType() == 1) {
                                StringBuilder sb = new StringBuilder("file://");
                                sb.append(C29473c.m69544b(aVar.f76668d));
                                String sb2 = sb.toString();
                                C29366a aVar3 = aVar.f76668d;
                                C52711k.m112236a((Object) aVar3, "emoji.detailEmoji");
                                UrlModel animateUrl = aVar3.getAnimateUrl();
                                if (new File(sb2).exists()) {
                                    animateUrl = new UrlModel();
                                    animateUrl.setUri(sb2);
                                    animateUrl.setUrlList(C52575l.m112092a(sb2));
                                }
                                C52711k.m112236a((Object) animateUrl, "urlModel");
                                Context context = view.getContext();
                                C52711k.m112236a((Object) context, "v.context");
                                C29366a aVar4 = aVar.f76668d;
                                C52711k.m112236a((Object) aVar4, "emoji.detailEmoji");
                                m69135a(i, animateUrl, findViewById2, context, C29298a.m69089c(aVar4));
                            } else {
                                C29366a aVar5 = aVar.f76668d;
                                C52711k.m112236a((Object) aVar5, "emoji.detailEmoji");
                                UrlModel animateUrl2 = aVar5.getAnimateUrl();
                                C52711k.m112236a((Object) animateUrl2, "emoji.detailEmoji.animateUrl");
                                Context context2 = view.getContext();
                                C52711k.m112236a((Object) context2, "v.context");
                                C29366a aVar6 = aVar.f76668d;
                                C52711k.m112236a((Object) aVar6, "emoji.detailEmoji");
                                m69135a(i, animateUrl2, findViewById2, context2, C29298a.m69089c(aVar6));
                            }
                        }
                    }
                }
                return;
            }
        }
    }
}
