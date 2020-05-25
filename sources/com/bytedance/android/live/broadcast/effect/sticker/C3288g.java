package com.bytedance.android.live.broadcast.effect.sticker;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.StickerGiftApi;
import com.bytedance.android.live.broadcast.api.p194a.C3036b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.gift.C4121b;
import com.bytedance.android.live.gift.C4125c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5005b;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.gift.effect.p359b.C7329b;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7512k;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.g */
public final class C3288g implements C3036b, C9382a {

    /* renamed from: a */
    public boolean f9475a;

    /* renamed from: b */
    public C9381g f9476b = new C9381g(this);

    /* renamed from: c */
    public C7329b f9477c;

    /* renamed from: d */
    public String f9478d;

    /* renamed from: e */
    private List<C7329b> f9479e = new LinkedList();

    /* renamed from: f */
    private C3283b f9480f;

    /* renamed from: g */
    private C4125c f9481g = new C4125c() {

        /* renamed from: b */
        private boolean f9483b;

        /* renamed from: a */
        public final void mo8665a() {
            this.f9483b = true;
            if (C3288g.this.f9476b.hasMessages(140001)) {
                C3288g.this.f9476b.removeMessages(140001);
            }
            C3288g.this.f9476b.sendMessage(C3288g.this.f9476b.obtainMessage(140001));
        }

        /* renamed from: a */
        public final void mo8666a(C7810ao aoVar) {
            if (!this.f9483b) {
                C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(aoVar.f21494c);
                if (findGiftById != null && 4 == findGiftById.f20544e) {
                    C2201v.m6601a((C2205y<T>) new C3293j<T>(aoVar)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3294k<Object>(this), C3295l.f9490a);
                }
            }
        }
    };

    /* renamed from: a */
    public final C7328a mo8250a() {
        return this.f9477c;
    }

    /* renamed from: b */
    public final void mo8252b() {
        if (this.f9475a) {
            this.f9476b.removeMessages(140001);
            this.f9476b.sendMessage(this.f9476b.obtainMessage(140001));
        }
    }

    /* renamed from: c */
    public final void mo8662c() {
        try {
            ((IGiftService) C4116c.m10249a(IGiftService.class)).setGiftAnimationEngine(C4121b.STICKER_GIFT, this.f9481g);
        } catch (Exception e) {
            C3831a.m9716d("StickerMessageManager", e.toString());
        }
    }

    /* renamed from: f */
    private void m9016f() {
        if (!this.f9475a && !this.f9479e.isEmpty()) {
            this.f9477c = (C7329b) this.f9479e.remove(0);
            C32902 r5 = new C7214j() {
                /* renamed from: a */
                public final void mo8667a(long j) {
                    C3288g.this.f9475a = false;
                }

                /* renamed from: a */
                public final void mo8669a(Throwable th) {
                    C3288g.this.f9475a = false;
                }

                /* renamed from: a */
                public final void mo8668a(long j, String str) {
                    boolean z;
                    if (str.equals(C3288g.this.f9477c.f19959d)) {
                        C7329b bVar = C3288g.this.f9477c;
                        if (bVar.f19972q == null || bVar.f19972q.f20599b <= 0 || bVar.f19972q.f20600c <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z || TextUtils.isEmpty(C3288g.this.f9478d)) {
                            C3288g.this.f9476b.postDelayed(new C3296m(this), 1000);
                        } else {
                            C3288g.this.mo8664e();
                        }
                    }
                }
            };
            this.f9475a = true;
            ((IGiftService) C4116c.m10249a(IGiftService.class)).downloadAssets("effects", this.f9477c.f19957b, r5, 4);
        }
    }

    /* renamed from: d */
    public final void mo8663d() {
        if (this.f9480f != null && this.f9476b != null && this.f9477c != null) {
            C3283b bVar = this.f9480f;
            C7329b bVar2 = this.f9477c;
            C8688c cVar = new C8688c();
            cVar.f23744e = bVar2.f19965j;
            cVar.f23759t = bVar2.f19959d;
            bVar.mo8650a(cVar, this.f9477c.f19971p);
            this.f9476b.sendMessageDelayed(this.f9476b.obtainMessage(140001), this.f9477c.f19970o);
        }
    }

    /* renamed from: e */
    public final void mo8664e() {
        String nickName = this.f9477c.f19962g.getNickName();
        ((StickerGiftApi) C3395f.m9156f().mo8742c().mo9018a(StickerGiftApi.class)).checkUserNameLegality(nickName).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3291h<Object>(this, nickName), (C1710e<? super Throwable>) new C3292i<Object>(this));
    }

    /* renamed from: a */
    public final void mo8251a(C7329b bVar) {
        if (bVar != null) {
            if (bVar.f19960e) {
                this.f9479e.add(0, bVar);
            } else {
                this.f9479e.add(bVar);
            }
            m9016f();
        }
    }

    public final void handleMsg(Message message) {
        if (140001 == message.what) {
            this.f9480f.mo8652d();
            this.f9477c = null;
            this.f9475a = false;
            m9016f();
        }
    }

    public C3288g(C3283b bVar) {
        this.f9480f = bVar;
        this.f9478d = C3287f.m9013a(C3922z.m9915e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8661a(String str) {
        C7512k kVar = this.f9477c.f19972q;
        if (TextUtils.isEmpty(str)) {
            str = kVar.f20601d;
        }
        if (TextUtils.isEmpty(str)) {
            str = C3922z.m9903a((int) R.string.efk);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9478d);
        sb.append(File.separator);
        sb.append(C9395d.m18571a(str));
        sb.append(".png");
        String sb2 = sb.toString();
        String str2 = kVar.f20598a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f9477c.f19959d);
        sb3.append("font.ttf");
        String sb4 = sb3.toString();
        if (!C3895i.m9849a(sb2)) {
            StringBuilder sb5 = new StringBuilder("#");
            sb5.append(kVar.f20603f);
            kVar.f20603f = sb5.toString();
            kVar.f20607j = sb4;
            kVar.f20601d = str;
            kVar.f20606i = sb2;
            C5005b.m11491a(kVar);
        }
        this.f9480f.mo8651b(str2, sb2, this.f9477c.f19971p);
        mo8663d();
    }
}
