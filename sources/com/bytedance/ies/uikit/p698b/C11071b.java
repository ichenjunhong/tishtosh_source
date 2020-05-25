package com.bytedance.ies.uikit.p698b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.ies.uikit.b.b */
public final class C11071b extends Handler {

    /* renamed from: d */
    private static C11071b f29746d;

    /* renamed from: a */
    public final Queue<C11069a> f29747a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public boolean f29748b;

    /* renamed from: c */
    public int f29749c = 5;

    public final void dismiss() {
        C11069a aVar = (C11069a) this.f29747a.peek();
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public static synchronized C11071b m22414a() {
        synchronized (C11071b.class) {
            if (f29746d != null) {
                C11071b bVar = f29746d;
                return bVar;
            }
            C11071b bVar2 = new C11071b(Looper.getMainLooper());
            f29746d = bVar2;
            return bVar2;
        }
    }

    /* renamed from: b */
    private void m22415b() {
        while (!this.f29747a.isEmpty()) {
            C11069a aVar = (C11069a) this.f29747a.peek();
            if (aVar == null || !aVar.mo20065f()) {
                if (aVar != null && !aVar.mo20061c()) {
                    Message obtain = Message.obtain();
                    obtain.what = 291;
                    obtain.obj = aVar;
                    sendMessage(obtain);
                }
                return;
            }
            aVar.dismiss();
            this.f29747a.poll();
        }
    }

    private C11071b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo20067a(Context context) {
        for (C11069a aVar : this.f29747a) {
            if (aVar != null && aVar.f29719a == context) {
                aVar.mo20062d();
            }
        }
    }

    /* renamed from: a */
    public final void mo20068a(C11069a aVar) {
        if (!this.f29747a.contains(aVar) && this.f29747a.size() <= this.f29749c) {
            this.f29747a.offer(aVar);
            if (!this.f29748b) {
                sendEmptyMessage(1929);
            }
        }
    }

    /* renamed from: b */
    public final void mo20069b(final C11069a aVar) {
        if (!aVar.mo20061c() || aVar.mo20065f()) {
            aVar.dismiss();
            this.f29748b = false;
            this.f29747a.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f29747a.contains(aVar)) {
            this.f29748b = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet a = aVar.mo20051a();
            a.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f29726h = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f29726h = false;
                    aVar.dismiss();
                    C11071b.this.f29748b = false;
                    C11071b.this.removeMessages(1110);
                    C11071b.this.sendEmptyMessage(1929);
                }
            });
            a.start();
            this.f29747a.poll();
        }
    }

    public final void handleMessage(Message message) {
        C11069a aVar = (C11069a) message.obj;
        int i = message.what;
        if (i == 291) {
            if (!aVar.mo20061c()) {
                aVar.mo20064e();
                this.f29748b = true;
                if (aVar.f29722d == null) {
                    aVar.f29722d = new AnimatorSet();
                    aVar.f29722d.playTogether(new Animator[]{ObjectAnimator.ofFloat(aVar.f29720b, "translationY", new float[]{(float) (-aVar.f29732n), 0.0f}), ObjectAnimator.ofFloat(aVar.f29720b, "alpha", new float[]{0.0f, 1.0f})});
                    aVar.f29722d.setInterpolator(new AccelerateDecelerateInterpolator());
                    aVar.f29722d.setDuration(320);
                }
                aVar.f29722d.start();
                Message obtain = Message.obtain();
                obtain.what = 1110;
                obtain.obj = aVar;
                sendMessageDelayed(obtain, aVar.f29723e);
            }
        } else if (i != 1110) {
            if (i == 1929) {
                m22415b();
            }
        } else {
            mo20069b(aVar);
        }
    }
}
