package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.livesdk.chatroom.p309e.C5081a;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.widget.C8488a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayDeque;
import java.util.Queue;

public class ActionMessageWidget extends LiveWidget implements OnMessageListener {

    /* renamed from: a */
    public Room f16759a;

    /* renamed from: b */
    public boolean f16760b;

    /* renamed from: c */
    private long f16761c;

    /* renamed from: d */
    private Queue<C5084b> f16762d;

    /* renamed from: e */
    private AnimatorSet f16763e;

    /* renamed from: f */
    private ViewGroup f16764f;

    /* renamed from: g */
    private IMessageManager f16765g;

    /* renamed from: h */
    private OnClickListener f16766h = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() instanceof C5081a) {
                ((C5081a) view.getTag()).mo10976a(view.getContext(), ActionMessageWidget.this.f16759a);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget$a */
    class C6241a implements AnimatorListener {

        /* renamed from: b */
        private ViewGroup f16770b;

        /* renamed from: c */
        private View f16771c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f16770b != null && this.f16771c != null) {
                this.f16770b.removeView(this.f16771c);
                this.f16771c = null;
                ActionMessageWidget.this.f16760b = false;
                ActionMessageWidget.this.mo12298a();
            }
        }

        C6241a(ViewGroup viewGroup, View view) {
            this.f16770b = viewGroup;
            this.f16771c = view;
        }
    }

    public int getLayoutId() {
        return R.layout.aoz;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f16765g != null) {
            this.f16765g.removeMessageListener(this);
        }
        if (!this.f16762d.isEmpty()) {
            this.f16762d.clear();
        }
        if (this.f16763e != null && this.f16763e.isRunning()) {
            this.f16763e.removeAllListeners();
            this.f16763e.cancel();
            this.f16763e = null;
        }
    }

    /* renamed from: a */
    public final void mo12298a() {
        while (!this.f16762d.isEmpty() && !this.f16760b) {
            C5084b bVar = (C5084b) this.f16762d.poll();
            if (bVar instanceof C5081a) {
                C5081a aVar = (C5081a) bVar;
                C8488a aVar2 = new C8488a(this.context);
                aVar2.setY((float) this.f16764f.getHeight());
                aVar2.setAbsActionMessage(aVar);
                if (aVar.mo10979d()) {
                    aVar2.setTag(aVar);
                    aVar2.setOnClickListener(this.f16766h);
                } else {
                    aVar2.setOnClickListener(null);
                }
                if (aVar2.f23303a) {
                    this.f16760b = true;
                    this.f16764f.addView(aVar2);
                    LayoutParams layoutParams = (LayoutParams) aVar2.getLayoutParams();
                    layoutParams.addRule(14);
                    aVar2.setLayoutParams(layoutParams);
                    this.f16763e = m13409a(aVar2, new C6241a(this.f16764f, aVar2));
                    this.f16763e.start();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f16761c = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.f16759a = (Room) this.dataCenter.get("data_room");
        this.f16762d = new ArrayDeque();
        this.f16764f = (ViewGroup) this.contentView.getParent();
        this.f16765g = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f16765g != null) {
            this.f16765g.addMessageListener(C8629a.PROMOTION_CARD_MESSAGE.getIntType(), this);
            this.f16765g.addMessageListener(C8629a.LUCKY_BOX.getIntType(), this);
            this.f16765g.addMessageListener(C8629a.ROOM_PUSH.getIntType(), this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1.equals("buy_card") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r6.f16759a.isOfficial() != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMessage(com.p683ss.ugc.live.sdk.message.data.IMessage r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.message.model.c r7 = (com.bytedance.android.livesdk.message.model.C7859c) r7
            r0 = 1
            if (r7 == 0) goto L_0x0069
            long r1 = r6.f16761c
            boolean r1 = r7.isCurrentRoom(r1)
            if (r1 == 0) goto L_0x0069
            boolean r1 = r7.canText()
            if (r1 != 0) goto L_0x0014
            goto L_0x0069
        L_0x0014:
            int[] r1 = com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget.C62402.f16768a
            com.bytedance.android.livesdkapi.depend.e.a r2 = r7.getMessageType()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            switch(r1) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0068
        L_0x0025:
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r6.f16759a
            boolean r1 = r1.isOfficial()
            if (r1 == 0) goto L_0x0068
            goto L_0x0069
        L_0x002e:
            r1 = r7
            com.bytedance.android.livesdk.message.model.bs r1 = (com.bytedance.android.livesdk.message.model.C7850bs) r1
            java.lang.String r1 = r1.f21690a
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -984622807(0xffffffffc54fd929, float:-3325.5725)
            if (r4 == r5) goto L_0x004d
            r2 = -407856239(0xffffffffe7b09b91, float:-1.6680124E24)
            if (r4 == r2) goto L_0x0043
            goto L_0x0056
        L_0x0043:
            java.lang.String r2 = "enter_by_card"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0056
            r2 = 1
            goto L_0x0057
        L_0x004d:
            java.lang.String r4 = "buy_card"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = -1
        L_0x0057:
            switch(r2) {
                case 0: goto L_0x005b;
                case 1: goto L_0x005b;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x0069
        L_0x005b:
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.C6718b.f18328Y
            java.lang.Object r0 = r0.mo9431a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            return
        L_0x006c:
            com.bytedance.android.livesdk.chatroom.e.b r7 = com.bytedance.android.livesdk.chatroom.p309e.C5113y.m11752a(r7)
            if (r7 != 0) goto L_0x0073
            return
        L_0x0073:
            if (r7 == 0) goto L_0x007d
            java.util.Queue<com.bytedance.android.livesdk.chatroom.e.b> r0 = r6.f16762d
            r0.add(r7)
            r6.mo12298a()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* renamed from: a */
    private AnimatorSet m13409a(View view, AnimatorListener animatorListener) {
        float y = view.getY();
        float dimension = this.context.getResources().getDimension(R.dimen.qz) + this.context.getResources().getDimension(R.dimen.r0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{y, y - dimension}).setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(300);
        duration3.setStartDelay(3000);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{animatorSet, duration3});
        animatorSet2.addListener(animatorListener);
        return animatorSet2;
    }
}
