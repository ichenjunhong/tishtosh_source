package com.p683ss.android.ugc.aweme.profile.model;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PostGuideTasks */
public final class PostGuideTasks {
    public final int followCountFromRecommend;
    public final boolean isFollowTaskDone;
    public final boolean isProfileTaskDone;
    public final boolean isShootTaskDone;

    public static /* synthetic */ PostGuideTasks copy$default(PostGuideTasks postGuideTasks, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = postGuideTasks.isFollowTaskDone;
        }
        if ((i2 & 2) != 0) {
            z2 = postGuideTasks.isShootTaskDone;
        }
        if ((i2 & 4) != 0) {
            z3 = postGuideTasks.isProfileTaskDone;
        }
        if ((i2 & 8) != 0) {
            i = postGuideTasks.followCountFromRecommend;
        }
        return postGuideTasks.copy(z, z2, z3, i);
    }

    public final PostGuideTasks copy(boolean z, boolean z2, boolean z3, int i) {
        return new PostGuideTasks(z, z2, z3, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostGuideTasks) {
                PostGuideTasks postGuideTasks = (PostGuideTasks) obj;
                if (this.isFollowTaskDone == postGuideTasks.isFollowTaskDone) {
                    if (this.isShootTaskDone == postGuideTasks.isShootTaskDone) {
                        if (this.isProfileTaskDone == postGuideTasks.isProfileTaskDone) {
                            if (this.followCountFromRecommend == postGuideTasks.followCountFromRecommend) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isFollowTaskDone;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.isShootTaskDone;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isProfileTaskDone;
        if (!z3) {
            i = z3;
        }
        return ((i3 + i) * 31) + Integer.hashCode(this.followCountFromRecommend);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostGuideTasks(isFollowTaskDone=");
        sb.append(this.isFollowTaskDone);
        sb.append(", isShootTaskDone=");
        sb.append(this.isShootTaskDone);
        sb.append(", isProfileTaskDone=");
        sb.append(this.isProfileTaskDone);
        sb.append(", followCountFromRecommend=");
        sb.append(this.followCountFromRecommend);
        sb.append(")");
        return sb.toString();
    }

    public final boolean allAccomplish() {
        if (!this.isFollowTaskDone || !this.isShootTaskDone || !this.isProfileTaskDone) {
            return false;
        }
        return true;
    }

    public final int taskCountDone() {
        return (this.isFollowTaskDone ? 1 : 0) + (this.isShootTaskDone ? 1 : 0) + (this.isProfileTaskDone ? 1 : 0);
    }

    public PostGuideTasks(boolean z, boolean z2, boolean z3, int i) {
        this.isFollowTaskDone = z;
        this.isShootTaskDone = z2;
        this.isProfileTaskDone = z3;
        this.followCountFromRecommend = i;
    }

    public /* synthetic */ PostGuideTasks(boolean z, boolean z2, boolean z3, int i, int i2, C52707g gVar) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        this(z, z2, z3, i);
    }
}
