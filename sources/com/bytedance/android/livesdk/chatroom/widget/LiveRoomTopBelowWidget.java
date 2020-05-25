package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.os.Message;
import android.support.p030v4.view.p042b.C1027f;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.view.C6238d;
import com.bytedance.android.livesdk.chatroom.view.MaxWidthSupportRecyclerView;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget.C6637a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.trill.R;

public class LiveRoomTopBelowWidget extends LiveRecyclableWidget implements C9382a {

    /* renamed from: a */
    ViewGroup f18025a;

    /* renamed from: b */
    MaxWidthSupportRecyclerView f18026b;

    /* renamed from: c */
    ViewGroup f18027c;

    /* renamed from: d */
    FrameLayout f18028d;

    /* renamed from: e */
    public boolean f18029e = true;

    /* renamed from: f */
    public LiveRoomWatchUserWidget f18030f;

    /* renamed from: g */
    Animator f18031g;

    /* renamed from: h */
    Animator f18032h;

    /* renamed from: i */
    public boolean f18033i;

    /* renamed from: j */
    public C9381g f18034j = new C9381g(this);

    /* renamed from: k */
    private LiveRoomTopContainerWidget f18035k;

    public int getLayoutId() {
        return R.layout.anz;
    }

    public void handleMsg(Message message) {
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onUnload() {
        if (this.f18032h != null) {
            this.f18032h.cancel();
        }
        if (this.f18031g != null) {
            this.f18031g.cancel();
        }
        if (this.f18032h != null) {
            this.f18032h.cancel();
        }
        if (this.f18031g != null) {
            this.f18031g.cancel();
        }
        if (this.f18034j != null) {
            this.f18034j.removeCallbacksAndMessages(null);
        }
        this.f18029e = false;
        this.f18033i = false;
        if (this.f18026b != null) {
            this.f18026b.setEnable(false);
        }
    }

    /* renamed from: a */
    public final void mo12729a() {
        int i;
        int i2;
        if (this.f18028d != null && this.f18026b != null) {
            int width = this.f18028d.getWidth() - this.f18026b.getWidth();
            int a = m14013a(this.f18026b, 1.0f);
            if (this.context != null) {
                int b = (int) C9432q.m18687b(this.context, 28.0f);
                if (a < b) {
                    a = b;
                }
            }
            if (width > 0) {
                i = 1;
            } else {
                i = 3;
            }
            int i3 = i * a;
            if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() > 1) {
                i2 = (int) (((float) a) * 4.5f);
            } else {
                i2 = a * 3;
            }
            int i4 = i2 + width + i3;
            if (this.f18026b != null) {
                this.f18026b.setEnable(true);
                if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() > 1) {
                    this.f18026b.setMaxItem(4.5f);
                }
                this.f18026b.requestLayout();
            }
            C9432q.m18679a((View) this.f18028d, i4, -3);
            this.f18033i = false;
            this.dataCenter.lambda$put$1$DataCenter("cmd_vote_start_animation", Integer.valueOf((int) this.containerView.getY()));
        }
    }

    public void onInit(Object... objArr) {
        this.f18025a = (ViewGroup) this.contentView.findViewById(R.id.ba_);
        this.f18028d = (FrameLayout) this.contentView.findViewById(R.id.dtv);
    }

    public void onLoad(Object... objArr) {
        enableSubWidgetManager();
        C9432q.m18679a((View) this.f18028d, -2, -3);
        this.f18030f = (LiveRoomWatchUserWidget) ((RecyclableWidgetManager) this.subWidgetManager).load((ViewGroup) this.f18028d, LiveRoomWatchUserWidget.class, false, (Object[]) null);
        this.f18035k = (LiveRoomTopContainerWidget) ((RecyclableWidgetManager) this.subWidgetManager).load(this.f18025a, LiveRoomTopContainerWidget.class, false, (Object[]) null);
        if (!(this.f18035k == null || this.containerView == null)) {
            this.f18035k.mo12736a((ViewGroup) this.containerView.getParent());
        }
        this.f18029e = false;
        this.f18033i = false;
        if (this.f18026b != null) {
            this.f18026b.setEnable(false);
        }
        C9432q.m18691b(this.contentView, 4);
        this.f18030f.f18110f = new C6637a() {
            /* renamed from: a */
            public final boolean mo12731a() {
                return LiveRoomTopBelowWidget.this.f18033i;
            }

            /* renamed from: a */
            public final void mo12730a(int i) {
                if (!LiveRoomTopBelowWidget.this.f18029e) {
                    LiveRoomTopBelowWidget.this.f18034j.postDelayed(new Runnable() {
                        public final void run() {
                            LiveRoomTopBelowWidget liveRoomTopBelowWidget = LiveRoomTopBelowWidget.this;
                            liveRoomTopBelowWidget.f18033i = true;
                            boolean z = false;
                            C9432q.m18691b(liveRoomTopBelowWidget.contentView, 0);
                            if (!(liveRoomTopBelowWidget.f18029e || liveRoomTopBelowWidget.getContext() == null || liveRoomTopBelowWidget.contentView == null)) {
                                RecyclerView recyclerView = (RecyclerView) liveRoomTopBelowWidget.contentView.findViewById(R.id.dtz);
                                if (recyclerView instanceof MaxWidthSupportRecyclerView) {
                                    liveRoomTopBelowWidget.f18026b = (MaxWidthSupportRecyclerView) recyclerView;
                                }
                                liveRoomTopBelowWidget.f18027c = (ViewGroup) liveRoomTopBelowWidget.f18025a.findViewById(R.id.dv7);
                                if (!(liveRoomTopBelowWidget.f18026b == null || liveRoomTopBelowWidget.f18026b.getChildCount() == 0)) {
                                    liveRoomTopBelowWidget.f18029e = true;
                                    if (liveRoomTopBelowWidget.f18026b.getChildCount() <= 3 || ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() > 1) {
                                        C9432q.m18679a((View) liveRoomTopBelowWidget.f18027c, -2, -3);
                                        liveRoomTopBelowWidget.mo12729a();
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                liveRoomTopBelowWidget.f18034j.postDelayed(new C6689o(liveRoomTopBelowWidget), 3000);
                            }
                        }
                    }, 400);
                }
            }
        };
        if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo9431a()).intValue() > 1) {
            C9432q.m18680a((View) this.containerView, -3, (int) C9432q.m18687b(C3922z.m9915e(), -8.0f), -3, -3);
        }
    }

    /* renamed from: a */
    static int m14013a(ViewGroup viewGroup, float f) {
        int i;
        int i2;
        int i3;
        int i4 = (int) f;
        float f2 = f % ((float) i4);
        if (viewGroup == null) {
            return 0;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount > i4) {
            i = i4;
        } else {
            i = childCount;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (childAt != null) {
                if (childAt instanceof C6238d) {
                    i3 = ((C6238d) childAt).getLayoutWidth();
                } else {
                    i3 = childAt.getWidth();
                }
                i5 += i3;
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i5 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
        }
        if (childCount <= i4 || f2 <= 0.0f) {
            return i5;
        }
        View childAt2 = viewGroup.getChildAt(i4);
        if (childAt2 instanceof C6238d) {
            i2 = ((C6238d) childAt2).getLayoutWidth();
        } else {
            i2 = childAt2.getWidth();
        }
        LayoutParams layoutParams2 = childAt2.getLayoutParams();
        int i7 = i5 + (i2 / 2);
        if (!(layoutParams2 instanceof MarginLayoutParams)) {
            return i7;
        }
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
        return i7 + ((marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) / 2);
    }

    /* renamed from: a */
    static Animator m14014a(ViewGroup viewGroup, int i, int i2, AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C6690p(viewGroup.getLayoutParams(), viewGroup));
        ofInt.addListener(animatorListener);
        ofInt.setDuration(520);
        ofInt.setInterpolator(C1027f.m2954a(0.0f, 0.0f, 0.0f, 1.0f));
        return ofInt;
    }
}
