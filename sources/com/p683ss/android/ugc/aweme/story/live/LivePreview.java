package com.p683ss.android.ugc.aweme.story.live;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.p1803i.C33088b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.story.live.LivePreview */
public class LivePreview implements C0183j, C33088b {

    /* renamed from: a */
    private View f117641a = View.inflate(this.f117644d, R.layout.bl9, null);

    /* renamed from: b */
    private View f117642b;

    /* renamed from: c */
    private C46650k f117643c;

    /* renamed from: d */
    private AbsActivity f117644d;

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
    }

    public LivePreview(AbsActivity absActivity) {
        this.f117644d = absActivity;
        this.f117643c = new C46650k(absActivity, this.f117641a);
        this.f117642b = this.f117641a.findViewById(R.id.ce0);
        absActivity.getLifecycle().mo324a(this);
    }
}
