package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.EffectTextInputView */
public class EffectTextInputView extends FrameLayout {

    /* renamed from: a */
    protected EditText f117390a;

    /* renamed from: b */
    protected View f117391b;

    /* renamed from: c */
    protected View f117392c;

    /* renamed from: d */
    protected View f117393d;

    /* renamed from: e */
    protected InputMethodManager f117394e;

    /* renamed from: f */
    protected C46525a f117395f;

    /* renamed from: g */
    protected String f117396g;

    /* renamed from: h */
    protected int f117397h;

    /* renamed from: i */
    protected String f117398i;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.EffectTextInputView$a */
    public interface C46525a {
        /* renamed from: a */
        void mo93304a(String str);

        /* renamed from: b */
        void mo93305b(String str);
    }

    /* renamed from: a */
    public void mo93287a() {
        mo93297b();
    }

    /* renamed from: a */
    public void mo93276a(int i) {
    }

    /* access modifiers changed from: 0000 */
    public int getLayout() {
        return R.layout.a6r;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public void setHintText(String str) {
    }

    public void dismiss() {
        setVisibility(8);
    }

    /* renamed from: d */
    public final void mo93299d() {
        this.f117390a.requestFocus();
        setVisibility(0);
    }

    /* renamed from: b */
    public final void mo93297b() {
        if (this.f117390a != null && this.f117394e != null) {
            this.f117394e.hideSoftInputFromWindow(this.f117390a.getWindowToken(), 0);
        }
    }

    /* renamed from: c */
    public final void mo93298c() {
        if (this.f117390a != null && this.f117394e != null) {
            this.f117390a.requestFocus();
            this.f117394e.showSoftInput(this.f117390a, 0);
        }
    }

    public String getText() {
        if (this.f117390a == null || this.f117390a.getEditableText() == null) {
            return null;
        }
        return this.f117390a.getEditableText().toString();
    }

    public void setEffectTextChangeListener(C46525a aVar) {
        this.f117395f = aVar;
    }

    public void setMaxTextCount(int i) {
        this.f117397h = i;
    }

    public EffectTextInputView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93296a(View view) {
        mo93297b();
    }

    public void setText(String str) {
        if (this.f117390a != null && str != null) {
            this.f117390a.setText(str);
            int length = str.length();
            if (length < this.f117390a.getText().length()) {
                this.f117390a.setSelection(length);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93288a(Context context) {
        setVisibility(8);
        this.f117392c = LayoutInflater.from(context).inflate(getLayout(), this);
        this.f117390a = (EditText) findViewById(R.id.a9z);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.f117390a.addTextChangedListener(textWatcher);
        }
        this.f117391b = findViewById(R.id.cv6);
        this.f117391b.setOnClickListener(new C46538k(this));
        this.f117393d = findViewById(R.id.d1b);
        setOnClickListener(new C46539l(this));
    }

    public EffectTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo93288a(context);
        this.f117394e = (InputMethodManager) context.getSystemService("input_method");
        this.f117396g = context.getResources().getString(R.string.d52);
    }
}
