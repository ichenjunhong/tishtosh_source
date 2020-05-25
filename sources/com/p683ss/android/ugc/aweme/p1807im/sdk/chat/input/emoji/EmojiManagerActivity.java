package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29367a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33568i.C33571a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35270j.C352722;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35381a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity */
public class EmojiManagerActivity extends AmeActivity implements C29367a {

    /* renamed from: a */
    public C33568i f86936a;

    /* renamed from: b */
    public ImTextTitleBar f86937b;

    /* renamed from: c */
    public TextView f86938c;

    /* renamed from: d */
    public View f86939d;

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        super.onDestroy();
        C29368b.m69241a().mo59393b((C29367a) this);
    }

    /* renamed from: a */
    public final void mo71006a() {
        this.f86939d.setEnabled(false);
        this.f86938c.setAlpha(0.5f);
    }

    /* renamed from: a */
    public static void m76897a(Context context) {
        context.startActivity(new Intent(context, EmojiManagerActivity.class));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bbx);
        C34004b.m77718b().setupStatusBar(this);
        this.f86937b = (ImTextTitleBar) findViewById(R.id.d10);
        this.f86939d = findViewById(R.id.a45);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.a_t);
        this.f86938c = (TextView) findViewById(R.id.a4_);
        mo71006a();
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.mo4798a((C1331h) new C35381a(this));
        this.f86936a = new C33568i();
        recyclerView.setAdapter(this.f86936a);
        this.f86937b.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                EmojiManagerActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo70670b() {
                if (EmojiManagerActivity.this.f86936a.f87014b) {
                    EmojiManagerActivity.this.f86936a.f87014b = false;
                    EmojiManagerActivity.this.f86936a.mo71025b();
                    EmojiManagerActivity.this.f86938c.setText(EmojiManagerActivity.this.getString(R.string.bgc));
                    EmojiManagerActivity.this.mo71006a();
                    EmojiManagerActivity.this.f86937b.setRightText((int) R.string.bkg);
                    EmojiManagerActivity.this.f86937b.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(R.color.rh));
                    EmojiManagerActivity.this.f86939d.setVisibility(8);
                } else {
                    EmojiManagerActivity.this.f86936a.mo71025b();
                    EmojiManagerActivity.this.f86939d.setVisibility(0);
                    EmojiManagerActivity.this.f86936a.f87014b = true;
                    EmojiManagerActivity.this.f86937b.setRightText((int) R.string.bhc);
                    EmojiManagerActivity.this.f86937b.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(R.color.rn));
                }
                EmojiManagerActivity.this.f86936a.notifyDataSetChanged();
            }
        });
        this.f86936a.f87013a = new C33571a() {
            /* renamed from: a */
            public final void mo71008a() {
                if (EmojiManagerActivity.this.f86936a.mo71023a() > 0) {
                    TextView textView = EmojiManagerActivity.this.f86938c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(EmojiManagerActivity.this.getString(R.string.bgc));
                    sb.append("(");
                    sb.append(EmojiManagerActivity.this.f86936a.mo71023a());
                    sb.append(")");
                    textView.setText(sb.toString());
                    EmojiManagerActivity emojiManagerActivity = EmojiManagerActivity.this;
                    emojiManagerActivity.f86939d.setEnabled(true);
                    emojiManagerActivity.f86938c.setAlpha(1.0f);
                    return;
                }
                EmojiManagerActivity.this.f86938c.setText(EmojiManagerActivity.this.getString(R.string.bgc));
                EmojiManagerActivity.this.mo71006a();
            }
        };
        this.f86939d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                EmojiManagerActivity emojiManagerActivity = EmojiManagerActivity.this;
                C352722 r2 = new DialogInterface.OnClickListener(new Runnable() {
                    public final void run() {
                    }
                }, new Runnable() {
                    public final void run() {
                        EmojiManagerActivity.this.showProgressDialog(EmojiManagerActivity.this.getString(R.string.bgx));
                        C29368b a = C29368b.m69241a();
                        C33568i iVar = EmojiManagerActivity.this.f86936a;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = iVar.f87015c.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C29366a) it.next());
                        }
                        a.mo59388a((C29366a[]) arrayList.toArray(new C29366a[0]));
                    }
                }) {

                    /* renamed from: a */
                    final /* synthetic */ Runnable f90609a;

                    /* renamed from: b */
                    final /* synthetic */ Runnable f90610b;

                    {
                        this.f90609a = r1;
                        this.f90610b = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == -2) {
                            dialogInterface.dismiss();
                            if (this.f90609a != null) {
                                this.f90609a.run();
                            }
                        } else if (i == -1) {
                            dialogInterface.dismiss();
                            if (this.f90610b != null) {
                                this.f90610b.run();
                            }
                        } else {
                            dialogInterface.dismiss();
                            if (this.f90609a != null) {
                                this.f90609a.run();
                            }
                        }
                    }
                };
                new C1161a(emojiManagerActivity, R.style.s8).mo3768b((int) R.string.bgd).mo3769b((int) R.string.bf_, (DialogInterface.OnClickListener) r2).mo3759a((int) R.string.bg2, (DialogInterface.OnClickListener) r2).mo3772b().show();
            }
        });
        C29368b.m69241a().mo59384a((C29367a) this);
        C29368b.m69241a().mo59392b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        dismissProgressDialog();
        if (z) {
            this.f86936a.mo71025b();
            this.f86938c.setText(getString(R.string.bgc));
            mo71006a();
            this.f86936a.f87016d = list;
            this.f86936a.notifyDataSetChanged();
            if (C9376b.m18558a((Collection<T>) list)) {
                this.f86937b.setTitle(getString(R.string.bee));
                this.f86936a.f87014b = false;
                this.f86937b.setRightText((int) R.string.bkg);
                this.f86937b.setRightTextColor(getResources().getColor(R.color.rh));
                this.f86939d.setVisibility(8);
                return;
            }
            ImTextTitleBar imTextTitleBar = this.f86937b;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.bee));
            sb.append("(");
            sb.append(list.size());
            sb.append(")");
            imTextTitleBar.setTitle(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
        if (z) {
            this.f86936a.f87016d = list;
            this.f86936a.notifyDataSetChanged();
            ImTextTitleBar imTextTitleBar = this.f86937b;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.bee));
            sb.append("(");
            sb.append(list.size());
            sb.append(")");
            imTextTitleBar.setTitle(sb.toString());
        }
    }
}
