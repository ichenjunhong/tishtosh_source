package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a.C29318a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.i */
public final class C29333i extends C29317a<C29285a> {

    /* renamed from: f */
    public final C0184k f76798f;

    /* renamed from: g */
    private final float f76799g = 14.0f;

    /* renamed from: h */
    private final float f76800h = 12.0f;

    /* renamed from: i */
    private final float f76801i = 24.0f;

    /* renamed from: j */
    private final float f76802j = 29.0f;

    /* renamed from: k */
    private final int f76803k = ((int) C9432q.m18687b(this.f76720d, this.f76799g));

    /* renamed from: l */
    private final int f76804l = ((int) C9432q.m18687b(this.f76720d, this.f76800h));

    /* renamed from: m */
    private final int f76805m = ((int) C9432q.m18687b(this.f76720d, this.f76801i));

    /* renamed from: y */
    private final int f76806y = ((int) C9432q.m18687b(this.f76720d, this.f76802j));

    /* renamed from: j */
    public final int mo59264j() {
        return R.layout.b9y;
    }

    public C29333i(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f76798f = kVar;
    }

    /* renamed from: a */
    public final void mo59260a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(this.f76803k, 0, this.f76803k, 0);
            recyclerView.setLayoutManager(new WrapGridLayoutManager(this.f76720d, this.f76717a, 1, false));
            recyclerView.mo4798a((C1331h) new C29320b(1, this.f76717a, mo59259a(this.f76806y, this.f76803k, this.f76717a), this.f76805m));
            recyclerView.setAdapter(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo59261a(C29318a aVar, int i) {
        if (!(mo50673a() == null || mo50673a().size() <= 0 || aVar == null)) {
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            C29285a aVar2 = (C29285a) obj;
            if ((!TextUtils.isEmpty(aVar2.f76667c) || aVar2.f76665a > 0 || !TextUtils.isEmpty(aVar2.f76666b)) && aVar.f76722a != null) {
                aVar.f76722a.setVisibility(0);
                C29408b.m69343a(aVar.f76722a, aVar2);
                aVar.f76722a.setContentDescription(this.f76720d.getString(R.string.ax1, new Object[]{aVar2.f76667c}));
            }
        }
    }
}
