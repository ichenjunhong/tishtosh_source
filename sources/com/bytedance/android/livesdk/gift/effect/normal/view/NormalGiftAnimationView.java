package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.entry.p366d.C7393a;
import com.bytedance.android.livesdk.gift.effect.normal.p369a.C7415a;
import com.bytedance.android.livesdk.gift.effect.normal.p370b.C7416a;
import com.bytedance.android.livesdk.gift.effect.normal.p371c.C7419b;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NormalGiftAnimationView extends FrameLayout {

    /* renamed from: a */
    public List<C7416a> f20346a;

    /* renamed from: b */
    private Context f20347b;

    /* renamed from: c */
    private Map<String, C7421b> f20348c;

    /* renamed from: d */
    private List<C7421b> f20349d;

    /* renamed from: e */
    private C7393a f20350e;

    /* renamed from: f */
    private int f20351f;

    /* renamed from: g */
    private C7419b f20352g;

    /* renamed from: b */
    public final void mo13724b() {
        if (this.f20348c != null) {
            this.f20348c.clear();
        }
        if (this.f20349d != null) {
            this.f20349d.clear();
        }
    }

    /* renamed from: c */
    private void m15322c() {
        this.f20346a = new ArrayList();
        int i = 0;
        while (i < 2) {
            i++;
            C7416a aVar = new C7416a(this.f20347b, this, i);
            aVar.f20306g = this.f20352g;
            this.f20346a.add(aVar);
        }
        this.f20348c = new LinkedHashMap();
        this.f20349d = new ArrayList();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20348c.clear();
        this.f20349d.clear();
        for (C7416a aVar : this.f20346a) {
            if (aVar.f20306g != null) {
                aVar.f20306g = null;
            }
            if (aVar.f20307h != null) {
                aVar.f20307h = null;
            }
            aVar.mo13705c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r0 = r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15323d() {
        /*
            r8 = this;
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.d.b> r0 = r8.f20349d
            int r0 = r0.size()
            int r1 = r8.f20351f
            if (r0 <= r1) goto L_0x0045
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.d.b> r0 = r8.f20349d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = (com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b) r0
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.d.b> r1 = r8.f20349d
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            com.bytedance.android.livesdk.gift.effect.normal.d.b r2 = (com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b) r2
            com.bytedance.android.live.base.model.user.User r3 = r2.f20320l
            if (r3 == 0) goto L_0x0043
            com.bytedance.android.live.base.model.user.User r3 = r2.f20320l
            long r3 = r3.getId()
            java.lang.Class<com.bytedance.android.live.user.a> r5 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r5 = com.bytedance.android.live.p245d.C4116c.m10249a(r5)
            com.bytedance.android.live.user.a r5 = (com.bytedance.android.live.user.C4282a) r5
            com.bytedance.android.livesdk.user.e r5 = r5.user()
            long r5 = r5.mo14529b()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0019
        L_0x0043:
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x005e
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.d.b> r1 = r8.f20349d
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x005e
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.gift.effect.normal.d.b> r1 = r8.f20348c
            java.lang.String r2 = r0.mo13710a()
            r1.remove(r2)
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.d.b> r1 = r8.f20349d
            r1.remove(r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView.m15323d():void");
    }

    /* renamed from: a */
    public final void mo13722a() {
        if (this.f20349d.isEmpty()) {
            for (C7416a aVar : this.f20346a) {
                if (aVar.f20301b) {
                    aVar.mo13705c();
                }
            }
            return;
        }
        C7421b bVar = (C7421b) this.f20349d.get(0);
        for (C7416a aVar2 : this.f20346a) {
            if (aVar2.f20301b) {
                this.f20349d.remove(bVar);
                this.f20348c.remove(bVar.mo13710a());
                aVar2.mo13704b(bVar);
                return;
            }
        }
    }

    public NormalGiftAnimationView(Context context) {
        this(context, null);
    }

    public void setNormalGiftEventListener(C7393a aVar) {
        this.f20350e = aVar;
        for (C7416a aVar2 : this.f20346a) {
            aVar2.f20307h = aVar;
        }
    }

    public void setOrientation(int i) {
        for (C7416a aVar : this.f20346a) {
            if (aVar != null) {
                aVar.f20308i = i;
            }
        }
    }

    /* renamed from: a */
    private void m15321a(C7421b bVar) {
        if (!((Boolean) LiveSettingKeys.LIVE_ENABLE_NORMAL_GIFT_AND_BARRAGE_SELF_FIRSTLY.mo9431a()).booleanValue() || bVar.f20320l == null || bVar.f20320l.getId() != ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
            this.f20349d.add(bVar);
        } else {
            this.f20349d.add(0, bVar);
        }
        this.f20348c.put(bVar.mo13710a(), bVar);
        m15323d();
    }

    public NormalGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo13723a(C7415a aVar, Object... objArr) {
        C7421b a = aVar.mo13700a(objArr);
        for (C7416a a2 : this.f20346a) {
            if (a2.mo13702a(a)) {
                return;
            }
        }
        if (this.f20348c.containsKey(a.mo13710a())) {
            C7421b bVar = (C7421b) this.f20348c.get(a.mo13710a());
            if (bVar.f20329f) {
                this.f20348c.remove(bVar.mo13710a());
                if (!a.f20329f && a.f20325b != bVar.f20325b) {
                    m15321a(a);
                }
            } else if (a.f20329f) {
                bVar.f20329f = true;
                bVar.f20330g = a.f20330g;
                bVar.f20333q = a.f20333q;
            } else {
                bVar.mo13711a(a);
            }
        } else if (!a.f20329f) {
            m15321a(a);
        } else if (this.f20350e != null) {
            this.f20350e.mo12490a(a.f20320l, a.f20330g, a.f20318j, a.f20333q);
        }
        mo13722a();
    }

    public NormalGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20351f = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo9431a()).intValue();
        this.f20352g = new C7419b() {
            /* renamed from: a */
            public final void mo13709a() {
                NormalGiftAnimationView.this.mo13722a();
            }
        };
        this.f20347b = context;
        m15322c();
    }
}
