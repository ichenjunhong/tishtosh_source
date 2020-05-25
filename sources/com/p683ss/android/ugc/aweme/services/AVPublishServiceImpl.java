package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.external.C29624f;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.p1435bh.C23802d;
import com.p683ss.android.ugc.aweme.p1435bh.C23803e;
import com.p683ss.android.ugc.aweme.p1435bh.C23803e.C23809d;
import com.p683ss.android.ugc.aweme.p1435bh.C23811f.C23812a;
import com.p683ss.android.ugc.aweme.photo.C38683l;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photomovie.C38803k;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.LiveThumCallback;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.onLivePublishCallback;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43305e;
import com.p683ss.android.ugc.aweme.shortvideo.C43775ef;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44987as;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44987as.C44988a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44987as.C44990c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44987as.C44993d;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44987as.C44994e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45208q;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45209r;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.LivePublishActivity;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44377g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47761ce;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl */
public class AVPublishServiceImpl implements IAVPublishService {
    private static AVPublishServiceImpl sInstance;
    public FragmentActivity liveActivity;
    public C10641a liveDialog;
    private onLivePublishCallback livePublishCallback;
    private LiveThumCallback liveThumCallback;
    public C44987as mUploadRecoverPopView;

    public onLivePublishCallback getLivePublishCallback() {
        return this.livePublishCallback;
    }

    public LiveThumCallback getLiveThumCallback() {
        return this.liveThumCallback;
    }

    public boolean enableMultiPublisherScheduler() {
        return C23763a.m58315a().f63349a;
    }

    public C43804f getAVNationalTaskTips() {
        return C43214dh.m94817a().f109289d;
    }

    public boolean getKitManageRegister() {
        return C43214dh.m94820i();
    }

    public String getShootWay() {
        return C43214dh.m94817a().f109290e;
    }

    public boolean needRestore() {
        return C43214dh.m94817a().f109295j;
    }

    public void removeAVNationalTaskTips() {
        C43214dh.m94817a().mo87854d();
    }

    public C42482c getCurMusic() {
        return C43214dh.m94817a().mo50201b();
    }

    public boolean isPublishable() {
        if (!isPublishing()) {
            return true;
        }
        return false;
    }

    public boolean isPublishing() {
        return C43214dh.m94817a().mo87858h();
    }

    public static AVPublishServiceImpl getInstance() {
        if (sInstance == null) {
            synchronized (C29624f.class) {
                if (sInstance == null) {
                    sInstance = new AVPublishServiceImpl();
                }
            }
        }
        return sInstance;
    }

    public void cancelRestoreOnMain() {
        C43214dh.m94817a().f109295j = false;
        C43214dh.m94817a();
        C43214dh.m94818a(C43306a.m94990b());
        C43306a.m94978a();
    }

    public AVChallenge getCurChallenge() {
        if (C9376b.m18558a((Collection<T>) C43214dh.m94817a().f109287b)) {
            return null;
        }
        return (AVChallenge) C43214dh.m94817a().f109287b.get(0);
    }

    public void showUploadingDialog() {
        if (this.liveDialog != null && !this.liveDialog.mo18881a()) {
            this.liveDialog.mo18883c();
        }
        this.liveDialog = null;
    }

    static final /* synthetic */ Boolean lambda$tryRestorePublish$0$AVPublishServiceImpl() throws Exception {
        C43214dh a = C43214dh.m94817a();
        RecordScene b = C43306a.m94990b();
        a.f109295j = false;
        if (!b.isSegmentsNotValid()) {
            if (b.isDuetMode() || b.isStitchMode()) {
                C48016e.m103947c(b.duetVideoPath);
                C48016e.m103947c(b.duetAudioPath);
                C43214dh.m94818a(b);
                C43306a.m94978a();
            } else if (b.recordMode == 1) {
                C48016e.m103947c(b.mp4Path);
                C48016e.m103947c(b.musicPath);
                C43214dh.m94818a(b);
                C43306a.m94978a();
            } else if (b.isReactionMode()) {
                C48016e.m103947c(b.reactionParams.videoPath);
                C48016e.m103947c(b.reactionParams.wavPath);
                C43214dh.m94818a(b);
                C43306a.m94978a();
            } else if (b.isGreenScreen()) {
                C43214dh.m94818a(b);
                C43306a.m94978a();
            } else if (TextUtils.isEmpty(b.mp4Path)) {
                a.f109295j = true;
            }
        }
        return Boolean.valueOf(C43214dh.m94817a().f109295j);
    }

    public void setKitManageRegister(boolean z) {
        C43214dh.f109284k = z;
    }

    public void addAVNationalTaskTips(C43804f fVar) {
        C43214dh.m94817a().f109289d = fVar;
    }

    public void addNationalTask(C43305e eVar) {
        C43214dh.m94817a().f109288c = eVar;
    }

    public boolean endWithHashTag(String str) {
        return C47761ce.m103388a(str);
    }

    public void setMusicChooseType(int i) {
        C43214dh.m94817a().f109291f = i;
    }

    public void setPublishStatus(int i) {
        C43214dh.m94817a().mo87849a(i);
    }

    public void addChallenge(Challenge challenge) {
        C43214dh.m94817a().mo87850a(C39618d.f101168i.mo80565a(challenge));
    }

    public void addPublishCallback(C44334o<C42421al> oVar) {
        C23803e.m58429a((C44377g) new C23802d(oVar), (String) null);
    }

    public void cancelSynthetise(Context context) {
        C23763a.m58315a().mo49224a(context, "MainBusiness");
    }

    public boolean checkIsAlreadyPublished(Context context) {
        return C43214dh.m94817a().mo87852a(context);
    }

    public boolean containEmoji(String str) {
        return Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])").matcher(str).find();
    }

    public void deleteLivePublishItem(String str) {
        Keva repo = Keva.getRepo("live_publish_repo");
        if (repo != null) {
            repo.erase(str);
        }
    }

    public C44386j getPublishModel(String str) {
        C23812a a = C23803e.f63419a.mo49403a(str);
        if (a != null) {
            return a.f63449f;
        }
        return null;
    }

    public boolean isPublishServiceRunning(Context context) {
        return C23763a.m58315a().mo49228a(context);
    }

    public void setCurMusic(MusicModel musicModel) {
        C43214dh.m94817a().mo50200a(C39618d.f101168i.mo80566a(musicModel));
    }

    public void setFakeMusic(MusicModel musicModel) {
        C43214dh.m94817a().f109286a = C39618d.f101168i.mo80566a(musicModel);
    }

    public void setHashTagRegex(String str) {
        if (!TextUtils.isEmpty(str)) {
            C47761ce.f120283a = str;
        }
    }

    public boolean inPublishPage(Context context) {
        C43214dh a = C43214dh.m94817a();
        IInternalAVService createIInternalAVServicebyMonsterPlugin = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
        if (!a.mo87858h() || !createIInternalAVServicebyMonsterPlugin.isPublishServiceRunning(context)) {
            return false;
        }
        return true;
    }

    public void setLiveThumCallback(LiveThumCallback liveThumCallback2) {
        this.liveThumCallback = liveThumCallback2;
        if (this.liveThumCallback != null) {
            AVPublishServiceImpl$$Lambda$3 aVPublishServiceImpl$$Lambda$3 = new AVPublishServiceImpl$$Lambda$3(this, System.currentTimeMillis(), FbUploadTokenTime.group0);
            C0013i.m16a((Callable<TResult>) aVPublishServiceImpl$$Lambda$3);
        }
    }

    public void addMusic(MusicModel musicModel) {
        if (musicModel.getMusic().getChallenge() != null) {
            C43214dh.m94817a().mo87850a(C39618d.f101168i.mo80565a(musicModel.getMusic().getChallenge()));
        }
        C43214dh.m94817a().mo50200a(C39618d.f101168i.mo80566a(musicModel));
    }

    public void removePublishCallback(C44334o<C42421al> oVar) {
        C52711k.m112240b(oVar, "callback");
        StringBuilder sb = new StringBuilder("PublishScheduler | removeCallback call ");
        sb.append(null);
        C45407ay.m98973d(sb.toString());
        C23803e.f63420b.execute(new C23809d(null, oVar));
    }

    public void uploadRecoverPopViewSetVisibility(boolean z) {
        int i;
        if (this.mUploadRecoverPopView != null && this.mUploadRecoverPopView.isShowing()) {
            C44987as asVar = this.mUploadRecoverPopView;
            if (!C39618d.f101152P.mo83103a(C40790a.PublishProgressOptimize)) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                asVar.f113933a.setVisibility(i);
            }
        }
    }

    public Bitmap getCover(C44386j jVar) {
        C52711k.m112240b(jVar, "publishModel");
        if (jVar.f112320i instanceof VideoPublishEditModel) {
            Object obj = jVar.f112320i;
            if (obj != null) {
                return C43775ef.m96218a((VideoPublishEditModel) obj);
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        } else if (jVar.f112320i instanceof PhotoContext) {
            Object obj2 = jVar.f112320i;
            if (obj2 != null) {
                return C38683l.m86039a((PhotoContext) obj2);
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.photo.PhotoContext");
        } else if (!(jVar.f112320i instanceof PhotoMovieContext)) {
            return null;
        } else {
            Object obj3 = jVar.f112320i;
            if (obj3 != null) {
                return C38803k.m86208a((PhotoMovieContext) obj3);
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
        }
    }

    public void startPublish(FragmentActivity fragmentActivity, Bundle bundle) {
        C23763a.m58315a().mo49225a(fragmentActivity, bundle);
    }

    public boolean processPublish(FragmentActivity fragmentActivity, Intent intent) {
        return C23763a.m58315a().mo49229a(fragmentActivity, intent);
    }

    public void showUploadRecoverIfNeed(final boolean z, final FragmentActivity fragmentActivity) {
        C23763a.m58317a((Context) fragmentActivity, (OnGetRecoverDraftCallback) new OnGetRecoverDraftCallback() {
            public void onFail() {
            }

            public void onSuccess(C29059c cVar) {
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74198a(false, new AVPublishServiceImpl$1$$Lambda$0(this, fragmentActivity, cVar, z));
            }

            /* access modifiers changed from: 0000 */
            public final /* synthetic */ C52860x lambda$onSuccess$0$AVPublishServiceImpl$1(FragmentActivity fragmentActivity, C29059c cVar, boolean z, Boolean bool, Long l) {
                int i;
                AVPublishServiceImpl.this.mUploadRecoverPopView = new C44987as(fragmentActivity, cVar, z);
                C44987as asVar = AVPublishServiceImpl.this.mUploadRecoverPopView;
                FragmentActivity fragmentActivity2 = asVar.f113939g;
                if (fragmentActivity2 == null) {
                    C52711k.m112234a();
                }
                if (!fragmentActivity2.isFinishing()) {
                    PullUpLayout pullUpLayout = asVar.f113936d;
                    if (pullUpLayout == null) {
                        C52711k.m112234a();
                    }
                    pullUpLayout.mo54987a();
                    C29061d.m68496a(asVar.f113940h, (OnVideoCoverCallback) new C44990c(asVar));
                    if (C39618d.f101152P.mo83103a(C40790a.PublishProgressOptimize)) {
                        TextView textView = asVar.f113938f;
                        if (textView == null) {
                            C52711k.m112234a();
                        }
                        textView.setOnClickListener(new C44993d(asVar));
                    } else {
                        ImageView imageView = asVar.f113935c;
                        if (imageView == null) {
                            C52711k.m112234a();
                        }
                        imageView.setOnClickListener(new C44994e(asVar));
                    }
                    asVar.f113937e = new C44988a(asVar);
                    IDraftService a = C46994b.m102064a();
                    DraftListener draftListener = asVar.f113937e;
                    if (draftListener == null) {
                        C52711k.m112234a();
                    }
                    a.registerDraftListener(draftListener);
                    C26890h.m65011a("publish_retry_show", C23089d.m56640a().mo47829a("creation_id", asVar.f113940h.mo58817z()).f61491a);
                    try {
                        Window window = asVar.f113939g.getWindow();
                        C52711k.m112236a((Object) window, "mFragmentActivity.window");
                        View decorView = window.getDecorView();
                        if (VERSION.SDK_INT >= 19) {
                            i = -C9432q.m18695e(C11010c.m22280a());
                        } else {
                            i = C9432q.m18695e(C11010c.m22280a());
                        }
                        asVar.showAtLocation(decorView, 48, 0, i);
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        });
    }

    public void addPublishCallback(C44334o<C42421al> oVar, String str) {
        C23803e.m58429a((C44377g) new C23802d(oVar), str);
    }

    public void publishFromDraft(FragmentActivity fragmentActivity, C29059c cVar) {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74198a(false, new AVPublishServiceImpl$$Lambda$2(fragmentActivity, cVar));
    }

    public void hideUploadRecoverWindow(Context context, boolean z) {
        if (this.mUploadRecoverPopView != null && this.mUploadRecoverPopView.isShowing()) {
            if (z) {
                C10691a.m21542b(context, (int) R.string.on).mo19066a();
            }
            this.mUploadRecoverPopView.dismiss();
            this.mUploadRecoverPopView = null;
        }
    }

    public void showLivePublishFailedPopwindow(final FragmentActivity fragmentActivity, final String str) {
        if (this.liveActivity == null || this.liveActivity.isFinishing()) {
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                fragmentActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        new C45208q(fragmentActivity, str);
                    }
                });
            }
            return;
        }
        this.liveActivity.runOnUiThread(new Runnable() {
            public void run() {
                new C45208q(AVPublishServiceImpl.this.liveActivity, str);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$setLiveThumCallback$3$AVPublishServiceImpl(long j, long j2) throws Exception {
        Keva repo = Keva.getRepo("live_publish_repo");
        for (Entry entry : repo.getAll().entrySet()) {
            JSONObject jSONObject = new JSONObject((String) entry.getValue());
            if (j - jSONObject.optLong("time") >= j2) {
                repo.erase((String) entry.getKey());
            } else {
                this.liveThumCallback.onCallback((String) entry.getKey(), jSONObject.optString("video_thum_url"));
            }
        }
        return null;
    }

    public void setCurMusic(MusicModel musicModel, Boolean bool) {
        if (bool.booleanValue()) {
            if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
                C43214dh.m94817a().mo87857g();
            } else {
                C43214dh.m94817a().mo87850a(C39618d.f101168i.mo80565a(musicModel.getMusic().getChallenge()));
            }
        }
        C43214dh.m94817a().mo50200a(C39618d.f101168i.mo80566a(musicModel));
    }

    public void tryRestorePublish(FragmentActivity fragmentActivity, C52671b<Boolean, Void> bVar) {
        if (!isPublishing()) {
            if (isPublishServiceRunning(fragmentActivity)) {
                C47625i.m103103a("continue publish");
                C50203g.m108363d("PublishServiceImpl continue publish");
                C9220a.m18310a("AVPublishServiceImpl !isPublishing() isPublishServiceRunning");
                if (C23763a.m58315a().f63349a) {
                    C39618d.f101162c.mo74147a(fragmentActivity);
                } else {
                    fragmentActivity.bindService(new Intent(fragmentActivity, ShortVideoPublishService.class), C39618d.f101162c.mo74155b(fragmentActivity), 1);
                }
            } else {
                C0013i.m18a(AVPublishServiceImpl$$Lambda$0.$instance, (Executor) C46797a.m101642a()).mo20a((C0011g<TResult, TContinuationResult>) new AVPublishServiceImpl$$Lambda$1<TResult,TContinuationResult>(bVar), C0013i.f25b);
            }
        }
    }

    public void showLivePublishSuccessPopwindow(final FragmentActivity fragmentActivity, final String str, final String str2) {
        if (this.liveActivity == null || this.liveActivity.isFinishing()) {
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                fragmentActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        new C45209r(fragmentActivity, str, str2);
                    }
                });
            }
            return;
        }
        this.liveActivity.runOnUiThread(new Runnable() {
            public void run() {
                new C45209r(AVPublishServiceImpl.this.liveActivity, str, str2);
            }
        });
    }

    public void startLivePublishActivity(Context context, Intent intent, onLivePublishCallback onlivepublishcallback) {
        this.liveActivity = (FragmentActivity) context;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LayoutParams(-1, -1));
        imageView.setImageResource(R.drawable.cd3);
        C10643a b = new C10643a(context).mo18896a(false).mo18886a((int) R.string.g15, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (AVPublishServiceImpl.this.liveDialog != null && AVPublishServiceImpl.this.liveDialog.mo18881a()) {
                    AVPublishServiceImpl.this.liveDialog.dismiss();
                }
            }
        }).mo18885a((int) R.string.h5o).mo18899b((int) R.string.g16);
        b.f28289t = imageView;
        this.liveDialog = b.mo18905b(false).mo18897a();
        this.livePublishCallback = onlivepublishcallback;
        intent.setClass(context, LivePublishActivity.class);
        context.startActivity(intent);
    }
}
