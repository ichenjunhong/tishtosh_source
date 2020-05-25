package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.C30131ah;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30490m;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.setting.C41526ag;
import com.p683ss.android.ugc.aweme.setting.C41580bb;
import com.p683ss.android.ugc.aweme.share.C41967ak.C41968a;
import com.p683ss.android.ugc.aweme.share.gif.C42016a;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42069am;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42069am.C42071b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42091h;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42096j;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42098k;
import com.p683ss.android.ugc.aweme.share.improve.p2165e.C42167a;
import com.p683ss.android.ugc.aweme.share.p2154e.C42006a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.al */
public final class C41973al extends C42034h {
    public final void syncToToutiao(AppCompatActivity appCompatActivity, boolean z, int i, Intent intent) {
        C52711k.m112240b(appCompatActivity, "activity");
    }

    public final C41526ag getShareSetting() {
        return new C41580bb();
    }

    public final Comparator<C42307b> channelServerOrder() {
        return new C42167a<>(0);
    }

    public final String getMostUseShareChannel() {
        C42006a a = C42006a.m91978a();
        if (a.mo86082a(0) != 0) {
            String[] a2 = a.mo86084a(a.mo86086b(), 0, 100);
            if (a2 != null && a2.length > 0) {
                for (String str : a2) {
                    C42045a aVar = C42044a.f106431a;
                    C42307b a3 = C42045a.m92010a(str, C11016e.m22312g());
                    if (a3 != null && a3.mo86141a(C11010c.m22280a())) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public final String[] getGifImageShareList() {
        String[] strArr;
        C52711k.m112236a((Object) C42006a.m91978a(), "I18nShareOrderUtil.getInstance()");
        if (C42016a.m91989a() == null || C42016a.m91989a().isEmpty()) {
            strArr = new String[]{"messenger", "whatsapp", "sms", "twitter", "reddit", "imgur", "line", "kakaotalk", "more"};
        } else {
            ArrayList arrayList = new ArrayList();
            for (C41978ap apVar : C42016a.m91989a()) {
                arrayList.add(apVar.f106248a);
            }
            if (!C23794bh.m58394h().mo70344b()) {
                arrayList.remove("chat_merge");
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        C52711k.m112236a((Object) strArr, "I18nShareOrderUtil.getInstance().gifShareList");
        return strArr;
    }

    public final boolean isDownloadAction(C42357g gVar) {
        C52711k.m112240b(gVar, "action");
        return gVar instanceof C42098k;
    }

    public final void monitorMuteAudioFailedForUpload(Integer num) {
        C0013i.m16a((Callable<TResult>) new C41971c<TResult>(num));
    }

    public final boolean checkDownloadPermission(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(activity, "context");
        if (C0726c.m2090a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C42071b(activity));
        return false;
    }

    public final void monitorIllegalUrl(String str) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str, "url");
        C23131p.m57776a("save_video_success_rate", 4, new C23088c().mo47824a("errorDesc", "url is illegal").mo47824a("url", str).mo47825b());
    }

    public final Drawable getFirstShareIcon(Activity activity) {
        Drawable drawable;
        C52711k.m112240b(activity, "activity");
        C42006a.m91978a();
        String c = C30130ag.m70703c();
        if (TextUtils.equals(c, "download")) {
            drawable = C0726c.m2091a((Context) activity, (int) R.drawable.dxg);
        } else {
            C42307b a = C42044a.m92009a(c, activity);
            if (a == null || !a.mo86141a(activity)) {
                C42006a a2 = C42006a.m91978a();
                LinkedList linkedList = new LinkedList(Arrays.asList(a2.mo86086b()));
                String[] strArr = new String[linkedList.size()];
                linkedList.toArray(strArr);
                List asList = Arrays.asList(a2.mo86084a(strArr, 0, 10));
                if (!C9376b.m18558a((Collection<T>) asList)) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!TextUtils.equals((String) it.next(), "chat_merge")) {
                            C42307b a3 = C42044a.m92009a(c, activity);
                            if (a3 != null && a3.mo86141a(activity)) {
                                drawable = C0726c.m2091a((Context) activity, a3.mo86131a());
                                break;
                            }
                        }
                    }
                }
                drawable = activity.getResources().getDrawable(R.drawable.ao_);
            } else {
                drawable = C0726c.m2091a((Context) activity, a.mo86131a());
            }
        }
        C52711k.m112236a((Object) drawable, "I18nShareOrderUtil.getIn…stAvailableIcon(activity)");
        return drawable;
    }

    public final void addShareRecord(String str, int i) {
        C52711k.m112240b(str, "channel");
        C42006a.m91978a().mo86083a(str, i);
    }

    public final void checkDownloadStoragePermission(Activity activity, C52670a<C52860x> aVar) {
        C52711k.m112240b(activity, "context");
        C42069am.m92160a(activity, aVar);
    }

    public final boolean checkShareAllowStatus(Aweme aweme, Context context) {
        C52711k.m112240b(context, "context");
        return C42069am.m92164a(aweme, context);
    }

    public final C42307b keyToChannel(String str, Activity activity) {
        C52711k.m112240b(str, "key");
        return C42045a.m92010a(str, activity);
    }

    public final Drawable channelDrawable(Activity activity, String str) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "channelKey");
        C42307b a = C42045a.m92010a(str, activity);
        if (a != null) {
            return C0726c.m2091a((Context) activity, a.mo86131a());
        }
        return null;
    }

    public final String getShortenUrl(ShareInfo shareInfo, String str) {
        C52711k.m112240b(shareInfo, "shareInfo");
        C52711k.m112240b(str, "channel");
        String a = C30131ah.m70705a(shareInfo, str, true);
        C52711k.m112236a((Object) a, "ShareUrlUtils.getShorten…shareInfo, channel, true)");
        return a;
    }

    public final void requestFeedSelfsee(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "aid");
        C30490m mVar = new C30490m(context);
        mVar.mo54799a(new FeedSelfseeNoticeModel());
        mVar.mo44934a_(str);
    }

    public final C42357g getDislikeAction(Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C42096j(aweme, str, str2);
    }

    public final C42357g getCopyAwemeAction(Aweme aweme, String str, boolean z, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        return new C42091h(aweme, str, z, i);
    }

    public final C42357g getDownloadAction(Activity activity, Aweme aweme, String str, String str2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C42098k(activity, aweme, str, str2);
    }

    public final void monitorWaterMarkStatus(String str, String str2, String str3, String str4, String str5, int i) {
        C52711k.m112240b(str4, "isLong");
        C41968a.m91939a(str, str2, str3, str4, str5, i);
    }
}
