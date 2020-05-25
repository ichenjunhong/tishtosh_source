package com.bytedance.android.livesdk.p426x;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.setting.C4086h;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C4496ab;
import com.bytedance.android.livesdk.C6752f;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.browser.p290d.C4720h;
import com.bytedance.android.livesdk.chatroom.C4995b;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.p393a.C7743a;
import com.bytedance.android.livesdk.message.p396a.C7774b;
import com.bytedance.android.livesdk.message.p396a.C7775c;
import com.bytedance.android.livesdk.message.p397b.C7779b;
import com.bytedance.android.livesdk.message.p397b.C7780c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.widget.C8502b;
import com.bytedance.android.livesdk.widget.p424b.C8506c;
import com.bytedance.android.livesdkapi.C8608c;
import com.bytedance.android.livesdkapi.depend.live.C8638a;
import com.bytedance.android.livesdkapi.depend.live.C8643b;
import com.bytedance.android.livesdkapi.depend.live.C8644c;
import com.bytedance.android.livesdkapi.depend.live.C8645d;
import com.bytedance.android.livesdkapi.depend.live.C8647f;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.live.C8663m;
import com.bytedance.android.livesdkapi.depend.live.C8667q;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.p431c.C8610b;
import com.bytedance.android.livesdkapi.p449g.C8746b;
import com.bytedance.android.livesdkapi.p455i.C8818h;
import com.bytedance.android.livesdkapi.p457k.C8832a;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.android.livesdkapi.service.C8860c;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.android.livesdkapi.service.C8863f;
import com.bytedance.android.p160b.C2833b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.ugc.live.sdk.message.MessageManagerFactory;
import com.p683ss.ugc.live.sdk.message.data.Configuration;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.x.c */
public final class C8567c implements C8862e {

    /* renamed from: a */
    private final C8746b f23500a = C8569d.f23505a;

    /* renamed from: b */
    private C8683f f23501b;

    /* renamed from: c */
    private C8667q f23502c;

    /* renamed from: d */
    private final C8863f f23503d = new C8863f() {
        /* renamed from: a */
        public final int mo15063a() {
            return ((Integer) C4639e.m11122a().f12651b).intValue();
        }

        /* renamed from: a */
        public final void mo15064a(C4641g<Integer> gVar) {
            C4639e.m11122a().mo10413a(gVar);
        }
    };

    /* renamed from: b */
    public final Fragment mo15046b(Context context, Bundle bundle) {
        return null;
    }

    /* renamed from: i */
    public final int mo15056i() {
        return R.drawable.e3f;
    }

    /* renamed from: j */
    public final int mo15057j() {
        return R.string.h03;
    }

    /* renamed from: a */
    public final void mo15038a(Context context) {
        ((IGiftService) C4116c.m10249a(IGiftService.class)).initGiftResourceManager(context);
    }

    /* renamed from: a */
    public final void mo15035a() {
        ((IGiftService) C4116c.m10249a(IGiftService.class)).syncGiftList(1);
    }

    /* renamed from: a */
    public final void mo15042a(String str, boolean z) {
        ((IGiftService) C4116c.m10249a(IGiftService.class)).openGiftDialog(str, z);
    }

    /* renamed from: a */
    public final void mo15044a(boolean z) {
        C4495a.m10823a().mo10301a((Object) new C5182ba(2, z));
    }

    /* renamed from: a */
    public final void mo15043a(Locale locale) {
        C7676b.m15696a().mo14037a(locale);
    }

    /* renamed from: a */
    public final boolean mo15045a(Context context, Uri uri) {
        return C4514j.m10883j().mo10328i().handleWithoutHost(context, uri.toString());
    }

    /* renamed from: a */
    public final void mo15041a(String str) {
        C4514j.m10883j().mo10324e().f21348a = new C7743a(str);
    }

    /* renamed from: a */
    public final void mo15036a(long j, C8859b bVar) {
        if (bVar != null) {
            ((RoomStatApi) C4157e.m10322a().mo9550a(RoomStatApi.class)).checkRoom(String.valueOf(j)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8570e<Object>(bVar), (C1710e<? super Throwable>) new C8571f<Object>(bVar));
        }
    }

    /* renamed from: a */
    public final void mo15037a(long j, C8860c cVar) {
        if (cVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j));
            ((RoomRetrofitApi) C4157e.m10322a().mo9550a(RoomRetrofitApi.class)).fetchRoom(hashMap).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8572g<Object>(cVar), (C1710e<? super Throwable>) new C8573h<Object>(cVar));
        }
    }

    /* renamed from: a */
    public final void mo15040a(Context context, C8818h hVar) {
        String str;
        String str2 = (String) LiveConfigSettingKeys.LIVE_REPORT_URL.mo9431a();
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                Builder buildUpon = Uri.parse(str2).buildUpon();
                buildUpon.appendQueryParameter("room_id", String.valueOf(hVar.f24071a));
                buildUpon.appendQueryParameter("anchor_id", String.valueOf(hVar.f24072b));
                if (TextUtils.isEmpty(hVar.f24074d)) {
                    buildUpon.appendQueryParameter("reported_user_id", String.valueOf(hVar.f24073c));
                } else {
                    buildUpon.appendQueryParameter("sec_reported_user_id", hVar.f24074d);
                }
                buildUpon.appendQueryParameter("report_type", hVar.f24076f);
                buildUpon.appendQueryParameter("request_page", hVar.f24075e);
                if ("comment".equals(hVar.f24076f)) {
                    buildUpon.appendQueryParameter("chat_type", "1");
                    if (hVar.f24077g > 0) {
                        buildUpon.appendQueryParameter("msg_id", String.valueOf(hVar.f24077g));
                    }
                    if (!TextUtils.isEmpty(hVar.f24078h)) {
                        buildUpon.appendQueryParameter(C42311c.f106865i, hVar.f24078h);
                    }
                }
                str = buildUpon.toString();
            }
            C4700b e = C4704c.m11226a(str).mo10511a(0, 0, 0, 0).mo10521f(0).mo10514b((int) C3922z.m9914e((int) ((((float) C3922z.m9908b()) * 3.0f) / 4.0f))).mo10510a((int) C3922z.m9914e(C3922z.m9910c())).mo10520e(80);
            C3805a aVar = (C3805a) C4116c.m10249a(C3805a.class);
            C4104a aVar2 = null;
            C4697b webViewManager = aVar != null ? aVar.webViewManager() : null;
            if (webViewManager != null) {
                aVar2 = webViewManager.mo10487a(e);
            }
            if (aVar2 != null && (context instanceof FragmentActivity)) {
                C4104a.m10232a((FragmentActivity) context, aVar2);
            }
        }
    }

    /* renamed from: a */
    public final void mo15039a(Context context, C8633b bVar) {
        C8818h hVar = new C8818h(bVar.f23624c, bVar.f23625d, bVar.f23625d, bVar.f23644w, "share");
        mo15040a(context, hVar);
    }

    /* renamed from: a */
    public final String mo15034a(long j, Bundle bundle, Context context) {
        C2833b warmUp = ((C4139d) C4116c.m10249a(C4139d.class)).warmUp(j, bundle, context);
        if (warmUp != null) {
            return warmUp.getPlayerTag();
        }
        return null;
    }

    /* renamed from: a */
    public final <T> T mo15033a(String str, T t) {
        return C4098q.m10215a("key_ttlive_sdk_setting", str, t.getClass(), t);
    }

    /* renamed from: b */
    public final C8863f mo15048b() {
        return this.f23503d;
    }

    /* renamed from: f */
    public final Fragment mo15053f() {
        return new C4086h();
    }

    /* renamed from: g */
    public final C8644c mo15054g() {
        return C8565a.m16905a();
    }

    /* renamed from: m */
    public final C8608c mo15060m() {
        return C4995b.m11478a();
    }

    /* renamed from: n */
    public final C8647f mo15061n() {
        return C8566b.m16908a();
    }

    /* renamed from: o */
    public final C8663m mo15062o() {
        return C8574i.m16953b();
    }

    /* renamed from: c */
    public final C8661k mo15050c() {
        return (C8661k) C4116c.m10249a(C4193l.class);
    }

    /* renamed from: d */
    public final C8649h mo15051d() {
        return ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
    }

    /* renamed from: e */
    public final C8640b mo15052e() {
        return ((IGiftService) C4116c.m10249a(IGiftService.class)).giftPlayControllerManager();
    }

    /* renamed from: k */
    public final C8667q mo15058k() {
        if (this.f23502c == null) {
            this.f23502c = new C4496ab();
        }
        return this.f23502c;
    }

    /* renamed from: h */
    public final C8683f mo15055h() {
        if (this.f23501b == null) {
            this.f23501b = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager();
        }
        return this.f23501b;
    }

    /* renamed from: l */
    public final String mo15059l() {
        IBroadcastService iBroadcastService = (IBroadcastService) C4116c.m10249a(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getLiveCoreVersion();
    }

    /* renamed from: b */
    public final C8610b mo15047b(Bundle bundle) {
        C4720h hVar = new C4720h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: b */
    public final void mo15049b(String str) {
        ((C4139d) C4116c.m10249a(C4139d.class)).stopRoomPlayer(str, false);
        ((C4139d) C4116c.m10249a(C4139d.class)).recycleRoomPlayer(str);
    }

    /* renamed from: a */
    public final C8677a mo15030a(Bundle bundle) {
        return ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createBgBroadcastFragment(bundle);
    }

    /* renamed from: a */
    public final C8682e mo15031a(C8832a aVar) {
        return ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createStartLiveFragment(aVar);
    }

    /* renamed from: a */
    public final C8643b mo15027a(Context context, ViewGroup viewGroup) {
        return new C8502b(context, viewGroup);
    }

    /* renamed from: a */
    public final Fragment mo15024a(Context context, Bundle bundle) {
        return ((IWalletService) C4116c.m10249a(IWalletService.class)).getWalletFragment(context, bundle);
    }

    /* renamed from: a */
    public final Fragment mo15025a(C8680c cVar, Bundle bundle) {
        return ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createLiveBroadcastFragment(cVar, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.LiveActivityProxy mo15026a(android.support.p030v4.app.FragmentActivity r3, int r4) {
        /*
            r2 = this;
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            com.bytedance.android.live.broadcast.IXTBroadcastService r0 = r0.getXTBroadcastService()
            r1 = 19
            if (r4 == r1) goto L_0x0050
            r1 = 21
            if (r4 == r1) goto L_0x0043
            switch(r4) {
                case 7: goto L_0x0036;
                case 8: goto L_0x002f;
                case 9: goto L_0x0029;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r4) {
                case 16: goto L_0x0022;
                case 17: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0057
        L_0x001b:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTBroadcastResDownloadActivityProxy(r3)
            goto L_0x0058
        L_0x0022:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTBroadcastBeforeActivityProxy(r3)
            goto L_0x0058
        L_0x0029:
            com.bytedance.android.livesdk.sign.BroadcastSigningActivityProxy r4 = new com.bytedance.android.livesdk.sign.BroadcastSigningActivityProxy
            r4.<init>(r3)
            goto L_0x0034
        L_0x002f:
            com.bytedance.android.livesdk.verify.VerifyActivityProxy r4 = new com.bytedance.android.livesdk.verify.VerifyActivityProxy
            r4.<init>(r3)
        L_0x0034:
            r3 = r4
            goto L_0x0058
        L_0x0036:
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r4 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.broadcast.api.IBroadcastService r4 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r4
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r4.createStartLiveActivityProxy(r3)
            goto L_0x0058
        L_0x0043:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r4.getLiveBillingActivityProxy(r3)
            goto L_0x0058
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTMediaStartLiveProxy(r3)
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p426x.C8567c.mo15026a(android.support.v4.app.FragmentActivity, int):com.bytedance.android.livesdkapi.LiveActivityProxy");
    }

    /* renamed from: a */
    public final C8657i mo15029a(long j, Bundle bundle) {
        String str;
        String str2;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        C7743a a = C4514j.m10883j().mo10324e().mo14109a(false);
        if (a == null || TextUtils.isEmpty(a.f21289a) || (!a.f21289a.equals(C8638a.FEED.typeName) && !a.f21289a.equals(C8638a.FEED_WITH_PREVIEW.typeName))) {
            String string = bundle2.getString("enter_from", "");
            String string2 = bundle2.getString("enter_from_merge", "");
            String string3 = bundle2.getString("enter_method", "");
            Bundle bundle3 = bundle2.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle3 == null) {
                str = "";
            } else {
                str = bundle3.getString("enter_from_merge", "");
            }
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(string)) {
                    StringBuilder sb = new StringBuilder("from_");
                    sb.append(string);
                    str2 = sb.toString();
                } else if (!TextUtils.isEmpty(string2)) {
                    StringBuilder sb2 = new StringBuilder("from_merge_");
                    sb2.append(string2);
                    str2 = sb2.toString();
                } else if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb3 = new StringBuilder("extra_from_merge_");
                    sb3.append(str);
                    str2 = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder("method_");
                    sb4.append(string3);
                    str2 = sb4.toString();
                }
                C4514j.m10883j().mo10324e().f21348a = new C7743a(str2);
            }
        }
        bundle2.putLong("live.intent.extra.ROOM_ID", j);
        C6752f fVar = new C6752f();
        fVar.setArguments(bundle2);
        return fVar;
    }

    /* renamed from: a */
    public final C8645d mo15028a(Context context, ViewGroup viewGroup, long j) {
        return new C8506c(context, viewGroup, j);
    }

    /* renamed from: a */
    public final IMessageManager mo15032a(long j, Context context, String str) {
        C7774b bVar = new C7774b(false);
        C7774b bVar2 = bVar;
        bVar2.mo14119a(j, context);
        if (!TextUtils.isEmpty(str)) {
            bVar2.f21366a = str;
        }
        return MessageManagerFactory.get(new Configuration().setHttpClient(bVar).setMessageConverter(new C7775c()).addInterceptor(new C7780c(j)).addInterceptor(new C7779b()).setAnchor(false).setEnablePriority(false).setEnableSmoothlyDispatch(true));
    }
}
