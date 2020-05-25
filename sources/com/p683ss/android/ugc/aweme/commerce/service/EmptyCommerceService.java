package com.p683ss.android.ugc.aweme.commerce.service;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.kit.p644rn.core.C10464d;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25561f;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25564h;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25565i;
import com.p683ss.android.ugc.aweme.commerce.service.p1534a.C25540a;
import com.p683ss.android.ugc.aweme.commerce.service.p1536b.C25541a;
import com.p683ss.android.ugc.aweme.commerce.service.p1538d.C25544a;
import com.p683ss.android.ugc.aweme.commerce.service.p1540f.C25547a;
import com.p683ss.android.ugc.aweme.commerce.service.p1541g.C25548a;
import com.p683ss.android.ugc.aweme.commerce.service.p1542h.C25549a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25881am;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1632di.C27654cn;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41288m;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService */
public class EmptyCommerceService implements ICommerceService {
    public static final C25534a Companion = new C25534a(null);

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$a */
    public static final class C25534a {
        private C25534a() {
        }

        public /* synthetic */ C25534a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$b */
    public static final class C25535b implements C41288m {
        C25535b() {
        }

        /* renamed from: a */
        public final boolean mo47180a(Activity activity, String str) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo47181a(Activity activity, String str, View view) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo47182a(String str) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$c */
    public static final class C25536c implements C25544a {
        C25536c() {
        }

        /* renamed from: a */
        public final int mo52277a(Aweme aweme) {
            C52711k.m112240b(aweme, "aweme");
            return -1;
        }

        /* renamed from: a */
        public final void mo52278a(C25881am amVar, Aweme aweme, C0654k kVar) {
            C52711k.m112240b(aweme, "aweme");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$d */
    public static final class C25537d implements C25881am {
        C25537d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$e */
    public static final class C25538e implements C25548a {
        C25538e() {
        }
    }

    public static ICommerceService provideICommerceService_Monster() {
        if (C27991b.f73429M == null) {
            synchronized (ICommerceService.class) {
                if (C27991b.f73429M == null) {
                    C27991b.f73429M = C27654cn.m66325a();
                }
            }
        }
        return (ICommerceService) C27991b.f73429M;
    }

    public void checkLawHint(Context context, long j, C52682m<? super Boolean, ? super Boolean, C52860x> mVar) {
        C52711k.m112240b(mVar, "callback");
    }

    public void checkShopDraft(String str) {
        C52711k.m112240b(str, "draftId");
    }

    public void checkShoppingAssistantStatus(String str, C52671b<? super Object, C52860x> bVar) {
        C52711k.m112240b(str, "from");
        C52711k.m112240b(bVar, "callBack");
    }

    public C23526a createCollectGoodsFragment() {
        return null;
    }

    public Aweme getAwemeById(String str) {
        return null;
    }

    public C10464d getBulletFootprintPackageInstance() {
        return null;
    }

    public String getButtonType(C25561f fVar, boolean z) {
        return "";
    }

    public C25547a getECSlideSettingPageHolder() {
        return null;
    }

    public void goBindTaobao(String str, Context context) {
        C52711k.m112240b(str, "schema");
    }

    public void gotoGoodShop(C25564h hVar, String str, String str2, String str3) {
        C52711k.m112240b(str, "entranceLocation");
        C52711k.m112240b(str2, "enterMethod");
        C52711k.m112240b(str3, "awemeId");
    }

    public boolean gotoPortfolio(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map) {
        C52711k.m112240b(activity, "activity");
        return true;
    }

    public boolean gotoSeedPage(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map) {
        C52711k.m112240b(activity, "activity");
        return true;
    }

    public void initCommerce(Context context, C25541a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "environment");
    }

    public void launchPayTest(Context context) {
        C52711k.m112240b(context, "context");
    }

    public void logAndStartPreview(Context context, Aweme aweme, String str, long j, User user, String str2, String str3, String str4, String str5, long j2, String str6, boolean z) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(user, "author");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "enterMethod");
        C52711k.m112240b(str4, "destination");
        C52711k.m112240b(str5, "carrierType");
    }

    public void logCloseTransformCardEvent(C25519e eVar, Aweme aweme, String str) {
        C52711k.m112240b(eVar, "simplePromotion");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
    }

    public void logCommerceEvents(String str, C25560e eVar) {
        C52711k.m112240b(str, "event");
    }

    public void logCommerceTag(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
    }

    public void onFeedAnchorClick(Context context, Aweme aweme, String str, long j, User user, boolean z, String str2, String str3, String str4, String str5, long j2, String str6) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(user, "author");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "enterMethod");
        C52711k.m112240b(str4, "destination");
        C52711k.m112240b(str5, "carrierType");
    }

    public void openApp(long j, Activity activity, String str, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "jumpAppSuccess");
    }

    public void openTaobao(Context context, String str, String str2, String str3, String str4, String str5, String str6, C52682m<? super Boolean, ? super Boolean, C52860x> mVar) {
        C52711k.m112240b(context, "fromAct");
    }

    public void openThirdPlatform(Activity activity, C25549a aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "thirdParam");
    }

    public void parseCommerceSetting(JSONObject jSONObject) {
    }

    public void requestForShoppingAccess(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
    }

    public void schemaToGoodDetail(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, boolean z, String str16, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        Activity activity2 = activity;
        C52711k.m112240b(activity, "fromAct");
    }

    public void schemaToOrderShare(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C52711k.m112240b(activity, "fromAct");
    }

    public void schemaToPortfolio(Activity activity, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        C52711k.m112240b(activity, "fromAct");
    }

    public void schemaToSeeding(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        Activity activity2 = activity;
        C52711k.m112240b(activity, "fromAct");
    }

    public void startPreview(Context context, C25565i iVar) {
        C52711k.m112240b(iVar, "previewParams");
    }

    public void tryCheckRealName(Context context, String str, String str2, C25540a aVar) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
    }

    public C41288m generateRegisterRouter() {
        return new C25535b();
    }

    public C25544a getECPlayerControllerService() {
        return new C25536c();
    }

    public C25548a getSettingPageService() {
        return new C25538e();
    }

    public C25881am getECVideoViewHolder(Context context, FrameLayout frameLayout, int i, C30669b bVar, String str) {
        C52711k.m112240b(context, "context");
        return new C25537d();
    }
}
