package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.uikit.p257c.C4206c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dk */
final /* synthetic */ class C6530dk implements Runnable {

    /* renamed from: a */
    private final C63131 f17853a;

    /* renamed from: b */
    private final int f17854b;

    C6530dk(C63131 r1, int i) {
        this.f17853a = r1;
        this.f17854b = i;
    }

    public final void run() {
        C63131 r0 = this.f17853a;
        int i = this.f17854b;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            if (LiveRoomNotifyWidget.this.f17269c.getScrollX() != 0 && C4206c.m10426a(LiveRoomNotifyWidget.this.context)) {
                i = LiveRoomNotifyWidget.this.f17269c.getScrollX() - i;
            }
            ObjectAnimator duration = ObjectAnimator.ofInt(LiveRoomNotifyWidget.this.f17269c, "scrollX", new int[]{i}).setDuration(2000);
            duration.setInterpolator(new LinearInterpolator());
            duration.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    View view = LiveRoomNotifyWidget.this.contentView;
                    C6531dl dlVar = new C6531dl(this);
                    long j = 500;
                    if (LiveRoomNotifyWidget.this.f17275i > 2000) {
                        j = 500 + (LiveRoomNotifyWidget.this.f17275i - 2000);
                    }
                    view.postDelayed(dlVar, j);
                }
            });
            duration.start();
        }
    }
}
