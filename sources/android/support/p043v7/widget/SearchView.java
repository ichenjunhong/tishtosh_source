package android.support.p043v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1103f;
import android.support.p043v7.view.C1220c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends LinearLayoutCompat implements C1220c {

    /* renamed from: u */
    static final C1365a f4816u = new C1365a();

    /* renamed from: A */
    private Rect f4817A;

    /* renamed from: B */
    private int[] f4818B;

    /* renamed from: C */
    private int[] f4819C;

    /* renamed from: D */
    private final ImageView f4820D;

    /* renamed from: E */
    private final Drawable f4821E;

    /* renamed from: F */
    private final int f4822F;

    /* renamed from: G */
    private final int f4823G;

    /* renamed from: H */
    private final CharSequence f4824H;

    /* renamed from: I */
    private C1367c f4825I;

    /* renamed from: J */
    private C1366b f4826J;

    /* renamed from: K */
    private OnClickListener f4827K;

    /* renamed from: L */
    private CharSequence f4828L;

    /* renamed from: M */
    private boolean f4829M;

    /* renamed from: N */
    private int f4830N;

    /* renamed from: O */
    private boolean f4831O;

    /* renamed from: P */
    private CharSequence f4832P;

    /* renamed from: Q */
    private CharSequence f4833Q;

    /* renamed from: R */
    private boolean f4834R;

    /* renamed from: S */
    private int f4835S;

    /* renamed from: T */
    private final Runnable f4836T;

    /* renamed from: U */
    private Runnable f4837U;

    /* renamed from: V */
    private final WeakHashMap<String, ConstantState> f4838V;

    /* renamed from: W */
    private final OnClickListener f4839W;

    /* renamed from: a */
    final SearchAutoComplete f4840a;

    /* renamed from: aa */
    private final OnEditorActionListener f4841aa;

    /* renamed from: ab */
    private final OnItemClickListener f4842ab;

    /* renamed from: ac */
    private final OnItemSelectedListener f4843ac;

    /* renamed from: ad */
    private TextWatcher f4844ad;

    /* renamed from: b */
    final View f4845b;

    /* renamed from: c */
    final ImageView f4846c;

    /* renamed from: d */
    final ImageView f4847d;

    /* renamed from: e */
    final ImageView f4848e;

    /* renamed from: h */
    final ImageView f4849h;

    /* renamed from: i */
    final View f4850i;

    /* renamed from: j */
    final Intent f4851j;

    /* renamed from: k */
    final Intent f4852k;

    /* renamed from: l */
    OnFocusChangeListener f4853l;

    /* renamed from: m */
    C1368d f4854m;

    /* renamed from: n */
    public boolean f4855n;

    /* renamed from: o */
    public boolean f4856o;

    /* renamed from: p */
    C1103f f4857p;

    /* renamed from: q */
    public boolean f4858q;

    /* renamed from: r */
    public boolean f4859r;

    /* renamed from: s */
    SearchableInfo f4860s;

    /* renamed from: t */
    Bundle f4861t;

    /* renamed from: v */
    OnKeyListener f4862v;

    /* renamed from: w */
    private final View f4863w;

    /* renamed from: x */
    private final View f4864x;

    /* renamed from: y */
    private C1369e f4865y;

    /* renamed from: z */
    private Rect f4866z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f4877a;

        public String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f4877a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f4877a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4877a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        boolean f4878a;

        /* renamed from: b */
        final Runnable f4879b;

        /* renamed from: c */
        private int f4880c;

        /* renamed from: d */
        private SearchView f4881d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public boolean enoughToFilter() {
            if (this.f4880c <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return UnReadVideoExperiment.BROWSE_RECORD_LIST;
            }
            if (i >= 600 || (i >= 640 && i2 >= 480)) {
                return 192;
            }
            return 160;
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f4881d = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f4880c = i;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4878a) {
                removeCallbacks(this.f4879b);
                post(this.f4879b);
            }
            return onCreateInputConnection;
        }

        public void onWindowFocusChanged(boolean z) {
            boolean z2;
            super.onWindowFocusChanged(z);
            if (z && this.f4881d.hasFocus() && getVisibility() == 0) {
                this.f4878a = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    SearchView.f4816u.mo5232a(this, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f4878a = false;
                removeCallbacks(this.f4879b);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f4878a = false;
                removeCallbacks(this.f4879b);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f4878a = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.bm);
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4881d.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f4881d.mo5179h();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f4879b = new Runnable() {
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f4878a) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f4878a = false;
                    }
                }
            };
            this.f4880c = getThreshold();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    static class C1365a {

        /* renamed from: a */
        private Method f4883a;

        /* renamed from: b */
        private Method f4884b;

        /* renamed from: c */
        private Method f4885c;

        C1365a() {
            try {
                this.f4883a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f4883a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f4884b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f4884b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f4885c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f4885c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5231a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f4883a != null) {
                try {
                    this.f4883a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5233b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f4884b != null) {
                try {
                    this.f4884b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5232a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f4885c != null) {
                try {
                    this.f4885c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C1366b {
        /* renamed from: a */
        boolean mo5234a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C1367c {
        /* renamed from: a */
        boolean mo5235a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C1368d {
        /* renamed from: a */
        boolean mo5236a(int i);

        /* renamed from: b */
        boolean mo5237b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C1369e extends TouchDelegate {

        /* renamed from: a */
        private final View f4886a;

        /* renamed from: b */
        private final Rect f4887b = new Rect();

        /* renamed from: c */
        private final Rect f4888c = new Rect();

        /* renamed from: d */
        private final Rect f4889d = new Rect();

        /* renamed from: e */
        private final int f4890e;

        /* renamed from: f */
        private boolean f4891f;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f4891f
                r6.f4891f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f4891f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f4889d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f4887b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f4891f = r3
                r2 = 1
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                if (r2 == 0) goto L_0x006b
                if (r3 == 0) goto L_0x0056
                android.graphics.Rect r2 = r6.f4888c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0056
                android.view.View r0 = r6.f4886a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f4886a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0065
            L_0x0056:
                android.graphics.Rect r2 = r6.f4888c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f4888c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0065:
                android.view.View r0 = r6.f4886a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x006b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.SearchView.C1369e.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public final void mo5238a(Rect rect, Rect rect2) {
            this.f4887b.set(rect);
            this.f4889d.set(rect);
            this.f4889d.inset(-this.f4890e, -this.f4890e);
            this.f4888c.set(rect2);
        }

        public C1369e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f4890e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo5238a(rect, rect2);
            this.f4886a = view;
        }
    }

    public int getMaxWidth() {
        return this.f4830N;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f4823G;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f4822F;
    }

    public C1103f getSuggestionsAdapter() {
        return this.f4857p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5165a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f4860s != null && this.f4857p != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo5164a(this.f4840a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f4840a.length();
                }
                this.f4840a.setSelection(i2);
                this.f4840a.setListSelection(0);
                this.f4840a.clearListSelection();
                f4816u.mo5232a(this.f4840a, true);
                return true;
            } else if (i != 19 || this.f4840a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m4607m() {
        post(this.f4836T);
    }

    /* renamed from: o */
    private void m4609o() {
        this.f4840a.dismissDropDown();
    }

    public int getImeOptions() {
        return this.f4840a.getImeOptions();
    }

    public int getInputType() {
        return this.f4840a.getInputType();
    }

    public CharSequence getQuery() {
        return this.f4840a.getText();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    /* renamed from: j */
    private boolean m4604j() {
        if ((this.f4858q || this.f4831O) && !this.f4856o) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo5180i() {
        f4816u.mo5231a(this.f4840a);
        f4816u.mo5233b(this.f4840a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4836T);
        post(this.f4837U);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4877a = this.f4856o;
        return savedState;
    }

    /* renamed from: k */
    private void m4605k() {
        int i;
        if (!m4604j() || !(this.f4847d.getVisibility() == 0 || this.f4849h.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f4864x.setVisibility(i);
    }

    /* renamed from: n */
    private void m4608n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f4840a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m4600b(queryHint));
    }

    public void clearFocus() {
        this.f4829M = true;
        super.clearFocus();
        this.f4840a.clearFocus();
        this.f4840a.setImeVisibility(false);
        this.f4829M = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo5170g() {
        m4599a(false);
        this.f4840a.requestFocus();
        this.f4840a.setImeVisibility(true);
        if (this.f4827K != null) {
            this.f4827K.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo5179h() {
        m4599a(this.f4856o);
        m4607m();
        if (this.f4840a.hasFocus()) {
            mo5180i();
        }
    }

    /* renamed from: l */
    private void m4606l() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4840a.getText());
        int i = 0;
        if (!z2 && (!this.f4855n || this.f4834R)) {
            z = false;
        }
        ImageView imageView = this.f4848e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f4848e.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: a */
    public final void mo3938a() {
        if (!this.f4834R) {
            this.f4834R = true;
            this.f4835S = this.f4840a.getImeOptions();
            this.f4840a.setImeOptions(this.f4835S | 33554432);
            this.f4840a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5167d() {
        int[] iArr;
        if (this.f4840a.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.f4845b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4864x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5168e() {
        Editable text = this.f4840a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f4825I == null || !this.f4825I.mo5235a(text.toString())) {
                if (this.f4860s != null) {
                    mo5162a(0, (String) null, text.toString());
                }
                this.f4840a.setImeVisibility(false);
                m4609o();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo5169f() {
        if (!TextUtils.isEmpty(this.f4840a.getText())) {
            this.f4840a.setText("");
            this.f4840a.requestFocus();
            this.f4840a.setImeVisibility(true);
        } else if (this.f4855n && (this.f4826J == null || !this.f4826J.mo5234a())) {
            clearFocus();
            m4599a(true);
        }
    }

    public CharSequence getQueryHint() {
        if (this.f4828L != null) {
            return this.f4828L;
        }
        if (this.f4860s == null || this.f4860s.getHintId() == 0) {
            return this.f4824H;
        }
        return getContext().getText(this.f4860s.getHintId());
    }

    /* renamed from: b */
    public final void mo3939b() {
        String str = "";
        this.f4840a.setText(str);
        this.f4840a.setSelection(this.f4840a.length());
        this.f4833Q = str;
        clearFocus();
        m4599a(true);
        this.f4840a.setImeOptions(this.f4835S);
        this.f4834R = false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4861t = bundle;
    }

    public void setOnCloseListener(C1366b bVar) {
        this.f4826J = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f4853l = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C1367c cVar) {
        this.f4825I = cVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f4827K = onClickListener;
    }

    public void setOnSuggestionListener(C1368d dVar) {
        this.f4854m = dVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m4607m();
    }

    public void setImeOptions(int i) {
        this.f4840a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f4840a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f4830N = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4828L = charSequence;
        m4608n();
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f4858q = z;
        m4599a(this.f4856o);
    }

    /* renamed from: a */
    private void m4598a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
            }
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            mo5169f();
        } else {
            mo5170g();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f4855n != z) {
            this.f4855n = z;
            m4599a(z);
            m4608n();
        }
    }

    public void setSuggestionsAdapter(C1103f fVar) {
        this.f4857p = fVar;
        this.f4840a.setAdapter(this.f4857p);
    }

    /* renamed from: b */
    private void m4601b(boolean z) {
        int i;
        if (!this.f4858q || !m4604j() || !hasFocus() || (!z && this.f4831O)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f4847d.setVisibility(i);
    }

    /* renamed from: c */
    private void m4603c(boolean z) {
        int i;
        if (!this.f4831O || this.f4856o || !z) {
            i = 8;
        } else {
            i = 0;
            this.f4847d.setVisibility(8);
        }
        this.f4849h.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        m4599a(savedState.f4877a);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setQuery(CharSequence charSequence) {
        int i;
        this.f4840a.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f4840a;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f4859r = z;
        if (this.f4857p instanceof C1444aw) {
            C1444aw awVar = (C1444aw) this.f4857p;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            awVar.f5191l = i;
        }
    }

    /* renamed from: b */
    private CharSequence m4600b(CharSequence charSequence) {
        if (!this.f4855n || this.f4821E == null) {
            return charSequence;
        }
        double textSize = (double) this.f4840a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f4821E.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f4821E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i;
        this.f4860s = searchableInfo;
        Intent intent = null;
        if (this.f4860s != null) {
            this.f4840a.setThreshold(this.f4860s.getSuggestThreshold());
            this.f4840a.setImeOptions(this.f4860s.getImeOptions());
            int inputType = this.f4860s.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f4860s.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f4840a.setInputType(inputType);
            if (this.f4857p != null) {
                this.f4857p.mo3534a((Cursor) null);
            }
            if (this.f4860s.getSuggestAuthority() != null) {
                this.f4857p = new C1444aw(getContext(), this, this.f4860s, this.f4838V);
                this.f4840a.setAdapter(this.f4857p);
                C1444aw awVar = (C1444aw) this.f4857p;
                if (this.f4859r) {
                    i = 2;
                } else {
                    i = 1;
                }
                awVar.f5191l = i;
            }
            m4608n();
        }
        boolean z = false;
        if (this.f4860s != null && this.f4860s.getVoiceSearchEnabled()) {
            if (this.f4860s.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4851j;
            } else if (this.f4860s.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4852k;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                z = true;
            }
        }
        this.f4831O = z;
        if (this.f4831O) {
            this.f4840a.setPrivateImeOptions("nm");
        }
        m4599a(this.f4856o);
    }

    /* renamed from: a */
    private void m4599a(boolean z) {
        int i;
        int i2;
        this.f4856o = z;
        int i3 = 8;
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z3 = !TextUtils.isEmpty(this.f4840a.getText());
        this.f4846c.setVisibility(i);
        m4601b(z3);
        View view = this.f4863w;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f4820D.getDrawable() != null && !this.f4855n) {
            i3 = 0;
        }
        this.f4820D.setVisibility(i3);
        m4606l();
        if (!z3) {
            z2 = true;
        }
        m4603c(z2);
        m4605k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5163a(CharSequence charSequence) {
        Editable text = this.f4840a.getText();
        this.f4833Q = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m4601b(z2);
        if (z2) {
            z = false;
        }
        m4603c(z);
        m4606l();
        m4605k();
        if (this.f4825I != null && !TextUtils.equals(charSequence, this.f4832P)) {
            charSequence.toString();
        }
        this.f4832P = charSequence.toString();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a1a);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f4829M || !isFocusable()) {
            return false;
        }
        if (this.f4856o) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f4840a.requestFocus(i, rect);
        if (requestFocus) {
            m4599a(false);
        }
        return requestFocus;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4856o) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = this.f4830N > 0 ? Math.min(this.f4830N, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4830N > 0 ? this.f4830N : getPreferredWidth();
        } else if (mode == 1073741824 && this.f4830N > 0) {
            size = Math.min(this.f4830N, size);
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5162a(int i, String str, String str2) {
        getContext().startActivity(m4597a("android.intent.action.SEARCH", null, null, str2, 0, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent m4596a(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = android.support.p043v7.widget.C1444aw.m5011a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f4860s     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = android.support.p043v7.widget.C1444aw.m5011a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f4860s     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = android.support.p043v7.widget.C1444aw.m5011a(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = android.support.p043v7.widget.C1444aw.m5011a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = android.support.p043v7.widget.C1444aw.m5011a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r11 = r2.m4597a(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r11
        L_0x0061:
            r10.getPosition()     // Catch:{ RuntimeException -> 0x0064 }
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.SearchView.m4596a(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: b */
    private boolean m4602b(int i, int i2, String str) {
        Cursor a = this.f4857p.mo3531a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m4598a(m4596a(a, 0, (String) null));
        return true;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4866z = new Rect();
        this.f4817A = new Rect();
        this.f4818B = new int[2];
        this.f4819C = new int[2];
        this.f4836T = new Runnable() {
            public final void run() {
                SearchView.this.mo5167d();
            }
        };
        this.f4837U = new Runnable() {
            public final void run() {
                if (SearchView.this.f4857p != null && (SearchView.this.f4857p instanceof C1444aw)) {
                    SearchView.this.f4857p.mo3534a((Cursor) null);
                }
            }
        };
        this.f4838V = new WeakHashMap<>();
        this.f4839W = new OnClickListener() {
            public final void onClick(View view) {
                String str;
                String str2;
                if (view == SearchView.this.f4846c) {
                    SearchView.this.mo5170g();
                } else if (view == SearchView.this.f4848e) {
                    SearchView.this.mo5169f();
                } else if (view == SearchView.this.f4847d) {
                    SearchView.this.mo5168e();
                } else {
                    if (view == SearchView.this.f4849h) {
                        SearchView searchView = SearchView.this;
                        if (searchView.f4860s != null) {
                            SearchableInfo searchableInfo = searchView.f4860s;
                            try {
                                String str3 = null;
                                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                    Intent intent = new Intent(searchView.f4851j);
                                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                                    String str4 = "calling_package";
                                    if (searchActivity != null) {
                                        str3 = searchActivity.flattenToShortString();
                                    }
                                    intent.putExtra(str4, str3);
                                    searchView.getContext().startActivity(intent);
                                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                    Intent intent2 = searchView.f4852k;
                                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                                    intent3.setComponent(searchActivity2);
                                    PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                    Bundle bundle = new Bundle();
                                    if (searchView.f4861t != null) {
                                        bundle.putParcelable("app_data", searchView.f4861t);
                                    }
                                    Intent intent4 = new Intent(intent2);
                                    String str5 = "free_form";
                                    int i = 1;
                                    Resources resources = searchView.getResources();
                                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                        str5 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                    }
                                    if (searchableInfo.getVoicePromptTextId() != 0) {
                                        str = resources.getString(searchableInfo.getVoicePromptTextId());
                                    } else {
                                        str = null;
                                    }
                                    if (searchableInfo.getVoiceLanguageId() != 0) {
                                        str2 = resources.getString(searchableInfo.getVoiceLanguageId());
                                    } else {
                                        str2 = null;
                                    }
                                    if (searchableInfo.getVoiceMaxResults() != 0) {
                                        i = searchableInfo.getVoiceMaxResults();
                                    }
                                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str5);
                                    intent4.putExtra("android.speech.extra.PROMPT", str);
                                    intent4.putExtra("android.speech.extra.LANGUAGE", str2);
                                    intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                    String str6 = "calling_package";
                                    if (searchActivity2 != null) {
                                        str3 = searchActivity2.flattenToShortString();
                                    }
                                    intent4.putExtra(str6, str3);
                                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                    searchView.getContext().startActivity(intent4);
                                }
                            } catch (ActivityNotFoundException unused) {
                            }
                        }
                    } else if (view == SearchView.this.f4840a) {
                        SearchView.this.mo5180i();
                    }
                }
            }
        };
        this.f4862v = new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                boolean z;
                if (SearchView.this.f4860s == null) {
                    return false;
                }
                if (SearchView.this.f4840a.isPopupShowing() && SearchView.this.f4840a.getListSelection() != -1) {
                    return SearchView.this.mo5165a(view, i, keyEvent);
                }
                if (TextUtils.getTrimmedLength(SearchView.this.f4840a.getText()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo5162a(0, (String) null, SearchView.this.f4840a.getText().toString());
                return true;
            }
        };
        this.f4841aa = new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo5168e();
                return true;
            }
        };
        this.f4842ab = new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo5164a(i, 0, (String) null);
            }
        };
        this.f4843ac = new OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView searchView = SearchView.this;
                if (searchView.f4854m == null || !searchView.f4854m.mo5236a(i)) {
                    Editable text = searchView.f4840a.getText();
                    Cursor a = searchView.f4857p.mo3531a();
                    if (a == null) {
                        return;
                    }
                    if (a.moveToPosition(i)) {
                        CharSequence b = searchView.f4857p.mo3537b(a);
                        if (b != null) {
                            searchView.setQuery(b);
                        } else {
                            searchView.setQuery(text);
                        }
                    } else {
                        searchView.setQuery(text);
                    }
                }
            }
        };
        this.f4844ad = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo5163a(charSequence);
            }
        };
        C1451bb a = C1451bb.m5032a(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, R.attr.f9, R.attr.hr, R.attr.ji, R.attr.mp, R.attr.nw, R.attr.q9, R.attr.xn, R.attr.xo, R.attr.a19, R.attr.a1_, R.attr.a3u, R.attr.a40, R.attr.a_p}, i, 0);
        LayoutInflater.from(context).inflate(a.mo5665g(9, R.layout.z), this, true);
        this.f4840a = (SearchAutoComplete) findViewById(R.id.cju);
        this.f4840a.setSearchView(this);
        this.f4863w = findViewById(R.id.cj4);
        this.f4845b = findViewById(R.id.cjo);
        this.f4864x = findViewById(R.id.cus);
        this.f4846c = (ImageView) findViewById(R.id.ciu);
        this.f4847d = (ImageView) findViewById(R.id.cj_);
        this.f4848e = (ImageView) findViewById(R.id.ciy);
        this.f4849h = (ImageView) findViewById(R.id.cjw);
        this.f4820D = (ImageView) findViewById(R.id.cjf);
        C1056u.m3030a(this.f4845b, a.mo5652a(10));
        C1056u.m3030a(this.f4864x, a.mo5652a(14));
        this.f4846c.setImageDrawable(a.mo5652a(13));
        this.f4847d.setImageDrawable(a.mo5652a(7));
        this.f4848e.setImageDrawable(a.mo5652a(4));
        this.f4849h.setImageDrawable(a.mo5652a(16));
        this.f4820D.setImageDrawable(a.mo5652a(13));
        this.f4821E = a.mo5652a(12);
        C1455bd.m5087a(this.f4846c, getResources().getString(R.string.bs));
        this.f4822F = a.mo5665g(15, R.layout.y);
        this.f4823G = a.mo5665g(5, 0);
        this.f4846c.setOnClickListener(this.f4839W);
        this.f4848e.setOnClickListener(this.f4839W);
        this.f4847d.setOnClickListener(this.f4839W);
        this.f4849h.setOnClickListener(this.f4839W);
        this.f4840a.setOnClickListener(this.f4839W);
        this.f4840a.addTextChangedListener(this.f4844ad);
        this.f4840a.setOnEditorActionListener(this.f4841aa);
        this.f4840a.setOnItemClickListener(this.f4842ab);
        this.f4840a.setOnItemSelectedListener(this.f4843ac);
        this.f4840a.setOnKeyListener(this.f4862v);
        this.f4840a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.f4853l != null) {
                    SearchView.this.f4853l.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo5654a(8, true));
        int e = a.mo5661e(1, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f4824H = a.mo5658c(6);
        this.f4828L = a.mo5658c(11);
        int a2 = a.mo5650a(3, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo5650a(2, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo5654a(0, true));
        a.mo5653a();
        this.f4851j = new Intent("android.speech.action.WEB_SEARCH");
        this.f4851j.addFlags(268435456);
        this.f4851j.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f4852k = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4852k.addFlags(268435456);
        this.f4850i = findViewById(this.f4840a.getDropDownAnchor());
        if (this.f4850i != null) {
            this.f4850i.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    int i10;
                    SearchView searchView = SearchView.this;
                    if (searchView.f4850i.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f4845b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a = C1467bj.m5138a(searchView);
                        if (searchView.f4855n) {
                            i9 = resources.getDimensionPixelSize(R.dimen.ah) + resources.getDimensionPixelSize(R.dimen.ai);
                        } else {
                            i9 = 0;
                        }
                        searchView.f4840a.getDropDownBackground().getPadding(rect);
                        if (a) {
                            i10 = -rect.left;
                        } else {
                            i10 = paddingLeft - (rect.left + i9);
                        }
                        searchView.f4840a.setDropDownHorizontalOffset(i10);
                        searchView.f4840a.setDropDownWidth((((searchView.f4850i.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
                    }
                }
            });
        }
        m4599a(this.f4855n);
        m4608n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5164a(int i, int i2, String str) {
        if (this.f4854m != null && this.f4854m.mo5237b(i)) {
            return false;
        }
        m4602b(i, 0, null);
        this.f4840a.setImeVisibility(false);
        m4609o();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f4840a;
            Rect rect = this.f4866z;
            searchAutoComplete.getLocationInWindow(this.f4818B);
            getLocationInWindow(this.f4819C);
            int i5 = this.f4818B[1] - this.f4819C[1];
            int i6 = this.f4818B[0] - this.f4819C[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.f4817A.set(this.f4866z.left, 0, this.f4866z.right, i4 - i2);
            if (this.f4865y == null) {
                this.f4865y = new C1369e(this.f4817A, this.f4866z, this.f4840a);
                setTouchDelegate(this.f4865y);
                return;
            }
            this.f4865y.mo5238a(this.f4817A, this.f4866z);
        }
    }

    /* renamed from: a */
    private Intent m4597a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4833Q);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f4861t != null) {
            intent.putExtra("app_data", this.f4861t);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f4860s.getSearchActivity());
        return intent;
    }
}
