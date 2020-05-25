package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C15870et;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.ads.formats.j */
public final class C14932j extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f38490a;

    /* renamed from: b */
    private final C15870et f38491b;

    /* renamed from: a */
    private final void m30651a(String str, View view) {
        try {
            this.f38491b.mo31058a(str, C14886d.m30544a(view));
        } catch (RemoteException e) {
            afc.m32793b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m30651a("3001", view);
    }

    public final void setCallToActionView(View view) {
        m30651a("3002", view);
    }

    public final void setIconView(View view) {
        m30651a("3003", view);
    }

    public final void setBodyView(View view) {
        m30651a("3004", view);
    }

    public final void setAdvertiserView(View view) {
        m30651a("3005", view);
    }

    public final void setStoreView(View view) {
        m30651a("3006", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f38491b.mo31060b(C14886d.m30544a(view));
        } catch (RemoteException e) {
            afc.m32793b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m30651a("3007", view);
    }

    public final void setImageView(View view) {
        m30651a("3008", view);
    }

    public final void setStarRatingView(View view) {
        m30651a("3009", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m30651a("3010", mediaView);
    }

    public final void setAdChoicesView(C14915a aVar) {
        m30651a("3011", aVar);
    }

    public final void setNativeAd(C14930i iVar) {
        try {
            this.f38491b.mo31056a((C14882b) iVar.mo27393k());
        } catch (RemoteException e) {
            afc.m32793b("Unable to call setNativeAd on delegate", e);
        }
    }

    /* renamed from: a */
    private final View m30650a(String str) {
        try {
            C14882b a = this.f38491b.mo31054a(str);
            if (a != null) {
                return (View) C14886d.m30545a(a);
            }
        } catch (RemoteException e) {
            afc.m32793b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    public final View getHeadlineView() {
        return m30650a("3001");
    }

    public final View getCallToActionView() {
        return m30650a("3002");
    }

    public final View getIconView() {
        return m30650a("3003");
    }

    public final View getBodyView() {
        return m30650a("3004");
    }

    public final View getStoreView() {
        return m30650a("3006");
    }

    public final View getPriceView() {
        return m30650a("3007");
    }

    public final View getAdvertiserView() {
        return m30650a("3005");
    }

    public final View getImageView() {
        return m30650a("3008");
    }

    public final View getStarRatingView() {
        return m30650a("3009");
    }

    public final MediaView getMediaView() {
        View a = m30650a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            afc.m32792b("View is not an instance of MediaView");
        }
        return null;
    }

    public final C14915a getAdChoicesView() {
        View a = m30650a("3011");
        if (a instanceof C14915a) {
            return (C14915a) a;
        }
        return null;
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f38490a);
    }

    public final void removeView(View view) {
        if (this.f38490a != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f38490a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f38490a != view) {
            super.bringChildToFront(this.f38490a);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f38491b != null) {
            try {
                this.f38491b.mo31057a(C14886d.m30544a(view), i);
            } catch (RemoteException e) {
                afc.m32793b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }
}
