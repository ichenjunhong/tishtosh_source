package com.p683ss.android.ugc.aweme.commercialize_ad_api.service;

import android.app.Application;
import android.content.Context;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26820a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26821b;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26823a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26824b;

/* renamed from: com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService */
public interface ICommercializeAdService {
    C26820a getDepend();

    ReplacementSpan getSpan(Context context, C26821b bVar);

    C26823a getView(Context context, C26821b bVar);

    <T extends C26821b> C26824b<T> getViewHolder(Context context, C26821b bVar);

    Widget getWidget(Context context, C26821b bVar);

    void init(Application application, C26820a aVar);
}
