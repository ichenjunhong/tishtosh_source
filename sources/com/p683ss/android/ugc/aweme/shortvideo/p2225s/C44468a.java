package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.p030v4.p040os.C0958a;
import android.util.Log;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1259ac.C20853a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C42402ab;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42470bo;
import com.p683ss.android.ugc.aweme.shortvideo.C43210dd;
import com.p683ss.android.ugc.aweme.shortvideo.C43211de;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43218dl;
import com.p683ss.android.ugc.aweme.shortvideo.C43848fq;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45315r;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.a */
public abstract class C44468a implements C44481g {

    /* renamed from: a */
    public C45315r f112468a;

    /* renamed from: b */
    C43210dd f112469b = new C43210dd();

    /* renamed from: c */
    protected SynthetiseResult f112470c;

    /* renamed from: d */
    C43211de<SynthetiseResult> f112471d;

    /* renamed from: e */
    C43211de<VideoCreation> f112472e;

    /* renamed from: f */
    public boolean f112473f;

    /* renamed from: g */
    ExecutorService f112474g;

    /* renamed from: h */
    public final C44502r f112475h;

    /* renamed from: i */
    protected Object f112476i;

    /* renamed from: j */
    private String f112477j;

    /* renamed from: k */
    private int f112478k;

    /* renamed from: l */
    private int f112479l;

    /* renamed from: m */
    private final C43907k f112480m;

    /* renamed from: n */
    private C0958a f112481n;

    /* renamed from: o */
    private C17832m<VideoCreation> f112482o;

    /* renamed from: p */
    private C17832m<? extends C42421al> f112483p;

    /* renamed from: q */
    private final C43218dl f112484q;

    /* renamed from: r */
    private String f112485r;

    /* renamed from: s */
    private boolean f112486s;

    /* renamed from: c */
    public abstract void mo90361c(VideoCreation videoCreation);

    /* renamed from: c */
    public final void mo90362c(Object obj) {
    }

    /* renamed from: d */
    public abstract void mo90364d(VideoCreation videoCreation);

    /* renamed from: e */
    public abstract void mo90366e();

    /* renamed from: f */
    public abstract void mo90367f();

    /* renamed from: g */
    public abstract void mo90368g();

    public String toString() {
        return "AbstractPublisher";
    }

    /* renamed from: h */
    private void m97290h() {
        this.f112480m.mo78617a();
    }

    /* renamed from: c */
    public final void mo90360c() {
        if (this.f112474g == null || this.f112474g.isShutdown()) {
            mo90363d();
        } else {
            this.f112474g.execute(new C44480f(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo90363d() {
        C50203g.m108363d("Publisher cancelPrePublishReal");
        if (C43214dh.m94817a().mo87858h()) {
            this.f112481n.mo2941b();
            this.f112475h.mo90402b();
        }
    }

    /* renamed from: b */
    public final void mo90357b() {
        if (!this.f112473f) {
            this.f112473f = this.f112480m.mo78774d(this.f112476i);
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" saveToCameraIfNeed ");
            sb.append(this.f112473f);
            C50203g.m108363d(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo90351a() {
        Executor executor;
        String str;
        Executor executor2;
        if (this.f112482o == null) {
            this.f112482o = this.f112480m.mo78613a(this.f112476i, this.f112470c);
            if (this.f112482o == null) {
                StringBuilder sb = new StringBuilder("publish_illegal_parallel Type:");
                sb.append(this.f112478k);
                sb.append(" UploadType:");
                sb.append(this.f112479l);
                sb.append(" impl_type:2");
                C50203g.m108361b(sb.toString());
                C23569o.m57779a("publish_illegal_parallel", new C23088c().mo47822a("type", Integer.valueOf(this.f112478k)).mo47822a("upload_type", Integer.valueOf(this.f112479l)).mo47822a("impl_type", Integer.valueOf(2)).mo47825b());
                return;
            }
            C44502r rVar = this.f112475h;
            StringBuilder sb2 = new StringBuilder("Publisher createVideo() synthetiseResult = ");
            sb2.append(rVar.f112586i);
            C50203g.m108363d(sb2.toString());
            rVar.f112593p = new C44504b();
            rVar.f112593p.f112603a = C17429o.m42676b(C47894fo.f120488a);
            String str2 = "publish_start";
            C23089d a = C23089d.m56640a().mo47829a("shoot_entrance", rVar.f112587j);
            String str3 = "is_photo";
            if (rVar.f112584g == 5) {
                str = "1";
            } else {
                str = "0";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            C17832m<VideoCreation> mVar = this.f112482o;
            C444713 r2 = new C17824h<VideoCreation>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    C44468a.this.f112475h.mo90400a(true, (VideoCreation) obj, null);
                }

                public final void onFailure(Throwable th) {
                    C44468a.this.f112475h.mo90400a(false, null, th);
                    if (C44468a.this.f112468a != null) {
                        C44468a.this.f112468a.onError(new C43856fy(th));
                    }
                }
            };
            if (this.f112474g == null) {
                executor2 = C23551l.f62672a;
            } else {
                executor2 = this.f112474g;
            }
            C17825i.m43740a(mVar, r2, executor2);
        }
        C17832m<VideoCreation> mVar2 = this.f112482o;
        C444724 r22 = new C17824h<VideoCreation>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                VideoCreation videoCreation = (VideoCreation) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" onCreateVideoSuccess");
                C50203g.m108363d(sb.toString());
                C44468a.this.mo90361c(videoCreation);
            }
        };
        if (this.f112474g == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112474g;
        }
        C17825i.m43740a(mVar2, r22, executor);
        if (this.f112468a != null) {
            this.f112468a.onProgressUpdate(this.f112469b.mo87841a(2, 0), false);
        }
    }

    /* renamed from: b */
    public final Bitmap mo90356b(Object obj) {
        return this.f112480m.mo78619c(obj);
    }

    /* renamed from: a */
    public final void mo90353a(Object obj) {
        if (this.f112474g != null) {
            this.f112474g.execute(new C44477c(this, obj));
        } else {
            mo90365d(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo90365d(Object obj) {
        this.f112476i = obj;
        this.f112480m.f111186c = 0;
        this.f112484q.mo87871a("startPublish()");
        C47858ep.m103527f(this.f112485r);
        m97290h();
        this.f112475h.mo90396a();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onPublishStart");
        C50203g.m108363d(sb.toString());
        mo90367f();
    }

    /* renamed from: b */
    public final void mo90358b(final VideoCreation videoCreation) {
        Executor executor;
        if (this.f112483p == null) {
            if (this.f112468a != null) {
                this.f112468a.onProgressUpdate(this.f112469b.mo87841a(3, 0), false);
            }
            C44502r rVar = this.f112475h;
            Object obj = this.f112476i;
            StringBuilder sb = new StringBuilder("Publisher createAweme() synthetiseResult = ");
            sb.append(rVar.f112586i);
            sb.append(" \nargs ");
            sb.append(obj);
            C50203g.m108363d(sb.toString());
            rVar.f112595r = new C44503a();
            rVar.f112595r.f112602a = C17429o.m42676b(C47894fo.f120488a);
            this.f112483p = this.f112480m.mo78614a(this.f112476i, videoCreation, this.f112470c);
            C17832m<? extends C42421al> mVar = this.f112483p;
            C444757 r1 = new C17824h<C42421al>() {
                public final void onFailure(Throwable th) {
                    C44468a.this.f112475h.mo90399a(false, videoCreation, null, th, C44468a.this.f112476i, C44468a.this.f112473f);
                    if (C44468a.this.f112468a != null) {
                        C44468a.this.f112468a.onError(new C43856fy(th));
                    }
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    C42421al alVar = (C42421al) obj;
                    C44468a.this.f112475h.mo90399a(true, videoCreation, alVar, null, C44468a.this.f112476i, C44468a.this.f112473f);
                    if (C44468a.this.f112468a != null) {
                        C44468a.this.f112468a.onSuccess(alVar, false);
                    }
                }
            };
            if (this.f112474g == null) {
                executor = C23551l.f62672a;
            } else {
                executor = this.f112474g;
            }
            C17825i.m43740a(mVar, r1, executor);
        }
    }

    /* renamed from: a */
    public final void mo90352a(final VideoCreation videoCreation) {
        Executor executor;
        Executor executor2;
        if (this.f112472e == null) {
            C44502r rVar = this.f112475h;
            Object obj = this.f112476i;
            StringBuilder sb = new StringBuilder("Publisher uploadVideo() synthetiseResult = ");
            sb.append(rVar.f112586i);
            C50203g.m108363d(sb.toString());
            rVar.f112580c = SystemClock.uptimeMillis();
            if (!C44502r.m97363a(rVar.f112585h)) {
                rVar.f112594q = new C43848fq(obj, rVar.f112596s, rVar.f112584g, null);
                rVar.f112594q.mo89387a(true);
                try {
                    String stackTraceString = Log.getStackTraceString(new Exception());
                    C20853a.f56796a.mo48687a("upload_video_start");
                    C23569o.m57779a("aweme_upload_video_funnel", rVar.mo90403c().mo47824a("type", "upload_video_start").mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", stackTraceString).mo47825b());
                    rVar.mo90397a("upload_video_start", stackTraceString);
                } catch (Exception e) {
                    C44502r.m97361a((Throwable) e);
                }
            }
            this.f112472e = this.f112480m.mo78616a(this.f112476i, videoCreation);
            C43211de<VideoCreation> deVar = this.f112472e;
            C444735 r1 = new C17824h<VideoCreation>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    C44468a.this.f112475h.mo90401a(true, (Throwable) null, (VideoCreation) obj, C44468a.this.f112476i);
                }

                public final void onFailure(Throwable th) {
                    C44468a.this.f112475h.mo90401a(false, th, videoCreation, C44468a.this.f112476i);
                    if (C44468a.this.f112468a != null) {
                        C44468a.this.f112468a.onError(new C43856fy(th, C45241aa.isUserNetworkBad(C45241aa.resolveErrorCode(th))));
                    }
                }
            };
            if (this.f112474g == null) {
                executor2 = C23551l.f62672a;
            } else {
                executor2 = this.f112474g;
            }
            C17825i.m43740a(deVar, r1, executor2);
            this.f112472e.mo87843b(new C44479e(this), C23551l.f62672a);
        }
        C43211de<VideoCreation> deVar2 = this.f112472e;
        C444746 r0 = new C17824h<VideoCreation>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                VideoCreation videoCreation = (VideoCreation) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" onUploadSuccess");
                C50203g.m108363d(sb.toString());
                C44468a.this.mo90364d(videoCreation);
            }
        };
        if (this.f112474g == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112474g;
        }
        C17825i.m43740a(deVar2, r0, executor);
    }

    /* renamed from: a */
    public final void mo90355a(boolean z) {
        Executor executor;
        String str;
        Executor executor2;
        Executor executor3;
        if (this.f112471d == null) {
            C43211de<SynthetiseResult> a = this.f112480m.mo86491a(this.f112476i, this.f112481n, z);
            C44502r rVar = this.f112475h;
            Object obj = this.f112476i;
            int i = -1;
            if (C38704c.m86061b(rVar.f112584g)) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                rVar.f112588k = (double) videoPublishEditModel.videoFps();
                rVar.f112590m = videoPublishEditModel.creationId;
                i = videoPublishEditModel.videoEditorType;
            }
            rVar.f112583f = C38704c.m86060a(rVar.f112584g, obj);
            C47858ep.m103519b(rVar.f112591n, C2240a.m6773a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{rVar.f112591n, Integer.valueOf(rVar.f112584g), Integer.valueOf(rVar.f112585h), Integer.valueOf(i)}));
            C43214dh.m94817a().mo87849a(2);
            C45318u.m98796a(rVar.f112590m, C38704c.m86059a(rVar.f112584g));
            C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
            rVar.f112578a = SystemClock.uptimeMillis();
            int a2 = C44482h.m97318a(C11010c.m22280a());
            String str2 = "video_compose_start";
            C23089d a3 = C23089d.m56640a();
            String str3 = "resolution";
            if (C38704c.m86061b(rVar.f112584g)) {
                str = ((VideoPublishEditModel) obj).getVideoResolution();
            } else if ("upload".equals(rVar.f112583f)) {
                str = C40797m.m90253h();
            } else {
                str = C40797m.m90252g();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C40797m.m90249d());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C40797m.m90251f());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rVar.f112588k);
            C26890h.m65011a(str2, a3.mo47829a(str3, str).mo47829a("bite_rate", sb.toString()).mo47829a("video_quality", sb2.toString()).mo47829a("_perf_monitor", "1").mo47829a("publish_id", rVar.f112591n).mo47826a("pre_publish_type", rVar.f112597t).mo47826a("total_available_memory_mb", C44482h.m97315a(a2)).mo47826a("total_memory_mb", a2).mo47826a("jvm_allow_memory_mb", C44482h.m97314a()).mo47826a("jvm_available_memory_mb", C44482h.m97321b()).mo47829a("fps", sb3.toString()).f61491a);
            rVar.f112589l = C47894fo.f120488a.mo33765a();
            C50203g.m108363d("Publisher uploadSynthetiseStartEvent");
            this.f112471d = a;
            C444691 r0 = new C17824h<SynthetiseResult>() {
                public final void onFailure(Throwable th) {
                    C44468a.this.f112475h.mo90398a(false, (SynthetiseResult) null, th, C44468a.this.f112476i);
                    if (C44468a.this.f112468a != null) {
                        C44468a.this.f112468a.onError(new C43856fy(th));
                    }
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                    try {
                        C44468a.this.f112475h.mo90398a(true, synthetiseResult, (Throwable) null, C44468a.this.f112476i);
                        C44468a.this.f112470c = synthetiseResult;
                    } catch (Exception e) {
                        C23569o.m57779a("aweme_synthetise_error_log", C23088c.m56631a().mo47824a("exception", C13696m.m27668c(e)).mo47825b());
                    }
                }
            };
            if (this.f112474g == null) {
                executor2 = C17833n.m43743a();
            } else {
                executor2 = this.f112474g;
            }
            C17825i.m43740a(a, r0, executor2);
            C43211de<SynthetiseResult> deVar = this.f112471d;
            C44478d dVar = new C44478d(this);
            if (this.f112474g == null) {
                executor3 = C17833n.m43743a();
            } else {
                executor3 = this.f112474g;
            }
            deVar.mo87843b(dVar, executor3);
        }
        C43211de<SynthetiseResult> deVar2 = this.f112471d;
        C444702 r02 = new C17824h<SynthetiseResult>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" onSynthesisSuccess");
                C50203g.m108363d(sb.toString());
                C44468a.this.mo90368g();
            }
        };
        if (this.f112474g == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112474g;
        }
        C17825i.m43740a(deVar2, r02, executor);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo90359b(Object obj, int i) {
        this.f112476i = obj;
        this.f112480m.f111186c = i;
        C43218dl dlVar = this.f112484q;
        StringBuilder sb = new StringBuilder("prePublish() publishType:");
        sb.append(i);
        dlVar.mo87871a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(" onPrePublishStart");
        C50203g.m108363d(sb2.toString());
        mo90366e();
    }

    /* renamed from: a */
    public final void mo90354a(Object obj, int i) {
        if (this.f112474g != null) {
            this.f112474g.execute(new C44476b(this, obj, i));
        } else {
            mo90359b(obj, i);
        }
    }

    public C44468a(C43907k kVar, int i, int i2, int i3, String str, boolean z, C44334o<C42421al> oVar) {
        this.f112480m = kVar;
        this.f112477j = str;
        this.f112478k = i2;
        this.f112479l = i3;
        this.f112486s = z;
        StringBuilder sb = new StringBuilder();
        sb.append(C19034d.m46323c());
        sb.append("-");
        sb.append(SystemClock.uptimeMillis());
        this.f112485r = sb.toString();
        kVar.f111187d = this.f112485r;
        kVar.f111188e = this.f112486s;
        if (oVar != null) {
            this.f112468a = new C45315r();
            this.f112468a.add(new C42470bo(oVar));
        }
        this.f112481n = new C0958a();
        if (kVar instanceof C42402ab) {
            ((C42402ab) kVar).mo86492a(this.f112481n);
        }
        this.f112484q = new C43218dl(this);
        if (C39618d.f101152P.mo83103a(C40790a.EnablePublishThreadOpt)) {
            C50203g.m108363d("Publisher create mPublishExecutor");
            this.f112474g = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        }
        C43218dl dlVar = this.f112484q;
        StringBuilder sb2 = new StringBuilder("new Publisher() type = ");
        sb2.append(i2);
        dlVar.mo87871a(sb2.toString());
        C44502r rVar = new C44502r(this.f112480m, i, this.f112478k, this.f112479l, this.f112485r, this.f112477j, z);
        this.f112475h = rVar;
    }
}
