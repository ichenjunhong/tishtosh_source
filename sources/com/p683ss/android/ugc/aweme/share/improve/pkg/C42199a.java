package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.a */
public final class C42199a implements C42357g {

    /* renamed from: a */
    private final Activity f106716a;

    /* renamed from: b */
    private final C8633b f106717b;

    /* renamed from: c */
    public final String mo49954c() {
        return "live_feed_back";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    /* renamed from: a */
    public final int mo49948a() {
        C8862e d = C8830k.m17330d();
        if (d != null) {
            return d.mo15056i();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo49953b() {
        C8862e d = C8830k.m17330d();
        if (d != null) {
            return d.mo15057j();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    public C42199a(Activity activity, C8633b bVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bVar, "params");
        this.f106716a = activity;
        this.f106717b = bVar;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
        C52711k.m112236a((Object) bridgeService_Monster, "ServiceManager.get().get…ridgeService::class.java)");
        Intent intent = new Intent(this.f106716a, bridgeService_Monster.getSubmitFeedbackActivity());
        intent.putExtra("roomId", this.f106717b.f23624c);
        intent.putExtra("feedback_id", "6955");
        intent.putExtra("enter_from", "live_share_feedback");
        this.f106716a.startActivity(intent);
        String str = "livesdk_share_feedback_click";
        C23089d a = C23089d.m56640a().mo47829a("action_type", this.f106717b.f23642u);
        Map<String, String> map = this.f106717b.f23646y;
        if (map == null) {
            map = C52550ab.m112045a();
        }
        IAccountUserService a2 = C20902b.m53242a();
        C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
        C26890h.m65011a(str, a.mo47830a(new HashMap(map)).mo47829a("uid", a2.getCurUserId()).f61491a);
    }
}
