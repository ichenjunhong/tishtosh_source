package com.p683ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23527f;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.adapter.C30032at;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.o */
public final class C30391o {

    /* renamed from: a */
    public static final C30391o f79451a = new C30391o();

    private C30391o() {
    }

    /* renamed from: a */
    public static final void m71310a(SmartImageView smartImageView, UrlModel urlModel, C13951c cVar, C30032at atVar, DataCenter dataCenter) {
        UrlModel urlModel2;
        ArrayList arrayList;
        SmartImageView smartImageView2 = smartImageView;
        C30032at atVar2 = atVar;
        DataCenter dataCenter2 = dataCenter;
        C52711k.m112240b(cVar, "priority");
        C52711k.m112240b(atVar2, "controllerListener");
        if (smartImageView2 != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            List urlList = urlModel.getUrlList();
            Object obj = urlList.get(urlList.size() - 1);
            C52711k.m112236a(obj, "originUrlList[originUrlList.size - 1]");
            Context context = null;
            boolean b = C52830p.m112456b((CharSequence) obj, (CharSequence) "360p.", false, 2, (Object) null);
            if (b) {
                UrlModel urlModel3 = new UrlModel();
                urlModel3.setWidth(urlModel.getWidth());
                urlModel3.setHeight(urlModel.getHeight());
                urlModel3.setUrlKey(urlModel.getUrlKey());
                urlModel3.setUri(urlModel.getUri());
                urlModel3.setSize(urlModel.getSize());
                urlModel3.setFileHash(urlModel.getFileHash());
                urlModel3.setUrlList(new ArrayList(urlList));
                urlModel3.getUrlList().add(0, (String) urlModel3.getUrlList().remove(urlModel3.getUrlList().size() - 1));
                urlModel2 = urlModel3;
            } else {
                urlModel2 = urlModel;
            }
            Context context2 = smartImageView.getContext();
            if (context2 != null) {
                context = context2.getApplicationContext();
            }
            Context context3 = context;
            C30387k kVar = new C30387k(atVar2, dataCenter2);
            List urlList2 = urlModel2.getUrlList();
            ArrayList arrayList2 = new ArrayList();
            String str = (String) urlList2.get(0);
            if (b) {
                C52711k.m112236a((Object) str, "firstUrl");
                arrayList = arrayList2;
                arrayList.add(m71309a(str, null, cVar, new C30392p(str, dataCenter2, atVar2), Config.ARGB_8888, kVar));
            } else {
                arrayList = arrayList2;
                C52711k.m112236a((Object) str, "firstUrl");
                arrayList.add(m71309a(str, null, cVar, null, Config.RGB_565, kVar));
            }
            int size = urlList2.size();
            int i = 1;
            while (i < size) {
                Object obj2 = urlList2.get(i);
                C52711k.m112236a(obj2, "urlList[i]");
                int i2 = i;
                arrayList.add(m71309a((String) obj2, null, cVar, null, Config.RGB_565, kVar));
                i = i2 + 1;
            }
            if (arrayList.size() != 0) {
                C13773e eVar = (C13773e) C13771c.m27870a().mo25759b(smartImageView.getController());
                Object[] array = arrayList.toArray(new C14229b[0]);
                if (array != null) {
                    C13773e eVar2 = (C13773e) eVar.mo25755a((REQUEST[]) array);
                    C13791d dVar = atVar2;
                    Object obj3 = arrayList.get(0);
                    C52711k.m112236a(obj3, "imageRequests[0]");
                    smartImageView2.setController(((C13773e) eVar2.mo25751a(C23515d.m57662a(dVar, ((C14229b) obj3).mSourceUri, context3, urlModel2))).mo25763d());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: a */
    private static C14229b m71309a(String str, C13952d dVar, C13951c cVar, C14234d dVar2, Config config, C23527f fVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(cVar, "priority");
        C52711k.m112240b(config, "config");
        C52711k.m112240b(fVar, "requestsMonitor");
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.mo26112a(1);
        imageDecodeOptionsBuilder.mo26113a(false);
        C14232c a = C14232c.m29169a(Uri.parse(str)).mo26452a(cVar).mo26451a(new C13950b(imageDecodeOptionsBuilder));
        if (dVar2 != null) {
            a.mo26458a(dVar2);
        }
        fVar.mo48686a(a);
        C14229b a2 = a.mo26449a();
        C52711k.m112236a((Object) a2, "builder.build()");
        return a2;
    }
}
