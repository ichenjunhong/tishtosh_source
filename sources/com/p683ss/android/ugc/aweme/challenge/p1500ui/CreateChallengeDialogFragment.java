package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.challenge.api.C24552c;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24563d;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24576l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26892b;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeDialogFragment */
public class CreateChallengeDialogFragment extends C26892b implements C24576l {

    /* renamed from: a */
    private C24563d f65111a;

    /* renamed from: b */
    private C45546c f65112b;

    /* renamed from: c */
    private int f65113c;

    /* renamed from: d */
    private OnKeyListener f65114d = new OnKeyListener() {

        /* renamed from: b */
        private boolean f65118b;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.f65118b = true;
                return false;
            } else if (4 != i || !this.f65118b) {
                return false;
            } else {
                CreateChallengeDialogFragment.this.back();
                this.f65118b = false;
                return true;
            }
        }
    };
    TextView mConfirmView;
    TextView mCountView;
    View mDeleteView;
    EditText mEditDescView;
    EditText mEditTitleView;
    TextView mTitleView;

    public void back() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.onBackPressed();
            activity.finish();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f65111a != null) {
            this.f65111a.mo46991S_();
        }
        if (this.f65112b != null) {
            this.f65112b.dismiss();
            this.f65112b = null;
        }
    }

    public void onDescTextChange(CharSequence charSequence) {
        m60067a(charSequence);
    }

    /* renamed from: a */
    public final void mo50339a(Challenge challenge) {
        if (mo54846j()) {
            this.f65112b.dismiss();
            mo50441b(challenge);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.t0);
    }

    public void onTitleTextChange(CharSequence charSequence) {
        int i;
        View view = this.mDeleteView;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m60067a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mCountView.setText(R.string.aos);
            return;
        }
        this.mCountView.setText(getActivity().getString(R.string.aor, new Object[]{Integer.valueOf(60 - charSequence.length())}));
    }

    /* renamed from: a */
    public final void mo50340a(Exception exc) {
        if (mo54846j()) {
            this.f65112b.dismiss();
            if (exc instanceof C24552c) {
                C24552c cVar = (C24552c) exc;
                if (cVar.getErrorCode() == 2069) {
                    final Challenge challenge = cVar.getChallenge();
                    if (getActivity() != null) {
                        new C11105a(getActivity()).mo20135a((int) R.string.z2).mo20144b((int) R.string.z3).mo20145b((int) R.string.pc, (OnClickListener) null).mo20136a((int) R.string.z6, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                CreateChallengeDialogFragment.this.mo50441b(challenge);
                            }
                        }).mo20148b();
                    }
                    return;
                }
            }
            if (getActivity() != null) {
                C22971a.m56494a(getActivity(), exc, R.string.yy);
            }
        }
    }

    /* renamed from: b */
    public final void mo50441b(Challenge challenge) {
        if (this.f65113c == 0) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().addChallenge(challenge);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C26890h.m65005a(getContext(), "add_challenge", "publish", challenge.getCid(), 0);
                C24756q.m60288a(activity, challenge);
            }
            return;
        }
        AmeActivity ameActivity = (AmeActivity) getActivity();
        if (!C20902b.m53242a().isLogin()) {
            C27965f.m66719a((Activity) ameActivity, "publish", "add_challenge");
            return;
        }
        if (ameActivity != null) {
            if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                C10691a.m21548c(getContext(), (int) R.string.hr).mo19066a();
                return;
            }
            String uuid = UUID.randomUUID().toString();
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "challenge").mo47829a("tag_id", challenge.getCid()).f61491a);
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24768x(ameActivity, new Builder().shootWay("challenge").creationId(uuid).translationType(3).musicType(1).challenge(challenge).build(), challenge));
            ameActivity.finish();
            C26890h.m65005a(getContext(), "challenge_create", "publish", challenge.getCid(), 0);
        }
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.ik) {
            if (this.f65113c == 1) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.onBackPressed();
                    activity.finish();
                }
            }
        } else if (id == R.id.yo) {
            if (mo54846j() && getActivity() != null) {
                if (!C24769y.m60299a(getActivity())) {
                    C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                } else {
                    String trim = this.mEditTitleView.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        C10691a.m21542b((Context) getActivity(), (int) R.string.z7).mo19066a();
                    } else {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            this.f65112b = C45546c.m99207a(activity2, activity2.getString(R.string.cy3));
                            if (this.f65111a != null) {
                                this.f65111a.mo44934a_(trim, this.mEditDescView.getText().toString().trim());
                            }
                        }
                    }
                }
            }
            C26894c.m65021a(getActivity(), this.mEditDescView);
        } else if (id == R.id.cyi) {
            this.mEditTitleView.setText("");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_NAME");
        if (!TextUtils.isEmpty(string)) {
            this.mEditTitleView.setText(string);
            this.mEditDescView.setSelection(0);
        } else {
            this.mEditTitleView.setSelection(0);
            this.mEditTitleView.setText("");
        }
        this.mEditTitleView.setSelection(this.mEditTitleView.getText().length());
        this.f65113c = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
        TextView textView = this.mConfirmView;
        if (this.f65113c == 0) {
            i = R.string.ah2;
        } else {
            i = R.string.bvz;
        }
        textView.setText(i);
        if (bundle == null) {
            this.mEditDescView.setText("");
        }
        m60067a((CharSequence) this.mEditDescView.getText());
        this.f65111a = new C24563d();
        this.f65111a.mo54800a(this);
        getDialog().setOnKeyListener(this.f65114d);
        if (this.f65113c == 0) {
            getDialog().getWindow().getAttributes().windowAnimations = R.style.a6q;
        }
        EditText editText = this.mEditDescView;
        if (editText != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                editText.postDelayed(new Runnable(activity, editText) {

                    /* renamed from: a */
                    final /* synthetic */ Activity f70749a;

                    /* renamed from: b */
                    final /* synthetic */ View f70750b;

                    public final void run() {
                        ((InputMethodManager) this.f70749a.getSystemService("input_method")).showSoftInput(this.f70750b, 1);
                    }

                    {
                        this.f70749a = r2;
                        this.f70750b = r3;
                    }
                }, 100);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.n1, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mTitleView.setText(R.string.yx);
        this.mTitleView.setTextColor(getResources().getColor(R.color.as0));
        this.mTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.a2b, 0);
        return inflate;
    }
}
