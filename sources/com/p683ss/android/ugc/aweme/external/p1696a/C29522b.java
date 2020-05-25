package com.p683ss.android.ugc.aweme.external.p1696a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.p002a.p003a.p004a.C0034b.C0035a;
import android.p002a.p003a.p004a.C0037d;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.external.p1696a.C29564e.C29565a;
import com.p683ss.android.ugc.aweme.p1361ap.C22801b;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.PhotoService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45642b;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.vesdk.C50753r;
import com.p683ss.android.vesdk.VEUtils;
import com.p683ss.android.vesdk.VEUtils.C50574e;
import dmt.p2652av.video.C52928al;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.a.b */
public final class C29522b implements IAVInfoService {

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$a */
    static final class C29523a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ List f77309a;

        /* renamed from: b */
        final /* synthetic */ IFilterMedia f77310b;

        /* renamed from: c */
        final /* synthetic */ IGetInfoCallback f77311c;

        C29523a(List list, IFilterMedia iFilterMedia, IGetInfoCallback iGetInfoCallback) {
            this.f77309a = list;
            this.f77310b = iFilterMedia;
            this.f77311c = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel : this.f77309a) {
                if (C45642b.m99389a(musicModel.getLocalPath()) >= 0 && this.f77310b.filter(Integer.valueOf(this.f77309a.indexOf(musicModel)))) {
                    arrayList.add(musicModel);
                }
            }
            IGetInfoCallback iGetInfoCallback = this.f77311c;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$b */
    static final class C29524b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77312a;

        C29524b(IGetInfoCallback iGetInfoCallback) {
            this.f77312a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77312a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(new ArrayList());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$c */
    static final class C29525c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ List f77313a;

        /* renamed from: b */
        final /* synthetic */ IGetInfoCallback f77314b;

        C29525c(List list, IGetInfoCallback iGetInfoCallback) {
            this.f77313a = list;
            this.f77314b = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (String a : this.f77313a) {
                arrayList.add(Integer.valueOf(C45642b.m99389a(a)));
            }
            IGetInfoCallback iGetInfoCallback = this.f77314b;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$d */
    static final class C29526d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77315a;

        C29526d(IGetInfoCallback iGetInfoCallback) {
            this.f77315a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77315a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(new ArrayList());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$e */
    static final class C29527e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77316a;

        /* renamed from: b */
        final /* synthetic */ String f77317b;

        C29527e(IGetInfoCallback iGetInfoCallback, String str) {
            this.f77316a = iGetInfoCallback;
            this.f77317b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77316a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(C45642b.m99389a(this.f77317b)));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$f */
    static final class C29528f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77318a;

        C29528f(IGetInfoCallback iGetInfoCallback) {
            this.f77318a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77318a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(-6));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$g */
    static final class C29529g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f77319a;

        /* renamed from: b */
        final /* synthetic */ boolean f77320b;

        /* renamed from: c */
        final /* synthetic */ IGetInfoCallback f77321c;

        /* renamed from: d */
        final /* synthetic */ long f77322d;

        /* renamed from: e */
        final /* synthetic */ long f77323e;

        /* renamed from: f */
        final /* synthetic */ Options f77324f;

        C29529g(boolean z, boolean z2, IGetInfoCallback iGetInfoCallback, long j, long j2, Options options) {
            this.f77319a = z;
            this.f77320b = z2;
            this.f77321c = iGetInfoCallback;
            this.f77322d = j;
            this.f77323e = j2;
            this.f77324f = options;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Bitmap bitmap;
            if (this.f77319a) {
                if (this.f77320b) {
                    i = 3;
                } else {
                    i = 1;
                }
                IGetInfoCallback iGetInfoCallback = this.f77321c;
                if (iGetInfoCallback != null) {
                    C0035a a = C0037d.m58b().mo51a();
                    if (a != null) {
                        bitmap = a.mo49a((int) this.f77322d, this.f77323e, i, 2, this.f77324f);
                    } else {
                        bitmap = null;
                    }
                    iGetInfoCallback.finish(bitmap);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$h */
    static final class C29530h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ Context f77325a;

        /* renamed from: b */
        final /* synthetic */ String f77326b;

        /* renamed from: c */
        final /* synthetic */ boolean f77327c;

        /* renamed from: d */
        final /* synthetic */ int f77328d;

        /* renamed from: e */
        final /* synthetic */ int f77329e;

        /* renamed from: f */
        final /* synthetic */ C52682m f77330f;

        /* renamed from: g */
        final /* synthetic */ C52687r f77331g;

        C29530h(Context context, String str, boolean z, int i, int i2, C52682m mVar, C52687r rVar) {
            this.f77325a = context;
            this.f77326b = str;
            this.f77327c = z;
            this.f77328d = i;
            this.f77329e = i2;
            this.f77330f = mVar;
            this.f77331g = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            new C22801b(this.f77325a).isVideoLengthOrTypeSupportedAndShowErrToast(this.f77326b, this.f77327c, this.f77328d, this.f77329e, this.f77330f, this.f77331g);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$i */
    static final class C29531i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52687r f77332a;

        C29531i(C52687r rVar) {
            this.f77332a = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f77332a.mo18305a("", Long.valueOf(0), Integer.valueOf(-10086), "decompress failed");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$j */
    static final class C29532j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77333a;

        /* renamed from: b */
        final /* synthetic */ String f77334b;

        C29532j(IGetInfoCallback iGetInfoCallback, String str) {
            this.f77333a = iGetInfoCallback;
            this.f77334b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77333a;
            if (iGetInfoCallback != null) {
                FFMpegManager a = FFMpegManager.m46826a();
                iGetInfoCallback.finish(Integer.valueOf(a.f52944a.checkMp3File(this.f77334b)));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$k */
    static final class C29533k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77335a;

        C29533k(IGetInfoCallback iGetInfoCallback) {
            this.f77335a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77335a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(-3));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$l */
    static final class C29534l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ PhotoMovieContext f77336a;

        /* renamed from: b */
        final /* synthetic */ IGetInfoCallback f77337b;

        C29534l(PhotoMovieContext photoMovieContext, IGetInfoCallback iGetInfoCallback) {
            this.f77336a = photoMovieContext;
            this.f77337b = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            new VideoCoverServiceImpl().getPhotoMovieCover(this.f77336a, (C38719a) new C38719a(this) {

                /* renamed from: a */
                final /* synthetic */ C29534l f77338a;

                {
                    this.f77338a = r1;
                }

                /* renamed from: a */
                public final void mo58818a(Bitmap bitmap, int i, int i2) {
                    IGetInfoCallback iGetInfoCallback = this.f77338a.f77337b;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(bitmap);
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$m */
    static final class C29536m extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77339a;

        C29536m(IGetInfoCallback iGetInfoCallback) {
            this.f77339a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77339a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(null);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$n */
    static final class C29537n extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29059c f77340a;

        /* renamed from: b */
        final /* synthetic */ IGetInfoCallback f77341b;

        C29537n(C29059c cVar, IGetInfoCallback iGetInfoCallback) {
            this.f77340a = cVar;
            this.f77341b = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            new VideoCoverServiceImpl().getVideoCoverByCallback(this.f77340a, new OnVideoCoverCallback(this) {

                /* renamed from: a */
                final /* synthetic */ C29537n f77342a;

                {
                    this.f77342a = r1;
                }

                public final void onGetVideoCoverFailed(int i) {
                    IGetInfoCallback iGetInfoCallback = this.f77342a.f77341b;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(null);
                    }
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    C52711k.m112240b(bitmap, "bitmap");
                    IGetInfoCallback iGetInfoCallback = this.f77342a.f77341b;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(bitmap);
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$o */
    static final class C29539o extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77343a;

        C29539o(IGetInfoCallback iGetInfoCallback) {
            this.f77343a = iGetInfoCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77343a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(null);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$p */
    static final class C29540p extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f77344a;

        /* renamed from: b */
        final /* synthetic */ int[] f77345b;

        /* renamed from: c */
        final /* synthetic */ C50753r f77346c;

        C29540p(String str, int[] iArr, C50753r rVar) {
            this.f77344a = str;
            this.f77345b = iArr;
            this.f77346c = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            VEUtils.getVideoFrames(this.f77344a, this.f77345b, this.f77346c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$q */
    static final class C29541q extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IGetInfoCallback f77347a;

        /* renamed from: b */
        final /* synthetic */ String f77348b;

        /* renamed from: c */
        final /* synthetic */ boolean f77349c;

        C29541q(IGetInfoCallback iGetInfoCallback, String str, boolean z) {
            this.f77347a = iGetInfoCallback;
            this.f77348b = str;
            this.f77349c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IGetInfoCallback iGetInfoCallback = this.f77347a;
            String str = this.f77348b;
            boolean z = this.f77349c;
            C52711k.m112240b(str, "strInVideo");
            C39629l.m88232a().mo58586q();
            int[] iArr = new int[11];
            if (z) {
                C50574e a = C46813b.m101657a(str);
                if (a != null) {
                    iArr[0] = a.f126801a;
                    iArr[1] = a.f126802b;
                    iArr[2] = a.f126803c;
                    iArr[3] = a.f126803c;
                    iArr[4] = a.f126805e;
                    iArr[5] = a.f126806f;
                    iArr[6] = a.f126807g;
                    iArr[7] = a.f126808h;
                    iArr[8] = a.f126809i;
                    iArr[9] = a.f126810j;
                    iArr[10] = a.f126811k;
                }
            } else {
                C52928al.m112612a(str);
            }
            iGetInfoCallback.finish(iArr);
            return C52860x.f131107a;
        }
    }

    public final int[] photoInfo(String str) {
        C52711k.m112240b(str, "photoFilePath");
        int[] imageWidthHeight = new PhotoService().getImageWidthHeight(str);
        C52711k.m112236a((Object) imageWidthHeight, "PhotoService().getImageWidthHeight(photoFilePath)");
        return imageWidthHeight;
    }

    public final void audioLegal(String str, IGetInfoCallback<Integer> iGetInfoCallback) {
        C52711k.m112240b(str, "audioFilePath");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29527e<C52860x>(iGetInfoCallback, str)).mo59667b(new C29528f(iGetInfoCallback)).mo59666a();
    }

    public final void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback) {
        C52711k.m112240b(str, "mp3FilePath");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29532j<C52860x>(iGetInfoCallback, str)).mo59667b(new C29533k(iGetInfoCallback)).mo59666a();
    }

    public final void videoCover(C29059c cVar, IGetInfoCallback<Bitmap> iGetInfoCallback) {
        C52711k.m112240b(cVar, "draft");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29537n<C52860x>(cVar, iGetInfoCallback)).mo59667b(new C29539o(iGetInfoCallback)).mo59666a();
    }

    public final void videoCover(PhotoMovieContext photoMovieContext, IGetInfoCallback<Bitmap> iGetInfoCallback) {
        C52711k.m112240b(photoMovieContext, "photoMovieContext");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29534l<C52860x>(photoMovieContext, iGetInfoCallback)).mo59667b(new C29536m(iGetInfoCallback)).mo59666a();
    }

    public final void audioLegal(List<String> list, IGetInfoCallback<List<Integer>> iGetInfoCallback) {
        C52711k.m112240b(list, "audioList");
        new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29525c<C52860x>(list, iGetInfoCallback)).mo59667b(new C29526d(iGetInfoCallback)).mo59666a();
    }

    public final void videoFrame(String str, int[] iArr, C50753r rVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(iArr, "ptsMs");
        C52711k.m112240b(rVar, "listener");
        new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29540p<C52860x>(str, iArr, rVar)).mo59666a();
    }

    public final void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback) {
        C52711k.m112240b(str, "videoFilePath");
        C52711k.m112240b(iGetInfoCallback, "callback");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29541q<C52860x>(iGetInfoCallback, str, z)).mo59666a();
    }

    public final void audioLegal(List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        C52711k.m112240b(list, "audioList");
        C52711k.m112240b(iFilterMedia, "filterRule");
        new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29523a<C52860x>(list, iFilterMedia, iGetInfoCallback)).mo59667b(new C29524b(iGetInfoCallback)).mo59666a();
    }

    public final void getThumbnail(boolean z, long j, long j2, boolean z2, Options options, IGetInfoCallback<Bitmap> iGetInfoCallback) {
        C29565a a = new C29565a().mo59665a(false);
        C29529g gVar = new C29529g(z, z2, iGetInfoCallback, j, j2, options);
        a.mo59664a((C52670a<C52860x>) gVar).mo59666a();
    }

    public final void importLegal(Context context, String str, boolean z, int i, int i2, C52682m<? super String, ? super Long, C52860x> mVar, C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar) {
        C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar2 = rVar;
        Context context2 = context;
        C52711k.m112240b(context, "context");
        String str2 = str;
        C52711k.m112240b(str, "videoPath");
        C52682m<? super String, ? super Long, C52860x> mVar2 = mVar;
        C52711k.m112240b(mVar2, "onSuccess");
        C52711k.m112240b(rVar2, "onError");
        C29565a a = new C29565a().mo59665a(true);
        C29530h hVar = new C29530h(context2, str2, z, i, i2, mVar2, rVar);
        a.mo59664a((C52670a<C52860x>) hVar).mo59667b(new C29531i(rVar2)).mo59666a();
    }
}
