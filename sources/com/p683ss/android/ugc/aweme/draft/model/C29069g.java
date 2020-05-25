package com.p683ss.android.ugc.aweme.draft.model;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.g */
public final class C29069g {
    @C17952c(mo34828a = "preview_width")

    /* renamed from: a */
    public int f76183a;
    @C17952c(mo34828a = "preview_height")

    /* renamed from: b */
    public int f76184b;
    @C17952c(mo34828a = "video_segment_list")

    /* renamed from: c */
    public List<DraftVideoSegment> f76185c;
    @C17952c(mo34828a = "volume")

    /* renamed from: d */
    public float f76186d;
    @C17952c(mo34828a = "fps")

    /* renamed from: e */
    public int f76187e;
    @C17952c(mo34828a = "scene_in")

    /* renamed from: f */
    public int f76188f;
    @C17952c(mo34828a = "scene_out")

    /* renamed from: g */
    public int f76189g;
    @C17952c(mo34828a = "draftDir")

    /* renamed from: h */
    public String f76190h;

    public C29069g() {
        this(0, 0, null, 0.0f, 0, 0, 0, null, NormalGiftView.ALPHA_255, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29069g) {
                C29069g gVar = (C29069g) obj;
                if (this.f76183a == gVar.f76183a) {
                    if ((this.f76184b == gVar.f76184b) && C52711k.m112239a((Object) this.f76185c, (Object) gVar.f76185c) && Float.compare(this.f76186d, gVar.f76186d) == 0) {
                        if (this.f76187e == gVar.f76187e) {
                            if (this.f76188f == gVar.f76188f) {
                                if (!(this.f76189g == gVar.f76189g) || !C52711k.m112239a((Object) this.f76190h, (Object) gVar.f76190h)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f76183a * 31) + this.f76184b) * 31;
        List<DraftVideoSegment> list = this.f76185c;
        int i2 = 0;
        int hashCode = (((((((((i + (list != null ? list.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f76186d)) * 31) + this.f76187e) * 31) + this.f76188f) * 31) + this.f76189g) * 31;
        String str = this.f76190h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftPreviewConfigure(previewWidth=");
        sb.append(this.f76183a);
        sb.append(", previewHeight=");
        sb.append(this.f76184b);
        sb.append(", videoSegments=");
        sb.append(this.f76185c);
        sb.append(", mVolume=");
        sb.append(this.f76186d);
        sb.append(", mFps=");
        sb.append(this.f76187e);
        sb.append(", sceneIn=");
        sb.append(this.f76188f);
        sb.append(", sceneOut=");
        sb.append(this.f76189g);
        sb.append(", draftDir=");
        sb.append(this.f76190h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo58830a(List<DraftVideoSegment> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f76185c = list;
    }

    private C29069g(int i, int i2, List<DraftVideoSegment> list, float f, int i3, int i4, int i5, String str) {
        C52711k.m112240b(list, "videoSegments");
        this.f76183a = i;
        this.f76184b = i2;
        this.f76185c = list;
        this.f76186d = f;
        this.f76187e = i3;
        this.f76188f = i4;
        this.f76189g = i5;
        this.f76190h = str;
    }

    private /* synthetic */ C29069g(int i, int i2, List list, float f, int i3, int i4, int i5, String str, int i6, C52707g gVar) {
        this(576, PreloadTask.BYTE_UNIT_NUMBER, C52575l.m112097a(), 0.0f, -1, 0, 0, null);
    }
}
