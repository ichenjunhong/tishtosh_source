package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import java.util.ArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.r */
public final class C45315r extends ArrayList<C44334o<C42421al>> implements C44334o<C42421al> {
    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(C44334o oVar) {
        return super.contains(oVar);
    }

    public final /* bridge */ int indexOf(C44334o oVar) {
        return super.indexOf(oVar);
    }

    public final /* bridge */ int lastIndexOf(C44334o oVar) {
        return super.lastIndexOf(oVar);
    }

    public final C44334o<C42421al> remove(int i) {
        return removeAt(i);
    }

    public final C44334o removeAt(int i) {
        return (C44334o) super.remove(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C44334o)) {
            return false;
        }
        return contains((C44334o) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C44334o)) {
            return -1;
        }
        return indexOf((C44334o) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C44334o)) {
            return -1;
        }
        return lastIndexOf((C44334o) obj);
    }

    public final /* bridge */ boolean remove(C44334o oVar) {
        return super.remove(oVar);
    }

    public final void onError(C43856fy fyVar) {
        C52711k.m112240b(fyVar, "e");
        for (C44334o onError : this) {
            onError.onError(fyVar);
        }
    }

    public final void onSynthetiseSuccess(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        for (C44334o onSynthetiseSuccess : this) {
            onSynthetiseSuccess.onSynthetiseSuccess(str);
        }
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C44334o)) {
            return false;
        }
        return remove((C44334o) obj);
    }

    public final void onProgressUpdate(int i, boolean z) {
        for (C44334o onProgressUpdate : this) {
            onProgressUpdate.onProgressUpdate(i, z);
        }
    }

    public final void onSuccess(C42421al alVar, boolean z) {
        C52711k.m112240b(alVar, "response");
        for (C44334o onSuccess : this) {
            onSuccess.onSuccess(alVar, z);
        }
    }
}
