package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct.ACLCommonStruct;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C41994c;
import com.p683ss.android.ugc.aweme.share.ShareExtService;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.p2159h.C42037c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e */
public final class C31063e extends C31068i {

    /* renamed from: a */
    public SharePackage f81317a;

    public C31063e(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
        this.f81317a = aVar.f81300d;
    }

    /* renamed from: a */
    public final void mo63838a(View view) {
        C52711k.m112240b(view, "v");
        C41994c.m91963a("long_press_download");
        Aweme aweme = this.f81322e;
        if (aweme == null || !aweme.isPreventDownload() || C42037c.m92002a(this.f81322e)) {
            C41994c.m91967b(this.f81323f);
            if (C30530a.m71490a(view.getContext(), this.f81322e)) {
                ShareExtService b = C41979aq.m91947b();
                Context context = view.getContext();
                C52711k.m112236a((Object) context, "v.context");
                Activity a = C42149b.m92512a(context);
                Aweme aweme2 = this.f81322e;
                if (aweme2 == null) {
                    C52711k.m112234a();
                }
                C42357g downloadAction = b.getDownloadAction(a, aweme2, this.f81323f, "long_press_download");
                if (downloadAction != null) {
                    Context context2 = view.getContext();
                    C52711k.m112236a((Object) context2, "v.context");
                    downloadAction.mo49950a(context2, this.f81317a);
                    return;
                }
                return;
            }
            return;
        }
        ACLCommonStruct a2 = AwemeACLStruct.m91858a();
        Context context3 = view.getContext();
        C52711k.m112236a((Object) context3, "v.context");
        String string = context3.getResources().getString(R.string.wb);
        C52711k.m112236a((Object) string, "v.context.resources.getS…ot_save_due_to_copyright)");
        a2.setToastMsg(string);
        C41994c.m91964a(this.f81323f, this.f81322e);
        Context context4 = view.getContext();
        Context context5 = view.getContext();
        C52711k.m112236a((Object) context5, "v.context");
        C10691a.m21551c(context4, context5.getResources().getString(R.string.wb)).mo19066a();
    }
}
