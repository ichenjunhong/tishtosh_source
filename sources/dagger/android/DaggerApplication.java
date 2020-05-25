package dagger.android;

import android.app.Application;

public abstract class DaggerApplication extends Application implements C52876d {

    /* renamed from: a */
    private volatile boolean f131117a = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C52871b<? extends DaggerApplication> mo110428a();

    public void onCreate() {
        super.onCreate();
        if (this.f131117a) {
            synchronized (this) {
                if (this.f131117a) {
                    mo110428a().mo56093a(this);
                    if (this.f131117a) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }
}
