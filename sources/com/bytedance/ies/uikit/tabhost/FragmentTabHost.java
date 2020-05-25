package com.bytedance.ies.uikit.tabhost;

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
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabWidget;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    public final ArrayList<C11157c> f30074a = new ArrayList<>();

    /* renamed from: b */
    public Context f30075b;

    /* renamed from: c */
    public C0654k f30076c;

    /* renamed from: d */
    public boolean f30077d;

    /* renamed from: e */
    private boolean f30078e;

    /* renamed from: f */
    private FrameLayout f30079f;

    /* renamed from: g */
    private int f30080g;

    /* renamed from: h */
    private OnTabChangeListener f30081h;

    /* renamed from: i */
    private C11157c f30082i;

    /* renamed from: j */
    private C11156b f30083j;

    /* renamed from: k */
    private boolean f30084k = false;

    /* renamed from: l */
    private boolean f30085l = false;

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
        String f30086a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f30086a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30086a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f30086a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$a */
    public static class C11155a implements TabContentFactory {

        /* renamed from: a */
        private final Context f30087a;

        public C11155a(Context context) {
            this.f30087a = context;
        }

        public final View createTabContent(String str) {
            View view = new View(this.f30087a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$b */
    public interface C11156b {
        /* renamed from: a */
        void mo20095a(String str, Fragment fragment, Fragment fragment2);
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$c */
    public static final class C11157c {

        /* renamed from: a */
        public final String f30088a;

        /* renamed from: b */
        public final Class<?> f30089b;

        /* renamed from: c */
        public Bundle f30090c;

        /* renamed from: d */
        public Fragment f30091d;

        public C11157c(String str, Class<?> cls, Bundle bundle) {
            this.f30088a = str;
            this.f30089b = cls;
            this.f30090c = bundle;
        }
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f30078e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30077d = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.f30082i != null) {
            return this.f30082i.f30091d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30086a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            String currentTabTag = getCurrentTabTag();
            C0679r rVar = null;
            for (int i = 0; i < this.f30074a.size(); i++) {
                C11157c cVar = (C11157c) this.f30074a.get(i);
                cVar.f30091d = this.f30076c.mo2224a(cVar.f30088a);
                if (cVar.f30091d != null && !cVar.f30091d.isDetached()) {
                    if (cVar.f30088a.equals(currentTabTag)) {
                        this.f30082i = cVar;
                    } else {
                        if (rVar == null) {
                            rVar = this.f30076c.mo2225a();
                        }
                        rVar.mo2197d(cVar.f30091d);
                    }
                }
            }
            this.f30077d = true;
            C0679r a = m22552a(currentTabTag, rVar);
            if (a != null) {
                a.mo2195c();
                this.f30076c.mo2234b();
            }
        } catch (Exception unused) {
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
            this.f30079f = frameLayout2;
            this.f30079f.setId(this.f30080g);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f30078e = z;
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f30081h = onTabChangeListener;
    }

    public void setOnTabSwitchListener(C11156b bVar) {
        this.f30083j = bVar;
    }

    public void setSuperOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f30085l) {
            this.f30084k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f30086a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m22553a(context, (AttributeSet) null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f30078e) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.f30077d) {
            if (this.f30082i != null) {
                fragment = this.f30082i.f30091d;
            } else {
                fragment = null;
            }
            C0679r a = m22552a(str, (C0679r) null);
            if (a != null) {
                a.mo2195c();
            }
        } else {
            fragment = null;
        }
        if (this.f30081h != null) {
            this.f30081h.onTabChanged(str);
        }
        if (this.f30083j != null) {
            if (this.f30082i != null) {
                fragment2 = this.f30082i.f30091d;
            }
            if (fragment2 != fragment) {
                this.f30083j.mo20095a(str, fragment2, fragment);
            }
        }
    }

    /* renamed from: a */
    private void m22553a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f30080g = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22553a(context, attributeSet);
    }

    /* renamed from: a */
    private C0679r m22552a(String str, C0679r rVar) {
        this.f30085l = true;
        C11157c cVar = null;
        for (int i = 0; i < this.f30074a.size(); i++) {
            C11157c cVar2 = (C11157c) this.f30074a.get(i);
            if (cVar2.f30088a.equals(str)) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return null;
        }
        if (this.f30082i != cVar) {
            if (rVar == null) {
                rVar = this.f30076c.mo2225a();
            }
            if (!(this.f30082i == null || this.f30082i.f30091d == null)) {
                if (this.f30084k) {
                    rVar.mo2193b(this.f30082i.f30091d);
                } else {
                    rVar.mo2197d(this.f30082i.f30091d);
                }
            }
            if (cVar != null) {
                if (cVar.f30091d == null) {
                    cVar.f30091d = Fragment.instantiate(this.f30075b, cVar.f30089b.getName(), cVar.f30090c);
                    rVar.mo2176a(this.f30080g, cVar.f30091d, cVar.f30088a);
                } else if (this.f30084k) {
                    if (cVar.f30091d.isDetached()) {
                        rVar.mo2199e(cVar.f30091d);
                    }
                    rVar.mo2196c(cVar.f30091d);
                } else {
                    rVar.mo2199e(cVar.f30091d);
                }
            }
            this.f30082i = cVar;
        }
        return rVar;
    }

    /* renamed from: a */
    public final void mo20455a(Context context, C0654k kVar, int i) {
        super.setup();
        this.f30075b = context;
        this.f30076c = kVar;
        this.f30080g = R.id.cwo;
        if (this.f30079f == null) {
            this.f30079f = (FrameLayout) findViewById(this.f30080g);
            if (this.f30079f == null) {
                StringBuilder sb = new StringBuilder("No tab content FrameLayout found for id ");
                sb.append(this.f30080g);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.f30079f.setId(R.id.cwo);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
