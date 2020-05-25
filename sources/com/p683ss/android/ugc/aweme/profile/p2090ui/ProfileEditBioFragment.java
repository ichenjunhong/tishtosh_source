package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment */
public final class ProfileEditBioFragment extends C40317db {

    /* renamed from: d */
    public static final C40124a f102367d = new C40124a(null);

    /* renamed from: b */
    public String f102368b = "";

    /* renamed from: c */
    C40125b f102369c;

    /* renamed from: e */
    private String f102370e = "";

    /* renamed from: f */
    private HashMap f102371f;
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

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$a */
    public static final class C40124a {
        private C40124a() {
        }

        public /* synthetic */ C40124a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$b */
    public interface C40125b {
        /* renamed from: a */
        void mo82272a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$c */
    public static final class C40126c implements TextWatcher {

        /* renamed from: a */
        public String f102372a = "";

        /* renamed from: b */
        final /* synthetic */ ProfileEditBioFragment f102373b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C40126c(ProfileEditBioFragment profileEditBioFragment) {
            this.f102373b = profileEditBioFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C52711k.m112240b(editable, "s");
            if (this.f102373b.mo82267b().getLineCount() > 5) {
                String obj = editable.toString();
                int selectionStart = this.f102373b.mo82267b().getSelectionStart();
                if (selectionStart != this.f102373b.mo82267b().getSelectionEnd() || selectionStart >= obj.length() || selectionStart <= 0) {
                    int length = editable.length() - 1;
                    if (obj != null) {
                        str = obj.substring(0, length);
                        C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    int i = selectionStart - 1;
                    if (obj != null) {
                        String substring = obj.substring(0, i);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        if (obj != null) {
                            String substring2 = obj.substring(selectionStart);
                            C52711k.m112236a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                            sb.append(substring2);
                            str = sb.toString();
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                this.f102372a = str;
                this.f102373b.mo82267b().setText(str);
                this.f102373b.mo82267b().setSelection(this.f102373b.mo82267b().getText().length());
                return;
            }
            this.f102372a = editable.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            if (ProfileEditBioFragment.m89662a(this.f102373b.mo82267b(), 80)) {
                C10691a.m21548c((Context) this.f102373b.getActivity(), (int) R.string.rc).mo19066a();
                this.f102373b.mo82268c().setTextColor(this.f102373b.getResources().getColor(R.color.mv));
            } else {
                this.f102373b.mo82268c().setTextColor(this.f102373b.getResources().getColor(R.color.a1a));
            }
            this.f102373b.mo82268c().setText(this.f102373b.getString(R.string.a0h, Integer.valueOf(this.f102373b.mo82267b().length()), Integer.valueOf(80)));
            if (!TextUtils.equals(charSequence.toString(), this.f102373b.f102368b)) {
                this.f102373b.mo82337g();
            } else {
                this.f102373b.mo82338h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$d */
    static final class C40127d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioFragment f102374a;

        C40127d(ProfileEditBioFragment profileEditBioFragment) {
            this.f102374a = profileEditBioFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f102374a.mo82269d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment$e */
    static final class C40128e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioFragment f102375a;

        C40128e(ProfileEditBioFragment profileEditBioFragment) {
            this.f102375a = profileEditBioFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m58184c(this.f102375a.mo82267b());
            C40570u.m90005a("save_profile", "click_save");
            KeyboardUtils.m58184c(this.f102375a.mo82267b());
            this.f102375a.mo82270e();
            this.f102375a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo82266a() {
        if (this.f102371f != null) {
            this.f102371f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82266a();
    }

    /* renamed from: b */
    public final EditText mo82267b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final TextView mo82268c() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C52711k.m112237a("mEditLengthHint");
        }
        return textView;
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

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82270e() {
        int i;
        boolean z;
        C40125b bVar = this.f102369c;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C52711k.m112237a("mEditContentInput");
            }
            CharSequence obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (obj.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            bVar.mo82272a(obj.subSequence(i2, length + 1).toString());
        }
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
            this.f102370e = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            String string2 = arguments2.getString("content_value");
            C52711k.m112236a((Object) string2, "arguments!!.getString(CONTENT_VALUE)");
            this.f102368b = string2;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
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
            textTitleBar.setTitle((CharSequence) this.f102370e);
        }
        ButterKnife.bind((Object) this, inflate);
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C52711k.m112237a("mTvContentName");
        }
        textView.setText(this.f102370e);
        TextView textView2 = this.mEditLengthHint;
        if (textView2 == null) {
            C52711k.m112237a("mEditLengthHint");
        }
        textView2.setVisibility(0);
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C52711k.m112237a("mClearAllBtn");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.mClearAllBtn;
        if (imageView2 == null) {
            C52711k.m112237a("mClearAllBtn");
        }
        imageView2.setImageResource(R.drawable.dso);
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText.addTextChangedListener(new C40126c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText2.setText(this.f102368b);
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
                startText.setOnClickListener(new C40127d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C40128e(this));
            }
        }
        mo82338h();
        return inflate;
    }
}
