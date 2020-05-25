package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.C2240a;
import com.google.p1057b.p1058a.C17437s;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43761q;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44481g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService */
public class ShortVideoPublishService extends Service implements C44334o<C42421al> {

    /* renamed from: a */
    C44481g f107143a;

    /* renamed from: b */
    ArrayList<C44334o> f107144b = new ArrayList<>();

    /* renamed from: c */
    Object f107145c;

    /* renamed from: d */
    int f107146d;

    /* renamed from: e */
    String f107147e;

    /* renamed from: f */
    boolean f107148f;

    /* renamed from: g */
    boolean f107149g;

    /* renamed from: h */
    boolean f107150h;

    /* renamed from: i */
    public int f107151i;

    /* renamed from: j */
    public boolean f107152j;

    /* renamed from: k */
    Factory f107153k = PublishServiceFactoryImpl.createShortVideoPublishService$FactorybyMonsterPlugin();

    /* renamed from: l */
    private String f107154l;

    /* renamed from: m */
    private boolean f107155m = false;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$Factory */
    public interface Factory {
        Object buildArgs(int i, Bundle bundle);

        C44334o<C42421al> buildCallback(int i, Object obj);

        C43907k buildFutureFactory(int i, int i2, Bundle bundle);

        C43907k buildFutureFactory(C44386j jVar);

        C44481g buildPublisher(int i, boolean z, C43907k kVar, int i2, int i3, String str, boolean z2, C44334o<C42421al> oVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$a */
    public class C42378a extends Binder implements C44371e {
        /* renamed from: a */
        public final Object mo80717a() {
            return ShortVideoPublishService.this.f107145c;
        }

        /* renamed from: b */
        public final int mo80719b() {
            return ShortVideoPublishService.this.f107146d;
        }

        /* renamed from: c */
        public final Bitmap mo80721c() {
            if (ShortVideoPublishService.this.f107143a != null) {
                return ShortVideoPublishService.this.f107143a.mo90356b(ShortVideoPublishService.this.f107145c);
            }
            return null;
        }

        /* renamed from: d */
        public final String mo80722d() {
            if (ShortVideoPublishService.this.f107145c instanceof VideoPublishEditModel) {
                return ((VideoPublishEditModel) ShortVideoPublishService.this.f107145c).creationId;
            }
            if (ShortVideoPublishService.this.f107145c instanceof PhotoContext) {
                return ((PhotoContext) ShortVideoPublishService.this.f107145c).creationId;
            }
            return "";
        }

        private C42378a() {
        }

        /* renamed from: b */
        public final void mo80720b(C44334o oVar) {
            C50203g.m108363d("ShortVideoPublishService unregisterCallback");
            ShortVideoPublishService.this.f107144b.remove(oVar);
        }

        /* renamed from: a */
        public final void mo80718a(C44334o oVar) {
            if (oVar != null) {
                C50203g.m108363d("ShortVideoPublishService registerCallback");
                ShortVideoPublishService.this.f107144b.add(oVar);
                if (ShortVideoPublishService.this.f107149g) {
                    C0013i.m18a((Callable<TResult>) new C43788el<TResult>(this), C0013i.f25b);
                    return;
                }
                if (ShortVideoPublishService.this.f107151i > 0) {
                    oVar.onProgressUpdate(ShortVideoPublishService.this.f107151i, ShortVideoPublishService.this.f107152j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m93059a() {
        if (!this.f107150h) {
            C26890h.m65011a("publish_service_cancel", C23089d.m56640a().mo47829a("invoke_type", "stopSelf").f61491a);
        }
    }

    public void onDestroy() {
        this.f107150h = true;
        C50203g.m108363d("ShortVideoPublishService onDestroy");
        if (this.f107143a != null) {
            this.f107143a.mo90360c();
            C26890h.m65011a("publish_service_cancel", C23089d.m56640a().mo47829a("invoke_type", "onDestroy").f61491a);
        }
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        C50203g.m108363d("ShortVideoPublishService onBind");
        return new C42378a();
    }

    public void onSynthetiseSuccess(String str) {
        Iterator it = new ArrayList(this.f107144b).iterator();
        while (it.hasNext()) {
            ((C44334o) it.next()).onSynthetiseSuccess(str);
        }
    }

    /* renamed from: a */
    private static boolean m93061a(Object obj) {
        if (obj instanceof BaseShortVideoContext) {
            return ((BaseShortVideoContext) obj).isPoiOrderRate();
        }
        if (obj instanceof PhotoContext) {
            return ((PhotoContext) obj).isPoiOrderRate();
        }
        return false;
    }

    public void onError(C43856fy fyVar) {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder("ShortVideoPublishService onError ");
        sb.append(fyVar.getMessage());
        C50203g.m108363d(sb.toString());
        Throwable cause = fyVar.getCause();
        if ((!(cause instanceof C43809fd) || ((C43809fd) cause).getCode() != -66666) && (!(cause instanceof C45241aa) || ((C45241aa) cause).getErrorCode() != -39993)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i = this.f107146d;
            if (i == 6 || i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                fyVar.setRecover(true);
            }
        }
        int i2 = this.f107146d;
        Object obj = this.f107145c;
        boolean z3 = this.f107148f;
        C23569o.m57783b("aweme_movie_publish_log", "publish_error", new C26898j().mo54849a("exception", C17437s.m42688b(fyVar)).mo54850a());
        if (i2 == 0) {
            m93060a(((VideoPublishEditModel) obj).creationId, false, z3);
        } else if (i2 == 6) {
            m93060a(((PhotoMovieContext) obj).creationId, false, z3);
        }
        Iterator it = new ArrayList(this.f107144b).iterator();
        while (it.hasNext()) {
            ((C44334o) it.next()).onError(fyVar);
        }
        if (!z) {
            C26916m a = C39618d.f101182w.mo74167a(this.f107145c);
            if (C39618d.f101182w.mo74172a(a)) {
                C39618d.f101182w.mo74169a(null, a, "", 20016);
            }
        }
        this.f107149g = true;
        m93059a();
        stopSelf();
    }

    public void onProgressUpdate(int i, boolean z) {
        this.f107151i = i;
        this.f107152j = m93061a(this.f107145c);
        Iterator it = new ArrayList(this.f107144b).iterator();
        while (it.hasNext()) {
            ((C44334o) it.next()).onProgressUpdate(i, this.f107152j);
        }
    }

    public void onSuccess(C42421al alVar, boolean z) {
        StringBuilder sb = new StringBuilder("service args is ");
        sb.append(this.f107145c);
        sb.append(" videoType is ");
        sb.append(this.f107146d);
        sb.append(" onSuccess start ");
        sb.append(this.f107144b.size());
        C32458a.m75144a(sb.toString());
        if (this.f107146d == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f107145c;
            C39618d.f101179t.mo74308a((BaseResponse) alVar, videoPublishEditModel.getVideoLength());
            C39618d.f101179t.mo74309a((BaseResponse) alVar, C43577d.m95730b(videoPublishEditModel.getMainBusinessContext(), C43596f.TRACK_PAGE_EDIT));
            alVar.videoCoverPath = this.f107154l;
        }
        Iterator it = new ArrayList(this.f107144b).iterator();
        while (it.hasNext()) {
            ((C44334o) it.next()).onSuccess(alVar, m93061a(this.f107145c));
        }
        int i = this.f107146d;
        Object obj = this.f107145c;
        if (!(alVar == null || alVar.mSaveModel == null || !alVar.mSaveModel.isSaveLocal())) {
            String str = "";
            C42387a a = C39618d.f101140D.mo74287a(alVar);
            if (a != null) {
                str = a.aid;
            }
            String str2 = "";
            if (i == 0 && (obj instanceof VideoPublishEditModel)) {
                str2 = C43434az.m95202a((VideoPublishEditModel) obj);
            } else if (i == 6) {
                str2 = "slideshow";
            }
            C26890h.m65011a("download_publish_finish", new C23089d().mo47826a("scene_id", 1004).mo47829a("group_id", str).mo47829a("content_type", str2).mo47829a("download_type", "self").mo47829a("download_method", "download_with_publish").f61491a);
        }
        int i2 = this.f107146d;
        Object obj2 = this.f107145c;
        String str3 = this.f107147e;
        boolean z2 = this.f107148f;
        C26898j jVar = new C26898j();
        if (i2 == 0) {
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(videoPublishEditModel2.videoWidth());
            sb2.append("x");
            sb2.append(videoPublishEditModel2.videoHeight());
            jVar.mo54849a("bitrate", String.valueOf(C40797m.m90249d())).mo54849a("duration", String.valueOf(videoPublishEditModel2.getVideoLength())).mo54849a("resolution", sb2.toString()).mo54849a("shoot_way", str3);
            m93060a(videoPublishEditModel2.creationId, true, z2);
        } else if (i2 == 6) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(photoMovieContext.mWidth);
            sb3.append("x");
            sb3.append(photoMovieContext.mHeight);
            jVar.mo54849a("bitrate", String.valueOf(C40797m.m90249d())).mo54849a("duration", String.valueOf(photoMovieContext.getVideoLength())).mo54849a("resolution", sb3.toString()).mo54849a("shoot_way", str3);
            m93060a(photoMovieContext.creationId, true, z2);
        }
        C39618d.f101182w.mo74174b(this.f107145c);
        StringBuilder sb4 = new StringBuilder("service args is ");
        sb4.append(this.f107145c);
        sb4.append(" videoType is ");
        sb4.append(this.f107146d);
        sb4.append(" before stop");
        C32458a.m75144a(sb4.toString());
        m93059a();
        stopSelf();
    }

    /* renamed from: a */
    private static void m93060a(String str, boolean z, boolean z2) {
        if (z2) {
            C26890h.m65011a("publish_retry_status", C23089d.m56640a().mo47826a("is_success", z ? 1 : 0).mo47829a("creation_id", str).f61491a);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        C50203g.m108363d("ShortVideoPublishService onStartCommand");
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return onStartCommand;
        }
        this.f107147e = intent.getStringExtra("shoot_way");
        boolean z = false;
        this.f107148f = intent.getBooleanExtra("publish_retry", false);
        Bundle bundle = new Bundle();
        bundle.putString("shoot_way", this.f107147e);
        if (intent.hasExtra("extra_photo_publish_args")) {
            bundle.putSerializable("args", (PhotoContext) intent.getSerializableExtra("extra_photo_publish_args"));
            bundle.putInt("video_type", 5);
        } else if (intent.hasExtra("extra_video_publish_args")) {
            Serializable serializableExtra = intent.getSerializableExtra("extra_video_publish_args");
            final String str = "";
            if (serializableExtra instanceof VideoPublishEditModel) {
                final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
                if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isMultiVideoEdit()) {
                    str = C43761q.m96174a();
                    C0013i.m16a((Callable<TResult>) new Callable<Object>() {
                        public final Object call() throws Exception {
                            String str;
                            if (videoPublishEditModel.isMvThemeVideoType()) {
                                str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
                            } else {
                                str = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                            }
                            C48016e.m103948c(str, str);
                            return null;
                        }
                    });
                } else if (videoPublishEditModel.isStatusVideoType()) {
                    str = C43761q.m96174a();
                    C0013i.m16a((Callable<TResult>) new Callable<Object>() {
                        public final Object call() throws Exception {
                            C48016e.m103948c(videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath(), str);
                            return null;
                        }
                    });
                } else {
                    String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
                    if (validVideoCoverPath != null) {
                        str = validVideoCoverPath;
                    }
                }
            }
            this.f107154l = str;
            bundle.putSerializable("args", serializableExtra);
            bundle.putInt("video_type", 0);
            if (intent.getBooleanExtra("review_video_fast_publish", false)) {
                bundle.putBoolean("review_video_fast_publish", true);
            }
        } else if (intent.hasExtra(IPhotoMovieService.EXTRA_VIDEO_PUBLISH_ARGS)) {
            bundle.putParcelable("args", intent.getParcelableExtra(IPhotoMovieService.EXTRA_VIDEO_PUBLISH_ARGS));
            bundle.putInt("video_type", 6);
        } else if (intent.hasExtra("story_args")) {
            int intExtra = intent.getIntExtra("story_type", -1);
            if (C38704c.m86062c(intExtra)) {
                bundle.putSerializable("args", intent.getSerializableExtra("story_args"));
                bundle.putInt("video_type", intExtra);
            } else {
                StringBuilder sb = new StringBuilder("publish service not supported this publish ");
                sb.append(intExtra);
                throw new AssertionError(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("publish service not supported this publish ");
            sb2.append(intent);
            throw new AssertionError(sb2.toString());
        }
        bundle.putInt("pre_publish_type", intent.getIntExtra("pre_publish_type", 0));
        if (intent.getBooleanExtra("parallel_synthesize_upload", false)) {
            bundle.putBoolean("parallel_synthesize_upload", true);
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f107146d = bundle.getInt("video_type");
        this.f107145c = this.f107153k.buildArgs(this.f107146d, bundle);
        C43907k buildFutureFactory = this.f107153k.buildFutureFactory(this.f107146d, i3, bundle);
        C50203g.m108358a(C2240a.m6773a(Locale.US, "Publisher VideoType:%d UploadType:%d factory:%s", new Object[]{Integer.valueOf(this.f107146d), Integer.valueOf(i3), buildFutureFactory.getClass().getCanonicalName()}));
        C44334o buildCallback = this.f107153k.buildCallback(this.f107146d, this.f107145c);
        if (buildCallback != null) {
            this.f107144b.add(buildCallback);
        }
        int i4 = bundle.getInt("pre_publish_type", 0);
        if (bundle.getBoolean("review_video_fast_publish") && C39618d.f101151O.mo83117a(C40796a.ReviewVideoFastPublish) && !this.f107148f) {
            z = true;
        }
        if (this.f107143a == null) {
            this.f107143a = this.f107153k.buildPublisher(i4, z, buildFutureFactory, this.f107146d, i3, bundle.getString("shoot_way"), this.f107148f, this);
            this.f107155m = C39618d.f101152P.mo83103a(C40790a.EnablePublisherOpt);
        }
        if (this.f107155m) {
            if (z) {
                if (i4 == 0) {
                    this.f107143a.mo90353a(this.f107145c);
                } else {
                    C50203g.m108358a("disable prePublish for review video fast publish");
                }
            } else if (i4 == 0) {
                this.f107143a.mo90353a(this.f107145c);
            } else {
                this.f107143a.mo90354a(this.f107145c, i4);
            }
        } else if (z) {
            if (i4 == 0) {
                this.f107143a.mo90362c(this.f107145c);
            } else {
                C50203g.m108358a("disable prePublish for review video fast publish");
            }
        } else if (i4 == 0) {
            this.f107143a.mo90353a(this.f107145c);
        } else {
            this.f107143a.mo90354a(this.f107145c, i4);
        }
        return 2;
    }
}
