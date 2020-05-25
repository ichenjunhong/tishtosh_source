package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21842g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21842g.C21843a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21655b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21814x;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22015m;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.experiment.C29508i;
import com.p683ss.android.ugc.aweme.profile.util.C40570u;
import com.p683ss.android.ugc.aweme.utils.C47763cg;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p064c.p065a.p095m.C2191a;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment */
public final class ProfileEditUsernameFragment extends C40317db implements C22015m {

    /* renamed from: m */
    public static final C40162a f102476m = new C40162a(null);

    /* renamed from: b */
    public String f102477b = "";

    /* renamed from: c */
    C40163b f102478c;

    /* renamed from: d */
    public C22000e f102479d;

    /* renamed from: e */
    public C21814x f102480e = new C21814x();

    /* renamed from: f */
    public EditText f102481f;

    /* renamed from: g */
    public final C21842g f102482g = new C21842g();

    /* renamed from: h */
    public boolean f102483h;

    /* renamed from: i */
    public C21655b f102484i;

    /* renamed from: l */
    public String f102485l = "";
    @BindView(2131495060)
    public TextView mIdEditHintText;
    @BindView(2131495265)
    public TextView mUserLinkHint;

    /* renamed from: n */
    private String f102486n = "";

    /* renamed from: o */
    private String f102487o = "";

    /* renamed from: p */
    private boolean f102488p;

    /* renamed from: q */
    private String f102489q = "";

    /* renamed from: r */
    private int f102490r;

    /* renamed from: s */
    private boolean f102491s;
    @BindView(2131494631)
    public LinearLayout setUsernameInclude;
    @BindView(2131494633)
    public RecyclerView setUsernameRv;

    /* renamed from: t */
    private AccountKeyBoardHelper f102492t;

    /* renamed from: u */
    private HashMap f102493u;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$a */
    public static final class C40162a {
        private C40162a() {
        }

        public /* synthetic */ C40162a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$b */
    public interface C40163b {
        /* renamed from: a */
        void mo82339a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$c */
    public static final class C40164c extends C2191a<C21655b> {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102494a;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        C40164c(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102494a = profileEditUsernameFragment;
        }

        public final /* synthetic */ void onNext(Object obj) {
            C21655b bVar = (C21655b) obj;
            C52711k.m112240b(bVar, "t");
            List<String> list = bVar.f58683b;
            if (list != null && (!list.isEmpty())) {
                this.f102494a.mo82333a(bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$d */
    static final class C40165d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102495a;

        C40165d(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102495a = profileEditUsernameFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f102495a.mo82269d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e */
    static final class C40166e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102496a;

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e$a */
        static final class C40168a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C40166e f102498a;

            C40168a(C40166e eVar) {
                this.f102498a = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C40570u.m90004a(1, this.f102498a.f102496a.f102477b, "button");
                this.f102498a.f102496a.mo82270e();
                this.f102498a.f102496a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$e$b */
        static final class C40169b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C40166e f102499a;

            C40169b(C40166e eVar) {
                this.f102499a = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C40570u.m90004a(0, this.f102499a.f102496a.f102477b, "button");
                dialogInterface.dismiss();
            }
        }

        C40166e(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102496a = profileEditUsernameFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C47763cg.m103391a(this.f102496a.mo82336c().getText().toString(), C11010c.m22280a())) {
                KeyboardUtils.m58184c(this.f102496a.mo82336c());
                C40570u.m90005a("save_profile", "click_save");
                new C10643a(this.f102496a.getActivity()).mo18892a(this.f102496a.getResources().getString(R.string.hfc)).mo18899b((int) R.string.hfa).mo18886a((int) R.string.hfb, (DialogInterface.OnClickListener) new C40168a(this)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) new C40169b(this)).mo18897a().mo18882b().setOnCancelListener(new OnCancelListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40166e f102497a;

                    {
                        this.f102497a = r1;
                    }

                    public final void onCancel(DialogInterface dialogInterface) {
                        C40570u.m90004a(0, this.f102497a.f102496a.f102477b, "blank");
                    }
                });
                return;
            }
            C40570u.m90006b(0, this.f102496a.f102477b, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$f */
    static final class C40170f extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102500a;

        C40170f(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102500a = profileEditUsernameFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f102500a.f102483h = true;
                this.f102500a.mo82336c().setText(charSequence);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$g */
    public static final class C40171g implements C21843a {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102501a;

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$g$a */
        public static final class C40172a extends C2191a<C21655b> {

            /* renamed from: a */
            final /* synthetic */ C40171g f102502a;

            public final void onComplete() {
            }

            C40172a(C40171g gVar) {
                this.f102502a = gVar;
            }

            public final void onError(Throwable th) {
                String str;
                Iterable iterable;
                C52711k.m112240b(th, "e");
                ProfileEditUsernameFragment profileEditUsernameFragment = this.f102502a.f102501a;
                C52711k.m112240b(th, "e");
                if (th instanceof C23459a) {
                    C23459a aVar = (C23459a) th;
                    List list = null;
                    if (aVar.getRawResponse() != null) {
                        Object rawResponse = aVar.getRawResponse();
                        if (rawResponse instanceof C21655b) {
                            C21655b bVar = (C21655b) rawResponse;
                            iterable = bVar.f58683b;
                            str = bVar.status_msg;
                        } else {
                            str = null;
                            iterable = null;
                        }
                        C22000e eVar = profileEditUsernameFragment.f102479d;
                        if (eVar == null) {
                            C52711k.m112234a();
                        }
                        if (iterable != null) {
                            List b = C52575l.m112128b(iterable);
                            if (b != null) {
                                list = C52575l.m112139e((Collection<? extends T>) b);
                            }
                        }
                        eVar.mo46068a(list);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        profileEditUsernameFragment.mo82334a(false, 1, str);
                        return;
                    }
                }
                profileEditUsernameFragment.mo82334a(true, 1, null);
            }

            public final /* synthetic */ void onNext(Object obj) {
                List list;
                C21655b bVar = (C21655b) obj;
                C52711k.m112240b(bVar, "t");
                ProfileEditUsernameFragment profileEditUsernameFragment = this.f102502a.f102501a;
                C52711k.m112240b(bVar, "t");
                if (!C52711k.m112239a((Object) bVar.f58682a, (Object) Boolean.valueOf(false))) {
                    profileEditUsernameFragment.mo82334a(true, 3, null);
                    return;
                }
                profileEditUsernameFragment.mo82334a(false, 1, bVar.status_msg);
                C22000e eVar = profileEditUsernameFragment.f102479d;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                List<String> list2 = bVar.f58683b;
                if (list2 != null) {
                    List b = C52575l.m112128b((Iterable<? extends T>) list2);
                    if (b != null) {
                        list = C52575l.m112139e((Collection<? extends T>) b);
                        eVar.mo46068a(list);
                    }
                }
                list = null;
                eVar.mo46068a(list);
            }
        }

        C40171g(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102501a = profileEditUsernameFragment;
        }

        /* renamed from: a */
        public final void mo45978a(String str) {
            C52711k.m112240b(str, "s");
            if (!TextUtils.isEmpty(str)) {
                LinearLayout linearLayout = this.f102501a.setUsernameInclude;
                if (linearLayout == null) {
                    C52711k.m112237a("setUsernameInclude");
                }
                ((InputWithIndicator) linearLayout.findViewById(R.id.ecy)).mo46281a(2);
                this.f102501a.f102480e.mo45948a(str, new C40172a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment$h */
    public static final class C40173h extends C23698l {

        /* renamed from: a */
        final /* synthetic */ ProfileEditUsernameFragment f102503a;

        C40173h(ProfileEditUsernameFragment profileEditUsernameFragment) {
            this.f102503a = profileEditUsernameFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String obj = this.f102503a.mo82336c().getText().toString();
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (isEmpty || this.f102503a.f102483h) {
                this.f102503a.f102480e.mo45949b();
                this.f102503a.f102482g.mo45977a("");
            }
            if (this.f102503a.f102483h) {
                this.f102503a.mo82336c().setSelection(obj.length());
                this.f102503a.mo82334a(true, 3, null);
                this.f102503a.f102483h = false;
                return;
            }
            C22000e eVar = this.f102503a.f102479d;
            if (eVar == null) {
                C52711k.m112234a();
            }
            eVar.mo46068a(null);
            this.f102503a.mo82334a(false, 1, null);
            if (!isEmpty) {
                this.f102503a.f102482g.mo45977a(obj);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            this.f102503a.mo82335b().setText("www.tiktok.com/");
            TextView b = this.f102503a.mo82335b();
            ProfileEditUsernameFragment profileEditUsernameFragment = this.f102503a;
            String obj = this.f102503a.mo82336c().getText().toString();
            C52711k.m112240b(obj, LeakCanaryFileProvider.f132049i);
            if (C52711k.m112239a((Object) obj, (Object) "")) {
                obj = "username";
            }
            StringBuilder sb = new StringBuilder("@");
            sb.append(obj);
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(profileEditUsernameFragment.getResources().getColor(R.color.a7w)), 0, obj.length() + 1, 33);
            b.append(spannableString);
            if (!this.f102503a.f102483h) {
            }
        }
    }

    /* renamed from: a */
    public final void mo82266a() {
        if (this.f102493u != null) {
            this.f102493u.clear();
        }
    }

    /* renamed from: W_ */
    public final void mo45995W_() {
        RecyclerView recyclerView = this.setUsernameRv;
        if (recyclerView == null) {
            C52711k.m112237a("setUsernameRv");
        }
        recyclerView.setVisibility(8);
    }

    /* renamed from: X_ */
    public final void mo45996X_() {
        RecyclerView recyclerView = this.setUsernameRv;
        if (recyclerView == null) {
            C52711k.m112237a("setUsernameRv");
        }
        recyclerView.setVisibility(0);
    }

    /* renamed from: b */
    public final TextView mo82335b() {
        TextView textView = this.mUserLinkHint;
        if (textView == null) {
            C52711k.m112237a("mUserLinkHint");
        }
        return textView;
    }

    /* renamed from: c */
    public final EditText mo82336c() {
        EditText editText = this.f102481f;
        if (editText == null) {
            C52711k.m112237a("etUserName");
        }
        return editText;
    }

    public final void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f102492t;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f59147b = null;
        }
    }

    public final void onDestroyView() {
        this.f102484i = null;
        this.f102480e.mo45949b();
        this.f102482g.mo45975a();
        super.onDestroyView();
        mo82266a();
    }

    /* renamed from: d */
    public final boolean mo82269d() {
        EditText editText = this.f102481f;
        if (editText == null) {
            C52711k.m112237a("etUserName");
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

    /* renamed from: g */
    public final void mo82337g() {
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(1.0f);
            }
        }
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setTextColor(getResources().getColor(R.color.ja));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText3 = textTitleBar3.getEndText();
            if (endText3 != null) {
                endText3.setClickable(true);
            }
        }
    }

    /* renamed from: h */
    public final void mo82338h() {
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(0.5f);
            }
        }
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setTextColor(getResources().getColor(R.color.ja));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText3 = textTitleBar3.getEndText();
            if (endText3 != null) {
                endText3.setClickable(false);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f102492t;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f59147b = this;
        }
        if (C21854a.m54534a()) {
            EditText editText = this.f102481f;
            if (editText == null) {
                C52711k.m112237a("etUserName");
            }
            C21994b.m54752a(editText);
            return;
        }
        EditText editText2 = this.f102481f;
        if (editText2 == null) {
            C52711k.m112237a("etUserName");
        }
        editText2.requestFocus();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82270e() {
        C40163b bVar = this.f102478c;
        if (bVar != null) {
            EditText editText = this.f102481f;
            if (editText == null) {
                C52711k.m112237a("etUserName");
            }
            bVar.mo82339a(editText.getText().toString());
        }
        EditText editText2 = this.f102481f;
        if (editText2 == null) {
            C52711k.m112237a("etUserName");
        }
        if (!C29508i.m69647a(editText2.getText().toString())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", 1);
            C9951d.m19999a("check_user_name_status", jSONObject, null, null);
        }
    }

    /* renamed from: a */
    public final void mo82333a(C21655b bVar) {
        List list;
        C52711k.m112240b(bVar, "t");
        List<String> list2 = bVar.f58683b;
        if (list2 != null) {
            List b = C52575l.m112128b((Iterable<? extends T>) list2);
            if (b != null) {
                list = C52575l.m112139e((Collection<? extends T>) b);
                if (list != null && (!list.isEmpty())) {
                    this.f102483h = true;
                    EditText editText = this.f102481f;
                    if (editText == null) {
                        C52711k.m112237a("etUserName");
                    }
                    editText.setText((CharSequence) list.get(0));
                    this.f102485l = (String) list.get(0);
                    C22000e eVar = this.f102479d;
                    if (eVar == null) {
                        C52711k.m112234a();
                    }
                    eVar.mo46068a(list.subList(1, list.size()));
                    return;
                }
            }
        }
        list = null;
        if (list != null) {
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("content_name");
            C52711k.m112236a((Object) string, "it.getString(CONTENT_NAME)");
            this.f102486n = string;
            String string2 = arguments.getString("content_value");
            C52711k.m112236a((Object) string2, "it.getString(CONTENT_VALUE)");
            this.f102487o = string2;
            this.f102488p = arguments.getBoolean("is_edit_enabled");
            String string3 = arguments.getString("edit_hint");
            C52711k.m112236a((Object) string3, "it.getString(CONTENT_EDIT_HINT)");
            this.f102489q = string3;
            this.f102490r = arguments.getInt("content_max_length");
            this.f102491s = arguments.getBoolean("is_enable_null");
            String string4 = arguments.getString("enter_from");
            C52711k.m112236a((Object) string4, "it.getString(ENTER_FROM)");
            this.f102477b = string4;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("new_user_need_get_recommend_username")) {
            this.f102480e.mo45948a("", new C40164c(this));
        }
    }

    /* renamed from: a */
    public final void mo82334a(boolean z, int i, String str) {
        if (z) {
            TextTitleBar textTitleBar = this.f102920j;
            if (textTitleBar != null) {
                DmtTextView endText = textTitleBar.getEndText();
                if (endText != null) {
                    endText.setAlpha(1.0f);
                }
            }
            TextTitleBar textTitleBar2 = this.f102920j;
            if (textTitleBar2 != null) {
                DmtTextView endText2 = textTitleBar2.getEndText();
                if (endText2 != null) {
                    endText2.setTextColor(getResources().getColor(R.color.ja));
                }
            }
            TextTitleBar textTitleBar3 = this.f102920j;
            if (textTitleBar3 != null) {
                DmtTextView endText3 = textTitleBar3.getEndText();
                if (endText3 != null) {
                    endText3.setClickable(true);
                }
            }
        } else {
            TextTitleBar textTitleBar4 = this.f102920j;
            if (textTitleBar4 != null) {
                DmtTextView endText4 = textTitleBar4.getEndText();
                if (endText4 != null) {
                    endText4.setAlpha(0.5f);
                }
            }
            TextTitleBar textTitleBar5 = this.f102920j;
            if (textTitleBar5 != null) {
                DmtTextView endText5 = textTitleBar5.getEndText();
                if (endText5 != null) {
                    endText5.setTextColor(getResources().getColor(R.color.ja));
                }
            }
            TextTitleBar textTitleBar6 = this.f102920j;
            if (textTitleBar6 != null) {
                DmtTextView endText6 = textTitleBar6.getEndText();
                if (endText6 != null) {
                    endText6.setClickable(false);
                }
            }
        }
        if (str == null) {
            LinearLayout linearLayout = this.setUsernameInclude;
            if (linearLayout == null) {
                C52711k.m112237a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout.findViewById(R.id.ecz)).mo45986a();
        } else {
            LinearLayout linearLayout2 = this.setUsernameInclude;
            if (linearLayout2 == null) {
                C52711k.m112237a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout2.findViewById(R.id.ecz)).mo45987a(str);
        }
        LinearLayout linearLayout3 = this.setUsernameInclude;
        if (linearLayout3 == null) {
            C52711k.m112237a("setUsernameInclude");
        }
        ((InputWithIndicator) linearLayout3.findViewById(R.id.ecy)).mo46281a(i);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bp1, viewGroup, false);
        C47887fi fiVar = C47887fi.f120483a;
        Activity activity = getActivity();
        Dialog dialog = getDialog();
        C52711k.m112236a((Object) dialog, "dialog");
        fiVar.mo95098a(activity, dialog.getWindow(), true);
        this.f102920j = (TextTitleBar) inflate.findViewById(R.id.d10);
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            textTitleBar.setTitle((CharSequence) this.f102486n);
        }
        ButterKnife.bind((Object) this, inflate);
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView titleView = textTitleBar2.getTitleView();
            if (titleView != null) {
                titleView.setTextColor(getResources().getColor(R.color.avn));
            }
        }
        TextTitleBar textTitleBar3 = this.f102920j;
        if (textTitleBar3 != null) {
            DmtTextView endText = textTitleBar3.getEndText();
            if (endText != null) {
                endText.setTextColor(getResources().getColor(R.color.avn));
            }
        }
        LinearLayout linearLayout = this.setUsernameInclude;
        if (linearLayout == null) {
            C52711k.m112237a("setUsernameInclude");
        }
        this.f102481f = ((InputWithIndicator) linearLayout.findViewById(R.id.ecy)).getEditText();
        TextTitleBar textTitleBar4 = this.f102920j;
        if (textTitleBar4 != null) {
            DmtTextView startText = textTitleBar4.getStartText();
            if (startText != null) {
                startText.setOnClickListener(new C40165d(this));
            }
        }
        TextTitleBar textTitleBar5 = this.f102920j;
        if (textTitleBar5 != null) {
            DmtTextView endText2 = textTitleBar5.getEndText();
            if (endText2 != null) {
                endText2.setOnClickListener(new C40166e(this));
            }
        }
        if (!this.f102488p) {
            EditText editText = this.f102481f;
            if (editText == null) {
                C52711k.m112237a("etUserName");
            }
            editText.setEnabled(false);
            EditText editText2 = this.f102481f;
            if (editText2 == null) {
                C52711k.m112237a("etUserName");
            }
            editText2.setFocusable(false);
            EditText editText3 = this.f102481f;
            if (editText3 == null) {
                C52711k.m112237a("etUserName");
            }
            editText3.setFocusableInTouchMode(false);
        }
        mo82338h();
        if (TextUtils.isEmpty(this.f102489q)) {
            TextView textView = this.mIdEditHintText;
            if (textView == null) {
                C52711k.m112237a("mIdEditHintText");
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.mIdEditHintText;
            if (textView2 == null) {
                C52711k.m112237a("mIdEditHintText");
            }
            textView2.setText(this.f102489q);
        }
        C52711k.m112236a((Object) inflate, "view");
        this.f102492t = new AccountKeyBoardHelper(inflate, this);
        LinearLayout linearLayout2 = this.setUsernameInclude;
        if (linearLayout2 == null) {
            C52711k.m112237a("setUsernameInclude");
        }
        this.f102481f = ((InputWithIndicator) linearLayout2.findViewById(R.id.ecy)).getEditText();
        EditText editText4 = this.f102481f;
        if (editText4 == null) {
            C52711k.m112237a("etUserName");
        }
        editText4.setNextFocusDownId(editText4.getId());
        editText4.setHint(getString(R.string.aft));
        RecyclerView recyclerView = this.setUsernameRv;
        if (recyclerView == null) {
            C52711k.m112237a("setUsernameRv");
        }
        this.f102479d = new C22000e(recyclerView, null, new C40170f(this));
        C22000e eVar = this.f102479d;
        if (eVar == null) {
            C52711k.m112234a();
        }
        eVar.f59459a = true;
        this.f102482g.mo45976a(new C40171g(this), 1000, TimeUnit.MILLISECONDS);
        EditText editText5 = this.f102481f;
        if (editText5 == null) {
            C52711k.m112237a("etUserName");
        }
        editText5.addTextChangedListener(new C40173h(this));
        EditText editText6 = this.f102481f;
        if (editText6 == null) {
            C52711k.m112237a("etUserName");
        }
        editText6.setText(this.f102487o);
        EditText editText7 = this.f102481f;
        if (editText7 == null) {
            C52711k.m112237a("etUserName");
        }
        EditText editText8 = this.f102481f;
        if (editText8 == null) {
            C52711k.m112237a("etUserName");
        }
        editText7.setSelection(editText8.getText().length());
        EditText editText9 = this.f102481f;
        if (editText9 == null) {
            C52711k.m112237a("etUserName");
        }
        editText9.setFocusable(true);
        EditText editText10 = this.f102481f;
        if (editText10 == null) {
            C52711k.m112237a("etUserName");
        }
        editText10.setFocusableInTouchMode(true);
        EditText editText11 = this.f102481f;
        if (editText11 == null) {
            C52711k.m112237a("etUserName");
        }
        editText11.requestFocus();
        if (this.f102484i != null) {
            C21655b bVar = this.f102484i;
            if (bVar == null) {
                C52711k.m112234a();
            }
            mo82333a(bVar);
        }
        return inflate;
    }
}
