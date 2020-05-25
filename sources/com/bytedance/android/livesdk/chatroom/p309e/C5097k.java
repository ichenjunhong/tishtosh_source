package com.bytedance.android.livesdk.chatroom.p309e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b.C5085a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.model.C7808am;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.k */
public final class C5097k extends C5084b<C7808am> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7808am) this.f13643a).f21485a;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        String str = ((C7808am) this.f13643a).f21487c;
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C7808am) this.f13643a).f21485a, "：", str, R.color.agf, R.color.agi, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        String str = ((C7808am) this.f13643a).f21487c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        return C5113y.m11753b(((C7808am) this.f13643a).f21485a, "：", sb.toString(), R.color.a_y, R.color.alt, false);
    }

    public C5097k(C7808am amVar) {
        super(amVar);
    }

    /* renamed from: a */
    public final void mo10995a(final C5085a aVar) {
        if (((C7808am) this.f13643a).baseMessage != null && ((C7808am) this.f13643a).baseMessage.f24139j != null) {
            C8851g gVar = ((C7808am) this.f13643a).baseMessage.f24139j;
            String str = null;
            String str2 = gVar.f24156b;
            if (gVar.f24155a != null) {
                str = C7676b.m15696a().mo14036a(gVar.f24155a);
            }
            if (!(str == null && str2 == null)) {
                for (C8853i iVar : gVar.f24158d) {
                    if (iVar.f24162a == C8848e.GIFT.getPieceType() && iVar.f24166e != null) {
                        C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(iVar.f24166e.f24169a);
                        if (findGiftById != null) {
                            TTLiveSDKContext.getHostService().mo10319l().mo15490a(findGiftById.f20541b, (C8797c) new C8797c() {
                                /* renamed from: a */
                                public final void mo9146a(C8795a aVar) {
                                }

                                /* renamed from: a */
                                public final void mo9145a(Bitmap bitmap) {
                                    if (bitmap != null) {
                                        Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                        if (aVar != null) {
                                            aVar.mo10992a(copy, C5097k.this);
                                        }
                                    }
                                }
                            });
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
