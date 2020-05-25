package android.support.p030v4.app;

/* renamed from: android.support.v4.app.FcmJobIntentService */
public abstract class FcmJobIntentService extends JobIntentService {
    /* access modifiers changed from: 0000 */
    public C0598e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
