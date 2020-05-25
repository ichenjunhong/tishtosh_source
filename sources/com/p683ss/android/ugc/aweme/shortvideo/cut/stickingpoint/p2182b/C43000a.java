package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2182b;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43799ew;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43048i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42988a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42989b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2182b.C43010b.C43012b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43019c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a */
public final class C43000a {

    /* renamed from: a */
    public static final C43000a f108582a = new C43000a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a */
    public static final class C43001a implements C43012b {

        /* renamed from: a */
        final /* synthetic */ C43019c f108583a;

        /* renamed from: b */
        final /* synthetic */ C42482c f108584b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a */
        public static final class C43002a extends C42989b {

            /* renamed from: a */
            final /* synthetic */ C43001a f108585a;

            C43002a(C43001a aVar) {
                this.f108585a = aVar;
            }

            /* renamed from: b */
            public final void mo87297b(C42482c cVar, boolean z) {
                C43019c cVar2 = this.f108585a.f108583a;
                if (cVar2 != null) {
                    cVar2.mo87297b(cVar, z);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b */
        public static final class C43003b extends C42989b {

            /* renamed from: a */
            final /* synthetic */ C43001a f108586a;

            C43003b(C43001a aVar) {
                this.f108586a = aVar;
            }

            /* renamed from: b */
            public final void mo87297b(C42482c cVar, boolean z) {
                C43019c cVar2 = this.f108586a.f108583a;
                if (cVar2 != null) {
                    cVar2.mo87297b(cVar, z);
                }
            }
        }

        C43001a(C43019c cVar, C42482c cVar2) {
            this.f108583a = cVar;
            this.f108584b = cVar2;
        }

        /* renamed from: a */
        public final void mo87391a(C43799ew ewVar, boolean z) {
            Boolean bool;
            if (z) {
                if (ewVar != null) {
                    bool = Boolean.valueOf(ewVar.existOnSetAlgFile());
                } else {
                    bool = null;
                }
                if (bool == null) {
                    C52711k.m112234a();
                }
                if (bool.booleanValue()) {
                    C43019c cVar = this.f108583a;
                    if (cVar != null) {
                        cVar.mo87297b(this.f108584b, true);
                    }
                } else {
                    C43000a.m94246a(this.f108584b, new C43002a(this));
                }
            } else {
                C43000a.m94246a(this.f108584b, new C43003b(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$b */
    public static final class C43004b extends C42988a {

        /* renamed from: a */
        final /* synthetic */ String f108587a;

        /* renamed from: b */
        final /* synthetic */ C43019c f108588b;

        /* renamed from: c */
        final /* synthetic */ C42482c f108589c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (!C48016e.m103944b(this.f108587a)) {
                C43019c cVar = this.f108588b;
                if (cVar != null) {
                    cVar.mo87296a(this.f108589c, false);
                }
                C43048i.m94339a(false, this.f108589c, null);
                return;
            }
            C43019c cVar2 = this.f108588b;
            if (cVar2 != null) {
                cVar2.mo87296a(this.f108589c, true);
            }
            C43048i.m94339a(true, this.f108589c, null);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C43019c cVar = this.f108588b;
            if (cVar != null) {
                cVar.mo87296a(this.f108589c, false);
            }
            C43048i.m94339a(false, this.f108589c, baseException);
        }

        C43004b(String str, C43019c cVar, C42482c cVar2) {
            this.f108587a = str;
            this.f108588b = cVar;
            this.f108589c = cVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c */
    public static final class C43005c extends C42989b {

        /* renamed from: a */
        final /* synthetic */ C43019c f108590a;

        /* renamed from: b */
        final /* synthetic */ Context f108591b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c$a */
        public static final class C43006a extends C42989b {

            /* renamed from: a */
            final /* synthetic */ C43005c f108592a;

            C43006a(C43005c cVar) {
                this.f108592a = cVar;
            }

            /* renamed from: b */
            public final void mo87297b(C42482c cVar, boolean z) {
                C43019c cVar2 = this.f108592a.f108590a;
                if (cVar2 != null) {
                    cVar2.mo87297b(cVar, z);
                }
            }
        }

        C43005c(C43019c cVar, Context context) {
            this.f108590a = cVar;
            this.f108591b = context;
        }

        /* renamed from: a */
        public final void mo87296a(C42482c cVar, boolean z) {
            if (z) {
                C43019c cVar2 = this.f108590a;
                if (cVar2 != null) {
                    cVar2.mo87296a(cVar, true);
                }
                Context context = this.f108591b;
                C43019c aVar = new C43006a(this);
                if (context == null || cVar == null || cVar.getStickPointMusicAlg() == null) {
                    aVar.mo87297b(cVar, false);
                } else {
                    C43010b bVar = new C43010b();
                    bVar.f108603e = new C43001a(aVar, cVar);
                    C43799ew stickPointMusicAlg = cVar.getStickPointMusicAlg();
                    C52711k.m112240b(context, "context");
                    if (stickPointMusicAlg == null) {
                        C43012b bVar2 = bVar.f108603e;
                        if (bVar2 != null) {
                            bVar2.mo87391a(stickPointMusicAlg, bVar.f108605g);
                        }
                    } else {
                        bVar.f108604f = stickPointMusicAlg;
                        bVar.f108599a = context;
                        bVar.f108605g = false;
                        bVar.f108601c.clear();
                        bVar.f108602d.clear();
                        bVar.f108600b = 0;
                        if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
                            bVar.f108601c.add(stickPointMusicAlg.getVeBeatsUrl());
                            bVar.f108602d.add(stickPointMusicAlg.getVeBeatsPath());
                            bVar.f108606h.add("ve-beats");
                        }
                        if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
                            bVar.f108601c.add(stickPointMusicAlg.getDownBeatsUrl());
                            bVar.f108602d.add(stickPointMusicAlg.getDownBeatsPath());
                            bVar.f108606h.add("down-beats");
                        }
                        if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
                            bVar.f108601c.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
                            bVar.f108602d.add(stickPointMusicAlg.getNoStrengthBeatsPath());
                            bVar.f108606h.add("no-strength-beats");
                        }
                        if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
                            bVar.f108601c.add(stickPointMusicAlg.getManModeBeatsUrl());
                            bVar.f108602d.add(stickPointMusicAlg.getManModeBeatsPath());
                            bVar.f108606h.add("man_mode");
                        }
                        if (bVar.f108601c.size() == 0) {
                            C43012b bVar3 = bVar.f108603e;
                            if (bVar3 != null) {
                                bVar3.mo87391a(stickPointMusicAlg, bVar.f108605g);
                            }
                        } else {
                            bVar.mo87393a();
                        }
                    }
                }
            } else {
                C43019c cVar3 = this.f108590a;
                if (cVar3 != null) {
                    cVar3.mo87296a(cVar, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$d */
    public static final class C43007d implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFetchResourcesListener f108593a;

        C43007d(IFetchResourcesListener iFetchResourcesListener) {
            this.f108593a = iFetchResourcesListener;
        }

        public final void onFailed(Exception exc) {
            C52711k.m112240b(exc, "e");
            C43036f.m94305a(false);
            IFetchResourcesListener iFetchResourcesListener = this.f108593a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            C43036f.m94305a(true);
            IFetchResourcesListener iFetchResourcesListener = this.f108593a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$e */
    static final class C43008e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f108594a;

        /* renamed from: b */
        final /* synthetic */ String f108595b;

        C43008e(String str, String str2) {
            this.f108594a = str;
            this.f108595b = str2;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            String str = this.f108594a;
            if (str == null) {
                C52711k.m112234a();
            }
            String str2 = this.f108595b;
            if (str2 == null) {
                C52711k.m112234a();
            }
            if (VEUtils.getMusicDefaultAlgorithm(str, str2) == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$f */
    static final class C43009f<TTaskResult, TContinuationResult> implements C0011g<Boolean, Object> {

        /* renamed from: a */
        final /* synthetic */ C42989b f108596a;

        /* renamed from: b */
        final /* synthetic */ C42482c f108597b;

        C43009f(C42989b bVar, C42482c cVar) {
            this.f108596a = bVar;
            this.f108597b = cVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || !((Boolean) iVar.mo34e()).booleanValue()) {
                C42989b bVar = this.f108596a;
                if (bVar != null) {
                    bVar.mo87297b(this.f108597b, false);
                }
            } else {
                C42989b bVar2 = this.f108596a;
                if (bVar2 != null) {
                    bVar2.mo87297b(this.f108597b, true);
                }
            }
            return null;
        }
    }

    private C43000a() {
    }

    /* renamed from: a */
    public static void m94245a(IFetchResourcesListener iFetchResourcesListener) {
        if (C43036f.m94312e()) {
            AVServiceImpl.createIInternalAVServicebyMonsterPlugin().fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new C43007d(iFetchResourcesListener));
        } else if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(null);
        }
    }

    /* renamed from: a */
    public static void m94246a(C42482c cVar, C42989b bVar) {
        String c = C43036f.m94308c(cVar);
        String b = C43036f.m94306b(cVar);
        if (!C48016e.m103944b(c)) {
            bVar.mo87297b(cVar, false);
        } else if (TextUtils.isEmpty(b)) {
            bVar.mo87297b(cVar, false);
        } else {
            C0013i.m16a((Callable<TResult>) new C43008e<TResult>(c, b)).mo20a((C0011g<TResult, TContinuationResult>) new C43009f<TResult,TContinuationResult>(bVar, cVar), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo87390a(Context context, C42482c cVar, C43019c cVar2) {
        m94247b(context, cVar, new C43005c(cVar2, context));
    }

    /* renamed from: b */
    private final void m94247b(Context context, C42482c cVar, C43019c cVar2) {
        if (context == null || cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            cVar2.mo87296a(cVar, false);
            return;
        }
        String c = C43036f.m94308c(cVar);
        if (C48016e.m103944b(c)) {
            cVar2.mo87296a(cVar, true);
        } else {
            m94244a(context, cVar.getPath(), c, new C43004b(c, cVar2, cVar));
        }
    }

    /* renamed from: a */
    public static void m94244a(Context context, String str, String str2, C42988a aVar) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            aVar.onFailed(new DownloadInfo((Cursor) null), new BaseException());
        } else if (C48016e.m103944b(str2)) {
            aVar.onSuccessed(new DownloadInfo((Cursor) null));
        } else {
            File file = new File(str2);
            DownloadTask ignoreDataVerify = Downloader.with(context).url(str).ignoreDataVerify(true);
            StringBuilder sb = new StringBuilder();
            sb.append(file.getParent());
            sb.append(File.separator);
            ignoreDataVerify.savePath(sb.toString()).name(file.getName()).mainThreadListener(aVar).download();
        }
    }
}
