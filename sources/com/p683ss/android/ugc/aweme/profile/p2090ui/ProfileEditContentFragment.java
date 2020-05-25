package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.profile.util.C40570u;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment */
public final class ProfileEditContentFragment extends C40317db {

    /* renamed from: f */
    public static final C40138a f102399f = new C40138a(null);

    /* renamed from: b */
    public String f102400b = "";

    /* renamed from: c */
    public boolean f102401c;

    /* renamed from: d */
    public int f102402d;

    /* renamed from: e */
    public boolean f102403e;

    /* renamed from: g */
    private String f102404g = "";

    /* renamed from: h */
    private String f102405h = "";

    /* renamed from: i */
    private C40139b f102406i;

    /* renamed from: l */
    private HashMap f102407l;
    @BindView(2131493872)
    public ImageView mClearAllBtn;
    @BindView(2131493533)
    public EditText mEditContentInput;
    @BindView(2131495062)
    public TextView mEditLengthHint;
    @BindView(2131495060)
    public TextView mIdEditHintText;
    @BindView(2131495049)
    public TextView mTvContentName;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$a */
    public static final class C40138a {
        private C40138a() {
        }

        public /* synthetic */ C40138a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$b */
    public interface C40139b {
        /* renamed from: a */
        void mo82295a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$c */
    public static final class C40140c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f102408a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C40140c(ProfileEditContentFragment profileEditContentFragment) {
            this.f102408a = profileEditContentFragment;
        }

        public final void afterTextChanged(Editable editable) {
            C52711k.m112240b(editable, "s");
            if (this.f102408a.f102401c) {
                if (editable.length() <= 0 && !this.f102408a.f102403e) {
                    this.f102408a.mo82338h();
                } else if (!TextUtils.equals(editable.toString(), this.f102408a.f102400b)) {
                    this.f102408a.mo82337g();
                } else {
                    this.f102408a.mo82338h();
                }
                if (editable.length() > 0) {
                    this.f102408a.mo82292c().setVisibility(0);
                    return;
                }
                this.f102408a.mo82292c().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            if (this.f102408a.f102402d != 0) {
                if (ProfileEditContentFragment.m89662a(this.f102408a.mo82291b(), this.f102408a.f102402d)) {
                    C10691a.m21548c((Context) this.f102408a.getActivity(), (int) R.string.rc).mo19066a();
                    this.f102408a.mo82293f().setTextColor(this.f102408a.getResources().getColor(R.color.mv));
                } else {
                    this.f102408a.mo82293f().setTextColor(this.f102408a.getResources().getColor(R.color.a1a));
                }
                this.f102408a.mo82293f().setText(this.f102408a.getString(R.string.a0h, Integer.valueOf(this.f102408a.mo82291b().length()), Integer.valueOf(this.f102408a.f102402d)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$d */
    static final class C40141d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f102409a;

        C40141d(ProfileEditContentFragment profileEditContentFragment) {
            this.f102409a = profileEditContentFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f102409a.mo82269d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$e */
    static final class C40142e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditContentFragment f102410a;

        C40142e(ProfileEditContentFragment profileEditContentFragment) {
            this.f102410a = profileEditContentFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m58184c(this.f102410a.mo82291b());
            C40570u.m90005a("save_profile", "click_save");
            this.f102410a.mo82270e();
            this.f102410a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment$f */
    static final class C40143f implements OnEditorActionListener {

        /* renamed from: a */
        public static final C40143f f102411a = new C40143f();

        C40143f() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo82266a() {
        if (this.f102407l != null) {
            this.f102407l.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82266a();
    }

    /* renamed from: b */
    public final EditText mo82291b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final ImageView mo82292c() {
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C52711k.m112237a("mClearAllBtn");
        }
        return imageView;
    }

    /* renamed from: f */
    public final TextView mo82293f() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C52711k.m112237a("mEditLengthHint");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82270e() {
        C40139b bVar = this.f102406i;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C52711k.m112237a("mEditContentInput");
            }
            bVar.mo82295a(editText.getText().toString());
        }
    }

    @OnClick({2131493872})
    public final void onClear() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText.setText("");
    }

    /* renamed from: d */
    public final boolean mo82269d() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        KeyboardUtils.m58184c(editText);
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            C52711k.m112236a((Object) dialog, "dialog");
            if (dialog.isShowing() && isResumed()) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo82290a(C40139b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f102406i = bVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            String string = arguments.getString("content_name");
            C52711k.m112236a((Object) string, "arguments!!.getString(CONTENT_NAME)");
            this.f102404g = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            String string2 = arguments2.getString("content_value");
            C52711k.m112236a((Object) string2, "arguments!!.getString(CONTENT_VALUE)");
            this.f102400b = string2;
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C52711k.m112234a();
            }
            this.f102401c = arguments3.getBoolean("is_edit_enabled");
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C52711k.m112234a();
            }
            String string3 = arguments4.getString("edit_hint");
            C52711k.m112236a((Object) string3, "arguments!!.getString(CONTENT_EDIT_HINT)");
            this.f102405h = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C52711k.m112234a();
            }
            this.f102402d = arguments5.getInt("content_max_length");
            Bundle arguments6 = getArguments();
            if (arguments6 == null) {
                C52711k.m112234a();
            }
            this.f102403e = arguments6.getBoolean("is_enable_null");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Integer num;
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bp0, viewGroup, false);
        C47887fi fiVar = C47887fi.f120483a;
        Activity activity = getActivity();
        Dialog dialog = getDialog();
        C52711k.m112236a((Object) dialog, "dialog");
        fiVar.mo95098a(activity, dialog.getWindow(), true);
        this.f102920j = (TextTitleBar) inflate.findViewById(R.id.d10);
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            textTitleBar.setTitle((CharSequence) this.f102404g);
        }
        ButterKnife.bind((Object) this, inflate);
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C52711k.m112237a("mTvContentName");
        }
        textView.setText(this.f102404g);
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C52711k.m112237a("mClearAllBtn");
        }
        imageView.setImageResource(R.drawable.dso);
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText.addTextChangedListener(new C40140c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText2.setText(this.f102400b);
        EditText editText3 = this.mEditContentInput;
        if (editText3 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        EditText editText4 = this.mEditContentInput;
        if (editText4 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText3.setSelection(editText4.getText().length());
        EditText editText5 = this.mEditContentInput;
        if (editText5 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText5.setFocusable(true);
        EditText editText6 = this.mEditContentInput;
        if (editText6 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText6.setFocusableInTouchMode(true);
        EditText editText7 = this.mEditContentInput;
        if (editText7 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText7.requestFocus();
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView startText = textTitleBar2.getStartText();
            if (startText != null) {
                startText.setOnClickListener(new C40141d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C40142e(this));
            }
        }
        if (!this.f102401c) {
            EditText editText8 = this.mEditContentInput;
            if (editText8 == null) {
                C52711k.m112237a("mEditContentInput");
            }
            editText8.setEnabled(false);
            EditText editText9 = this.mEditContentInput;
            if (editText9 == null) {
                C52711k.m112237a("mEditContentInput");
            }
            editText9.setFocusable(false);
            EditText editText10 = this.mEditContentInput;
            if (editText10 == null) {
                C52711k.m112237a("mEditContentInput");
            }
            editText10.setFocusableInTouchMode(false);
            ImageView imageView2 = this.mClearAllBtn;
            if (imageView2 == null) {
                C52711k.m112237a("mClearAllBtn");
            }
            imageView2.setVisibility(8);
        }
        mo82338h();
        if (TextUtils.isEmpty(this.f102405h)) {
            TextView textView2 = this.mIdEditHintText;
            if (textView2 == null) {
                C52711k.m112237a("mIdEditHintText");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.mIdEditHintText;
            if (textView3 == null) {
                C52711k.m112237a("mIdEditHintText");
            }
            textView3.setText(this.f102405h);
        }
        if (this.f102402d > 0) {
            TextView textView4 = this.mEditLengthHint;
            if (textView4 == null) {
                C52711k.m112237a("mEditLengthHint");
            }
            textView4.setVisibility(0);
            TextView textView5 = this.mEditLengthHint;
            if (textView5 == null) {
                C52711k.m112237a("mEditLengthHint");
            }
            Object[] objArr = new Object[2];
            if (TextUtils.isEmpty(this.f102400b)) {
                i = 0;
            } else {
                String str = this.f102400b;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                i = num.intValue();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f102402d);
            textView5.setText(getString(R.string.a0h, objArr));
        }
        EditText editText11 = this.mEditContentInput;
        if (editText11 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(C40143f.f102411a);
        return inflate;
    }

    /* renamed from: a */
    public static final ProfileEditContentFragment m89280a(String str, String str2, boolean z, String str3, int i, boolean z2) {
        C52711k.m112240b(str, "contentName");
        C52711k.m112240b(str2, "contentValue");
        C52711k.m112240b(str3, "editHint");
        ProfileEditContentFragment profileEditContentFragment = new ProfileEditContentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("content_name", str);
        bundle.putString("content_value", str2);
        bundle.putBoolean("is_edit_enabled", true);
        bundle.putString("edit_hint", str3);
        bundle.putInt("content_max_length", i);
        bundle.putBoolean("is_enable_null", z2);
        profileEditContentFragment.setArguments(bundle);
        return profileEditContentFragment;
    }
}
