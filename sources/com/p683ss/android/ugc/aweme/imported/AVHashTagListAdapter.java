package com.p683ss.android.ugc.aweme.imported;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.shortvideo.C42442b;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p683ss.android.ugc.aweme.video.hashtag.C48032e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter */
public final class AVHashTagListAdapter extends C1322a<C1352v> {

    /* renamed from: a */
    List<C42442b> f91284a;

    /* renamed from: b */
    C48032e f91285b;

    /* renamed from: c */
    public boolean f91286c;

    /* renamed from: d */
    public AVSearchChallengeList f91287d;

    /* renamed from: e */
    private Context f91288e;

    /* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter$ItemViewHolder */
    public static class ItemViewHolder extends C1352v {
        @BindView(2131493087)
        LinearLayout mContent;
        @BindView(2131493341)
        ImageView mHashTagImage;
        @BindView(2131493343)
        TextView mHashTagNum;
        @BindView(2131493344)
        TextView mHashTagTitle;
        @BindView(2131493412)
        ImageView mHashTagUser;

        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter$ItemViewHolder_ViewBinding */
    public class ItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ItemViewHolder f91291a;

        public void unbind() {
            ItemViewHolder itemViewHolder = this.f91291a;
            if (itemViewHolder != null) {
                this.f91291a = null;
                itemViewHolder.mHashTagTitle = null;
                itemViewHolder.mHashTagImage = null;
                itemViewHolder.mHashTagNum = null;
                itemViewHolder.mContent = null;
                itemViewHolder.mHashTagUser = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.f91291a = itemViewHolder;
            itemViewHolder.mHashTagTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.ani, "field 'mHashTagTitle'", TextView.class);
            itemViewHolder.mHashTagImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.anf, "field 'mHashTagImage'", ImageView.class);
            itemViewHolder.mHashTagNum = (TextView) Utils.findRequiredViewAsType(view, R.id.anh, "field 'mHashTagNum'", TextView.class);
            itemViewHolder.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ze, "field 'mContent'", LinearLayout.class);
            itemViewHolder.mHashTagUser = (ImageView) Utils.findRequiredViewAsType(view, R.id.as5, "field 'mHashTagUser'", ImageView.class);
        }
    }

    public final int getItemCount() {
        return this.f91284a.size();
    }

    public final int getItemViewType(int i) {
        return ((C42442b) this.f91284a.get(i)).f107333b;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return null;
        }
        return new ItemViewHolder(LayoutInflater.from(this.f91288e).inflate(R.layout.uz, viewGroup, false));
    }

    public final void onBindViewHolder(final C1352v vVar, int i) {
        int i2;
        if (vVar instanceof ItemViewHolder) {
            String challengeName = ((C42442b) this.f91284a.get(i)).f107332a.getChallengeName();
            if (!challengeName.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challengeName);
                challengeName = sb.toString();
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) vVar;
            itemViewHolder.mHashTagTitle.setText(challengeName);
            itemViewHolder.mHashTagNum.setText(C33095b.m76068a(((C42442b) this.f91284a.get(i)).f107332a.getDisplayCount()));
            TextView textView = itemViewHolder.mHashTagNum;
            int i3 = 8;
            if (!((C42442b) this.f91284a.get(i)).f107335d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            itemViewHolder.mHashTagUser.setVisibility(4);
            int i4 = ((C42442b) this.f91284a.get(i)).f107334c;
            ImageView imageView = itemViewHolder.mHashTagImage;
            if (this.f91286c && i4 > 0) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                itemViewHolder.mHashTagImage.setImageResource(i4);
            }
            vVar.itemView.setOnClickListener(new C35519a(this, i));
            if (((C42442b) this.f91284a.get(i)).f107333b == 2) {
                itemViewHolder.mContent.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            ((ItemViewHolder) vVar).mContent.setAlpha(0.5f);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            ((ItemViewHolder) vVar).mContent.setAlpha(1.0f);
                        }
                        return false;
                    }
                });
            }
        }
    }
}
