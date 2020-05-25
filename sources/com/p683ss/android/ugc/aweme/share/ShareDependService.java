package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36957c;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.share.gif.C42025h;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ShareDependService */
public interface ShareDependService {
    public static final C41922a Companion = C41922a.f106107a;
    public static final int TYPE_STICK_TOP_COMMERCE = 1;
    public static final int TYPE_STICK_TOP_COMMON = 2;
    public static final int TYPE_STICK_TOP_NONE = 0;

    /* renamed from: com.ss.android.ugc.aweme.share.ShareDependService$a */
    public static final class C41922a {

        /* renamed from: a */
        static final /* synthetic */ C41922a f106107a = new C41922a();

        private C41922a() {
        }

        /* renamed from: a */
        public static ShareDependService m91868a() {
            ShareDependService a = C41965ai.m91933a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…ependService::class.java)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ShareDependService$b */
    public static final class C41923b {
        /* renamed from: a */
        public static /* synthetic */ C42307b m91869a(ShareDependService shareDependService, SharePackage sharePackage, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                i = -1;
            }
            return shareDependService.getImChannel(sharePackage, str, i);
        }
    }

    Video aweme2Video(Aweme aweme, Context context);

    boolean consumeLastCheckForceToPrivate();

    String dislikeAweme(Aweme aweme);

    boolean enableGreenScreenMode();

    boolean enhanceVideoShareAction();

    void eventForLiveWallPaper(Aweme aweme, String str);

    C22055c getAVUserImpl(User user);

    C42357g getAdIntraAction(Aweme aweme);

    C42357g getAdSettingAction(Aweme aweme, String str);

    C42357g getAdminOpsAction(Aweme aweme, String str);

    C42357g getBlackListAction(Aweme aweme, String str);

    C42357g getCommentAction(Aweme aweme);

    C42357g getDouShareAction(Activity activity, Aweme aweme, String str);

    C42357g getDuetAction(Aweme aweme, String str);

    C42357g getEnterpriseTopAction(Aweme aweme);

    C42025h getGifShareStrategy();

    C42357g getGreenScreenAction(Aweme aweme, String str);

    String getHotSpot(Context context);

    C42307b getImChannel(SharePackage sharePackage, String str, int i);

    C42357g getInsightAction(Aweme aweme);

    String getLastTabIdI18n();

    C42357g getLiveWallPaperAction(Aweme aweme, String str);

    LongVideo getLongVideo(Aweme aweme);

    C42357g getReactAction(Aweme aweme, String str);

    C42357g getRestrictAction(Aweme aweme, String str);

    C42357g getReuseMvThemeAction(Aweme aweme, String str);

    C42357g getReuseStickerAction(Aweme aweme, String str);

    C42357g getStatusAction(Aweme aweme, String str);

    C42357g getStitchAction(Aweme aweme, String str);

    Intent getWebUriIntent(Context context, Uri uri);

    void handleRocketShare(Context context, SharePackage sharePackage, C23371a<Boolean> aVar);

    boolean isCanDownloadLongVideo(Aweme aweme);

    boolean isEnterpriseUserVideo(Aweme aweme);

    void isShareDownloading(boolean z);

    boolean isShowLiveWallpaper(Aweme aweme);

    void logForAdShare(Context context, Aweme aweme, C42307b bVar, String str);

    void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar);

    void onEventV3IncludingPoiParams(C39067g gVar, String str, C23089d dVar);

    SharePackage parseMicroAppSharePackage(C36957c cVar, Context context);

    String poiDisplayCount(Context context, PoiStruct poiStruct);

    void saveShareChannel(C42307b bVar);

    C42359h scoopShareDialogWithImModule(Activity activity, C42348d dVar, int i);

    Dialog scoopShareDialogWithNewSharePanel(Activity activity, ShareChannelBar shareChannelBar, C42348d dVar, int i);

    boolean shouldForbiddenWaterMark(Aweme aweme);

    int shouldStickVideoTop(Aweme aweme);

    void showNoPermissionDialog(int i, int i2, Activity activity);

    void showReportDialog(Aweme aweme, String str, Context context, String str2);

    void startPrivacySetting(Context context, Aweme aweme, String str, String str2, String str3);

    void startPrivacySettingActivity(Aweme aweme, Context context);

    void startQrCodeActivityV2(Context context, C40952c cVar);

    void toBindActivity(Context context, String str);

    boolean whetherShowForwardView(Aweme aweme, Fragment fragment);
}
