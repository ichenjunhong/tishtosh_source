package com.p683ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28216c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.live.C36096i;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.story.model.C46656b;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47717be;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.port.internal.a */
public final class C39651a {

    /* renamed from: a */
    private FragmentActivity f101219a;

    /* renamed from: b */
    private boolean f101220b;

    /* renamed from: c */
    private boolean f101221c;

    /* renamed from: d */
    private boolean f101222d;

    /* renamed from: a */
    public static void m88325a() {
        C47718bf.m103288a(new C43891e(2));
    }

    /* renamed from: b */
    private static boolean m88326b() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity instanceof C36096i) {
                return true;
            }
        }
        return false;
    }

    public C39651a(FragmentActivity fragmentActivity) {
        boolean z;
        this.f101219a = fragmentActivity;
        if (!(fragmentActivity instanceof MainActivity)) {
            z = true;
        } else {
            z = false;
        }
        this.f101220b = z;
        this.f101221c = fragmentActivity instanceof C36096i;
        this.f101222d = fragmentActivity.getClass().equals(AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoPublishActivityClass());
    }

    /* renamed from: a */
    public final void mo80727a(C43856fy fyVar, int i, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder("onError ");
        sb.append(i);
        sb.append(" and args is ");
        sb.append(obj);
        C32458a.m75144a(sb.toString());
        FragmentActivity fragmentActivity = this.f101219a;
        C47718bf.m103288a(new C46656b(1, null, null, null));
        if (fyVar.isCauseByApiServerException()) {
            str = ((C23459a) fyVar.getCause()).getErrorMsg();
        } else {
            str = null;
        }
        if (i != 5) {
            if (fyVar.isCauseByNoSpaceLeft()) {
                str = fragmentActivity.getString(R.string.ar9);
            } else if (fyVar.isUserNetworkBad()) {
                str = fragmentActivity.getString(R.string.dnc);
            } else if (TextUtils.isEmpty(str)) {
                str = fragmentActivity.getString(R.string.d0v);
            }
            C43891e eVar = new C43891e(9, 99, null, str);
            eVar.f111152f = fyVar.isRecover();
            eVar.f111153g = fyVar.isCauseByApiServerException();
            if (this.f101221c && m88326b()) {
                eVar.f111157k = true;
            } else if (this.f101221c || this.f101222d) {
                eVar.f111158l = true;
            }
            C47718bf.m103288a(eVar);
        } else if (TextUtils.isEmpty(str)) {
            str = fragmentActivity.getString(R.string.f8b);
        }
        if (!this.f101221c && !this.f101222d && this.f101220b) {
            C10691a.m21546b(fragmentActivity.getApplicationContext(), str, 0).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo80726a(CreateAwemeResponse createAwemeResponse, int i, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder("onSuccess ");
        sb.append(i);
        sb.append(" and response is ");
        sb.append(createAwemeResponse.status_code);
        sb.append(" extra is ");
        sb.append(createAwemeResponse.extra);
        C32458a.m75144a(sb.toString());
        Aweme aweme = createAwemeResponse.aweme;
        C47718bf.m103288a(new C46656b(0, null, null, null));
        C46656b bVar = new C46656b(2, null, null, aweme);
        bVar.f117684g = createAwemeResponse.notify;
        bVar.f117685h = createAwemeResponse.notifyExtra;
        boolean z = obj instanceof BaseShortVideoContext;
        if (z) {
            bVar.f117683f = ((BaseShortVideoContext) obj).mSyncPlatforms;
        } else if (obj instanceof PhotoContext) {
            bVar.f117683f = ((PhotoContext) obj).mSyncPlatforms;
        }
        if (createAwemeResponse.isReviewVideo == 1 || createAwemeResponse.hasStickerRedPacket) {
            bVar.f117684g = new String[0];
            bVar.f117683f = null;
            bVar.f117685h = null;
        }
        C47718bf.m103288a(bVar);
        C47718bf.m103289b(new C30332aw(15, aweme));
        C47717be.m103287a();
        StringBuilder sb2 = new StringBuilder("result is ");
        sb2.append(aweme);
        C32458a.m75144a(sb2.toString());
        if (aweme == null) {
            StringBuilder sb3 = new StringBuilder("videoType:");
            sb3.append(i);
            sb3.append("response: ");
            sb3.append(createAwemeResponse.status_code);
            sb3.append(" ");
            sb3.append(createAwemeResponse.extra);
            C23131p.m57779a("aweme_publish_error", C23088c.m56631a().mo47824a("user_info", sb3.toString()).mo47825b());
        }
        if (z) {
            C28216c.m67126a((BaseShortVideoContext) obj);
        }
        if (i != 0) {
            switch (i) {
                case 5:
                    PhotoContext photoContext = (PhotoContext) obj;
                    Intent intent = new Intent(this.f101219a, AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getApplicationService().mo74158d());
                    intent.setFlags(335544320);
                    intent.putExtra("aweme", aweme);
                    intent.putExtra("aweme_response", createAwemeResponse);
                    intent.putExtra("photoContext", photoContext);
                    intent.putExtra("video_type", 5);
                    this.f101219a.startActivity(intent);
                    return;
                case 6:
                    LocalVideoPlayerManager.m104046a().mo95313a(((PhotoMovieContext) obj).mOutputVideoPath, aweme);
                    C43891e eVar = new C43891e(10, 100, aweme);
                    eVar.f111154h = createAwemeResponse;
                    C47718bf.m103288a(eVar);
                    break;
            }
            return;
        }
        VideoExposureData convertToExposureData = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().convertToExposureData(obj);
        LocalVideoPlayerManager.m104046a().mo95313a(convertToExposureData.getOutPutFile(), aweme);
        C43891e eVar2 = new C43891e(10, 100, aweme);
        eVar2.f111154h = createAwemeResponse;
        if (C31361b.m73113a((Activity) this.f101219a, aweme)) {
            eVar2.f111155i = true;
        }
        eVar2.f111156j = convertToExposureData.getShootWay();
        if (this.f101221c && m88326b()) {
            eVar2.f111157k = true;
            C47718bf.m103288a(eVar2);
        } else if (this.f101221c || this.f101222d) {
            C47718bf.m103289b(eVar2);
        } else {
            if (eVar2.f111155i) {
                C47718bf.m103289b(eVar2);
            } else {
                C47718bf.m103288a(eVar2);
            }
            if (this.f101220b) {
                C10691a.m21543b(this.f101219a.getApplicationContext(), (int) R.string.f89, 0).mo19066a();
            }
        }
        String str2 = "video_publish_done";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", convertToExposureData.getCreationId());
        String str3 = "group_id";
        if (createAwemeResponse.aweme == null) {
            str = "";
        } else {
            str = createAwemeResponse.aweme.getAid();
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }
}
