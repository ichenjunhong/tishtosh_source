package com.p683ss.android.ugc.aweme.feed.p1717c;

import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.feed.api.BackUpApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30334c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.feed.c.a */
public final class C30161a {

    /* renamed from: a */
    public static final C30161a f78726a = new C30161a();

    private C30161a() {
    }

    /* renamed from: a */
    public static final void m70767a(String str, int i) {
        C52711k.m112240b(str, "aids");
        try {
            AwemeStatisticsResponse awemeStatisticsResponse = (AwemeStatisticsResponse) BackUpApi.f78667a.queryAwemeStatistics(str, i).get();
            List statisticsList = awemeStatisticsResponse.getStatisticsList();
            if (statisticsList != null) {
                Iterator it = C52575l.m112095a((Collection) statisticsList).iterator();
                while (it.hasNext()) {
                    AwemeStatisticsBackup awemeStatisticsBackup = (AwemeStatisticsBackup) statisticsList.get(((C52549aa) it).mo110114a());
                    if (awemeStatisticsBackup != null) {
                        String aid = awemeStatisticsBackup.getAid();
                        Aweme awemeById = C23324d.m57378a().getAwemeById(aid);
                        if (awemeById == null) {
                            StringBuilder sb = new StringBuilder("FeedBackupHelper find that aweme is null!");
                            sb.append(aid);
                            C32458a.m75141a(4, "FeedBackupHelper", sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder("FeedBackupHelper start to update this aweme:");
                            sb2.append(awemeStatisticsBackup);
                            C32458a.m75141a(4, "FeedBackupHelper", sb2.toString());
                            if (i == 2) {
                                if (awemeById.getStatistics() == null) {
                                    awemeById.setStatistics(new AwemeStatistics());
                                }
                                Long commentCount = awemeStatisticsBackup.getCommentCount();
                                if (commentCount == null) {
                                    C52711k.m112234a();
                                }
                                if (commentCount.longValue() > 0) {
                                    AwemeStatistics statistics = awemeById.getStatistics();
                                    C52711k.m112236a((Object) statistics, "aweme.statistics");
                                    statistics.setAid(aid);
                                    AwemeStatistics statistics2 = awemeById.getStatistics();
                                    C52711k.m112236a((Object) statistics2, "aweme.statistics");
                                    Long commentCount2 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount2 == null) {
                                        C52711k.m112234a();
                                    }
                                    statistics2.setCommentCount(commentCount2.longValue());
                                }
                            } else if (i == 3 || i == 1) {
                                if (awemeById.getStatistics() == null) {
                                    awemeById.setStatistics(new AwemeStatistics());
                                }
                                AwemeStatistics statistics3 = awemeById.getStatistics();
                                if (statistics3 != null) {
                                    statistics3.setAid(awemeStatisticsBackup.getAid());
                                    Long commentCount3 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount3 == null) {
                                        C52711k.m112234a();
                                    }
                                    if (commentCount3.longValue() > 0) {
                                        Long commentCount4 = awemeStatisticsBackup.getCommentCount();
                                        if (commentCount4 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setCommentCount(commentCount4.longValue());
                                    }
                                    Long diggCount = awemeStatisticsBackup.getDiggCount();
                                    if (diggCount == null) {
                                        C52711k.m112234a();
                                    }
                                    if (diggCount.longValue() > 0) {
                                        Long diggCount2 = awemeStatisticsBackup.getDiggCount();
                                        if (diggCount2 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setDiggCount(diggCount2.longValue());
                                    }
                                    Long playCount = awemeStatisticsBackup.getPlayCount();
                                    if (playCount == null) {
                                        C52711k.m112234a();
                                    }
                                    if (playCount.longValue() > 0) {
                                        Long playCount2 = awemeStatisticsBackup.getPlayCount();
                                        if (playCount2 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setPlayCount(playCount2.longValue());
                                    }
                                    Long downloadCount = awemeStatisticsBackup.getDownloadCount();
                                    if (downloadCount == null) {
                                        C52711k.m112234a();
                                    }
                                    if (downloadCount.longValue() > 0) {
                                        Long downloadCount2 = awemeStatisticsBackup.getDownloadCount();
                                        if (downloadCount2 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setDownloadCount(downloadCount2.longValue());
                                    }
                                    Long shareCount = awemeStatisticsBackup.getShareCount();
                                    if (shareCount == null) {
                                        C52711k.m112234a();
                                    }
                                    if (shareCount.longValue() > 0) {
                                        Long shareCount2 = awemeStatisticsBackup.getShareCount();
                                        if (shareCount2 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setShareCount(shareCount2.longValue());
                                    }
                                    Long forwardCount = awemeStatisticsBackup.getForwardCount();
                                    if (forwardCount == null) {
                                        C52711k.m112234a();
                                    }
                                    if (forwardCount.longValue() > 0) {
                                        Long forwardCount2 = awemeStatisticsBackup.getForwardCount();
                                        if (forwardCount2 == null) {
                                            C52711k.m112234a();
                                        }
                                        statistics3.setForwardCount(forwardCount2.longValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (statisticsList == null) {
                StringBuilder sb3 = new StringBuilder("FeedBackupHelper get rsp,but list is null. rsp content :");
                sb3.append(awemeStatisticsResponse);
                C32458a.m75141a(4, "FeedBackupHelper", sb3.toString());
                return;
            }
            Iterable iterable = statisticsList;
            Map linkedHashMap = new LinkedHashMap(C52753d.m112321c(C52550ab.m112044a(C52575l.m112104a(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(((AwemeStatisticsBackup) next).getAid(), (AwemeStatisticsBackup) next);
            }
            C47718bf.m103288a(new C30334c(linkedHashMap, i));
        } catch (ExecutionException e) {
            C32458a.m75143a((Exception) C23453a.getCompatibleException(e));
        }
    }
}
