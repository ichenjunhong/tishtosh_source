package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.view.MaxWidthSupportRecyclerView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.o */
final /* synthetic */ class C6689o implements Runnable {

    /* renamed from: a */
    private final LiveRoomTopBelowWidget f18259a;

    C6689o(LiveRoomTopBelowWidget liveRoomTopBelowWidget) {
        this.f18259a = liveRoomTopBelowWidget;
    }

    public final void run() {
        LiveRoomTopBelowWidget liveRoomTopBelowWidget = this.f18259a;
        if (liveRoomTopBelowWidget.f18026b != null && liveRoomTopBelowWidget.f18027c != null && liveRoomTopBelowWidget.f18028d != null) {
            MaxWidthSupportRecyclerView maxWidthSupportRecyclerView = liveRoomTopBelowWidget.f18026b;
            ViewGroup viewGroup = liveRoomTopBelowWidget.f18027c;
            int width = liveRoomTopBelowWidget.f18028d.getWidth();
            int a = C9432q.m18670a(liveRoomTopBelowWidget.getContext());
            int b = (int) C9432q.m18687b(liveRoomTopBelowWidget.getContext(), 14.0f);
            int b2 = (int) C9432q.m18687b(liveRoomTopBelowWidget.getContext(), 19.0f);
            int width2 = liveRoomTopBelowWidget.f18028d.getWidth() - maxWidthSupportRecyclerView.getWidth();
            C9432q.m18679a((View) liveRoomTopBelowWidget.f18028d, -2, -3);
            if (a - width <= b + b2 + 1) {
                C9432q.m18679a((View) liveRoomTopBelowWidget.f18028d, (a - b) - b2, -3);
                C9432q.m18679a((View) viewGroup, b, -3);
            } else {
                C9432q.m18679a((View) viewGroup, viewGroup.getWidth(), -3);
            }
            liveRoomTopBelowWidget.f18031g = LiveRoomTopBelowWidget.m14014a(liveRoomTopBelowWidget.f18028d, liveRoomTopBelowWidget.f18028d.getWidth(), LiveRoomTopBelowWidget.m14013a(maxWidthSupportRecyclerView, ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() > 1 ? 4.5f : 3.0f) + width2, new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LiveRoomTopBelowWidget.this.mo12729a();
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    C9432q.m18691b(LiveRoomTopBelowWidget.this.contentView, 0);
                }
            });
            liveRoomTopBelowWidget.f18031g.start();
            int width3 = viewGroup.getWidth();
            int a2 = LiveRoomTopBelowWidget.m14013a(viewGroup, 2.14748365E9f);
            if (width3 < a2) {
                liveRoomTopBelowWidget.f18032h = LiveRoomTopBelowWidget.m14014a(viewGroup, width3, a2, new AnimatorListenerAdapter(viewGroup) {

                    /* renamed from: a */
                    final /* synthetic */ ViewGroup f18039a;

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C9432q.m18679a((View) this.f18039a, -2, -3);
                    }

                    {
                        this.f18039a = r2;
                    }
                });
                liveRoomTopBelowWidget.f18032h.start();
            }
        }
    }
}
