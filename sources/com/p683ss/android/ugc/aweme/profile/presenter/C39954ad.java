package com.p683ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ad */
public final class C39954ad implements C9382a, C39984r {

    /* renamed from: a */
    public boolean f101836a;

    /* renamed from: b */
    public boolean f101837b;

    /* renamed from: c */
    public boolean f101838c;

    /* renamed from: d */
    public C9381g f101839d;

    /* renamed from: e */
    public int f101840e;

    /* renamed from: f */
    private boolean f101841f;

    /* renamed from: g */
    private boolean f101842g;

    /* renamed from: h */
    private boolean f101843h;

    /* renamed from: i */
    private boolean f101844i;

    /* renamed from: j */
    private boolean f101845j;

    /* renamed from: k */
    private boolean f101846k;

    /* renamed from: l */
    private boolean f101847l;

    /* renamed from: m */
    private boolean f101848m;

    /* renamed from: n */
    private boolean f101849n;

    /* renamed from: o */
    private boolean f101850o;

    /* renamed from: p */
    private C39985s f101851p;

    public C39954ad() {
        this(0);
    }

    /* renamed from: a */
    public final void mo81850a(C39985s sVar) {
        this.f101851p = sVar;
    }

    /* renamed from: a */
    public final void mo81851a(String str) {
        if (!this.f101843h) {
            this.f101843h = true;
            C20854a.m53167g().updateNickName(this.f101839d, str, this.f101840e);
        }
    }

    /* renamed from: b */
    public final void mo81855b(String str) {
        if (!this.f101844i) {
            this.f101844i = true;
            C20854a.m53167g().updateAvatarUri(this.f101839d, str, this.f101840e);
        }
    }

    public C39954ad(int i) {
        this.f101840e = i;
        this.f101836a = false;
        this.f101841f = false;
        this.f101842g = false;
        this.f101843h = false;
        this.f101837b = false;
        this.f101844i = false;
        this.f101845j = false;
        this.f101846k = false;
        this.f101847l = false;
        this.f101848m = false;
        this.f101849n = false;
        this.f101850o = false;
        this.f101839d = new C9381g(this);
    }

    /* renamed from: a */
    public final void mo81853a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f101836a) {
            this.f101836a = true;
            map.put("page_from", String.valueOf(this.f101840e));
            C20854a.m53167g().updateUserInfo(this.f101839d, map);
        }
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            m88736a((Exception) message.obj, message.what);
        } else if (message.obj instanceof User) {
            m88735a((User) message.obj, message.what);
        } else {
            if (message.obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) message.obj;
                if (userResponse.getAction() == 1) {
                    m88737a(userResponse.status_msg, true);
                    m88736a((Exception) null, message.what);
                } else if (userResponse.getAction() == 2) {
                    m88737a(userResponse.status_msg, false);
                    m88736a((Exception) null, message.what);
                } else {
                    m88735a(userResponse.getUser(), message.what);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo81854a(boolean z) {
        if (!this.f101847l) {
            this.f101847l = true;
            C20854a.m53167g().updateSecret(this.f101839d, z, this.f101840e);
        }
    }

    /* renamed from: a */
    private void m88737a(String str, boolean z) {
        this.f101836a = false;
        this.f101843h = false;
        if (this.f101851p != null) {
            this.f101851p.mo54361a(str, z);
        }
    }

    /* renamed from: a */
    public final void mo81852a(String str, int i) {
        if (!this.f101845j) {
            this.f101845j = true;
            C20854a.m53167g().updateCoverUri(this.f101839d, str, i, this.f101840e);
        }
    }

    /* renamed from: a */
    private void m88736a(Exception exc, int i) {
        if (i == 112) {
            this.f101836a = false;
        } else if (i == 116) {
            this.f101838c = false;
        } else if (i != 122) {
            switch (i) {
                case 0:
                    this.f101843h = false;
                    break;
                case 1:
                    this.f101842g = false;
                    break;
                case 2:
                    this.f101837b = false;
                    break;
                case 3:
                    this.f101841f = false;
                    break;
                case 4:
                    this.f101844i = false;
                    break;
                case 5:
                    this.f101846k = false;
                    break;
                default:
                    switch (i) {
                        case 7:
                            this.f101848m = false;
                            break;
                        case 8:
                            this.f101849n = false;
                            break;
                        case 9:
                            this.f101850o = false;
                            break;
                        case 10:
                        case 11:
                            this.f101845j = false;
                            break;
                    }
            }
        } else {
            this.f101847l = false;
        }
        if (this.f101851p != null && exc != null) {
            this.f101851p.mo54360a(exc, i);
            if (!this.f101844i && !this.f101841f && !this.f101842g && !this.f101843h && !this.f101837b && !this.f101838c && !this.f101836a && !this.f101847l && !this.f101845j) {
                this.f101851p.mo54362a(false);
            }
        }
    }

    /* renamed from: a */
    private void m88735a(User user, int i) {
        if (user != null) {
            if (i == 112) {
                UrlModel avatarVideoUri = user.getAvatarVideoUri();
                if (!(avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0)) {
                    C20854a.m53167g().getCurUser().setAvatarUpdateReminder(false);
                }
                this.f101836a = false;
                C20854a.m53167g().updateCurUser(user);
            } else if (i == 116) {
                C20854a.m53167g().getCurUser().setNicknameUpdateReminder(false);
                this.f101838c = false;
                C20854a.m53167g().updateCurUserId(user.getUniqueId());
            } else if (i != 122) {
                switch (i) {
                    case 0:
                        this.f101843h = false;
                        C20854a.m53167g().updateCurNickname(user.getNickname());
                        break;
                    case 1:
                        this.f101842g = false;
                        C20854a.m53167g().updateCurGender(user.getShowGenderStrategy(), user.getGender());
                        break;
                    case 2:
                        this.f101837b = false;
                        C20854a.m53167g().updateCurSignature(user.getSignature());
                        break;
                    case 3:
                        this.f101841f = false;
                        C20854a.m53167g().updateCurBirthday(user.getBirthday(), user.getBirthdayHideLevel());
                        break;
                    case 4:
                        C20854a.m53167g().getCurUser().setAvatarUpdateReminder(false);
                        this.f101844i = false;
                        C20854a.m53167g().updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
                        break;
                    case 5:
                        this.f101846k = false;
                        C20854a.m53167g().updateCurAllowStatus(user.getAllowStatus());
                        break;
                    default:
                        switch (i) {
                            case 7:
                                this.f101848m = false;
                                C20854a.m53167g().updateCurLocation(user.getIsoCountryCode(), user.getCountry(), user.getProvince(), user.getCityName(), user.getDistrict(), user.hideCity);
                                break;
                            case 8:
                                this.f101849n = false;
                                break;
                            case 9:
                                this.f101850o = false;
                                break;
                            case 10:
                                this.f101845j = false;
                                C20854a.m53167g().updateCurCover(user.getCoverUrls());
                                break;
                            case 11:
                                this.f101845j = false;
                                C20854a.m53167g().updateCurVideoCover(user.getVideoCover());
                                break;
                        }
                }
            } else {
                this.f101847l = false;
                C20854a.m53167g().updateCurSecret(user.isSecret());
            }
            if (this.f101851p != null) {
                this.f101851p.mo54359a(user, i);
                if (!this.f101844i && !this.f101841f && !this.f101842g && !this.f101843h && !this.f101837b && !this.f101838c && !this.f101836a && !this.f101847l && !this.f101845j) {
                    this.f101851p.mo54362a(true);
                }
            }
        }
    }
}
