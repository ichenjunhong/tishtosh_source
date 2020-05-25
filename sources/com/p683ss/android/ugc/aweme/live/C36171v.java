package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.live.sdk.chatroom.p1925ui.C36156a;
import com.p683ss.android.ugc.aweme.live.sdk.chatroom.p1925ui.TTLiveBroadcastView;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.port.internal.C39655e.C39656a;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

/* renamed from: com.ss.android.ugc.aweme.live.v */
public final class C36171v implements C39655e {

    /* renamed from: a */
    public C36156a f92609a;

    /* renamed from: b */
    public volatile boolean f92610b;

    /* renamed from: b */
    public final ImageView mo74815b() {
        C36156a aVar = this.f92609a;
        return null;
    }

    /* renamed from: a */
    public final View mo74809a() {
        return this.f92609a.mo74879a();
    }

    /* renamed from: a */
    public final void mo74813a(C39656a aVar) {
        if (this.f92609a != null) {
            this.f92609a.mo74882a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo74811a(final ViewGroup viewGroup) {
        if (this.f92609a != null && this.f92610b) {
            this.f92609a.mo74887c();
            this.f92610b = false;
            viewGroup.postDelayed(new Runnable() {
                public final void run() {
                    if (viewGroup != null && !C36171v.this.f92610b) {
                        viewGroup.removeView(C36171v.this.f92609a.mo74879a());
                    }
                }
            }, 300);
        }
    }

    /* renamed from: a */
    public final void mo74814a(View... viewArr) {
        if (this.f92609a != null) {
            this.f92609a.mo74883a(viewArr);
        }
    }

    /* renamed from: a */
    public final void mo74810a(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        if (this.f92609a == null && Live.getService() != null) {
            this.f92609a = new TTLiveBroadcastView(context, iRecordingOperationPanel);
        }
    }

    /* renamed from: a */
    public final void mo74812a(ViewGroup viewGroup, Bundle bundle) {
        if (this.f92609a != null) {
            viewGroup.removeAllViews();
            this.f92610b = true;
            viewGroup.addView(this.f92609a.mo74879a());
            this.f92609a.mo74885b();
        }
    }
}
