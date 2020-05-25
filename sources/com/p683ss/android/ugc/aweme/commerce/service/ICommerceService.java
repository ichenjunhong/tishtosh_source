package com.p683ss.android.ugc.aweme.commerce.service;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.kit.p644rn.core.C10464d;
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
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41288m;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.ICommerceService */
public interface ICommerceService {
    void checkLawHint(Context context, long j, C52682m<? super Boolean, ? super Boolean, C52860x> mVar);

    void checkShopDraft(String str);

    void checkShoppingAssistantStatus(String str, C52671b<? super Object, C52860x> bVar);

    C23526a createCollectGoodsFragment();

    C41288m generateRegisterRouter();

    Aweme getAwemeById(String str);

    C10464d getBulletFootprintPackageInstance();

    String getButtonType(C25561f fVar, boolean z);

    C25544a getECPlayerControllerService();

    C25547a getECSlideSettingPageHolder();

    C25881am getECVideoViewHolder(Context context, FrameLayout frameLayout, int i, C30669b bVar, String str);

    C25548a getSettingPageService();

    void goBindTaobao(String str, Context context);

    void gotoGoodShop(C25564h hVar, String str, String str2, String str3);

    boolean gotoPortfolio(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map);

    boolean gotoSeedPage(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map);

    void initCommerce(Context context, C25541a aVar);

    void launchPayTest(Context context);

    void logAndStartPreview(Context context, Aweme aweme, String str, long j, User user, String str2, String str3, String str4, String str5, long j2, String str6, boolean z);

    void logCloseTransformCardEvent(C25519e eVar, Aweme aweme, String str);

    void logCommerceEvents(String str, C25560e eVar);

    void logCommerceTag(Context context, Aweme aweme, String str);

    void onFeedAnchorClick(Context context, Aweme aweme, String str, long j, User user, boolean z, String str2, String str3, String str4, String str5, long j2, String str6);

    void openApp(long j, Activity activity, String str, C52671b<? super Boolean, C52860x> bVar);

    void openTaobao(Context context, String str, String str2, String str3, String str4, String str5, String str6, C52682m<? super Boolean, ? super Boolean, C52860x> mVar);

    void openThirdPlatform(Activity activity, C25549a aVar);

    void parseCommerceSetting(JSONObject jSONObject);

    void requestForShoppingAccess(Context context, String str);

    void schemaToGoodDetail(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, boolean z, String str16, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23);

    void schemaToOrderShare(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void schemaToPortfolio(Activity activity, String str, String str2, String str3, String str4, String str5, long j, String str6);

    void schemaToSeeding(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21);

    void startPreview(Context context, C25565i iVar);

    void tryCheckRealName(Context context, String str, String str2, C25540a aVar);
}
