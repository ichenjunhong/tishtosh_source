package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer;

import android.app.Activity;
import android.net.Uri.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18541f;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.MaskLayerOption;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31865b;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.report.C41201a;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C41994c;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.e */
final /* synthetic */ class C31045e implements OnClickListener {

    /* renamed from: a */
    private final C31043d f81290a;

    /* renamed from: b */
    private final MaskLayerOption f81291b;

    C31045e(C31043d dVar, MaskLayerOption maskLayerOption) {
        this.f81290a = dVar;
        this.f81291b = maskLayerOption;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C31043d dVar = this.f81290a;
        MaskLayerOption maskLayerOption = this.f81291b;
        if (!C32800a.m75679a(view)) {
            switch (maskLayerOption.mType) {
                case 1:
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getShortVideoPluginService().mo80676a(dVar.f81282a, true, new C39598a() {
                        public final void onSuccess() {
                            C31043d dVar = C31043d.this;
                            C41994c.m91963a("long_press_download");
                            if (dVar.f81284c.isPreventDownload()) {
                                AwemeACLStruct.m91858a().setToastMsg(dVar.f81282a.getString(R.string.wb));
                                C41994c.m91964a(dVar.f81285d, dVar.f81284c);
                                C10691a.m21551c(dVar.f81282a, dVar.f81282a.getResources().getString(R.string.wb)).mo19066a();
                                return;
                            }
                            C41994c.m91967b(dVar.f81285d);
                            if (C30530a.m71490a(dVar.f81282a, dVar.f81284c)) {
                                C26512f.m64060c(dVar.f81284c);
                                Activity a = C18541f.m44861a(dVar.f81282a);
                                C41979aq.m91947b().getDownloadAction(a, dVar.f81284c, dVar.f81285d, "long_press_download").mo49950a(a, dVar.f81283b);
                            }
                        }
                    });
                    break;
                case 2:
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3JsonIncludingPoiParams(dVar.f81284c, dVar.f81284c.isCollected() ? "cancel_favourite_video" : "favourite_video", C23089d.m56640a().mo47829a("enter_from", dVar.f81285d).mo47829a("group_id", dVar.f81284c.getAid()).mo47829a("author_id", dVar.f81284c.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(dVar.f81284c))).mo47829a("enter_method", "long_press"));
                    if (!C26512f.m64060c(dVar.f81284c)) {
                        if (C20902b.m53242a().isLogin()) {
                            dVar.mo63832a();
                            break;
                        } else {
                            String aid = dVar.f81284c != null ? dVar.f81284c.getAid() : "";
                            C27965f.m66721a(C11016e.m22312g(), dVar.f81285d, "click_favorite_video", C47661ab.m103163a().mo94972a("group_id", aid).mo94972a("log_pb", C23198ae.m56874k(aid)).f120139a, (C23505g) new C31047g(dVar));
                            break;
                        }
                    } else {
                        C10691a.m21542b(dVar.f81282a, (int) R.string.dn).mo19066a();
                        break;
                    }
                case 3:
                    C41979aq.m91947b().getDislikeAction(dVar.f81284c, dVar.f81285d, "long_press").mo49950a(dVar.f81282a, dVar.f81283b);
                    break;
                case 5:
                    C47718bf.m103288a(new C31865b(dVar.f81284c, "long_press"));
                    break;
                case 6:
                    Activity a = C18541f.m44861a(dVar.f81282a);
                    if (!(a == null || dVar.f81284c == null)) {
                        if (dVar.f81284c.isAd() && dVar.f81284c.getAwemeRawAd().isReportEnable()) {
                            Builder a2 = C41201a.m90895a(dVar.f81284c, "creative", C29094ad.f76264a);
                            int reportAdType = dVar.f81284c.getAwemeRawAd().getReportAdType();
                            if (reportAdType != 0) {
                                a2.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
                            }
                            C27013a.m65227a().reportAd(a, a2);
                            C23089d a3 = C23089d.m56640a().mo47829a("enter_from", dVar.f81285d).mo47829a("author_id", dVar.f81284c.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(dVar.f81284c))).mo47829a("enter_method", "long_press").mo47829a("scene_id", "1003");
                            if (dVar.f81284c.isAd()) {
                                a3.mo47828a("group_id", (Object) dVar.f81284c.getAwemeRawAd().getGroupId());
                            } else {
                                a3.mo47829a("group_id", dVar.f81284c.getAid());
                            }
                            C26890h.m65012a("report", C23198ae.m56851a(a3.f61491a));
                            break;
                        } else {
                            C27013a.m65227a().reportAweme(a, dVar.f81284c, dVar.f81284c.getAid(), dVar.f81284c.getAuthor() == null ? "" : dVar.f81284c.getAuthor().getUid());
                            C27013a.m65227a().sendReportEvent(dVar.f81285d, C27013a.m65227a().getAwemeReportType(dVar.f81284c), C23198ae.m56877m(dVar.f81284c), C23198ae.m56877m(dVar.f81284c), C23198ae.m56848a(dVar.f81284c.getAuthor()), "", "long_press");
                            break;
                        }
                    }
                    break;
                case 7:
                    Activity g = C11016e.m22312g();
                    if (g != null && !g.isFinishing()) {
                        C41922a.m91868a().showReportDialog(dVar.f81284c, "long_press_mask_layer", C11016e.m22312g(), "");
                        break;
                    }
            }
            if (dVar.f81286e != null) {
                dVar.f81286e.mo55955a(false);
            }
        }
    }
}
