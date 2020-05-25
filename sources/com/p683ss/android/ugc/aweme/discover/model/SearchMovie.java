package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMovie */
public final class SearchMovie implements Serializable {
    @C17952c(mo34828a = "cover_video")
    private Aweme aweme;
    @C17952c(mo34828a = "banner")
    private MovieBanner banner;
    @C17952c(mo34828a = "bg_color")
    private String bgColor;
    @C17952c(mo34828a = "center_color")
    private String centerColor;
    @C17952c(mo34828a = "center_color_ratio")
    private Float centerColorRatio;
    @C17952c(mo34828a = "config")
    private Config config;
    private String docId = "";
    private int feedType;
    @C17952c(mo34828a = "movie")
    private Movie movie;
    @C17952c(mo34828a = "movie_module")
    private MovieModule movieModule;
    @C17952c(mo34828a = "movie_source")
    private List<MovieSource> movieSources;
    @C17952c(mo34828a = "name")
    private String name;
    private int rank;

    public final Config getConfig() {
        return this.config;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final int getFeedType() {
        return this.feedType;
    }

    public final Movie getMovie() {
        return this.movie;
    }

    public final MovieModule getMovieModule() {
        return this.movieModule;
    }

    public final List<MovieSource> getMovieSources() {
        return this.movieSources;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Aweme getAweme() {
        Aweme aweme2 = this.aweme;
        if (aweme2 == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getAweme();
            }
            aweme2 = null;
        }
        return aweme2;
    }

    public final MovieBanner getBanner() {
        MovieBanner movieBanner = this.banner;
        if (movieBanner == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getBanner();
            }
            movieBanner = null;
        }
        return movieBanner;
    }

    public final String getBgColor() {
        String str = this.bgColor;
        if (str == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getBgColor();
            }
            str = null;
        }
        return str;
    }

    public final String getCenterColor() {
        String str = this.centerColor;
        if (str == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getCenterColor();
            }
            str = null;
        }
        return str;
    }

    public final Float getCenterColorRatio() {
        Float f = this.centerColorRatio;
        if (f == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getCenterColorRatio();
            }
            f = null;
        }
        return f;
    }

    public final String getName() {
        String str = this.name;
        if (str == null) {
            Config config2 = this.config;
            if (config2 != null) {
                return config2.getName();
            }
            str = null;
        }
        return str;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setBanner(MovieBanner movieBanner) {
        this.banner = movieBanner;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setCenterColor(String str) {
        this.centerColor = str;
    }

    public final void setCenterColorRatio(Float f) {
        this.centerColorRatio = f;
    }

    public final void setConfig(Config config2) {
        this.config = config2;
    }

    public final void setFeedType(int i) {
        this.feedType = i;
    }

    public final void setMovie(Movie movie2) {
        this.movie = movie2;
    }

    public final void setMovieModule(MovieModule movieModule2) {
        this.movieModule = movieModule2;
    }

    public final void setMovieSources(List<MovieSource> list) {
        this.movieSources = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setDocId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.docId = str;
    }
}
