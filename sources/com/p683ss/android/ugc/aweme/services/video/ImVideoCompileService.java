package com.p683ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40794k;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import com.p683ss.android.ugc.aweme.shortvideo.C42469bn;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44455e;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.C46671a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import dmt.p2652av.video.C52928al;
import java.io.File;
import java.io.InputStream;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52726d;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
public final class ImVideoCompileService {
    public static final Companion Companion = new Companion(null);
    public static final C52668f instance$delegate = C52732g.m112285a(ImVideoCompileService$Companion$instance$2.INSTANCE);
    private static final String sDir;
    public boolean isHardCodeFallback;

    /* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$Companion */
    public static final class Companion {
        static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/video/ImVideoCompileService;"))};

        private Companion() {
        }

        public static /* synthetic */ void instance$annotations() {
        }

        public final ImVideoCompileService getInstance() {
            return (ImVideoCompileService) ImVideoCompileService.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static final ImVideoCompileService getInstance() {
        return Companion.getInstance();
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoBitrate(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoQuality(int i) {
        return i;
    }

    private final ENCODE_PROFILE getEncodeProfile() {
        ENCODE_PROFILE b = C44455e.m97282b();
        C52711k.m112236a((Object) b, "RecordUtil.getMappedHardwareProfile()");
        return b;
    }

    private final C52847n<Integer, Integer> getDefaultOutputVideoSize() {
        return C52856t.m112465a(Integer.valueOf(720), Integer.valueOf(1280));
    }

    private final C52847n<ENCODE_BITRATE_MODE, Integer> getSoftEncodeBitrateConfig() {
        return new C52847n<>(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoQuality(C40797m.m90256k())));
    }

    private final boolean getUseHardwareEncode() {
        if (!C40797m.m90247b() || C40797m.m90248c() || this.isHardCodeFallback) {
            return false;
        }
        return true;
    }

    public final C50720o createVEEditor() {
        C50720o oVar = new C50720o(getCompileWorkSpace());
        oVar.mo99316a(false);
        oVar.mo99361d(0);
        oVar.mo99363d(true);
        return oVar;
    }

    public final String getOutputVideoFilePath() {
        C48016e.m103935a(sDir, false);
        StringBuilder sb = new StringBuilder();
        sb.append(sDir);
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C48016e.m103950d());
        sb.append("/im/video/");
        sDir = sb.toString();
    }

    private final String getCompileWorkSpace() {
        StringBuilder sb = new StringBuilder();
        sb.append(sDir);
        sb.append("compile/");
        File a = C48016e.m103935a(sb.toString(), false);
        C52711k.m112236a((Object) a, "FileHelper.createFile(path, false)");
        String absolutePath = a.getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "FileHelper.createFile(path, false).absolutePath");
        return absolutePath;
    }

    private final C52847n<ENCODE_BITRATE_MODE, Integer> getHardEncodeBitrateConfig() {
        C40794k kVar = C39618d.f101153Q;
        C52711k.m112236a((Object) kVar, "AVEnv.FESTIVAL_SETTINGS");
        float f = kVar.f103918b;
        if (f <= 0.0f) {
            f = C40797m.m90250e();
        }
        return new C52847n<>(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoBitrate(f)));
    }

    private final <T> void safeOnComplete(C2204x<T> xVar) {
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6273a();
        }
    }

    private final boolean enableRemux(CompileParam compileParam) {
        if (C52928al.m112615d(compileParam.getRawVideoPath()) * 1000 > C39618d.f101151O.mo83118b(C40796a.BitrateOfRecodeThreshold)) {
            return true;
        }
        return false;
    }

    public final C2201v<Boolean> getVideoWidthHeight(CompileParam compileParam) {
        C2201v<Boolean> a = C2201v.m6601a((C2205y<T>) new ImVideoCompileService$getVideoWidthHeight$1<T>(this, compileParam));
        C52711k.m112236a((Object) a, "Observable.create<Boolea…)\n            }\n        }");
        return a;
    }

    public final String getVideoFileMD5(String str) {
        File file = new File(str);
        if (file.length() > 524288) {
            return C42469bn.m93321a(C46671a.m101269a((InputStream) C46671a.m101266a(str)));
        }
        return C42469bn.m93319a(file);
    }

    public final VEVideoEncodeSettings createEncodeSettings(CompileParam compileParam) {
        C50585a aVar = new C50585a(2);
        boolean useHardwareEncode = getUseHardwareEncode();
        aVar.mo98703a(useHardwareEncode);
        if (useHardwareEncode) {
            aVar.mo98698a(getEncodeProfile());
            C52847n hardEncodeBitrateConfig = getHardEncodeBitrateConfig();
            aVar.mo98696a((ENCODE_BITRATE_MODE) hardEncodeBitrateConfig.getFirst(), ((Number) hardEncodeBitrateConfig.getSecond()).intValue());
        } else {
            C52847n softEncodeBitrateConfig = getSoftEncodeBitrateConfig();
            aVar.mo98696a((ENCODE_BITRATE_MODE) softEncodeBitrateConfig.getFirst(), ((Number) softEncodeBitrateConfig.getSecond()).intValue());
        }
        C52847n outputVideoSize = outputVideoSize(compileParam);
        aVar.mo98692a(((Number) outputVideoSize.getFirst()).intValue(), ((Number) outputVideoSize.getSecond()).intValue());
        aVar.mo98704a(enableRemux(compileParam), true);
        VEVideoEncodeSettings a = aVar.mo98705a();
        C52711k.m112236a((Object) a, "settingsBuilder.build()");
        return a;
    }

    public final C52847n<Integer, Integer> outputVideoSize(CompileParam compileParam) {
        if (compileParam.getVideoWidth() < 0 || compileParam.getVideoHeight() < 0) {
            C32458a.m75144a("ImVideoCompileService outputVideoSize use default");
            return getDefaultOutputVideoSize();
        }
        int videoWidth = compileParam.getVideoWidth();
        int videoHeight = compileParam.getVideoHeight();
        if (compileParam.getVideoWidth() > 720) {
            videoHeight = (int) ((((float) compileParam.getVideoHeight()) * 720.0f) / ((float) compileParam.getVideoWidth()));
            videoWidth = 720;
        } else if (compileParam.getVideoHeight() > 1280) {
            videoWidth = (int) ((((float) compileParam.getVideoWidth()) * 1280.0f) / ((float) compileParam.getVideoHeight()));
            videoHeight = 1280;
        }
        return C52856t.m112465a(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final C2201v<CompileResult> compileImVideo(CompileParam compileParam) {
        C52711k.m112240b(compileParam, "compileParam");
        CompileResult compileResult = new CompileResult();
        C52726d dVar = new C52726d();
        dVar.element = System.currentTimeMillis();
        C52726d dVar2 = new C52726d();
        C52726d dVar3 = new C52726d();
        dVar3.element = 0;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo start: compileParam=");
        sb.append(compileParam);
        C32458a.m75144a(sb.toString());
        C2201v videoCover = getVideoCover(compileParam.getRawVideoPath(), 240, 240);
        ImVideoCompileService$compileImVideo$1 imVideoCompileService$compileImVideo$1 = new ImVideoCompileService$compileImVideo$1(this, compileResult, dVar2, dVar3, dVar, compileParam);
        C2201v a = videoCover.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) imVideoCompileService$compileImVideo$1);
        ImVideoCompileService$compileImVideo$2 imVideoCompileService$compileImVideo$2 = new ImVideoCompileService$compileImVideo$2(this, dVar2, dVar3, dVar, compileParam, compileResult);
        C2201v a2 = a.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) imVideoCompileService$compileImVideo$2);
        CompileResult compileResult2 = compileResult;
        C52726d dVar4 = dVar2;
        C52726d dVar5 = dVar3;
        C52726d dVar6 = dVar;
        ImVideoCompileService$compileImVideo$3 imVideoCompileService$compileImVideo$3 = new ImVideoCompileService$compileImVideo$3(this, compileResult2, dVar4, dVar5, dVar6);
        C2201v a3 = a2.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) imVideoCompileService$compileImVideo$3);
        ImVideoCompileService$compileImVideo$4 imVideoCompileService$compileImVideo$4 = new ImVideoCompileService$compileImVideo$4(this, compileResult2, dVar4, dVar5, dVar6);
        C2201v<CompileResult> a4 = a3.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) imVideoCompileService$compileImVideo$4);
        C52711k.m112236a((Object) a4, "getVideoCover(compilePar…sult) }\n                }");
        return a4;
    }

    public final <T> void safeOnSingleNext(C2204x<T> xVar, T t) {
        safeOnNext(xVar, t);
        safeOnComplete(xVar);
    }

    private final <T> void safeOnNext(C2204x<T> xVar, T t) {
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6282a(t);
        }
    }

    public final <T> void safeOnError(C2204x<T> xVar, Throwable th) {
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6274a(th);
        }
    }

    public final C2201v<Boolean> compileVideo(CompileParam compileParam, CompileResult compileResult) {
        C2201v<Boolean> a = C2201v.m6601a((C2205y<T>) new ImVideoCompileService$compileVideo$1<T>(this, compileParam, compileResult));
        C52711k.m112236a((Object) a, "Observable.create<Boolea…)\n            }\n        }");
        return a;
    }

    public final int initVEEditor(C50720o oVar, String str) {
        C50720o.m109688b(false);
        return oVar.mo99324a(new String[]{str}, (String[]) null, (String[]) null, C50749j.VIDEO_OUT_RATIO_ORIGINAL);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC, Splitter:B:27:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveBitmapToLocal(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x000e
            r0.delete()
        L_0x000e:
            r5 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002e }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r0 = 80
            r2 = r1
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r4.compress(r5, r0, r2)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r1.flush()     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r1.close()     // Catch:{ Exception -> 0x0025 }
            goto L_0x003a
        L_0x0025:
            return
        L_0x0026:
            r4 = move-exception
            r5 = r1
            goto L_0x003b
        L_0x0029:
            r4 = move-exception
            r5 = r1
            goto L_0x002f
        L_0x002c:
            r4 = move-exception
            goto L_0x003b
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x002c }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r4)     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            return
        L_0x003a:
            return
        L_0x003b:
            if (r5 == 0) goto L_0x0040
            r5.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.video.ImVideoCompileService.saveBitmapToLocal(android.graphics.Bitmap, java.lang.String):void");
    }

    private final C2201v<String> getVideoCover(String str, int i, int i2) {
        C2201v<String> a = C2201v.m6601a((C2205y<T>) new ImVideoCompileService$getVideoCover$1<T>(this, str, i, i2));
        C52711k.m112236a((Object) a, "Observable.create<String…e\n            }\n        }");
        return a;
    }

    public final Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (i <= 0 || i2 <= 0 || bitmap.getWidth() < i || bitmap.getHeight() < i2) {
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            f2 = (float) i;
            f = (f2 / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight());
        } else {
            f = (float) i2;
            f2 = (f / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth());
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f2, (int) f, true);
        C52711k.m112236a((Object) createScaledBitmap, "Bitmap.createScaledBitma… newHeight.toInt(), true)");
        return createScaledBitmap;
    }

    static /* synthetic */ C2201v getVideoCover$default(ImVideoCompileService imVideoCompileService, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return imVideoCompileService.getVideoCover(str, i, i2);
    }
}
