package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.uikit.dialog.C4220b;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4817a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4819aa;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4824ad;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4825ae;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4826af;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4827ag;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4828ah;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4829ai;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4836an;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4837ao;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4840aq;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4841ar;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4854ax;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4889bp;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4891bq;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4895e;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4896f;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4898g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4900h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4904k;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4943x;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4944y;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4945z.C4946a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4945z.C4947b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4945z.C4948c;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.OpenCashVerifyMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ResetHostVerifyMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SendRedEnvelopSuccessMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4773a;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4777d;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4781f;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4787h;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4789i;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4790j;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4792l;
import com.bytedance.android.livesdk.browser.p289c.C4696a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10797l;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p677b.C10807s;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.b */
public final class C4769b implements C4696a {

    /* renamed from: a */
    private static List<String> f12977a;

    /* renamed from: b */
    private static List<String> f12978b;

    /* renamed from: c */
    private C10805r f12979c;

    /* renamed from: d */
    private C10807s f12980d;

    /* renamed from: e */
    private WeakReference<Context> f12981e;

    /* renamed from: f */
    private WeakReference<C4220b> f12982f;

    /* renamed from: g */
    private Activity f12983g;

    /* renamed from: a */
    public final C10805r mo10483a() {
        return this.f12979c;
    }

    /* renamed from: c */
    public final C10807s mo10593c() {
        return this.f12980d;
    }

    /* renamed from: b */
    public final void mo10484b() {
        this.f12979c.mo19580a();
        this.f12980d.mo19587a();
    }

    /* renamed from: d */
    public final void mo10594d() {
        C4220b bVar;
        if (this.f12982f != null) {
            bVar = (C4220b) this.f12982f.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: f */
    private static List<String> m11330f() {
        if (f12978b != null) {
            return f12978b;
        }
        ArrayList arrayList = new ArrayList();
        f12978b = arrayList;
        arrayList.add("config");
        f12978b.add("appInfo");
        f12978b.add("login");
        f12978b.add("logout");
        f12978b.add("close");
        f12978b.add("gallery");
        f12978b.add("toggleGalleryBars");
        f12978b.add("slideShow");
        f12978b.add("relatedShow");
        f12978b.add("toast");
        f12978b.add("slideDownload");
        f12978b.add("requestChangeOrientation");
        f12978b.add("adInfo");
        return f12978b;
    }

    /* renamed from: e */
    public static List<String> m11329e() {
        if (f12977a != null) {
            return f12977a;
        }
        ArrayList arrayList = new ArrayList();
        f12977a = arrayList;
        arrayList.add("snssdk.com");
        f12977a.add("toutiao.com");
        f12977a.add("neihanshequ.com");
        f12977a.add("youdianyisi.com");
        f12977a.add("admin.bytedance.com");
        f12977a.add("bytecdn.cn");
        f12977a.add("fe.byted.org");
        f12977a.add("jinritemai.com");
        f12977a.add("chengzijianzhan.com");
        f12977a.add("bytedance.net");
        f12977a.add("amemv.com");
        f12977a.add("live.bytedance.com");
        f12977a.add("test-live.bytedance.com");
        f12977a.add("live.juliangyinqing.com");
        f12977a.add("huoshan.com");
        f12977a.add("ixigua.com");
        f12977a.add("musical.ly");
        f12977a.add("tiktokv.com");
        f12977a.add("hypstar.com");
        f12977a.add("pstatp.com");
        f12977a.add("bytedance.net");
        f12977a.add("tiktok.com");
        f12977a.add("boe-gateway.byted.org");
        f12977a.add("s16a.tiktokcdn.com");
        List<String> list = (List) LiveConfigSettingKeys.LIVE_JS_WHITE_LIST.mo9431a();
        if (!C9414h.m18630a(list)) {
            for (String str : list) {
                if (!f12977a.contains(str)) {
                    f12977a.add(str);
                }
            }
        }
        f12977a.addAll(TTLiveSDKContext.getHostService().mo10316i().mo15569a());
        return f12977a;
    }

    /* renamed from: a */
    public final void mo10592a(String str, Callback callback) {
        C4220b bVar;
        if (!C9431p.m18664a(str) && callback != null) {
            Activity a = C3889d.m9831a((Context) this.f12981e.get());
            if (a != null) {
                if (this.f12982f != null) {
                    bVar = (C4220b) this.f12982f.get();
                } else {
                    bVar = null;
                }
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                C4221a aVar = new C4221a(a);
                aVar.mo9684a((int) R.string.ebr);
                aVar.mo9695b((CharSequence) a.getString(R.string.ebq, new Object[]{str}));
                C4772c cVar = new C4772c(callback, str);
                aVar.mo9694b(R.string.ebp, cVar);
                aVar.mo9685a((int) R.string.ebo, (OnClickListener) cVar);
                aVar.mo9691a(false);
                this.f12982f = new WeakReference<>(aVar.mo9696b());
            }
        }
    }

    private C4769b(Activity activity, C10805r rVar, C10807s sVar) {
        this.f12983g = activity;
        this.f12981e = new WeakReference<>(activity);
        this.f12979c = rVar;
        this.f12980d = sVar;
        C4789i iVar = new C4789i(this.f12981e);
        C10805r rVar2 = this.f12979c;
        rVar2.f29032d = this.f12980d;
        rVar2.mo19579a("appInfo", (C10782e<?, ?>) new C4896f<Object,Object>()).mo19579a("getXTtToken", (C10782e<?, ?>) new C4943x<Object,Object>()).mo19579a("userInfo", (C10782e<?, ?>) new C4889bp<Object,Object>()).mo19579a("apiParam", (C10782e<?, ?>) new C4895e<Object,Object>()).mo19579a("toast", (C10782e<?, ?>) new ToastMethod<Object,Object>()).mo19579a("sendRedEnvelopSuccess", (C10782e<?, ?>) new SendRedEnvelopSuccessMethod<Object,Object>()).mo19579a("sendLogV3", (C10782e<?, ?>) new C4840aq<Object,Object>()).mo19579a("sendLogV1", (C10782e<?, ?>) new C4841ar<Object,Object>()).mo19579a("sendMonitor", (C10782e<?, ?>) new C4824ad<Object,Object>()).mo19579a("setBannerVisibility", (C10782e<?, ?>) new C4898g<Object,Object>()).mo19579a("baseInfo", (C10782e<?, ?>) new C4900h<Object,Object>()).mo19579a("close", (C10782e<?, ?>) new C4904k<Object,Object>(this.f12983g)).mo19579a("openStickerDonationList", (C10782e<?, ?>) new C4828ah<Object,Object>()).mo19579a("isTeenMode", (C10782e<?, ?>) new C4944y<Object,Object>()).mo19579a("sendPokemon", (C10782e<?, ?>) new C4819aa<Object,Object>()).mo19579a("statusNotification", (C10782e<?, ?>) new C4825ae<Object,Object>()).mo19578a("sendGift", C4795d.f13013a).mo19579a("payPanel", (C10782e<?, ?>) new C4829ai<Object,Object>()).mo19579a("registerMessage", (C10782e<?, ?>) new C4836an<Object,Object>()).mo19578a("download", C4802k.f13020a).mo19578a("cashdesk", C4803l.f13021a).mo19578a("liveLoading", C4804m.f13022a).mo19578a("userAction", C4805n.f13023a).mo19578a("fetch", C4949o.f13283a).mo19578a("fetchPb", C4950p.f13284a).mo19578a("app.showModal", C4951q.f13285a).mo19578a("login", C4952r.f13286a).mo19578a("setFansStatus", C4796e.f13014a).mo19578a("verifyZhimaCredit", C4797f.f13015a).mo19578a("portalAction", C4798g.f13016a).mo19578a("lotteryAction", C4799h.f13017a).mo19578a("dialog", C4800i.f13018a).mo19578a("comment", C4801j.f13019a).mo19579a("resetHostVerify", (C10782e<?, ?>) new ResetHostVerifyMethod<Object,Object>()).mo19579a("saveLocalData", (C10782e<?, ?>) new C4837ao<Object,Object>()).mo19579a("openCashVerify", (C10782e<?, ?>) new OpenCashVerifyMethod<Object,Object>()).mo19579a("showDouPlusDialog", (C10782e<?, ?>) new C4854ax<Object,Object>()).mo19579a("openKoiRedpacket", (C10782e<?, ?>) new C4827ag<Object,Object>()).mo19579a("addRedDot", (C10782e<?, ?>) new C4817a<Object,Object>()).mo19579a("notifyBoxOpened", (C10782e<?, ?>) new C4826af<Object,Object>()).mo19579a("webviewNavigation", (C10782e<?, ?>) new C4891bq<Object,Object>(this.f12979c.f29031c));
        this.f12979c.mo19579a("setStorage", (C10782e<?, ?>) new C4948c<Object,Object>()).mo19579a("getStorage", (C10782e<?, ?>) new C4946a<Object,Object>()).mo19579a("removeStorage", (C10782e<?, ?>) new C4947b<Object,Object>());
        this.f12980d.mo19585a("openHotsoon", (C10762d) iVar).mo19585a("openLive", (C10762d) iVar).mo19585a("userStatusChange", (C10762d) new C4792l()).mo19585a("livePay", (C10762d) new C4781f(this.f12981e)).mo19585a("liveCashVerify", (C10762d) new C4777d(this.f12981e, this.f12980d)).mo19585a("openLiveRecharge", (C10762d) new C4790j()).mo19585a("copyToClipboard", (C10762d) new C4773a((Context) this.f12981e.get()));
        this.f12980d.mo19585a("openBindPhone", (C10762d) new C4787h(this.f12981e));
    }

    /* renamed from: a */
    public static C4769b m11328a(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        C10805r a = C10805r.m21921a(webView).mo19539a((Context) activity).mo19541a((C10797l) new C10797l() {
            /* renamed from: a */
            public final <T> String mo10596a(T t) {
                return C2942b.m8369a().mo34889b(t);
            }

            /* renamed from: a */
            public final <T> T mo10595a(String str, Type type) {
                return C4514j.m10883j().mo10320a().mo34885a(str, type);
            }
        }).mo19548b(false).mo19549c(true).mo19544a((Collection<String>) m11329e()).mo19543a("ToutiaoJSBridge").mo19546a();
        return new C4769b(activity, a, C10807s.m21932a(webView, a).mo19588b("bytedance").mo19584a(webViewClient).mo19583a(webChromeClient).mo19589b(m11329e()).mo19586a(m11330f()));
    }
}
