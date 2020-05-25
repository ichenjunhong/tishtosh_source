package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashCidColdStartUploadExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.TopViewFeedGapOptimizeExperiment;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26880f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30013ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.panel.C30648q;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32496e;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbPrecreateplayerExp;
import com.p683ss.android.ugc.aweme.utils.C47831dv;
import com.p683ss.android.ugc.aweme.utils.C47832dw;
import com.p683ss.android.ugc.aweme.video.C48121w;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.g */
public final class C26224g {

    /* renamed from: a */
    static boolean f69256a;

    /* renamed from: a */
    public static boolean m63536a() {
        if (!TextUtils.isEmpty(C26217c.m63502a().f69230g)) {
            return true;
        }
        C26447bz.f69708a.mo54162a("没有可播放原生开屏资源");
        return false;
    }

    /* renamed from: a */
    public static boolean m63537a(C30753ai aiVar) {
        int i;
        C26447bz.f69708a.mo54162a("尝试展示原生开屏");
        if (aiVar == null) {
            C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：feedRecommendFragment null");
            return false;
        }
        String str = C26217c.m63502a().f69230g;
        C26217c.m63502a().mo53864b();
        if (TextUtils.isEmpty(str)) {
            C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：awesomeId null");
            return false;
        }
        C26217c.m63502a();
        Aweme c = C26217c.m63503c(str);
        if (c == null) {
            C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：aweme null");
            return false;
        } else if (!c.isAd()) {
            C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：aweme不是ad");
            return false;
        } else {
            C30648q qVar = aiVar.f80590m;
            if (qVar == null || qVar.mo60500V() == null) {
                C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：BaseListFragmentPanel null");
                return false;
            }
            int al = qVar.mo60520al();
            C30013ad V = qVar.mo60500V();
            int b = C31190f.m72833b(V.mo60286c(), c);
            if (b >= 0) {
                Aweme c2 = V.mo60285c(b);
                Context a = C11010c.m22280a();
                if (c2.isAd()) {
                    i = 1;
                } else {
                    i = 2;
                }
                C26088l.m63278a(a, c, i);
            }
            int i2 = -1;
            for (int i3 = 0; i3 < V.getCount(); i3++) {
                Aweme c3 = V.mo60285c(i3);
                if ((c3 == c || TextUtils.equals(c3.getAid(), c.getAid())) && c.getAwemeRawAd().isEnableFilterSameVideo()) {
                    C26447bz.f69708a.mo54162a("展示原生开屏失败 理由：feed流中已包含原生开屏资源");
                    C26088l.m63319b((Context) AwemeApplication.m56199a(), c, C26217c.m63502a().mo53857a("8", (String) null));
                    return false;
                }
                if (i3 >= al && i2 == -1 && !c3.isAd()) {
                    i2 = i3;
                }
            }
            int a2 = C10181b.m20511a().mo18168a(AwesomeSplashDelayExperiment.class, true, "awesome_splash_ad_delay_millis", 31744, 0);
            if (a2 > 0) {
                try {
                    Thread.sleep((long) a2);
                } catch (InterruptedException unused) {
                }
            }
            Aweme updateAweme = C23324d.m57378a().updateAweme(c);
            C26447bz.f69708a.mo54162a("将原生开屏数据插入feed列表中进行展示");
            AwemeSplashInfo l = C26512f.m64069l(updateAweme);
            if (l != null) {
                l.setShown(false);
                l.contextTrackSent = false;
            }
            C32496e.m75245b(true);
            try {
                qVar.mo62859b(updateAweme, al);
                if (updateAweme != null) {
                    if (updateAweme.getVideo() != null) {
                        if (C10181b.m20511a().mo18168a(PlayeAbPrecreateplayerExp.class, true, "player_precreateplayer", 31744, 0) == 1 && C47832dw.m103471a().mo95066a(C47831dv.PLAYER_FIRST_VIDEO_PREPARED)) {
                            C48121w.m104249M().mo95282a(updateAweme);
                        }
                    }
                }
            } catch (C26880f e) {
                C32458a.m75143a((Exception) e);
            }
            qVar.mo62814a(al, false);
            C32496e.m75245b(false);
            if (!C26252s.m63617d() && C10181b.m20511a().mo18172a(TopViewFeedGapOptimizeExperiment.class, true, "topview_feed_gap_optimize_enabled", 31744, false)) {
                for (int count = V.getCount() - 1; count > al; count--) {
                    if (count != i2 + 1 && (qVar instanceof C30648q)) {
                        qVar.mo62813a(count, V.mo60285c(count));
                    }
                }
                aiVar.aG_();
            } else if (!C26252s.m63617d()) {
                C26217c.m63502a().mo53865c();
            }
            if (C26252s.m63617d() && !C10181b.m20511a().mo18172a(AwesomeSplashCidColdStartUploadExperiment.class, true, "cold_start_upload_topview_cid_enabled", 31744, false)) {
                C26217c.m63502a().mo53865c();
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m63535a(int i, View... viewArr) {
        if (viewArr != null && viewArr.length != 0) {
            int i2 = 0;
            switch (i) {
                case 1:
                case 2:
                    int length = viewArr.length;
                    while (i2 < length) {
                        View view = viewArr[i2];
                        if (!(view == null || view.getVisibility() == 8)) {
                            view.setVisibility(4);
                        }
                        i2++;
                    }
                    return;
                case 3:
                    int length2 = viewArr.length;
                    while (i2 < length2) {
                        View view2 = viewArr[i2];
                        if (!(view2 == null || view2.getVisibility() == 8)) {
                            view2.postDelayed(new C26225h(view2), 260);
                        }
                        i2++;
                    }
                    return;
                case 4:
                    for (View view3 : viewArr) {
                        if (!(view3 == null || view3.getVisibility() == 8)) {
                            view3.setVisibility(0);
                            view3.setAlpha(1.0f);
                        }
                    }
                    break;
            }
        }
    }
}
