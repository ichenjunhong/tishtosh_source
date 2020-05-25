package com.p683ss.android.ugc.aweme.p1435bh;

import com.google.p1057b.p1058a.C17437s;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C42387a;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService.Factory;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44481g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44367a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44368b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44369c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44377g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44385i;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44392m.C44393a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44398o.C44399a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bh.c */
public final class C23799c {

    /* renamed from: com.ss.android.ugc.aweme.bh.c$a */
    public static final class C23800a implements C23798b {

        /* renamed from: a */
        public C44481g f63409a;

        /* renamed from: b */
        public boolean f63410b;

        /* renamed from: c */
        final /* synthetic */ C23812a f63411c;

        /* renamed from: d */
        final /* synthetic */ Factory f63412d;

        /* renamed from: e */
        final /* synthetic */ C43907k f63413e;

        /* renamed from: f */
        final /* synthetic */ String f63414f;

        /* renamed from: com.ss.android.ugc.aweme.bh.c$a$a */
        public static final class C23801a implements C44334o<C42421al> {

            /* renamed from: a */
            final /* synthetic */ C23800a f63415a;

            /* renamed from: b */
            final /* synthetic */ C44377g f63416b;

            public final void onSynthetiseSuccess(String str) {
                C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
                this.f63416b.mo49385a("STAGE_SYNTHETIC", new C44399a(new C44393a(str)), null);
            }

            public final void onError(C43856fy fyVar) {
                boolean z;
                boolean z2;
                C52711k.m112240b(fyVar, "e");
                C52711k.m112240b(fyVar, "e");
                Throwable cause = fyVar.getCause();
                boolean z3 = true;
                if ((!(cause instanceof C43809fd) || ((C43809fd) cause).getCode() != -66666) && (!(cause instanceof C45241aa) || ((C45241aa) cause).getErrorCode() != -39993)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f63416b.mo49384a((C44366c) C44367a.f112278a, (Object) null);
                    return;
                }
                int i = this.f63415a.f63411c.f63449f.f112318g;
                if (i == 6 || i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    fyVar.setRecover(true);
                }
                int i2 = this.f63415a.f63411c.f63449f.f112318g;
                Object obj = this.f63415a.f63411c.f63449f.f112320i;
                boolean z4 = this.f63415a.f63411c.f63449f.f112315d;
                C52711k.m112240b(fyVar, "e");
                C52711k.m112240b(obj, "mArgs");
                C23569o.m57783b("aweme_movie_publish_log", "publish_error", new C26898j().mo54849a("exception", C17437s.m42688b(fyVar)).mo54850a());
                if (i2 == 0) {
                    m58421a(((VideoPublishEditModel) obj).creationId, false, z4);
                } else if (i2 == 6) {
                    PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
                    CharSequence charSequence = photoMovieContext.creationId;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        z3 = false;
                    }
                    if (z3) {
                        photoMovieContext.creationId = UUID.randomUUID().toString();
                    }
                    m58421a(photoMovieContext.creationId, false, z4);
                }
                C44377g gVar = this.f63416b;
                C44385i iVar = new C44385i("", "", fyVar.isUserNetworkBad(), fyVar.getCause(), Boolean.valueOf(fyVar.isRecover()));
                gVar.mo49384a((C44366c) new C44368b(iVar), (Object) null);
                Object obj2 = this.f63415a.f63411c.f63449f.f112320i;
                C52711k.m112240b(obj2, "mArgs");
                C26916m a = C39618d.f101182w.mo74167a(obj2);
                if (C39618d.f101182w.mo74172a(a)) {
                    C39618d.f101182w.mo74169a(null, a, "", 20016);
                }
            }

            C23801a(C23800a aVar, C44377g gVar) {
                this.f63415a = aVar;
                this.f63416b = gVar;
            }

            public final void onProgressUpdate(int i, boolean z) {
                this.f63416b.mo49383a(i, (Object) Boolean.valueOf(z));
            }

            public final void onSuccess(C42421al alVar, boolean z) {
                C52711k.m112240b(alVar, "response");
                boolean z2 = false;
                if (this.f63415a.f63411c.f63449f.f112318g == 0) {
                    Object obj = this.f63415a.f63411c.f63449f.f112320i;
                    if (obj != null) {
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                        BaseResponse baseResponse = alVar;
                        C39618d.f101179t.mo74308a(baseResponse, videoPublishEditModel.getVideoLength());
                        C39618d.f101179t.mo74309a(baseResponse, C43577d.m95730b(videoPublishEditModel.getMainBusinessContext(), C43596f.TRACK_PAGE_EDIT));
                        alVar.videoCoverPath = this.f63415a.f63411c.f63449f.f112319h;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                    }
                }
                this.f63416b.mo49384a((C44366c) new C44369c(alVar), (Object) Boolean.valueOf(z));
                int i = this.f63415a.f63411c.f63449f.f112318g;
                Object obj2 = this.f63415a.f63411c.f63449f.f112320i;
                C52711k.m112240b(obj2, "mArgs");
                if (!(alVar == null || alVar.mSaveModel == null)) {
                    AVUploadSaveModel aVUploadSaveModel = alVar.mSaveModel;
                    C52711k.m112236a((Object) aVUploadSaveModel, "response.saveModel");
                    if (aVUploadSaveModel.isSaveLocal()) {
                        String str = "";
                        C42387a a = C39618d.f101140D.mo74287a(alVar);
                        if (a != null) {
                            str = a.aid;
                            C52711k.m112236a((Object) str, "avAweme.aid");
                        }
                        String str2 = "";
                        if (i == 0 && (obj2 instanceof VideoPublishEditModel)) {
                            str2 = C43434az.m95202a((VideoPublishEditModel) obj2);
                        } else if (i == 6) {
                            str2 = "slideshow";
                        }
                        C26890h.m65011a("download_publish_finish", new C23089d().mo47826a("scene_id", 1004).mo47829a("group_id", str).mo47829a("content_type", str2).mo47829a("download_type", "self").mo47829a("download_method", "download_with_publish").f61491a);
                    }
                }
                int i2 = this.f63415a.f63411c.f63449f.f112318g;
                Object obj3 = this.f63415a.f63411c.f63449f.f112320i;
                String str3 = this.f63415a.f63411c.f63449f.f112312a;
                boolean z3 = this.f63415a.f63411c.f63449f.f112315d;
                C52711k.m112240b(obj3, "mArgs");
                C52711k.m112240b(str3, "mShootWay");
                C26898j jVar = new C26898j();
                if (i2 == 0) {
                    VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(videoPublishEditModel2.videoWidth()));
                    sb.append("x");
                    sb.append(videoPublishEditModel2.videoHeight());
                    jVar.mo54849a("bitrate", String.valueOf(C40797m.m90249d())).mo54849a("duration", String.valueOf(videoPublishEditModel2.getVideoLength())).mo54849a("resolution", sb.toString()).mo54849a("shoot_way", str3);
                    m58421a(videoPublishEditModel2.creationId, true, z3);
                } else if (i2 == 6) {
                    PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.valueOf(photoMovieContext.mWidth));
                    sb2.append("x");
                    sb2.append(photoMovieContext.mHeight);
                    jVar.mo54849a("bitrate", String.valueOf(C40797m.m90249d())).mo54849a("duration", String.valueOf(photoMovieContext.getVideoLength())).mo54849a("resolution", sb2.toString()).mo54849a("shoot_way", str3);
                    CharSequence charSequence = photoMovieContext.creationId;
                    if (charSequence == null || charSequence.length() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        photoMovieContext.creationId = UUID.randomUUID().toString();
                    }
                    m58421a(photoMovieContext.creationId, true, z3);
                }
                C39618d.f101182w.mo74174b(this.f63415a.f63411c.f63449f.f112320i);
            }

            /* renamed from: a */
            private static void m58421a(String str, boolean z, boolean z2) {
                if (z2) {
                    String str2 = "publish_retry_status";
                    C23089d a = C23089d.m56640a().mo47826a("is_success", z ? 1 : 0);
                    String str3 = "creation_id";
                    if (str == null) {
                        str = "";
                    }
                    C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
                }
            }
        }

        /* renamed from: a */
        public final void mo49376a() {
            m58417c();
        }

        /* renamed from: b */
        public final void mo49378b() {
            C44481g gVar = this.f63409a;
            if (gVar != null) {
                gVar.mo90360c();
            }
        }

        /* renamed from: c */
        private final void m58417c() {
            boolean z;
            int i = this.f63411c.f63449f.f112314c;
            if (!this.f63411c.f63449f.f112316e || !C39618d.f101151O.mo83117a(C40796a.ReviewVideoFastPublish) || this.f63411c.f63449f.f112315d) {
                z = false;
            } else {
                z = true;
            }
            if (i == 0) {
                C44334o buildCallback = this.f63412d.buildCallback(this.f63411c.f63449f.f112318g, this.f63411c.f63449f.f112320i);
                if (buildCallback != null) {
                    C23803e.m58429a((C44377g) new C23802d(buildCallback), this.f63414f);
                }
            }
            if (this.f63410b) {
                if (!z) {
                    if (i == 0) {
                        C44481g gVar = this.f63409a;
                        if (gVar != null) {
                            gVar.mo90353a(this.f63411c.f63449f.f112320i);
                        }
                    } else {
                        C44481g gVar2 = this.f63409a;
                        if (gVar2 != null) {
                            gVar2.mo90354a(this.f63411c.f63449f.f112320i, i);
                        }
                    }
                } else if (i == 0) {
                    C44481g gVar3 = this.f63409a;
                    if (gVar3 != null) {
                        gVar3.mo90353a(this.f63411c.f63449f.f112320i);
                    }
                } else {
                    C45407ay.m98968a("disable prePublish for review video fast publish");
                }
            } else if (z) {
                if (i == 0) {
                    C44481g gVar4 = this.f63409a;
                    if (gVar4 != null) {
                        gVar4.mo90362c(this.f63411c.f63449f.f112320i);
                    }
                } else {
                    C45407ay.m98968a("disable prePublish for review video fast publish");
                }
            } else if (i == 0) {
                C44481g gVar5 = this.f63409a;
                if (gVar5 != null) {
                    gVar5.mo90353a(this.f63411c.f63449f.f112320i);
                }
            } else {
                C44481g gVar6 = this.f63409a;
                if (gVar6 != null) {
                    gVar6.mo90354a(this.f63411c.f63449f.f112320i, i);
                }
            }
        }

        /* renamed from: a */
        public final void mo49377a(C44377g gVar) {
            C52711k.m112240b(gVar, "callback");
            this.f63409a = this.f63412d.buildPublisher(this.f63411c.f63449f.f112314c, this.f63411c.f63449f.f112316e, this.f63413e, this.f63411c.f63449f.f112318g, this.f63411c.f63449f.f112317f, this.f63411c.f63449f.f112312a, this.f63411c.f63449f.f112315d, new C23801a(this, gVar));
            this.f63410b = C39618d.f101152P.mo83103a(C40790a.EnablePublisherOpt);
            m58417c();
        }

        C23800a(C23812a aVar, Factory factory, C43907k kVar, String str) {
            this.f63411c = aVar;
            this.f63412d = factory;
            this.f63413e = kVar;
            this.f63414f = str;
        }
    }
}
