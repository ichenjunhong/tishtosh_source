package com.p683ss.android.ugc.aweme.watermark;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32468e;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParamBuilderService;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45635a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45637b;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45639c;
import com.p683ss.android.ugc.aweme.watermark.C48235d.C48236a;
import com.p683ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl */
public final class WaterMarkServiceImpl implements IWaterMarkService {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(WaterMarkServiceImpl.class), "waterMarkComposer", "getWaterMarkComposer()Lcom/ss/android/ugc/aweme/watermark/WaterMarkComposer;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(WaterMarkServiceImpl.class), "photoProcessServiceImpl", "getPhotoProcessServiceImpl()Lcom/ss/android/ugc/aweme/watermark/PhotoProcessServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(WaterMarkServiceImpl.class), "watermarkParamBuilderServieImpl", "getWatermarkParamBuilderServieImpl()Lcom/ss/android/ugc/aweme/watermark/WatermarkParamBuilderServiceImpl;"))};
    private final C52668f photoProcessServiceImpl$delegate = C52732g.m112285a(C48226b.f121360a);
    private final C52668f waterMarkComposer$delegate = C52732g.m112285a(C48230f.f121366a);
    private final C52668f watermarkParamBuilderServieImpl$delegate = C52732g.m112285a(C48231g.f121367a);

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$a */
    static final class C48225a extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f121359a;

        C48225a(WaterMarkServiceImpl waterMarkServiceImpl) {
            this.f121359a = waterMarkServiceImpl;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C48251m waterMarkComposer = this.f121359a.getWaterMarkComposer();
                waterMarkComposer.mo95752b();
                if (waterMarkComposer.f121437e != null) {
                    waterMarkComposer.f121437e.mo92023a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$b */
    static final class C48226b extends C52712l implements C52670a<C48238f> {

        /* renamed from: a */
        public static final C48226b f121360a = new C48226b();

        C48226b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C48238f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$c */
    static final class C48227c extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f121361a;

        /* renamed from: b */
        final /* synthetic */ C48250l f121362b;

        C48227c(WaterMarkServiceImpl waterMarkServiceImpl, C48250l lVar) {
            this.f121361a = waterMarkServiceImpl;
            this.f121362b = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                this.f121361a.getWaterMarkComposer().f121436d = this.f121362b;
                this.f121361a.getWaterMarkComposer().mo95749a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$d */
    static final class C48228d extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f121363a;

        /* renamed from: b */
        final /* synthetic */ C48250l f121364b;

        C48228d(WaterMarkServiceImpl waterMarkServiceImpl, C48250l lVar) {
            this.f121363a = waterMarkServiceImpl;
            this.f121364b = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            boolean z2;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C48251m waterMarkComposer = this.f121363a.getWaterMarkComposer();
                waterMarkComposer.f121436d = this.f121364b;
                boolean z3 = false;
                C32468e.m75176a(waterMarkComposer.f121436d.f121415a, "inputPath can't be null", new Object[0]);
                C32468e.m75176a(waterMarkComposer.f121436d.f121416b, "outPath can't be null", new Object[0]);
                C32468e.m75176a(waterMarkComposer.f121436d.f121417c, "author can't be null", new Object[0]);
                C32468e.m75176a(waterMarkComposer.f121436d.f121418d, "video can't be null", new Object[0]);
                if (waterMarkComposer.f121436d.f121419e || waterMarkComposer.f121436d.f121420f || waterMarkComposer.f121436d.f121429o) {
                    z = true;
                } else {
                    z = false;
                }
                C32468e.m75177a(z, "不需要添加水印为什么要调用该功能？？？", new Object[0]);
                File file = new File(waterMarkComposer.f121436d.f121416b);
                File parentFile = file.getParentFile();
                if (parentFile.isDirectory() || parentFile.mkdirs()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sb = new StringBuilder("输出文件夹创建失败 \noutPath = ");
                sb.append(waterMarkComposer.f121436d.f121416b);
                sb.append("\noutPath isExist = ");
                sb.append(file.exists());
                sb.append("\noutPath isfile =  ");
                sb.append(file.isFile());
                sb.append("\noutDir  = ");
                sb.append(parentFile.getPath());
                sb.append("\noutDir.isDirectory() = ");
                sb.append(parentFile.isDirectory());
                sb.append("\noutDir.mkdirs() = ");
                sb.append(parentFile.mkdirs());
                C32468e.m75177a(z2, sb.toString(), new Object[0]);
                boolean z4 = waterMarkComposer.f121436d.f121419e;
                if (!waterMarkComposer.f121436d.f121425k) {
                    z3 = waterMarkComposer.f121436d.f121420f;
                } else if (waterMarkComposer.f121436d.f121422h && C39618d.f101169j.mo74141c()) {
                    z3 = true;
                }
                C0013i.m18a((Callable<TResult>) new C48254n<TResult>(waterMarkComposer, z4, waterMarkComposer.f121436d.f121429o, z3), (Executor) C24076h.m58902c());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$e */
    public static final class C48229e implements C45639c {

        /* renamed from: a */
        final /* synthetic */ C45635a f121365a;

        /* renamed from: a */
        public final void mo92026a() {
        }

        /* renamed from: a */
        public final void mo92027a(float f) {
        }

        /* renamed from: a */
        public final void mo92028a(int i, String str, int i2) {
            C52711k.m112240b(str, "errorMsg");
        }

        C48229e(C45635a aVar) {
            this.f121365a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$f */
    static final class C48230f extends C52712l implements C52670a<C48251m> {

        /* renamed from: a */
        public static final C48230f f121366a = new C48230f();

        C48230f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C48251m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$g */
    static final class C48231g extends C52712l implements C52670a<C48260t> {

        /* renamed from: a */
        public static final C48231g f121367a = new C48231g();

        C48231g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C48260t();
        }
    }

    private final C48238f getPhotoProcessServiceImpl() {
        return (C48238f) this.photoProcessServiceImpl$delegate.getValue();
    }

    private final C48260t getWatermarkParamBuilderServieImpl() {
        return (C48260t) this.watermarkParamBuilderServieImpl$delegate.getValue();
    }

    public final C48251m getWaterMarkComposer() {
        return (C48251m) this.waterMarkComposer$delegate.getValue();
    }

    public final IPhotoProcessService photoProcessService() {
        return getPhotoProcessServiceImpl();
    }

    public final IWatermarkParamBuilderService watermarkParamBuilderService() {
        return getWatermarkParamBuilderServieImpl();
    }

    public final void cancelWaterMark() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C48225a(this));
    }

    public static IWaterMarkService createIWaterMarkServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IWaterMarkService.class);
        if (a != null) {
            return (IWaterMarkService) a;
        }
        if (C27991b.f73492aw == null) {
            synchronized (IWaterMarkService.class) {
                if (C27991b.f73492aw == null) {
                    C27991b.f73492aw = new WaterMarkServiceImpl();
                }
            }
        }
        return (WaterMarkServiceImpl) C27991b.f73492aw;
    }

    public final synchronized void prepareDataForI18n(C48250l lVar) {
        C52711k.m112240b(lVar, "waterMarkBuilder");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C48227c(this, lVar));
    }

    public final synchronized void waterMark(C48250l lVar) {
        C52711k.m112240b(lVar, "waterMarkBuilder");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C48228d(this, lVar));
    }

    public final String[] createWaterMarkImages(String str, String str2, String str3, String str4, boolean z) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "dir");
        C52711k.m112240b(str3, "commonName");
        String[] a = C48257q.m104540a(str, str2, str3, str4, z);
        C52711k.m112236a((Object) a, "WaterMarkImageHelper.cre…, waterPicDir, leftAlign)");
        return a;
    }

    public final synchronized void waterMark(int i, String str, String str2, int[] iArr, C45635a aVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "outVideoPath");
        C52711k.m112240b(iArr, "videoSize");
        VEWatermarkParam a = C48247i.m104502a(i, str2, C39618d.f101183x.mo74285e(), iArr, false, "", false);
        if (a != null) {
            waterMark(str, str2, iArr, a, null, aVar);
        }
    }

    private final synchronized void waterMark(String str, String str2, int[] iArr, VEWatermarkParam vEWatermarkParam, C48248j jVar, C45635a aVar) {
        C48249k kVar = new C48249k(str, str2, vEWatermarkParam, C48247i.m104501a(iArr[0], iArr[1]), null, 16, null);
        if (jVar != null) {
            kVar.mo95737a(jVar);
        }
        String a = Workspace.m93093a(kVar.f121455g);
        C52711k.m112236a((Object) a, "Workspace.getDraftDirFro…markParam.inputMediaPath)");
        new C45637b(a).mo92025a(kVar, new C48229e(aVar));
    }

    public final String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        String str5 = str4;
        String str6 = str;
        C52711k.m112240b(str, "text");
        String str7 = str2;
        C52711k.m112240b(str2, "dir");
        String str8 = str3;
        C52711k.m112240b(str8, "commonName");
        C52711k.m112240b(str5, "waterPicDir");
        String[] a = C48237e.m104490a(i, i2, str6, str7, str8, z, z2, z3, new C48236a().mo95727a(str5).mo95728a());
        C52711k.m112236a((Object) a, "I18nWaterMarkImageHelper…Dir(waterPicDir).build())");
        return a;
    }
}
