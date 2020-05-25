package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity */
public final class ChooseVideoCategoryActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C45514a f114983a = new C45514a(null);

    /* renamed from: b */
    private VideoCategoryParam f114984b;

    /* renamed from: c */
    private AVETParameter f114985c;

    /* renamed from: d */
    private C45516a f114986d;

    /* renamed from: e */
    private HashMap f114987e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity$a */
    public static final class C45514a {
        private C45514a() {
        }

        public /* synthetic */ C45514a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity$b */
    public static final class C45515b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCategoryActivity f114988a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C45515b(ChooseVideoCategoryActivity chooseVideoCategoryActivity) {
            this.f114988a = chooseVideoCategoryActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f114988a.mo91783a();
        }
    }

    /* renamed from: a */
    private View m99162a(int i) {
        if (this.f114987e == null) {
            this.f114987e = new HashMap();
        }
        View view = (View) this.f114987e.get(Integer.valueOf(R.id.d10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.d10);
        this.f114987e.put(Integer.valueOf(R.id.d10), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
        mo91783a();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.q, R.anim.r);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    public final void mo91783a() {
        Intent intent = new Intent();
        String str = "KEY_VIDEO_CATEGORY_CHOOSE_RESULT";
        C45516a aVar = this.f114986d;
        VideoCategoryParam videoCategoryParam = null;
        if (aVar != null && aVar.f114994d.get()) {
            videoCategoryParam = aVar.f114992b;
        }
        setResult(-1, intent.putExtra(str, videoCategoryParam));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax4);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("KEY_VIDEO_DEFAULT_CATEGORY");
        if (!(parcelableExtra instanceof VideoCategoryParam)) {
            parcelableExtra = null;
        }
        this.f114984b = (VideoCategoryParam) parcelableExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("key_video_mob_param");
        if (serializableExtra != null) {
            this.f114985c = (AVETParameter) serializableExtra;
            ((NormalTitleBar) m99162a(R.id.d10)).setOnTitleBarClickListener(new C45515b(this));
            ((NormalTitleBar) m99162a(R.id.d10)).setStartBtnIcon(R.drawable.ccy);
            Activity activity = this;
            C52711k.m112240b(activity, "chooseVideoCategoryActivity");
            ImmersionBar.with(activity).statusBarColor((int) R.color.a0_).fitsSystemWindows(true).statusBarDarkFont(true).init();
            if (getSupportFragmentManager().mo2222a((int) R.id.ajf) == null) {
                VideoCategoryParam videoCategoryParam = this.f114984b;
                AVETParameter aVETParameter = this.f114985c;
                if (aVETParameter == null) {
                    C52711k.m112237a("mMobParam");
                }
                C52711k.m112240b(aVETParameter, "mobParam");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("KEY_VIDEO_DEFAULT_CATEGORY", videoCategoryParam);
                bundle2.putSerializable("key_video_mob_param", aVETParameter);
                C45516a aVar = new C45516a();
                aVar.setArguments(bundle2);
                this.f114986d = aVar;
                getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) aVar).mo2189b();
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
    }
}
