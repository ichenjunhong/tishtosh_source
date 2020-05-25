package com.bytedance.android.live.core.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.C2940a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashSet;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.core.setting.a */
public final class C4078a extends C2940a {

    /* renamed from: e */
    private static HashSet<Class> f11229e;

    /* renamed from: a */
    LinearLayout f11230a;

    /* renamed from: b */
    C4097p f11231b;

    /* renamed from: c */
    int f11232c;

    /* renamed from: d */
    C1710e<Integer> f11233d;

    static {
        HashSet<Class> hashSet = new HashSet<>();
        f11229e = hashSet;
        hashSet.add(Boolean.class);
        f11229e.add(Boolean.TYPE);
        f11229e.add(Integer.class);
        f11229e.add(Integer.TYPE);
        f11229e.add(Float.class);
        f11229e.add(Float.TYPE);
        f11229e.add(Long.class);
        f11229e.add(Long.TYPE);
        f11229e.add(Double.class);
        f11229e.add(Double.TYPE);
        f11229e.add(String.class);
    }

    /* renamed from: a */
    static View m10195a(ViewGroup viewGroup, Object obj) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) != null && obj == viewGroup.getChildAt(i).getTag()) {
                return viewGroup.getChildAt(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo9419a(Class<T> cls, View view) {
        Field[] declaredFields;
        T t = null;
        if (view == null) {
            return null;
        }
        if (!f11229e.contains(cls)) {
            try {
                t = cls.newInstance();
            } catch (Exception unused) {
            }
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    try {
                        field.set(t, mo9419a(field.getType(), m10195a((ViewGroup) view, (Object) field.getName())));
                    } catch (Exception unused2) {
                    }
                }
            }
            return t;
        }
        T obj = ((EditText) view.findViewById(R.id.do9)).getText().toString();
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            try {
                t = Boolean.valueOf(((CheckedTextView) view.findViewById(R.id.lh)).isChecked());
            } catch (Exception unused3) {
                t = Boolean.valueOf(false);
            }
        } else if (cls == Integer.class || cls == Integer.TYPE) {
            try {
                t = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
            } catch (Exception unused4) {
                t = Integer.valueOf(0);
            }
        } else if (cls == Long.class || cls == Long.TYPE) {
            try {
                t = Long.valueOf(Long.parseLong(obj));
            } catch (Exception unused5) {
                t = Long.valueOf(0);
            }
        } else if (cls == Float.class || cls == Float.TYPE) {
            try {
                t = Float.valueOf(Float.parseFloat(obj));
            } catch (Exception unused6) {
                t = Float.valueOf(0.0f);
            }
        } else if (cls == Double.class || cls == Double.TYPE) {
            try {
                t = Double.valueOf(Double.parseDouble(obj));
            } catch (Exception unused7) {
                t = Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            }
        } else if (cls == String.class) {
            t = obj;
        }
        return t;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ah_, null);
        this.f11230a = (LinearLayout) inflate.findViewById(R.id.ze);
        inflate.findViewById(R.id.q7).setOnClickListener(new C4080b(this));
        inflate.findViewById(R.id.bud).setOnClickListener(new C4081c(this));
        getDialog().requestWindowFeature(1);
        Type c = C4098q.m10223c(this.f11231b);
        if (c instanceof Class) {
            m10196a(C4098q.m10216a(this.f11231b), (Class) c, this.f11230a, 1);
        }
        return inflate;
    }

    /* renamed from: a */
    private void m10196a(String str, Class cls, LinearLayout linearLayout, int i) {
        Field[] declaredFields;
        if (f11229e.contains(cls)) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ah9, null);
            ((TextView) inflate.findViewById(R.id.b62)).setText(str);
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                inflate.findViewById(R.id.do9).setVisibility(8);
                final CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(R.id.lh);
                checkedTextView.setVisibility(0);
                checkedTextView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        checkedTextView.toggle();
                        checkedTextView.setText(String.valueOf(checkedTextView.isChecked()));
                    }
                });
            } else {
                ((EditText) inflate.findViewById(R.id.do9)).setHint(cls.getSimpleName());
            }
            inflate.setTag(str);
            linearLayout.addView(inflate);
        } else if (i <= 3) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setTag(str);
            if (i > 1) {
                linearLayout2.setVisibility(8);
            }
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = 100;
            linearLayout.addView(linearLayout2, marginLayoutParams);
            textView.setOnClickListener(new C4082d(linearLayout2));
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    m10196a(field.getName(), field.getType(), linearLayout2, i + 1);
                }
            }
        }
    }
}
