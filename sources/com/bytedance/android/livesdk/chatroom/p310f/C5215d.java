package com.bytedance.android.livesdk.chatroom.p310f;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.p523c.C9389c;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p966f.C14024b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13749f;
import java.util.ArrayList;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.d */
final /* synthetic */ class C5215d implements C2205y {

    /* renamed from: a */
    private final ImageModel f13941a;

    C5215d(ImageModel imageModel) {
        this.f13941a = imageModel;
    }

    public final void subscribe(C2204x xVar) {
        ImageModel imageModel = this.f13941a;
        C14229b[] b = C5213c.m11827b(imageModel);
        C13745c cVar = null;
        if (!(b == null || b.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (C14229b bVar : b) {
                if (bVar != null) {
                    arrayList.add(C13771c.m27875c().mo26181a(bVar, (Object) null, C14231b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                cVar = C13749f.m27821a(arrayList).mo23157b();
            }
        }
        if (cVar == null) {
            StringBuilder sb = new StringBuilder("Cannot build requests from imageModel: ");
            sb.append(imageModel != null ? imageModel.toString() : "");
            xVar.mo6274a((Throwable) new IllegalArgumentException(sb.toString()));
            return;
        }
        cVar.mo25666a(new C14024b(xVar, imageModel) {

            /* renamed from: a */
            final /* synthetic */ C2204x f13939a;

            /* renamed from: b */
            final /* synthetic */ ImageModel f13940b;

            public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                this.f13939a.mo6274a(cVar.mo25675e());
            }

            /* renamed from: a */
            public final void mo9012a(Bitmap bitmap) {
                if (bitmap == null) {
                    C2204x xVar = this.f13939a;
                    StringBuilder sb = new StringBuilder("No bitmap loaded for imageModel: ");
                    sb.append(this.f13940b.toString());
                    xVar.mo6274a((Throwable) new IllegalStateException(sb.toString()));
                    return;
                }
                this.f13939a.mo6282a(bitmap.copy(bitmap.getConfig(), false));
                this.f13939a.mo6273a();
            }

            {
                this.f13939a = r1;
                this.f13940b = r2;
            }
        }, C9389c.m18568a());
    }
}
