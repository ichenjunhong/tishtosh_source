package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder_ViewBinding */
public class BaseForwardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseForwardViewHolder f84413a;

    /* renamed from: b */
    private View f84414b;

    /* renamed from: c */
    private View f84415c;

    /* renamed from: d */
    private View f84416d;

    /* renamed from: e */
    private View f84417e;

    /* renamed from: f */
    private View f84418f;

    /* renamed from: g */
    private View f84419g;

    /* renamed from: h */
    private View f84420h;

    /* renamed from: i */
    private View f84421i;

    public void unbind() {
        if (this.f84413a != null) {
            this.f84413a = null;
            if (this.f84414b != null) {
                this.f84414b.setOnClickListener(null);
                this.f84414b = null;
            }
            this.f84415c.setOnClickListener(null);
            this.f84415c = null;
            this.f84416d.setOnClickListener(null);
            this.f84416d = null;
            if (this.f84417e != null) {
                this.f84417e.setOnClickListener(null);
                this.f84417e = null;
            }
            this.f84418f.setOnClickListener(null);
            this.f84418f = null;
            if (this.f84419g != null) {
                this.f84419g.setOnClickListener(null);
                this.f84419g = null;
            }
            this.f84420h.setOnClickListener(null);
            this.f84420h = null;
            this.f84421i.setOnClickListener(null);
            this.f84421i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseForwardViewHolder_ViewBinding(final BaseForwardViewHolder baseForwardViewHolder, View view) {
        this.f84413a = baseForwardViewHolder;
        View findViewById = view.findViewById(R.id.b0g);
        if (findViewById != null) {
            this.f84414b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.clickExtra();
                }
            });
        }
        View findRequiredView = Utils.findRequiredView(view, R.id.b6z, "method 'onClickAuthorAvatar'");
        this.f84415c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.onClickAuthorAvatar(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dic, "method 'onClickAuthorName'");
        this.f84416d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.onClickAuthorName(view);
            }
        });
        View findViewById2 = view.findViewById(R.id.b7s);
        if (findViewById2 != null) {
            this.f84417e = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.showCreateForward(view);
                }
            });
        }
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b77, "method 'expandComment'");
        this.f84418f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.expandComment(view);
            }
        });
        View findViewById3 = view.findViewById(R.id.b9n);
        if (findViewById3 != null) {
            this.f84419g = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.showShare(view);
                }
            });
        }
        View findRequiredView4 = Utils.findRequiredView(view, R.id.b6v, "method 'addComment'");
        this.f84420h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.addComment();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.b7f, "method 'clickLike'");
        this.f84421i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.clickLike(view);
            }
        });
    }
}
