package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28596bt.C28597a;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bo */
public final class C28587bo<T> extends C28596bt<C28540ba<T>> implements C28484am<T> {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$a */
    public interface C28588a<T> {
        /* renamed from: a */
        C1352v mo58278a(ViewGroup viewGroup, int i, C28540ba<T> baVar);

        /* renamed from: a */
        void mo58279a(C1352v vVar, C28540ba<T> baVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$b */
    static class C28589b<T> implements C28597a<C28540ba<T>> {

        /* renamed from: a */
        private C28588a<T> f75102a;

        C28589b(C28588a<T> aVar) {
            this.f75102a = aVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo58281a(C1352v vVar, Object obj) {
            this.f75102a.mo58279a(vVar, (C28540ba) obj);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C1352v mo58280a(ViewGroup viewGroup, int i, Object obj) {
            return this.f75102a.mo58278a(viewGroup, i, (C28540ba) obj);
        }
    }

    public C28587bo(C28588a<T> aVar) {
        super(new C28589b(aVar));
    }
}
