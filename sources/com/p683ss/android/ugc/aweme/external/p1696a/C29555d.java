package com.p683ss.android.ugc.aweme.external.p1696a;

import android.text.TextUtils;
import com.bytedance.common.utility.p524d.C9398b;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.external.p1696a.C29564e.C29565a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a.C42636a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a.C42637b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a.C42638c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a.C42639d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.VEUtils;
import com.p683ss.android.vesdk.VEUtils.C50573d;
import com.p683ss.android.vesdk.VEUtils.C50576g;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE;
import java.io.File;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.a.d */
public final class C29555d implements IAVTransformService {

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$a */
    static final class C29556a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f77368a;

        /* renamed from: b */
        final /* synthetic */ ITransformCallback f77369b;

        C29556a(String str, ITransformCallback iTransformCallback) {
            this.f77368a = str;
            this.f77369b = iTransformCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            MusicWaveBean musicWaveBean;
            if (TextUtils.isEmpty(this.f77368a)) {
                musicWaveBean = null;
            } else {
                musicWaveBean = (MusicWaveBean) C39618d.f101145I.mo58604b().mo80569a(C43191e.f109217h.mo87802a(this.f77368a));
            }
            this.f77369b.finish(musicWaveBean);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$b */
    static final class C29557b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ ITransformCallback f77370a;

        C29557b(ITransformCallback iTransformCallback) {
            this.f77370a = iTransformCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f77370a.finish(null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$c */
    static final class C29558c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ VideoShare2GifEditContext f77371a;

        /* renamed from: b */
        final /* synthetic */ C29560e f77372b;

        C29558c(VideoShare2GifEditContext videoShare2GifEditContext, C29560e eVar) {
            this.f77371a = videoShare2GifEditContext;
            this.f77372b = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            float f;
            new C42637b();
            VideoShare2GifEditContext videoShare2GifEditContext = this.f77371a;
            ConvertListener convertListener = this.f77372b;
            convertListener.onStart();
            C50720o oVar = new C50720o(videoShare2GifEditContext.f106359f);
            if (oVar.mo99324a(new String[]{videoShare2GifEditContext.f106354a}, (String[]) null, (String[]) null, C50749j.VIDEO_OUT_RATIO_ORIGINAL) != 0) {
                convertListener.onDone(false);
            } else {
                oVar.mo99379i();
                oVar.mo99351b((C50711k) new C42638c(convertListener, oVar));
                oVar.mo99332a((C50711k) new C42639d(convertListener, oVar));
                if (!TextUtils.isEmpty(videoShare2GifEditContext.f106358e)) {
                    File file = new File(videoShare2GifEditContext.f106358e);
                    if (file.exists()) {
                        file.delete();
                    }
                    oVar.mo99340b((int) videoShare2GifEditContext.f106366m, (int) videoShare2GifEditContext.f106367n);
                    if (videoShare2GifEditContext.f106356c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C39629l.m88233b().getExternalCacheDir());
                        sb.append("/watermark.png");
                        String sb2 = sb.toString();
                        if (C50200d.m108346a(sb2)) {
                            C48016e.m103947c(sb2);
                        }
                        WaterMarkServiceImpl.createIWaterMarkServicebyMonsterPlugin().watermarkParamBuilderService().getGifWatermarkImage(sb2);
                        if (videoShare2GifEditContext.f106362i < videoShare2GifEditContext.f106363j) {
                            f = 0.47f;
                        } else {
                            f = 0.27f;
                        }
                        float f2 = (((((float) videoShare2GifEditContext.f106362i) * f) * 52.0f) / 145.0f) / ((float) videoShare2GifEditContext.f106363j);
                        double d = (double) f;
                        double d2 = (double) f2;
                        double d3 = (double) (1.0f - (f / 2.0f));
                        double d4 = (double) (1.0f - (f2 / 2.0f));
                        oVar.f127305N = sb2;
                        oVar.f127306O = d;
                        oVar.f127307P = d2;
                        oVar.f127308Q = d3;
                        oVar.f127309R = d4;
                    }
                    int i2 = videoShare2GifEditContext.f106362i;
                    if (videoShare2GifEditContext.f106362i > videoShare2GifEditContext.f106363j) {
                        i = 480;
                    } else {
                        i = 270;
                    }
                    int min = Math.min(i2, i);
                    int i3 = (int) (((((float) min) * 1.0f) / ((float) videoShare2GifEditContext.f106362i)) * ((float) videoShare2GifEditContext.f106363j));
                    VEVideoEncodeSettings a = new C50585a(2).mo98694a(COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF).mo98692a(min, i3).mo98691a(8).mo98703a(C40797m.m90247b()).mo98705a();
                    a.setSpeed(2.5f);
                    C42636a aVar = new C42636a(min, i3, videoShare2GifEditContext.f106366m, videoShare2GifEditContext.f106367n, 2.5f);
                    convertListener.onConfigured(aVar);
                    oVar.mo99361d(2);
                    oVar.mo99335a(videoShare2GifEditContext.f106358e, (String) null, a);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$d */
    static final class C29559d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ ITransformCallback f77373a;

        C29559d(ITransformCallback iTransformCallback) {
            this.f77373a = iTransformCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ITransformCallback iTransformCallback = this.f77373a;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Boolean.valueOf(false));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$e */
    public static final class C29560e implements ConvertListener {

        /* renamed from: a */
        final /* synthetic */ VideoShare2GifEditContext f77374a;

        /* renamed from: b */
        final /* synthetic */ ITransformProgress f77375b;

        /* renamed from: c */
        final /* synthetic */ ITransformCallback f77376c;

        public final void onStart() {
        }

        public final void onDone(boolean z) {
            ITransformCallback iTransformCallback = this.f77376c;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Boolean.valueOf(z));
            }
        }

        public final void onUpdateProgress(int i) {
            ITransformProgress iTransformProgress = this.f77375b;
            if (iTransformProgress != null) {
                iTransformProgress.update(i);
            }
        }

        public final void onConfigured(C42636a aVar) {
            C52711k.m112240b(aVar, "params");
            C26890h.m65012a("gif_generate", new C26898j().mo54849a("height", String.valueOf(aVar.f107869b)).mo54849a("width", String.valueOf(aVar.f107868a)).mo54849a("gif_length_in_video", String.valueOf(aVar.f107871d - aVar.f107870c)).mo54849a("gif_offset", String.valueOf(aVar.f107870c)).mo54849a("group_id", this.f77374a.f106355b).mo54849a("author_id", this.f77374a.f106369p).mo54849a("speed", String.valueOf(aVar.f107872e)).mo54850a());
        }

        C29560e(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback iTransformCallback) {
            this.f77374a = videoShare2GifEditContext;
            this.f77375b = iTransformProgress;
            this.f77376c = iTransformCallback;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$f */
    static final class C29561f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f77377a;

        /* renamed from: b */
        final /* synthetic */ String f77378b;

        /* renamed from: c */
        final /* synthetic */ int f77379c;

        /* renamed from: d */
        final /* synthetic */ int f77380d;

        /* renamed from: e */
        final /* synthetic */ ITransformProgress f77381e;

        /* renamed from: f */
        final /* synthetic */ ITransformCallback f77382f;

        /* renamed from: com.ss.android.ugc.aweme.external.a.d$f$a */
        static final class C29562a implements C50573d {

            /* renamed from: a */
            final /* synthetic */ C29561f f77383a;

            C29562a(C29561f fVar) {
                this.f77383a = fVar;
            }

            /* renamed from: a */
            public final void mo59657a(int i) {
                ITransformProgress iTransformProgress = this.f77383a.f77381e;
                if (iTransformProgress != null) {
                    iTransformProgress.update(i);
                }
            }
        }

        C29561f(String str, String str2, int i, int i2, ITransformProgress iTransformProgress, ITransformCallback iTransformCallback) {
            this.f77377a = str;
            this.f77378b = str2;
            this.f77379c = i;
            this.f77380d = i2;
            this.f77381e = iTransformProgress;
            this.f77382f = iTransformCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C9398b.m18588b(C43307ea.f109491d);
            C9398b.m18588b(C43307ea.f109503p);
            C9398b.m18588b(C43307ea.f109492e);
            C50576g gVar = new C50576g();
            gVar.f126821a = this.f77377a;
            gVar.f126822b = this.f77378b;
            gVar.f126832l = this.f77379c;
            gVar.f126833m = this.f77380d;
            gVar.f126828h = -1;
            gVar.f126829i = 240;
            gVar.f126827g = 10;
            int convertVideo2Webp = VEUtils.convertVideo2Webp(gVar, new C29562a(this));
            FFMpegManager.m46826a().f52944a.stopGetFrameThumbnail();
            ITransformCallback iTransformCallback = this.f77382f;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Integer.valueOf(convertVideo2Webp));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.d$g */
    static final class C29563g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ ITransformCallback f77384a;

        C29563g(ITransformCallback iTransformCallback) {
            this.f77384a = iTransformCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ITransformCallback iTransformCallback = this.f77384a;
            if (iTransformCallback != null) {
                iTransformCallback.finish(Integer.valueOf(-1));
            }
            return C52860x.f131107a;
        }
    }

    public final void audio2wavebean(String str, ITransformCallback<MusicWaveBean> iTransformCallback) {
        C52711k.m112240b(str, "audioPath");
        C52711k.m112240b(iTransformCallback, "callback");
        new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29556a<C52860x>(str, iTransformCallback)).mo59667b(new C29557b(iTransformCallback)).mo59666a();
    }

    public final void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback) {
        C52711k.m112240b(videoShare2GifEditContext, "context");
        new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29558c<C52860x>(videoShare2GifEditContext, new C29560e(videoShare2GifEditContext, iTransformProgress, iTransformCallback))).mo59667b(new C29559d(iTransformCallback)).mo59666a();
    }

    public final void video2webp(String str, String str2, int i, int i2, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress) {
        C52711k.m112240b(str, "inputPath");
        C52711k.m112240b(str2, "outputPath");
        C29565a a = new C29565a().mo59665a(true);
        C29561f fVar = new C29561f(str, str2, i, i2, iTransformProgress, iTransformCallback);
        a.mo59664a((C52670a<C52860x>) fVar).mo59667b(new C29563g(iTransformCallback)).mo59666a();
    }
}
