package com.p683ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.SafeJobIntentService;
import android.text.TextUtils;
import com.google.p1057b.p1058a.C17437s;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45642b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45252b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2246a.C45240a;
import com.p683ss.android.ugc.aweme.tools.AVApi;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46812a;
import com.p683ss.android.ugc.aweme.tools.policysecurity.C47334b.C47335a;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService */
public final class OriginalSoundUploadService extends SafeJobIntentService {

    /* renamed from: a */
    public static final C47326a f119466a = new C47326a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$AudioUploadApi */
    public interface AudioUploadApi {
        @C53084o(mo110612a = "/aweme/v2/aweme/audiotrack/update/")
        @C53074e
        C0013i<BaseResponse> uploadAudio(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "audiotrack_uri") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$a */
    public static final class C47326a {
        private C47326a() {
        }

        public /* synthetic */ C47326a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$b */
    public static final class C47327b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ C43852fu f119467a;

        /* renamed from: b */
        final /* synthetic */ OriginalSoundUploadTask f119468b;

        /* renamed from: c */
        final /* synthetic */ C52727e f119469c;

        /* renamed from: d */
        final /* synthetic */ C0027j f119470d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final void onUploadVideoStage(int i, long j) {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C45252b.m98738a(this.f119467a, "OriginalSoundUpload");
        }

        public final void onLog(int i, int i2, String str) {
            C45240a.m98714a(i, str);
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    ((TTVideoUploader) this.f119469c.element).close();
                    C0027j jVar = this.f119470d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    jVar.mo46b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            OriginalSoundUploadTask originalSoundUploadTask = this.f119468b;
            if (tTVideoInfo == null) {
                C52711k.m112234a();
            }
            originalSoundUploadTask.f119481a = tTVideoInfo.mVideoId;
            ((TTVideoUploader) this.f119469c.element).close();
            this.f119470d.mo47b(this.f119468b);
        }

        C47327b(C43852fu fuVar, OriginalSoundUploadTask originalSoundUploadTask, C52727e eVar, C0027j jVar) {
            this.f119467a = fuVar;
            this.f119468b = originalSoundUploadTask;
            this.f119469c = eVar;
            this.f119470d = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$c */
    static final class C47328c<TTaskResult, TContinuationResult> implements C0011g<OriginalSoundUploadTask, C0013i<BaseResponse>> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadService f119471a;

        /* renamed from: b */
        final /* synthetic */ C43846fo f119472b;

        /* renamed from: c */
        final /* synthetic */ C47334b f119473c;

        /* renamed from: d */
        final /* synthetic */ C52727e f119474d;

        C47328c(OriginalSoundUploadService originalSoundUploadService, C43846fo foVar, C47334b bVar, C52727e eVar) {
            this.f119471a = originalSoundUploadService;
            this.f119472b = foVar;
            this.f119473c = bVar;
            this.f119474d = eVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo33d() || iVar.mo31c()) {
                Exception f = iVar.mo35f();
                C52711k.m112236a((Object) f, "it.error");
                throw f;
            }
            C47334b bVar = this.f119473c;
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "it.result");
            OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) e;
            C52711k.m112240b(originalSoundUploadTask, "task");
            bVar.mo94619a(originalSoundUploadTask);
            AudioUploadApi audioUploadApi = (AudioUploadApi) this.f119474d.element;
            C52711k.m112236a((Object) audioUploadApi, "api");
            Object e2 = iVar.mo34e();
            C52711k.m112236a(e2, "it.result");
            OriginalSoundUploadTask originalSoundUploadTask2 = (OriginalSoundUploadTask) e2;
            C52711k.m112240b(audioUploadApi, "api");
            C52711k.m112240b(originalSoundUploadTask2, "task");
            String str = originalSoundUploadTask2.f119482b;
            String str2 = originalSoundUploadTask2.f119481a;
            if (str2 == null) {
                C52711k.m112234a();
            }
            return audioUploadApi.uploadAudio(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$d */
    static final class C47329d<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadTask f119475a;

        /* renamed from: b */
        final /* synthetic */ OriginalSoundUploadService f119476b;

        /* renamed from: c */
        final /* synthetic */ C43846fo f119477c;

        /* renamed from: d */
        final /* synthetic */ C47334b f119478d;

        /* renamed from: e */
        final /* synthetic */ C52727e f119479e;

        C47329d(OriginalSoundUploadTask originalSoundUploadTask, OriginalSoundUploadService originalSoundUploadService, C43846fo foVar, C47334b bVar, C52727e eVar) {
            this.f119475a = originalSoundUploadTask;
            this.f119476b = originalSoundUploadService;
            this.f119477c = foVar;
            this.f119478d = bVar;
            this.f119479e = eVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (!iVar.mo33d() && !iVar.mo31c()) {
                this.f119478d.mo94620a(this.f119475a.f119482b);
                new File(this.f119475a.f119484d).delete();
            } else if (iVar.mo33d()) {
                if ((iVar.mo35f() instanceof IllegalStateException) && iVar.mo35f().getMessage() != null) {
                    String message = iVar.mo35f().getMessage();
                    if (message == null) {
                        C52711k.m112234a();
                    }
                    if (C52830p.m112411b(message, "file error", false, 2, null)) {
                        this.f119478d.mo94620a(this.f119475a.f119482b);
                        new File(this.f119475a.f119484d).delete();
                    }
                }
                Exception f = iVar.mo35f();
                C52711k.m112236a((Object) f, "it.error");
                throw f;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$e */
    static final class C47330e<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadTask f119480a;

        C47330e(OriginalSoundUploadTask originalSoundUploadTask) {
            this.f119480a = originalSoundUploadTask;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo33d()) {
                Exception f = iVar.mo35f();
                C52711k.m112236a((Object) f, "it.error");
                Throwable th = f;
                C52711k.m112240b(th, "$this$getStackTraceAsString");
                String b = C17437s.m42688b(th);
                C52711k.m112236a((Object) b, "Throwables.getStackTraceAsString(this)");
                C23569o.m57783b("aweme_movie_publish_log", "upload_audio", C46812a.m101655a(C52550ab.m112050a(C52856t.m112465a("success", "0"), C52856t.m112465a("success_mid", this.f119480a.f119483c), C52856t.m112465a("aweme_id", this.f119480a.f119482b), C52856t.m112465a("errorDesc", b))));
            } else {
                C23569o.m57783b("aweme_movie_publish_log", "upload_audio", C46812a.m101655a(C52550ab.m112050a(C52856t.m112465a("success", "1"), C52856t.m112465a("success_mid", this.f119480a.f119483c), C52856t.m112465a("aweme_id", this.f119480a.f119482b))));
            }
            return C52860x.f131107a;
        }
    }

    public final void onHandleWork(Intent intent) {
        boolean z;
        C52711k.m112240b(intent, "intent");
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        AVApi createAVApibyMonsterPlugin = AVApiImpl.createAVApibyMonsterPlugin();
        C52711k.m112236a((Object) createAVApibyMonsterPlugin, "ServiceManager.get().getService(AVApi::class.java)");
        IRetrofit createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createAVApibyMonsterPlugin.getAPI_URL_PREFIX_SI());
        C52727e eVar = new C52727e();
        eVar.element = (AudioUploadApi) createNewRetrofit.create(AudioUploadApi.class);
        Context applicationContext = getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "applicationContext");
        C47334b a = C47335a.m102704a(applicationContext);
        String e = C39629l.m88232a().mo58574e().mo83121e(C40796a.SdkV4AuthKey);
        if (!TextUtils.isEmpty(e)) {
            C43846fo foVar = (C43846fo) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(e, C43846fo.class);
            Iterable a2 = a.mo94618a();
            Collection arrayList = new ArrayList();
            for (Object next : a2) {
                if (System.currentTimeMillis() - ((OriginalSoundUploadTask) next).f119485e > TimeUnit.DAYS.toMillis(1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (OriginalSoundUploadTask originalSoundUploadTask : (List) arrayList) {
                a.mo94620a(originalSoundUploadTask.f119482b);
                new File(originalSoundUploadTask.f119484d).delete();
            }
            for (OriginalSoundUploadTask originalSoundUploadTask2 : a.mo94618a()) {
                C52711k.m112236a((Object) foVar, "config");
                C43852fu fuVar = foVar.f111026a;
                C52711k.m112236a((Object) fuVar, "config.uploadVideoConfig");
                C0013i b = m102699a(originalSoundUploadTask2, fuVar).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C47328c<TResult,C0013i<TContinuationResult>>(this, foVar, a, eVar));
                C47329d dVar = new C47329d(originalSoundUploadTask2, this, foVar, a, eVar);
                b.mo19a((C0011g<TResult, TContinuationResult>) dVar).mo19a((C0011g<TResult, TContinuationResult>) new C47330e<TResult,TContinuationResult>(originalSoundUploadTask2)).mo36g();
            }
        }
    }

    /* renamed from: a */
    private static C0013i<OriginalSoundUploadTask> m102699a(OriginalSoundUploadTask originalSoundUploadTask, C43852fu fuVar) {
        C52711k.m112240b(originalSoundUploadTask, "task");
        C52711k.m112240b(fuVar, "config");
        if (originalSoundUploadTask.f119481a != null) {
            C0013i<OriginalSoundUploadTask> a = C0013i.m14a(originalSoundUploadTask);
            C52711k.m112236a((Object) a, "Task.forResult(task)");
            return a;
        }
        int a2 = C45642b.m99389a(originalSoundUploadTask.f119484d);
        if (a2 != 0) {
            StringBuilder sb = new StringBuilder("file error, ");
            sb.append(originalSoundUploadTask.f119484d);
            sb.append(" checkResult = ");
            sb.append(a2);
            C0013i<OriginalSoundUploadTask> a3 = C0013i.m13a((Exception) new IllegalStateException(sb.toString()));
            C52711k.m112236a((Object) a3, "Task.forError(IllegalSta…kResult = $checkResult\"))");
            return a3;
        }
        C0027j jVar = new C0027j();
        C52727e eVar = new C52727e();
        eVar.element = null;
        try {
            eVar.element = C38949c.m86785a();
            ((TTVideoUploader) eVar.element).setListener(new C47327b(fuVar, originalSoundUploadTask, eVar, jVar));
            ((TTVideoUploader) eVar.element).setMaxFailTime(fuVar.f111072h);
            ((TTVideoUploader) eVar.element).setEnableLogCallBack(fuVar.f111085u);
            ((TTVideoUploader) eVar.element).setSliceSize(fuVar.f111070f);
            ((TTVideoUploader) eVar.element).setFileUploadDomain(fuVar.f111066b);
            ((TTVideoUploader) eVar.element).setVideoUploadDomain(fuVar.f111067c);
            ((TTVideoUploader) eVar.element).setSliceTimeout(fuVar.f111068d);
            ((TTVideoUploader) eVar.element).setPathName(originalSoundUploadTask.f119484d);
            ((TTVideoUploader) eVar.element).setFileRetryCount(1);
            ((TTVideoUploader) eVar.element).setUserKey(fuVar.f111065a);
            ((TTVideoUploader) eVar.element).setAuthorization(fuVar.f111073i);
            ((TTVideoUploader) eVar.element).setSocketNum(1);
            ((TTVideoUploader) eVar.element).start();
        } catch (Exception unused) {
            TTVideoUploader tTVideoUploader = (TTVideoUploader) eVar.element;
            if (tTVideoUploader != null) {
                tTVideoUploader.close();
            }
        }
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }
}
