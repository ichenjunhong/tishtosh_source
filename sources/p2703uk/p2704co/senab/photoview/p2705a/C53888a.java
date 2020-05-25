package p2703uk.p2704co.senab.photoview.p2705a;

import android.content.Context;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: uk.co.senab.photoview.a.a */
public class C53888a implements C53892d {

    /* renamed from: a */
    protected C53893e f133522a;

    /* renamed from: b */
    float f133523b;

    /* renamed from: c */
    float f133524c;

    /* renamed from: d */
    final float f133525d;

    /* renamed from: e */
    final float f133526e;

    /* renamed from: f */
    private VelocityTracker f133527f;

    /* renamed from: g */
    private boolean f133528g;

    /* renamed from: a */
    public boolean mo113977a() {
        return false;
    }

    /* renamed from: a */
    public final void mo113976a(C53893e eVar) {
        this.f133522a = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo113975a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo113978b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public C53888a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f133526e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f133525d = (float) viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: c */
    public boolean mo113979c(MotionEvent motionEvent) {
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f133527f = VelocityTracker.obtain();
                if (this.f133527f != null) {
                    this.f133527f.addMovement(motionEvent);
                }
                this.f133523b = mo113975a(motionEvent);
                this.f133524c = mo113978b(motionEvent);
                this.f133528g = false;
                break;
            case 1:
                if (this.f133528g && this.f133527f != null) {
                    this.f133523b = mo113975a(motionEvent);
                    this.f133524c = mo113978b(motionEvent);
                    this.f133527f.addMovement(motionEvent);
                    this.f133527f.computeCurrentVelocity(1000);
                    float xVelocity = this.f133527f.getXVelocity();
                    float yVelocity = this.f133527f.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f133526e) {
                        this.f133522a.mo113984a(this.f133523b, this.f133524c, -xVelocity, -yVelocity);
                    }
                }
                if (this.f133527f != null) {
                    this.f133527f.recycle();
                    this.f133527f = null;
                    break;
                }
                break;
            case 2:
                float a = mo113975a(motionEvent);
                float b = mo113978b(motionEvent);
                float f = a - this.f133523b;
                float f2 = b - this.f133524c;
                if (!this.f133528g) {
                    if (FloatMath.sqrt((f * f) + (f2 * f2)) >= this.f133525d) {
                        z = true;
                    }
                    this.f133528g = z;
                }
                if (this.f133528g) {
                    this.f133522a.mo113983a(f, f2);
                    this.f133523b = a;
                    this.f133524c = b;
                    if (this.f133527f != null) {
                        this.f133527f.addMovement(motionEvent);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f133527f != null) {
                    this.f133527f.recycle();
                    this.f133527f = null;
                    break;
                }
                break;
        }
        return true;
    }
}
