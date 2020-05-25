package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.view.VolumeControlView;
import com.bytedance.android.livesdk.chatroom.view.VolumeControlView.C6234a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7708a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class VolumeWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public VolumeControlView f17657a;

    /* renamed from: b */
    private AnimatorSet f17658b;

    /* renamed from: c */
    private C6234a f17659c;

    public int getLayoutId() {
        return R.layout.as4;
    }

    public void onClick(View view) {
    }

    public void onEvent(C7708a aVar) {
    }

    public void onUnload() {
    }

    public void onInit(Object[] objArr) {
        this.f17657a = (VolumeControlView) this.containerView.findViewById(R.id.gy);
        this.f17659c = new C6234a() {
        };
    }

    public void onLoad(Object[] objArr) {
        if (this.f17657a != null) {
            this.f17657a.setOnAudioControlViewHideListener(this.f17659c);
            this.f17658b = new AnimatorSet();
            this.f17658b.play(this.f17657a.getHideVolumeAnim());
            this.f17658b.start();
            C4495a.m10823a().mo10300a(C7708a.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<C7708a>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    VolumeWidget.this.onEvent((C7708a) obj);
                }
            });
        }
    }
}
