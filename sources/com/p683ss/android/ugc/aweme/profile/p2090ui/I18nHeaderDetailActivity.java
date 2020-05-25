package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f.C33145a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity */
public final class I18nHeaderDetailActivity extends HeaderDetailActivity {

    /* renamed from: d */
    public boolean f102282d;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity$a */
    static final class C40103a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nHeaderDetailActivity f102283a;

        C40103a(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f102283a = i18nHeaderDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                I18nHeaderDetailActivity i18nHeaderDetailActivity = this.f102283a;
                new C33141f().mo70183a(i18nHeaderDetailActivity, new C40104b(i18nHeaderDetailActivity));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity$b */
    static final class C40104b implements C33145a {

        /* renamed from: a */
        final /* synthetic */ I18nHeaderDetailActivity f102284a;

        C40104b(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f102284a = i18nHeaderDetailActivity;
        }

        /* renamed from: a */
        public final void mo70187a(String str) {
            this.f102284a.mo82234c(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo82132c() {
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    public final void mo82133d() {
        super.mo82133d();
        this.f102282d = getIntent().getBooleanExtra("handle_with_video_avatar", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo82130b() {
        if (this.f102282d) {
            new C11105a(this).mo20142a((CharSequence[]) getResources().getStringArray(R.array.b9), (OnClickListener) new C40103a(this)).mo20143a().show();
        } else {
            super.mo82130b();
        }
    }

    /* renamed from: c */
    public final void mo82234c(String str) {
        Uri uri;
        try {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            uri = Uri.parse(sb.toString());
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            C13771c.m27875c().mo26191b(uri);
            mo82129a(this.userAvatar, false, uri.toString());
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.agw);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getResources().getColor(R.color.a3t));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", false);
    }
}
