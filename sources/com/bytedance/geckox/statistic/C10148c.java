package com.bytedance.geckox.statistic;

import android.content.Context;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p594a.C10029a;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.statistic.model.C10150a;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.statistic.model.StatisticModel.PackageStatisticModel;
import com.bytedance.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10162j;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.statistic.c */
final class C10148c {
    /* renamed from: b */
    private static List<DownloadFailRecords> m20464b(List<DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* renamed from: a */
    private static Integer m20460a(List<DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    /* renamed from: a */
    static void m20461a(final C10044b bVar, C10135a aVar) {
        final String b = m20463b(bVar, aVar);
        if (b != null) {
            StringBuilder sb = new StringBuilder("https://");
            sb.append(bVar.f27290k);
            sb.append("/gecko/server/packages/stats");
            final String sb2 = sb.toString();
            bVar.f27281b.execute(new Runnable() {
                public final void run() {
                    int i = 0;
                    while (i < 3) {
                        try {
                            if (new JSONObject(bVar.f27284e.mo18094a(sb2, b).f27419b).getInt("status") != 0) {
                                i++;
                            } else {
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static String m20463b(C10044b bVar, C10135a aVar) {
        ArrayList<PackageStatisticModel> arrayList = new ArrayList<>();
        for (C10150a aVar2 : aVar.mo18148a()) {
            if (aVar2.f27465d == null && aVar2.f27467f == 0) {
                m20462a(aVar2, bVar, aVar, arrayList);
            } else if (!aVar2.f27469h || !aVar2.f27470i) {
                PackageStatisticModel packageStatisticModel = new PackageStatisticModel();
                arrayList.add(packageStatisticModel);
                packageStatisticModel.statsType = Integer.valueOf(BaseNotice.HASHTAG);
                packageStatisticModel.accessKey = aVar2.f27462a;
                packageStatisticModel.groupName = aVar2.f27463b;
                packageStatisticModel.channel = aVar2.f27464c;
                packageStatisticModel.f27454ac = aVar2.f27477p;
                packageStatisticModel.patchId = aVar2.f27478q;
                packageStatisticModel.f27455id = aVar2.f27479r;
                packageStatisticModel.downloadRetryTimes = m20460a(aVar2.f27466e);
                packageStatisticModel.downloadUrl = aVar2.f27465d;
                packageStatisticModel.downloadFailRecords = m20464b(aVar2.f27466e);
                if (!aVar2.f27469h) {
                    packageStatisticModel.errCode = "301";
                    if (aVar2.f27466e != null && !aVar2.f27466e.isEmpty()) {
                        packageStatisticModel.errMsg = ((DownloadFailRecords) aVar2.f27466e.get(0)).reason;
                    }
                } else if (!aVar2.f27470i) {
                    packageStatisticModel.errCode = "402";
                    packageStatisticModel.errMsg = aVar2.f27480s;
                }
                m20462a(aVar2, bVar, aVar, arrayList);
            } else {
                PackageStatisticModel packageStatisticModel2 = new PackageStatisticModel();
                arrayList.add(packageStatisticModel2);
                packageStatisticModel2.statsType = Integer.valueOf(100);
                packageStatisticModel2.groupName = aVar2.f27463b;
                packageStatisticModel2.accessKey = aVar2.f27462a;
                packageStatisticModel2.channel = aVar2.f27464c;
                packageStatisticModel2.f27454ac = aVar2.f27477p;
                packageStatisticModel2.f27455id = aVar2.f27479r;
                packageStatisticModel2.patchId = aVar2.f27478q;
                packageStatisticModel2.downloadRetryTimes = m20460a(aVar2.f27466e);
                packageStatisticModel2.downloadUrl = aVar2.f27465d;
                packageStatisticModel2.downloadFailRecords = m20464b(aVar2.f27466e);
                packageStatisticModel2.downloadDuration = Long.valueOf(aVar2.f27468g - aVar2.f27467f);
                if (!aVar2.f27471j) {
                    PackageStatisticModel packageStatisticModel3 = new PackageStatisticModel();
                    arrayList.add(packageStatisticModel3);
                    packageStatisticModel3.statsType = Integer.valueOf(100);
                    packageStatisticModel3.channel = aVar2.f27464c;
                    packageStatisticModel3.errCode = "403";
                    packageStatisticModel3.errMsg = aVar2.f27481t;
                    packageStatisticModel3.f27454ac = aVar2.f27477p;
                    packageStatisticModel3.patchId = aVar2.f27478q;
                    packageStatisticModel3.f27455id = aVar2.f27479r;
                    packageStatisticModel3.downloadRetryTimes = m20460a(aVar2.f27466e);
                    packageStatisticModel3.downloadUrl = aVar2.f27465d;
                    packageStatisticModel3.downloadFailRecords = m20464b(aVar2.f27466e);
                    m20462a(aVar2, bVar, aVar, arrayList);
                } else if (aVar2.f27472k) {
                    PackageStatisticModel packageStatisticModel4 = new PackageStatisticModel();
                    arrayList.add(packageStatisticModel4);
                    packageStatisticModel4.accessKey = aVar2.f27462a;
                    packageStatisticModel4.groupName = aVar2.f27463b;
                    packageStatisticModel4.statsType = Integer.valueOf(102);
                    packageStatisticModel4.patchId = aVar2.f27478q;
                    packageStatisticModel4.f27455id = aVar2.f27479r;
                    packageStatisticModel4.channel = aVar2.f27464c;
                    packageStatisticModel4.applyDuration = Long.valueOf(aVar2.f27476o - aVar2.f27475n);
                } else {
                    PackageStatisticModel packageStatisticModel5 = new PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.accessKey = aVar2.f27462a;
                    packageStatisticModel5.groupName = aVar2.f27463b;
                    packageStatisticModel5.statsType = Integer.valueOf(103);
                    packageStatisticModel5.errCode = "501";
                    packageStatisticModel5.channel = aVar2.f27464c;
                    packageStatisticModel5.patchId = aVar2.f27478q;
                    packageStatisticModel5.f27455id = aVar2.f27479r;
                    packageStatisticModel5.errMsg = aVar2.f27482u;
                    m20462a(aVar2, bVar, aVar, arrayList);
                }
            }
        }
        Context context = bVar.f27280a;
        arrayList.addAll(C10029a.m20185a(context));
        if (arrayList.isEmpty()) {
            return null;
        }
        Common common = new Common(bVar.mo18020b(), C10151a.m20473a(context), bVar.f27289j, C10151a.m20474b(context), C10162j.m20488a(context), bVar.f27292m, bVar.f27291l);
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages = arrayList;
        String uuid = UUID.randomUUID().toString();
        for (PackageStatisticModel packageStatisticModel6 : arrayList) {
            packageStatisticModel6.logId = uuid;
        }
        return C10064b.m20295a().f27360a.mo34889b(statisticModel);
    }

    /* renamed from: a */
    private static void m20462a(C10150a aVar, C10044b bVar, C10135a aVar2, List<PackageStatisticModel> list) {
        if (!aVar.f27457B || !aVar.f27458C) {
            PackageStatisticModel packageStatisticModel = new PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = Integer.valueOf(1);
            packageStatisticModel.accessKey = aVar.f27462a;
            packageStatisticModel.groupName = aVar.f27463b;
            packageStatisticModel.channel = aVar.f27464c;
            packageStatisticModel.f27454ac = aVar.f27477p;
            packageStatisticModel.f27455id = aVar.f27479r;
            packageStatisticModel.downloadRetryTimes = m20460a(aVar.f27484w);
            packageStatisticModel.downloadUrl = aVar.f27483v;
            packageStatisticModel.downloadFailRecords = m20464b(aVar.f27484w);
            if (!aVar.f27457B) {
                packageStatisticModel.errCode = "300";
                if (aVar.f27484w != null && !aVar.f27484w.isEmpty()) {
                    packageStatisticModel.errMsg = ((DownloadFailRecords) aVar.f27484w.get(0)).reason;
                }
            } else if (!aVar.f27458C) {
                packageStatisticModel.errCode = "450";
                packageStatisticModel.errMsg = aVar.f27460E;
            }
        } else {
            PackageStatisticModel packageStatisticModel2 = new PackageStatisticModel();
            list.add(packageStatisticModel2);
            packageStatisticModel2.statsType = Integer.valueOf(0);
            packageStatisticModel2.accessKey = aVar.f27462a;
            packageStatisticModel2.groupName = aVar.f27463b;
            packageStatisticModel2.channel = aVar.f27464c;
            packageStatisticModel2.f27454ac = aVar.f27477p;
            packageStatisticModel2.f27455id = aVar.f27479r;
            packageStatisticModel2.downloadRetryTimes = m20460a(aVar.f27484w);
            packageStatisticModel2.downloadUrl = aVar.f27483v;
            packageStatisticModel2.downloadFailRecords = m20464b(aVar.f27484w);
            packageStatisticModel2.downloadDuration = Long.valueOf(aVar.f27486y - aVar.f27485x);
            if (aVar.f27459D) {
                PackageStatisticModel packageStatisticModel3 = new PackageStatisticModel();
                list.add(packageStatisticModel3);
                packageStatisticModel3.accessKey = aVar.f27462a;
                packageStatisticModel3.groupName = aVar.f27463b;
                packageStatisticModel3.statsType = Integer.valueOf(2);
                packageStatisticModel3.f27455id = aVar.f27479r;
                packageStatisticModel3.channel = aVar.f27464c;
                packageStatisticModel3.applyDuration = Long.valueOf(aVar.f27456A - aVar.f27487z);
            } else {
                PackageStatisticModel packageStatisticModel4 = new PackageStatisticModel();
                list.add(packageStatisticModel4);
                packageStatisticModel4.statsType = Integer.valueOf(3);
                packageStatisticModel4.accessKey = aVar.f27462a;
                packageStatisticModel4.groupName = aVar.f27463b;
                packageStatisticModel4.errCode = "500";
                packageStatisticModel4.f27455id = aVar.f27479r;
                packageStatisticModel4.channel = aVar.f27464c;
                packageStatisticModel4.errMsg = aVar.f27461F;
            }
        }
    }
}
