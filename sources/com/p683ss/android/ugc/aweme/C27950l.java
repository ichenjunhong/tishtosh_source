package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.commerce.C25492b;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26386al;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a.C36293c;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36294b;
import com.p683ss.android.ugc.aweme.similarvideo.p2270ui.SimilarVideoActivity;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.l */
public final class C27950l implements C22541ag {

    /* renamed from: com.ss.android.ugc.aweme.l$a */
    static final class C27951a extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Activity f73376a;

        /* renamed from: b */
        final /* synthetic */ Uri f73377b;

        C27951a(Activity activity, Uri uri) {
            this.f73376a = activity;
            this.f73377b = uri;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C36290a aVar = C36290a.f92886a;
                Activity activity = this.f73376a;
                Uri uri = this.f73377b;
                C52711k.m112240b(activity, "activity");
                C52711k.m112240b(uri, "routeUri");
                C23137q a = C23137q.m56698a();
                C52711k.m112236a((Object) a, "AwemeRuntime.inst()");
                boolean c = a.mo47855c();
                Builder builder = new Builder();
                builder.permissionActivityRequired(true);
                aVar.mo75122a(activity, builder, uri);
                if (c) {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36293c(activity, builder));
                } else {
                    Intent intent = new Intent();
                    intent.setFlags(C36294b.m81936a(activity, intent, intent.getFlags()));
                    new Bundle();
                    intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
                    intent.putExtras(intent.putExtra("enter_record_from_other_platform", true));
                    activity.startActivity(intent);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final Class<? extends Activity> mo46882a() {
        return DeepLinkHandlerActivity.class;
    }

    /* renamed from: a */
    public final Intent mo46881a(Context context, Uri uri) {
        Intent a = C27148b.m65481a(context, uri);
        C52711k.m112236a((Object) a, "CrossPlatformUtil.handle…ViewBrowser(context, uri)");
        return a;
    }

    /* renamed from: a */
    public final void mo46883a(Activity activity, Uri uri) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(uri, "uri");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C27951a(activity, uri));
    }

    /* renamed from: a */
    public final void mo46886a(Context context, Aweme aweme) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "currentAweme");
        if (context != null && aweme != null) {
            SimilarVideoActivity.f115437b = (Activity) context;
            Intent intent = new Intent(context, SimilarVideoActivity.class);
            intent.putExtra("aweme_to_similar", aweme);
            context.startActivity(intent);
            SimilarVideoActivity.f115437b.overridePendingTransition(R.anim.q, 0);
        }
    }

    /* renamed from: a */
    public final void mo46885a(Context context, C26112af afVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(afVar, "searchAdInfo");
        IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
        C26136q easterEggInfo = afVar.getEasterEggInfo();
        C52711k.m112236a((Object) easterEggInfo, "searchAdInfo.easterEggInfo");
        bridgeService_Monster.trySetJumpToFissionH5(easterEggInfo.getWebUrl());
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        C26136q easterEggInfo2 = afVar.getEasterEggInfo();
        C52711k.m112236a((Object) easterEggInfo2, "searchAdInfo.easterEggInfo");
        intent.setData(Uri.parse(easterEggInfo2.getWebUrl()));
        C26136q easterEggInfo3 = afVar.getEasterEggInfo();
        C52711k.m112236a((Object) easterEggInfo3, "searchAdInfo.easterEggInfo");
        String webTitle = easterEggInfo3.getWebTitle();
        if (!C9431p.m18664a(webTitle)) {
            intent.putExtra("title", webTitle);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_more", false);
        intent.putExtra("enter_from", "search_ad");
        IBridgeService bridgeService_Monster2 = I18nBridgeService.getBridgeService_Monster();
        C26136q easterEggInfo4 = afVar.getEasterEggInfo();
        C52711k.m112236a((Object) easterEggInfo4, "searchAdInfo.easterEggInfo");
        bridgeService_Monster2.jumpToH5(easterEggInfo4.getWebUrl(), context, intent);
    }

    /* renamed from: a */
    public final void mo46884a(Context context, C25930g gVar, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(gVar, "easterEggPageParams");
        C26386al.m63838a(context, gVar, -1);
    }

    /* renamed from: a */
    public final void mo46887a(String str, Map<String, String> map, Context context) {
        C52711k.m112240b(map, "options");
        C25492b.m62002a(str, map, context);
    }
}
