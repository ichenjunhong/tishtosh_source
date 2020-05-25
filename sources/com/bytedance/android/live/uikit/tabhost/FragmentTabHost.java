package com.bytedance.android.live.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private boolean f11754a;

    /* renamed from: b */
    private final ArrayList<C4280b> f11755b = new ArrayList<>();

    /* renamed from: c */
    private FrameLayout f11756c;

    /* renamed from: d */
    private Context f11757d;

    /* renamed from: e */
    private C0654k f11758e;

    /* renamed from: f */
    private int f11759f;

    /* renamed from: g */
    private OnTabChangeListener f11760g;

    /* renamed from: h */
    private C4280b f11761h;

    /* renamed from: i */
    private boolean f11762i;

    /* renamed from: j */
    private C4279a f11763j;

    /* renamed from: k */
    private boolean f11764k = false;

    /* renamed from: l */
    private boolean f11765l = false;

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
        String f11766a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f11766a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f11766a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f11766a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.tabhost.FragmentTabHost$a */
    public interface C4279a {
    }

    /* renamed from: com.bytedance.android.live.uikit.tabhost.FragmentTabHost$b */
    static final class C4280b {

        /* renamed from: a */
        public final String f11767a;

        /* renamed from: b */
        public final Class<?> f11768b;

        /* renamed from: c */
        public final Bundle f11769c;

        /* renamed from: d */
        public Fragment f11770d;
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f11754a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11762i = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.f11761h != null) {
            return this.f11761h.f11770d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11766a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0679r rVar = null;
        for (int i = 0; i < this.f11755b.size(); i++) {
            C4280b bVar = (C4280b) this.f11755b.get(i);
            bVar.f11770d = this.f11758e.mo2224a(bVar.f11767a);
            if (bVar.f11770d != null && !bVar.f11770d.isDetached()) {
                if (bVar.f11767a.equals(currentTabTag)) {
                    this.f11761h = bVar;
                } else {
                    if (rVar == null) {
                        rVar = this.f11758e.mo2225a();
                    }
                    rVar.mo2197d(bVar.f11770d);
                }
            }
        }
        this.f11762i = true;
        C0679r a = m10545a(currentTabTag, rVar);
        if (a != null) {
            a.mo2195c();
            this.f11758e.mo2234b();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f11756c = frameLayout2;
            this.f11756c.setId(this.f11759f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f11754a = z;
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f11760g = onTabChangeListener;
    }

    public void setOnTabSwitchListener(C4279a aVar) {
        this.f11763j = aVar;
    }

    public void setSuperOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f11765l) {
            this.f11764k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f11766a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m10546a(context, (AttributeSet) null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f11754a) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public void onTabChanged(String str) {
        if (this.f11762i) {
            C0679r a = m10545a(str, (C0679r) null);
            if (a != null) {
                a.mo2195c();
            }
        }
        if (this.f11760g != null) {
            this.f11760g.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private void m10546a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f11759f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10546a(context, attributeSet);
    }

    /* renamed from: a */
    private C0679r m10545a(String str, C0679r rVar) {
        this.f11765l = true;
        C4280b bVar = null;
        for (int i = 0; i < this.f11755b.size(); i++) {
            C4280b bVar2 = (C4280b) this.f11755b.get(i);
            if (bVar2.f11767a.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return null;
        }
        if (this.f11761h != bVar) {
            if (rVar == null) {
                rVar = this.f11758e.mo2225a();
            }
            if (!(this.f11761h == null || this.f11761h.f11770d == null)) {
                if (this.f11764k) {
                    rVar.mo2193b(this.f11761h.f11770d);
                } else {
                    rVar.mo2197d(this.f11761h.f11770d);
                }
            }
            if (bVar != null) {
                if (bVar.f11770d == null) {
                    bVar.f11770d = Fragment.instantiate(this.f11757d, bVar.f11768b.getName(), bVar.f11769c);
                    rVar.mo2176a(this.f11759f, bVar.f11770d, bVar.f11767a);
                } else if (this.f11764k) {
                    if (bVar.f11770d.isDetached()) {
                        rVar.mo2199e(bVar.f11770d);
                    }
                    if (bVar.f11770d.isHidden()) {
                        rVar.mo2196c(bVar.f11770d);
                    }
                } else {
                    rVar.mo2199e(bVar.f11770d);
                }
            }
            this.f11761h = bVar;
        }
        return rVar;
    }
}
