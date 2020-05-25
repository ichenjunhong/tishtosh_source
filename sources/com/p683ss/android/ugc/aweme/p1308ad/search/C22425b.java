package com.p683ss.android.ugc.aweme.p1308ad.search;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22405e;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.search.b */
public final class C22425b extends C22450d<C22405e> {

    /* renamed from: b */
    public static final C22426a f60420b = new C22426a(null);

    /* renamed from: a */
    public final C0184k f60421a;

    /* renamed from: c */
    private SearchAdBaseItemView f60422c;

    /* renamed from: com.ss.android.ugc.aweme.ad.search.b$a */
    public static final class C22426a {
        private C22426a() {
        }

        public /* synthetic */ C22426a(C52707g gVar) {
            this();
        }
    }

    public C22425b(View view, C0184k kVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(kVar, "lifecycleOwner");
        super(view);
        this.f60421a = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46525a(Context context, C22430d dVar) {
        C22405e eVar = (C22405e) dVar;
        if (eVar != null) {
            C22403c cVar = eVar.f60343a;
            if (cVar != null) {
                C22401a aVar = cVar.f60340a;
                if (aVar != null) {
                    AwemeRawAd awemeRawAd = aVar.f60338a;
                    if (awemeRawAd != null && awemeRawAd.getSearchAdType() == 1) {
                        if (awemeRawAd.isHideIfExists()) {
                            View view = this.itemView;
                            C52711k.m112236a((Object) view, "itemView");
                            if (C18920g.m46052b(view.getContext(), awemeRawAd.getPackageName())) {
                                SearchAdBaseItemView searchAdBaseItemView = this.f60422c;
                                if (searchAdBaseItemView != null) {
                                    searchAdBaseItemView.setVisibility(8);
                                } else {
                                    return;
                                }
                            }
                        }
                        if (this.f60422c == null) {
                            View view2 = this.itemView;
                            C52711k.m112236a((Object) view2, "itemView");
                            Context context2 = view2.getContext();
                            C52711k.m112236a((Object) context2, "itemView.context");
                            SearchAdItemView searchAdItemView = new SearchAdItemView(context2, null, 0, false, 14, null);
                            this.f60422c = searchAdItemView;
                            SearchAdBaseItemView searchAdBaseItemView2 = this.f60422c;
                            if (searchAdBaseItemView2 == null) {
                                C52711k.m112234a();
                            }
                            searchAdBaseItemView2.setLifecycleOwner(this.f60421a);
                            LayoutParams layoutParams = new LayoutParams(-1, -2);
                            View view3 = this.itemView;
                            if (view3 != null) {
                                ((ViewGroup) view3).addView(this.f60422c, layoutParams);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                        }
                        SearchAdBaseItemView searchAdBaseItemView3 = this.f60422c;
                        if (searchAdBaseItemView3 != null) {
                            searchAdBaseItemView3.mo46691a(awemeRawAd);
                            searchAdBaseItemView3.setVisibility(0);
                        }
                    }
                }
            }
        }
    }
}
