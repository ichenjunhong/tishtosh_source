package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ExifInterface;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.vesdk.C50717m.C50718a;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c */
public final class C34415c {

    /* renamed from: a */
    public static final C34415c f88806a = new C34415c();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$a */
    static final class C34416a<TTaskResult, TContinuationResult> implements C0011g<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f88807a;

        C34416a(C52671b bVar) {
            this.f88807a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52671b bVar = this.f88807a;
            C52711k.m112236a((Object) iVar, "it");
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "it.result");
            bVar.invoke(e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$b */
    public static final class C34417b implements IGetInfoCallback<int[]> {

        /* renamed from: a */
        final /* synthetic */ C0027j f88808a;

        /* renamed from: b */
        final /* synthetic */ C34409a f88809b;

        public final /* synthetic */ void finish(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                C32458a.m75144a("MediaLegalityCheck checkInternal getVideoFileInfo failed");
                this.f88808a.mo44a(Boolean.valueOf(true));
                return;
            }
            if (!(this.f88809b.getWidth() == iArr[0] && this.f88809b.getHeight() == iArr[1])) {
                this.f88809b.setWidth(iArr[0]);
                this.f88809b.setHeight(iArr[1]);
                this.f88809b.setResized(true);
                StringBuilder sb = new StringBuilder("MediaLegalityCheck checkInternal resize: [");
                sb.append(this.f88809b.getWidth());
                sb.append(", ");
                sb.append(this.f88809b.getHeight());
                C32458a.m75144a(sb.toString());
            }
            int i = iArr[8];
            int c = C52753d.m112321c(this.f88809b.getWidth(), this.f88809b.getHeight());
            int d = C52753d.m112322d(this.f88809b.getWidth(), this.f88809b.getHeight());
            if (d > 1100 && i != C50718a.AV_CODEC_ID_H264.ordinal()) {
                C32458a.m75144a("MediaLegalityCheck checkInternal 1080P not support H265");
                this.f88808a.mo44a(Boolean.valueOf(false));
            } else if (d > 2160 || c > 4096) {
                C32458a.m75144a("MediaLegalityCheck checkInternal not support 4K");
                this.f88808a.mo44a(Boolean.valueOf(false));
            } else {
                this.f88808a.mo44a(Boolean.valueOf(true));
            }
        }

        C34417b(C0027j jVar, C34409a aVar) {
            this.f88808a = jVar;
            this.f88809b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$c */
    static final class C34418c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88810a;

        /* renamed from: b */
        final /* synthetic */ C0027j f88811b;

        C34418c(C34409a aVar, C0027j jVar) {
            this.f88810a = aVar;
            this.f88811b = jVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            C34409a aVar = this.f88810a;
            C0027j jVar = this.f88811b;
            if (!aVar.isVideo()) {
                C34409a.accurateSize$default(aVar, true, null, 2, null);
                jVar.mo44a(Boolean.valueOf(true));
            } else {
                CharSequence filePath = aVar.getFilePath();
                if (filePath == null || filePath.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C32458a.m75144a("MediaLegalityCheck checkInternal filePath invalid");
                    jVar.mo44a(Boolean.valueOf(false));
                } else {
                    IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
                    if (aVServiceImpl_Monster == null) {
                        jVar.mo44a(Boolean.valueOf(true));
                    } else {
                        IAVInfoService infoService = aVServiceImpl_Monster.abilityService().infoService();
                        String filePath2 = aVar.getFilePath();
                        if (filePath2 == null) {
                            C52711k.m112234a();
                        }
                        infoService.videoInfo(filePath2, true, new C34417b(jVar, aVar));
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$d */
    public static final class C34419d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88812a;

        public C34419d(C34409a aVar) {
            this.f88812a = aVar;
        }

        public final /* synthetic */ Object call() {
            C34415c.f88806a.mo72448b(this.f88812a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$e */
    public static final class C34420e<TTaskResult, TContinuationResult> implements C0011g<C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f88813a;

        public C34420e(C52670a aVar) {
            this.f88813a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f88813a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$f */
    public static final class C34421f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88814a;

        public C34421f(C34409a aVar) {
            this.f88814a = aVar;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C34415c.m78364a(this.f88814a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$g */
    public static final class C34422g<TTaskResult, TContinuationResult> implements C0011g<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f88815a;

        public C34422g(C52671b bVar) {
            this.f88815a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52671b bVar = this.f88815a;
            C52711k.m112236a((Object) iVar, "it");
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "it.result");
            bVar.invoke(e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.c$h */
    public static final class C34423h implements IGetInfoCallback<int[]> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88816a;

        /* renamed from: b */
        final /* synthetic */ C0027j f88817b;

        public final /* synthetic */ void finish(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                this.f88816a.setWidth(iArr[0]);
                this.f88816a.setHeight(iArr[1]);
                this.f88816a.setResized(true);
                StringBuilder sb = new StringBuilder("MediaLegalityCheck ensureVideoSizeInfoInternal success: ");
                sb.append(this.f88816a.getWidth());
                sb.append(", ");
                sb.append(this.f88816a.getHeight());
                C32458a.m75144a(sb.toString());
                this.f88817b.mo44a(Boolean.valueOf(true));
                return;
            }
            this.f88817b.mo44a(Boolean.valueOf(false));
            C32458a.m75144a("MediaLegalityCheck ensureVideoSizeInfoInternal failed");
        }

        C34423h(C34409a aVar, C0027j jVar) {
            this.f88816a = aVar;
            this.f88817b = jVar;
        }
    }

    private C34415c() {
    }

    /* renamed from: c */
    private static C0013i<Boolean> m78365c(C34409a aVar) {
        C0027j jVar = new C0027j();
        C0013i.m16a((Callable<TResult>) new C34418c<TResult>(aVar, jVar));
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m78363a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        char c = 0;
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                c = 180;
            } else if (attributeInt == 6) {
                c = 'Z';
            } else if (attributeInt == 8) {
                c = 270;
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
        if (c == 'Z' || c == 270) {
            return new Pair<>(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* renamed from: b */
    public final void mo72448b(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (aVar.getFilePath() != null) {
            String filePath = aVar.getFilePath();
            if (filePath == null) {
                C52711k.m112234a();
            }
            Pair a = m78363a(filePath);
            if (a != null) {
                Object obj = a.first;
                C52711k.m112236a(obj, "it.first");
                aVar.setWidth(((Number) obj).intValue());
                Object obj2 = a.second;
                C52711k.m112236a(obj2, "it.second");
                aVar.setHeight(((Number) obj2).intValue());
                aVar.setResized(true);
            }
        }
    }

    /* renamed from: a */
    public static boolean m78364a(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (!aVar.isVideo()) {
            return false;
        }
        C0027j jVar = new C0027j();
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        if (aVServiceImpl_Monster == null) {
            return true;
        }
        IAVInfoService infoService = aVServiceImpl_Monster.abilityService().infoService();
        String filePath = aVar.getFilePath();
        if (filePath == null) {
            C52711k.m112234a();
        }
        infoService.videoInfo(filePath, true, new C34423h(aVar, jVar));
        jVar.f77a.mo36g();
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        Object e = iVar.mo34e();
        C52711k.m112236a(e, "taskCompletionSource.task.result");
        return ((Boolean) e).booleanValue();
    }

    /* renamed from: a */
    public final void mo72447a(C34409a aVar, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(aVar, "mediaModel");
        C52711k.m112240b(bVar, "callback");
        m78365c(aVar).mo20a((C0011g<TResult, TContinuationResult>) new C34416a<TResult,TContinuationResult>(bVar), C0013i.f25b);
    }
}
