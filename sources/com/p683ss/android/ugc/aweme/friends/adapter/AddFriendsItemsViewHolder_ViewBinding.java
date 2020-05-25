package com.p683ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AddFriendsItemsViewHolder_ViewBinding */
public class AddFriendsItemsViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddFriendsItemsViewHolder f84610a;

    /* renamed from: b */
    private View f84611b;

    /* renamed from: c */
    private View f84612c;

    /* renamed from: d */
    private View f84613d;

    /* renamed from: e */
    private View f84614e;

    /* renamed from: f */
    private View f84615f;

    public void unbind() {
        AddFriendsItemsViewHolder addFriendsItemsViewHolder = this.f84610a;
        if (addFriendsItemsViewHolder != null) {
            this.f84610a = null;
            addFriendsItemsViewHolder.mRedPointView = null;
            this.f84611b.setOnClickListener(null);
            this.f84611b = null;
            this.f84612c.setOnClickListener(null);
            this.f84612c = null;
            this.f84613d.setOnClickListener(null);
            this.f84613d = null;
            this.f84614e.setOnClickListener(null);
            this.f84614e = null;
            this.f84615f.setOnClickListener(null);
            this.f84615f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddFriendsItemsViewHolder_ViewBinding(final AddFriendsItemsViewHolder addFriendsItemsViewHolder, View view) {
        this.f84610a = addFriendsItemsViewHolder;
        addFriendsItemsViewHolder.mRedPointView = (TextView) Utils.findRequiredViewAsType(view, R.id.caq, "field 'mRedPointView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.df, "method 'onClick'");
        this.f84611b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dl, "method 'onClick'");
        this.f84612c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.dn, "method 'onClick'");
        this.f84613d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.dc, "method 'onClick'");
        this.f84614e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.auw, "method 'onClick'");
        this.f84615f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
    }
}
