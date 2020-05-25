package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.media.e */
public final class C2991e {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f8776a;
    @C17952c(mo34828a = "id_str")

    /* renamed from: b */
    public String f8777b;
    @C17952c(mo34828a = "album")

    /* renamed from: c */
    public String f8778c;
    @C17952c(mo34828a = "title")

    /* renamed from: d */
    public String f8779d;
    @C17952c(mo34828a = "cover_hd")

    /* renamed from: e */
    public ImageModel f8780e;
    @C17952c(mo34828a = "cover_large")

    /* renamed from: f */
    public ImageModel f8781f;
    @C17952c(mo34828a = "cover_medium")

    /* renamed from: g */
    public ImageModel f8782g;
    @C17952c(mo34828a = "cover_thumb")

    /* renamed from: h */
    public ImageModel f8783h;
    @C17952c(mo34828a = "play_url")

    /* renamed from: i */
    public C2978h f8784i;
    @C17952c(mo34828a = "author")

    /* renamed from: j */
    public String f8785j;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: k */
    public String f8786k;
    @C17952c(mo34828a = "source_platform")

    /* renamed from: l */
    public int f8787l;
    @C17952c(mo34828a = "start_time")

    /* renamed from: m */
    public int f8788m;
    @C17952c(mo34828a = "end_time")

    /* renamed from: n */
    public int f8789n;
    @C17952c(mo34828a = "duration")

    /* renamed from: o */
    public int f8790o;
    @C17952c(mo34828a = "status")

    /* renamed from: p */
    public int f8791p;
    @C17952c(mo34828a = "extra")

    /* renamed from: q */
    public String f8792q;
    @C17952c(mo34828a = "share_url")

    /* renamed from: r */
    public String f8793r;
    @C17952c(mo34828a = "share_title")

    /* renamed from: s */
    public String f8794s;
    @C17952c(mo34828a = "share_description")

    /* renamed from: t */
    public String f8795t;
    @C17952c(mo34828a = "original_user_id")

    /* renamed from: u */
    public long f8796u;
    @C17952c(mo34828a = "original_titel_tpl")

    /* renamed from: v */
    public String f8797v;
    @C17952c(mo34828a = "video_cnt")

    /* renamed from: w */
    public long f8798w;
    @C17952c(mo34828a = "is_user_favorite")

    /* renamed from: x */
    public boolean f8799x;
    @C17952c(mo34828a = "audio_track")

    /* renamed from: y */
    public ImageModel f8800y;

    /* renamed from: z */
    public String f8801z;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Music{id=");
        sb.append(this.f8776a);
        sb.append(", mid='");
        sb.append(this.f8777b);
        sb.append('\'');
        sb.append(", album='");
        sb.append(this.f8778c);
        sb.append('\'');
        sb.append(", musicName='");
        sb.append(this.f8779d);
        sb.append('\'');
        sb.append(", converHd=");
        sb.append(this.f8780e);
        sb.append(", coverLarge=");
        sb.append(this.f8781f);
        sb.append(", coverMedium=");
        sb.append(this.f8782g);
        sb.append(", coverThumb=");
        sb.append(this.f8783h);
        sb.append(", playUrl=");
        sb.append(this.f8784i);
        sb.append(", authorName='");
        sb.append(this.f8785j);
        sb.append('\'');
        sb.append(", schema='");
        sb.append(this.f8786k);
        sb.append('\'');
        sb.append(", source=");
        sb.append(this.f8787l);
        sb.append(", startTime=");
        sb.append(this.f8788m);
        sb.append(", endTime=");
        sb.append(this.f8789n);
        sb.append(", duration=");
        sb.append(this.f8790o);
        sb.append(", status=");
        sb.append(this.f8791p);
        sb.append(", extra='");
        sb.append(this.f8792q);
        sb.append('\'');
        sb.append(", shareUrl='");
        sb.append(this.f8793r);
        sb.append('\'');
        sb.append(", shareTitle='");
        sb.append(this.f8794s);
        sb.append('\'');
        sb.append(", shareDescription='");
        sb.append(this.f8795t);
        sb.append('\'');
        sb.append(", oroginalUserId=");
        sb.append(this.f8796u);
        sb.append(", originalTitelTpl='");
        sb.append(this.f8797v);
        sb.append('\'');
        sb.append(", songId='");
        sb.append(this.f8801z);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
