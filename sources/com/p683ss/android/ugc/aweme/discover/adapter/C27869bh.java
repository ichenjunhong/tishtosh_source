package com.p683ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchRichSugExperiment;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.discover.adapter.p1636a.C27782a;
import com.p683ss.android.ugc.aweme.discover.adapter.p1636a.C27782a.C27786b;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28378f;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SugExtraInfo;
import com.p683ss.android.ugc.aweme.discover.p1651i.p1652a.C28238a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView.C28975a;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p683ss.android.ugc.aweme.profile.util.C40536aj;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bh */
public final class C27869bh extends C1322a<C1352v> {

    /* renamed from: a */
    public List<SearchSugEntity> f73219a = new ArrayList();

    /* renamed from: b */
    public String f73220b;

    /* renamed from: c */
    public C28238a f73221c;

    /* renamed from: d */
    public SearchIntermediateViewModel f73222d;

    /* renamed from: e */
    public int f73223e = C10181b.m20511a().mo18168a(SearchRichSugExperiment.class, true, "search_rich_sug_type", 31744, 0);

    /* renamed from: f */
    private C28975a f73224f;

    public final int getItemCount() {
        return this.f73219a.size();
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C27782a) {
            ((C27782a) vVar).f73018e = true;
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C27782a) {
            ((C27782a) vVar).f73018e = false;
        }
    }

    public C27869bh(FragmentActivity fragmentActivity) {
        this.f73222d = (SearchIntermediateViewModel) C0214z.m440a(fragmentActivity).mo359a(SearchIntermediateViewModel.class);
        this.f73224f = new C28975a() {
            /* renamed from: a */
            public final void mo56293a() {
                if (C27869bh.this.f73222d != null) {
                    C27869bh.this.f73222d.getDismissKeyboard().setValue(Boolean.valueOf(true));
                }
            }

            /* renamed from: a */
            public final void mo56294a(boolean z) {
                if (C27869bh.this.f73222d != null) {
                    C27869bh.this.f73222d.getDismissKeyboardOnActionDown().setValue(Boolean.valueOf(z));
                }
            }
        };
    }

    public final int getItemViewType(int i) {
        if (C9376b.m18558a((Collection<T>) this.f73219a)) {
            return 0;
        }
        SearchSugEntity searchSugEntity = (SearchSugEntity) this.f73219a.get(i);
        if (searchSugEntity.isHistoryType()) {
            return 1;
        }
        if (this.f73223e == 0 || searchSugEntity.sugExtraInfo == null || !searchSugEntity.sugExtraInfo.isRichSug()) {
            return 0;
        }
        return 2;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C28238a aVar = this.f73221c;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(aVar, "searchSugHandler");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsp, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            return new C27872bj(inflate, aVar);
        } else if (i == 2) {
            C28238a aVar2 = this.f73221c;
            C28975a aVar3 = this.f73224f;
            C52711k.m112240b(viewGroup, "parent");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsn, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "itemView");
            return new C27782a(inflate2, aVar2, aVar3);
        } else {
            return new SearchSugViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bso, viewGroup, false), this.f73221c, this.f73224f);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        CharSequence charSequence;
        int i2 = i;
        int itemViewType = getItemViewType(i2);
        boolean z2 = true;
        if (itemViewType == 1) {
            C27872bj bjVar = (C27872bj) vVar;
            SearchSugEntity searchSugEntity = (SearchSugEntity) this.f73219a.get(i2);
            String str = this.f73220b;
            C27871bi biVar = new C27871bi(this);
            C52711k.m112240b(searchSugEntity, "searchSugEntity");
            C52711k.m112240b(str, "requestId");
            C52711k.m112240b(biVar, "listener");
            ISearchMusicDepentService iSearchMusicDepentService = (ISearchMusicDepentService) bjVar.f73231d.getValue();
            View view = bjVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            SpannableString sugString = iSearchMusicDepentService.getSugString(view.getContext(), searchSugEntity.content, searchSugEntity.position, 0);
            View view2 = bjVar.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.d8j);
            C52711k.m112236a((Object) dmtTextView, "itemView.tv_content");
            if (bjVar.f73230c == 0 || searchSugEntity.sugExtraInfo == null || searchSugEntity.sugExtraInfo.getRichSugUserType() == -1) {
                charSequence = sugString;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(sugString);
                String str2 = " T";
                spannableStringBuilder.append(str2);
                View view3 = bjVar.itemView;
                C52711k.m112236a((Object) view3, "itemView");
                spannableStringBuilder.setSpan(new C40536aj(view3.getContext(), R.drawable.d0p, 1), (spannableStringBuilder.length() - str2.length()) + 1, spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            }
            dmtTextView.setText(charSequence);
            View view4 = bjVar.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            ((DmtTextView) view4.findViewById(R.id.d8j)).setOnClickListener(new C27875c(bjVar, searchSugEntity, str, i2));
            View view5 = bjVar.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            ((ImageView) view5.findViewById(R.id.azu)).setOnClickListener(new C27876d(bjVar, biVar, searchSugEntity, i2));
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (!(bjVar.f73230c == 0 || sugExtraInfo == null || !sugExtraInfo.isRichSug())) {
                CharSequence richSugAvatarUri = sugExtraInfo.getRichSugAvatarUri();
                if (!(richSugAvatarUri == null || richSugAvatarUri.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    View view6 = bjVar.itemView;
                    C52711k.m112236a((Object) view6, "itemView");
                    SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view6.findViewById(R.id.ay2);
                    C52711k.m112236a((Object) smartAvatarImageView, "itemView.iv_avatar");
                    smartAvatarImageView.setVisibility(0);
                    String richSugAvatarUri2 = sugExtraInfo.getRichSugAvatarUri();
                    if (richSugAvatarUri2 == null) {
                        richSugAvatarUri2 = "";
                    }
                    C12208t a = C12203q.m24646a(richSugAvatarUri2);
                    View view7 = bjVar.itemView;
                    C52711k.m112236a((Object) view7, "itemView");
                    a.mo23116a((C12197k) (SmartAvatarImageView) view7.findViewById(R.id.ay2)).mo23118a("SearchUserSugViewHolder").mo23121a();
                    return;
                }
            }
            View view8 = bjVar.itemView;
            C52711k.m112236a((Object) view8, "itemView");
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) view8.findViewById(R.id.ay2);
            C52711k.m112236a((Object) smartAvatarImageView2, "itemView.iv_avatar");
            smartAvatarImageView2.setVisibility(8);
        } else if (itemViewType == 2) {
            C27782a aVar = (C27782a) vVar;
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) this.f73219a.get(i2);
            String str3 = this.f73220b;
            if (!(searchSugEntity2 == null || searchSugEntity2.sugExtraInfo == null)) {
                aVar.f73015b = searchSugEntity2;
                aVar.f73016c = i2;
                if (str3 == null) {
                    str3 = "";
                }
                aVar.f73017d = str3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                ISearchMusicDepentService iSearchMusicDepentService2 = (ISearchMusicDepentService) aVar.f73019f.getValue();
                View view9 = aVar.itemView;
                C52711k.m112236a((Object) view9, "itemView");
                spannableStringBuilder2.append(iSearchMusicDepentService2.getSugString(view9.getContext(), searchSugEntity2.content, searchSugEntity2.position, 0));
                if (searchSugEntity2.sugExtraInfo.getRichSugUserType() != -1) {
                    String str4 = " T";
                    spannableStringBuilder2.append(str4);
                    View view10 = aVar.itemView;
                    C52711k.m112236a((Object) view10, "itemView");
                    spannableStringBuilder2.setSpan(new C40536aj(view10.getContext(), R.drawable.d0p, 1), (spannableStringBuilder2.length() - str4.length()) + 1, spannableStringBuilder2.length(), 33);
                }
                View view11 = aVar.itemView;
                C52711k.m112236a((Object) view11, "itemView");
                DmtTextView dmtTextView2 = (DmtTextView) view11.findViewById(R.id.dcr);
                C52711k.m112236a((Object) dmtTextView2, "itemView.tv_nickname");
                dmtTextView2.setText(spannableStringBuilder2);
                SugExtraInfo sugExtraInfo2 = searchSugEntity2.sugExtraInfo;
                if (sugExtraInfo2 != null) {
                    CharSequence richSugAvatarUri3 = sugExtraInfo2.getRichSugAvatarUri();
                    if (richSugAvatarUri3 == null || richSugAvatarUri3.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String richSugAvatarUri4 = sugExtraInfo2.getRichSugAvatarUri();
                        if (richSugAvatarUri4 == null) {
                            richSugAvatarUri4 = "";
                        }
                        C12208t a2 = C12203q.m24646a(richSugAvatarUri4);
                        View view12 = aVar.itemView;
                        C52711k.m112236a((Object) view12, "itemView");
                        a2.mo23116a((C12197k) (SmartAvatarImageView) view12.findViewById(R.id.ay2)).mo23118a("SearchUserSugViewHolder").mo23121a();
                        aVar.itemView.post(new C27786b(i2, searchSugEntity2));
                    }
                }
                View view13 = aVar.itemView;
                C52711k.m112236a((Object) view13, "itemView");
                SmartAvatarImageView smartAvatarImageView3 = (SmartAvatarImageView) view13.findViewById(R.id.ay2);
                C52711k.m112236a((Object) smartAvatarImageView3, "itemView.iv_avatar");
                smartAvatarImageView3.setController(null);
                aVar.itemView.post(new C27786b(i2, searchSugEntity2));
            }
        } else {
            SearchSugViewHolder searchSugViewHolder = (SearchSugViewHolder) vVar;
            SearchSugEntity searchSugEntity3 = (SearchSugEntity) this.f73219a.get(i2);
            String str5 = this.f73220b;
            if (searchSugEntity3 != null) {
                searchSugViewHolder.f72980c = searchSugEntity3;
                searchSugViewHolder.f72981d = i2;
                searchSugViewHolder.mSugView.setText(SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin().getSugString(searchSugViewHolder.itemView.getContext(), searchSugEntity3.content, searchSugEntity3.position, 0));
                searchSugViewHolder.itemView.setOnTouchListener(new C28515aw(i2, searchSugEntity3, str5) {

                    /* renamed from: a */
                    final /* synthetic */ int f72984a;

                    /* renamed from: b */
                    final /* synthetic */ SearchSugEntity f72985b;

                    /* renamed from: c */
                    final /* synthetic */ String f72986c;

                    /* renamed from: b */
                    public final void mo55272b(View view, MotionEvent motionEvent) {
                        if (System.currentTimeMillis() - SearchSugViewHolder.this.f72978a >= 500) {
                            int i = this.f72984a;
                            SearchSugEntity searchSugEntity = this.f72985b;
                            ((C28379g) new C28378f().mo56802a(searchSugEntity.mWord).mo56804a("sug").mo56805b(searchSugEntity.content).mo56803a(Integer.valueOf(i)).mo56809f("normal_sug").mo48070a(searchSugEntity.extraParam)).mo48076e();
                            SearchSugViewHolder.this.f72978a = System.currentTimeMillis();
                            if (SearchSugViewHolder.this.f72979b != null) {
                                SearchSugViewHolder.this.f72979b.mo56659a(this.f72985b, this.f72986c, this.f72984a);
                            }
                        }
                    }

                    {
                        this.f72984a = r2;
                        this.f72985b = r3;
                        this.f72986c = r4;
                    }
                });
                if (!searchSugEntity3.isMobShow) {
                    searchSugEntity3.isMobShow = true;
                    ((C28379g) new C28379g().mo56802a(searchSugEntity3.mWord).mo56804a("sug").mo56805b(searchSugEntity3.content).mo56803a(Integer.valueOf(i)).mo56809f("normal_sug").mo48070a(searchSugEntity3.extraParam)).mo48076e();
                }
            }
        }
    }
}
