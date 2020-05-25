package com.bytedance.android.livesdk.gift.p356d;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.C7191a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.d.f */
public final class C7238f extends C7230b<C7495f> {

    /* renamed from: n */
    private final View f19645n;

    public C7238f(View view) {
        super(view);
        this.f19645n = view.findViewById(R.id.d_w);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo13464a(C7495f fVar) {
        super.mo13464a(fVar);
        this.f19645n.setVisibility(8);
        if (fVar.mo13906c() && TextUtils.isEmpty(C7191a.m14934a(fVar.mo13921r().f20543d))) {
            C7505d findGiftById = GiftManager.inst().findGiftById(fVar.mo13921r().f20543d);
            if (findGiftById != null) {
                ImageModel imageModel = findGiftById.f20541b;
                if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() > 0) {
                    ((C8794c) C4116c.m10249a(C8794c.class)).mo15491a((String) imageModel.getUrls().get(0));
                }
            }
        }
    }
}
