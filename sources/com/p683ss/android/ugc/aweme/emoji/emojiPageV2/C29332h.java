package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a.C29318a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.h */
public final class C29332h extends C29317a<C29285a> {

    /* renamed from: f */
    public final C0184k f76789f;

    /* renamed from: g */
    private final float f76790g = 16.0f;

    /* renamed from: h */
    private final float f76791h = 16.0f;

    /* renamed from: i */
    private final float f76792i = 24.0f;

    /* renamed from: j */
    private final float f76793j = 60.0f;

    /* renamed from: k */
    private final int f76794k = ((int) C9432q.m18687b(this.f76720d, this.f76790g));

    /* renamed from: l */
    private final int f76795l = ((int) C9432q.m18687b(this.f76720d, this.f76791h));

    /* renamed from: m */
    private final int f76796m = ((int) C9432q.m18687b(this.f76720d, this.f76793j));

    /* renamed from: y */
    private final int f76797y = ((int) C9432q.m18687b(this.f76720d, this.f76792i));

    /* renamed from: j */
    public final int mo59264j() {
        return R.layout.b9x;
    }

    public C29332h(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f76789f = kVar;
    }

    /* renamed from: a */
    public final void mo59260a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(this.f76794k, 0, this.f76794k, 0);
            recyclerView.setLayoutManager(new WrapGridLayoutManager(this.f76720d, this.f76718b, 1, false));
            recyclerView.mo4798a((C1331h) new C29320b(1, this.f76718b, mo59259a(this.f76796m, this.f76794k, this.f76718b), this.f76797y));
            recyclerView.setAdapter(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo59261a(C29318a aVar, int i) {
        if (mo50673a() != null && mo50673a().size() > 0 && aVar != null && aVar.f76722a != null) {
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            C29285a aVar2 = (C29285a) obj;
            String a = C29473c.m69543a(aVar2.f76668d);
            if (new File(a).exists()) {
                RemoteImageView remoteImageView = aVar.f76722a;
                C52711k.m112236a((Object) a, "localFilePath");
                C29366a aVar3 = aVar2.f76668d;
                C52711k.m112236a((Object) aVar3, "emoji.detailEmoji");
                m69124a(remoteImageView, a, C29298a.m69090d(aVar3));
            } else {
                m69123a(aVar.f76722a, aVar2);
            }
            if (!TextUtils.isEmpty(aVar2.f76667c)) {
                aVar.f76722a.setContentDescription(this.f76720d.getString(R.string.ax1, new Object[]{aVar2.f76667c}));
            }
        }
    }
}
