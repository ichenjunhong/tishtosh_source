package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.friends.adapter.C32552x;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32569b;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32575f;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32578g;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendsFragment */
public class SummonFriendsFragment extends C23526a implements OnTouchListener, C26877c<SummonFriendItem>, C32569b {

    /* renamed from: a */
    public C32552x f85143a;

    /* renamed from: b */
    public C32578g f85144b;

    /* renamed from: c */
    public C32575f f85145c;

    /* renamed from: d */
    public boolean f85146d;

    /* renamed from: e */
    public int f85147e;

    /* renamed from: j */
    private List<SummonFriendItem> f85148j;

    /* renamed from: k */
    private String f85149k;

    /* renamed from: l */
    private boolean f85150l;
    ImageView mBackView;
    View mBtnClear;
    EditText mEditView;
    ImageView mIvSearchBar;
    RecyclerView mListView;
    TextView mSendView;
    DmtStatusView mStatusView;
    TextView mTitleView;
    int margin;

    /* renamed from: a */
    public static String m75553a(int i) {
        return i == 1 ? "comment_user" : i == 0 ? "at_user" : "";
    }

    /* renamed from: c */
    private static String m75555c(int i) {
        return i == 1 ? "comment_at" : i == 0 ? "edit_at" : "";
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    public final void aJ_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<SummonFriendItem> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
    }

    /* renamed from: i */
    public final void mo66278i() {
        if (this.f85146d) {
            LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.mStatusView.setLayoutParams(layoutParams);
        }
        this.mStatusView.mo19209d();
    }

    /* renamed from: j */
    public final void mo66279j() {
        if (isViewValid()) {
            C26894c.m65021a(getActivity(), this.mEditView);
        }
    }

    /* renamed from: b */
    public final void mo65890b() {
        int i;
        if (isViewValid() && getActivity() != null) {
            if (this.f85146d) {
                LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
                if (getActivity() == null) {
                    i = 0;
                } else {
                    int height = getActivity().getWindow().getDecorView().getHeight();
                    Rect rect = new Rect();
                    getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    i = height - rect.bottom;
                }
                layoutParams.bottomMargin = i;
                this.mStatusView.setLayoutParams(layoutParams);
            }
            this.mStatusView.mo19212f();
        }
    }

    /* renamed from: h */
    public final void mo66277h() {
        String trim = this.mEditView.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f85146d = true;
            if (!C32752av.m75628a(getActivity())) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                return;
            }
            C26890h.onEvent(MobClick.obtain().setEventName("search").setLabelName(m75555c(this.f85147e)).setJsonObject(new C23088c().mo47824a("keyword", trim).mo47825b()));
            if (this.f85143a != null) {
                this.f85143a.f84767c = trim;
            }
            this.f85150l = true;
            this.f85144b.mo44934a_(Boolean.valueOf(true), trim, m75553a(this.f85147e));
        }
    }

    /* renamed from: b */
    private View m75554b(int i) {
        return C32749as.m75626a(i, getContext());
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return;
        }
        if (id == R.id.dfk) {
            mo66277h();
        }
    }

    /* renamed from: d */
    public final void mo65891d(Exception exc) {
        this.f85150l = false;
        if (isViewValid()) {
            mo66278i();
            this.mListView.setVisibility(8);
            this.mStatusView.mo19214h();
            mo66279j();
        }
    }

    public void onTextChange(CharSequence charSequence) {
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.f85146d = false;
            m75556d(this.f85148j, true);
            this.f85143a.mo65852a(this.f85148j);
            this.f85143a.ao_();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id = view.getId();
        if (id == R.id.bc3) {
            if (this.f85150l) {
                return true;
            }
        } else if (id == R.id.ac_ && this.mEditView != null) {
            this.mEditView.setCursorVisible(true);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo47018a(List<SummonFriendItem> list, boolean z) {
        if (list != null) {
            if (this.f85148j == null) {
                this.f85148j = new ArrayList();
            }
            this.f85148j = list;
            m75556d(list, false);
            this.f85143a.mo65852a(this.f85148j);
            this.f85143a.ao_();
        }
    }

    /* renamed from: d */
    private void m75556d(List<SummonFriendItem> list, boolean z) {
        if (this.mListView != null && this.mStatusView != null && this.mEditView != null && list != null) {
            if (list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (!z && this.f85147e == 0) {
                    this.mStatusView.setBuilder(this.mStatusView.mo19207c().mo19231b(m75554b((int) R.string.dbc)));
                }
                this.mStatusView.mo19213g();
                if (!z) {
                    this.mEditView.setHint(getString(R.string.ch9));
                }
            } else {
                this.mListView.setVisibility(0);
                this.mStatusView.mo19209d();
            }
        }
    }

    /* renamed from: a */
    public final void mo65889a(List<SummonFriendItem> list, String str) {
        int i = this.f85147e;
        C32578g gVar = this.f85144b;
        if (i == 0) {
            C26890h.m65014b("search_video_at", C23198ae.m56851a(C23089d.m56640a().mo47829a("search_keyword", str).mo47829a("log_pb", C29981aa.m70153a().mo60161a(gVar.f84807a)).f61491a));
        }
        this.f85150l = false;
        if (isViewValid() && !TextUtils.isEmpty(this.mEditView.getText().toString().trim())) {
            mo66278i();
            if (list == null || list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (this.f85147e == 0) {
                    this.mStatusView.setBuilder(this.mStatusView.mo19207c().mo19231b(m75554b((int) R.string.chy)));
                }
                this.mStatusView.mo19213g();
                this.mEditView.setHint(getString(R.string.chy));
                return;
            }
            this.mListView.setVisibility(0);
            this.mStatusView.mo19209d();
            this.f85143a.mo65852a(list);
            if (this.f85144b.mo65906e()) {
                this.f85143a.ao_();
            } else {
                this.f85143a.an_();
            }
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<SummonFriendItem> list, boolean z) {
        if (isViewValid() && list != null && !list.isEmpty()) {
            mo66278i();
            if (MigrateABTestModel.getInstance().shouldUseRecyclerPartialUpdate()) {
                C32552x xVar = this.f85143a;
                xVar.f84765a = list;
                if (xVar.f70699x) {
                    xVar.notifyItemRangeChanged(xVar.f84766b - 1, xVar.getItemCount() - xVar.f84766b);
                    xVar.notifyItemChanged(xVar.getItemCount() - 1);
                } else {
                    xVar.notifyItemRangeChanged(xVar.f84766b, xVar.getItemCount() - xVar.f84766b);
                }
            } else {
                this.f85143a.mo65852a(list);
            }
            if (z) {
                this.f85143a.ao_();
            } else {
                this.f85143a.an_();
            }
            mo66279j();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f85149k = getArguments().getString("video_id");
        this.f85147e = getArguments().getInt("source");
        this.mTitleView.setText(R.string.dud);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f85143a = new C32552x(this.f85149k, this.f85147e);
        this.f85143a.f84768d = new C32750at(this);
        this.mListView.setAdapter(this.f85143a);
        this.mListView.setOnTouchListener(this);
        this.f85144b = new C32578g();
        this.f85145c = new C32575f();
        this.f85144b.mo54800a(this);
        this.f85145c.mo54800a(this);
        this.f85145c.mo65903a(true);
        this.f85143a.mo54798c(true);
        this.f85143a.mo54788a((C26846a) new C26846a() {
            public final void ar_() {
                SummonFriendsFragment.this.f85143a.am_();
                if (SummonFriendsFragment.this.f85146d) {
                    SummonFriendsFragment.this.f85144b.mo44934a_(Boolean.valueOf(false), SummonFriendsFragment.this.mEditView.getText().toString(), SummonFriendsFragment.m75553a(SummonFriendsFragment.this.f85147e));
                    return;
                }
                SummonFriendsFragment.this.f85145c.mo65903a(false);
            }
        });
        this.mEditView.setHint(getString(R.string.duc));
        this.mEditView.setOnTouchListener(this);
        this.mEditView.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(editable.toString())) {
                    SummonFriendsFragment.this.mo66277h();
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (TextUtils.isEmpty(charSequence)) {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(8);
                } else {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(0);
                }
            }
        });
        this.mEditView.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66) {
                    return false;
                }
                SummonFriendsFragment.this.mEditView.setCursorVisible(false);
                SummonFriendsFragment.this.mo66279j();
                SummonFriendsFragment.this.mo66278i();
                return true;
            }
        });
        this.mBtnClear.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SummonFriendsFragment.this.mEditView.setText("");
            }
        });
        mo66279j();
        DmtStatusView dmtStatusView = this.mStatusView;
        C10719a a = C10719a.m21676a(getContext());
        if (this.f85147e == 1) {
            i = R.string.f62;
        } else {
            i = R.string.f63;
        }
        dmtStatusView.setBuilder(a.mo19231b(m75554b(i)).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C32751au(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.q_, viewGroup, false);
    }
}
