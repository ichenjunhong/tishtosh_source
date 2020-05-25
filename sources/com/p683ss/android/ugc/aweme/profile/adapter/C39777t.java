package com.p683ss.android.ugc.aweme.profile.adapter;

import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.experiment.EmptyProfilePostGuideProgress;
import com.p683ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.ss.android.ugc.trill.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.t */
public final class C39777t extends C1352v {
    public C39777t(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        C26890h.m65011a("optimize_profile", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("action_type", "show").mo47829a("optimize_type", "edit_profile").f61491a);
        view.findViewById(R.id.eqt).setOnClickListener(C397781.f101531a);
        C26890h.m65011a("optimize_profile", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("action_type", "show").mo47829a("optimize_type", "find_friends").f61491a);
        view.findViewById(R.id.ai0).setOnClickListener(C397792.f101532a);
        C26890h.m65011a("optimize_profile", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("action_type", "show").mo47829a("optimize_type", "shoot").f61491a);
        view.findViewById(R.id.cnw).setOnClickListener(C397803.f101533a);
    }

    /* renamed from: a */
    public final void mo80849a(PostGuideTasks postGuideTasks) {
        int i;
        int i2;
        C52711k.m112240b(postGuideTasks, "tasks");
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Resources resources = view.getResources();
        CharSequence string = resources.getString(R.string.h53, new Object[]{Integer.valueOf(postGuideTasks.taskCountDone())});
        Matcher matcher = Pattern.compile("\\d/\\d").matcher(string);
        if (!matcher.find()) {
            matcher = null;
        }
        if (matcher != null) {
            C52847n nVar = new C52847n(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end()));
            View findViewById = this.itemView.findViewById(R.id.c62);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById<TextView>(R.id.progress)");
            TextView textView = (TextView) findViewById;
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(resources.getColor(R.color.a15)), ((Number) nVar.getFirst()).intValue(), ((Number) nVar.getSecond()).intValue(), 17);
            textView.setText(spannableString);
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.c62);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById<TextView>(R.id.progress)");
            ((TextView) findViewById2).setText(string);
        }
        View findViewById3 = this.itemView.findViewById(R.id.c62);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById<TextView>(R.id.progress)");
        TextView textView2 = (TextView) findViewById3;
        if (C10181b.m20511a().mo18168a(EmptyProfilePostGuideProgress.class, true, "empty_profile_guide", 31744, 0) == 2) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        C52847n[] nVarArr = {C52856t.m112465a(this.itemView.findViewById(R.id.eqt), Boolean.valueOf(postGuideTasks.isProfileTaskDone)), C52856t.m112465a(this.itemView.findViewById(R.id.ai0), Boolean.valueOf(postGuideTasks.isFollowTaskDone)), C52856t.m112465a(this.itemView.findViewById(R.id.cnw), Boolean.valueOf(postGuideTasks.isShootTaskDone))};
        View view2 = this.itemView;
        if (!(view2 instanceof ViewGroup)) {
            view2 = null;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        if (viewGroup != null) {
            for (int i3 = 0; i3 < 3; i3++) {
                C52847n nVar2 = nVarArr[i3];
                viewGroup.removeView((View) nVar2.getFirst());
                Object first = nVar2.getFirst();
                C52711k.m112236a(first, "it.first");
                View view3 = (View) first;
                boolean booleanValue = ((Boolean) nVar2.getSecond()).booleanValue();
                View findViewById4 = view3.findViewById(R.id.e1o);
                C52711k.m112236a((Object) findViewById4, "taskView.findViewById<View>(R.id.check)");
                int i4 = 4;
                if (booleanValue) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                findViewById4.setVisibility(i2);
                View findViewById5 = view3.findViewById(R.id.e5r);
                C52711k.m112236a((Object) findViewById5, "taskView.findViewById<View>(R.id.done)");
                if (booleanValue) {
                    i4 = 0;
                }
                findViewById5.setVisibility(i4);
            }
            for (int i5 = 0; i5 < 3; i5++) {
                C52847n nVar3 = nVarArr[i5];
                if (!((Boolean) nVar3.getSecond()).booleanValue()) {
                    viewGroup.addView((View) nVar3.getFirst());
                }
            }
            for (int i6 = 0; i6 < 3; i6++) {
                C52847n nVar4 = nVarArr[i6];
                if (((Boolean) nVar4.getSecond()).booleanValue()) {
                    viewGroup.addView((View) nVar4.getFirst());
                }
            }
        }
        View findViewById6 = this.itemView.findViewById(R.id.ai0).findViewById(R.id.cup);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById<Vi…TextView>(R.id.sub_title)");
        ((TextView) findViewById6).setText(resources.getString(R.string.h4y, new Object[]{Integer.valueOf(postGuideTasks.followCountFromRecommend)}));
    }
}
