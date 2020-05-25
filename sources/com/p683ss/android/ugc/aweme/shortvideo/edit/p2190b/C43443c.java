package com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.p2652av.video.C52884a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c */
public final class C43443c {

    /* renamed from: e */
    public static final C43444a f109832e = new C43444a(null);

    /* renamed from: a */
    public C0198r<C43442b> f109833a;

    /* renamed from: b */
    public C12924i f109834b;

    /* renamed from: c */
    public VideoPublishEditModel f109835c;

    /* renamed from: d */
    public boolean f109836d;

    /* renamed from: f */
    private C0198r<Boolean> f109837f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c$a */
    public static final class C43444a {
        private C43444a() {
        }

        public /* synthetic */ C43444a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m95220a(Context context, String str) {
            C52711k.m112240b(str, "logString");
            C39629l.m88232a().mo58588s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c$b */
    static final class C43445b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43443c f109838a;

        C43445b(C43443c cVar) {
            this.f109838a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            String str;
            Boolean bool = (Boolean) obj;
            if (this.f109838a.f109835c.autoEnhanceType == 0 && bool != null) {
                VideoPublishEditModel videoPublishEditModel = this.f109838a.f109835c;
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                videoPublishEditModel.autoEnhanceType = i;
                C0198r<C43442b> rVar = this.f109838a.f109833a;
                if (rVar != null) {
                    C43442b bVar = new C43442b(this.f109838a.f109835c.autoEnhanceOn, this.f109838a.f109835c.autoEnhanceType, false, 4, null);
                    rVar.postValue(bVar);
                }
                Context s = this.f109838a.f109834b.mo24473s();
                StringBuilder sb = new StringBuilder("receive light detect value,  ");
                if (bool.booleanValue()) {
                    str = "is dark light ";
                } else {
                    str = "is not dark light";
                }
                sb.append(str);
                C43444a.m95220a(s, sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static final void m95217a(Context context, String str) {
        C43444a.m95220a(context, str);
    }

    /* renamed from: a */
    public final void mo88375a(C0198r<Boolean> rVar) {
        C52711k.m112240b(rVar, "lightDetectData");
        this.f109837f = rVar;
        if (this.f109836d) {
            C0198r<Boolean> rVar2 = this.f109837f;
            if (rVar2 != null) {
                rVar2.observe(this.f109834b, new C43445b(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo88376a(boolean z) {
        this.f109835c.autoEnhanceOn = z;
        C0198r<C43442b> rVar = this.f109833a;
        if (rVar != null) {
            C43442b bVar = new C43442b(this.f109835c.autoEnhanceOn, this.f109835c.autoEnhanceType, false, 4, null);
            rVar.postValue(bVar);
        }
        C52884a.m112519a(1, "hdr_enabled", Boolean.valueOf(z));
    }

    public C43443c(C12924i iVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C52711k.m112240b(iVar, "scene");
        C52711k.m112240b(videoPublishEditModel, "model");
        this.f109834b = iVar;
        this.f109835c = videoPublishEditModel;
        this.f109836d = z;
    }
}
