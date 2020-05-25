package com.bytedance.android.livesdk.gift.effect.normal.p370b;

import android.content.Context;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.gift.effect.entry.p366d.C7393a;
import com.bytedance.android.livesdk.gift.effect.normal.p371c.C7418a;
import com.bytedance.android.livesdk.gift.effect.normal.p371c.C7419b;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.b.a */
public class C7416a {

    /* renamed from: j */
    private static final String f20299j = "com.bytedance.android.livesdk.gift.effect.normal.b.a";

    /* renamed from: a */
    public C7421b f20300a;

    /* renamed from: b */
    public boolean f20301b = true;

    /* renamed from: c */
    public boolean f20302c;

    /* renamed from: d */
    public boolean f20303d;

    /* renamed from: e */
    public NormalGiftAnimationView f20304e;

    /* renamed from: f */
    public NormalGiftCombView f20305f;

    /* renamed from: g */
    public C7419b f20306g;

    /* renamed from: h */
    public C7393a f20307h;

    /* renamed from: i */
    public int f20308i;

    /* renamed from: k */
    private int f20309k;

    /* renamed from: l */
    private int f20310l;

    /* renamed from: m */
    private int f20311m;

    /* renamed from: n */
    private Context f20312n;

    /* renamed from: o */
    private Map<String, Object> f20313o = new HashMap();

    /* renamed from: p */
    private final List<Integer> f20314p = new ArrayList();

    /* renamed from: q */
    private C7418a f20315q = new C7418a() {
        /* renamed from: b */
        public final void mo13707b() {
            C7416a.this.f20302c = false;
        }

        /* renamed from: a */
        public final void mo13706a() {
            if (C7416a.this.f20300a.f20327d > 0) {
                C7416a.this.f20300a.mo13712b();
                C7416a.this.f20305f.mo13732b();
                C7416a.this.mo13703b();
                return;
            }
            C7416a.this.f20302c = true;
        }

        /* renamed from: c */
        public final void mo13708c() {
            C7416a.this.f20304e.removeView(C7416a.this.f20305f);
            C7416a.this.f20305f.mo13733c();
            C7416a.this.f20305f = null;
            if (C7416a.this.f20300a.f20327d > 0) {
                C7416a.this.f20300a.mo13712b();
                C7416a.this.mo13701a();
                return;
            }
            if (C7416a.this.f20300a.f20329f) {
                C7416a aVar = C7416a.this;
                if (!(aVar.f20307h == null || aVar.f20300a == null)) {
                    aVar.f20307h.mo12490a(aVar.f20300a.f20320l, aVar.f20300a.f20330g, aVar.f20300a.f20318j, aVar.f20300a.f20333q);
                }
            }
            C7416a.this.f20302c = false;
            C7416a.this.f20301b = true;
            if (C7416a.this.f20306g != null) {
                C7416a.this.f20306g.mo13709a();
            }
        }
    };

    /* renamed from: c */
    public final void mo13705c() {
        if (this.f20305f != null) {
            this.f20304e.removeView(this.f20305f);
            this.f20305f.mo13733c();
            this.f20305f = null;
        }
        this.f20301b = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r2.f20544e == 11) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13701a() {
        /*
            r5 = this;
            r0 = 0
            r5.f20301b = r0
            r5.f20302c = r0
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f20305f
            if (r1 != 0) goto L_0x0013
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = new com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView
            android.content.Context r2 = r5.f20312n
            r1.<init>(r2)
            r5.f20305f = r1
            goto L_0x0018
        L_0x0013:
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f20305f
            r1.mo13728a()
        L_0x0018:
            r1 = 1
            com.bytedance.android.livesdk.gift.effect.normal.d.b r2 = r5.f20300a
            if (r2 == 0) goto L_0x0032
            com.bytedance.android.livesdk.gift.GiftManager r2 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.livesdk.gift.effect.normal.d.b r3 = r5.f20300a
            long r3 = r3.f20318j
            com.bytedance.android.livesdk.gift.model.d r2 = r2.findGiftById(r3)
            if (r2 == 0) goto L_0x0032
            int r2 = r2.f20544e
            r3 = 11
            if (r2 != r3) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f20305f
            r1.setShowCombo(r0)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f20305f
            int r1 = r5.f20308i
            r0.setOrientation(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f20305f
            com.bytedance.android.livesdk.gift.effect.normal.d.b r1 = r5.f20300a
            boolean r2 = r5.f20303d
            r0.mo13731a(r1, r2)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f20305f
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r1 = r5.f20304e
            int r1 = r1.getWidth()
            int r1 = -r1
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r2 = r5.f20304e
            int r2 = r2.getHeight()
            int r3 = r5.f20311m
            int r2 = r2 - r3
            int r3 = r5.f20309k
            int r4 = r5.f20310l
            int r3 = r3 * r4
            int r2 = r2 - r3
            r0.mo13729a(r1, r2)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f20305f
            com.bytedance.android.livesdk.gift.effect.entry.d.a r1 = r5.f20307h
            r0.setClickListener(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r0 = r5.f20304e
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f20305f
            r0.addView(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f20305f
            com.bytedance.android.livesdk.gift.effect.normal.c.a r1 = r5.f20315q
            boolean r2 = r5.f20303d
            r0.mo13730a(r1, r2)
            r5.mo13703b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.p370b.C7416a.mo13701a():void");
    }

    /* renamed from: b */
    public final void mo13703b() {
        boolean z;
        C7810ao aoVar = this.f20300a.f20333q;
        if (aoVar == null || !aoVar.f21505n) {
            z = false;
        } else {
            z = true;
        }
        Map<String, Integer> map = this.f20300a.f20332p;
        int i = this.f20300a.f20326c * this.f20300a.f20324a;
        if (z && map != null) {
            Set<String> keySet = map.keySet();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String parseInt : keySet) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            Collections.sort(arrayList);
            int i2 = -1;
            for (Integer intValue : arrayList) {
                int intValue2 = intValue.intValue();
                boolean z2 = false;
                for (Integer intValue3 : this.f20314p) {
                    if (intValue3.intValue() == intValue2) {
                        z2 = true;
                    }
                }
                if (i >= intValue2 && !z2) {
                    this.f20314p.add(Integer.valueOf(intValue2));
                    Integer num = (Integer) map.get(String.valueOf(intValue2));
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                }
            }
            if (i2 != -1) {
                String str = f20299j;
                StringBuilder sb = new StringBuilder("触发连发特效， 原giftId=");
                sb.append(this.f20300a.f20318j);
                sb.append(", 触发giftId=");
                sb.append(i2);
                C3831a.m9712b(str, sb.toString());
                C7810ao aoVar2 = new C7810ao();
                aoVar2.baseMessage = this.f20300a.f20333q.baseMessage;
                aoVar2.f21492a = this.f20300a.f20333q.f21492a;
                aoVar2.f21493b = this.f20300a.f20333q.f21493b;
                aoVar2.f21494c = (long) i2;
                if (this.f20307h != null) {
                    this.f20307h.mo12492b(aoVar2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13704b(C7421b bVar) {
        this.f20300a = bVar;
        mo13701a();
        this.f20313o.put("gift_msg_id", String.valueOf(this.f20300a.f20317i));
        this.f20313o.put("gift_id", String.valueOf(this.f20300a.f20318j));
        C8064d.m16005b().mo9197a("ttlive_gift", this.f20313o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13702a(com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b r9) {
        /*
            r8 = this;
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            r1 = 1
            if (r0 == 0) goto L_0x0020
            if (r9 == 0) goto L_0x0020
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            java.lang.String r0 = r0.mo13710a()
            java.lang.String r2 = r9.mo13710a()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001b
            int r0 = r9.f20326c
            if (r0 != r1) goto L_0x0020
        L_0x001b:
            java.util.List<java.lang.Integer> r0 = r8.f20314p
            r0.clear()
        L_0x0020:
            boolean r0 = r8.f20301b
            r2 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x006d
        L_0x0027:
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            java.lang.String r0 = r0.mo13710a()
            java.lang.String r3 = r9.mo13710a()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            boolean r0 = r0.f20329f
            if (r0 == 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            long r3 = r9.f20325b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0053
            long r3 = r9.f20325b
            long r5 = r0.f20325b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0053
        L_0x0051:
            r0 = 1
            goto L_0x0064
        L_0x0053:
            int r3 = r9.f20326c
            int r4 = r0.f20326c
            int r0 = r0.f20327d
            int r4 = r4 + r0
            int r4 = r4 + r1
            if (r3 != r4) goto L_0x005e
            goto L_0x0051
        L_0x005e:
            boolean r0 = r9.f20335s
            if (r0 == 0) goto L_0x0063
            goto L_0x0051
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 != 0) goto L_0x0067
            goto L_0x0025
        L_0x0067:
            boolean r0 = r9.f20329f
            if (r0 == 0) goto L_0x006c
            goto L_0x0025
        L_0x006c:
            r0 = 1
        L_0x006d:
            if (r0 == 0) goto L_0x0075
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            r0.mo13711a(r9)
            goto L_0x00b5
        L_0x0075:
            boolean r0 = r8.f20301b
            if (r0 != 0) goto L_0x00a2
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            java.lang.String r0 = r0.mo13710a()
            java.lang.String r3 = r9.mo13710a()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00a2
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            boolean r0 = r0.f20329f
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r9.f20329f
            if (r0 == 0) goto L_0x00a2
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            int r0 = r0.f20326c
            com.bytedance.android.livesdk.gift.effect.normal.d.b r3 = r8.f20300a
            int r3 = r3.f20327d
            int r0 = r0 + r3
            int r3 = r9.f20326c
            if (r0 != r3) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 == 0) goto L_0x00cf
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            r0.f20329f = r1
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            java.lang.String r3 = r9.f20330g
            r0.f20330g = r3
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = r8.f20300a
            com.bytedance.android.livesdk.message.model.ao r9 = r9.f20333q
            r0.f20333q = r9
        L_0x00b5:
            boolean r9 = r8.f20302c
            if (r9 == 0) goto L_0x00ce
            com.bytedance.android.livesdk.gift.effect.normal.d.b r9 = r8.f20300a
            int r9 = r9.f20327d
            if (r9 <= 0) goto L_0x00ce
            com.bytedance.android.livesdk.gift.effect.normal.d.b r9 = r8.f20300a
            r9.mo13712b()
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r9 = r8.f20305f
            r9.mo13732b()
            r8.mo13703b()
            r8.f20302c = r2
        L_0x00ce:
            return r1
        L_0x00cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.p370b.C7416a.mo13702a(com.bytedance.android.livesdk.gift.effect.normal.d.b):boolean");
    }

    public C7416a(Context context, NormalGiftAnimationView normalGiftAnimationView, int i) {
        this.f20312n = context;
        this.f20304e = normalGiftAnimationView;
        this.f20309k = i;
        this.f20313o.put("desc", "播放小礼物动画");
        this.f20310l = (int) (context.getResources().getDimension(R.dimen.p1) + context.getResources().getDimension(R.dimen.p7));
        this.f20311m = (int) context.getResources().getDimension(R.dimen.p8);
    }
}
