package p2703uk.p2704co.senab.photoview.p2705a;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: uk.co.senab.photoview.a.b */
public class C53889b extends C53888a {

    /* renamed from: f */
    private int f133529f = -1;

    /* renamed from: g */
    private int f133530g;

    public C53889b(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo113975a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f133530g);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo113978b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f133530g);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo113979c(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r2 = -1
            r3 = 0
            if (r0 == r1) goto L_0x0045
            r1 = 6
            if (r0 == r1) goto L_0x0019
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0045;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0047
        L_0x0012:
            int r0 = r6.getPointerId(r3)
            r5.f133529f = r0
            goto L_0x0047
        L_0x0019:
            int r0 = r6.getAction()
            int r1 = android.os.Build.VERSION.SDK_INT
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >> 8
            int r1 = r6.getPointerId(r0)
            int r4 = r5.f133529f
            if (r1 != r4) goto L_0x0047
            if (r0 != 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            int r1 = r6.getPointerId(r0)
            r5.f133529f = r1
            float r1 = r6.getX(r0)
            r5.f133523b = r1
            float r0 = r6.getY(r0)
            r5.f133524c = r0
            goto L_0x0047
        L_0x0045:
            r5.f133529f = r2
        L_0x0047:
            int r0 = r5.f133529f
            if (r0 == r2) goto L_0x004d
            int r3 = r5.f133529f
        L_0x004d:
            int r0 = r6.findPointerIndex(r3)
            r5.f133530g = r0
            boolean r6 = super.mo113979c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2703uk.p2704co.senab.photoview.p2705a.C53889b.mo113979c(android.view.MotionEvent):boolean");
    }
}
