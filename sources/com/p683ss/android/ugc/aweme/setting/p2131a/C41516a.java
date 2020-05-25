package com.p683ss.android.ugc.aweme.setting.p2131a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.profile.api.BlockApi;
import com.p683ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p683ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.setting.a.a */
public final class C41516a extends C1352v implements OnClickListener, C9382a {

    /* renamed from: a */
    AvatarImageView f105196a;

    /* renamed from: b */
    TextView f105197b;

    /* renamed from: c */
    TextView f105198c;

    /* renamed from: d */
    View f105199d;

    /* renamed from: e */
    User f105200e;

    /* renamed from: f */
    int f105201f;

    /* renamed from: g */
    int f105202g;

    /* renamed from: h */
    boolean f105203h;

    /* renamed from: i */
    private Activity f105204i;

    /* renamed from: j */
    private Button f105205j;

    /* renamed from: k */
    private C9381g f105206k = new C9381g(this);

    /* renamed from: a */
    private int m91335a() {
        if (this.f105203h) {
            return R.string.tc;
        }
        return R.string.t7;
    }

    /* renamed from: b */
    private int m91336b() {
        if (this.f105203h) {
            return R.string.f6_;
        }
        return R.string.f69;
    }

    /* renamed from: c */
    private int m91337c() {
        if (this.f105202g == 0) {
            return R.drawable.ddz;
        }
        return R.drawable.de0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo85301b(boolean z) {
        boolean z2 = !z;
        BlockApi.m88498a(this.f105206k, this.f105200e.getUid(), this.f105200e.getSecUid(), z2 ? 1 : 0, this.f105201f);
        if (z) {
            C33205o.m76296a("black_list", this.f105200e.getUid());
        } else {
            C33205o.m76297a("black_list", this.f105200e.getUid(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo85300a(boolean z) {
        if (z) {
            this.f105205j.setText(m91336b());
            this.f105205j.setBackgroundResource(m91337c());
            if (this.f105202g == 0) {
                this.f105205j.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a17));
            } else {
                this.f105205j.setTextColor(C11010c.m22280a().getResources().getColor(R.color.a2j));
            }
        } else {
            this.f105205j.setText(m91335a());
            this.f105205j.setBackgroundResource(R.drawable.ddx);
            this.f105205j.setTextColor(C11010c.m22280a().getResources().getColor(R.color.v5));
        }
    }

    public final void handleMsg(Message message) {
        int i;
        int i2;
        if (!this.f105204i.isFinishing()) {
            int i3 = message.what;
            Object obj = message.obj;
            if (i3 == 31 || i3 == 32) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof C23459a) {
                    C10691a.m21545b(C11010c.m22280a(), ((C23459a) obj).getErrorMsg()).mo19066a();
                } else if (obj instanceof Exception) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.cfw).mo19066a();
                } else if (obj instanceof BlockStruct) {
                    boolean z = false;
                    boolean z2 = true;
                    if (((BlockStruct) obj).blockStatus != 1) {
                        z2 = false;
                    }
                    if (i3 == 32) {
                        StoryBlockInfo storyBlockInfo = this.f105200e.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                            this.f105200e.setStoryBlockInfo(storyBlockInfo);
                        }
                        storyBlockInfo.setBlock(z2);
                        if (storyBlockInfo != null) {
                            z = storyBlockInfo.isBlock();
                        }
                        mo85300a(z);
                        Context a = C11010c.m22280a();
                        Resources resources = this.f105204i.getResources();
                        if (z2) {
                            i2 = R.string.tg;
                        } else {
                            i2 = R.string.f6a;
                        }
                        C10691a.m21545b(a, resources.getString(i2)).mo19066a();
                    } else {
                        this.f105200e.setBlock(z2);
                        Activity activity = this.f105204i;
                        if (activity != null) {
                            Resources resources2 = activity.getResources();
                            if (z2) {
                                i = R.string.f69;
                            } else {
                                i = R.string.hn;
                            }
                            C10691a.m21545b((Context) activity, resources2.getString(i)).mo19066a();
                        }
                        mo85300a(this.f105200e.isBlock());
                    }
                    C23552a.m57751a().mo48724a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f105200e);
                }
            }
        }
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!C41518c.m91340a(C11010c.m22280a())) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg1).mo19066a();
            return;
        }
        int id = view.getId();
        if (id == R.id.l0) {
            if (this.f105203h) {
                StoryBlockInfo storyBlockInfo = this.f105200e.getStoryBlockInfo();
                if (storyBlockInfo == null) {
                    z = false;
                } else {
                    z = storyBlockInfo.isBlock();
                }
            } else {
                z = this.f105200e.isBlock();
            }
            if (z) {
                mo85301b(true);
            } else if (this.f105204i != null && !this.f105204i.isFinishing()) {
                new C10643a(this.f105204i).mo18899b((int) R.string.bf7).mo18886a((int) R.string.ah2, (DialogInterface.OnClickListener) new C41517b(this)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
            }
        } else if (id == R.id.l4) {
            SmartRouter.buildRoute((Context) this.f105204i, "aweme://user/profile/").withParam("uid", this.f105200e.getUid()).withParam("sec_user_id", this.f105200e.getSecUid()).open();
        }
    }

    public C41516a(View view, Activity activity) {
        super(view);
        this.f105204i = activity;
        this.f105196a = (AvatarImageView) view.findViewById(R.id.l1);
        this.f105197b = (TextView) view.findViewById(R.id.l2);
        this.f105198c = (TextView) view.findViewById(R.id.l3);
        this.f105199d = view.findViewById(R.id.l4);
        this.f105205j = (Button) view.findViewById(R.id.l0);
        C38446k.m85764a(this.f105199d);
        C38446k.m85764a(this.f105205j);
        this.f105199d.setOnClickListener(this);
        this.f105205j.setOnClickListener(this);
    }
}
