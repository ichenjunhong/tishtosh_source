package com.bytedance.android.live.uikit.p256b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.android.live.uikit.b.b */
public final class C4200b extends Handler {

    /* renamed from: d */
    private static C4200b f11411d;

    /* renamed from: a */
    public final Queue<C4198a> f11412a = new LinkedList();

    /* renamed from: b */
    public boolean f11413b;

    /* renamed from: c */
    public int f11414c = 5;

    public final void dismiss() {
        C4198a aVar = (C4198a) this.f11412a.peek();
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public static synchronized C4200b m10416a() {
        synchronized (C4200b.class) {
            if (f11411d != null) {
                C4200b bVar = f11411d;
                return bVar;
            }
            C4200b bVar2 = new C4200b(Looper.getMainLooper());
            f11411d = bVar2;
            return bVar2;
        }
    }

    /* renamed from: b */
    public final void mo9656b() {
        while (!this.f11412a.isEmpty()) {
            C4198a aVar = (C4198a) this.f11412a.peek();
            if (aVar.mo9652d()) {
                aVar.dismiss();
                this.f11412a.poll();
            } else {
                if (!aVar.mo9650b()) {
                    Message obtain = Message.obtain();
                    obtain.what = 291;
                    obtain.obj = aVar;
                    sendMessage(obtain);
                }
                return;
            }
        }
    }

    private C4200b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo9655a(final C4198a aVar) {
        if (!aVar.mo9650b() || aVar.mo9652d()) {
            aVar.dismiss();
            this.f11413b = false;
            this.f11412a.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f11412a.contains(aVar)) {
            this.f11413b = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet a = aVar.mo9647a();
            a.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f11394k = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f11394k = false;
                    aVar.dismiss();
                    C4200b.this.f11413b = false;
                    C4200b.this.removeMessages(1110);
                    C4200b.this.sendEmptyMessage(1929);
                }
            });
            a.start();
            this.f11412a.poll();
        }
    }

    public final void handleMessage(Message message) {
        C4198a aVar = (C4198a) message.obj;
        int i = message.what;
        if (i == 291) {
            if (!aVar.mo9650b()) {
                aVar.mo9651c();
                this.f11413b = true;
                if (aVar.f11389f == null) {
                    aVar.f11389f = new AnimatorSet();
                    aVar.f11389f.playTogether(new Animator[]{ObjectAnimator.ofFloat(aVar.f11385b, "translationY", new float[]{(float) (-aVar.f11401r), 0.0f}), ObjectAnimator.ofFloat(aVar.f11385b, "alpha", new float[]{0.0f, 1.0f})});
                    aVar.f11389f.setInterpolator(new AccelerateDecelerateInterpolator());
                    aVar.f11389f.setDuration(320);
                }
                aVar.f11389f.start();
                Message obtain = Message.obtain();
                obtain.what = 1110;
                obtain.obj = aVar;
                sendMessageDelayed(obtain, aVar.f11390g);
            }
        } else if (i != 1110) {
            if (i == 1929) {
                mo9656b();
            }
        } else {
            mo9655a(aVar);
        }
    }
}
