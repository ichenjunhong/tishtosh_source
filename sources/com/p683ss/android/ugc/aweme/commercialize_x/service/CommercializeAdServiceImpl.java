package com.p683ss.android.ugc.aweme.commercialize_x.service;

import android.app.Application;
import android.content.Context;
import android.text.style.ReplacementSpan;
import android.util.SparseArray;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26820a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26821b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26823a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26824b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.service.C26827b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p683ss.android.ugc.aweme.commercialize_x.p1587a.C26828a;
import com.p683ss.android.ugc.aweme.commercialize_x.p1587a.C26829b;
import com.p683ss.android.ugc.aweme.commercialize_x.p1588b.C26830a;
import com.p683ss.android.ugc.aweme.pendant.C38611h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl */
public final class CommercializeAdServiceImpl implements ICommercializeAdService {
    public static final C26831a Companion = new C26831a(null);
    private static C26820a depend;

    /* renamed from: com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl$a */
    public static final class C26831a {
        private C26831a() {
        }

        public /* synthetic */ C26831a(C52707g gVar) {
            this();
        }
    }

    public final C26820a getDepend() {
        return depend;
    }

    public static ICommercializeAdService createICommercializeAdServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ICommercializeAdService.class);
        if (a != null) {
            return (ICommercializeAdService) a;
        }
        return new CommercializeAdServiceImpl();
    }

    private final C26827b getComponentFactory(C26821b bVar) {
        return C26828a.m64848a(5);
    }

    public final ReplacementSpan getSpan(Context context, C26821b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "spanParams");
        C26827b componentFactory = getComponentFactory(bVar);
        if (componentFactory != null) {
            return componentFactory.mo54724a(context, bVar);
        }
        return null;
    }

    public final C26823a getView(Context context, C26821b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "viewParams");
        C26827b componentFactory = getComponentFactory(bVar);
        if (componentFactory != null) {
            return componentFactory.mo54727d(context, bVar);
        }
        return null;
    }

    public final <T extends C26821b> C26824b<T> getViewHolder(Context context, C26821b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "viewHolderParams");
        C26827b componentFactory = getComponentFactory(bVar);
        if (componentFactory != null) {
            return componentFactory.mo54725b(context, bVar);
        }
        return null;
    }

    public final Widget getWidget(Context context, C26821b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "widgetParams");
        C26827b componentFactory = getComponentFactory(bVar);
        if (componentFactory != null) {
            return componentFactory.mo54726c(context, bVar);
        }
        return null;
    }

    public final void init(Application application, C26820a aVar) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(aVar, "depend");
        C26828a aVar2 = C26828a.f70654b;
        SparseArray<Class<? extends C26827b>> sparseArray = C26829b.f70656a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C26828a.f70653a.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        C26828a.f70653a.put(6, C26830a.class);
        C26828a.f70653a.put(5, C38611h.class);
        depend = aVar;
    }
}
