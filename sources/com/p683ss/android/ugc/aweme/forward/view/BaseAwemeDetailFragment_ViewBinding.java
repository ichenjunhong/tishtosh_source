package com.p683ss.android.ugc.aweme.forward.view;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.BaseAwemeDetailFragment_ViewBinding */
public class BaseAwemeDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAwemeDetailFragment f84514a;

    /* renamed from: b */
    private View f84515b;

    /* renamed from: c */
    private View f84516c;

    /* renamed from: d */
    private View f84517d;

    public void unbind() {
        BaseAwemeDetailFragment baseAwemeDetailFragment = this.f84514a;
        if (baseAwemeDetailFragment != null) {
            this.f84514a = null;
            baseAwemeDetailFragment.mAuthorAvatarLayout = null;
            baseAwemeDetailFragment.mAuthorAvatarImageView = null;
            baseAwemeDetailFragment.mAuthorAvatarLiveView = null;
            baseAwemeDetailFragment.mAuthorAvatarBorderView = null;
            baseAwemeDetailFragment.mAuthorNameView = null;
            baseAwemeDetailFragment.mRecyclerView = null;
            baseAwemeDetailFragment.mEditText = null;
            baseAwemeDetailFragment.mAtView = null;
            baseAwemeDetailFragment.mEmojiView = null;
            this.f84515b.setOnClickListener(null);
            this.f84515b = null;
            this.f84516c.setOnClickListener(null);
            this.f84516c = null;
            this.f84517d.setOnClickListener(null);
            this.f84517d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAwemeDetailFragment_ViewBinding(final BaseAwemeDetailFragment baseAwemeDetailFragment, View view) {
        this.f84514a = baseAwemeDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.b6z, "field 'mAuthorAvatarLayout' and method 'onAvatarClick'");
        baseAwemeDetailFragment.mAuthorAvatarLayout = (ViewGroup) Utils.castView(findRequiredView, R.id.b6z, "field 'mAuthorAvatarLayout'", ViewGroup.class);
        this.f84515b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onAvatarClick();
            }
        });
        baseAwemeDetailFragment.mAuthorAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.dm3, "field 'mAuthorAvatarImageView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarLiveView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.dm9, "field 'mAuthorAvatarLiveView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, R.id.dn0, "field 'mAuthorAvatarBorderView'", LiveCircleView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dic, "field 'mAuthorNameView' and method 'onNickNameClick'");
        baseAwemeDetailFragment.mAuthorNameView = (TextView) Utils.castView(findRequiredView2, R.id.dic, "field 'mAuthorNameView'", TextView.class);
        this.f84516c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onNickNameClick();
            }
        });
        baseAwemeDetailFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.dro, "field 'mRecyclerView'", RecyclerView.class);
        baseAwemeDetailFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.x4, "field 'mEditText'", MentionEditText.class);
        baseAwemeDetailFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.gg, "field 'mAtView'", FadeImageView.class);
        baseAwemeDetailFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.a_s, "field 'mEmojiView'", FadeImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ik, "method 'onBack'");
        this.f84517d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onBack();
            }
        });
    }
}
