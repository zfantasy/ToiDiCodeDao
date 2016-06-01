package noname.toidicodedao.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zfant on 5/25/2016.
 */
public class Post implements Serializable {

    private static final long serialVersionUID = 2310640779687082782L;
    @SerializedName("ID")
    @Expose
    private Long id;
    @SerializedName("site_ID")
    @Expose
    private Long siteID;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("short_URL")
    @Expose
    private String shortURL;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;

    /**
     * No args constructor for use in serialization
     *
     */
    public Post() {
    }

    /**
     *
     * @param guid
     * @param content
     * @param author
     * @param shortURL
     * @param title
     * @param siteID
     * @param status
     * @param excerpt
     * @param uRL
     * @param slug
     * @param date
     * @param id
     * @param modified
     */
    public Post(Long id, Long siteID, Author author, Date date, String modified, String title, String uRL, String shortURL, String content, String excerpt, String slug, String guid, String status) {
        this.id = id;
        this.siteID = siteID;
        this.author = author;
        this.date = date;
        this.modified = modified;
        this.title = title;
        this.uRL = uRL;
        this.shortURL = shortURL;
        this.content = content;
        this.excerpt = excerpt;
        this.slug = slug;
        this.guid = guid;
        this.status = status;
    }

    /**
     *
     * @return
     * The id
     */
    public Long getID() {
        return id;
    }

    /**
     *
     * @param iD
     * The ID
     */
    public void setID(Long iD) {
        this.id = iD;
    }

    /**
     *
     * @return
     * The siteID
     */
    public Long getSiteID() {
        return siteID;
    }

    /**
     *
     * @param siteID
     * The site_ID
     */
    public void setSiteID(Long siteID) {
        this.siteID = siteID;
    }

    /**
     *
     * @return
     * The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The date
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * The shortURL
     */
    public String getShortURL() {
        return shortURL;
    }

    /**
     *
     * @param shortURL
     * The short_URL
     */
    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    /**
     *
     * @return
     * The content
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return
     * The excerpt
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     *
     * @param excerpt
     * The excerpt
     */
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     * The guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     *
     * @param guid
     * The guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }
}
