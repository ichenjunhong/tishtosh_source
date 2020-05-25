package com.p683ss.android.ugc.aweme.status.p2273b;

import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.b.a */
public final class C45739a {

    /* renamed from: g */
    public static final C45740a f115616g = new C45740a(null);

    /* renamed from: a */
    public Video f115617a = new Video();

    /* renamed from: b */
    public int f115618b;

    /* renamed from: c */
    public Effect f115619c;

    /* renamed from: d */
    public String f115620d;

    /* renamed from: e */
    public String f115621e;

    /* renamed from: f */
    public String f115622f;

    /* renamed from: com.ss.android.ugc.aweme.status.b.a$a */
    public static final class C45740a {
        private C45740a() {
        }

        public /* synthetic */ C45740a(C52707g gVar) {
            this();
        }
    }

    public C45739a(int i, Effect effect, String str, String str2, String str3) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "imageUrl");
        C52711k.m112240b(str2, "videoUrl");
        C52711k.m112240b(str3, "videoMd5");
        this.f115618b = i;
        this.f115619c = effect;
        this.f115620d = str;
        this.f115621e = str2;
        this.f115622f = str3;
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setH265(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f115621e);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.f115622f);
        videoUrlModel.setUri(this.f115622f);
        this.f115617a.setPlayAddr(videoUrlModel);
        this.f115617a.setSourceId(this.f115619c.getId());
    }
}
