package com.facebook.imagepipeline.p971k;

import com.facebook.common.p921e.C13697a;
import com.facebook.imagepipeline.p975o.C14229b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.k.b */
public final class C14049b implements C14050c {

    /* renamed from: a */
    public final List<C14050c> f36715a;

    public C14049b(C14050c... cVarArr) {
        this.f36715a = new ArrayList(cVarArr.length);
        for (C14050c cVar : cVarArr) {
            if (cVar != null) {
                this.f36715a.add(cVar);
            }
        }
    }

    public final void onRequestCancellation(String str) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onRequestCancellation(str);
            } catch (Exception e) {
                m28732a("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean requiresExtraMap(String str) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            if (((C14050c) this.f36715a.get(i)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C14049b(Set<C14050c> set) {
        this.f36715a = new ArrayList(set.size());
        for (C14050c cVar : set) {
            if (cVar != null) {
                this.f36715a.add(cVar);
            }
        }
    }

    /* renamed from: a */
    private static void m28732a(String str, Throwable th) {
        C13697a.m27696c("ForwardingRequestListener", str, th);
    }

    public final void onProducerStart(String str, String str2) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onProducerStart(str, str2);
            } catch (Exception e) {
                m28732a("InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void onProducerEvent(String str, String str2, String str3) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                m28732a("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                m28732a("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                m28732a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void onRequestSuccess(C14229b bVar, String str, boolean z) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onRequestSuccess(bVar, str, z);
            } catch (Exception e) {
                m28732a("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                m28732a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e) {
                m28732a("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onRequestFailure(bVar, str, th, z);
            } catch (Exception e) {
                m28732a("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
        int size = this.f36715a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C14050c) this.f36715a.get(i)).onRequestStart(bVar, obj, str, z);
            } catch (Exception e) {
                m28732a("InternalListener exception in onRequestStart", e);
            }
        }
    }
}
