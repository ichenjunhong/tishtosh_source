package com.p683ss.android.ugc.aweme.guide;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.main.p1940d.p1941a.C36577a;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.guide.LiveBroadcastWarn */
public class LiveBroadcastWarn extends C36577a implements C0183j {

    /* renamed from: a */
    public View f85583a;

    /* renamed from: b */
    Fragment f85584b;

    /* renamed from: d */
    private boolean f85585d;

    /* renamed from: e */
    private boolean f85586e;

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        mo69820a();
    }

    public void dismiss() {
        mo69819a(null);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        mo69819a(null);
    }

    /* renamed from: a */
    public final void mo69820a() {
        if (!((Boolean) SharePrefCache.inst().getHasAlreadyShowBubble().mo47782d()).booleanValue() && !this.f85585d && !this.f85586e && (((Boolean) SharePrefCache.inst().getNewAnchorShowBubble().mo47782d()).booleanValue() || !C10193n.m20607a().mo18204a(LiveTakeBubbleSettings.class, "new_anchor_show_bubble", C10181b.m20511a().mo18175c().getNewAnchorShowBubble(), true))) {
            this.f85586e = true;
            SharePrefCache.inst().getHasAlreadyShowBubble().mo47776a(Boolean.valueOf(true));
            C0013i.m12a(2000).mo20a((C0011g<TResult, TContinuationResult>) new C32929a<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo69819a(C0013i<Void> iVar) {
        if (this.f85583a != null) {
            this.f85583a.clearAnimation();
            this.f85583a.setVisibility(8);
            this.f85583a.setBackground(null);
            ((ViewGroup) this.f93669c).removeView(this.f85583a);
            this.f85584b.getViewLifecycleOwner().getLifecycle().mo325b(this);
            this.f85584b = null;
        }
        return null;
    }

    public LiveBroadcastWarn(Fragment fragment, View view, boolean z) {
        super(view);
        this.f85585d = z;
        ViewGroup viewGroup = (ViewGroup) view;
        this.f85583a = LayoutInflater.from(view.getContext()).inflate(R.layout.bl_, viewGroup, false);
        viewGroup.addView(this.f85583a);
        this.f85584b = fragment;
        fragment.getViewLifecycleOwner().getLifecycle().mo324a(this);
    }
}
