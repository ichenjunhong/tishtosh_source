package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAction.C8767a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.live.C36093g;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.live.LiveDummyActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.e */
public final class C36104e implements IHostAction {
    public final void openSignActivity(Context context, Intent intent) {
    }

    public final void openTaobaoApp(Context context, String str, C8767a aVar) {
    }

    public final void openVideoDetailPage(String str, String str2) {
    }

    public final void switchToLiveTab(int i, String str) {
    }

    public final boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2) {
        return false;
    }

    public final boolean tryShowKoiRedPackageInLive(String str) {
        return false;
    }

    public final void notifyShowLiveIconEntrance(boolean z) {
        C36148r.m81573a().notifyShowLiveEntrance(z);
    }

    /* renamed from: a */
    private static String m81487a(String str, Bundle bundle) {
        C41311y a = C41311y.m91065a(str);
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                a.mo83870a(str2, obj.toString());
            }
        }
        return a.mo83871a();
    }

    public final void openFeedBack(String str, Context context) {
        Intent crossPlatformActivityIntent = C36148r.m81573a().getCrossPlatformActivityIntent(context);
        StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/rn_main_web/feedback/?hide_nav_bar=1?enter_from=");
        sb.append(str);
        crossPlatformActivityIntent.setData(Uri.parse(sb.toString()));
        crossPlatformActivityIntent.putExtra("hide_nav_bar", true);
        context.startActivity(crossPlatformActivityIntent);
    }

    public final void openUserProfilePage(long j, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(j);
        C41311y a = C41311y.m91065a(sb.toString());
        if (map != null) {
            for (String str : map.keySet()) {
                a.mo83870a(str, (String) map.get(str));
            }
        }
        C41302w.m91042a().mo83861a(a.mo83871a());
    }

    /* renamed from: a */
    private static boolean m81488a(Context context, String str) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("sslocal://showcaseh5")) {
            C36148r.m81573a().showH5QuickShop(context, str);
            return true;
        }
        Intent deepLinkHandlerActivityIntent = C36148r.m81573a().getDeepLinkHandlerActivityIntent(context);
        deepLinkHandlerActivityIntent.setData(Uri.parse(str));
        context.startActivity(deepLinkHandlerActivityIntent);
        return true;
    }

    public final boolean openHostBrowser(String str, Bundle bundle, Context context) {
        Intent crossPlatformActivityIntent = C36148r.m81573a().getCrossPlatformActivityIntent(context);
        crossPlatformActivityIntent.putExtras(bundle);
        crossPlatformActivityIntent.setData(Uri.parse(str));
        context.startActivity(crossPlatformActivityIntent);
        return true;
    }

    public final void openLiveBrowser(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString("title", str2);
        openLiveBrowser(str, bundle, context);
    }

    public final void openUserProfilePage(Context context, long j, Bundle bundle) {
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(j);
        a.mo83861a(sb.toString());
    }

    public final void openLiveBrowser(String str, Bundle bundle, Context context) {
        if (!(context instanceof Activity)) {
            context = C11016e.m22312g();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            bundle.putBoolean("show_progress", false);
            intent.putExtra("intent_type", 1);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        if (!(context instanceof Activity)) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1863814380:
                if (str.equals("//report")) {
                    c = 1;
                    break;
                }
                break;
            case -1813849575:
                if (str.equals("//webview")) {
                    c = 6;
                    break;
                }
                break;
            case -1588030678:
                if (str.equals("//livend/submitfeedbackacitivity")) {
                    c = 7;
                    break;
                }
                break;
            case -570110082:
                if (str.equals("//verify/acitivity")) {
                    c = 3;
                    break;
                }
                break;
            case -262720268:
                if (str.equals("//live/detail")) {
                    c = 2;
                    break;
                }
                break;
            case 337200928:
                if (str.equals("//chargeDeal")) {
                    c = 0;
                    break;
                }
                break;
            case 947267529:
                if (str.equals("//profile")) {
                    c = 5;
                    break;
                }
                break;
            case 1392218355:
                if (str.equals("//item")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                new C36105f().openWallet((Activity) context);
                return true;
            case 1:
                Activity activity = (Activity) context;
                if (activity != null) {
                    StringBuilder sb = new StringBuilder();
                    if (C35837h.m80977b()) {
                        sb.append("https://www.tiktokv.com/aweme/in_app/report/");
                    } else {
                        sb.append("https://musical.ly/report/");
                    }
                    try {
                        sb.append("?object_id=");
                        sb.append(bundle.get("reportVideo.user.id"));
                        sb.append("&owner_id=");
                        sb.append(bundle.get("reportVideo.user.id"));
                        sb.append("&report_type=");
                        sb.append(bundle.get("reportVideo.activity.type"));
                        sb.append("&room_id=");
                        sb.append(bundle.get("reportVideo.media.id"));
                    } catch (Exception unused) {
                    }
                    Intent crossPlatformActivityIntent = C36148r.m81573a().getCrossPlatformActivityIntent(activity);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("show_load_dialog", false);
                    bundle2.putBoolean("hide_nav_bar", true);
                    crossPlatformActivityIntent.putExtras(bundle2);
                    crossPlatformActivityIntent.setData(Uri.parse(sb.toString()));
                    activity.startActivity(crossPlatformActivityIntent);
                    break;
                }
                break;
            case 2:
                Context context2 = context;
                ((C36093g) C12103a.m24530b(C36093g.class)).mo74847c().mo22888a(context2, bundle.getLong("live.intent.extra.ROOM_ID"), bundle, "");
                break;
            case 3:
                str = "aweme://aweme/zhima/live";
                break;
            case 4:
                StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                sb2.append(bundle.get("extra_key_id"));
                str = m81487a(sb2.toString(), bundle);
                break;
            case 5:
                StringBuilder sb3 = new StringBuilder("aweme://user/profile/");
                sb3.append(bundle.get("user_id"));
                str = m81487a(sb3.toString(), bundle);
                break;
            case 6:
                StringBuilder sb4 = new StringBuilder();
                sb4.append("aweme://webview/?url=");
                sb4.append(bundle.get("bundle_open_url"));
                if (bundle.containsKey("title")) {
                    sb4.append("&title=");
                    sb4.append(bundle.get("title"));
                }
                str = sb4.toString();
                break;
            case 7:
                if (bundle != null && bundle.containsKey("roomId")) {
                    Intent submitFeedbackActivityIntent = C36148r.m81573a().getSubmitFeedbackActivityIntent(context);
                    submitFeedbackActivityIntent.putExtra("roomId", bundle.getLong("roomId"));
                    submitFeedbackActivityIntent.putExtra("feedback_id", "6954");
                    submitFeedbackActivityIntent.putExtra("enter_from", "live_end");
                    context.startActivity(submitFeedbackActivityIntent);
                    break;
                }
        }
        return m81488a(context, str);
    }

    public final boolean openHostBrowser(String str, boolean z, String str2, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("aweme://webview/?url=");
        sb.append(str);
        if (z) {
            sb.append("&title=");
            sb.append(str2);
        }
        return m81488a(context, sb.toString());
    }
}
