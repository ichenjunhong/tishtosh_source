package com.p683ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48393a.C48394a;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout */
public class TagFlowLayout extends FlowLayout implements C48394a {

    /* renamed from: a */
    private C48393a f121720a;

    /* renamed from: b */
    private int f121721b;

    /* renamed from: c */
    private Set<Integer> f121722c;

    /* renamed from: h */
    private C48390a f121723h;

    /* renamed from: i */
    private C48392c f121724i;

    /* renamed from: j */
    private C48391b f121725j;

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$a */
    public interface C48390a {
    }

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$b */
    public interface C48391b {
    }

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$c */
    public interface C48392c {
    }

    public C48393a getAdapter() {
        return this.f121720a;
    }

    /* renamed from: c */
    private static MarginLayoutParams m104705c() {
        return new MarginLayoutParams(-2, -2);
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f121722c);
    }

    /* renamed from: a */
    public final void mo95849a() {
        this.f121722c.clear();
        m104704b();
    }

    /* renamed from: b */
    private void m104704b() {
        removeAllViews();
        C48393a aVar = this.f121720a;
        HashSet<Integer> hashSet = this.f121720a.f121729e;
        for (int i = 0; i < aVar.mo95860a(); i++) {
            View a = aVar.mo56339a(this, i, aVar.mo95861a(i));
            C48396c cVar = new C48396c(getContext());
            aVar.mo95862a(i, cVar);
            cVar.setAllowSelect(true);
            a.setDuplicateParentStateEnabled(true);
            if (a.getLayoutParams() != null) {
                cVar.setLayoutParams(a.getLayoutParams());
            } else {
                cVar.setLayoutParams(m104705c());
            }
            a.setLayoutParams(new LayoutParams(-1, -1));
            cVar.addView(a);
            addView(cVar);
            if (hashSet.contains(Integer.valueOf(i))) {
                mo60848a(i, cVar);
            }
            aVar.mo95861a(i);
            a.setClickable(false);
            cVar.setOnClickListener(new C48395b(this, cVar, i));
        }
        this.f121722c.addAll(hashSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        StringBuilder sb = new StringBuilder();
        if (this.f121722c.size() > 0) {
            for (Integer intValue : this.f121722c) {
                sb.append(intValue.intValue());
                sb.append("|");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        bundle.putString("key_choose_pos", sb.toString());
        return bundle;
    }

    public void setOnSelectListener(C48390a aVar) {
        this.f121723h = aVar;
    }

    public void setOnSelectStateChangeListener(C48391b bVar) {
        this.f121725j = bVar;
    }

    public void setOnTagClickListener(C48392c cVar) {
        this.f121724i = cVar;
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void setAdapter(C48393a aVar) {
        this.f121720a = aVar;
        this.f121720a.f121728d = this;
        this.f121722c.clear();
        m104704b();
    }

    public void setMaxSelectCount(int i) {
        if (this.f121722c.size() > i) {
            this.f121722c.clear();
        }
        this.f121721b = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String parseInt : string.split("\\|")) {
                    int parseInt2 = Integer.parseInt(parseInt);
                    this.f121722c.add(Integer.valueOf(parseInt2));
                    C48396c cVar = (C48396c) getChildAt(parseInt2);
                    if (cVar != null) {
                        mo60848a(parseInt2, cVar);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo60850b(int i, C48396c cVar) {
        cVar.setChecked(false);
        this.f121720a.mo60844b(i, cVar.getTagView());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60848a(int i, C48396c cVar) {
        cVar.setChecked(true);
        this.f121720a.mo60843a(i, cVar.getTagView());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C48396c cVar = (C48396c) getChildAt(i3);
            if (cVar.getVisibility() != 8 && cVar.getTagView().getVisibility() == 8) {
                cVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121721b = -1;
        this.f121722c = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.u0, R.attr.a5e, R.attr.a5f, R.attr.a5g, R.attr.a5h});
        this.f121721b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95850a(C48396c cVar, int i, View view) {
        if (cVar.f121734a) {
            if (cVar.isChecked()) {
                mo60850b(i, cVar);
                this.f121722c.remove(Integer.valueOf(i));
            } else if (this.f121721b == 1 && this.f121722c.size() == 1) {
                Integer num = (Integer) this.f121722c.iterator().next();
                mo60850b(num.intValue(), (C48396c) getChildAt(num.intValue()));
                mo60848a(i, cVar);
                this.f121722c.remove(num);
                this.f121722c.add(Integer.valueOf(i));
            } else if (this.f121721b <= 0 || this.f121722c.size() < this.f121721b) {
                mo60848a(i, cVar);
                this.f121722c.add(Integer.valueOf(i));
                C48391b bVar = this.f121725j;
            } else {
                return;
            }
            if (this.f121723h != null) {
                new HashSet(this.f121722c);
            }
        }
    }
}
