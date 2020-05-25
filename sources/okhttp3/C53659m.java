package okhttp3;

import java.util.Collections;
import java.util.List;

/* renamed from: okhttp3.m */
public interface C53659m {

    /* renamed from: a */
    public static final C53659m f133117a = new C53659m() {
        public final void saveFromResponse(C53673t tVar, List<C53657l> list) {
        }

        public final List<C53657l> loadForRequest(C53673t tVar) {
            return Collections.emptyList();
        }
    };

    List<C53657l> loadForRequest(C53673t tVar);

    void saveFromResponse(C53673t tVar, List<C53657l> list);
}
