package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C2240a;
import com.squareup.p1094a.C18396v;
import com.squareup.p1094a.C18412z;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.internal.C52139s.C52141a;
import com.twitter.sdk.android.core.models.C52213q;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import java.util.Locale;

public class ComposerView extends LinearLayout {

    /* renamed from: a */
    ImageView f130070a;

    /* renamed from: b */
    ImageView f130071b;

    /* renamed from: c */
    EditText f130072c;

    /* renamed from: d */
    TextView f130073d;

    /* renamed from: e */
    Button f130074e;

    /* renamed from: f */
    ObservableScrollView f130075f;

    /* renamed from: g */
    View f130076g;

    /* renamed from: h */
    ColorDrawable f130077h;

    /* renamed from: i */
    ImageView f130078i;

    /* renamed from: j */
    C52241a f130079j;

    /* renamed from: k */
    private C18396v f130080k;

    /* access modifiers changed from: 0000 */
    public String getTweetText() {
        return this.f130072c.getText().toString();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f130070a = (ImageView) findViewById(R.id.dj3);
        this.f130071b = (ImageView) findViewById(R.id.dj5);
        this.f130072c = (EditText) findViewById(R.id.djd);
        this.f130073d = (TextView) findViewById(R.id.dj4);
        this.f130074e = (Button) findViewById(R.id.djh);
        this.f130075f = (ObservableScrollView) findViewById(R.id.dj8);
        this.f130076g = findViewById(R.id.dj7);
        this.f130078i = (ImageView) findViewById(R.id.djg);
        this.f130071b.setOnClickListener(new C52246d(this));
        this.f130074e.setOnClickListener(new C52247e(this));
        this.f130072c.setOnEditorActionListener(new C52248f(this));
        this.f130072c.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                ComposerView.this.f130079j.mo108991a(ComposerView.this.getTweetText());
            }
        });
        this.f130075f.setScrollViewListener(new C52249g(this));
    }

    /* access modifiers changed from: 0000 */
    public void setCallbacks(C52241a aVar) {
        this.f130079j = aVar;
    }

    public ComposerView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    public void setTweetText(String str) {
        this.f130072c.setText(str);
    }

    /* access modifiers changed from: 0000 */
    public void setCharCountTextStyle(int i) {
        this.f130073d.setTextAppearance(getContext(), i);
    }

    /* access modifiers changed from: 0000 */
    public void setCharCount(int i) {
        this.f130073d.setText(C2240a.m6773a(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: 0000 */
    public void setImageView(Uri uri) {
        if (this.f130080k != null) {
            this.f130078i.setVisibility(0);
            this.f130080k.mo36848a(uri).mo36885a(this.f130078i);
        }
    }

    /* renamed from: a */
    private void m111649a(Context context) {
        this.f130080k = C18396v.m44672a(getContext());
        this.f130077h = new ColorDrawable(context.getResources().getColor(R.color.am_));
        inflate(context, R.layout.asq, this);
    }

    /* access modifiers changed from: 0000 */
    public void setProfilePhotoView(C52213q qVar) {
        String str;
        C52141a aVar = C52141a.REASONABLY_SMALL;
        if (qVar != null && qVar.profileImageUrlHttps != null) {
            str = qVar.profileImageUrlHttps;
            if (!(aVar == null || str == null)) {
                switch (aVar) {
                    case NORMAL:
                    case BIGGER:
                    case MINI:
                    case ORIGINAL:
                    case REASONABLY_SMALL:
                        str = str.replace(C52141a.NORMAL.suffix, aVar.suffix);
                        break;
                }
            }
        } else {
            str = null;
        }
        if (this.f130080k != null) {
            C18412z a = this.f130080k.mo36849a(str);
            ColorDrawable colorDrawable = this.f130077h;
            if (!a.f50876d) {
                throw new IllegalStateException("Already explicitly declared as no placeholder.");
            } else if (a.f50877e == 0) {
                a.f50881i = colorDrawable;
                a.mo36885a(this.f130070a);
            } else {
                throw new IllegalStateException("Placeholder image already set.");
            }
        }
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m111649a(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m111649a(context);
    }
}
