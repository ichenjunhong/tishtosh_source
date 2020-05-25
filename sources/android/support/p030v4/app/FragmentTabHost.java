package android.support.p030v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentTabHost */
public final class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0593a> f2128a;

    /* renamed from: b */
    private Context f2129b;

    /* renamed from: c */
    private C0654k f2130c;

    /* renamed from: d */
    private int f2131d;

    /* renamed from: e */
    private OnTabChangeListener f2132e;

    /* renamed from: f */
    private C0593a f2133f;

    /* renamed from: g */
    private boolean f2134g;

    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
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
        String f2135a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f2135a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2135a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2135a);
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static final class C0593a {

        /* renamed from: a */
        final String f2136a;

        /* renamed from: b */
        final Class<?> f2137b;

        /* renamed from: c */
        final Bundle f2138c;

        /* renamed from: d */
        Fragment f2139d;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2134g = false;
    }

    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2135a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f2128a.size();
        C0679r rVar = null;
        for (int i = 0; i < size; i++) {
            C0593a aVar = (C0593a) this.f2128a.get(i);
            aVar.f2139d = this.f2130c.mo2224a(aVar.f2136a);
            if (aVar.f2139d != null && !aVar.f2139d.isDetached()) {
                if (aVar.f2136a.equals(currentTabTag)) {
                    this.f2133f = aVar;
                } else {
                    if (rVar == null) {
                        rVar = this.f2130c.mo2225a();
                    }
                    rVar.mo2197d(aVar.f2139d);
                }
            }
        }
        this.f2134g = true;
        C0679r a = m1602a(currentTabTag, rVar);
        if (a != null) {
            a.mo2189b();
            this.f2130c.mo2234b();
        }
    }

    public final void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f2132e = onTabChangeListener;
    }

    /* renamed from: a */
    private C0593a m1601a(String str) {
        int size = this.f2128a.size();
        for (int i = 0; i < size; i++) {
            C0593a aVar = (C0593a) this.f2128a.get(i);
            if (aVar.f2136a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2135a);
    }

    public final void onTabChanged(String str) {
        if (this.f2134g) {
            C0679r a = m1602a(str, null);
            if (a != null) {
                a.mo2189b();
            }
        }
        if (this.f2132e != null) {
            this.f2132e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private C0679r m1602a(String str, C0679r rVar) {
        C0593a a = m1601a(str);
        if (this.f2133f != a) {
            if (rVar == null) {
                rVar = this.f2130c.mo2225a();
            }
            if (!(this.f2133f == null || this.f2133f.f2139d == null)) {
                rVar.mo2197d(this.f2133f.f2139d);
            }
            if (a != null) {
                if (a.f2139d == null) {
                    a.f2139d = Fragment.instantiate(this.f2129b, a.f2137b.getName(), a.f2138c);
                    rVar.mo2176a(this.f2131d, a.f2139d, a.f2136a);
                } else {
                    rVar.mo2199e(a.f2139d);
                }
            }
            this.f2133f = a;
        }
        return rVar;
    }
}
