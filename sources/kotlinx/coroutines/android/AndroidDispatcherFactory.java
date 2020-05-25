package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p2628d.p2639f.p2641b.C52711k;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public final int getLoadPriority() {
        return 1073741823;
    }

    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public final C53211b createDispatcher(List<? extends MainDispatcherFactory> list) {
        C52711k.m112240b(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
        return new C53211b(C53216d.m113052a(mainLooper, true), "Main");
    }
}
