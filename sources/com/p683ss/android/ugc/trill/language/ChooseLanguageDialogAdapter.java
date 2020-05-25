package com.p683ss.android.ugc.trill.language;

import android.app.Dialog;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.i18n.language.C33123c;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter */
public final class ChooseLanguageDialogAdapter extends C1322a<ViewHolder> {

    /* renamed from: a */
    public Context f126210a;

    /* renamed from: b */
    public Dialog f126211b;

    /* renamed from: c */
    private List<C33123c> f126212c;

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter$ViewHolder */
    static class ViewHolder extends C1352v {
        ImageView mChooseImg;
        TextView mLanguageLabel;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f126215a;

        public void unbind() {
            ViewHolder viewHolder = this.f126215a;
            if (viewHolder != null) {
                this.f126215a = null;
                viewHolder.mLanguageLabel = null;
                viewHolder.mChooseImg = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f126215a = viewHolder;
            viewHolder.mLanguageLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.b6d, "field 'mLanguageLabel'", TextView.class);
            viewHolder.mChooseImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.t9, "field 'mChooseImg'", ImageView.class);
        }
    }

    public final int getItemCount() {
        return this.f126212c.size();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f126210a).inflate(R.layout.b3s, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, final int i) {
        ViewHolder viewHolder = (ViewHolder) vVar;
        C33123c cVar = (C33123c) this.f126212c.get(i);
        viewHolder.mLanguageLabel.setText(cVar.mo70148a());
        if (cVar.f85963a) {
            viewHolder.mChooseImg.setVisibility(0);
        } else {
            viewHolder.mChooseImg.setVisibility(8);
        }
        viewHolder.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (TextUtils.equals(((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(i)).mo70127g(), I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(ChooseLanguageDialogAdapter.this.f126210a).mo70127g())) {
                    C50336b.m108612a(ChooseLanguageDialogAdapter.this.f126211b);
                    return;
                }
                C50336b.m108612a(ChooseLanguageDialogAdapter.this.f126211b);
                C26890h.onEvent(MobClick.obtain().setEventName("change_language").setLabelName("login_page").setJsonObject(new C26898j().mo54849a("language", ((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(i)).mo70127g()).mo54849a("change_from", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(ChooseLanguageDialogAdapter.this.f126210a).mo70127g()).mo54850a()));
                C33098b.m76080a().mo70130a(((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(i)).mo70121a(), ((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(i)).mo70127g(), ChooseLanguageDialogAdapter.this.f126210a);
            }
        });
    }
}
