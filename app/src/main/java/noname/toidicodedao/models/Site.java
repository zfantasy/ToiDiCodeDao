package noname.toidicodedao.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by zfant on 5/25/2016.
 */
public class Site {
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("jetpack")
    @Expose
    private Boolean jetpack;
    @SerializedName("subscribers_count")
    @Expose
    private Integer subscribersCount;
    @SerializedName("lang")
    @Expose
    private Boolean lang;
    @SerializedName("icon")
    @Expose
    private Map<String, String> icon;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("visible")
    @Expose
    private Object visible;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_following")
    @Expose
    private Boolean isFollowing;

    /**
     * No args constructor for use in serialization
     *
     */
    public Site() {
    }

    /**
     *
     * @param icon
     * @param logo
     * @param visible
     * @param uRL
     * @param subscribersCount
     * @param iD
     * @param lang
     * @param jetpack
     * @param isPrivate
     * @param description
     * @param name
     * @param isFollowing
     */
    public Site(Integer iD, String name, String description, String uRL, Boolean jetpack, Integer subscribersCount, Boolean lang, Map icon, Logo logo, Object visible, Boolean isPrivate, Boolean isFollowing) {
        this.iD = iD;
        this.name = name;
        this.description = description;
        this.uRL = uRL;
        this.jetpack = jetpack;
        this.subscribersCount = subscribersCount;
        this.lang = lang;
        this.icon = icon;
        this.logo = logo;
        this.visible = visible;
        this.isPrivate = isPrivate;
        this.isFollowing = isFollowing;
    }

    /**
     *
     * @return
     * The iD
     */
    public Integer getID() {
        return iD;
    }

    /**
     *
     * @param iD
     * The ID
     */
    public void setID(Integer iD) {
        this.iD = iD;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The uRL
     */
    public String getURL() {
        return uRL;
    }

    /**
     *
     * @param uRL
     * The URL
     */
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     *
     * @return
     * The jetpack
     */
    public Boolean getJetpack() {
        return jetpack;
    }

    /**
     *
     * @param jetpack
     * The jetpack
     */
    public void setJetpack(Boolean jetpack) {
        this.jetpack = jetpack;
    }

    /**
     *
     * @return
     * The subscribersCount
     */
    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    /**
     *
     * @param subscribersCount
     * The subscribers_count
     */
    public void setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    /**
     *
     * @return
     * The lang
     */
    public Boolean getLang() {
        return lang;
    }

    /**
     *
     * @param lang
     * The lang
     */
    public void setLang(Boolean lang) {
        this.lang = lang;
    }

    /**
     *
     * @return
     * The icon
     */
    public Map<String, String> getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(Map icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The logo
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     * The logo
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    /**
     *
     * @return
     * The visible
     */
    public Object getVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     * The visible
     */
    public void setVisible(Object visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     * The isPrivate
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     *
     * @param isPrivate
     * The is_private
     */
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     *
     * @return
     * The isFollowing
     */
    public Boolean getIsFollowing() {
        return isFollowing;
    }

    /**
     *
     * @param isFollowing
     * The is_following
     */
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

}
