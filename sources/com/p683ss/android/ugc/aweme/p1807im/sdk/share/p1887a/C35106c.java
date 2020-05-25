package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareChallengeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCouponContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodWindowContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMiniAppContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareWebContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35205as;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35405k.C35409a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.share.ImWebSharePackage;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53755c;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.c */
public final class C35106c {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.c$a */
    public interface C35109a {
        void onShare(String str);
    }

    /* renamed from: a */
    public static boolean m79333a(SharePackage sharePackage) {
        return TextUtils.equals("aweme", sharePackage.f106895d);
    }

    /* renamed from: c */
    private static ShareAwemeContent m79336c(SharePackage sharePackage) {
        if (sharePackage.f106900i.getInt("aweme_type") == 2) {
            return SharePictureContent.fromSharePackage(sharePackage);
        }
        return ShareAwemeContent.fromSharePackage(sharePackage);
    }

    /* renamed from: b */
    public static BaseContent m79334b(SharePackage sharePackage) {
        String str = sharePackage.f106895d;
        if (TextUtils.equals("aweme", str)) {
            return m79336c(sharePackage);
        }
        if (TextUtils.equals("poi", str)) {
            return SharePoiContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("music", str)) {
            return ShareMusicContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("challenge", str)) {
            return ShareChallengeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("ranking", str)) {
            return ShareRankingListContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("game", str)) {
            return ShareMiniAppContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("user", str)) {
            return ShareUserContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("web", str)) {
            return ShareWebContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals(CustomActionPushReceiver.f104061f, str)) {
            return ShareLiveContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("story_reply", str)) {
            return StoryReplyContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("story_self_reply", str)) {
            return SelfStoryReplyContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("coupon", str)) {
            return ShareCouponContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("good", str)) {
            return ShareGoodContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("good_window", str)) {
            return ShareGoodWindowContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("mix", str)) {
            return ShareCompilationContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("sticker", str)) {
            return ShareStickerContent.fromSharePackage(sharePackage);
        }
        return null;
    }

    /* renamed from: b */
    private static void m79335b(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String string = sharePackage.f106900i.getString("aid");
        C53755c a = C53755c.m114319a();
        C35471h hVar = new C35471h(iMContact, z, sharePackage.f106895d, sharePackage.f106900i.getString("enter_from"), string);
        a.mo112960d(hVar);
    }

    /* renamed from: a */
    public static void m79328a(IMUser iMUser, String str, BaseContent baseContent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C35237bj.m79649a().mo73347b(iMUser.getUid(), (List<BaseContent>) arrayList);
    }

    /* renamed from: a */
    private static void m79329a(SharePackage sharePackage, IMContact iMContact, boolean z) {
        if (TextUtils.equals(sharePackage.f106895d, "game")) {
            C9432q.m18672a(C11010c.m22280a(), (int) R.string.bna);
            return;
        }
        if (!TextUtils.equals(sharePackage.f106895d, "web") || !(sharePackage instanceof ImWebSharePackage) || ((ImWebSharePackage) sharePackage).f91192b) {
            m79335b(sharePackage, iMContact, z);
        }
    }

    /* renamed from: a */
    private static void m79330a(List<String> list, String str, BaseContent baseContent) {
        C35190af.m79442a();
        C35190af.m79443a(list.size());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C35237bj.m79649a().mo73348b(list, (List<BaseContent>) arrayList);
    }

    /* renamed from: a */
    public static void m79325a(Context context, IMContact iMContact, SharePackage sharePackage, BaseContent baseContent, C23371a<Boolean> aVar) {
        m79327a(context, Collections.singletonList(iMContact), sharePackage, baseContent, aVar);
    }

    /* renamed from: a */
    public static void m79327a(Context context, List<IMContact> list, SharePackage sharePackage, BaseContent baseContent, C23371a<Boolean> aVar) {
        if (sharePackage != null) {
            String string = sharePackage.f106900i.getString("msg");
            IMContact[] iMContactArr = (IMContact[]) list.toArray(new IMContact[0]);
            C35111e eVar = new C35111e(context, list, sharePackage, baseContent, aVar);
            m79326a(context, sharePackage, iMContactArr, string, (C35109a) eVar, (C35109a) new C35112f(aVar));
        }
    }

    /* renamed from: a */
    public static void m79332a(List<IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent, String str2) {
        if (baseContent instanceof TextContent) {
            baseContent = TextContent.obtain((TextContent) baseContent);
        } else if (baseContent == null) {
            baseContent = m79334b(sharePackage);
        }
        if (!TextUtils.isEmpty(str2)) {
            C35205as a = C35205as.m79585a();
            StringBuilder sb = new StringBuilder();
            sb.append(baseContent.hashCode());
            a.mo73325a(sb.toString(), "process_id", str2);
        }
        if (baseContent instanceof StoryPictureContent) {
            ((StoryPictureContent) baseContent).setMassMsg(1);
        } else if (baseContent instanceof StoryVideoContent) {
            ((StoryVideoContent) baseContent).setMassMsg(1);
        }
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            final List a2 = C34008d.m77744a((IMContact[]) list.toArray(new IMContact[0]));
            if (a2.size() > 1) {
                z = true;
            }
            C33440v.m76638a();
            String a3 = C33440v.m76639a(baseContent);
            if (!TextUtils.isEmpty(a3)) {
                C33440v a4 = C33440v.m76638a();
                final BaseContent baseContent2 = baseContent;
                final String str3 = str;
                final SharePackage sharePackage2 = sharePackage;
                final List<IMContact> list2 = list;
                final boolean z2 = z;
                C351082 r0 = new C33445y() {
                    /* renamed from: a */
                    public final void mo70782a() {
                    }

                    /* renamed from: a */
                    public final void mo70783a(double d) {
                    }

                    /* renamed from: a */
                    public final void mo70785a(Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo70784a(String str) {
                        C35106c.m79331a(a2, str3, baseContent2, sharePackage2, list2, z2);
                    }

                    /* renamed from: a */
                    public final void mo70787a(String str, UrlModel urlModel) {
                        if (baseContent2 instanceof SharePoiContent) {
                            ((SharePoiContent) baseContent2).setMapUrl(urlModel);
                        } else if (baseContent2 instanceof OnlyPictureContent) {
                            ((OnlyPictureContent) baseContent2).setUrl(urlModel);
                        } else if (baseContent2 instanceof StoryPictureContent) {
                            ((StoryPictureContent) baseContent2).setUrl((C33376a) urlModel);
                        }
                        C35106c.m79331a(a2, str3, baseContent2, sharePackage2, list2, z2);
                    }
                };
                a4.mo70847a(a3, baseContent, (C33445y) r0);
            } else {
                m79331a(a2, str, baseContent, sharePackage, list, z);
            }
            if (sharePackage != null && TextUtils.equals(sharePackage.f106895d, "aweme")) {
                C0013i.m16a((Callable<TResult>) new C35113g<TResult>(list));
            }
        }
    }

    /* renamed from: a */
    public static void m79331a(List<String> list, String str, BaseContent baseContent, SharePackage sharePackage, List<IMContact> list2, boolean z) {
        m79330a(list, str, baseContent);
        m79329a(sharePackage, (IMContact) list2.get(0), z);
    }

    /* renamed from: a */
    public static void m79326a(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, C35109a aVar, C35109a aVar2) {
        new C35409a(context).mo73689a(iMContactArr).mo73687a(sharePackage).mo73686a(aVar2).mo73692b(aVar).mo73685a(416).mo73691b(335).mo73688a(str).mo73690a().show();
    }
}
