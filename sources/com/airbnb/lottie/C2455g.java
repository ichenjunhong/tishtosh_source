package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import com.airbnb.lottie.p107b.C2338a;
import com.airbnb.lottie.p107b.C2339b;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p111c.C2385b;
import com.airbnb.lottie.p113e.C2432q;
import com.airbnb.lottie.p114f.C2451c;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2470c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.airbnb.lottie.g */
public class C2455g extends Drawable implements Animatable, Callback {

    /* renamed from: n */
    private static final String f7569n = "g";

    /* renamed from: a */
    public C2408e f7570a;

    /* renamed from: b */
    public final C2451c f7571b = new C2451c();

    /* renamed from: c */
    public float f7572c = 1.0f;

    /* renamed from: d */
    final ArrayList<C2467a> f7573d = new ArrayList<>();

    /* renamed from: e */
    C2339b f7574e;

    /* renamed from: f */
    public String f7575f;

    /* renamed from: g */
    C2337b f7576g;

    /* renamed from: h */
    public C2338a f7577h;

    /* renamed from: i */
    public C2297a f7578i;

    /* renamed from: j */
    public C2482o f7579j;

    /* renamed from: k */
    public boolean f7580k;

    /* renamed from: l */
    public C2385b f7581l;

    /* renamed from: m */
    boolean f7582m;

    /* renamed from: o */
    private final Matrix f7583o = new Matrix();

    /* renamed from: p */
    private final Set<Object> f7584p = new HashSet();

    /* renamed from: q */
    private int f7585q = NormalGiftView.ALPHA_255;

    /* renamed from: com.airbnb.lottie.g$a */
    interface C2467a {
        /* renamed from: a */
        void mo6858a(C2408e eVar);
    }

    public int getAlpha() {
        return this.f7585q;
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void start() {
        mo6832d();
    }

    /* renamed from: f */
    public final int mo6837f() {
        return this.f7571b.getRepeatMode();
    }

    /* renamed from: g */
    public final int mo6838g() {
        return this.f7571b.getRepeatCount();
    }

    /* renamed from: h */
    public final boolean mo6843h() {
        return this.f7571b.isRunning();
    }

    public boolean isRunning() {
        return mo6843h();
    }

    /* renamed from: l */
    public final float mo6850l() {
        return this.f7571b.mo6802b();
    }

    /* renamed from: a */
    public final void mo6820a() {
        if (this.f7574e != null) {
            this.f7574e.mo6734a();
        }
    }

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: k */
    public final void mo6849k() {
        this.f7573d.clear();
        this.f7571b.cancel();
    }

    public void stop() {
        this.f7573d.clear();
        this.f7571b.mo6809e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6826b() {
        this.f7581l = new C2385b(this, C2432q.m7117a(this.f7570a), this.f7570a.f7521g, this.f7570a);
    }

    /* renamed from: c */
    public final void mo6829c() {
        mo6820a();
        if (this.f7571b.isRunning()) {
            this.f7571b.cancel();
        }
        this.f7570a = null;
        this.f7581l = null;
        this.f7574e = null;
        this.f7571b.mo6804c();
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo6832d() {
        if (this.f7581l == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6832d();
                }
            });
        } else {
            this.f7571b.mo6807d();
        }
    }

    /* renamed from: e */
    public final void mo6836e() {
        if (this.f7581l == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6836e();
                }
            });
        } else {
            this.f7571b.mo6811g();
        }
    }

    public int getIntrinsicHeight() {
        if (this.f7570a == null) {
            return -1;
        }
        return (int) (((float) this.f7570a.f7522h.height()) * this.f7572c);
    }

    public int getIntrinsicWidth() {
        if (this.f7570a == null) {
            return -1;
        }
        return (int) (((float) this.f7570a.f7522h.width()) * this.f7572c);
    }

    /* renamed from: i */
    public final boolean mo6844i() {
        if (this.f7579j != null || this.f7570a.f7519e.mo2596c() <= 0) {
            return false;
        }
        return true;
    }

    public C2455g() {
        this.f7571b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C2455g.this.f7581l != null) {
                    C2455g.this.f7581l.mo6751a(C2455g.this.f7571b.mo6802b());
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo6848j() {
        if (this.f7570a != null) {
            float f = this.f7572c;
            setBounds(0, 0, (int) (((float) this.f7570a.f7522h.width()) * f), (int) (((float) this.f7570a.f7522h.height()) * f));
        }
    }

    public void setAlpha(int i) {
        this.f7585q = i;
    }

    /* renamed from: d */
    public final void mo6833d(float f) {
        this.f7572c = f;
        mo6848j();
    }

    /* renamed from: d */
    public final void mo6834d(int i) {
        this.f7571b.setRepeatCount(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: a */
    private List<C2398e> m7181a(C2398e eVar) {
        if (this.f7581l == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f7581l.mo6710a(eVar, 0, (List<C2398e>) arrayList, new C2398e(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6821a(final float f) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6821a(f);
                }
            });
        } else {
            mo6822a((int) C2453e.m7169a(this.f7570a.f7523i, this.f7570a.f7524j, f));
        }
    }

    /* renamed from: b */
    public final void mo6827b(final float f) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6827b(f);
                }
            });
        } else {
            mo6828b((int) C2453e.m7169a(this.f7570a.f7523i, this.f7570a.f7524j, f));
        }
    }

    /* renamed from: c */
    public final void mo6830c(final float f) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6830c(f);
                }
            });
        } else {
            mo6831c((int) C2453e.m7169a(this.f7570a.f7523i, this.f7570a.f7524j, f));
        }
    }

    /* renamed from: a */
    public final Bitmap mo6819a(String str) {
        C2339b bVar;
        Object obj;
        boolean z;
        if (getCallback() == null) {
            bVar = null;
        } else {
            if (this.f7574e != null) {
                C2339b bVar2 = this.f7574e;
                Callback callback = getCallback();
                if (callback == null || !(callback instanceof View)) {
                    obj = null;
                } else {
                    obj = ((View) callback).getContext();
                }
                if (!(obj == null && bVar2.f7287a == null) && !bVar2.f7287a.equals(obj)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    this.f7574e.mo6734a();
                    this.f7574e = null;
                }
            }
            if (this.f7574e == null) {
                this.f7574e = new C2339b(getCallback(), this.f7575f, this.f7576g, this.f7570a.f7517c);
            }
            bVar = this.f7574e;
        }
        if (bVar != null) {
            return bVar.mo6733a(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo6828b(final int i) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6828b(i);
                }
            });
        } else {
            this.f7571b.mo6805c(i);
        }
    }

    /* renamed from: c */
    public final void mo6831c(final int i) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6831c(i);
                }
            });
        } else {
            this.f7571b.mo6800a(i);
        }
    }

    /* renamed from: a */
    public final void mo6822a(final int i) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6822a(i);
                }
            });
        } else {
            this.f7571b.mo6803b(i);
        }
    }

    public void draw(Canvas canvas) {
        float f;
        C2340c.m6969b("Drawable#draw");
        if (this.f7581l != null) {
            float f2 = this.f7572c;
            float min = Math.min(((float) canvas.getWidth()) / ((float) this.f7570a.f7522h.width()), ((float) canvas.getHeight()) / ((float) this.f7570a.f7522h.height()));
            if (f2 > min) {
                f = this.f7572c / min;
            } else {
                min = f2;
                f = 1.0f;
            }
            if (f > 1.0f) {
                canvas.save();
                float width = ((float) this.f7570a.f7522h.width()) / 2.0f;
                float height = ((float) this.f7570a.f7522h.height()) / 2.0f;
                float f3 = width * min;
                float f4 = height * min;
                canvas.translate((this.f7572c * width) - f3, (this.f7572c * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f7583o.reset();
            this.f7583o.preScale(min, min);
            this.f7581l.mo6708a(canvas, this.f7583o, this.f7585q);
            C2340c.m6970c("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo6825a(boolean z) {
        if (this.f7580k != z && VERSION.SDK_INT >= 19) {
            this.f7580k = z;
            if (this.f7570a != null) {
                mo6826b();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public final void mo6823a(final int i, final int i2) {
        if (this.f7570a == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6823a(i, i2);
                }
            });
        } else {
            this.f7571b.mo6801a(i, i2);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    /* renamed from: a */
    public final <T> void mo6824a(final C2398e eVar, final T t, final C2470c<T> cVar) {
        if (this.f7581l == null) {
            this.f7573d.add(new C2467a() {
                /* renamed from: a */
                public final void mo6858a(C2408e eVar) {
                    C2455g.this.mo6824a(eVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar.f7502a != null) {
            eVar.f7502a.mo6711a(t, cVar);
        } else {
            List a = m7181a(eVar);
            for (int i = 0; i < a.size(); i++) {
                ((C2398e) a.get(i)).f7502a.mo6711a(t, cVar);
            }
            if (a.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == C2474j.f7658w) {
                mo6830c(mo6850l());
            }
        }
    }
}
