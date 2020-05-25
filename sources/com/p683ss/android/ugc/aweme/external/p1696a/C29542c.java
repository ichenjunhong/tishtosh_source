package com.p683ss.android.ugc.aweme.external.p1696a;

import android.graphics.Bitmap;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.external.p1696a.C29564e.C29565a;
import com.p683ss.android.ugc.aweme.photo.C38655c;
import com.p683ss.android.ugc.aweme.photo.C38681j;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import com.p683ss.android.ugc.aweme.services.video.ImVideoCompileService;
import com.p683ss.android.ugc.aweme.watermark.C48235d.C48236a;
import com.p683ss.android.ugc.aweme.watermark.C48237e;
import com.p683ss.android.ugc.aweme.watermark.C48238f;
import com.p683ss.android.ugc.aweme.watermark.C48257q;
import com.p683ss.android.vesdk.VEUtils;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52803m;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.a.c */
public final class C29542c implements IAVProcessService {

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$a */
    public static final class C29543a implements IPhotoServiceListener {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77350a;

        public final void onSaved(int i, PhotoContext photoContext) {
        }

        C29543a(IProcessCallback iProcessCallback) {
            this.f77350a = iProcessCallback;
        }

        public final void onWaterMakerAdded(Bitmap bitmap) {
            IProcessCallback iProcessCallback = this.f77350a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$b */
    static final class C29544b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ CompileParam f77351a;

        /* renamed from: b */
        final /* synthetic */ C52671b f77352b;

        /* renamed from: c */
        final /* synthetic */ C52671b f77353c;

        C29544b(CompileParam compileParam, C52671b bVar, C52671b bVar2) {
            this.f77351a = compileParam;
            this.f77352b = bVar;
            this.f77353c = bVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ImVideoCompileService.Companion.getInstance().compileImVideo(this.f77351a).mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) new C1710e<CompileResult>(this) {

                /* renamed from: a */
                final /* synthetic */ C29544b f77354a;

                {
                    this.f77354a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    CompileResult compileResult = (CompileResult) obj;
                    C52671b bVar = this.f77354a.f77352b;
                    C52711k.m112236a((Object) compileResult, "it");
                    bVar.invoke(compileResult);
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C29544b f77355a;

                {
                    this.f77355a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C52671b bVar = this.f77355a.f77353c;
                    C52711k.m112236a((Object) th, "it");
                    bVar.invoke(th);
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$c */
    static final class C29547c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f77356a;

        C29547c(C52671b bVar) {
            this.f77356a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f77356a.invoke(new Throwable());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$d */
    static final class C29548d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77357a;

        /* renamed from: b */
        final /* synthetic */ String f77358b;

        /* renamed from: c */
        final /* synthetic */ String f77359c;

        C29548d(IProcessCallback iProcessCallback, String str, String str2) {
            this.f77357a = iProcessCallback;
            this.f77358b = str;
            this.f77359c = str2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IProcessCallback iProcessCallback = this.f77357a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(Integer.valueOf(VEUtils.extractVideo(this.f77358b, this.f77359c)));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$e */
    static final class C29549e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77360a;

        C29549e(IProcessCallback iProcessCallback) {
            this.f77360a = iProcessCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IProcessCallback iProcessCallback = this.f77360a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(Integer.valueOf(-1));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$f */
    static final class C29550f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77361a;

        /* renamed from: b */
        final /* synthetic */ String f77362b;

        /* renamed from: c */
        final /* synthetic */ String f77363c;

        C29550f(IProcessCallback iProcessCallback, String str, String str2) {
            this.f77361a = iProcessCallback;
            this.f77362b = str;
            this.f77363c = str2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IProcessCallback iProcessCallback = this.f77361a;
            if (iProcessCallback != null) {
                FFMpegManager a = FFMpegManager.m46826a();
                iProcessCallback.finish(Integer.valueOf(a.f52944a.remuxVideo(this.f77362b, this.f77363c)));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$g */
    static final class C29551g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77364a;

        C29551g(IProcessCallback iProcessCallback) {
            this.f77364a = iProcessCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IProcessCallback iProcessCallback = this.f77364a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(Integer.valueOf(-1));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$h */
    public static final class C29552h implements IPhotoServiceListener {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77365a;

        public final void onWaterMakerAdded(Bitmap bitmap) {
        }

        C29552h(IProcessCallback iProcessCallback) {
            this.f77365a = iProcessCallback;
        }

        public final void onSaved(int i, PhotoContext photoContext) {
            IProcessCallback iProcessCallback = this.f77365a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(photoContext);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$i */
    public static final class C29553i implements IPhotoServiceListener {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77366a;

        C29553i(IProcessCallback iProcessCallback) {
            this.f77366a = iProcessCallback;
        }

        public final void onWaterMakerAdded(Bitmap bitmap) {
            StringBuilder sb = new StringBuilder("An operation is not implemented: ");
            sb.append("not implemented");
            throw new C52803m(sb.toString());
        }

        public final void onSaved(int i, PhotoContext photoContext) {
            IProcessCallback iProcessCallback = this.f77366a;
            if (iProcessCallback != null) {
                iProcessCallback.finish(photoContext);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$j */
    public static final class C29554j implements IPhotoServiceListener {

        /* renamed from: a */
        final /* synthetic */ IProcessCallback f77367a;

        public final void onWaterMakerAdded(Bitmap bitmap) {
        }

        C29554j(IProcessCallback iProcessCallback) {
            this.f77367a = iProcessCallback;
        }

        public final void onSaved(int i, PhotoContext photoContext) {
            boolean z;
            IProcessCallback iProcessCallback = this.f77367a;
            if (iProcessCallback != null) {
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                iProcessCallback.finish(Boolean.valueOf(z));
            }
        }
    }

    public final void addWaterMark(Bitmap bitmap, IProcessCallback<Bitmap> iProcessCallback) {
        C52711k.m112240b(bitmap, "bitmap");
        new C48238f().photoAddWaterMarker(bitmap, new C29543a(iProcessCallback));
    }

    public final void compileVideo(CompileParam compileParam, C52671b<? super CompileResult, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(compileParam, "compileParam");
        C52711k.m112240b(bVar, "onSuccess");
        C52711k.m112240b(bVar2, "onFail");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29544b<C52860x>(compileParam, bVar, bVar2)).mo59667b(new C29547c(bVar2)).mo59666a();
    }

    public final void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback) {
        C52711k.m112240b(str, "inputPath");
        C52711k.m112240b(str2, "outputPath");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29548d<C52860x>(iProcessCallback, str, str2)).mo59667b(new C29549e(iProcessCallback)).mo59666a();
    }

    public final void remuxVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback) {
        C52711k.m112240b(str, "filePath");
        C52711k.m112240b(str2, "mOutPath");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29550f<C52860x>(iProcessCallback, str, str2)).mo59667b(new C29551g(iProcessCallback)).mo59666a();
    }

    public final void savePhoto(PhotoContext photoContext, boolean z, IProcessCallback<PhotoContext> iProcessCallback) {
        C52711k.m112240b(photoContext, "photoContext");
        if (z) {
            new C48238f().savePhotoWithWaterMarker(photoContext, new C29552h(iProcessCallback));
        } else {
            new C48238f().savePhotoWithoutWaterMarker(photoContext, new C29553i(iProcessCallback));
        }
    }

    public final void savePhoto(String str, String str2, boolean z, IProcessCallback<Boolean> iProcessCallback) {
        C52711k.m112240b(str, "imagePath");
        C52711k.m112240b(str2, "savePath");
        if (z) {
            new C48238f().photoAddStoryWaterMarker(str, str2, new C29554j(iProcessCallback));
        }
    }

    public final void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback) {
        PhotoContext photoContext;
        String str2;
        C52711k.m112240b(str, "photoPath");
        if (num == null || num2 == null) {
            photoContext = C38681j.m86035a(str, new C38655c());
        } else {
            photoContext = C38681j.m86036a(str, new C38655c(), num.intValue(), num2.intValue());
        }
        if (iProcessCallback != null) {
            if (photoContext != null) {
                str2 = photoContext.mPhotoLocalPath;
            } else {
                str2 = null;
            }
            iProcessCallback.finish(str2);
        }
    }

    public final void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IProcessCallback<String[]> iProcessCallback) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "dir");
        C52711k.m112240b(str3, "commonName");
        if (iProcessCallback != null) {
            String[] a = C48257q.m104540a(str, str2, str3, str4, z);
            C52711k.m112236a((Object) a, "WaterMarkImageHelper.cre…, waterPicDir, leftAlign)");
            iProcessCallback.finish(a);
        }
    }

    public final void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IProcessCallback<String[]> iProcessCallback) {
        String str5 = str4;
        IProcessCallback<String[]> iProcessCallback2 = iProcessCallback;
        String str6 = str;
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "dir");
        C52711k.m112240b(str3, "commonName");
        C52711k.m112240b(str5, "waterPicDir");
        if (iProcessCallback2 != null) {
            String[] a = C48237e.m104490a(i, i2, str, str2, str3, z, z2, z3, new C48236a().mo95727a(str5).mo95728a());
            C52711k.m112236a((Object) a, "I18nWaterMarkImageHelper…Dir(waterPicDir).build())");
            iProcessCallback2.finish(a);
        }
    }
}
