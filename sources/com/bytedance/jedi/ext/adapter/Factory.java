package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class Factory implements C0212b {

    static final class SimpleViewHolderState implements C11932s {
        private final C52860x trigger;

        public SimpleViewHolderState() {
            this(null, 1, null);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, C52860x xVar, int i, Object obj) {
            if ((i & 1) != 0) {
                xVar = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(xVar);
        }

        public final SimpleViewHolderState copy(C52860x xVar) {
            C52711k.m112240b(xVar, "trigger");
            return new SimpleViewHolderState(xVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.trigger, (java.lang.Object) ((com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState) r2).trigger) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState
                if (r0 == 0) goto L_0x0013
                com.bytedance.jedi.ext.adapter.Factory$SimpleViewHolderState r2 = (com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState) r2
                d.x r0 = r1.trigger
                d.x r2 = r2.trigger
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C52860x xVar = this.trigger;
            if (xVar != null) {
                return xVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimpleViewHolderState(trigger=");
            sb.append(this.trigger);
            sb.append(")");
            return sb.toString();
        }

        public SimpleViewHolderState(C52860x xVar) {
            C52711k.m112240b(xVar, "trigger");
            this.trigger = xVar;
        }

        public /* synthetic */ SimpleViewHolderState(C52860x xVar, int i, C52707g gVar) {
            if ((i & 1) != 0) {
                xVar = C52860x.f131107a;
            }
            this(xVar);
        }
    }

    static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        /* renamed from: c */
        public final /* synthetic */ C11932s mo22529c() {
            return new SimpleViewHolderState(null, 1, null);
        }
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        C52711k.m112240b(cls, "modelClass");
        return (C0209x) new ViewModel();
    }
}
