package com.p683ss.android.ugc.aweme.video.hashtag;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.shortvideo.mob.HashTagMobHelper;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p683ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter */
public final class HashTagListAdapter extends C1322a<C1352v> {

    /* renamed from: a */
    public Context f120687a;

    /* renamed from: b */
    public C48032e f120688b;

    /* renamed from: c */
    public boolean f120689c;

    /* renamed from: d */
    public HashTagMobHelper f120690d;

    /* renamed from: e */
    public String f120691e;

    /* renamed from: f */
    public LogPbBean f120692f;

    /* renamed from: g */
    private List<C48029c> f120693g;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter$ItemViewHolder */
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

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter$ItemViewHolder_ViewBinding */
    public class ItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ItemViewHolder f120699a;

        public void unbind() {
            ItemViewHolder itemViewHolder = this.f120699a;
            if (itemViewHolder != null) {
                this.f120699a = null;
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
            this.f120699a = itemViewHolder;
            itemViewHolder.mHashTagTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.ani, "field 'mHashTagTitle'", TextView.class);
            itemViewHolder.mHashTagImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.anf, "field 'mHashTagImage'", ImageView.class);
            itemViewHolder.mHashTagNum = (TextView) Utils.findRequiredViewAsType(view, R.id.anh, "field 'mHashTagNum'", TextView.class);
            itemViewHolder.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ze, "field 'mContent'", LinearLayout.class);
            itemViewHolder.mHashTagUser = (ImageView) Utils.findRequiredViewAsType(view, R.id.as5, "field 'mHashTagUser'", ImageView.class);
        }
    }

    public final int getItemCount() {
        return this.f120693g.size();
    }

    public final int getItemViewType(int i) {
        return ((C48029c) this.f120693g.get(i)).f120708b;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return null;
        }
        return new ItemViewHolder(LayoutInflater.from(this.f120687a).inflate(R.layout.uz, viewGroup, false));
    }

    public final void onBindViewHolder(final C1352v vVar, final int i) {
        final C48029c cVar;
        int i2;
        String str;
        String str2 = null;
        if (i < 0 || i >= this.f120693g.size()) {
            cVar = null;
        } else {
            cVar = (C48029c) this.f120693g.get(i);
        }
        if ((vVar instanceof ItemViewHolder) && cVar != null) {
            String challengeName = cVar.f120707a.getChallengeName();
            if (!challengeName.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challengeName);
                challengeName = sb.toString();
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) vVar;
            itemViewHolder.mHashTagTitle.setText(challengeName);
            itemViewHolder.mHashTagNum.setText(C33095b.m76068a(cVar.f120707a.getViewCount()));
            TextView textView = itemViewHolder.mHashTagNum;
            int i3 = 8;
            if (!cVar.f120710d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            itemViewHolder.mHashTagUser.setVisibility(4);
            int i4 = cVar.f120709c;
            ImageView imageView = itemViewHolder.mHashTagImage;
            if (this.f120689c && i4 > 0) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                itemViewHolder.mHashTagImage.setImageResource(i4);
            }
            vVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (HashTagListAdapter.this.f120688b != null) {
                        HashTagListAdapter.this.f120688b.mo86595a(cVar.f120707a);
                    }
                    if (cVar.f120711e != null) {
                        cVar.f120711e.mo50416b(HashTagListAdapter.this.f120687a, i);
                    }
                    if (HashTagListAdapter.this.f120690d != null) {
                        String str = null;
                        HashTagListAdapter.this.f120690d.mo89564a("click_tag_button", cVar, Integer.valueOf(i), null);
                        if (TextUtils.equals(cVar.f120712f, "search")) {
                            HashTagMobHelper hashTagMobHelper = HashTagListAdapter.this.f120690d;
                            C48029c cVar = cVar;
                            Integer valueOf = Integer.valueOf(i);
                            if (cVar != null && valueOf != null) {
                                valueOf.intValue();
                                String str2 = cVar.f120707a.challengeName;
                                String str3 = cVar.f120707a.groupId;
                                String str4 = "trending_words_click";
                                C26898j a = new C26898j().mo54849a("words_content", str2).mo54849a("words_position", String.valueOf(valueOf.intValue())).mo54849a("words_source", "sug").mo54849a("search_position", "challenge_create").mo54849a("raw_query", hashTagMobHelper.f111419d).mo54849a("rank", "-1");
                                String str5 = "query_id";
                                RecommendWordMob recommendWordMob = hashTagMobHelper.f111418c;
                                if (recommendWordMob != null) {
                                    str = recommendWordMob.getQueryId();
                                }
                                C26890h.m65012a(str4, a.mo54849a(str5, str).mo54849a("group_id", str3).mo54850a());
                            }
                        }
                    }
                }
            });
            if (cVar.f120711e != null) {
                cVar.f120711e.mo50415a(this.f120687a, i);
            }
            if (cVar.f120708b == 2) {
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
            if (this.f120690d != null) {
                HashTagMobHelper hashTagMobHelper = this.f120690d;
                Integer valueOf = Integer.valueOf(i);
                if (!(cVar == null || valueOf == null)) {
                    valueOf.intValue();
                    String str3 = "show_tag_words";
                    C26898j a = new C26898j().mo54849a("enter_method", hashTagMobHelper.f111422g).mo54849a("tag_id", cVar.f120707a.getCid()).mo54849a("tag_source", cVar.f120712f).mo54849a("tag_content", cVar.f120707a.challengeName).mo54849a("rank", String.valueOf(valueOf.intValue())).mo54849a("creation_id", hashTagMobHelper.f111416a);
                    String str4 = "title";
                    BaseTitleHelper baseTitleHelper = hashTagMobHelper.f111420e;
                    if (baseTitleHelper != null) {
                        str = baseTitleHelper.f120716c;
                    } else {
                        str = null;
                    }
                    C26890h.m65012a(str3, a.mo54849a(str4, str).mo54850a());
                }
                if (TextUtils.equals(cVar.f120712f, "search")) {
                    HashTagMobHelper hashTagMobHelper2 = this.f120690d;
                    Integer valueOf2 = Integer.valueOf(i);
                    if (cVar != null && valueOf2 != null) {
                        valueOf2.intValue();
                        String str5 = cVar.f120707a.challengeName;
                        String str6 = cVar.f120707a.groupId;
                        String str7 = "trending_words_show";
                        C26898j a2 = new C26898j().mo54849a("words_content", str5).mo54849a("words_position", String.valueOf(valueOf2.intValue())).mo54849a("words_source", "sug").mo54849a("search_position", "challenge_create").mo54849a("raw_query", hashTagMobHelper2.f111419d).mo54849a("rank", "-1");
                        String str8 = "query_id";
                        RecommendWordMob recommendWordMob = hashTagMobHelper2.f111418c;
                        if (recommendWordMob != null) {
                            str2 = recommendWordMob.getQueryId();
                        }
                        C26890h.m65012a(str7, a2.mo54849a(str8, str2).mo54849a("group_id", str6).mo54850a());
                    }
                }
            }
        }
    }

    public HashTagListAdapter(Context context, List list, C48032e eVar) {
        if (context instanceof FragmentActivity) {
            this.f120690d = (HashTagMobHelper) C0214z.m440a((FragmentActivity) context).mo359a(HashTagMobHelper.class);
        }
        this.f120693g = list;
        this.f120687a = context;
        this.f120688b = eVar;
    }
}
