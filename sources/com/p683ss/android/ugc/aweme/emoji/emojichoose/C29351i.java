package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.GridView;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.emoji.utils.C29477g;
import com.p683ss.android.ugc.aweme.emoji.views.C29490b;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.i */
public final class C29351i {

    /* renamed from: a */
    float f76859a;

    /* renamed from: b */
    long f76860b;

    /* renamed from: c */
    long f76861c;

    /* renamed from: d */
    boolean f76862d;

    /* renamed from: e */
    long f76863e;

    /* renamed from: f */
    int f76864f;

    /* renamed from: g */
    Handler f76865g;

    /* renamed from: h */
    float f76866h;

    /* renamed from: i */
    float f76867i;

    /* renamed from: j */
    C29490b f76868j;

    /* renamed from: k */
    private String f76869k;

    /* renamed from: l */
    private int f76870l;

    /* renamed from: m */
    private C29477g<String, C29345f> f76871m;

    public C29351i() {
        this(0);
    }

    public C29351i(int i) {
        this.f76862d = true;
        this.f76864f = -1;
        this.f76865g = new Handler(Looper.getMainLooper());
        this.f76870l = i;
        this.f76871m = new C29477g<>(5);
        this.f76869k = C11010c.m22280a().getString(R.string.axg);
    }

    /* renamed from: a */
    private static <T extends C29360o> View m69194a(ViewGroup viewGroup, T t) {
        View a = t.mo59272a(viewGroup);
        if (viewGroup.indexOfChild(a) < 0) {
            viewGroup.addView(a);
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m69199a(List<C29285a> list, List<C29285a> list2) {
        boolean z = false;
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            if (!((C29285a) list.get(i)).equals((C29285a) list2.get(i))) {
                break;
            }
            i++;
        }
        return z;
    }

    /* renamed from: a */
    private void m69196a(GridView gridView, SwipeControlledViewPager swipeControlledViewPager, List<C29285a> list) {
        C29353k kVar = new C29353k(this, new ArrayList(), gridView, list, swipeControlledViewPager);
        gridView.setOnTouchListener(kVar);
    }

    /* renamed from: a */
    private static void m69198a(C29345f fVar, List<C29285a> list, C29361p pVar, C29355m mVar, int i) {
        fVar.f76843b.setOnItemClickListener(new C29352j(list, pVar, mVar, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m69195a(int r17, com.p683ss.android.ugc.aweme.base.model.UrlModel r18, android.view.View r19, android.content.Context r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            int r5 = r0.f76864f
            if (r5 != r1) goto L_0x000f
            return
        L_0x000f:
            r5 = 2131952903(0x7f130507, float:1.9542262E38)
            r3.setBackgroundResource(r5)
            r0.f76864f = r1
            int r5 = com.bytedance.common.utility.C9432q.m18670a(r20)
            float r5 = (float) r5
            r6 = 1050924810(0x3ea3d70a, float:0.32)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r5 * 9
            int r6 = r6 / 120
            int r7 = r6 * 56
            int r7 = r7 / 27
            float r8 = (float) r5
            float r9 = (float) r6
            r10 = 1068876431(0x3fb5c28f, float:1.42)
            float r9 = r9 * r10
            r10 = 1091567616(0x41100000, float:9.0)
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
            r10.setLayoutParams(r11)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76868j
            if (r11 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76868j
            boolean r11 = r11.isShowing()
            if (r11 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76868j
            r11.dismiss()
            goto L_0x006b
        L_0x0064:
            com.ss.android.ugc.aweme.emoji.views.b r11 = new com.ss.android.ugc.aweme.emoji.views.b
            r11.<init>()
            r0.f76868j = r11
        L_0x006b:
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76868j
            r11.mo59596a(r10, r4)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f76868j
            r12 = 0
            r11.f77235a = r12
            int r11 = r5 - r7
            int r13 = r11 / 2
            r14 = 2
            if (r1 != 0) goto L_0x0085
            int r1 = r19.getWidth()
            int r1 = r1 - r7
            int r13 = r1 / 2
        L_0x0083:
            r1 = 0
            goto L_0x00a6
        L_0x0085:
            r15 = 1
            if (r1 == r15) goto L_0x009e
            if (r1 != r14) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            r15 = 3
            if (r1 != r15) goto L_0x0083
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r13 = r19.getWidth()
            int r13 = r13 - r7
            int r13 = r13 / r14
            int r13 = r11 - r13
            goto L_0x00a6
        L_0x009e:
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r1 = r1 / r14
        L_0x00a6:
            r11 = 2132020090(0x7f140b7a, float:1.9678533E38)
            android.view.View r11 = r10.findViewById(r11)
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
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            r14.width = r7
            r14.height = r6
            r14.setMargins(r13, r8, r12, r12)
            r10.setLayoutParams(r14)
            com.ss.android.ugc.aweme.emoji.views.b r6 = r0.f76868j
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r7)
            int r4 = (int) r4
            int r4 = -r4
            r6.mo59595a(r3, r1, r4)
            if (r21 == 0) goto L_0x00f0
            com.p683ss.android.ugc.aweme.emoji.utils.C29478h.m69558a(r11, r2)
            goto L_0x00f3
        L_0x00f0:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r11, r2)
        L_0x00f3:
            com.ss.android.ugc.aweme.emoji.views.b r1 = r0.f76868j
            r1.update(r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.emojichoose.C29351i.m69195a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public final View mo59295a(ViewGroup viewGroup, SwipeControlledViewPager swipeControlledViewPager, int i, C29292h hVar, C29361p pVar) {
        C29355m f = hVar.mo59239f();
        C29291g c = f.mo59306c(i);
        if (c == null || !c.mo59222h()) {
            return m69194a(viewGroup, (T) new C29348g());
        }
        if (c.mo59223i() == 3) {
            if (C29368b.m69241a().f76934b == 0) {
                return m69194a(viewGroup, (T) new C29348g());
            }
            if (c.mo59224j() == 0) {
                if (this.f76870l == 1) {
                    return m69194a(viewGroup, (T) new C29344e(viewGroup.getContext().getString(R.string.axb)));
                }
                if (this.f76870l == 0) {
                    return m69194a(viewGroup, (T) new C29334a());
                }
            }
        }
        List d = f.mo59308d(i);
        int e = f.mo59310e(i);
        if (c.mo59223i() == 4) {
            if (C29297a.m69081a().f76679a == 0) {
                return m69194a(viewGroup, (T) new C29348g());
            }
            if (C29301b.m69097c(e) && C29301b.m69095a(d)) {
                return m69194a(viewGroup, (T) new C29344e(viewGroup.getContext().getString(R.string.axd)));
            }
        }
        String a = C2240a.m6772a(this.f76869k, new Object[]{c.mo59225k(), String.valueOf(e)});
        C29345f fVar = (C29345f) this.f76871m.remove(a);
        if (fVar != null) {
            this.f76871m.put(a, fVar);
            View view = fVar.f76842a;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view);
            }
            if (!m69199a(d, fVar.mo59283a())) {
                m69197a(fVar, d, c, pVar, swipeControlledViewPager, f, i);
            }
            return view;
        }
        C29345f fVar2 = new C29345f(viewGroup, c.mo59223i());
        this.f76871m.put(a, fVar2);
        View view2 = fVar2.f76842a;
        if (viewGroup.indexOfChild(view2) < 0) {
            viewGroup.addView(view2);
        }
        m69197a(fVar2, d, c, pVar, swipeControlledViewPager, f, i);
        return view2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo59296a(float f, float f2, List<View> list, List<C29285a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
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
                if (this.f76864f != i && System.currentTimeMillis() - this.f76863e > 500 && Math.abs(f - this.f76859a) < 20.0f) {
                    this.f76862d = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f76865g.removeCallbacksAndMessages(null);
                }
                if (this.f76864f >= 0 && i != this.f76864f) {
                    View findViewById = ((View) list.get(this.f76864f)).findViewById(R.id.a_s);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                if (!this.f76862d && i < list2.size()) {
                    View findViewById2 = ((View) list.get(i)).findViewById(R.id.a_s);
                    C29285a aVar = (C29285a) list2.get(i);
                    if (aVar.mo59210a()) {
                        int i2 = aVar.f76665a;
                        if (i2 == R.drawable.xz || i2 == R.drawable.y7) {
                            z = true;
                        }
                        if (!z && findViewById2 != null) {
                            if (aVar.f76668d.getStickerType() == 1) {
                                StringBuilder sb = new StringBuilder("file://");
                                sb.append(C29473c.m69544b(aVar.f76668d));
                                String sb2 = sb.toString();
                                UrlModel animateUrl = aVar.f76668d.getAnimateUrl();
                                if (new File(sb2).exists()) {
                                    animateUrl = new UrlModel();
                                    animateUrl.setUri(sb2);
                                    animateUrl.setUrlList(Collections.singletonList(sb2));
                                }
                                m69195a(i, animateUrl, findViewById2, view.getContext(), C29298a.m69089c(aVar.f76668d));
                            } else {
                                m69195a(i, aVar.f76668d.getAnimateUrl(), findViewById2, view.getContext(), C29298a.m69089c(aVar.f76668d));
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m69197a(C29345f fVar, List<C29285a> list, C29291g gVar, C29361p pVar, SwipeControlledViewPager swipeControlledViewPager, C29355m mVar, int i) {
        fVar.mo59284a(list);
        if (gVar.mo59223i() == 2 || gVar.mo59223i() == 4 || gVar.mo59223i() == 3) {
            fVar.f76843b.setSelector(new ColorDrawable(0));
            m69196a(fVar.f76843b, swipeControlledViewPager, list);
        }
        m69198a(fVar, list, pVar, mVar, i);
    }
}
