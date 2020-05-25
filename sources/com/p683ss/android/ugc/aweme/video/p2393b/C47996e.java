package com.p683ss.android.ugc.aweme.video.p2393b;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.preload.C48073c;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50146d;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50147e;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g.C50151a;

/* renamed from: com.ss.android.ugc.aweme.video.b.e */
public final class C47996e implements C50149g {

    /* renamed from: a */
    private final C48073c f120633a;

    public C47996e(C48073c cVar) {
        this.f120633a = cVar;
    }

    /* renamed from: a */
    public final C50147e mo95151a(C50151a aVar) {
        C50146d a = aVar.mo97947a();
        VideoUrlModel videoUrlModel = a.f125656a;
        String[] strArr = a.f125658c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                String str = strArr[i];
                String sourceId = videoUrlModel.getSourceId();
                String str2 = "";
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains("?")) {
                        StringBuilder sb2 = new StringBuilder("&source_id=");
                        sb2.append(sourceId);
                        str2 = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder("?&source_id=");
                        sb3.append(sourceId);
                        str2 = sb3.toString();
                    }
                }
                sb.append(str2);
                strArr[i] = sb.toString();
            }
        }
        return new C50147e(this.f120633a.mo95341a(videoUrlModel, a.f125657b, strArr));
    }
}
