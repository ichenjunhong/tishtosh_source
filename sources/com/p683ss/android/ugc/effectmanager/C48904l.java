package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.common.C48639e;
import com.p683ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;

/* renamed from: com.ss.android.ugc.effectmanager.l */
public final class C48904l {

    /* renamed from: a */
    public C48639e<String, C48905a> f123052a;

    /* renamed from: com.ss.android.ugc.effectmanager.l$a */
    static class C48905a {

        /* renamed from: a */
        public ModelInfo f123053a;

        /* renamed from: a */
        public final String mo96709a() {
            return this.f123053a.getName();
        }

        public final int hashCode() {
            return this.f123053a.hashCode();
        }

        public C48905a(ModelInfo modelInfo) {
            this.f123053a = modelInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f123053a.equals(((C48905a) obj).f123053a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ExtendedUrlModel mo96708a(String str) {
        for (C48905a aVar : this.f123052a.mo96217a()) {
            if (aVar.mo96709a().equals(str)) {
                return aVar.f123053a.getFile_url();
            }
        }
        StringBuilder sb = new StringBuilder("modelName ");
        sb.append(str);
        sb.append(" doesn't exist");
        throw new IllegalArgumentException(sb.toString());
    }
}
