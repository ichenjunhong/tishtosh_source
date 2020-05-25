package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Movie */
public final class Movie implements Serializable {
    private final String MOVIE_RANK_URL = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Frank%3Fhide_nav_bar%3D1%26should_full_screen%3D1%26type%3Dmovie&hide_nav_bar=1&should_full_screen=1&type=movie&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_rank%26bundle%3Dindex.js%26module_name%3Dpage_rank%26hide_nav_bar%3D1%26loading_bgcolor%3D161823%26type%3Dmovie";
    private final String TVSERIES_RANK_URL = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Frank%3Fhide_nav_bar%3D1%26should_full_screen%3D1%26type%3DtvSeries&hide_nav_bar=1&should_full_screen=1&type=tvSeries&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_rank%26bundle%3Dindex.js%26module_name%3Dpage_rank%26hide_nav_bar%3D1%26loading_bgcolor%3D161823%26type%3DtvSeries";
    private final String TVSHOW_RANK_URL = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Frank%3Fhide_nav_bar%3D1%26should_full_screen%3D1%26type%3DtvShow&hide_nav_bar=1&should_full_screen=1&type=tvShow&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_rank%26bundle%3Dindex.js%26module_name%3Dpage_rank%26hide_nav_bar%3D1%26loading_bgcolor%3D161823%26type%3DtvShow";
    @C17952c(mo34828a = "actor")
    private String actor;
    @C17952c(mo34828a = "challenge_id")
    private String challengeId;
    @C17952c(mo34828a = "cid")
    private String cid;
    @C17952c(mo34828a = "director")
    private String director;
    @C17952c(mo34828a = "dtime")
    private String dtime;
    @C17952c(mo34828a = "episodes")
    private int episodes;
    @C17952c(mo34828a = "img")
    private String img;
    @C17952c(mo34828a = "is_medium_anchor")
    private Boolean isMediumAnchor;
    private boolean isNewStyleCard;
    @C17952c(mo34828a = "is_collect")
    private boolean is_collect;
    @C17952c(mo34828a = "light_app_tickets_url")
    private String light_app_tickets_url;
    @C17952c(mo34828a = "light_app_url")
    private String light_app_url;
    @C17952c(mo34828a = "loc")
    private String loc;
    @C17952c(mo34828a = "maoyan_score")
    private String maoyan_score;
    @C17952c(mo34828a = "maoyan_score_url")
    private String maoyan_score_url;
    @C17952c(mo34828a = "medium_type")
    private int medium_type;
    @C17952c(mo34828a = "medium_ui_style")
    private int medium_ui_style = -1;
    @C17952c(mo34828a = "rank")
    private String rank;
    @C17952c(mo34828a = "rate_text")
    private String rateText;
    @C17952c(mo34828a = "schema")
    private String schema;
    @C17952c(mo34828a = "showurl")
    private String showurl;
    @C17952c(mo34828a = "stat")
    private Integer stat;
    @C17952c(mo34828a = "stat_text")
    private String statText;
    @C17952c(mo34828a = "summery")
    private String summery;
    @C17952c(mo34828a = "tickets_url")
    private String tickets_url;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "tmaid")
    private String tmaid;
    @C17952c(mo34828a = "type")
    private String type;
    @C17952c(mo34828a = "uptime")
    private String uptime;
    @C17952c(mo34828a = "url")
    private String url;
    @C17952c(mo34828a = "wish")
    private Integer wish;

    public final String getActor() {
        return this.actor;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDirector() {
        return this.director;
    }

    public final String getDtime() {
        return this.dtime;
    }

    public final int getEpisodes() {
        return this.episodes;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getLight_app_tickets_url() {
        return this.light_app_tickets_url;
    }

    public final String getLight_app_url() {
        return this.light_app_url;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final String getMaoyan_score() {
        return this.maoyan_score;
    }

    public final String getMaoyan_score_url() {
        return this.maoyan_score_url;
    }

    public final int getMedium_type() {
        return this.medium_type;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRateText() {
        return this.rateText;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getShowurl() {
        return this.showurl;
    }

    public final Integer getStat() {
        return this.stat;
    }

    public final String getStatText() {
        return this.statText;
    }

    public final String getSummery() {
        return this.summery;
    }

    public final String getTickets_url() {
        return this.tickets_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTmaid() {
        return this.tmaid;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUptime() {
        return this.uptime;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWish() {
        return this.wish;
    }

    public final Boolean isMediumAnchor() {
        return this.isMediumAnchor;
    }

    public final boolean isNewStyleCard() {
        return this.isNewStyleCard;
    }

    public final boolean is_collect() {
        return this.is_collect;
    }

    public final float getMaoyanScore() {
        try {
            return Float.parseFloat(this.maoyan_score) / 2.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final int getMovieRank() {
        try {
            return Integer.parseInt(this.rank);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean isMovie() {
        if (this.medium_type == 3) {
            return true;
        }
        return false;
    }

    public final String getMovieRankText() {
        if (this.medium_type == 3) {
            return "电影榜";
        }
        if (this.medium_type == 4) {
            return "综艺榜";
        }
        if (this.medium_type == 1) {
            return "剧集榜";
        }
        return "";
    }

    public final String getMovieRankUrl() {
        if (this.medium_type == 3) {
            return this.MOVIE_RANK_URL;
        }
        if (this.medium_type == 4) {
            return this.TVSHOW_RANK_URL;
        }
        if (this.medium_type == 1) {
            return this.TVSERIES_RANK_URL;
        }
        return "";
    }

    public final int getMedium_ui_style() {
        if (this.medium_ui_style != -1) {
            return this.medium_ui_style;
        }
        if (this.medium_type == 1 || this.medium_type == 9) {
            return 1;
        }
        if (this.medium_type == 4 || this.medium_type == 8) {
            return 2;
        }
        return 0;
    }

    public final void setActor(String str) {
        this.actor = str;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDirector(String str) {
        this.director = str;
    }

    public final void setDtime(String str) {
        this.dtime = str;
    }

    public final void setEpisodes(int i) {
        this.episodes = i;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final void setLight_app_tickets_url(String str) {
        this.light_app_tickets_url = str;
    }

    public final void setLight_app_url(String str) {
        this.light_app_url = str;
    }

    public final void setLoc(String str) {
        this.loc = str;
    }

    public final void setMaoyan_score(String str) {
        this.maoyan_score = str;
    }

    public final void setMaoyan_score_url(String str) {
        this.maoyan_score_url = str;
    }

    public final void setMediumAnchor(Boolean bool) {
        this.isMediumAnchor = bool;
    }

    public final void setMedium_type(int i) {
        this.medium_type = i;
    }

    public final void setMedium_ui_style(int i) {
        this.medium_ui_style = i;
    }

    public final void setNewStyleCard(boolean z) {
        this.isNewStyleCard = z;
    }

    public final void setRank(String str) {
        this.rank = str;
    }

    public final void setRateText(String str) {
        this.rateText = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowurl(String str) {
        this.showurl = str;
    }

    public final void setStat(Integer num) {
        this.stat = num;
    }

    public final void setStatText(String str) {
        this.statText = str;
    }

    public final void setSummery(String str) {
        this.summery = str;
    }

    public final void setTickets_url(String str) {
        this.tickets_url = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTmaid(String str) {
        this.tmaid = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUptime(String str) {
        this.uptime = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWish(Integer num) {
        this.wish = num;
    }

    public final void set_collect(boolean z) {
        this.is_collect = z;
    }
}
