package com.p683ss.android.ugc.aweme.feed.p1716b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c.C45884a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.b.a */
public final class C30159a implements C45883c {

    /* renamed from: a */
    private final Context f78721a;

    /* renamed from: b */
    private final Video f78722b;

    /* renamed from: c */
    private final C30360a f78723c;

    /* renamed from: d */
    private final OcrLocation f78724d;

    /* renamed from: a */
    public final C45884a mo60449a() {
        C45884a aVar;
        if (this.f78722b == null) {
            return new C45884a(0, 0);
        }
        C30360a aVar2 = this.f78723c;
        Context context = this.f78721a;
        Video video = this.f78722b;
        OcrLocation ocrLocation = this.f78724d;
        if (video == null) {
            aVar = null;
        } else {
            C45884a aVar3 = new C45884a(video.getWidth(), video.getHeight());
            View view = new View(context);
            view.setLayoutParams(new MarginLayoutParams(0, 0));
            if (C22453b.m55510c()) {
                aVar2.mo60785a(context, view, video.getWidth(), video.getHeight(), true, aVar3, ocrLocation);
            } else {
                aVar2.mo60784a(context, view, video.getWidth(), video.getHeight(), true, aVar3);
            }
            aVar = aVar3;
        }
        C52711k.m112236a((Object) aVar, "feedAllScreenHelper.doVi…text, video, ocrLocation)");
        return aVar;
    }

    public C30159a(Context context, Video video, C30360a aVar, OcrLocation ocrLocation) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "feedAllScreenHelper");
        this.f78721a = context;
        this.f78722b = video;
        this.f78723c = aVar;
        this.f78724d = ocrLocation;
    }
}
