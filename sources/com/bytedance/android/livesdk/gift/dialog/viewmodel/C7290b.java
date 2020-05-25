package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.C7507f;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.b */
public final class C7290b {

    /* renamed from: a */
    public int f19851a;

    /* renamed from: b */
    public C7491b f19852b;

    /* renamed from: c */
    public final List<GiftPage> f19853c = new ArrayList();

    /* renamed from: d */
    public final List<C7497h> f19854d = new ArrayList();

    /* renamed from: e */
    public final List<C7507f> f19855e = new ArrayList();

    /* renamed from: f */
    public Map<GiftPage, List<C7491b>> f19856f;

    /* renamed from: g */
    public int f19857g = 1;

    /* renamed from: h */
    public C7507f f19858h;

    /* renamed from: i */
    public long f19859i;

    /* renamed from: j */
    public long f19860j;

    /* renamed from: k */
    public boolean f19861k;

    /* renamed from: l */
    public C7514m f19862l;

    /* renamed from: m */
    public boolean f19863m;

    /* renamed from: a */
    public final GiftPage mo13540a() {
        for (GiftPage giftPage : this.f19853c) {
            if (giftPage.pageType == this.f19857g) {
                return giftPage;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo13544b() {
        if (this.f19858h == null || this.f19858h.f20571a <= 0) {
            return 1;
        }
        return this.f19858h.f20571a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13543a(List<GiftPage> list) {
        this.f19853c.clear();
        this.f19853c.addAll(list);
    }

    /* renamed from: a */
    public final void mo13541a(C7491b bVar) {
        if (this.f19852b != null) {
            this.f19852b.f20514b = false;
        }
        this.f19852b = bVar;
        if (this.f19852b != null) {
            this.f19852b.f20514b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13542a(C7507f fVar) {
        if (fVar != null) {
            if (this.f19858h != null) {
                this.f19858h.f20573c = false;
            }
            this.f19858h = fVar;
            this.f19858h.f20573c = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13545b(List<C7507f> list) {
        this.f19855e.clear();
        this.f19855e.addAll(list);
        if (!C9414h.m18630a(this.f19855e)) {
            if (this.f19858h != null) {
                for (C7507f fVar : this.f19855e) {
                    if (this.f19858h.equals(fVar)) {
                        this.f19858h = fVar;
                        this.f19858h.f20573c = true;
                        return;
                    }
                }
            } else if (this.f19855e.size() > 0) {
                this.f19858h = (C7507f) this.f19855e.get(0);
                this.f19858h.f20573c = true;
            }
        }
    }
}
