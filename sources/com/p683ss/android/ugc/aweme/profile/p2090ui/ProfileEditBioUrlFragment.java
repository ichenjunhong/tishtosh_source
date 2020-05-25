package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
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
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23485d;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.util.C40570u;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment */
public final class ProfileEditBioUrlFragment extends C40317db implements C39985s {

    /* renamed from: i */
    public static final C40131a f102381i = new C40131a(null);

    /* renamed from: b */
    public String f102382b = "";

    /* renamed from: c */
    public boolean f102383c;

    /* renamed from: d */
    public int f102384d;

    /* renamed from: e */
    public boolean f102385e;

    /* renamed from: f */
    C40132b f102386f;

    /* renamed from: g */
    public C39954ad f102387g;

    /* renamed from: h */
    public C39718ad f102388h;

    /* renamed from: l */
    private String f102389l = "";

    /* renamed from: m */
    private HashMap f102390m;
    @BindView(2131493872)
    public ImageView mClearAllBtn;
    @BindView(2131494826)
    public DmtStatusView mDmtStatusView;
    @BindView(2131493533)
    public EditText mEditContentInput;
    @BindView(2131495062)
    public TextView mEditLengthHint;
    @BindView(2131495060)
    public TextView mIdEditHintText;
    @BindView(2131495049)
    public TextView mTvContentName;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$a */
    public static final class C40131a {
        private C40131a() {
        }

        public /* synthetic */ C40131a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileEditBioUrlFragment m89278a(String str, boolean z, String str2, int i, boolean z2) {
            C52711k.m112240b(str, "contentValue");
            C52711k.m112240b(str2, "editHint");
            ProfileEditBioUrlFragment profileEditBioUrlFragment = new ProfileEditBioUrlFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_value", str);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", str2);
            bundle.putInt("content_max_length", i);
            bundle.putBoolean("is_enable_null", z2);
            profileEditBioUrlFragment.setArguments(bundle);
            return profileEditBioUrlFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$b */
    public interface C40132b {
        /* renamed from: a */
        void mo82283a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$c */
    public static final class C40133c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f102391a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C40133c(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f102391a = profileEditBioUrlFragment;
        }

        public final void afterTextChanged(Editable editable) {
            C52711k.m112240b(editable, "s");
            if (this.f102391a.f102383c) {
                if (editable.length() <= 0 && !this.f102391a.f102385e) {
                    this.f102391a.mo82338h();
                } else if (!TextUtils.equals(editable.toString(), this.f102391a.f102382b)) {
                    this.f102391a.mo82337g();
                } else {
                    this.f102391a.mo82338h();
                }
                if (editable.length() > 0) {
                    this.f102391a.mo82280c().setVisibility(0);
                    return;
                }
                this.f102391a.mo82280c().setVisibility(8);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            if (this.f102391a.f102384d != 0) {
                if (ProfileEditBioUrlFragment.m89662a(this.f102391a.mo82279b(), this.f102391a.f102384d)) {
                    this.f102391a.mo82281f().setTextColor(this.f102391a.getResources().getColor(R.color.mv));
                } else {
                    this.f102391a.mo82281f().setTextColor(this.f102391a.getResources().getColor(R.color.a1a));
                }
                this.f102391a.mo82281f().setText(this.f102391a.getString(R.string.a0h, Integer.valueOf(this.f102391a.mo82279b().length()), Integer.valueOf(this.f102391a.f102384d)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$d */
    static final class C40134d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f102392a;

        C40134d(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f102392a = profileEditBioUrlFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f102392a.mo82269d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$e */
    static final class C40135e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditBioUrlFragment f102393a;

        C40135e(ProfileEditBioUrlFragment profileEditBioUrlFragment) {
            this.f102393a = profileEditBioUrlFragment;
        }

        public final void onClick(View view) {
            Map map;
            ClickInstrumentation.onClick(view);
            C40570u.m90005a("save_profile", "click_save");
            String obj = this.f102393a.mo82279b().getText().toString();
            while (true) {
                CharSequence charSequence = obj;
                map = null;
                if (!C52830p.m112456b(charSequence, (CharSequence) "\n\n", false, 2, (Object) null)) {
                    break;
                }
                obj = new C52820l("\n\n").replace(charSequence, "\n");
            }
            int length = obj.length() - 1;
            if (length >= 0 && obj.charAt(length) == 10) {
                if (obj != null) {
                    obj = obj.substring(0, length);
                    C52711k.m112236a((Object) obj, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            CharSequence charSequence2 = obj;
            if (!TextUtils.equals(charSequence2, this.f102393a.f102382b)) {
                KeyboardUtils.m58184c(this.f102393a.mo82279b());
                this.f102393a.mo82279b().setText(charSequence2);
                C39718ad adVar = this.f102393a.f102388h;
                if (adVar != null) {
                    adVar.f101369n = obj;
                }
                C39954ad adVar2 = this.f102393a.f102387g;
                if (adVar2 != null) {
                    C39718ad adVar3 = this.f102393a.f102388h;
                    if (adVar3 != null) {
                        map = adVar3.mo80822a();
                    }
                    adVar2.mo81853a(map);
                }
                DmtStatusView dmtStatusView = this.f102393a.mDmtStatusView;
                if (dmtStatusView == null) {
                    C52711k.m112237a("mDmtStatusView");
                }
                if (dmtStatusView != null) {
                    dmtStatusView.mo19212f();
                }
            } else {
                this.f102393a.mo82269d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment$f */
    static final class C40136f implements OnEditorActionListener {

        /* renamed from: a */
        public static final C40136f f102394a = new C40136f();

        C40136f() {
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
        if (this.f102390m != null) {
            this.f102390m.clear();
        }
    }

    /* renamed from: b */
    public final EditText mo82279b() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        return editText;
    }

    /* renamed from: c */
    public final ImageView mo82280c() {
        ImageView imageView = this.mClearAllBtn;
        if (imageView == null) {
            C52711k.m112237a("mClearAllBtn");
        }
        return imageView;
    }

    /* renamed from: f */
    public final TextView mo82281f() {
        TextView textView = this.mEditLengthHint;
        if (textView == null) {
            C52711k.m112237a("mEditLengthHint");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82270e() {
        C40132b bVar = this.f102386f;
        if (bVar != null) {
            EditText editText = this.mEditContentInput;
            if (editText == null) {
                C52711k.m112237a("mEditContentInput");
            }
            bVar.mo82283a(editText.getText().toString());
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

    public final void onDestroyView() {
        super.onDestroyView();
        C39954ad adVar = this.f102387g;
        if (adVar != null) {
            adVar.mo81850a((C39985s) null);
        }
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        mo82266a();
    }

    /* renamed from: d */
    public final boolean mo82269d() {
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        KeyboardUtils.m58184c(editText);
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.finish();
        } else if (getDialog() != null) {
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
    public final void mo54362a(boolean z) {
        if (z) {
            C10691a.m21534a(C11010c.m22280a(), (int) R.string.cp, 1).mo19066a();
            C47718bf.m103288a(new C23485d());
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            String string = arguments.getString("content_value");
            C52711k.m112236a((Object) string, "arguments!!.getString(CONTENT_VALUE)");
            this.f102382b = string;
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                C52711k.m112234a();
            }
            this.f102383c = arguments2.getBoolean("is_edit_enabled");
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                C52711k.m112234a();
            }
            String string2 = arguments3.getString("edit_hint");
            C52711k.m112236a((Object) string2, "arguments!!.getString(CONTENT_EDIT_HINT)");
            this.f102389l = string2;
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                C52711k.m112234a();
            }
            this.f102384d = arguments4.getInt("content_max_length");
            Bundle arguments5 = getArguments();
            if (arguments5 == null) {
                C52711k.m112234a();
            }
            this.f102385e = arguments5.getBoolean("is_enable_null");
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.mo19209d();
        }
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.finish();
            return;
        }
        mo82270e();
        dismiss();
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 2097) {
            new C10643a(getActivity()).mo18885a((int) R.string.gpp).mo18899b((int) R.string.gpn).mo18886a((int) R.string.gpo, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
            if (z && getActivity() != null) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                activity.finish();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Integer num;
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bp0, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        C47887fi fiVar = C47887fi.f120483a;
        Activity activity = getActivity();
        Dialog dialog = getDialog();
        C52711k.m112236a((Object) dialog, "dialog");
        fiVar.mo95098a(activity, dialog.getWindow(), true);
        this.f102920j = (TextTitleBar) inflate.findViewById(R.id.d10);
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            textTitleBar.setTitle((CharSequence) getString(R.string.avt));
        }
        this.f102387g = new C39954ad();
        C39954ad adVar = this.f102387g;
        if (adVar != null) {
            adVar.mo81850a((C39985s) this);
        }
        this.f102388h = new C39718ad();
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a((Context) getActivity()));
        }
        TextView textView = this.mTvContentName;
        if (textView == null) {
            C52711k.m112237a("mTvContentName");
        }
        textView.setText(getString(R.string.avt));
        EditText editText = this.mEditContentInput;
        if (editText == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText.addTextChangedListener(new C40133c(this));
        EditText editText2 = this.mEditContentInput;
        if (editText2 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText2.setText(this.f102382b);
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
                startText.setOnClickListener(new C40134d(this));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setOnClickListener(new C40135e(this));
            }
        }
        if (!this.f102383c) {
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
            ImageView imageView = this.mClearAllBtn;
            if (imageView == null) {
                C52711k.m112237a("mClearAllBtn");
            }
            imageView.setVisibility(8);
        }
        mo82338h();
        if (TextUtils.isEmpty(this.f102389l)) {
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
            textView3.setText(this.f102389l);
        }
        if (this.f102384d > 0) {
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
            if (TextUtils.isEmpty(this.f102382b)) {
                i = 0;
            } else {
                String str = this.f102382b;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                i = num.intValue();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f102384d);
            textView5.setText(getString(R.string.a0h, objArr));
        }
        EditText editText11 = this.mEditContentInput;
        if (editText11 == null) {
            C52711k.m112237a("mEditContentInput");
        }
        editText11.setOnEditorActionListener(C40136f.f102394a);
        return inflate;
    }
}
