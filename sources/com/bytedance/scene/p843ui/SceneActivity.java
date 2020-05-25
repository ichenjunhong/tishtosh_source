package com.bytedance.scene.p843ui;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12935m;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.bytedance.scene.ui.SceneActivity */
public abstract class SceneActivity extends AppCompatActivity {

    /* renamed from: a */
    private C12935m f33971a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Class<? extends C12924i> mo24565a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo24566b();

    public void onBackPressed() {
        if (!this.f33971a.mo24327a()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER);
        }
        this.f33971a = C12921h.m25903a((Activity) this, mo24565a()).mo24452a(mo24566b()).mo24453a();
    }
}
