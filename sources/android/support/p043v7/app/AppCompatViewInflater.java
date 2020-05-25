package android.support.p043v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.p030v4.p038f.C0777a;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.AppCompatAutoCompleteTextView;
import android.support.p043v7.widget.AppCompatButton;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.support.p043v7.widget.AppCompatCheckedTextView;
import android.support.p043v7.widget.AppCompatEditText;
import android.support.p043v7.widget.AppCompatImageButton;
import android.support.p043v7.widget.AppCompatImageView;
import android.support.p043v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.p043v7.widget.AppCompatRadioButton;
import android.support.p043v7.widget.AppCompatRatingBar;
import android.support.p043v7.widget.AppCompatSeekBar;
import android.support.p043v7.widget.AppCompatSpinner;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.C1447ay;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0777a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    static class C1157a implements OnClickListener {

        /* renamed from: a */
        private final View f3797a;

        /* renamed from: b */
        private final String f3798b;

        /* renamed from: c */
        private Method f3799c;

        /* renamed from: d */
        private Context f3800d;

        public final void onClick(View view) {
            String str;
            if (this.f3799c == null) {
                Context context = this.f3797a.getContext();
                String str2 = this.f3798b;
                while (context != null) {
                    try {
                        if (!context.isRestricted()) {
                            Method method = context.getClass().getMethod(this.f3798b, new Class[]{View.class});
                            if (method != null) {
                                this.f3799c = method;
                                this.f3800d = context;
                            }
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id = this.f3797a.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder sb = new StringBuilder(" with id '");
                    sb.append(this.f3797a.getContext().getResources().getResourceEntryName(id));
                    sb.append("'");
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder("Could not find method ");
                sb2.append(this.f3798b);
                sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sb2.append(this.f3797a.getClass());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            try {
                this.f3799c.invoke(this.f3800d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        public C1157a(View view, String str) {
            this.f3797a = view;
            this.f3798b = str;
        }
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: protected */
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkOnClickListener(android.view.View r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0034
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 15
            if (r1 < r3) goto L_0x001c
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x0018
            boolean r1 = r5.hasOnClickListeners()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x001c
            goto L_0x0034
        L_0x001c:
            int[] r1 = sOnClickAttrs
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            java.lang.String r0 = r6.getString(r2)
            if (r0 == 0) goto L_0x0030
            android.support.v7.app.AppCompatViewInflater$a r1 = new android.support.v7.app.AppCompatViewInflater$a
            r1.<init>(r5, r0)
            r5.setOnClickListener(r1)
        L_0x0030:
            r6.recycle()
            return
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.app.AppCompatViewInflater.checkOnClickListener(android.view.View, android.util.AttributeSet):void");
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String createViewByPrefix : sClassPrefixList) {
                    View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        return createViewByPrefix2;
                    }
                }
                this.mConstructorArgs[0] = null;
                this.mConstructorArgs[1] = null;
                return null;
            }
            View createViewByPrefix3 = createViewByPrefix(context, str, null);
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            return createViewByPrefix3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842752, 16842970, R.attr.v5, R.attr.v6, R.attr.a6g}, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0) {
            i = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof C1221d) || ((C1221d) context).f4020a != i) {
            return new C1221d(context, i);
        }
        return context;
    }

    /* access modifiers changed from: 0000 */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1447ay.m5028a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 8:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 10:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 12:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
