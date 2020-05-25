package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1418i.C23548d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45392al;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;
import com.p683ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.superentrance.C53002a;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity */
public class VideoRecordPermissionActivity extends AbsActivity {

    /* renamed from: a */
    ToolSafeHandler f113808a = new ToolSafeHandler(this);

    /* renamed from: b */
    private boolean f113809b = true;

    /* renamed from: c */
    private Resources f113810c;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    static void m98267c() {
        C47858ep.m103511a("camera_error", "1");
    }

    public void onStart() {
        super.onStart();
        this.f113809b = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo91215d() {
        C39618d.f101150N.mo80676a(this, true, new C39598a() {
            public final void onSuccess() {
                VideoRecordPermissionActivity videoRecordPermissionActivity = VideoRecordPermissionActivity.this;
                C45412b.m98979a().step("av_video_record_init", "startVideoRecordActivity");
                if (videoRecordPermissionActivity.isFinishing() || videoRecordPermissionActivity.mStatusDestroyed || (VERSION.SDK_INT >= 17 && videoRecordPermissionActivity.isDestroyed())) {
                    C47858ep.m103511a("camera_error", "2");
                    return;
                }
                C18842a.m45932a(C45159db.f114273a);
                new C43854fw();
                C39618d.m88210a(C43854fw.m96287a());
                C45435f.m99014a((Activity) videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), (C52671b<List<Bundle>, C52860x>) new C45160dc<List<Bundle>,C52860x>(videoRecordPermissionActivity));
                C39618d.f101167h.mo74215a(videoRecordPermissionActivity.getApplicationContext());
            }
        });
    }

    public void onPause() {
        super.onPause();
        C47835dx.f120393a = getClass();
    }

    /* renamed from: f */
    private static boolean m98268f() {
        C39527aa aaVar = C39618d.f101183x;
        if (aaVar == null || aaVar.mo74285e() == null) {
            return false;
        }
        return aaVar.mo74285e().mo46169m();
    }

    /* renamed from: g */
    private static IStoryRecordService m98269g() {
        Object a = C27991b.m66756a(IStoryRecordService.class);
        if (a != null) {
            return (IStoryRecordService) a;
        }
        return (IStoryRecordService) C20302a.m50070a(IStoryRecordService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    public Resources getResources() {
        C45392al.m98950a(this, this.f113809b);
        if (!C23548d.m57745a(this, this.f113809b)) {
            return super.getResources();
        }
        if (this.f113810c == null) {
            this.f113810c = new C23548d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        }
        return this.f113810c;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        this.f113809b = true;
        if (C45392al.m98951b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
            return;
        }
        super.onResume();
        C45392al.m98949a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo91214b() {
        if (m98264a((Context) this)) {
            this.f113808a.mo91703a(new C45154cy(this));
        } else if (C39618d.f101145I.mo58605c().mo49437a()) {
            C53002a.m112725a((Context) this);
            C39618d.f101144H.mo58572c().mo49436a(this, new C45155cz(this), "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            this.f113808a.mo91703a(new C45158da(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo91216e() {
        boolean z = false;
        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            String str = strArr[i];
            if (C39618d.f101145I.mo58605c().mo49435a((Context) this, str) == -1 && !C39618d.f101145I.mo58605c().mo49438a((Activity) this, str)) {
                z = true;
                break;
            }
            i++;
        }
        Dialog b = new C10643a(this).mo18899b((int) R.string.kb).mo18900b((int) R.string.wf, (OnClickListener) new C45161dd(this)).mo18886a((int) R.string.ah4, (OnClickListener) new C45162de(this, z)).mo18897a().mo18882b();
        b.setOnCancelListener(new C45163df(this));
        C47700ay.m103235a(b);
    }

    /* renamed from: a */
    public final void mo91213a() {
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            C47858ep.m103512a("camera_error", "2", "recording");
            finish();
        } else if (C39618d.m88214c()) {
            C10691a.m21542b(getApplicationContext(), (int) R.string.d69).mo19066a();
            C47858ep.m103512a("camera_error", "2", "living");
            finish();
        } else if (!m98266b(getIntent()) || !C39618d.m88212a()) {
            IStoryRecordService g = m98269g();
            if ((!m98265a(getIntent()) && !m98266b(getIntent()) && C39618d.m88212a() && !booleanExtra2) || (g != null && g.isStoryRecording())) {
                StringBuilder sb = new StringBuilder("Recording status:");
                sb.append(C39618d.m88213b());
                sb.append(" recreatedSupport: ");
                sb.append(booleanExtra2);
                C50203g.m108358a(sb.toString());
                C23569o.m57779a("record", C23088c.m56631a().mo47824a("event", "isRecording").mo47824a("user_info", C39618d.m88213b()).mo47825b());
                if (m98268f()) {
                    C10691a.m21542b(getApplicationContext(), (int) R.string.d69).mo19066a();
                    C47858ep.m103512a("camera_error", "2", "recording");
                } else {
                    C10691a.m21542b(getApplicationContext(), (int) R.string.b5p).mo19066a();
                    C47858ep.m103512a("camera_error", "2", "recording");
                }
                finish();
            } else if (!C43214dh.m94817a().mo87852a((Context) this)) {
                C23569o.m57779a("record", C23088c.m56631a().mo47824a("event", "isPublishing").mo47825b());
                C47858ep.m103512a("camera_error", "2", "publishing");
                finish();
            } else {
                mo91214b();
            }
        } else {
            C47858ep.m103512a("camera_error", "2", "recording");
            finish();
        }
    }

    /* renamed from: b */
    public static boolean m98266b(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        if (m98266b(intent)) {
            mo91214b();
        }
    }

    /* renamed from: a */
    public static boolean m98265a(Intent intent) {
        if (intent == null || !"main".equals(intent.getStringExtra("from"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m98264a(Context context) {
        int c = C39618d.f101145I.mo58605c().mo49440c(context);
        int b = C39618d.f101145I.mo58605c().mo49439b(context);
        int a = C39618d.f101145I.mo58605c().mo49434a(context);
        if (c == 0 && b == 0 && a == 0) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        C45412b.m98979a().start("av_video_record_init", "startToolPermissionActivity");
        mo91213a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }
}
