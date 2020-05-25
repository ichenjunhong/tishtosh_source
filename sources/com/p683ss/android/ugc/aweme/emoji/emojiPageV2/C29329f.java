package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
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

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.f */
public final class C29329f extends C29317a<C29285a> {

    /* renamed from: f */
    public final C0184k f76771f;

    /* renamed from: g */
    private final float f76772g = 16.0f;

    /* renamed from: h */
    private final float f76773h = 12.0f;

    /* renamed from: i */
    private final float f76774i = 64.0f;

    /* renamed from: j */
    private final float f76775j = 8.0f;

    /* renamed from: k */
    private final int f76776k = ((int) C9432q.m18687b(this.f76720d, this.f76772g));

    /* renamed from: l */
    private final int f76777l = ((int) C9432q.m18687b(this.f76720d, this.f76773h));

    /* renamed from: m */
    private final int f76778m = ((int) C9432q.m18687b(this.f76720d, this.f76774i));

    /* renamed from: y */
    private final int f76779y = ((int) C9432q.m18687b(this.f76720d, this.f76775j));

    /* renamed from: j */
    public final int mo59264j() {
        return R.layout.b9x;
    }

    public C29329f(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f76771f = kVar;
    }

    /* renamed from: a */
    public final void mo59260a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(this.f76776k, 0, this.f76776k, 0);
            recyclerView.setLayoutManager(new WrapGridLayoutManager(this.f76720d, this.f76718b, 1, false));
            recyclerView.mo4798a((C1331h) new C29320b(1, this.f76718b, mo59259a(this.f76778m, this.f76776k, this.f76719c), this.f76779y));
            recyclerView.setAdapter(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo59261a(C29318a aVar, int i) {
        if (mo50673a() != null && mo50673a().size() > 0 && aVar != null) {
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            C29285a aVar2 = (C29285a) obj;
            C29366a aVar3 = aVar2.f76668d;
            C52711k.m112236a((Object) aVar3, "emoji.detailEmoji");
            if (aVar3.getStickerType() == 2 && aVar.f76722a != null) {
                if (aVar2.f76665a == R.drawable.xz) {
                    m69122a(aVar.f76722a, this.f76720d, aVar2.f76665a);
                } else {
                    RemoteImageView remoteImageView = aVar.f76722a;
                    C52711k.m112240b(remoteImageView, "mEmojiIv");
                    C52711k.m112240b(aVar2, "emoji");
                    File file = new File(C29473c.m69541a(), C29473c.m69545c(aVar2.f76668d));
                    if (file.exists()) {
                        C29366a aVar4 = aVar2.f76668d;
                        C52711k.m112236a((Object) aVar4, "emoji.detailEmoji");
                        boolean d = C29298a.m69090d(aVar4);
                        String absolutePath = file.getAbsolutePath();
                        C52711k.m112236a((Object) absolutePath, "file.absolutePath");
                        C29317a.m69124a(remoteImageView, absolutePath, d);
                    } else {
                        C29317a.m69123a(remoteImageView, aVar2);
                    }
                }
                aVar.f76722a.setContentDescription(this.f76720d.getString(R.string.ax4));
            }
        }
    }
}
