package com.p683ss.android.ugc.aweme.emoji.p1693i;

import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p683ss.android.ugc.aweme.emoji.utils.C29472b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29483k;
import com.p683ss.android.ugc.aweme.emoji.utils.C29488n;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.k */
public class C29423k implements C29421i {

    /* renamed from: a */
    private List<C29421i> f77048a = new ArrayList();

    /* renamed from: b */
    public boolean f77049b;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo59487c(C29358c cVar) {
        mo59480a(cVar, false);
    }

    /* renamed from: a */
    public static ResourcesResponse m69393a(String str) {
        try {
            return (ResourcesResponse) C29472b.m69540a().getResources(str).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m69394b(C29358c cVar) {
        File file = new File(C29483k.m69572a(cVar));
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59480a(final C29358c cVar, final boolean z) {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                C29423k.this.mo59484a(z, cVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59481a(String str, List<C29358c> list) {
        mo59485b(str, list);
        if (list == null || list.size() == 0) {
            this.f77049b = true;
        } else {
            this.f77049b = false;
        }
    }

    /* renamed from: b */
    public final void mo59485b(String str, List<C29358c> list) {
        for (C29421i b : this.f77048a) {
            b.mo59485b(str, list);
        }
    }

    /* renamed from: a */
    public final void mo59484a(boolean z, C29358c cVar) {
        for (C29421i a : this.f77048a) {
            a.mo59484a(z, cVar);
        }
    }

    /* renamed from: c */
    public static void m69395c(String str, List<C29358c> list) {
        String str2;
        HashMap hashMap = new HashMap();
        for (C29358c cVar : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getId());
            sb.append("_");
            if (cVar.getVersion() == null) {
                str2 = null;
            } else {
                str2 = cVar.getVersion().replace(ClassUtils.PACKAGE_SEPARATOR, "_");
            }
            sb.append(str2);
            hashMap.put(sb.toString(), Boolean.valueOf(true));
        }
        File file = new File(C29483k.m69573a(str));
        if (file.exists() && file.isDirectory()) {
            String[] list2 = file.list();
            if (list2 != null) {
                for (int i = 0; i < list2.length; i++) {
                    if (hashMap.get(list2[i]) == null) {
                        try {
                            C9396a.m18584c(list2[i]);
                            new File(list2[i]).delete();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo59486b(final C29358c cVar, final boolean z) {
        if (!C29432p.m69405a(C11010c.m22280a())) {
            C18842a.m45932a(new C29428l(this, cVar));
            return false;
        } else if (C29422j.m69390a(cVar.getResourceUrl()) != null) {
            return false;
        } else {
            File file = new File(C29483k.m69572a(cVar));
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                return false;
            }
            C29422j.m69391a(cVar.getResourceUrl(), cVar);
            DownloadTask savePath = Downloader.with(C11010c.m22280a()).url(cVar.getResourceUrl()).savePath(C29483k.m69573a(cVar.getType()));
            StringBuilder sb = new StringBuilder();
            sb.append(C29483k.m69571a(cVar.getId(), cVar.getVersion()));
            sb.append(".zip");
            savePath.name(sb.toString()).mainThreadListener(new AbsDownloadListener() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo59489a(C29358c cVar) {
                    C29423k.m69394b(cVar);
                    C29423k.this.mo59480a(cVar, false);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: b */
                public final /* synthetic */ void mo59490b(C29358c cVar) {
                    C29423k.m69394b(cVar);
                    C29423k.this.mo59480a(cVar, false);
                }

                public final void onCanceled(DownloadInfo downloadInfo) {
                    C29422j.m69392b(cVar.getResourceUrl());
                    C18842a.m45932a(new C29431o(this, cVar));
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    C29422j.m69392b(cVar.getResourceUrl());
                    C18842a.m45932a(new C29429m(this, cVar));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: c */
                public final /* synthetic */ void mo59491c(C29358c cVar) {
                    C29488n.m69579a(C29483k.m69572a(cVar), C29483k.m69574a(cVar.getType(), cVar.getId(), cVar.getVersion()));
                    C29423k.m69394b(cVar);
                    boolean z = false;
                    if (cVar != null) {
                        File file = new File(C29483k.m69575b(cVar));
                        if (file.exists() && file.isDirectory()) {
                            String[] list = file.list();
                            if (list != null && list.length > 0) {
                                z = true;
                            }
                        }
                    }
                    C29423k.this.mo59480a(cVar, z);
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C29422j.m69392b(cVar.getResourceUrl());
                    if (z) {
                        C29423k.this.mo59486b(cVar, false);
                    } else {
                        C18842a.m45932a(new C29430n(this, cVar));
                    }
                }
            }).download();
            return true;
        }
    }
}
