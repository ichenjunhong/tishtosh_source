package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.sdk.activity.SSActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23725l;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43911c;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43911c.C43919a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.app.PushCameraBlurActivity */
public class PushCameraBlurActivity extends SSActivity {

    /* renamed from: a */
    private boolean f61176a;

    /* renamed from: b */
    private boolean f61177b;

    /* renamed from: c */
    private boolean f61178c;

    /* renamed from: d */
    private String f61179d;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo47309a() {
        if (this.f61177b) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C23039ay(this, new Builder().showStickerPanel(true).build()));
            return;
        }
        if (this.f61178c && !C23725l.m58233a(this.f61179d)) {
            C43911c cVar = new C43911c();
            cVar.f111196e = new C43919a() {
                /* renamed from: a */
                public final void mo47314a() {
                    PushCameraBlurActivity.this.finish();
                }

                /* renamed from: a */
                public final void mo47315a(String str) {
                    PushCameraBlurActivity.this.finish();
                }
            };
            cVar.mo89467a(this.f61179d, (Activity) this, "push");
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f61176a = intent.getBooleanExtra("show_dialog", false);
        this.f61177b = intent.getBooleanExtra("show_effect", false);
        this.f61178c = intent.getBooleanExtra("show_duet", false);
        this.f61179d = intent.getStringExtra("aid");
        if (this.f61176a) {
            setContentView((int) R.layout.e7);
            Dialog b = new C10643a(this).mo18885a((int) R.string.cly).mo18899b((int) R.string.clw).mo18900b((int) R.string.b_m, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PushCameraBlurActivity.this.finish();
                }
            }).mo18886a((int) R.string.hb, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PushCameraBlurActivity.this.mo47309a();
                    dialogInterface.dismiss();
                }
            }).mo18897a().mo18882b();
            b.setOnCancelListener(new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    PushCameraBlurActivity.this.finish();
                }
            });
            b.setCanceledOnTouchOutside(true);
            b.show();
        } else {
            mo47309a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
    }
}
