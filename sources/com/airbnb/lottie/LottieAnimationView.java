package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p043v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View.BaseSavedState;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.C2400g;
import com.airbnb.lottie.p114f.C2451c;
import com.airbnb.lottie.p115g.C2470c;
import com.ss.android.ugc.trill.R;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a */
    public static final C2296a f7101a = C2296a.Weak;

    /* renamed from: b */
    private static final String f7102b = LottieAnimationView.class.getSimpleName();

    /* renamed from: c */
    private final C2473i<C2408e> f7103c = new C2473i<C2408e>() {
        /* renamed from: a */
        public final /* synthetic */ void mo6703a(Object obj) {
            LottieAnimationView.this.setComposition((C2408e) obj);
        }
    };

    /* renamed from: d */
    private final C2473i<Throwable> f7104d = new C2473i<Throwable>() {
        /* renamed from: a */
        public final /* synthetic */ void mo6703a(Object obj) {
            throw new IllegalStateException("Unable to parse composition", (Throwable) obj);
        }
    };

    /* renamed from: e */
    private final C2455g f7105e = new C2455g();

    /* renamed from: f */
    private C2296a f7106f;

    /* renamed from: g */
    private String f7107g;

    /* renamed from: h */
    private int f7108h;

    /* renamed from: i */
    private boolean f7109i = false;

    /* renamed from: j */
    private boolean f7110j = false;

    /* renamed from: k */
    private boolean f7111k = false;

    /* renamed from: l */
    private C2476l f7112l;

    /* renamed from: m */
    private C2408e f7113m;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        String f7120a;

        /* renamed from: b */
        int f7121b;

        /* renamed from: c */
        float f7122c;

        /* renamed from: d */
        boolean f7123d;

        /* renamed from: e */
        String f7124e;

        /* renamed from: f */
        int f7125f;

        /* renamed from: g */
        int f7126g;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7120a = parcel.readString();
            this.f7122c = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f7123d = z;
            this.f7124e = parcel.readString();
            this.f7125f = parcel.readInt();
            this.f7126g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f7120a);
            parcel.writeFloat(this.f7122c);
            parcel.writeInt(this.f7123d ? 1 : 0);
            parcel.writeString(this.f7124e);
            parcel.writeInt(this.f7125f);
            parcel.writeInt(this.f7126g);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public enum C2296a {
        None,
        Weak,
        Strong
    }

    public C2408e getComposition() {
        return this.f7113m;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f7111k;
    }

    /* renamed from: d */
    public final void mo6659d() {
        this.f7105e.f7571b.removeAllListeners();
    }

    /* renamed from: e */
    public final boolean mo6660e() {
        return this.f7105e.mo6843h();
    }

    public int getFrame() {
        return (int) this.f7105e.f7571b.f7554d;
    }

    public String getImageAssetsFolder() {
        return this.f7105e.f7575f;
    }

    public float getProgress() {
        return this.f7105e.mo6850l();
    }

    public int getRepeatCount() {
        return this.f7105e.mo6838g();
    }

    public int getRepeatMode() {
        return this.f7105e.mo6837f();
    }

    public float getScale() {
        return this.f7105e.f7572c;
    }

    public float getSpeed() {
        return this.f7105e.f7571b.f7552b;
    }

    /* renamed from: i */
    private void m6826i() {
        this.f7113m = null;
        this.f7105e.mo6829c();
    }

    /* renamed from: b */
    public final void mo6654b() {
        this.f7105e.mo6832d();
        m6827j();
    }

    /* renamed from: c */
    public final void mo6657c() {
        this.f7105e.mo6836e();
        m6827j();
    }

    /* renamed from: f */
    public final void mo6661f() {
        this.f7105e.mo6849k();
        m6827j();
    }

    /* renamed from: g */
    public final void mo6662g() {
        C2455g gVar = this.f7105e;
        gVar.f7573d.clear();
        gVar.f7571b.mo6810f();
        m6827j();
    }

    public long getDuration() {
        if (this.f7113m != null) {
            return (long) this.f7113m.mo6777a();
        }
        return 0;
    }

    public float getMaxFrame() {
        return this.f7105e.f7571b.mo6816i();
    }

    public float getMinFrame() {
        return this.f7105e.f7571b.mo6815h();
    }

    public C2479m getPerformanceTracker() {
        C2455g gVar = this.f7105e;
        if (gVar.f7570a != null) {
            return gVar.f7570a.f7515a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7110j && this.f7109i) {
            mo6654b();
        }
    }

    /* renamed from: h */
    private void m6825h() {
        if (this.f7112l != null) {
            this.f7112l.mo6873b(this.f7103c);
            this.f7112l.mo6875d(this.f7104d);
        }
    }

    /* renamed from: j */
    private void m6827j() {
        boolean z;
        int i = 1;
        if (!this.f7111k || !this.f7105e.mo6843h()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 2;
        }
        setLayerType(i, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo6660e()) {
            mo6661f();
            this.f7109i = true;
        }
        C2402d.m7058a(this);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6650a() {
        if (this.f7105e != null) {
            this.f7105e.mo6820a();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7120a = this.f7107g;
        savedState.f7121b = this.f7108h;
        savedState.f7122c = this.f7105e.mo6850l();
        savedState.f7123d = this.f7105e.mo6843h();
        savedState.f7124e = this.f7105e.f7575f;
        savedState.f7125f = this.f7105e.mo6837f();
        savedState.f7126g = this.f7105e.mo6838g();
        return savedState;
    }

    /* renamed from: b */
    public final void mo6655b(AnimatorListener animatorListener) {
        this.f7105e.f7571b.removeListener(animatorListener);
    }

    public void setAnimation(JsonReader jsonReader) {
        m6823a(jsonReader, (String) null);
    }

    public void setFrame(int i) {
        this.f7105e.mo6831c(i);
    }

    public void setImageAssetsFolder(String str) {
        this.f7105e.f7575f = str;
    }

    public void setImageDrawable(Drawable drawable) {
        m6821a(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.f7105e.mo6828b(i);
    }

    public void setMaxProgress(float f) {
        this.f7105e.mo6827b(f);
    }

    public void setMinFrame(int i) {
        this.f7105e.mo6822a(i);
    }

    public void setMinProgress(float f) {
        this.f7105e.mo6821a(f);
    }

    public void setProgress(float f) {
        this.f7105e.mo6830c(f);
    }

    public void setRepeatCount(int i) {
        this.f7105e.mo6834d(i);
    }

    public void setRepeatMode(int i) {
        this.f7105e.f7571b.setRepeatMode(i);
    }

    public void setSpeed(float f) {
        this.f7105e.f7571b.f7552b = f;
    }

    public void setTextDelegate(C2482o oVar) {
        this.f7105e.f7579j = oVar;
    }

    public void setAnimationFromJson(String str) {
        m6823a(new JsonReader(new StringReader(str)), (String) null);
    }

    public void setFontAssetDelegate(C2297a aVar) {
        C2455g gVar = this.f7105e;
        gVar.f7578i = aVar;
        if (gVar.f7577h != null) {
            gVar.f7577h.f7284e = aVar;
        }
    }

    public void setImageAssetDelegate(C2337b bVar) {
        C2455g gVar = this.f7105e;
        gVar.f7576g = bVar;
        if (gVar.f7574e != null) {
            gVar.f7574e.f7288b = bVar;
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        C2402d.m7058a(this);
        m6825h();
        super.setImageBitmap(bitmap);
    }

    public void setImageResource(int i) {
        C2402d.m7058a(this);
        m6825h();
        super.setImageResource(i);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C2455g gVar = this.f7105e;
        gVar.f7582m = z;
        if (gVar.f7570a != null) {
            gVar.f7570a.mo6780a(z);
        }
    }

    /* renamed from: b */
    public final void mo6656b(boolean z) {
        if (this.f7111k != z) {
            this.f7111k = z;
            m6827j();
        }
    }

    /* renamed from: c */
    public final void mo6658c(boolean z) {
        int i;
        C2455g gVar = this.f7105e;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        gVar.mo6834d(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == this.f7105e) {
            super.invalidateDrawable(this.f7105e);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimationFromUrl(String str) {
        m6826i();
        m6825h();
        this.f7112l = C2442f.m7134a(getContext(), str).mo6869a(this.f7103c).mo6874c(this.f7104d);
    }

    public void setScale(float f) {
        this.f7105e.mo6833d(f);
        if (getDrawable() == this.f7105e) {
            m6821a((Drawable) null, false);
            m6821a((Drawable) this.f7105e, false);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m6822a((AttributeSet) null);
    }

    public void setAnimation(final String str) {
        this.f7107g = str;
        this.f7108h = 0;
        C2408e a = C2400g.m7054a().mo6766a(str);
        if (a != null) {
            setComposition(a);
            return;
        }
        m6826i();
        m6825h();
        this.f7112l = C2442f.m7143c(getContext(), str).mo6869a((C2473i<T>) new C2473i<C2408e>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo6703a(Object obj) {
                C2400g.m7054a().mo6767a(str, (C2408e) obj);
            }
        }).mo6869a(this.f7103c).mo6874c(this.f7104d);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7107g = savedState.f7120a;
        if (!TextUtils.isEmpty(this.f7107g)) {
            setAnimation(this.f7107g);
        }
        this.f7108h = savedState.f7121b;
        if (this.f7108h != 0) {
            setAnimation(this.f7108h);
        }
        setProgress(savedState.f7122c);
        if (savedState.f7123d) {
            mo6654b();
        }
        this.f7105e.f7575f = savedState.f7124e;
        setRepeatMode(savedState.f7125f);
        setRepeatCount(savedState.f7126g);
    }

    public void setAnimation(final int i) {
        this.f7108h = i;
        this.f7107g = null;
        C2408e a = C2400g.m7054a().mo6766a(Integer.toString(i));
        if (a != null) {
            setComposition(a);
            return;
        }
        m6826i();
        m6825h();
        this.f7112l = C2442f.m7137a(C2442f.m7138a(i), (Callable<C2475k<C2408e>>) new Callable<C2475k<C2408e>>(getContext().getApplicationContext(), i) {

            /* renamed from: a */
            final /* synthetic */ Context f7542a;

            /* renamed from: b */
            final /* synthetic */ int f7543b;

            public final /* synthetic */ Object call() throws Exception {
                return C2442f.m7131a(this.f7542a, this.f7543b);
            }

            {
                this.f7542a = r1;
                this.f7543b = r2;
            }
        }).mo6869a((C2473i<T>) new C2473i<C2408e>() {
            /* renamed from: a */
            public final /* synthetic */ void mo6703a(Object obj) {
                C2400g.m7054a().mo6767a(Integer.toString(i), (C2408e) obj);
            }
        }).mo6869a(this.f7103c).mo6874c(this.f7104d);
    }

    /* renamed from: a */
    public final void mo6652a(AnimatorListener animatorListener) {
        this.f7105e.f7571b.addListener(animatorListener);
    }

    public void setComposition(C2408e eVar) {
        this.f7105e.setCallback(this);
        this.f7113m = eVar;
        C2455g gVar = this.f7105e;
        boolean z = true;
        boolean z2 = false;
        if (gVar.f7570a == eVar) {
            z = false;
        } else {
            gVar.mo6829c();
            gVar.f7570a = eVar;
            gVar.mo6826b();
            C2451c cVar = gVar.f7571b;
            if (cVar.f7557g == null) {
                z2 = true;
            }
            cVar.f7557g = eVar;
            if (z2) {
                cVar.mo6801a((int) Math.max(cVar.f7555e, eVar.f7523i), (int) Math.min(cVar.f7556f, eVar.f7524j));
            } else {
                cVar.mo6801a((int) eVar.f7523i, (int) eVar.f7524j);
            }
            cVar.mo6800a((int) cVar.f7554d);
            cVar.f7553c = System.nanoTime();
            gVar.mo6830c(gVar.f7571b.getAnimatedFraction());
            gVar.mo6833d(gVar.f7572c);
            gVar.mo6848j();
            Iterator it = new ArrayList(gVar.f7573d).iterator();
            while (it.hasNext()) {
                ((C2467a) it.next()).mo6858a(eVar);
                it.remove();
            }
            gVar.f7573d.clear();
            eVar.mo6780a(gVar.f7582m);
        }
        m6827j();
        if (getDrawable() != this.f7105e || z) {
            setImageDrawable(null);
            setImageDrawable(this.f7105e);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m6822a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ta, R.attr.tb, R.attr.tc, R.attr.td, R.attr.te, R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm});
        this.f7106f = C2296a.values()[obtainStyledAttributes.getInt(1, f7101a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(4);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(12);
                if (string2 != null) {
                    setAnimationFromUrl(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f7109i = true;
            this.f7110j = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f7105e.mo6834d(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        mo6653a(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            C2481n nVar = new C2481n(obtainStyledAttributes.getColor(2, 0));
            m6824a(new C2398e("**"), C2474j.f7659x, new C2470c(nVar));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f7105e.mo6833d(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m6827j();
    }

    /* renamed from: a */
    public final void mo6653a(boolean z) {
        this.f7105e.mo6825a(z);
    }

    /* renamed from: a */
    private void m6821a(Drawable drawable, boolean z) {
        if (z && drawable != this.f7105e) {
            C2402d.m7058a(this);
        }
        m6825h();
        super.setImageDrawable(drawable);
    }

    /* renamed from: a */
    private void m6823a(JsonReader jsonReader, String str) {
        m6826i();
        m6825h();
        this.f7112l = C2442f.m7135a(jsonReader, str).mo6869a(this.f7103c).mo6874c(this.f7104d);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6822a(attributeSet);
    }

    /* renamed from: a */
    public final void mo6651a(int i, int i2) {
        this.f7105e.mo6823a(i, i2);
    }

    /* renamed from: a */
    private <T> void m6824a(C2398e eVar, T t, C2470c<T> cVar) {
        this.f7105e.mo6824a(eVar, t, cVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6822a(attributeSet);
    }
}
