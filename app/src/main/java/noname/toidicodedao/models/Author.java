package noname.toidicodedao.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by zfant on 5/25/2016.
 */
public class Author implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("ID")
    @Expose
    private Long iD;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("email")
    @Expose
    private Boolean email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("nice_name")
    @Expose
    private String niceName;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("avatar_URL")
    @Expose
    private String avatarURL;
    @SerializedName("profile_URL")
    @Expose
    private String profileURL;
    @SerializedName("site_ID")
    @Expose
    private Long siteID;

    /**
     * No args constructor for use in serialization
     *
     */
    public Author() {
    }

    /**
     *
     * @param niceName
     * @param lastName
     * @param siteID
     * @param email
     * @param uRL
     * @param name
     * @param login
     * @param profileURL
     * @param avatarURL
     * @param firstName
     * @param iD
     */
    public Author(Long iD, String login, Boolean email, String name, String firstName, String lastName, String niceName, String uRL, String avatarURL, String profileURL, Long siteID) {
        this.iD = iD;
        this.login = login;
        this.email = email;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.niceName = niceName;
        this.uRL = uRL;
        this.avatarURL = avatarURL;
        this.profileURL = profileURL;
        this.siteID = siteID;
    }

    /**
     *
     * @return
     * The iD
     */
    public Long getID() {
        return iD;
    }

    /**
     *
     * @param iD
     * The ID
     */
    public void setID(Long iD) {
        this.iD = iD;
    }

    /**
     *
     * @return
     * The login
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     * The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     * The email
     */
    public Boolean getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(Boolean email) {
        this.email = email;
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
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The niceName
     */
    public String getNiceName() {
        return niceName;
    }

    /**
     *
     * @param niceName
     * The nice_name
     */
    public void setNiceName(String niceName) {
        this.niceName = niceName;
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
     * The avatarURL
     */
    public String getAvatarURL() {
        return avatarURL;
    }

    /**
     *
     * @param avatarURL
     * The avatar_URL
     */
    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    /**
     *
     * @return
     * The profileURL
     */
    public String getProfileURL() {
        return profileURL;
    }

    /**
     *
     * @param profileURL
     * The profile_URL
     */
    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
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

}
