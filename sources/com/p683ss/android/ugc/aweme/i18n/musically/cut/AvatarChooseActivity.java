package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f.C33146b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity */
public class AvatarChooseActivity extends AmeActivity implements OnClickListener, Callback {

    /* renamed from: a */
    public IVideoChoose f85965a;

    /* renamed from: b */
    private ImmersionBar f85966b;

    /* renamed from: c */
    private boolean f85967c;
    @BindView(2131493056)
    View mBackBtn;
    @BindView(2131494819)
    View mStatusBarView;
    @BindView(2131494930)
    TextView mTitleView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f85966b != null) {
            this.f85966b.destroy();
        }
    }

    public void setStatusBarColor() {
        this.f85966b = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f85966b.init();
        }
        C23729p.m58263b((Activity) this);
        C23729p.m58269c((Activity) this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", true);
        super.onResume();
        if (!this.f85967c && this.f85965a != null) {
            this.f85967c = true;
            this.f85965a.loadData();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.mBackBtn) {
            finish();
        }
    }

    public void onData(String str) {
        C33141f fVar = new C33141f();
        fVar.f86037a = new C33146b() {
            /* renamed from: a */
            public final void mo70152a(Intent intent) {
                AvatarChooseActivity.this.setResult(-1, intent);
                AvatarChooseActivity.this.finish();
            }
        };
        C47705a aVar = new C47705a(this);
        Intent intent = new Intent(this, AvatarCutActivity.class);
        intent.putExtra("file_path", str);
        aVar.mo94988a(intent, 3, fVar);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bof);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.mTitleView.setText(R.string.c8w);
        this.mBackBtn.setOnClickListener(this);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C33136a(this, getSupportFragmentManager().mo2222a((int) R.id.eom)));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", false);
    }
}
