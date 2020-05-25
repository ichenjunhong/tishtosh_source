package com.bytedance.android.livesdk.chatroom.p309e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b.C5085a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.l */
public final class C5099l extends C5084b<C7810ao> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7810ao) this.f13643a).f21492a;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        String str = null;
        try {
            String a = C7792f.m15860a(((C7810ao) this.f13643a).f21492a);
            String str2 = ((C7810ao) this.f13643a).baseMessage.f24135f;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":");
            if (str2.startsWith(sb.toString())) {
                str = str2.substring(a.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((C7810ao) this.f13643a).baseMessage.f24135f;
        }
        String str3 = str;
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C7810ao) this.f13643a).f21492a, "：", str3, R.color.agf, R.color.agi, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        String str = null;
        try {
            String a = C7792f.m15860a(((C7810ao) this.f13643a).f21492a);
            String str2 = ((C7810ao) this.f13643a).baseMessage.f24135f;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":");
            if (str2.startsWith(sb.toString())) {
                str = str2.substring(a.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((C7810ao) this.f13643a).baseMessage.f24135f;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        return C5113y.m11753b(((C7810ao) this.f13643a).f21492a, "：", sb2.toString(), R.color.a_y, R.color.aab, false);
    }

    public C5099l(C7810ao aoVar) {
        super(aoVar);
    }

    /* renamed from: a */
    public final void mo10996a(final C5085a aVar) {
        if (((C7810ao) this.f13643a).baseMessage != null && ((C7810ao) this.f13643a).baseMessage.f24139j != null) {
            C8851g gVar = ((C7810ao) this.f13643a).baseMessage.f24139j;
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
                                            aVar.mo10992a(copy, C5099l.this);
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
