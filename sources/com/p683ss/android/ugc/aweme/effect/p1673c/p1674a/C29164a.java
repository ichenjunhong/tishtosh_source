package com.p683ss.android.ugc.aweme.effect.p1673c.p1674a;

import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.p2652av.video.C52906ab;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.a */
public final class C29164a {

    /* renamed from: a */
    public static final C29164a f76427a = new C29164a();

    private C29164a() {
    }

    /* renamed from: a */
    public static final boolean m68670a(long j) {
        return j >= 60000;
    }

    /* renamed from: a */
    public static long m68666a(int i) {
        return Math.max((long) (i / 5), 1000);
    }

    /* renamed from: b */
    public static final boolean m68673b(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            return false;
        }
        return C52711k.m112239a((Object) effectPointModel.getKey(), (Object) "2");
    }

    /* renamed from: c */
    public static final boolean m68674c(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            return false;
        }
        return C52711k.m112239a((Object) effectPointModel.getKey(), (Object) "3");
    }

    /* renamed from: a */
    public static final boolean m68672a(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            return false;
        }
        return C52711k.m112239a((Object) effectPointModel.getKey(), (Object) "1");
    }

    /* renamed from: a */
    public static final List<EffectPointModel> m68669a(long j, long j2) {
        List<EffectPointModel> arrayList = new ArrayList<>();
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUiStartPoint((int) j);
        effectPointModel.setUiEndPoint((int) j2);
        arrayList.add(effectPointModel);
        return arrayList;
    }

    /* renamed from: a */
    public static final C52906ab m68668a(int i, VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
        if (effectPointModel == null) {
            return null;
        }
        long endPoint = (long) effectPointModel.getEndPoint();
        long startPoint = (long) effectPointModel.getStartPoint();
        String key = effectPointModel.getKey();
        if (Math.abs(startPoint - endPoint) < 1000) {
            long max = Math.max(1000, (long) (i / 5));
            long j = (long) i;
            if (startPoint + max > j) {
                startPoint = j - max;
            }
            endPoint = max + startPoint;
        }
        return C52906ab.m112592a(key, startPoint, endPoint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p2628d.C52847n<java.lang.Long, java.lang.Long> m68667a(java.lang.String r8, com.p683ss.android.ugc.aweme.effect.p1673c.C29163a r9, com.p683ss.android.ugc.asve.p1239c.C20347c r10) {
        /*
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "recorder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r0 = 0
            if (r10 != 0) goto L_0x001c
            d.n r8 = new d.n
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r8.<init>(r9, r10)
            return r8
        L_0x001c:
            int r2 = r10.mo43073l()
            int r2 = r10.mo43086r(r2)
            boolean r3 = r9.f76425e
            if (r3 == 0) goto L_0x004d
            java.util.Map<java.lang.String, java.lang.Long> r3 = r9.f76423c
            java.lang.Object r3 = r3.get(r8)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x0037
            long r3 = r3.longValue()
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            java.util.Map<java.lang.String, java.lang.Long> r2 = r9.f76423c
            java.lang.Object r2 = r2.get(r8)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x004b
            long r2 = r2.longValue()
            goto L_0x004e
        L_0x004b:
            r2 = r0
            goto L_0x004e
        L_0x004d:
            long r2 = (long) r2
        L_0x004e:
            int r10 = r10.mo42966A()
            boolean r4 = r9.f76425e
            if (r4 == 0) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.Long> r4 = r9.f76424d
            java.lang.Object r4 = r4.get(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0065
            long r4 = r4.longValue()
            goto L_0x0066
        L_0x0065:
            r4 = r0
        L_0x0066:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.Long> r4 = r9.f76424d
            java.lang.Object r4 = r4.get(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x007d
            long r0 = r4.longValue()
            goto L_0x007d
        L_0x0079:
            long r0 = m68666a(r10)
        L_0x007d:
            long r4 = (long) r10
            long r6 = r4 - r2
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x0086
            r10 = 1
            goto L_0x0087
        L_0x0086:
            r10 = 0
        L_0x0087:
            if (r10 == 0) goto L_0x008b
            long r2 = r4 - r0
        L_0x008b:
            r10 = 0
            long r4 = r2 + r0
            java.util.Map<java.lang.String, java.lang.Long> r10 = r9.f76423c
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r10.put(r8, r6)
            java.util.Map<java.lang.String, java.lang.Long> r9 = r9.f76424d
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r9.put(r8, r10)
            d.n r8 = new d.n
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r8.<init>(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68667a(java.lang.String, com.ss.android.ugc.aweme.effect.c.a, com.ss.android.ugc.asve.c.c):d.n");
    }

    /* renamed from: a */
    public static final boolean m68671a(ViewPager viewPager, PagerAdapter pagerAdapter, boolean z) {
        C52711k.m112240b(viewPager, "pager");
        C52711k.m112240b(pagerAdapter, "adapter");
        if (viewPager.getCurrentItem() != pagerAdapter.getCount() - 1 || !z) {
            return false;
        }
        return true;
    }
}
