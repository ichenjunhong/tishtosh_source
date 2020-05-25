package com.p683ss.android.ugc.trill.language;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1593e.C26869c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.trill.language.C50356j.C50362f;
import com.p683ss.android.ugc.trill.language.C50356j.C50363g;
import com.p683ss.android.ugc.trill.settings.ContentLangLimitSettings;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.language.g */
public final class C50342g extends C1322a<C50356j> {

    /* renamed from: a */
    public C50368m f126243a;

    /* renamed from: b */
    public ArrayList<String> f126244b = new ArrayList<>();

    /* renamed from: c */
    private List<ContentLanguageGuideSetting> f126245c;

    /* renamed from: d */
    private final String f126246d;

    /* renamed from: com.ss.android.ugc.trill.language.g$a */
    public static final class C50343a extends C26869c {

        /* renamed from: a */
        final /* synthetic */ C50342g f126247a;

        /* renamed from: b */
        final /* synthetic */ C50356j f126248b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f126249c;

        /* renamed from: b */
        public final Animator mo51960b(View view) {
            RelativeLayout relativeLayout;
            if (view != null) {
                relativeLayout = (RelativeLayout) view.findViewById(R.id.b8d);
            } else {
                relativeLayout = null;
            }
            String str = "backgroundColor";
            int[] iArr = new int[2];
            iArr[0] = 0;
            if (view == null) {
                C52711k.m112234a();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C52711k.m112234a();
            }
            iArr[1] = resources.getColor(R.color.io);
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(relativeLayout, str, iArr);
            C52711k.m112236a((Object) ofArgb, "animator");
            ofArgb.setDuration(150);
            return ofArgb;
        }

        /* renamed from: c */
        public final Animator mo51961c(View view) {
            RelativeLayout relativeLayout;
            if (view != null) {
                relativeLayout = (RelativeLayout) view.findViewById(R.id.b8d);
            } else {
                relativeLayout = null;
            }
            String str = "backgroundColor";
            int[] iArr = new int[2];
            if (view == null) {
                C52711k.m112234a();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C52711k.m112234a();
            }
            iArr[0] = resources.getColor(R.color.io);
            iArr[1] = 0;
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(relativeLayout, str, iArr);
            C52711k.m112236a((Object) ofArgb, "animator");
            ofArgb.setDuration(150);
            return ofArgb;
        }

        /* renamed from: a */
        public final void mo51959a(View view, MotionEvent motionEvent) {
            this.f126247a.mo98245a(this.f126248b, this.f126249c);
        }

        C50343a(C50342g gVar, C50356j jVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f126247a = gVar;
            this.f126248b = jVar;
            this.f126249c = contentLanguageGuideSetting;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.g$b */
    static final class C50344b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50342g f126250a;

        /* renamed from: b */
        final /* synthetic */ C50356j f126251b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f126252c;

        C50344b(C50342g gVar, C50356j jVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f126250a = gVar;
            this.f126251b = jVar;
            this.f126252c = contentLanguageGuideSetting;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f126250a.mo98245a(this.f126251b, this.f126252c);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.g$c */
    public static final class C50345c extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C50342g f126253a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageGuideSetting f126254b;

        C50345c(C50342g gVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f126253a = gVar;
            this.f126254b = contentLanguageGuideSetting;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, (C14045f) obj, animatable);
            try {
                this.f126253a.f126243a.mo98249b(this.f126254b.getCode());
            } catch (C10174a unused) {
            }
        }
    }

    public final int getItemCount() {
        return this.f126245c.size();
    }

    public C50342g(String str, C50368m mVar) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(mVar, "itemListener");
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        List<ContentLanguageGuideSetting> contentLanguageGuideCodes = b.getContentLanguageGuideCodes();
        C52711k.m112236a((Object) contentLanguageGuideCodes, "SettingsReader.get().contentLanguageGuideCodes");
        this.f126245c = contentLanguageGuideCodes;
        this.f126243a = mVar;
        this.f126246d = str;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.st, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…age_guide, parent, false)");
        return new C50356j(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C50356j jVar = (C50356j) vVar;
        C52711k.m112240b(jVar, "viewHolder");
        ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) this.f126245c.get(i);
        try {
            jVar.mo98258a().setText(contentLanguageGuideSetting.getLocalName());
            jVar.mo98259b().setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                C23515d.m57668a(jVar.mo98260c(), 2131953301);
            } else {
                jVar.mo98260c().setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(jVar.mo98260c().getController())).mo25757b(C14232c.m29169a(Uri.parse(contentLanguageGuideSetting.getIcon())).mo26449a())).mo25751a((C13791d<? super INFO>) new C50345c<Object>(this, contentLanguageGuideSetting))).mo25763d());
            }
            if (VERSION.SDK_INT >= 21) {
                jVar.itemView.setOnTouchListener(new C50343a(this, jVar, contentLanguageGuideSetting));
            } else {
                jVar.itemView.setOnClickListener(new C50344b(this, jVar, contentLanguageGuideSetting));
            }
            jVar.mo98262e().setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (C10174a unused) {
        }
    }

    /* renamed from: a */
    public final void mo98245a(C50356j jVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
        try {
            if (this.f126244b.contains(contentLanguageGuideSetting.getCode()) || this.f126244b.size() < ContentLangLimitSettings.getContentLangLimitSetting()) {
                if (this.f126244b.contains(contentLanguageGuideSetting.getCode())) {
                    this.f126244b.remove(contentLanguageGuideSetting.getCode());
                    C26890h.m65011a("click_content_language_popup", C23089d.m56640a().mo47829a("enter_from", this.f126246d).mo47829a("language_type", contentLanguageGuideSetting.getCode()).mo47829a("click_type", "unchoose").f61491a);
                } else {
                    this.f126244b.add(contentLanguageGuideSetting.getCode());
                    C26890h.m65011a("click_content_language_popup", C23089d.m56640a().mo47829a("enter_from", this.f126246d).mo47829a("language_type", contentLanguageGuideSetting.getCode()).mo47829a("click_type", "choose").f61491a);
                }
                C50368m mVar = this.f126243a;
                String code = contentLanguageGuideSetting.getCode();
                C52711k.m112236a((Object) code, "item.code");
                mVar.mo98248a(code);
                Drawable background = jVar.mo98262e().getBackground();
                if (background != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (jVar.mo98261d().getVisibility() == 8) {
                        if (VERSION.SDK_INT >= 21) {
                            View view = jVar.itemView;
                            C52711k.m112236a((Object) view, "itemView");
                            View view2 = jVar.itemView;
                            C52711k.m112236a((Object) view2, "itemView");
                            ObjectAnimator.ofArgb(jVar.mo98259b(), "textColor", new int[]{view.getResources().getColor(R.color.jj), view2.getResources().getColor(R.color.jf)}).setDuration(150).start();
                            View view3 = jVar.itemView;
                            C52711k.m112236a((Object) view3, "itemView");
                            View view4 = jVar.itemView;
                            C52711k.m112236a((Object) view4, "itemView");
                            ObjectAnimator.ofArgb(jVar.mo98258a(), "textColor", new int[]{view3.getResources().getColor(R.color.iw), view4.getResources().getColor(R.color.jf)}).setDuration(150).start();
                            ObjectAnimator.ofArgb(gradientDrawable, "color", new int[]{0, Color.parseColor(jVar.mo98262e().getTag().toString())}).setDuration(150).start();
                        } else {
                            DmtTextView b = jVar.mo98259b();
                            View view5 = jVar.itemView;
                            C52711k.m112236a((Object) view5, "itemView");
                            b.setTextColor(view5.getResources().getColor(R.color.jf));
                            DmtTextView a = jVar.mo98258a();
                            View view6 = jVar.itemView;
                            C52711k.m112236a((Object) view6, "itemView");
                            a.setTextColor(view6.getResources().getColor(R.color.jf));
                            gradientDrawable.setColor(Color.parseColor(jVar.mo98262e().getTag().toString()));
                        }
                        jVar.mo98261d().setVisibility(0);
                        ObjectAnimator.ofFloat(jVar.mo98261d(), "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
                        ObjectAnimator duration = ObjectAnimator.ofFloat(jVar.mo98260c(), "alpha", new float[]{1.0f, 0.0f}).setDuration(150);
                        duration.addListener(new C50362f(jVar));
                        duration.start();
                        return;
                    }
                    if (VERSION.SDK_INT >= 21) {
                        View view7 = jVar.itemView;
                        C52711k.m112236a((Object) view7, "itemView");
                        View view8 = jVar.itemView;
                        C52711k.m112236a((Object) view8, "itemView");
                        ObjectAnimator.ofArgb(jVar.mo98259b(), "textColor", new int[]{view7.getResources().getColor(R.color.jf), view8.getResources().getColor(R.color.jj)}).setDuration(150).start();
                        View view9 = jVar.itemView;
                        C52711k.m112236a((Object) view9, "itemView");
                        View view10 = jVar.itemView;
                        C52711k.m112236a((Object) view10, "itemView");
                        ObjectAnimator.ofArgb(jVar.mo98258a(), "textColor", new int[]{view9.getResources().getColor(R.color.jf), view10.getResources().getColor(R.color.iw)}).setDuration(150).start();
                        ObjectAnimator.ofArgb(gradientDrawable, "color", new int[]{Color.parseColor(jVar.mo98262e().getTag().toString()), 0}).setDuration(150).start();
                    } else {
                        DmtTextView b2 = jVar.mo98259b();
                        View view11 = jVar.itemView;
                        C52711k.m112236a((Object) view11, "itemView");
                        b2.setTextColor(view11.getResources().getColor(R.color.jj));
                        DmtTextView a2 = jVar.mo98258a();
                        View view12 = jVar.itemView;
                        C52711k.m112236a((Object) view12, "itemView");
                        a2.setTextColor(view12.getResources().getColor(R.color.iw));
                        gradientDrawable.setColor(0);
                    }
                    jVar.mo98260c().setVisibility(0);
                    ObjectAnimator.ofFloat(jVar.mo98260c(), "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(jVar.mo98261d(), "alpha", new float[]{1.0f, 0.0f}).setDuration(150);
                    duration2.addListener(new C50363g(jVar));
                    duration2.start();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            View view13 = jVar.itemView;
            C52711k.m112236a((Object) view13, "viewHolder.itemView");
            Context context = view13.getContext();
            View view14 = jVar.itemView;
            C52711k.m112236a((Object) view14, "viewHolder.itemView");
            String string = view14.getContext().getString(R.string.ghs, new Object[]{String.valueOf(ContentLangLimitSettings.getContentLangLimitSetting())});
            View view15 = jVar.itemView;
            C52711k.m112236a((Object) view15, "viewHolder.itemView");
            C10691a.m21540a(context, string, 1, 2, (int) C9432q.m18687b(view15.getContext(), 52.0f)).mo19066a();
        } catch (C10174a unused) {
        }
    }
}
