package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.infoSticker.category.C35595a;
import com.p683ss.android.ugc.aweme.infoSticker.category.C35601b;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.p */
public class C35620p extends Fragment {

    /* renamed from: a */
    private HashSet<String> f91536a = new HashSet<>();

    /* renamed from: b */
    private EffectChannelResponse f91537b;

    /* renamed from: c */
    protected C35610h f91538c;

    /* renamed from: d */
    protected RecyclerView f91539d;

    /* renamed from: e */
    protected AVStatusView f91540e;

    /* renamed from: f */
    protected String f91541f;

    /* renamed from: g */
    protected GridLayoutManager f91542g;

    /* renamed from: h */
    protected C37722a f91543h;

    /* renamed from: i */
    public boolean f91544i;

    /* renamed from: j */
    public boolean f91545j;

    /* renamed from: k */
    protected View f91546k;

    /* renamed from: l */
    protected C35595a f91547l;

    /* renamed from: m */
    protected int f91548m = 3;

    /* renamed from: n */
    protected String f91549n;

    /* renamed from: o */
    protected C35584av f91550o;

    /* renamed from: p */
    private boolean f91551p = false;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo74022b() {
        mo74027f();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C35595a mo74032h() {
        return new C35595a(this.f91550o);
    }

    /* renamed from: f */
    private void mo74027f() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C35635v.m80462a(activity).mo73932a("infostickerv2").observe(activity, new C35626s(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo74024c() {
        if (this.f91543h == C37722a.LOADING) {
            this.f91540e.mo98095b();
        } else if (this.f91543h == C37722a.ERROR) {
            this.f91540e.mo98098d();
        } else {
            if (this.f91543h == C37722a.SUCCESS) {
                mo74025d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo74025d() {
        if (this.f91537b == null) {
            this.f91540e.mo98097c();
            return;
        }
        this.f91540e.mo98093a();
        this.f91538c.f91517i = this.f91545j;
        this.f91538c.mo74018a(this.f91537b);
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableCategorizedInfoStickers)) {
            C35635v.m80463b(getActivity()).mo73993e().setValue(this.f91537b.getCategoryResponseList());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo74033i() {
        if (this.f91537b != null) {
            int min = Math.min(this.f91542g.mo4751l() - this.f91542g.mo4749j(), this.f91537b.getAllCategoryEffects().size());
            if (min > 0 && getActivity() != null) {
                InfoStickerViewModel a = C35635v.m80462a(getActivity());
                List subList = this.f91537b.getAllCategoryEffects().subList(0, min);
                if (!subList.isEmpty()) {
                    a.f91353a.mo73917a(subList, false);
                }
            }
        }
        mo74031g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo74020a() {
        C35618o oVar;
        this.f91549n = "sticker";
        mo74026e();
        this.f91542g = new GridLayoutManager(getContext(), this.f91548m, 1, false);
        this.f91539d.setItemViewCacheSize(this.f91548m);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C35618o) {
            oVar = (C35618o) requireActivity;
        } else {
            oVar = C35618o.f91535a;
        }
        this.f91539d.setLayoutManager(this.f91542g);
        if (this.f91539d.getAdapter() == null) {
            this.f91538c = new C35610h(getActivity(), this.f91541f);
            this.f91538c.f91518j = oVar;
            this.f91539d.setAdapter(this.f91538c);
        } else {
            this.f91538c = (C35610h) this.f91539d.getAdapter();
            this.f91538c.f91518j = oVar;
        }
        mo74027f();
        this.f91538c.mo97992c(false);
        this.f91538c.f91375b = this.f91544i;
        this.f91539d.post(new C35625r(this));
        this.f91539d.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C35620p.this.mo74031g();
                }
            }
        });
    }

    /* renamed from: g */
    public final void mo74031g() {
        String str;
        if (this.f91542g != null && getActivity() != null) {
            int j = this.f91542g.mo4749j();
            int l = this.f91542g.mo4751l();
            VideoPublishEditModel videoPublishEditModel = C35635v.m80462a(getActivity()).f91355c;
            if (videoPublishEditModel != null) {
                while (true) {
                    j++;
                    if (j < l + 1) {
                        StickerWrapper stickerWrapper = (StickerWrapper) this.f91538c.f91514f.get(j);
                        if (stickerWrapper != null && !this.f91536a.contains(stickerWrapper.f115779a.getEffectId())) {
                            String effectId = stickerWrapper.f115779a.getEffectId();
                            String str2 = "";
                            if (videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(effectId)) {
                                str2 = (String) videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().get(effectId);
                            }
                            C47702b bVar = C47702b.f120193a;
                            String str3 = "prop_show";
                            C42438az a = C42438az.m93209a().mo86523a("scene_id", (int) BaseNotice.CHECK_PROFILE).mo86526a("prop_id", effectId).mo86526a("prop_index", stickerWrapper.f115779a.getGradeKey()).mo86526a("enter_method", "click_main_panel").mo86526a("creation_id", videoPublishEditModel.creationId).mo86526a("shoot_way", videoPublishEditModel.mShootWay).mo86523a("draft_id", videoPublishEditModel.draftId);
                            String str4 = "enter_from";
                            if (this.f91544i) {
                                str = "edit_post_page";
                            } else {
                                str = "video_edit_page";
                            }
                            bVar.mo94984a(str3, a.mo86526a(str4, str).mo86526a("category_name", this.f91549n).mo86526a("tab_id", str2).mo86523a("is_giphy", 0).f107329a);
                            this.f91536a.add(effectId);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo74026e() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableCategorizedInfoStickers)) {
            this.f91548m = 4;
            this.f91547l = mo74032h();
            this.f91547l.f91490n = "sticker";
            this.f91547l.mo74006a(this.f91546k, getActivity());
            C35595a aVar = this.f91547l;
            aVar.f91491o = C9432q.m18670a((Context) aVar.f91479c);
            aVar.f91492p = C9432q.m18687b((Context) aVar.f91479c, 320.0f);
            aVar.f91494r = C9432q.m18687b((Context) aVar.f91479c, 12.0f);
            aVar.f91495s = C9432q.m18687b((Context) aVar.f91479c, 10.0f);
            aVar.f91496t = C9432q.m18687b((Context) aVar.f91479c, 32.0f);
            aVar.f91488l = (Vibrator) aVar.f91479c.getSystemService("vibrator");
            C35595a aVar2 = this.f91547l;
            C35635v.m80463b(aVar2.f91479c).mo73993e().observe(aVar2.f91479c, new C35601b(aVar2));
            C35635v.m80463b(aVar2.f91479c).mo73992d().observe(aVar2.f91479c, new C0199s<Boolean>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        C35595a.this.f91487k = bool.booleanValue();
                    }
                }
            });
            C35635v.m80463b(aVar2.f91479c).mo73991c().observe(aVar2.f91479c, new C0199s<Boolean>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            C35595a.this.f91482f.setVisibility(0);
                        } else {
                            C35595a.this.f91481e.setVisibility(4);
                            C35595a.this.f91482f.setVisibility(4);
                        }
                    }
                }
            });
            C35635v.m80463b(aVar2.f91479c).mo73989a().observe(aVar2.f91479c, new C0199s<Boolean>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            C35595a.this.f91481e.setVisibility(0);
                            C35595a.this.f91480d.setVisibility(0);
                            return;
                        }
                        C35595a.this.f91481e.setVisibility(8);
                        C35595a.this.f91480d.setVisibility(8);
                    }
                }
            });
            if (getActivity() != null) {
                this.f91539d.setFadingEdgeLength((int) C9432q.m18687b((Context) getActivity(), 4.0f));
            }
            this.f91539d.setVerticalFadingEdgeEnabled(true);
            int b = (int) C9432q.m18687b((Context) getActivity(), 0.0f);
            int b2 = (int) C9432q.m18687b((Context) getActivity(), 3.0f);
            this.f91539d.setPadding(b2, b, b2, b);
            C35635v.m80463b(getActivity()).mo73989a().setValue(Boolean.valueOf(true));
            if (getActivity() != null) {
                C35635v.m80462a(getActivity()).mo73939d().observe(this, new C0199s<Integer>() {
                    public final /* synthetic */ void onChanged(Object obj) {
                        Integer num = (Integer) obj;
                        if (C35620p.this.f91538c.f91516h != null && C35620p.this.f91538c.f91516h.size() > 0 && num != null && C35620p.this.f91538c.f91516h != null && num.intValue() >= 0 && num.intValue() < C35620p.this.f91538c.f91516h.size()) {
                            Integer num2 = (Integer) C35620p.this.f91538c.f91516h.get(num.intValue());
                            if (num2 != null) {
                                C35620p.this.f91542g.mo4721a(num2.intValue(), 0);
                            }
                        }
                    }
                });
            }
            this.f91539d.setOnTouchListener(new C35627t(this));
            this.f91539d.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                }

                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    View c = C35620p.this.f91542g.mo4736c(C35620p.this.f91542g.mo4749j());
                    if (c == null) {
                        C35635v.m80463b(C35620p.this.getActivity()).mo73991c().setValue(Boolean.valueOf(false));
                        return;
                    }
                    C35635v.m80463b(C35620p.this.getActivity()).mo73991c().setValue(Boolean.valueOf(true));
                    Object tag = c.getTag();
                    if (tag instanceof Bundle) {
                        Bundle bundle = (Bundle) tag;
                        C35620p.this.f91547l.f91483g.setText(bundle.getString("bundle_subtitle"));
                        if (bundle.getInt("bundle_view_type") == 4) {
                            if (c.getTop() > (-C35620p.this.f91547l.f91481e.getMeasuredHeight())) {
                                C35595a aVar = C35620p.this.f91547l;
                                aVar.f91484h.setText(bundle.getString("bundle_pre_subtitle"));
                                aVar.f91482f.setTranslationY((float) c.getTop());
                                aVar.f91481e.setTranslationY((float) c.getTop());
                                aVar.f91481e.setVisibility(0);
                                c.setVisibility(8);
                            } else {
                                C35620p.this.f91547l.mo74005a(bundle, c);
                            }
                            C35620p.this.f91547l.f91486j = c;
                            return;
                        }
                        if (C35620p.this.getActivity() != null) {
                            int i3 = bundle.getInt("bundle_subtitle_position");
                            C44709f a = C35620p.this.f91547l.f91480d.mo90679a(i3);
                            if (a != null && C35620p.this.f91547l.f91487k) {
                                C35620p.this.f91547l.f91480d.mo90697c(a, true);
                                C35620p.this.f91547l.mo74008a(a, i3);
                                C35620p.this.f91547l.mo74004a(i3);
                            }
                        }
                        C35620p.this.f91547l.mo74005a(bundle, c);
                        if (C35620p.this.f91547l.f91486j != null) {
                            C35620p.this.f91547l.f91486j.setVisibility(0);
                            C35620p.this.f91547l.f91486j = null;
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74029a(View view) {
        mo74022b();
    }

    /* renamed from: b */
    public static C35620p m80442b(C35584av avVar) {
        C35620p pVar = new C35620p();
        pVar.f91550o = avVar;
        return pVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f91550o != null) {
            mo74020a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo74030c(C37721a aVar) {
        if (aVar != null) {
            this.f91543h = aVar.f96126b;
            this.f91537b = (EffectChannelResponse) aVar.f96125a;
            mo74024c();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vd, viewGroup, false);
        this.f91539d = (RecyclerView) inflate.findViewById(R.id.ct3);
        this.f91540e = (AVStatusView) inflate.findViewById(R.id.atx);
        this.f91540e.setBuilder(C50243a.m108469a(getContext()).mo98104a(R.string.f5o, R.string.f5k, R.string.f5u, new C35624q(this)).mo98103a(R.string.bx4, R.string.f5x).mo98106b(1));
        this.f91540e.setVisibility(0);
        this.f91546k = inflate;
        return inflate;
    }
}
