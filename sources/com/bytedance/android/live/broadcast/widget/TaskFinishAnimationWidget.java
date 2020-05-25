package com.bytedance.android.live.broadcast.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.broadcast.api.model.C3055a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4190i;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p398n.C8025a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p661d.p662a.C10632b;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements C9382a {

    /* renamed from: a */
    public TextView f10539a;

    /* renamed from: b */
    public AlphaAnimation f10540b;

    /* renamed from: c */
    public Runnable f10541c;

    /* renamed from: d */
    public AlphaAnimation f10542d;

    /* renamed from: e */
    public final C9381g f10543e = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: f */
    private LottieAnimationView f10544f;

    /* renamed from: g */
    private C1689b f10545g = new C1689b();

    public int getLayoutId() {
        return R.layout.bvc;
    }

    public void onUnload() {
        if (this.f10545g != null) {
            this.f10545g.mo6180a();
        }
        if (this.f10542d != null) {
            this.f10542d.cancel();
            this.f10542d = null;
        }
        if (this.f10540b != null) {
            this.f10540b.cancel();
            this.f10540b = null;
        }
        if (this.f10541c != null) {
            this.f10541c = null;
        }
    }

    public void onInit(Object[] objArr) {
        this.f10539a = (TextView) findViewById(R.id.f0y);
        this.f10544f = (LottieAnimationView) findViewById(R.id.f0x);
    }

    public void handleMsg(Message message) {
        if (message != null && message.what == 100 && (message.obj instanceof C8025a)) {
            C4190i lottiePlayService = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).getLottiePlayService();
            if (lottiePlayService != null) {
                lottiePlayService.startLotteryFullAnimation((C8025a) message.obj, this.f10544f, true);
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f10545g.mo6181a(C4495a.m10823a().mo10300a(C3055a.class).mo6545f((C1710e<? super T>) new C1710e<C3055a>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C3055a aVar = (C3055a) obj;
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                if (aVar != null && !TextUtils.isEmpty(aVar.f8932b)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.f8931a);
                    sb.append("\n");
                    sb.append(aVar.f8932b);
                    SpannableString spannableString = new SpannableString(sb.toString());
                    if (!TextUtils.isEmpty(aVar.f8931a)) {
                        spannableString.setSpan(new AbsoluteSizeSpan(C3922z.m9899a(11.0f)), 0, aVar.f8931a.length(), 18);
                    }
                    taskFinishAnimationWidget.f10539a.setText(spannableString);
                    ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsManager().mo13428a((long) ((Integer) LiveConfigSettingKeys.BROADCAST_TASK_RESOURCE_ID.mo9431a()).intValue(), new C7214j() {
                        /* renamed from: a */
                        public final void mo8669a(Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo8668a(long j, String str) {
                            C10632b.m21416a().mo18874a(TaskFinishAnimationWidget.this.f10543e, new Callable(str, 7) {

                                /* renamed from: a */
                                final /* synthetic */ String f12525a;

                                /* renamed from: b */
                                final /* synthetic */ int f12526b;

                                public final Object call() throws Exception {
                                    return C4561ac.m10954a(this.f12525a, this.f12526b);
                                }

                                {
                                    this.f12525a = r1;
                                    this.f12526b = r2;
                                }
                            }, 100);
                        }
                    }, 4);
                }
            }
        }));
        this.f10544f.mo6652a((AnimatorListener) new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                C9432q.m18691b((View) TaskFinishAnimationWidget.this.f10539a, 8);
            }

            public final void onAnimationStart(Animator animator) {
                C9432q.m18691b((View) TaskFinishAnimationWidget.this.f10539a, 0);
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                taskFinishAnimationWidget.f10542d = new AlphaAnimation(0.0f, 1.0f);
                taskFinishAnimationWidget.f10540b = new AlphaAnimation(1.0f, 0.0f);
                taskFinishAnimationWidget.f10542d.setDuration(200);
                taskFinishAnimationWidget.f10540b.setDuration(200);
                taskFinishAnimationWidget.f10541c = new Runnable() {
                    public final void run() {
                        if (TaskFinishAnimationWidget.this.isViewValid()) {
                            TaskFinishAnimationWidget.this.f10539a.startAnimation(TaskFinishAnimationWidget.this.f10540b);
                        }
                    }
                };
                TaskFinishAnimationWidget.this.f10539a.startAnimation(TaskFinishAnimationWidget.this.f10542d);
                TaskFinishAnimationWidget.this.f10539a.postDelayed(TaskFinishAnimationWidget.this.f10541c, 1700);
            }
        });
    }
}
