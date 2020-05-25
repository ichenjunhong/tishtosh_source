package com.p683ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.libra.FacebookUrlShareExperiment;
import com.p683ss.android.ugc.aweme.share.libra.WhatsppShareTypeExperiment;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42320g;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42265f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.at */
public final class C41987at {

    /* renamed from: a */
    public static final C41988a f106280a = new C41988a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.at$a */
    public static final class C41988a {
        private C41988a() {
        }

        public /* synthetic */ C41988a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m91951a(Aweme aweme, C41985as asVar, String str, AbsActivity absActivity) {
            SharePackage sharePackage;
            Context context;
            Aweme aweme2 = aweme;
            String str2 = str;
            AbsActivity absActivity2 = absActivity;
            C52711k.m112240b(aweme2, "aweme");
            C52711k.m112240b(asVar, "channel");
            C52711k.m112240b(str2, "downloadedFilePath");
            C52711k.m112240b(absActivity2, "activity");
            C42307b a = C42045a.m92010a(asVar.getKey(), absActivity2);
            if (a != null) {
                if (C42231s.m92666a(aweme2, asVar.getKey())) {
                    File file = new File(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(File.separator);
                    sb.append("temp");
                    sb.append(File.separator);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(file.getParent());
                    sb3.append(sb2);
                    sb3.append(file.getName());
                    String sb4 = sb3.toString();
                    C48016e.m103948c(str2, sb4);
                    C0013i a2 = C42231s.m92665a(sb4, str2);
                    a2.mo36g();
                    C48016e.m103947c(sb4);
                    Integer num = (Integer) a2.mo34e();
                    if (num == null || num.intValue() != 0) {
                        C41979aq.m91947b().monitorMuteAudioFailedForUpload((Integer) a2.mo34e());
                        C10691a.m21542b((Context) absActivity2, (int) R.string.a9b).mo19066a();
                        return;
                    }
                }
                switch (C41989au.f106281a[asVar.ordinal()]) {
                    case 1:
                    case 2:
                        C42307b bVar = a;
                        Context context2 = absActivity2;
                        C42325k kVar = new C42325k(C42150c.m92518a(str2, context2), str, null, null, null, null, 60, null);
                        String str3 = "content_url";
                        String str4 = kVar.f106893g;
                        if (str4 == null) {
                            str4 = "";
                        }
                        kVar.mo86232a(str3, str4);
                        kVar.mo86232a("media_type", "video/mp4");
                        bVar.mo86135a(kVar, context2);
                        break;
                    case 3:
                        C42307b bVar2 = a;
                        if (!WhatsppShareTypeExperiment.m92641a()) {
                            Context context3 = absActivity2;
                            C42325k kVar2 = new C42325k(C42150c.m92518a(str2, context3), str, null, null, null, null, 60, null);
                            String str5 = "content_url";
                            String str6 = kVar2.f106893g;
                            if (str6 == null) {
                                str6 = "";
                            }
                            kVar2.mo86232a(str5, str6);
                            kVar2.mo86232a("media_type", "video/mp4");
                            bVar2.mo86135a(kVar2, context3);
                            break;
                        } else {
                            ShareInfo shareInfo = aweme.getShareInfo();
                            C52711k.m112236a((Object) shareInfo, "aweme.shareInfo");
                            String shareUrl = shareInfo.getShareUrl();
                            C52711k.m112236a((Object) shareUrl, "aweme.shareInfo.shareUrl");
                            C42322h hVar = new C42322h(C42150c.m92521a(shareUrl, bVar2), null, null, 6, null);
                            bVar2.mo86138a(hVar, (Context) absActivity2);
                            break;
                        }
                    case 4:
                        C42307b bVar3 = a;
                        C42265f fVar = new C42265f();
                        if (!FacebookUrlShareExperiment.m92636a()) {
                            Context context4 = absActivity2;
                            if (!fVar.mo86141a(context4)) {
                                C42325k kVar3 = new C42325k(C42150c.m92518a(str2, context4), str, null, null, null, null, 60, null);
                                bVar3.mo86135a(kVar3, context4);
                                break;
                            } else {
                                C42325k kVar4 = new C42325k(C42150c.m92518a(str2, context4), null, null, null, null, null, 62, null);
                                String str7 = "content_url";
                                String str8 = kVar4.f106893g;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                kVar4.mo86232a(str7, str8);
                                String d = C24095a.m58947d();
                                C52711k.m112236a((Object) d, "BuildConfigDiff.getFacebookAppId()");
                                kVar4.mo86232a("fb_app_id", d);
                                kVar4.mo86232a("media_type", "video/mp4");
                                fVar.mo49947a((C42318f) kVar4, context4);
                                break;
                            }
                        } else {
                            ShareInfo shareInfo2 = aweme.getShareInfo();
                            C52711k.m112236a((Object) shareInfo2, "aweme.shareInfo");
                            String shareUrl2 = shareInfo2.getShareUrl();
                            C52711k.m112236a((Object) shareUrl2, "aweme.shareInfo.shareUrl");
                            C42322h hVar2 = new C42322h(C42150c.m92521a(shareUrl2, bVar3), null, null, 6, null);
                            bVar3.mo86138a(hVar2, (Context) absActivity2);
                            break;
                        }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        C42307b bVar4 = a;
                        ShareInfo shareInfo3 = aweme.getShareInfo();
                        C52711k.m112236a((Object) shareInfo3, "aweme.shareInfo");
                        String shareUrl3 = shareInfo3.getShareUrl();
                        C52711k.m112236a((Object) shareUrl3, "aweme.shareInfo.shareUrl");
                        C42322h hVar3 = new C42322h(C42150c.m92521a(shareUrl3, bVar4), null, null, 6, null);
                        bVar4.mo86138a(hVar3, (Context) absActivity2);
                        break;
                    case 11:
                        File file2 = new File(str2);
                        Context context5 = absActivity2;
                        SharePackage parseAweme = C41979aq.m91946a().parseAweme(context5, aweme, 0, "", "");
                        if (C42149b.m92514a(file2)) {
                            ShareInfo shareInfo4 = aweme.getShareInfo();
                            C52711k.m112236a((Object) shareInfo4, "aweme.shareInfo");
                            String shareUrl4 = shareInfo4.getShareUrl();
                            C52711k.m112236a((Object) shareUrl4, "aweme.shareInfo.shareUrl");
                            try {
                                r9 = r9;
                                sharePackage = parseAweme;
                                context = context5;
                                C42307b bVar5 = a;
                                try {
                                    C42325k kVar5 = new C42325k(C42150c.m92518a(str2, C42150c.m92517a()), str, null, null, null, C42150c.m92521a(shareUrl4, a), 28, null);
                                    bVar5.mo49947a((C42318f) kVar5, (Context) absActivity2);
                                } catch (C42320g e) {
                                    e = e;
                                }
                            } catch (C42320g e2) {
                                e = e2;
                                sharePackage = parseAweme;
                                context = context5;
                                String message = e.getMessage();
                                int hashCode = message.hashCode();
                                if (hashCode == 1212011917) {
                                    Context context6 = context;
                                    SharePackage sharePackage2 = sharePackage;
                                    if (message.equals("file_too_large")) {
                                        C10691a.m21542b(context6, (int) R.string.fbw).mo19066a();
                                        C42357g a3 = C41979aq.m91947b().getCopyAwemeAction(aweme, "", true, 0);
                                        if (a3 != null) {
                                            a3.mo49950a(context6, sharePackage2);
                                        }
                                    }
                                } else if (hashCode == 1703438795 && message.equals("video_too_long")) {
                                    C10691a.m21542b(context, (int) R.string.fbx).mo19066a();
                                    Context context7 = context;
                                    SharePackage sharePackage3 = sharePackage;
                                    C42357g a4 = C41979aq.m91947b().getCopyAwemeAction(aweme, "", true, 0);
                                    if (a4 != null) {
                                        a4.mo49950a(context7, sharePackage3);
                                    }
                                }
                                C23542f.m57715a().mo48707b("key_pop_up_window_share_count", C23542f.m57715a().mo48699a("key_pop_up_window_share_count", 0) + 1);
                                C26890h.m65011a("share_video", C23089d.m56640a().mo47829a("scene_id", "1013").mo47829a("platform", asVar.getKey()).mo47829a("group_id", aweme.getAid()).mo47829a("enter_from", "video_post_page").mo47829a("share_mode", "download_then_share").mo47829a("content_type", "video").f61491a);
                            }
                        } else {
                            SharePackage sharePackage4 = parseAweme;
                            Context context8 = context5;
                            C26890h.onEventV3("share_snapchat_oversized");
                            C10691a.m21542b(context8, (int) R.string.fbw).mo19066a();
                            C42357g a5 = C41979aq.m91947b().getCopyAwemeAction(aweme, "", true, 0);
                            if (a5 != null) {
                                a5.mo49950a(context8, sharePackage4);
                            }
                        }
                }
                C23542f.m57715a().mo48707b("key_pop_up_window_share_count", C23542f.m57715a().mo48699a("key_pop_up_window_share_count", 0) + 1);
                C26890h.m65011a("share_video", C23089d.m56640a().mo47829a("scene_id", "1013").mo47829a("platform", asVar.getKey()).mo47829a("group_id", aweme.getAid()).mo47829a("enter_from", "video_post_page").mo47829a("share_mode", "download_then_share").mo47829a("content_type", "video").f61491a);
            }
        }
    }
}
