package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.util.C22278r.C22279a;
import com.p683ss.android.ugc.aweme.account.util.C22278r.C22280b;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.main.service.C36681c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView */
public class PhonePassLoginView extends LinearLayout implements C21109n {

    /* renamed from: a */
    public static final String f58409a = "PhonePassLoginView";

    /* renamed from: b */
    LoginButton f58410b;

    /* renamed from: c */
    public C21538a f58411c;

    /* renamed from: d */
    public boolean f58412d;

    /* renamed from: e */
    public C0184k f58413e;

    /* renamed from: f */
    public EditText f58414f;

    /* renamed from: g */
    private TextView f58415g;

    /* renamed from: h */
    private String f58416h;

    /* renamed from: i */
    private View f58417i;

    /* renamed from: j */
    private String f58418j;

    /* renamed from: k */
    private int f58419k;

    /* renamed from: l */
    private OnClickListener f58420l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView$SavedState */
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
        final boolean f58422a;

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f58422a = z;
        }

        SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f58422a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58422a ? 1 : 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView$a */
    public interface C21538a {
        /* renamed from: a */
        void mo45788a();
    }

    /* renamed from: a */
    public final void mo45160a() {
        if (this.f58410b != null) {
            this.f58410b.mo45160a();
        }
    }

    /* renamed from: c */
    public final void mo45161c() {
        if (this.f58410b != null) {
            this.f58410b.mo45161c();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f58412d);
    }

    public void setEditText(EditText editText) {
        this.f58414f = editText;
    }

    public void setEnterMethod(String str) {
        this.f58416h = str;
    }

    public void setLifecycleOwner(C0184k kVar) {
        this.f58413e = kVar;
    }

    public void setLoginListener(C21538a aVar) {
        this.f58411c = aVar;
    }

    public PhonePassLoginView(Context context) {
        this(context, null);
    }

    public void setLoginBtnEnable(boolean z) {
        this.f58410b.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f58412d != savedState.f58422a) {
            mo45776a(savedState.f58422a);
        }
    }

    /* renamed from: a */
    public final void mo45776a(boolean z) {
        ImageView imageView = (ImageView) findViewById(R.id.c4m);
        if (z) {
            imageView.setImageResource(R.drawable.cgp);
        } else {
            imageView.setImageResource(R.drawable.cgo);
        }
        if (imageView.getVisibility() == 0) {
            if (z) {
                imageView.setContentDescription(getResources().getString(R.string.a1w, new Object[]{this.f58418j}));
                this.f58415g.setContentDescription(getResources().getString(R.string.a1w, new Object[]{this.f58418j}));
            } else {
                imageView.setContentDescription(getResources().getString(R.string.f6u, new Object[]{this.f58418j}));
                this.f58415g.setContentDescription(getResources().getString(R.string.f6u, new Object[]{this.f58418j}));
            }
        }
        this.f58412d = z;
    }

    public PhonePassLoginView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhonePassLoginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58420l = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (view.getId() == R.id.o9) {
                    ((C36681c) C23826bi.m58450a(C36681c.class)).mo47871a("login");
                }
                KeyboardUtils.m58184c(PhonePassLoginView.this.f58414f);
                if (PhonePassLoginView.this.f58411c != null) {
                    PhonePassLoginView.this.f58411c.mo45788a();
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.b16, this);
        setOrientation(1);
        this.f58410b = (LoginButton) findViewById(R.id.o9);
        this.f58410b.setOnClickListener(this.f58420l);
        this.f58410b.setEnabled(false);
        this.f58415g = (TextView) findViewById(R.id.dbl);
        this.f58417i = findViewById(R.id.c4n);
        this.f58419k = getResources().getColor(R.color.a10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(getResources().getString(R.string.c2l));
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.fa0));
        spannableString.setSpan(new C22280b(this.f58419k), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(getResources().getString(R.string.cwz));
        spannableString2.setSpan(new C22279a(this.f58419k), 0, spannableString2.length(), 33);
        spannableStringBuilder.append(spannableString).append(getResources().getString(R.string.c2m)).append(spannableString2);
        this.f58415g.setMovementMethod(LinkMovementMethod.getInstance());
        this.f58415g.setHighlightColor(0);
        this.f58415g.setText(spannableStringBuilder);
    }
}
