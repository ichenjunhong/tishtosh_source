package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0184k;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.SystemClock;
import android.p002a.p003a.p004a.C0030a;
import android.p002a.p003a.p004a.C0037d;
import android.p002a.p003a.p004a.C0039f;
import android.support.p030v4.p040os.C0958a;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.ttve.editorInfo.C20084a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParam;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43995b;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43884l;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45239a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45243ab;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45247ae;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45248af;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45249ag;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45249ag.C45251b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45252b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45284c;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45284c.C452851;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45310n;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45311o;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45311o.C45312a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45314q;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45319v;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45323y;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45324z;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.shortvideo.upload.httpdns.C45301a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2246a.C45240a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.aweme.utils.C47921gl;
import com.p683ss.android.ugc.aweme.utils.C47955u;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.VEListener.C50550n;
import com.p683ss.android.vesdk.VEWatermarkParam;
import com.p683ss.ttuploader.TTExternFileReader;
import com.p683ss.ttuploader.TTUploadResolver;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderAbstractListener;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import dmt.p2652av.video.C52908ad;
import dmt.p2652av.video.C52928al;
import dmt.p2652av.video.C52965e;
import dmt.p2652av.video.C52972j;
import dmt.p2652av.video.C52979m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1912ag;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab */
public final class C42402ab extends C43907k {

    /* renamed from: A */
    private String f107249A;

    /* renamed from: B */
    private boolean f107250B;

    /* renamed from: C */
    private boolean f107251C;

    /* renamed from: D */
    private C45310n f107252D;

    /* renamed from: E */
    private boolean f107253E;

    /* renamed from: f */
    public volatile boolean f107254f;

    /* renamed from: g */
    public C45311o f107255g;

    /* renamed from: h */
    public C43211de<SynthetiseResult> f107256h;

    /* renamed from: i */
    public C0958a f107257i;

    /* renamed from: j */
    public C43848fq f107258j;

    /* renamed from: k */
    public TTVideoUploader f107259k;

    /* renamed from: l */
    public boolean f107260l;

    /* renamed from: m */
    public int f107261m;

    /* renamed from: n */
    public C45292c f107262n;

    /* renamed from: o */
    public C45249ag f107263o;

    /* renamed from: p */
    public boolean f107264p;

    /* renamed from: q */
    public C42411a f107265q;

    /* renamed from: r */
    private C43781eh f107266r;

    /* renamed from: s */
    private C17832m<VideoCreation> f107267s;

    /* renamed from: t */
    private C43211de<VideoCreation> f107268t;

    /* renamed from: u */
    private C45243ab f107269u;

    /* renamed from: v */
    private final TTUploaderService f107270v;

    /* renamed from: w */
    private final C43775ef f107271w = new C43775ef();

    /* renamed from: x */
    private C45314q f107272x;

    /* renamed from: y */
    private C45239a f107273y = new C45239a();

    /* renamed from: z */
    private C43209dc f107274z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab$a */
    static class C42411a {

        /* renamed from: a */
        boolean f107291a;

        /* renamed from: b */
        Object f107292b;

        /* renamed from: c */
        VideoCreation f107293c;

        private C42411a() {
        }
    }

    /* renamed from: c */
    public final long mo86496c() {
        if (this.f107258j == null) {
            return -1;
        }
        return this.f107258j.f111041a;
    }

    /* renamed from: b */
    public final synchronized boolean mo86495b() {
        if (this.f107252D == null) {
            this.f107253E = true;
            return true;
        }
        return this.f107252D.mo91583a();
    }

    /* renamed from: a */
    public final void mo78617a() {
        this.f107260l = true;
        if (this.f107269u != null) {
            this.f107269u.f114426c = true;
        }
        if (this.f107263o != null) {
            this.f107263o.f114445d = true;
        }
        if (this.f107261m > 0 && this.f107259k != null) {
            this.f107259k.allowMergeUpload();
        }
        C45292c cVar = this.f107262n;
        C17429o oVar = cVar.f114530b;
        C52711k.m112236a((Object) oVar, "waitClickPublishTimeCounter");
        synchronized (oVar) {
            cVar.f114536h = true;
            C17429o oVar2 = cVar.f114530b;
            C52711k.m112236a((Object) oVar2, "waitClickPublishTimeCounter");
            if (oVar2.f48964a) {
                cVar.f114530b.mo33756d();
            }
        }
        if (!this.f107254f && this.f107265q.f107291a) {
            mo78616a(this.f107265q.f107292b, this.f107265q.f107293c);
        }
    }

    /* renamed from: c */
    public final Bitmap mo78619c(Object obj) {
        return this.f107266r.mo78619c(obj);
    }

    /* renamed from: d */
    public final boolean mo78774d(Object obj) {
        return this.f107266r.mo78774d(obj);
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo78615a(Object obj) {
        return mo86491a(obj, new C0958a(), false);
    }

    /* renamed from: b */
    public final long mo78618b(Object obj) {
        return new File(((VideoPublishEditModel) obj).mParallelUploadOutputFile).length();
    }

    /* renamed from: a */
    public final void mo86492a(C0958a aVar) {
        this.f107257i = aVar;
        this.f107257i.mo2939a(this.f107273y);
        this.f107273y.mo91529a(new C42412ac(this));
    }

    /* renamed from: a */
    public final void mo86493a(boolean z) {
        mo86494a(z, false);
    }

    /* renamed from: a */
    public final synchronized C17832m<VideoCreation> mo78613a(final Object obj, SynthetiseResult synthetiseResult) {
        int i;
        if (this.f107267s == null) {
            C50203g.m108358a("PublishDurationMonitor AuthKey Start");
            this.f107267s = this.f107270v.mo86428a(null);
            C17825i.m43740a(this.f107267s, new C17824h<VideoCreation>() {
                public final void onFailure(Throwable th) {
                    C50203g.m108358a("PublishDurationMonitor AuthKey End failed");
                    C42402ab.this.mo86493a(false);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    VideoCreation videoCreation = (VideoCreation) obj;
                    C50203g.m108358a("PublishDurationMonitor AuthKey End success");
                    if (!C42402ab.this.f107254f) {
                        if (C42402ab.this.f107260l) {
                            C42402ab.this.mo78616a(obj, videoCreation);
                            return;
                        }
                        C42411a aVar = C42402ab.this.f107265q;
                        Object obj2 = obj;
                        aVar.f107291a = true;
                        aVar.f107292b = obj2;
                        aVar.f107293c = videoCreation;
                    }
                }
            }, C23551l.f62672a);
            String str = this.f111187d;
            if (obj instanceof VideoPublishEditModel) {
                i = ((VideoPublishEditModel) obj).getVideoLength();
            } else {
                i = -1;
            }
            C45310n nVar = new C45310n(str, i, this.f107253E, this.f111188e, this.f107262n);
            this.f107252D = nVar;
            C17825i.m43740a(this.f107267s, this.f107252D, C23551l.f62672a);
            if (C39618d.f101152P.mo83103a(C40790a.ConcurrentUploadCancelOnAuthKey)) {
                this.f107273y.mo91529a(new C42413ad(this));
            }
        }
        return this.f107267s;
    }

    /* renamed from: a */
    public final synchronized C43211de<VideoCreation> mo78616a(Object obj, VideoCreation videoCreation) {
        C43211de<VideoCreation> deVar;
        String str;
        synchronized (this) {
            if (this.f107268t == null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                this.f107258j = new C43848fq(videoPublishEditModel, this, 0, this.f107262n);
                this.f107258j.mo89387a(this.f107260l);
                C43995b.m96558a(videoPublishEditModel, "ConcurrentUploadFutureFactory");
                String str2 = videoPublishEditModel.mParallelUploadOutputFile;
                final float f = videoPublishEditModel.mVideoCoverStartTm;
                if (videoPublishEditModel.mOrigin == 0) {
                    str = C40797m.m90253h();
                } else {
                    str = C40797m.m90252g();
                }
                String str3 = str;
                final String str4 = videoPublishEditModel.creationId;
                UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
                final String a = C43884l.m96397a(videoPublishEditModel);
                final C43852fu fuVar = ((C43846fo) videoCreation).f111026a;
                final String str5 = str2;
                C424075 r1 = new C43211de<VideoCreation>("ConcurrentUploader") {
                    /* renamed from: a */
                    public final void mo86497a(C45319v vVar) {
                        C42402ab.this.f107259k.close();
                        C42402ab.this.f107263o.mo91541b(vVar);
                    }

                    {
                        boolean z;
                        try {
                            final File file = new File(str5);
                            C42402ab.this.f107259k = C38949c.m86785a();
                            C42402ab.this.f107263o = new C45249ag(C42402ab.this.f111187d, C42402ab.this.f111188e, C42402ab.this.f107260l, C42402ab.this.f107262n);
                            C42402ab.this.f107259k.setListener(new TTVideoUploaderListener() {
                                public final String getStringFromExtern(int i) {
                                    return a;
                                }

                                public final int videoUploadCheckNetState(int i, int i2) {
                                    return C45252b.m98738a(fuVar, "ConcurrentUpload");
                                }

                                /* renamed from: a */
                                private void m93179a(boolean z, TTVideoInfo tTVideoInfo) {
                                    if (z) {
                                        C42402ab.this.f107258j.mo89388a(true, "", null, C42402ab.this.f107260l);
                                        return;
                                    }
                                    C43848fq fqVar = C42402ab.this.f107258j;
                                    StringBuilder sb = new StringBuilder("errorCode:");
                                    sb.append(tTVideoInfo.mErrcode);
                                    fqVar.mo89388a(false, sb.toString(), String.valueOf(tTVideoInfo.mErrcode), C42402ab.this.f107260l);
                                }

                                /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
                                    return;
                                 */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void onUploadVideoStage(int r2, long r3) {
                                    /*
                                        r1 = this;
                                        r3 = 1003(0x3eb, float:1.406E-42)
                                        if (r2 != r3) goto L_0x0032
                                        com.ss.android.ugc.aweme.shortvideo.ab$5 r2 = com.p683ss.android.ugc.aweme.shortvideo.C42402ab.C424075.this
                                        com.ss.android.ugc.aweme.shortvideo.ab r2 = com.p683ss.android.ugc.aweme.shortvideo.C42402ab.this
                                        com.ss.android.ugc.aweme.shortvideo.upload.c.c r2 = r2.f107262n
                                        com.google.b.a.o r3 = r2.f114530b
                                        java.lang.String r4 = "waitClickPublishTimeCounter"
                                        p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                        monitor-enter(r3)
                                        boolean r4 = r2.f114536h     // Catch:{ all -> 0x002f }
                                        if (r4 != 0) goto L_0x002d
                                        com.google.b.a.o r4 = r2.f114530b     // Catch:{ all -> 0x002f }
                                        java.lang.String r0 = "waitClickPublishTimeCounter"
                                        p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)     // Catch:{ all -> 0x002f }
                                        boolean r4 = r4.f48964a     // Catch:{ all -> 0x002f }
                                        if (r4 == 0) goto L_0x0028
                                        java.lang.String r2 = "repeat start uploadDataFinish"
                                        com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c.m98761a(r2)     // Catch:{ all -> 0x002f }
                                        monitor-exit(r3)
                                        return
                                    L_0x0028:
                                        com.google.b.a.o r2 = r2.f114530b     // Catch:{ all -> 0x002f }
                                        r2.mo33755c()     // Catch:{ all -> 0x002f }
                                    L_0x002d:
                                        monitor-exit(r3)
                                        return
                                    L_0x002f:
                                        r2 = move-exception
                                        monitor-exit(r3)
                                        throw r2
                                    L_0x0032:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C42402ab.C424075.C424081.onUploadVideoStage(int, long):void");
                                }

                                public final void onLog(int i, int i2, String str) {
                                    C45240a.m98714a(i, str);
                                    if (C42402ab.this.f107264p) {
                                        if (i == 101) {
                                            C42402ab.this.f107263o.mo91539a(i2, str);
                                        }
                                    } else if (i == 100) {
                                        C42402ab.this.f107263o.mo91539a(i2, str);
                                    }
                                }

                                public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                                    if (i == 0) {
                                        C424075.this.mo86497a(C45319v.SUCCESS);
                                        C424075.this.mo34624b(C47921gl.m103687a(tTVideoInfo));
                                        m93179a(true, tTVideoInfo);
                                        C42402ab.this.mo86493a(true);
                                    } else if (i == 2) {
                                        C424075.this.mo86497a(C45319v.FAILED);
                                        C424075.this.mo34623a((Throwable) new C45241aa(tTVideoInfo));
                                        m93179a(false, tTVideoInfo);
                                        C42402ab.this.mo86493a(false);
                                    } else if (i == 1) {
                                        C424075.this.mo87842a((int) j);
                                    } else {
                                        if (i == 3) {
                                            C424075.this.mo86497a(C45319v.CANCEL);
                                            tTVideoInfo.mErrcode = -39993;
                                            m93179a(false, tTVideoInfo);
                                            C424075.this.mo34623a((Throwable) new C45241aa(tTVideoInfo));
                                            C50203g.m108358a("TTUploader MsgIsUploadCancel");
                                        }
                                    }
                                }
                            });
                            C42402ab.this.f107259k.setExternFileReader(new TTExternFileReader() {
                                public final void cancel() {
                                }

                                public final long getValue(int i) {
                                    int i2;
                                    if (i == 0 && C42402ab.this.f107255g.mo86487c()) {
                                        return file.length();
                                    }
                                    if (i != 1) {
                                        return -1;
                                    }
                                    C42402ab.this.f107262n.mo91558f();
                                    try {
                                        i2 = C42402ab.this.f107255g.mo86477a();
                                    } catch (Exception e) {
                                        C424075.this.mo34623a((Throwable) e);
                                        i2 = -1;
                                    }
                                    C42402ab.this.f107262n.mo91559g();
                                    return (long) i2;
                                }

                                public final long getCrc32ByOffset(long j, int i) {
                                    return C42402ab.this.f107255g.mo86480a(j, (long) i);
                                }

                                public final int readSlice(int i, byte[] bArr, int i2) {
                                    int i3;
                                    C42402ab.this.f107262n.mo91558f();
                                    try {
                                        i3 = C42402ab.this.f107255g.mo86478a(i, bArr, i2);
                                    } catch (Exception unused) {
                                        i3 = -1;
                                    }
                                    StringBuilder sb = new StringBuilder("ConcurrentUploadByFile consumeStatus:");
                                    sb.append(i3);
                                    C50203g.m108358a(sb.toString());
                                    C42402ab.this.f107262n.mo91559g();
                                    return i3;
                                }

                                public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
                                    int i3;
                                    C42402ab.this.f107262n.mo91558f();
                                    try {
                                        i3 = C42402ab.this.f107255g.mo86479a(j, bArr, i, i2);
                                    } catch (Exception e) {
                                        C424075.this.mo34623a((Throwable) e);
                                        i3 = -1;
                                    }
                                    StringBuilder sb = new StringBuilder("ConcurrentUploadByFile consumeStatus:");
                                    sb.append(i3);
                                    C50203g.m108358a(sb.toString());
                                    C42402ab.this.f107262n.mo91559g();
                                    return i3;
                                }
                            });
                            C42402ab.this.f107259k.setAbstractListener(new TTVideoUploaderAbstractListener() {
                                public final void onEventLog(JSONObject jSONObject) {
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("event", "");
                                        if (!TextUtils.isEmpty(optString)) {
                                            StringBuilder sb = new StringBuilder("TTUploaderEventV2 name:");
                                            sb.append(optString);
                                            sb.append(" content:");
                                            sb.append(jSONObject.toString());
                                            C50203g.m108358a(sb.toString());
                                            try {
                                                jSONObject.put("aweme_video_type", C42402ab.this.f111184a);
                                                jSONObject.put("aweme_upload_type", C42402ab.this.f111185b);
                                            } catch (JSONException unused) {
                                            }
                                            C47702b.f120193a.mo94985a(optString, jSONObject);
                                        }
                                    }
                                }
                            });
                            if (C42402ab.this.f107261m > 0) {
                                C42402ab.this.f107255g.mo86481a((C45312a) new C42417ah(this));
                            }
                            if (fuVar.f111081q == 1) {
                                C42402ab.this.f107259k.setEnableExternNet(fuVar.f111084t);
                                String e = C39618d.f101152P.mo83107e(C40790a.TTNetExternNetInfo);
                                if (!TextUtils.isEmpty(e)) {
                                    C42402ab.this.f107259k.setExternNetInfo(e);
                                }
                                C42402ab.this.f107259k.setNewHttpProxyLoader(C39618d.f101152P.mo83104b(C40790a.TTUploaderTTNetProxyType));
                                C42402ab.this.f107259k.setTTExternLoader(new C43831fh());
                                C42402ab.this.f107259k.setEnableQuic(fuVar.f111082r);
                            }
                            C45248af afVar = new C45248af();
                            afVar.mo91538b();
                            TTVideoUploader tTVideoUploader = C42402ab.this.f107259k;
                            C43852fu fuVar = fuVar;
                            C52711k.m112240b(tTVideoUploader, "uploader");
                            C52711k.m112240b(fuVar, "videoConfig");
                            C52711k.m112240b(afVar, "uploaderServerParam");
                            tTVideoUploader.setEnableUpHost(1);
                            tTVideoUploader.setEnableServerHost(1);
                            tTVideoUploader.setEnableExternDNS(fuVar.f111075k);
                            tTVideoUploader.setAliveMaxFailTime(fuVar.f111076l);
                            tTVideoUploader.setTcpOpenTimeOutMilliSec(fuVar.f111079o);
                            TTUploadResolver.setEnableTTNetDNS(fuVar.f111077m);
                            afVar.mo91537a(fuVar);
                            TTVideoUploader tTVideoUploader2 = C42402ab.this.f107259k;
                            StringBuilder sb = new StringBuilder();
                            sb.append(afVar.mo91535a());
                            sb.append(C39618d.f101152P.mo83107e(C40790a.UploadExtraParams));
                            tTVideoUploader2.setServerParameter(sb.toString());
                            C43833fi.m96265a(C42402ab.this.f107259k, fuVar.f111074j);
                            C45301a.m98772a();
                            C45247ae.m98723a();
                            C42402ab.this.f107259k.setEnableLogCallBack(fuVar.f111085u);
                            C42402ab.this.f107259k.setEnablePostMethod(fuVar.f111078n);
                            C42402ab.this.f107259k.setMaxFailTime(fuVar.f111072h);
                            C42402ab.this.f107259k.setSliceSize(fuVar.f111070f);
                            C42402ab.this.f107259k.setEvStateEnable(fuVar.f111088x);
                            C42402ab.this.f107259k.setFileUploadDomain(fuVar.f111066b);
                            C42402ab.this.f107259k.setVideoUploadDomain(fuVar.f111067c);
                            C42402ab.this.f107259k.setSliceTimeout(fuVar.f111068d);
                            C42402ab.this.f107259k.setSliceReTryCount(fuVar.f111069e);
                            TTVideoUploader tTVideoUploader3 = C42402ab.this.f107259k;
                            if (fuVar.f111086v == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            tTVideoUploader3.setOpenResume(z);
                            if (C42402ab.this.f107261m > 0) {
                                C42402ab.this.f107259k.setPreUploadEncryptionMode(C42402ab.this.f107261m);
                                if (C42402ab.this.f107260l) {
                                    C42402ab.this.f107259k.allowMergeUpload();
                                }
                            }
                            C42402ab.this.f107259k.setPoster(f);
                            HashMap hashMap = new HashMap(1);
                            hashMap.put(Integer.valueOf(69), str4);
                            C42402ab.this.f107259k.setTraceIDConfig(hashMap);
                            C42402ab.this.f107259k.setFileRetryCount(fuVar.f111071g);
                            C42402ab.this.f107259k.setUserKey(fuVar.f111065a);
                            C42402ab.this.f107259k.setAuthorization(fuVar.f111073i);
                            C42402ab.this.f107259k.setSocketNum(1);
                            C42402ab.this.f107259k.setEnableMutiTask(fuVar.f111083s);
                            C42402ab.this.f107259k.setResponeTimeOut(C39618d.f101152P.mo83104b(C40790a.TTUploaderResponseTimeOut));
                            C47955u.m103766a();
                            boolean b = C41623i.m91496b();
                            C42402ab.this.f107259k.setOpenBoe(b);
                            StringBuilder sb2 = new StringBuilder("ConcurrentUploadFutureFactory enableBoe:");
                            sb2.append(b);
                            C50203g.m108358a(sb2.toString());
                            StringBuilder sb3 = new StringBuilder("PublishDurationMonitorEncryptionMode:");
                            sb3.append(C42402ab.this.f107261m);
                            sb3.append(" Upload Start:");
                            sb3.append(fuVar.toString());
                            C50203g.m108358a(sb3.toString());
                            C42402ab.this.f107259k.start();
                            C45249ag agVar = C42402ab.this.f107263o;
                            if (agVar.f114442a > 0) {
                                agVar.f114444c = SystemClock.uptimeMillis();
                                long j = (long) agVar.f114442a;
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                C1675ac a = C2168a.m6519a();
                                C1745b.m6050a(timeUnit, "unit is null");
                                C1745b.m6050a(a, "scheduler is null");
                                C1912ag agVar2 = new C1912ag(Math.max(0, j), Math.max(0, j), timeUnit, a);
                                agVar.f114443b = C2150a.m6486a((C2201v<T>) agVar2).mo6545f((C1710e<? super T>) new C45251b<Object>(agVar));
                            }
                        } catch (Exception e2) {
                            mo86497a(C45319v.FAILED);
                            throw e2;
                        } catch (Exception e3) {
                            mo34623a((Throwable) e3);
                        }
                    }
                };
                C424075 r7 = r1;
                C45243ab abVar = new C45243ab(str2, str3, uploadSpeedInfo, this.f107262n, this.f107260l, this.f111184a, this.f111185b, this.f111187d, this.f111188e);
                this.f107269u = abVar;
                C17825i.m43740a(r7, this.f107269u, C23551l.f62672a);
                this.f107268t = r7;
                videoPublishEditModel.metadataMap = null;
                this.f107273y.mo91529a(new C42414ae(this));
            }
            deVar = this.f107268t;
        }
        return deVar;
    }

    /* renamed from: a */
    public final void mo86494a(boolean z, boolean z2) {
        C45324z a = C45324z.m98803a();
        StringBuilder sb = new StringBuilder("shutDown ");
        sb.append(z);
        a.mo91602a(sb.toString());
        if (z) {
            this.f107255g.mo86483a(true);
            this.f107274z.mo87840a(true);
            return;
        }
        if (!this.f107254f) {
            this.f107254f = true;
            if (!this.f107256h.isDone()) {
                this.f107257i.mo2941b();
            }
            if (!z2) {
                this.f107255g.mo86483a(false);
            }
            this.f107274z.mo87840a(false);
        }
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo86491a(Object obj, C0958a aVar, boolean z) {
        return m93163a((VideoPublishEditModel) obj, aVar, z);
    }

    /* renamed from: a */
    public final C17832m<? extends C42421al> mo78614a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        int i;
        String str;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoPublishEditModel.isReviewVideo()) {
            linkedHashMap.put("review_video_id", videoPublishEditModel.reviewVideoId);
        }
        linkedHashMap.put("video_id", videoCreation.materialId);
        linkedHashMap.put("new_sdk", "1");
        linkedHashMap.put("mixed_type", String.valueOf(videoPublishEditModel.getStickPointType()));
        C47921gl.m103688a(videoCreation, linkedHashMap);
        int i2 = 0;
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i2 = videoPublishEditModel.videoCount;
            i = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.frames != null) {
                i2 = videoPublishEditModel.extractFramesModel.frames.size();
            } else if (!(videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null)) {
                i = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
            }
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        linkedHashMap.put("video_cnt", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        linkedHashMap.put("pic_cnt", sb2.toString());
        String str2 = "is_multi_content";
        if (i2 + i > 1) {
            str = "1";
        } else {
            str = "0";
        }
        linkedHashMap.put(str2, str);
        this.f107271w.mo89283a(videoPublishEditModel, linkedHashMap);
        this.f107271w.mo89282a((BaseShortVideoContext) videoPublishEditModel, synthetiseResult, linkedHashMap);
        C50203g.m108358a("PublishDurationMonitor CreateAweme start");
        C17832m a = C17825i.m43735a(C39618d.f101179t.mo74304a((String) null, linkedHashMap), IOException.class, new C42416ag(linkedHashMap), C17833n.m43743a());
        C42419aj ajVar = new C42419aj(this.f107272x, videoPublishEditModel.mParallelUploadOutputFile, videoPublishEditModel.isMvThemeVideoType(), this.f107251C, this.f111187d, videoPublishEditModel.getVideoLength(), this.f111188e);
        C17825i.m43740a(a, ajVar, C17833n.m43743a());
        return C17825i.m43735a(a, C23459a.class, C44338p.m97117a(new C42415af(this, obj, videoCreation, synthetiseResult)), C23551l.f62672a);
    }

    /* renamed from: a */
    private C43211de<SynthetiseResult> m93163a(VideoPublishEditModel videoPublishEditModel, C0958a aVar, boolean z) {
        IWatermarkParam iWatermarkParam;
        VEWatermarkParam vEWatermarkParam;
        final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        boolean z2 = z;
        this.f107251C = z2;
        this.f107272x = new C45314q();
        this.f107272x.f114570a = C17429o.m42675b();
        if (!z2) {
            this.f107274z = new C43209dc(videoPublishEditModel2, this.f107249A, this.f107250B);
            C43209dc dcVar = this.f107274z;
            if (dcVar.f109266b) {
                dcVar.f109265a = C17429o.m42676b(C47894fo.f120488a);
            }
        }
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            int[] a = C52979m.m112710a(videoPublishEditModel);
            C52972j.m112700a(videoPublishEditModel2, new Integer[]{Integer.valueOf(a[0]), Integer.valueOf(a[1])});
            int[] iArr = {videoPublishEditModel2.mWatermarkVideoWidth, videoPublishEditModel2.mWatermarkVideoHeight};
            int saveType = videoPublishEditModel2.mSaveModel.getSaveType();
            boolean a2 = C43301dw.m94963a(saveType);
            iWatermarkParam = WaterMarkServiceImpl.createIWaterMarkServicebyMonsterPlugin().watermarkParamBuilderService().createWatermark(saveType, videoPublishEditModel.getLocalTempPath(), C39618d.f101183x.mo74285e(), iArr, true, videoPublishEditModel.getLocalTempPath(), a2);
            if (a2 && iWatermarkParam != null) {
                int i = iArr[1] - iArr[0];
                if (i > 0) {
                    iWatermarkParam.setYOffset(iWatermarkParam.getYOffset() + (i / 2));
                }
            }
        } else {
            iWatermarkParam = null;
        }
        if (!z2) {
            try {
                this.f107255g = new C42392aa(videoPublishEditModel2.mParallelUploadOutputFile, this.f111187d);
            } catch (Exception unused) {
                return new C43211de<SynthetiseResult>() {
                    {
                        StringBuilder sb = new StringBuilder("unable to mkdir ");
                        sb.append(videoPublishEditModel2.mParallelUploadOutputFile);
                        mo34623a((Throwable) new C43809fd(sb.toString(), new SynthetiseResult()));
                    }
                };
            }
        }
        C39618d.m88217f();
        C45284c cVar = new C45284c(this.f107255g, this.f107273y, 0, this.f111187d, this.f111188e, this.f107262n);
        if (iWatermarkParam != null) {
            vEWatermarkParam = (VEWatermarkParam) iWatermarkParam.getRaw();
        } else {
            vEWatermarkParam = null;
        }
        C452851 r6 = new C43211de<SynthetiseResult>("ConcurrentUploadCompiler", videoPublishEditModel2, vEWatermarkParam) {

            /* renamed from: a */
            final /* synthetic */ VideoPublishEditModel f114512a;

            /* renamed from: b */
            final /* synthetic */ VEWatermarkParam f114513b;

            {
                final C52908ad adVar;
                this.f114512a = r10;
                this.f114513b = r11;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C0013i a = C0013i.m18a((Callable<TResult>) new C45296d<TResult>(this, this.f114512a), (Executor) C23551l.f62672a);
                    try {
                        a.mo36g();
                    } catch (InterruptedException unused) {
                    }
                    adVar = (C52908ad) a.mo34e();
                } else {
                    adVar = C52979m.m112708a(this.f114512a, (C0184k) C45284c.this, (SurfaceView) null);
                }
                final SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.draftHardEncode = this.f114512a.mHardEncode;
                synthetiseResult.outputFile = this.f114512a.getOutputFile();
                synthetiseResult.needRecode = C52979m.m112711b(this.f114512a);
                synthetiseResult.flags |= 1;
                synthetiseResult.isEnableFpsSet = C39618d.f101151O.mo83117a(C40796a.EnableSyntheticFpsSet);
                synthetiseResult.editPreviewInfo = this.f114512a.getPreviewInfo();
                synthetiseResult.isFastImport = this.f114512a.isFastImport;
                synthetiseResult.segmentCount = this.f114512a.segmentCounts();
                synthetiseResult.fastImportResolution = this.f114512a.fastImportResolution;
                synthetiseResult.hasSubtitle = this.f114512a.hasSubtitle();
                if (synthetiseResult.isFastImport) {
                    C42670a.m93644a(this.f114512a.getPreviewInfo().getVideoList(), adVar.f131275u);
                }
                C43577d.m95728a((C20347c) adVar.f131275u, this.f114512a.getMainBusinessContext());
                adVar.f131275u.mo43046c(C45284c.this.f114504d);
                if (C45284c.this.f114505e == null) {
                    C45284c.this.f114505e = new C45297e(this, synthetiseResult, adVar);
                }
                adVar.f131275u.mo43018a(C45284c.this.f114505e);
                if (C45284c.this.f114506f == null) {
                    C45284c.this.f114506f = new C50711k() {

                        /* renamed from: a */
                        AtomicInteger f114515a = new AtomicInteger(0);

                        public final void onCallback(int i, int i2, float f, String str) {
                            int i3;
                            boolean z = true;
                            if (C452851.this.f114513b == null) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            if (i == 4103) {
                                StringBuilder sb = new StringBuilder("TE_INFO_COMPILE_DONE ext:");
                                sb.append(i2);
                                sb.append(" videoExt:");
                                sb.append(i3);
                                sb.append(" isDone():");
                                sb.append(C452851.this.isDone());
                                C50203g.m108363d(sb.toString());
                            } else if (i == 4118) {
                                StringBuilder sb2 = new StringBuilder("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:");
                                sb2.append(i2);
                                sb2.append(" videoExt:");
                                sb2.append(i3);
                                String sb3 = sb2.toString();
                                C50203g.m108361b(sb3);
                                C23569o.m57779a("aweme_synthesis_compile_log_vesdk", C42437ay.m93202a().mo86521a("log", sb3).mo86522b());
                            } else if (i == 4139) {
                                C0037d.m58b();
                                C0037d.m58b().mo52a(C0030a.f85g, C0039f.BEGIN);
                            } else if (i == 4140) {
                                C0037d.m58b();
                                C0037d.m58b().mo52a(C0030a.f85g, C0039f.END);
                            }
                            if (!C452851.this.isDone()) {
                                if (i == 4103) {
                                    if (i2 == 0) {
                                        synthetiseResult.videoLength = f;
                                    }
                                    if (!(C452851.this.f114513b == null || this.f114515a.incrementAndGet() == 2)) {
                                        z = false;
                                    }
                                    if (z) {
                                        synthetiseResult.outputVideoFileInfo = C52928al.m112613b(C452851.this.f114512a.mOutputFile);
                                        try {
                                            new C52965e().mo110541a(C452851.this.f114512a);
                                            if (C452851.this.f114512a.isSaveLocalWithoutWaterMark()) {
                                                C48016e.m103954e(C43308eb.f109498k);
                                                C48016e.m103948c(synthetiseResult.outputFile, C452851.this.f114512a.getLocalTempPath());
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        if (C452851.this.mo34624b(synthetiseResult)) {
                                            C0013i.m16a((Callable<TResult>) new C45299g<TResult>(adVar));
                                        }
                                    }
                                } else if (i == 4105 && i2 == i3) {
                                    C452851.this.mo87842a((int) (f * 100.0f));
                                } else if (i == 4112) {
                                    synthetiseResult.synthetiseCPUEncode = i2 ^ 1;
                                } else if (i == 4113) {
                                    synthetiseResult.audioLength = f;
                                } else if (i == 4114) {
                                    C0013i.m18a((Callable<TResult>) new C45300h<TResult>(this, i, i2, f), C0013i.f25b);
                                } else if (i == 4116) {
                                    if (C39618d.f101152P.mo83103a(C40790a.EnableUploadMetadata)) {
                                        if (C452851.this.f114512a.metadataMap == null) {
                                            C452851.this.f114512a.metadataMap = C20084a.m49601a();
                                        } else {
                                            C452851.this.f114512a.metadataMap.putAll(C20084a.m49601a());
                                        }
                                    }
                                    C32458a.m75144a("receive prepare done event in vecomplier");
                                    SubtitleModule.m97950a(adVar.f131275u, C39618d.f101160a, C452851.this.f114512a, SubtitleModule.m97953ab());
                                } else if (i == 4130) {
                                    synthetiseResult.unableRemuxCode = i2;
                                }
                            }
                        }
                    };
                }
                adVar.f131275u.mo43039b(C45284c.this.f114506f);
                C45239a aVar = C45284c.this.f114503c;
                C45298f fVar = new C45298f(this, synthetiseResult, this.f114512a, adVar, this.f114513b);
                aVar.mo91529a(fVar);
                adVar.f131275u.f55837d.f127300I = new C50550n() {
                    /* renamed from: a */
                    public final void mo91547a(byte[] bArr, int i, int i2, boolean z) {
                        if (C45284c.this.f114501a != null) {
                            try {
                                C45284c.this.f114501a.mo86484a(bArr, i, i2, z);
                            } catch (Exception e) {
                                SynthetiseResult clone = synthetiseResult.clone();
                                long min = Math.min(C48016e.m103958h(), 2147483647L);
                                C23569o.m57776a("parallel_upload_write_data_error_left_space", (int) min, C42437ay.m93202a().mo86521a("error_info", e.getCause().getMessage()).mo86522b());
                                boolean z2 = false;
                                if ((e.getCause() instanceof IOException) && (TextUtils.equals(e.getCause().getMessage(), "write failed: ENOSPC (No space left on device)") || min < 100)) {
                                    z2 = true;
                                }
                                if (z2) {
                                    clone.ret = 100101;
                                } else {
                                    clone.ret = 1001;
                                }
                                if (C452851.this.mo34623a((Throwable) new C43809fd((Throwable) e, clone))) {
                                    adVar.f131275u.mo43082p();
                                }
                            }
                        }
                    }
                };
                try {
                    C45284c.this.f114507g = C52979m.m112707a(this.f114512a, synthetiseResult, this.f114513b);
                    StringBuilder sb = new StringBuilder("PublishDurationMonitor SynthetiseStart ");
                    sb.append(C45284c.this.f114507g.toString());
                    C50203g.m108358a(sb.toString());
                    adVar.f131275u.mo43002a("te_is_fast_import", String.valueOf(this.f114512a.isFastImport ? 1 : 0));
                    if (this.f114512a.isMultiVideoEdit() && !TextUtils.isEmpty(this.f114512a.multiEditVideoRecordData.videoMetaData)) {
                        adVar.f131275u.mo43002a("description", this.f114512a.multiEditVideoRecordData.videoMetaData);
                    }
                    adVar.f131275u.mo43022a(this.f114512a.getOutputFile(), (String) null, C45284c.this.f114507g);
                } catch (Throwable th) {
                    mo34623a(th);
                }
            }
        };
        C45323y yVar = new C45323y(videoPublishEditModel2.mParallelUploadOutputFile, (long) videoPublishEditModel.getVideoLength(), videoPublishEditModel.isMvThemeVideoType(), cVar.f114508h, cVar.f114509i, videoPublishEditModel2.videoEditorType, cVar.f114510j);
        C17825i.m43740a(r6, yVar, C0013i.f25b);
        C17825i.m43740a(r6, new C43808fc(), C0013i.f25b);
        C17825i.m43740a(r6, new C43810fe(cVar.f114502b), C0013i.f25b);
        this.f107256h = r6;
        if (!z2) {
            C45292c cVar2 = this.f107262n;
            if (cVar2.mo91552a().f48964a) {
                C45292c.m98761a("repeat startSynthetic");
            } else {
                cVar2.mo91552a().mo33755c();
                cVar2.f114531c = System.currentTimeMillis();
            }
            C17825i.m43740a(this.f107256h, new C17824h<SynthetiseResult>() {
                public final void onFailure(Throwable th) {
                    C50203g.m108358a("ConcurrentUploadCompiler onFailure");
                    C42402ab.this.mo86494a(false, C43809fd.isCancel(th));
                    C42402ab.this.f107262n.mo91553a(C43809fd.resolveErrorCode(th));
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                    C42402ab.this.f107262n.mo91553a(0);
                    C42402ab.this.f107262n.f114534f = C42402ab.this.f107255g.mo86488d();
                    C42402ab.this.f107262n.f114535g = C42402ab.this.f107255g.mo86489e() - C42402ab.this.f107255g.mo86488d();
                }
            }, C23551l.f62672a);
            mo78613a((Object) videoPublishEditModel2, (SynthetiseResult) null);
        } else {
            C17825i.m43740a(this.f107256h, new C17824h<SynthetiseResult>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                    C50203g.m108358a("ConcurrentUpload not upload for review video fast publish");
                }

                public final void onFailure(Throwable th) {
                    C50203g.m108358a("ConcurrentUploadByFile, shutDown false, isFastPublish true");
                    if (!C42402ab.this.f107254f) {
                        C42402ab.this.f107254f = true;
                        if (!C42402ab.this.f107256h.isDone()) {
                            C42402ab.this.f107257i.mo2941b();
                        }
                    }
                }
            }, C23551l.f62672a);
        }
        return this.f107256h;
    }

    C42402ab(TTUploaderService tTUploaderService, String str, boolean z, int i, int i2) {
        super(i, i2);
        this.f107270v = tTUploaderService;
        this.f107266r = new C43781eh(tTUploaderService, i, i2);
        this.f107249A = str;
        this.f107250B = z;
        this.f107261m = C39618d.f101151O.mo83118b(C40796a.PreUploadEncryptionMode);
        this.f111184a = i;
        this.f111185b = i2;
        this.f107262n = new C45292c();
        this.f107265q = new C42411a();
        this.f107264p = C39618d.f101152P.mo83103a(C40790a.EnableOnlyReportKeyUploadLog);
    }
}
