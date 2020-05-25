package com.p683ss.android.ugc.aweme.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33206p;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.main.ShowPublishProcessActivity */
public class ShowPublishProcessActivity extends FragmentActivity {

    /* renamed from: a */
    private boolean f93529a;

    /* renamed from: a */
    private FragmentActivity m82391a() {
        return this;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.ShowPublishProcessActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    public void onPause() {
        super.onPause();
        this.f93529a = false;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.ShowPublishProcessActivity", "onResume", true);
        super.onResume();
        this.f93529a = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.ShowPublishProcessActivity", "onResume", false);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m82392a(getIntent(), false);
    }

    @C53771m
    public void onHideUploadRecoverEvent(C43890d dVar) {
        boolean z = dVar.f111146a;
        if (this.f93529a) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().hideUploadRecoverWindow(m82391a(), z);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.ShowPublishProcessActivity", "onCreate", true);
        super.onCreate(bundle);
        C47718bf.m103290c(this);
        setContentView(R.layout.buw);
        m82392a(getIntent(), true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.ShowPublishProcessActivity", "onCreate", false);
    }

    @C53771m
    public void onPublishStatusUpdate(C43891e eVar) {
        if (eVar.f111148b != 2) {
            if (eVar.f111148b == 10) {
                C10691a.m21552c((Context) this, "视频发布成功", 1).mo19066a();
            } else if (eVar.f111148b == 9) {
                if (!eVar.f111152f || !this.f93529a) {
                    C10691a.m21552c((Context) this, "视频发布失败，已保存草稿", 1).mo19066a();
                } else {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().showUploadRecoverIfNeed(eVar.f111153g, m82391a());
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m82392a(Intent intent, boolean z) {
        int i;
        boolean z2;
        boolean processPublish = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().processPublish(m82391a(), intent);
        if (!processPublish) {
            return false;
        }
        Bundle bundleExtra = intent.getBundleExtra("publish_bundle");
        if (bundleExtra != null) {
            i = bundleExtra.getInt("publish_private_state", 0);
        } else {
            i = 0;
        }
        IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bridgeService_Monster.setCurrentVideoPublicState(z2);
        boolean hasExtra = intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT");
        if (!processPublish || hasExtra) {
            C33206p.m76303c().mo70457a(500);
        } else {
            C33206p.m76303c();
            C33206p.m76302b();
        }
        C45407ay.m98968a(C2240a.m6773a(Locale.US, "Publish from Live ProcessPublish isPublishVideo:%b isSaveDraft:%b isOnCreate:%b", new Object[]{Boolean.valueOf(processPublish), Boolean.valueOf(hasExtra), Boolean.valueOf(z)}));
        return true;
    }
}
