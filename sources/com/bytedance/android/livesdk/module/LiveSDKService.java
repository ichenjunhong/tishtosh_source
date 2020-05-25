package com.bytedance.android.livesdk.module;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.base.model.p190d.C2971a;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.live.room.C4184d;
import com.bytedance.android.live.room.C4186e;
import com.bytedance.android.live.room.C4187f;
import com.bytedance.android.live.room.C4188g;
import com.bytedance.android.live.room.C4190i;
import com.bytedance.android.live.room.C4194m;
import com.bytedance.android.live.room.C4196o;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.chatroom.end.C5132e;
import com.bytedance.android.livesdk.chatroom.end.C5147m;
import com.bytedance.android.livesdk.chatroom.p325ui.C5949ax;
import com.bytedance.android.livesdk.chatroom.p325ui.C6156eq;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.commerce.C6707c;
import com.bytedance.android.livesdk.commerce.C6707c.C6708a.C6709a;
import com.bytedance.android.livesdk.commerce.C6707c.C6708a.C6710b;
import com.bytedance.android.livesdk.commerce.LiveCommerceApi;
import com.bytedance.android.livesdk.livebuild.LottiePlayService;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdk.p279af.C4606p;
import com.bytedance.android.livesdk.verify.C8380e;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

public class LiveSDKService implements ILiveSDKService {
    private C4186e mLinkCrossRoomWidget;
    private C4188g mLiveCommerceService;
    private C4190i mLottiePlayService;

    public LiveSDKService() {
        C4116c.m10251a(ILiveSDKService.class, this);
    }

    public C4181b dnsOptimizer() {
        return ((C4139d) C4116c.m10249a(C4139d.class)).getDnsOptimizer();
    }

    public C4190i getLottiePlayService() {
        if (this.mLottiePlayService == null) {
            this.mLottiePlayService = new LottiePlayService();
        }
        return this.mLottiePlayService;
    }

    public C4186e linkCrossRoomWidget() {
        if (this.mLinkCrossRoomWidget == null) {
            this.mLinkCrossRoomWidget = new C4186e() {
                /* renamed from: a */
                public final int mo9598a() {
                    return LinkCrossRoomWidget.f17124a;
                }

                /* renamed from: b */
                public final int mo9599b() {
                    return LinkCrossRoomWidget.m13614k();
                }

                /* renamed from: c */
                public final int mo9600c() {
                    return LinkCrossRoomWidget.m13613j();
                }
            };
        }
        return this.mLinkCrossRoomWidget;
    }

    public C4188g liveCommerceService() {
        if (this.mLiveCommerceService == null) {
            this.mLiveCommerceService = new C4188g() {
                /* renamed from: a */
                public final C2201v<Boolean> mo9605a(Long l) {
                    C2201v<Boolean> a = ((LiveCommerceApi) C4514j.m10883j().mo10321b().mo9550a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://api.hypstar.com/hotsoon/commerce/live/user/info/", l.longValue()).mo6541d((C1711f<? super T, ? extends R>) C6710b.f18296a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                    C52711k.m112236a((Object) a, "LiveInternalService.inst…dSchedulers.mainThread())");
                    return a;
                }

                /* renamed from: b */
                public final C2201v<Boolean> mo9607b(Long l) {
                    C2201v<Boolean> a = ((LiveCommerceApi) C4514j.m10883j().mo10321b().mo9550a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://api.hypstar.com/hotsoon/commerce/live/user/info/", l.longValue()).mo6541d((C1711f<? super T, ? extends R>) C6709a.f18295a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                    C52711k.m112236a((Object) a, "LiveInternalService.inst…dSchedulers.mainThread())");
                    return a;
                }

                /* renamed from: a */
                public final C4104a mo9606a(Context context, Long l) {
                    C4104a aVar;
                    C52711k.m112240b(context, "context");
                    String str = (String) C6707c.f18293a.mo9431a();
                    C4697b c = C4514j.m10883j().mo10322c();
                    if (c != null) {
                        aVar = c.mo10486a(context, str, "");
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    return aVar;
                }
            };
        }
        return this.mLiveCommerceService;
    }

    public C4196o getXTSDKService() {
        return (C4196o) C4514j.m10883j().mo10326g().mo10305a(C4196o.class);
    }

    public C4194m hostStickerViewService() {
        return (C4194m) C4514j.m10883j().mo10326g().mo10305a(C4194m.class);
    }

    public C4184d createInteractionFragment(int i) {
        if (i == 0) {
            return new C5949ax();
        }
        return new C6156eq();
    }

    public C4187f createLiveBroadcastEndFragment(boolean z) {
        if (z) {
            return new C5147m();
        }
        return new C5132e();
    }

    public IMessageManager getMessageManager(long j, boolean z, Context context) {
        return C4565af.m10959a(j, z, context);
    }

    public void handleRealNameConflict(Activity activity, int i, C2971a aVar, Bundle bundle) {
        C8380e.m16603a(activity, i, aVar, bundle);
    }

    public C4182c createImagePicker(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C4183a aVar) {
        C4606p pVar = new C4606p(activity, fragment, str, i, i2, i3, i4, aVar);
        return pVar;
    }
}
