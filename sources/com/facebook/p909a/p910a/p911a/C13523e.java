package com.facebook.p909a.p910a.p911a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.C2240a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.a.a.e */
public class C13523e {

    /* renamed from: a */
    private static final String f35299a = C13523e.class.getCanonicalName();

    /* renamed from: b */
    private static WeakReference<View> f35300b = new WeakReference<>(null);

    /* renamed from: c */
    private static Method f35301c = null;

    /* renamed from: j */
    private static boolean m27344j(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }

    /* renamed from: f */
    public static View m27340f(View view) {
        while (view != null) {
            if (!m27344j(view)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static List<View> m27341g(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static float[] m27345k(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    /* renamed from: c */
    public static String m27337c(View view) {
        CharSequence charSequence;
        if (view instanceof EditText) {
            charSequence = ((EditText) view).getHint();
        } else if (view instanceof TextView) {
            charSequence = ((TextView) view).getHint();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    /* renamed from: d */
    public static OnClickListener m27338d(View view) {
        OnClickListener onClickListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onClickListener = (OnClickListener) declaredField2.get(obj);
            } else {
                onClickListener = null;
            }
            return onClickListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static OnTouchListener m27339e(View view) {
        OnTouchListener onTouchListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField2.get(obj);
            } else {
                onTouchListener = null;
            }
            return onTouchListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static boolean m27342h(View view) {
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return false;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField2 == null || ((OnClickListener) declaredField2.get(obj)) == null) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: i */
    private static JSONObject m27343i(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m27333a(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f35300b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m27334a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List g = m27341g(view);
            for (int i = 0; i < g.size(); i++) {
                jSONArray.put(m27333a((View) g.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static String m27336b(View view) {
        Object obj;
        Object obj2 = null;
        if (view instanceof TextView) {
            obj2 = ((TextView) view).getText();
            if (view instanceof Switch) {
                if (((Switch) view).isChecked()) {
                    obj = "1";
                } else {
                    obj = "0";
                }
                obj2 = obj;
            }
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (spinner.getCount() > 0) {
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem != null) {
                    obj2 = selectedItem.toString();
                }
            }
        } else {
            int i = 0;
            if (view instanceof DatePicker) {
                DatePicker datePicker = (DatePicker) view;
                obj2 = C2240a.m6772a("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                obj2 = C2240a.m6772a("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                int childCount = radioGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = radioGroup.getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        obj2 = ((RadioButton) childAt).getText();
                        break;
                    }
                    i++;
                }
            } else if (view instanceof RatingBar) {
                obj2 = String.valueOf(((RatingBar) view).getRating());
            }
        }
        if (obj2 == null) {
            return "";
        }
        return obj2.toString();
    }

    /* renamed from: a */
    public static boolean m27335a(View view, View view2) {
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        View a = m27332a(m27345k(view), view2);
        if (a == null || a.getId() != view.getId()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static View m27332a(float[] fArr, View view) {
        if (f35301c == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                f35301c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        }
        if (f35301c == null || view == null) {
            return null;
        }
        try {
            View view2 = (View) f35301c.invoke(null, new Object[]{fArr, view});
            if (view2 != null && view2.getId() > 0) {
                View view3 = (View) view2.getParent();
                if (view3 != null) {
                    return view3;
                }
                return null;
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x014b, code lost:
        if (r4 != false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0160 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x017d A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0192 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[Catch:{ JSONException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a6 A[Catch:{ JSONException -> 0x01af }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m27334a(android.view.View r13, org.json.JSONObject r14) {
        /*
            java.lang.String r0 = m27336b(r13)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r1 = m27337c(r13)     // Catch:{ JSONException -> 0x01af }
            java.lang.Object r2 = r13.getTag()     // Catch:{ JSONException -> 0x01af }
            java.lang.CharSequence r3 = r13.getContentDescription()     // Catch:{ JSONException -> 0x01af }
            java.lang.String r4 = "classname"
            java.lang.Class r5 = r13.getClass()     // Catch:{ JSONException -> 0x01af }
            java.lang.String r5 = r5.getCanonicalName()     // Catch:{ JSONException -> 0x01af }
            r14.put(r4, r5)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r4 = "classtypebitmask"
            boolean r5 = r13 instanceof android.widget.ImageView     // Catch:{ JSONException -> 0x01af }
            r6 = 0
            if (r5 == 0) goto L_0x0026
            r5 = 2
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            boolean r7 = m27342h(r13)     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x002f
            r5 = r5 | 32
        L_0x002f:
            android.view.ViewParent r7 = r13.getParent()     // Catch:{ JSONException -> 0x01af }
            boolean r8 = r7 instanceof android.widget.AdapterView     // Catch:{ JSONException -> 0x01af }
            r9 = 1
            if (r8 != 0) goto L_0x003f
            boolean r7 = r7 instanceof android.support.p030v4.view.C1045j     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r7 = 0
            goto L_0x0040
        L_0x003f:
            r7 = 1
        L_0x0040:
            if (r7 == 0) goto L_0x0044
            r5 = r5 | 512(0x200, float:7.175E-43)
        L_0x0044:
            boolean r7 = r13 instanceof android.widget.TextView     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0067
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r5 = r5 | r9
            boolean r7 = r13 instanceof android.widget.Button     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0060
            r5 = r5 | 4
            boolean r7 = r13 instanceof android.widget.Switch     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0058
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0060
        L_0x0058:
            boolean r7 = r13 instanceof android.widget.CheckBox     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0060
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r7
        L_0x0060:
            boolean r7 = r13 instanceof android.widget.EditText     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0096
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x0096
        L_0x0067:
            boolean r7 = r13 instanceof android.widget.Spinner     // Catch:{ JSONException -> 0x01af }
            if (r7 != 0) goto L_0x0094
            boolean r7 = r13 instanceof android.widget.DatePicker     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0070
            goto L_0x0094
        L_0x0070:
            boolean r7 = r13 instanceof android.widget.RatingBar     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0078
            r7 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r7
            goto L_0x0096
        L_0x0078:
            boolean r7 = r13 instanceof android.widget.RadioGroup     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x007f
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x007f:
            boolean r7 = r13 instanceof android.view.ViewGroup     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0096
            java.lang.ref.WeakReference<android.view.View> r7 = f35300b     // Catch:{ JSONException -> 0x01af }
            java.lang.Object r7 = r7.get()     // Catch:{ JSONException -> 0x01af }
            android.view.View r7 = (android.view.View) r7     // Catch:{ JSONException -> 0x01af }
            boolean r7 = m27335a(r13, r7)     // Catch:{ JSONException -> 0x01af }
            if (r7 == 0) goto L_0x0096
            r5 = r5 | 64
            goto L_0x0096
        L_0x0094:
            r5 = r5 | 4096(0x1000, float:5.74E-42)
        L_0x0096:
            r14.put(r4, r5)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r4 = "id"
            int r5 = r13.getId()     // Catch:{ JSONException -> 0x01af }
            r14.put(r4, r5)     // Catch:{ JSONException -> 0x01af }
            boolean r4 = r13 instanceof android.widget.TextView     // Catch:{ JSONException -> 0x01af }
            if (r4 == 0) goto L_0x014e
            r4 = r13
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ JSONException -> 0x01af }
            int r5 = r4.getInputType()     // Catch:{ JSONException -> 0x01af }
            r7 = 128(0x80, float:1.794E-43)
            if (r5 != r7) goto L_0x00b3
            r5 = 1
            goto L_0x00b9
        L_0x00b3:
            android.text.method.TransformationMethod r5 = r4.getTransformationMethod()     // Catch:{ JSONException -> 0x01af }
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod     // Catch:{ JSONException -> 0x01af }
        L_0x00b9:
            if (r5 != 0) goto L_0x014d
            java.lang.String r5 = m27336b(r4)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r7 = "\\s"
            java.lang.String r8 = ""
            java.lang.String r5 = r5.replaceAll(r7, r8)     // Catch:{ JSONException -> 0x01af }
            int r7 = r5.length()     // Catch:{ JSONException -> 0x01af }
            r8 = 12
            if (r7 < r8) goto L_0x00ff
            r8 = 19
            if (r7 <= r8) goto L_0x00d4
            goto L_0x00ff
        L_0x00d4:
            int r7 = r7 - r9
            r8 = 0
            r10 = 0
        L_0x00d7:
            if (r7 < 0) goto L_0x00f9
            char r11 = r5.charAt(r7)     // Catch:{ JSONException -> 0x01af }
            r12 = 48
            if (r11 < r12) goto L_0x00ff
            r12 = 57
            if (r11 <= r12) goto L_0x00e6
            goto L_0x00ff
        L_0x00e6:
            int r11 = r11 + -48
            if (r10 == 0) goto L_0x00f3
            int r11 = r11 * 2
            r12 = 9
            if (r11 <= r12) goto L_0x00f3
            int r11 = r11 % 10
            int r11 = r11 + r9
        L_0x00f3:
            int r8 = r8 + r11
            r10 = r10 ^ 1
            int r7 = r7 + -1
            goto L_0x00d7
        L_0x00f9:
            int r8 = r8 % 10
            if (r8 != 0) goto L_0x00ff
            r5 = 1
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            if (r5 != 0) goto L_0x014d
            int r5 = r4.getInputType()     // Catch:{ JSONException -> 0x01af }
            r7 = 96
            if (r5 != r7) goto L_0x010c
            r5 = 1
            goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            if (r5 != 0) goto L_0x014d
            int r5 = r4.getInputType()     // Catch:{ JSONException -> 0x01af }
            r7 = 112(0x70, float:1.57E-43)
            if (r5 != r7) goto L_0x0119
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            if (r5 != 0) goto L_0x014d
            int r5 = r4.getInputType()     // Catch:{ JSONException -> 0x01af }
            r7 = 3
            if (r5 != r7) goto L_0x0125
            r5 = 1
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            if (r5 != 0) goto L_0x014d
            int r5 = r4.getInputType()     // Catch:{ JSONException -> 0x01af }
            r7 = 32
            if (r5 != r7) goto L_0x0132
            r4 = 1
            goto L_0x014b
        L_0x0132:
            java.lang.String r4 = m27336b(r4)     // Catch:{ JSONException -> 0x01af }
            if (r4 == 0) goto L_0x014a
            int r5 = r4.length()     // Catch:{ JSONException -> 0x01af }
            if (r5 != 0) goto L_0x013f
            goto L_0x014a
        L_0x013f:
            java.util.regex.Pattern r5 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ JSONException -> 0x01af }
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ JSONException -> 0x01af }
            boolean r4 = r4.matches()     // Catch:{ JSONException -> 0x01af }
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            if (r4 == 0) goto L_0x014e
        L_0x014d:
            r6 = 1
        L_0x014e:
            if (r6 != 0) goto L_0x0160
            java.lang.String r4 = "text"
            java.lang.String r0 = com.facebook.internal.C14277aa.m29278b(r0)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r5 = ""
            java.lang.String r0 = com.facebook.internal.C14277aa.m29253a(r0, r5)     // Catch:{ JSONException -> 0x01af }
            r14.put(r4, r0)     // Catch:{ JSONException -> 0x01af }
            goto L_0x016c
        L_0x0160:
            java.lang.String r0 = "text"
            java.lang.String r4 = ""
            r14.put(r0, r4)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r0 = "is_user_input"
            r14.put(r0, r9)     // Catch:{ JSONException -> 0x01af }
        L_0x016c:
            java.lang.String r0 = "hint"
            java.lang.String r1 = com.facebook.internal.C14277aa.m29278b(r1)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r4 = ""
            java.lang.String r1 = com.facebook.internal.C14277aa.m29253a(r1, r4)     // Catch:{ JSONException -> 0x01af }
            r14.put(r0, r1)     // Catch:{ JSONException -> 0x01af }
            if (r2 == 0) goto L_0x0190
            java.lang.String r0 = "tag"
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x01af }
            java.lang.String r1 = com.facebook.internal.C14277aa.m29278b(r1)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r2 = ""
            java.lang.String r1 = com.facebook.internal.C14277aa.m29253a(r1, r2)     // Catch:{ JSONException -> 0x01af }
            r14.put(r0, r1)     // Catch:{ JSONException -> 0x01af }
        L_0x0190:
            if (r3 == 0) goto L_0x01a5
            java.lang.String r0 = "description"
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x01af }
            java.lang.String r1 = com.facebook.internal.C14277aa.m29278b(r1)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r2 = ""
            java.lang.String r1 = com.facebook.internal.C14277aa.m29253a(r1, r2)     // Catch:{ JSONException -> 0x01af }
            r14.put(r0, r1)     // Catch:{ JSONException -> 0x01af }
        L_0x01a5:
            org.json.JSONObject r13 = m27343i(r13)     // Catch:{ JSONException -> 0x01af }
            java.lang.String r0 = "dimension"
            r14.put(r0, r13)     // Catch:{ JSONException -> 0x01af }
            return
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.p910a.p911a.C13523e.m27334a(android.view.View, org.json.JSONObject):void");
    }
}
