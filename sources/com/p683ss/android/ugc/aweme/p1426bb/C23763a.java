package com.p683ss.android.ugc.aweme.p1426bb;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1435bh.C23803e;
import com.p683ss.android.ugc.aweme.p1435bh.C23803e.C23808c;
import com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.publish.Publish;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43757n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44388l.C44389a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45289b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bb.a */
public final class C23763a {

    /* renamed from: b */
    private static C23763a f63348b = new C23763a();

    /* renamed from: a */
    public boolean f63349a = C39618d.f101152P.mo83103a(C40790a.EnableMultiPublisherScheduler);

    /* renamed from: c */
    private C45289b f63350c = new C45289b();

    /* renamed from: a */
    public static C23763a m58315a() {
        return f63348b;
    }

    /* renamed from: b */
    private static Class<? extends Service> m58320b() {
        return ShortVideoPublishService.class;
    }

    /* renamed from: a */
    public final boolean mo49228a(Context context) {
        boolean z;
        boolean z2 = false;
        if (this.f63349a) {
            Iterable b = C23803e.f63419a.mo49407b(null);
            if (!(b instanceof Collection) || !((Collection) b).isEmpty()) {
                Iterator it = b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((C23812a) it.next()).f63445b instanceof C44389a)) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("PublishScheduler | isPublishing publishId:");
            sb.append(null);
            sb.append(" result:");
            sb.append(z2);
            C45407ay.m98973d(sb.toString());
            return z2;
        } else if (context != null) {
            return m58319a(context, m58320b());
        } else {
            C50203g.m108361b("非 enableMultiPublisherScheduler，context 不为 null");
            return false;
        }
    }

    private C23763a() {
    }

    /* renamed from: a */
    public static void m58318a(String str) {
        ((C39666o) C26888e.m65000a(C39618d.f101160a, C39666o.class)).mo48449a(str);
    }

    /* renamed from: a */
    public final void mo49225a(FragmentActivity fragmentActivity, Bundle bundle) {
        mo49226a(fragmentActivity, bundle, (String) null);
    }

    /* renamed from: a */
    public final boolean mo49229a(FragmentActivity fragmentActivity, Intent intent) {
        if (intent.getIntExtra("pre_publish_type", 0) == 0) {
            this.f63350c.mo91551c();
        }
        return C39618d.f101179t.mo74312a(fragmentActivity, intent, m58320b(), "extra_video_publish_args", IPhotoMovieService.EXTRA_VIDEO_PUBLISH_ARGS);
    }

    /* renamed from: a */
    public static void m58317a(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        String b = ((C39666o) C26888e.m65000a(context, C39666o.class)).mo48454b();
        if (TextUtils.isEmpty(b)) {
            onGetRecoverDraftCallback.onFail();
        } else {
            C46797a.m101642a().execute(new C23765b(b, onGetRecoverDraftCallback));
        }
    }

    /* renamed from: a */
    private static boolean m58319a(Context context, Class<?> cls) {
        if (context == null) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        List<RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            return false;
        }
        for (RunningServiceInfo runningServiceInfo : runningServices) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49224a(Context context, String str) {
        C26890h.m65011a("publish_service_cancel", C23089d.m56640a().mo47829a("invoke_type", "cancelSynthetise").mo47829a("scene", str).f61491a);
        if (this.f63349a) {
            C23803e.f63420b.execute(new C23808c(null));
            return;
        }
        if (mo49228a(context)) {
            C50203g.m108363d("PublishServiceImpl cancelSynthetise");
            C26890h.m65011a("publish_service_cancel", C23089d.m56640a().mo47829a("invoke_type", "realStopService").f61491a);
            context.stopService(new Intent(context, m58320b()));
        }
    }

    /* renamed from: a */
    public final void mo49227a(FragmentActivity fragmentActivity, C29059c cVar) {
        String str;
        int i;
        boolean z;
        String str2;
        Bundle bundle = new Bundle();
        int i2 = 0;
        if (cVar.f76137O == 2) {
            PhotoMovieContext photoMovieContext = cVar.f76145c;
            if (photoMovieContext != null && cVar.f76144b != null) {
                photoMovieContext.mOutputVideoPath = C43307ea.m94996a(".mp4");
                if (photoMovieContext.mMusicPath == null) {
                    str2 = "";
                } else {
                    str2 = C43307ea.m94996a(".wav");
                }
                photoMovieContext.mInputAudioPath = str2;
                photoMovieContext.challenges = cVar.f76144b.f76030c;
                photoMovieContext.title = cVar.f76144b.f76028a;
                photoMovieContext.structList = cVar.f76144b.f76029b;
                photoMovieContext.isPrivate = cVar.f76124B;
                photoMovieContext.poiId = cVar.mo58733J();
                photoMovieContext.mSaveModel = cVar.mo58732I();
                bundle.putInt("video_type", 0);
                bundle.putParcelable(IPhotoMovieService.EXTRA_VIDEO_PUBLISH_ARGS, photoMovieContext);
                bundle.putString("shoot_way", photoMovieContext.mShootWay);
                i = 6;
                str = cVar.mo58817z();
            } else {
                return;
            }
        } else {
            new C43447bb("PublishServiceImpl");
            VideoPublishEditModel a = C43447bb.m95224a(cVar);
            a.userClickPublishTime = SystemClock.uptimeMillis();
            bundle.putInt("video_type", 0);
            bundle.putSerializable("extra_video_publish_args", a);
            bundle.putString("shoot_way", a.mShootWay);
            if (!C39618d.f101152P.mo83103a(C40790a.EnableParallelSynthesizeUpload) || !C39618d.f101152P.mo83103a(C40790a.EnableRetryParallelSynthesizeUpload)) {
                z = false;
            } else {
                bundle.putBoolean("parallel_synthesize_upload", true);
                z = true;
            }
            str = cVar.mo58817z();
            if (z) {
                i = 0;
                i2 = 1;
            } else {
                i = 0;
            }
        }
        m58316a(i, str, i2);
        bundle.putBoolean("publish_retry", true);
        ((C39666o) C26888e.m65000a(fragmentActivity, C39666o.class)).mo48449a((String) null);
        Intent intent = new Intent();
        if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
            intent.putExtra("publish_bundle", bundle);
        } else {
            intent.putExtras(bundle);
        }
        if (this.f63349a) {
            String a2 = C23803e.m58426a(bundle, (String) null);
            if (a2 == null) {
                C50203g.m108361b("上一段发布中，无法启动发布");
                return;
            }
            intent.putExtra("multi_publish_id", a2);
        }
        mo49229a(fragmentActivity, intent);
    }

    /* renamed from: a */
    private static void m58316a(int i, String str, int i2) {
        C26890h.m65011a("performance_publish", new C23089d().mo47829a("creation_id", str).mo47829a("content_type", "video").mo47826a("retry_publish", 1).mo47826a("video_type", i).mo47826a("video_upload_type", i2).f61491a);
        C23569o.m57776a("user_publish_success_rate_parallel", -1, C23088c.m56631a().mo47822a("video_type", Integer.valueOf(i)).mo47822a("retry_publish", Integer.valueOf(1)).mo47822a("video_upload_type", Integer.valueOf(i2)).mo47825b());
    }

    /* renamed from: a */
    public final void mo49226a(FragmentActivity fragmentActivity, Bundle bundle, String str) {
        String str2;
        C50203g.m108363d("PublishServiceImpl startPublish publish");
        boolean z = bundle.getBoolean("enter_record_from_other_platform", false);
        if (bundle.getBoolean("extra_enter_from_live", false)) {
            if (bundle.getBoolean("live_highlight")) {
                Intent intent = new Intent();
                if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
                    intent.putExtra("publish_bundle", bundle);
                } else {
                    intent.putExtras(bundle);
                }
                if (bundle.getBoolean("review_video_fast_publish", false)) {
                    intent.putExtra("review_video_fast_publish", true);
                }
                if (this.f63349a) {
                    String a = C23803e.m58426a(bundle, str);
                    if (a == null) {
                        C50203g.m108361b("上一段发布中，无法启动发布");
                        return;
                    }
                    intent.putExtra("multi_publish_id", a);
                }
                mo49229a(fragmentActivity, intent);
                C43757n nVar = new C43757n();
                nVar.setCode(Integer.valueOf(1));
                nVar.setType("highlight");
                nVar.setStatus("success");
                intent.putExtra("live_highlight_responce", nVar);
                fragmentActivity.setResult(9, intent);
                fragmentActivity.finish();
                return;
            }
            Intent intent2 = new Intent(fragmentActivity, C39618d.f101162c.mo74159e());
            intent2.addFlags(603979776);
            if (C39618d.f101152P.mo83103a(C40790a.EnableOptimizePublishContainerActivityNotInStack) && !C39618d.f101162c.mo74160f()) {
                intent2.putExtra("enable_optimize_main_not_in_stack", true);
            }
            if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
                intent2.putExtra("publish_bundle", bundle);
            } else {
                intent2.putExtras(bundle);
            }
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent2.putExtra("review_video_fast_publish", true);
            }
            if (this.f63349a) {
                String a2 = C23803e.m58426a(bundle, str);
                if (a2 == null) {
                    C50203g.m108361b("上一段发布中，无法启动发布");
                    return;
                }
                intent2.putExtra("multi_publish_id", a2);
            }
            this.f63350c.mo91549a();
            intent2.putExtra("live_capture_responce", "publish");
            fragmentActivity.setResult(9, intent2);
            fragmentActivity.finish();
            StringBuilder sb = new StringBuilder("PublishServiceImpl startPublish publish fromOtherPlatform:");
            sb.append(z);
            C50203g.m108363d(sb.toString());
        } else if (z) {
            Intent intent3 = new Intent();
            if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
                intent3.putExtra("publish_bundle", bundle);
            } else {
                intent3.putExtras(bundle);
            }
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent3.putExtra("review_video_fast_publish", true);
            }
            if (this.f63349a) {
                String a3 = C23803e.m58426a(bundle, str);
                if (a3 == null) {
                    C50203g.m108361b("上一段发布中，无法启动发布");
                    return;
                }
                intent3.putExtra("multi_publish_id", a3);
            }
            mo49229a(fragmentActivity, intent3);
            fragmentActivity.setResult(-1, intent3);
            fragmentActivity.finish();
        } else {
            Class e = C39618d.f101162c.mo74159e();
            StringBuilder sb2 = new StringBuilder("PublishServiceImpl startPublish containerActivityClass:");
            if (e == null) {
                str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str2 = e.getName();
            }
            sb2.append(str2);
            C50203g.m108363d(sb2.toString());
            Intent intent4 = new Intent(fragmentActivity, e);
            intent4.addFlags(603979776);
            boolean f = C39618d.f101162c.mo74160f();
            StringBuilder sb3 = new StringBuilder("PublishServiceImpl startPublish isPublishContainerActivityClassAlive:");
            sb3.append(f);
            C50203g.m108363d(sb3.toString());
            if (C39618d.f101152P.mo83103a(C40790a.EnableOptimizePublishContainerActivityNotInStack) && !f) {
                C50203g.m108363d("PublishServiceImpl startPublish EXTRA_ENABLE_OPTIMIZE_MAIN_NOT_IN_STACK:");
                intent4.putExtra("enable_optimize_main_not_in_stack", true);
            }
            if (C39618d.f101152P.mo83103a(C40790a.EnableProcessPublishFix)) {
                Publish.isNeedProcessPublish = true;
            }
            if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
                intent4.putExtra("publish_bundle", bundle);
            } else {
                intent4.putExtras(bundle);
            }
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent4.putExtra("review_video_fast_publish", true);
            }
            if (this.f63349a) {
                String a4 = C23803e.m58426a(bundle, str);
                if (a4 == null) {
                    C50203g.m108361b("上一段发布中，无法启动发布");
                    return;
                }
                intent4.putExtra("multi_publish_id", a4);
            }
            this.f63350c.mo91549a();
            fragmentActivity.startActivity(intent4);
        }
    }
}
