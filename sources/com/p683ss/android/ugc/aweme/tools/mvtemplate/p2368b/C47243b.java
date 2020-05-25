package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2368b;

import android.content.Intent;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1388at.C23288a;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39573av;
import com.p683ss.android.ugc.aweme.port.p2082in.C39573av.C39574a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.setting.EnableMvResCheck;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.b */
public abstract class C47243b implements C39573av {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f119312a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47243b.class), "themeUtil", "getThemeUtil()Lcom/ss/android/ugc/aweme/port/in/IMvTemplateService$IMvThemeUtil;"))};

    /* renamed from: b */
    private final C52668f f119313b = C52732g.m112285a(new C47244a(this));

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.b$a */
    static final class C47244a extends C52712l implements C52670a<C472451> {

        /* renamed from: a */
        final /* synthetic */ C47243b f119314a;

        C47244a(C47243b bVar) {
            this.f119314a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39574a(this) {

                /* renamed from: a */
                final /* synthetic */ C47244a f119315a;

                /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.b$a$1$a */
                static final class C47246a<V> implements Callable<TResult> {

                    /* renamed from: a */
                    final /* synthetic */ C472451 f119316a;

                    /* renamed from: b */
                    final /* synthetic */ Set f119317b;

                    C47246a(C472451 r1, Set set) {
                        this.f119316a = r1;
                        this.f119317b = set;
                    }

                    public final /* synthetic */ Object call() {
                        List<C29059c> queryAllDraftList = AVServiceImpl.createIInternalAVServicebyMonsterPlugin().draftService().queryAllDraftList();
                        C52711k.m112236a((Object) queryAllDraftList, "drafts");
                        for (C29059c cVar : queryAllDraftList) {
                            C52711k.m112236a((Object) cVar, "draft");
                            C23289b R = cVar.mo58741R();
                            if (R != null) {
                                Set set = this.f119317b;
                                String str = R.mvResUnzipPath;
                                C52711k.m112236a((Object) str, "data.mvResUnzipPath");
                                set.add(str);
                                Set set2 = this.f119317b;
                                String str2 = R.videoCoverImgPath;
                                C52711k.m112236a((Object) str2, "data.videoCoverImgPath");
                                set2.add(str2);
                                Set set3 = this.f119317b;
                                ArrayList<String> arrayList = R.selectMediaList;
                                C52711k.m112236a((Object) arrayList, "data.selectMediaList");
                                set3.addAll(arrayList);
                                ArrayList<C23288a> arrayList2 = R.maskFileData;
                                C52711k.m112236a((Object) arrayList2, "data.maskFileData");
                                for (C23288a maskFiles : arrayList2) {
                                    for (C52847n second : maskFiles.getMaskFiles()) {
                                        this.f119317b.add(second.getSecond());
                                    }
                                }
                                ArrayList<C23290c> arrayList3 = R.newMaskFileData;
                                C52711k.m112236a((Object) arrayList3, "data.newMaskFileData");
                                for (C23290c filePath : arrayList3) {
                                    this.f119317b.add(filePath.getFilePath());
                                }
                            }
                        }
                        File file = new File(C47251c.m102587b("resize_bitmap_tmp"));
                        File file2 = new File(C47251c.m102587b("cover_tmp"));
                        C47243b.m102557a(new File(C47251c.m102587b("mvres")).listFiles(), this.f119317b);
                        C47243b.m102558b(file.listFiles(), this.f119317b);
                        C47243b.m102558b(file2.listFiles(), this.f119317b);
                        return C52860x.f131107a;
                    }
                }

                /* renamed from: d */
                public final boolean mo80668d() {
                    return C47251c.m102583a();
                }

                /* renamed from: b */
                public final String mo80665b() {
                    String b = C47251c.m102587b("mvres");
                    C52711k.m112236a((Object) b, "MvThemeUtils.getMvThemeD…ThemeContants.MV_RES_DIR)");
                    return b;
                }

                /* renamed from: a */
                public final String mo80663a() {
                    String d = C47251c.m102592d();
                    C52711k.m112236a((Object) d, "MvThemeUtils.createRandomPNGFilePath()");
                    return d;
                }

                /* renamed from: c */
                public final void mo80667c() {
                    if (C10193n.m20607a().mo18204a(EnableMvResCheck.class, "enable_mv_res_check", C10181b.m20511a().mo18175c().getEnableMvResCheck(), false)) {
                        C0013i.m16a((Callable<TResult>) new C47246a<TResult>(this, new LinkedHashSet()));
                    }
                }

                {
                    this.f119315a = r1;
                }

                /* renamed from: a */
                public final Intent mo80662a(CutSameEditData cutSameEditData) {
                    C52711k.m112240b(cutSameEditData, "cutSameEditData");
                    return this.f119315a.f119314a.mo94517a(cutSameEditData);
                }

                /* renamed from: b */
                public final void mo80666b(C29059c cVar) {
                    C52711k.m112240b(cVar, "draft");
                    C47251c.m102582a(cVar);
                }

                /* renamed from: a */
                public final void mo80664a(C29059c cVar) {
                    C52711k.m112240b(cVar, "draft");
                    C47251c.m102588b(cVar);
                }
            };
        }
    }

    /* renamed from: a */
    public abstract Intent mo94517a(CutSameEditData cutSameEditData);

    /* renamed from: a */
    public final C39574a mo80661a() {
        return (C39574a) this.f119313b.getValue();
    }

    /* renamed from: a */
    public static void m102557a(File[] fileArr, Set<String> set) {
        boolean z;
        boolean z2;
        if (fileArr != null) {
            if (fileArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (File file : fileArr) {
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        C52711k.m112236a((Object) absolutePath, LeakCanaryFileProvider.f132050j);
                        if (absolutePath.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (file.isDirectory() && !set.contains(absolutePath)) {
                                C48016e.m103954e(absolutePath);
                                file.delete();
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m102558b(File[] fileArr, Set<String> set) {
        boolean z;
        boolean z2;
        if (fileArr != null) {
            if (fileArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (File file : fileArr) {
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        C52711k.m112236a((Object) absolutePath, LeakCanaryFileProvider.f132050j);
                        if (absolutePath.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (file.isFile() && !set.contains(absolutePath)) {
                                C48016e.m103947c(absolutePath);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
