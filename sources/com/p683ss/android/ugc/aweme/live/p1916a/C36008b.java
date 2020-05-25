package com.p683ss.android.ugc.aweme.live.p1916a;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.p1715ab.LiveAudioAnimationResource;
import com.p683ss.android.ugc.aweme.feed.p1715ab.LiveAudioBgList;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.live.a.b */
public final class C36008b implements OnAttachStateChangeListener {

    /* renamed from: i */
    public static final C36009a f92287i = new C36009a(null);

    /* renamed from: a */
    public final ViewGroup f92288a = ((ViewGroup) this.f92296j.findViewById(R.id.dy7));

    /* renamed from: b */
    public final SmartImageView f92289b = ((SmartImageView) this.f92296j.findViewById(R.id.dy5));

    /* renamed from: c */
    public final SmartImageView f92290c = ((SmartImageView) this.f92296j.findViewById(R.id.dy6));

    /* renamed from: d */
    public final SmartImageView f92291d = ((SmartImageView) this.f92296j.findViewById(R.id.dy4));

    /* renamed from: e */
    public final String f92292e;

    /* renamed from: f */
    public final List<String> f92293f;

    /* renamed from: g */
    public LiveRoomStruct f92294g;

    /* renamed from: h */
    public boolean f92295h;

    /* renamed from: j */
    private final View f92296j;

    /* renamed from: com.ss.android.ugc.aweme.live.a.b$a */
    public static final class C36009a {
        private C36009a() {
        }

        public /* synthetic */ C36009a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo74745c() {
        LiveRoomStruct liveRoomStruct = this.f92294g;
        if (liveRoomStruct == null || !liveRoomStruct.liveTypeAudio || !this.f92295h) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo74743a() {
        SmartImageView smartImageView = this.f92291d;
        if (smartImageView != null) {
            smartImageView.setUserVisibleHint(false);
        }
        SmartImageView smartImageView2 = this.f92291d;
        if (smartImageView2 != null) {
            smartImageView2.mo23138c();
        }
    }

    /* renamed from: b */
    public final void mo74744b() {
        if (mo74745c()) {
            SmartImageView smartImageView = this.f92291d;
            if (smartImageView != null) {
                smartImageView.setUserVisibleHint(true);
            }
            SmartImageView smartImageView2 = this.f92291d;
            if (smartImageView2 != null) {
                smartImageView2.mo23137b();
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        SmartImageView smartImageView = this.f92291d;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        SmartImageView smartImageView = this.f92291d;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
        }
    }

    public C36008b(View view) {
        C52711k.m112240b(view, "itemView");
        this.f92296j = view;
        String a = C10193n.m20607a().mo18203a(LiveAudioAnimationResource.class, "live_audio_animation_resource", C10181b.m20511a().mo18175c().getLiveAudioAnimationResource(), "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/ttlive/webp/audio_live.webp");
        C52711k.m112236a((Object) a, "SettingsManager.getInsta…tionResource::class.java)");
        this.f92292e = a;
        this.f92293f = LiveAudioBgList.get();
        this.f92296j.addOnAttachStateChangeListener(this);
    }
}
