package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24538c;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24547g;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24528b;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24564e;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24566f;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24569h;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24577m;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45625a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeFragment */
public class AddChallengeFragment extends C23526a implements C24577m, C26877c<Challenge> {

    /* renamed from: a */
    private C24538c f65079a;

    /* renamed from: b */
    private C24547g f65080b;

    /* renamed from: c */
    private C26876b<C24564e> f65081c;

    /* renamed from: d */
    private C24569h f65082d;

    /* renamed from: e */
    private String f65083e;
    EditText mEditView;
    LinearLayout mHideChallengeLayout;
    View mLabelView;
    RecyclerView mListView;
    ImageView mLoadingView;
    TextView mSendView;
    ButtonTitleBar mTitleBar;
    int margin;

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    public final void aJ_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47026b(List<Challenge> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<Challenge> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
    }

    /* renamed from: h */
    private void m60038h() {
        this.mLoadingView.clearAnimation();
        this.mLoadingView.setVisibility(4);
        this.mSendView.setText(R.string.zc);
    }

    /* renamed from: i */
    private void m60039i() {
        if (isViewValid()) {
            C26894c.m65021a(getActivity(), this.mEditView);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f65082d != null) {
            this.f65082d.mo46991S_();
        }
        if (this.f65081c != null) {
            this.f65081c.mo46991S_();
        }
    }

    /* renamed from: c */
    public final void mo50342c() {
        if (isViewValid() && getActivity() != null) {
            this.mLoadingView.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.a0));
            this.mLoadingView.setVisibility(0);
            this.mSendView.setText("");
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mLabelView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo50343d(Exception exc) {
        if (isViewValid()) {
            m60038h();
            m60039i();
        }
    }

    /* renamed from: a */
    public final void mo50341a(SearchChallengeList searchChallengeList) {
        List<SearchChallenge> list;
        if (isViewValid()) {
            m60038h();
            C24547g gVar = this.f65080b;
            if (searchChallengeList == null) {
                list = null;
            } else {
                list = searchChallengeList.items;
            }
            gVar.mo50303a(list);
            this.mListView.setAdapter(this.f65080b);
            this.mLabelView.setVisibility(8);
            m60039i();
        }
    }

    public void onTextChange(CharSequence charSequence) {
        int i;
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.mListView.setAdapter(this.f65079a);
            this.f65080b.mo50303a(null);
            View view = this.mLabelView;
            if (this.f65079a.getItemCount() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void click(View view) {
        if (view.getId() == R.id.cjt) {
            String trim = this.mEditView.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!C24636b.m60137a(getActivity())) {
                    C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                    return;
                }
                this.f65082d.mo44934a_(trim, this.f65083e);
                C26890h.onEvent(MobClick.obtain().setEventName("search").setLabelName("add_challenge").setJsonObject(new C23088c().mo47824a("keyword", trim).mo47825b()));
            }
        }
    }

    @C53771m
    public void onChallengeReadyEvent(C24528b bVar) {
        if (bVar.f64949b == 0) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().addChallenge(bVar.f64948a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent();
                new C45625a();
                intent.putExtra("challenge", C45625a.m99357a(bVar.f64948a));
                activity.setResult(-1, intent);
                activity.onBackPressed();
            }
            C26890h.onEvent(MobClick.obtain().setEventName("add_challenge").setLabelName("publish").setValue(bVar.f64948a.getCid()).setExtValueLong(0));
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Challenge> list, boolean z) {
        if (isViewValid() && this.f65080b.getItemCount() == 0) {
            this.f65079a.mo50303a(list);
            this.mLabelView.setVisibility(0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTitleBar.setTitle((int) R.string.e3);
        this.mTitleBar.getTitleView().setTextColor(getResources().getColor(R.color.as0));
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                FragmentActivity activity = AddChallengeFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        });
        this.mTitleBar.mo19128a(false);
        this.mLabelView.setVisibility(4);
        this.mHideChallengeLayout.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                FragmentActivity activity = AddChallengeFragment.this.getActivity();
                activity.setResult(0, new Intent());
                activity.onBackPressed();
            }
        });
        this.f65080b = new C24547g();
        this.f65079a = new C24538c();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setAdapter(this.f65079a);
        RecyclerView recyclerView = this.mListView;
        C24754o oVar = new C24754o(getActivity(), R.drawable.u1);
        int i = this.margin;
        int i2 = this.margin;
        oVar.f65534a = i;
        oVar.f65535b = i2;
        recyclerView.mo4798a((C1331h) oVar);
        this.f65081c = new C26876b<>();
        this.f65081c.mo54800a(this);
        this.f65081c.mo54799a(new C24564e());
        this.f65082d = new C24569h();
        this.f65082d.mo54800a(this);
        this.f65082d.mo54799a(new C24566f());
        this.f65081c.mo44934a_(Integer.valueOf(1));
        m60039i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mk, viewGroup, false);
        this.f65083e = getArguments().getString("from");
        return inflate;
    }
}
