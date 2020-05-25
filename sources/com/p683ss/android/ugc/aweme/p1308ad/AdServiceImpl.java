package com.p683ss.android.ugc.aweme.p1308ad;

import android.app.Application;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.p1544a.C25589a;
import com.p683ss.android.ugc.aweme.commercialize.views.AdCommentView;
import com.p683ss.android.ugc.aweme.commercialize.views.SearchAdCommentView;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.comment.C22348b;
import com.p683ss.android.ugc.aweme.p1308ad.comment.C22353d;
import com.p683ss.android.ugc.aweme.p1308ad.comment.C22354e;
import com.p683ss.android.ugc.aweme.p1308ad.comment.C22374n;
import com.p683ss.android.ugc.aweme.p1308ad.comment.CommentAdWidget;
import com.p683ss.android.ugc.aweme.p1308ad.comment.CommonCommentView;
import com.p683ss.android.ugc.aweme.p1308ad.comment.NewSpecialCommentView;
import com.p683ss.android.ugc.aweme.p1308ad.p1313d.C22392a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22398b;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1315a.C22397a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1316b.C22399a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22402b;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22404d;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22406f;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1319e.C22407a;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22408a;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b;
import com.p683ss.android.ugc.aweme.p1308ad.p1321g.C22414a;
import com.p683ss.android.ugc.aweme.p1308ad.p1321g.C22415b;
import com.p683ss.android.ugc.aweme.p1308ad.search.C22423a;
import com.p683ss.android.ugc.aweme.p1308ad.search.C22423a.C22424a;
import com.p683ss.android.ugc.aweme.p1308ad.search.C22425b;
import com.p683ss.android.ugc.aweme.p1308ad.search.C22425b.C22426a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22427a;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22428b;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22429c;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22441h;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22449c;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import com.p683ss.android.ugc.aweme.p1308ad.view.IAdDownloadItemView;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.AdServiceImpl */
public class AdServiceImpl implements IAdService {
    public C22412b getAdLandPagePreloadService() {
        return C22408a.f60347d;
    }

    public void init(Application application) {
    }

    public C22396a getLatestRecommendFeedAdInfo() {
        return C22441h.f60439a.f60440b;
    }

    public static IAdService createIAdServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAdService.class);
        if (a != null) {
            return (IAdService) a;
        }
        return new AdServiceImpl();
    }

    public void setLatestRecommendFeedAdInfo(AwemeRawAd awemeRawAd) {
        C22396a aVar;
        C22441h hVar = C22441h.f60439a;
        if (awemeRawAd == null || awemeRawAd.getSystemOrigin() == 1) {
            aVar = null;
        } else {
            aVar = new C22396a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
        hVar.f60440b = aVar;
    }

    public void test(Context context) {
        Toast makeText = Toast.makeText(context, "this is ad_impl component", 1);
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(makeText);
        }
        makeText.show();
    }

    public Widget getWidgetForType(Context context, C22428b bVar) {
        return new CommentAdWidget(((C22399a) bVar).f60330a);
    }

    public ReplacementSpan getSpan(Context context, C22427a aVar) {
        C22398b bVar = ((C22407a) aVar).f60346a;
        if (bVar.isAd() && bVar.isRightStyle()) {
            C22414a aVar2 = new C22414a(context, bVar.getBgColor(), bVar.getLabelName(), bVar.getTextColor());
            aVar2.f60360a = bVar.isAdHollowText();
            return aVar2;
        } else if (TextUtils.isEmpty(bVar.getAdMoreTextual())) {
            return new C10674a(context, (int) R.drawable.a59);
        } else {
            return new C22415b(context, R.color.cg, bVar.getAdMoreTextual(), R.drawable.aip);
        }
    }

    public C22449c getViewForType(Context context, C22430d dVar) {
        if (dVar.mo46623a() == 512) {
            return (IAdDownloadItemView) LayoutInflater.from(context).inflate(R.layout.bk_, ((C22402b) dVar).f60339a, false);
        }
        if (dVar.mo46623a() == 768) {
            ViewStub viewStub = ((C22397a) dVar).f60321a;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.bjt);
                return (C22449c) viewStub.inflate().findViewById(R.id.e8c);
            }
        } else if (dVar.mo46623a() == 769) {
            ViewStub viewStub2 = ((C22400a) dVar).f60337g;
            if (viewStub2 != null) {
                viewStub2.setLayoutResource(R.layout.bi8);
                return new C22392a((LinearLayout) viewStub2.inflate());
            }
        }
        StringBuilder sb = new StringBuilder("type");
        sb.append(dVar.mo46623a());
        sb.append("is illegal");
        throw new IllegalArgumentException(sb.toString());
    }

    public C22450d getViewHolderForType(Context context, C22430d dVar) {
        int a = dVar.mo46623a();
        if (a == 256) {
            C22429c cVar = (C22429c) dVar;
            C25589a aVar = new C25589a(new AdCommentView(context), cVar.f60431i);
            aVar.mo52727a(cVar.f60429g);
            return aVar;
        } else if (a == 257) {
            C22429c cVar2 = (C22429c) dVar;
            C25589a aVar2 = new C25589a(new SearchAdCommentView(context), cVar2.f60431i);
            aVar2.mo52727a(cVar2.f60429g);
            return aVar2;
        } else if (dVar.mo46623a() == 258) {
            if (dVar instanceof C22429c) {
                C26138s sVar = ((C22429c) dVar).f60423a;
                if (sVar != null) {
                    if (sVar.buttonStyle == 1) {
                        if (sVar.backgroundType == 1) {
                            return new C22353d(new C22354e(context, true));
                        }
                        return new C22353d(new C22354e(context, false));
                    } else if (sVar.buttonStyle == 2) {
                        return new C22374n(new NewSpecialCommentView(context));
                    }
                }
            }
            return new C22348b(new CommonCommentView(context));
        } else if (a == 259) {
            C22406f fVar = (C22406f) dVar;
            C22426a aVar3 = C22425b.f60420b;
            C52711k.m112240b(fVar, "params");
            ViewGroup viewGroup = fVar.f60344b;
            C52711k.m112236a((Object) viewGroup, "params.parentView");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a6z, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…h_ad_item, parent, false)");
            C0184k kVar = fVar.f60345c;
            C52711k.m112236a((Object) kVar, "params.lifecycleOwner");
            return new C22425b(inflate, kVar);
        } else if (a == 260) {
            C22404d dVar2 = (C22404d) dVar;
            C22424a aVar4 = C22423a.f60415b;
            C52711k.m112240b(dVar2, "params");
            ViewGroup viewGroup2 = dVar2.f60344b;
            C52711k.m112236a((Object) viewGroup2, "params.parentView");
            View inflate2 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.bka, viewGroup2, false);
            C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…oad_group, parent, false)");
            C0184k kVar2 = dVar2.f60345c;
            C52711k.m112236a((Object) kVar2, "params.lifecycleOwner");
            return new C22423a(inflate2, kVar2);
        } else {
            StringBuilder sb = new StringBuilder("type");
            sb.append(dVar.mo46623a());
            sb.append("is illegal");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
