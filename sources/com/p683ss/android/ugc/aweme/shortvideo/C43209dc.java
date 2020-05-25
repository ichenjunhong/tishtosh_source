package com.p683ss.android.ugc.aweme.shortvideo;

import com.C2240a;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.p2652av.video.C52928al;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dc */
public final class C43209dc {

    /* renamed from: a */
    C17429o f109265a;

    /* renamed from: b */
    boolean f109266b;

    /* renamed from: c */
    private double f109267c;

    /* renamed from: d */
    private String f109268d;

    /* renamed from: e */
    private String f109269e = "video";

    /* renamed from: f */
    private Object f109270f;

    /* renamed from: g */
    private String f109271g;

    /* renamed from: a */
    public final void mo87840a(boolean z) {
        String str;
        if (this.f109265a != null) {
            String a = C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(this.f109265a.mo33754a(TimeUnit.MILLISECONDS))});
            StringBuilder sb = new StringBuilder();
            sb.append(z ? 1 : 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C40797m.m90249d());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f109267c);
            C23089d a2 = C23089d.m56640a().mo47829a("duration", a).mo47829a("status", sb.toString()).mo47829a("bite_rate", sb2.toString()).mo47829a("fps", sb3.toString()).mo47829a("content_source", this.f109268d).mo47829a("content_type", this.f109269e).mo47829a("shoot_way", this.f109271g);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f109270f;
            C23089d a3 = a2.mo47829a("creation_id", videoPublishEditModel.creationId).mo47826a("file_bitrate", C52928al.m112615d(videoPublishEditModel.mOutputFile));
            String str2 = "is_download_video";
            if (videoPublishEditModel.isSaveLocal()) {
                str = "1";
            } else {
                str = "0";
            }
            a3.mo47829a(str2, str).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo47829a("prop_list", videoPublishEditModel.mStickerID).mo47829a("effect_list", videoPublishEditModel.getEditEffectList()).mo47829a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            C26890h.m65011a("pre_release_time", a2.f61491a);
        }
    }

    public C43209dc(Object obj, String str, boolean z) {
        this.f109270f = obj;
        this.f109268d = C38704c.m86060a(0, obj);
        this.f109271g = str;
        this.f109267c = (double) ((VideoPublishEditModel) obj).videoFps();
        this.f109266b = z;
    }
}
