package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileMoreActivity.C40174a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MultilineInputFragment */
public class MultilineInputFragment extends C23526a implements C40174a {

    /* renamed from: a */
    public int f102287a;

    /* renamed from: b */
    private Dialog f102288b;

    /* renamed from: c */
    private boolean f102289c;

    /* renamed from: d */
    private String f102290d;

    /* renamed from: e */
    private RemarkApi f102291e;

    /* renamed from: j */
    private String f102292j;

    /* renamed from: k */
    private String f102293k;

    /* renamed from: l */
    private User f102294l;

    /* renamed from: m */
    private boolean f102295m;
    ImageView mClearAllBtn;
    EditText mInput;
    TextView mLengthHint;
    RelativeLayout mPopRemarkname;
    ButtonTitleBar mTitleBar;
    DmtTextView mTvContactname;
    DmtTextView mTvSetting;

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.mInput);
    }

    public void onStart() {
        super.onStart();
        this.mInput.requestFocus();
        KeyboardUtils.m58182a(this.mInput);
    }

    /* renamed from: e */
    public final void mo82242e() {
        this.mTitleBar.getEndBtn().setAlpha(0.34f);
        this.mTitleBar.getEndBtn().setClickable(false);
    }

    /* renamed from: f */
    public final boolean mo82243f() {
        String obj = this.mInput.getText().toString();
        if (TextUtils.equals(obj, this.f102290d) || (obj.length() != 0 && obj.trim().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo82240a() {
        if (!mo82243f() || this.f102289c || this.f102288b != null) {
            return true;
        }
        this.f102288b = new C10643a(getContext()).mo18886a((int) R.string.d_1, (OnClickListener) new C40279bz(this)).mo18900b((int) R.string.b8q, (OnClickListener) new C40289ca(this)).mo18899b((int) R.string.d_b).mo18897a().mo18882b();
        return false;
    }

    /* renamed from: a */
    private void m89217a(String str) {
        C26890h.m65011a("edit_remarks", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("account_type", "click").mo47829a("to_user_id", this.f102294l.getUid()).f61491a);
        if (this.f102291e == null) {
            this.f102291e = (RemarkApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RemarkApi.class);
        }
        this.f102291e.commitRemarkName(str, this.f102292j, this.f102294l.getSecUid()).mo20a((C0011g<TResult, TContinuationResult>) new C40290cb<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82238a(C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.d_4).mo19066a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.mo34e();
            if (commitRemarkNameResponse.isOK()) {
                this.f102294l.setRemarkName(((CommitRemarkNameResponse) iVar.mo34e()).remarkName);
                C33194e.m76279d().updateIMUser(C33194e.m76261a(this.f102294l));
                C23552a.m57751a().mo48724a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f102294l);
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.d6k).mo19066a();
            } else {
                C10691a.m21545b(C11010c.m22280a(), commitRemarkNameResponse.statusMsg).mo19066a();
            }
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo82241b(C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            return null;
        }
        CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.mo34e();
        if (commitRemarkNameResponse.isOK()) {
            this.f102293k = commitRemarkNameResponse.remarkName;
            if (TextUtils.isEmpty(this.f102293k)) {
                return null;
            }
            C26890h.m65011a("edit_name_notice", new C23089d().mo47829a("action_type", "show").f61491a);
            this.mLengthHint.animate().alpha(0.0f).setDuration(150);
            this.mPopRemarkname.animate().alpha(1.0f).setDuration(50).setStartDelay(150);
            this.mTvSetting.setClickable(true);
            if (this.f102293k.length() > 13) {
                String substring = this.f102293k.substring(0, 13);
                this.mTvContactname.setText(C2240a.m6772a(getString(R.string.ddo), new Object[]{substring, "...\""}));
            } else {
                this.mTvContactname.setText(C2240a.m6772a(getString(R.string.ddo), new Object[]{this.f102293k, "\""}));
            }
        }
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ik) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == R.id.ccd) {
            this.f102289c = true;
            mo82239a(true);
        } else if (view.getId() == R.id.az6) {
            this.mInput.setText("");
        } else if (view.getId() == R.id.dfs && !TextUtils.isEmpty(this.f102293k)) {
            if (Character.codePointCount(this.f102293k, 0, this.f102293k.length()) > this.f102287a) {
                this.f102293k = this.f102293k.substring(this.f102293k.offsetByCodePoints(0, 0), this.f102293k.offsetByCodePoints(0, this.f102287a));
            }
            this.mInput.setText(this.f102293k);
            C26890h.m65011a("edit_name_notice", new C23089d().mo47829a("action_type", "click").f61491a);
            this.mPopRemarkname.animate().alpha(0.0f).setDuration(50);
            this.mTvSetting.setClickable(false);
            this.mLengthHint.animate().alpha(1.0f).setDuration(50).setStartDelay(50);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo82239a(boolean z) {
        if (z) {
            if (this.f102295m) {
                m89217a(this.mInput.getText().toString());
            } else {
                C23552a.m57751a().mo48723a("aweme.main.profile.multi_line_input.remark_name").postValue(this.mInput.getText().toString());
            }
        }
        mo82242e();
        if (getActivity() != null && !this.f102295m) {
            getActivity().onBackPressed();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTitleBar.setTitle(getArguments().getInt("titleId"));
        ((TextView) view.findViewById(R.id.au6)).setText(getArguments().getInt("inputTypeNameId"));
        this.mInput.setHint(getArguments().getInt("inputHintId"));
        this.mInput.setOnEditorActionListener(C40277bx.f102819a);
        this.mPopRemarkname.setAlpha(0.0f);
        this.mTvSetting.setClickable(false);
        this.mInput.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (MultilineInputFragment.this.isViewValid() && MultilineInputFragment.this.getActivity() != null) {
                    int codePointCount = Character.codePointCount(editable, 0, editable.length());
                    if (codePointCount > MultilineInputFragment.this.f102287a) {
                        C10691a.m21545b((Context) MultilineInputFragment.this.getActivity(), MultilineInputFragment.this.getString(R.string.c59, String.valueOf(MultilineInputFragment.this.f102287a))).mo19066a();
                        int selectionEnd = Selection.getSelectionEnd(editable);
                        String obj = editable.toString();
                        if (selectionEnd == 0) {
                            str = "";
                        } else {
                            str = obj.substring(0, selectionEnd);
                        }
                        if (selectionEnd == obj.length()) {
                            str2 = "";
                        } else {
                            str2 = obj.substring(selectionEnd);
                        }
                        int codePointCount2 = Character.codePointCount(str2, 0, str2.length());
                        StringBuilder sb = new StringBuilder();
                        int i = MultilineInputFragment.this.f102287a - codePointCount2;
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                        }
                        sb.append(str2);
                        MultilineInputFragment.this.mInput.setText(sb.toString());
                        Selection.setSelection(MultilineInputFragment.this.mInput.getText(), Math.min(MultilineInputFragment.this.mInput.length() - str2.length(), MultilineInputFragment.this.mInput.length()));
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(R.string.a0h, Integer.valueOf(Character.codePointCount(MultilineInputFragment.this.mInput.getText(), 0, MultilineInputFragment.this.mInput.length())), Integer.valueOf(MultilineInputFragment.this.f102287a)));
                    } else {
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(R.string.a0h, Integer.valueOf(codePointCount), Integer.valueOf(MultilineInputFragment.this.f102287a)));
                    }
                    if (!MultilineInputFragment.this.mo82243f()) {
                        MultilineInputFragment.this.mo82242e();
                    } else {
                        MultilineInputFragment multilineInputFragment = MultilineInputFragment.this;
                        multilineInputFragment.mTitleBar.getEndBtn().setAlpha(1.0f);
                        multilineInputFragment.mTitleBar.getEndBtn().setClickable(true);
                    }
                    if (editable.length() > 0) {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(0);
                    } else {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(8);
                    }
                }
            }
        });
        if (Character.codePointCount(this.f102290d, 0, this.f102290d.length()) > this.f102287a) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f102287a; i++) {
                sb.append(Character.toChars(Character.codePointAt(this.f102290d, sb.length())));
            }
            this.mInput.setText(sb.toString());
        } else {
            this.mInput.setText(this.f102290d);
        }
        if (TextUtils.isEmpty(this.mInput.getText())) {
            if (C47937a.m103721a(getActivity(), new String[]{"android.permission.READ_CONTACTS"})) {
                if (this.f102291e == null) {
                    this.f102291e = (RemarkApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RemarkApi.class);
                }
                this.f102291e.getContackBookRemarkName(this.f102292j, C47865ew.m103536a().mo95083c(this.f102292j)).mo20a((C0011g<TResult, TContinuationResult>) new C40278by<TResult,TContinuationResult>(this), C0013i.f25b);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.oi, viewGroup, false);
        this.f102294l = (User) getArguments().getSerializable("user");
        this.f102295m = getArguments().getBoolean("need_commit_remark_immediate", false);
        this.f102287a = getArguments().getInt("inputMaxLength", 0);
        this.f102290d = getArguments().getString("defaultInputText", "");
        if (this.f102290d == null) {
            str = "";
        } else {
            str = this.f102290d;
        }
        this.f102290d = str;
        this.f102292j = getArguments().getString("userId");
        return inflate;
    }

    /* renamed from: a */
    public static MultilineInputFragment m89216a(int i, int i2, int i3, int i4, String str, String str2, Bundle bundle) {
        bundle.putInt("titleId", i);
        bundle.putInt("inputTypeNameId", i2);
        bundle.putInt("inputHintId", i3);
        bundle.putInt("inputMaxLength", i4);
        bundle.putString("defaultInputText", str);
        bundle.putString("userId", str2);
        MultilineInputFragment multilineInputFragment = new MultilineInputFragment();
        multilineInputFragment.setArguments(bundle);
        return multilineInputFragment;
    }
}
