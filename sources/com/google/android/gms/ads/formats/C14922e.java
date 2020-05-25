package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.C15875ey;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.p1027a.C14882b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.formats.e */
public final class C14922e {

    /* renamed from: a */
    public static WeakHashMap<View, C14922e> f38487a = new WeakHashMap<>();

    /* renamed from: b */
    private C15875ey f38488b;

    /* renamed from: c */
    private WeakReference<View> f38489c;

    /* renamed from: a */
    public final void mo27364a(C14916b bVar) {
        m30613a((C14882b) bVar.mo27346a());
    }

    /* renamed from: a */
    public final void mo27365a(C14930i iVar) {
        m30613a((C14882b) iVar.mo27393k());
    }

    /* renamed from: a */
    private final void m30613a(C14882b bVar) {
        View view = this.f38489c != null ? (View) this.f38489c.get() : null;
        if (view == null) {
            afc.m32798e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f38487a.containsKey(view)) {
            f38487a.put(view, this);
        }
        if (this.f38488b != null) {
            try {
                this.f38488b.mo31067a(bVar);
            } catch (RemoteException e) {
                afc.m32793b("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}
