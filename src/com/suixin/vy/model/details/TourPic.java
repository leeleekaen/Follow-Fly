package com.suixin.vy.model.details;

import java.io.Serializable;
import java.util.List;

public class TourPic implements Serializable{	private static final long serialVersionUID = 1767525986L;	private long likeNum;	private long commentNum;	private String createdTime;	private long distance;	private long weight;	private List<LikedList> likedList;	private String shareUrl;	private String thumbPicUrl;	private long coverWidth;	private List<CommentList> commentList;	private long coverHeight;	private List<String> photoUrls;	private long type;	private String shareTitle;	private List<Object> companyList;	private List<String> thumbPhotoUrls;	private String placeName;	private CreaterUser createrUser;	private String description;	private String picUrl;	private long isLike;	private String guid;	private long isNewOrHot;	private long forwardNum;
	public long getLikeNum() {		return this.likeNum;	}
	public void setLikeNum(long likeNum) {		this.likeNum = likeNum;	}
	public long getCommentNum() {		return this.commentNum;	}
	public void setCommentNum(long commentNum) {		this.commentNum = commentNum;	}
	public String getCreatedTime() {		return this.createdTime;	}
	public void setCreatedTime(String createdTime) {		this.createdTime = createdTime;	}
	public long getDistance() {		return this.distance;	}
	public void setDistance(long distance) {		this.distance = distance;	}
	public long getWeight() {		return this.weight;	}
	public void setWeight(long weight) {		this.weight = weight;	}
	public List<LikedList> getLikedList() {		return this.likedList;	}
	public void setLikedList(List<LikedList> likedList) {		this.likedList = likedList;	}
	public String getShareUrl() {		return this.shareUrl;	}
	public void setShareUrl(String shareUrl) {		this.shareUrl = shareUrl;	}
	public String getThumbPicUrl() {		return this.thumbPicUrl;	}
	public void setThumbPicUrl(String thumbPicUrl) {		this.thumbPicUrl = thumbPicUrl;	}
	public long getCoverWidth() {		return this.coverWidth;	}
	public void setCoverWidth(long coverWidth) {		this.coverWidth = coverWidth;	}
	public List<CommentList> getCommentList() {		return this.commentList;	}
	public void setCommentList(List<CommentList> commentList) {		this.commentList = commentList;	}
	public long getCoverHeight() {		return this.coverHeight;	}
	public void setCoverHeight(long coverHeight) {		this.coverHeight = coverHeight;	}
	public List<String> getPhotoUrls() {		return this.photoUrls;	}
	public void setPhotoUrls(List<String> photoUrls) {		this.photoUrls = photoUrls;	}
	public long getType() {		return this.type;	}
	public void setType(long type) {		this.type = type;	}
	public String getShareTitle() {		return this.shareTitle;	}
	public void setShareTitle(String shareTitle) {		this.shareTitle = shareTitle;	}
	public List<Object> getCompanyList() {		return this.companyList;	}
	public void setCompanyList(List<Object> companyList) {		this.companyList = companyList;	}
	public List<String> getThumbPhotoUrls() {		return this.thumbPhotoUrls;	}
	public void setThumbPhotoUrls(List<String> thumbPhotoUrls) {		this.thumbPhotoUrls = thumbPhotoUrls;	}
	public String getPlaceName() {		return this.placeName;	}
	public void setPlaceName(String placeName) {		this.placeName = placeName;	}
	public CreaterUser getCreaterUser() {		return this.createrUser;	}
	public void setCreaterUser(CreaterUser createrUser) {		this.createrUser = createrUser;	}
	public String getDescription() {		return this.description;	}
	public void setDescription(String description) {		this.description = description;	}
	public String getPicUrl() {		return this.picUrl;	}
	public void setPicUrl(String picUrl) {		this.picUrl = picUrl;	}
	public long getIsLike() {		return this.isLike;	}
	public void setIsLike(long isLike) {		this.isLike = isLike;	}
	public String getGuid() {		return this.guid;	}
	public void setGuid(String guid) {		this.guid = guid;	}
	public long getIsNewOrHot() {		return this.isNewOrHot;	}
	public void setIsNewOrHot(long isNewOrHot) {		this.isNewOrHot = isNewOrHot;	}
	public long getForwardNum() {		return this.forwardNum;	}
	public void setForwardNum(long forwardNum) {		this.forwardNum = forwardNum;	}
	public TourPic() {}
	public TourPic(long likeNum, long commentNum, String createdTime, long distance, long weight, List<LikedList> likedList, String shareUrl, String thumbPicUrl, long coverWidth, List<CommentList> commentList, long coverHeight, List<String> photoUrls, long type, String shareTitle, List<Object> companyList, List<String> thumbPhotoUrls, String placeName, CreaterUser createrUser, String description, String picUrl, long isLike, String guid, long isNewOrHot, long forwardNum){
		super();		this.likeNum = likeNum;		this.commentNum = commentNum;		this.createdTime = createdTime;		this.distance = distance;		this.weight = weight;		this.likedList = likedList;		this.shareUrl = shareUrl;		this.thumbPicUrl = thumbPicUrl;		this.coverWidth = coverWidth;		this.commentList = commentList;		this.coverHeight = coverHeight;		this.photoUrls = photoUrls;		this.type = type;		this.shareTitle = shareTitle;		this.companyList = companyList;		this.thumbPhotoUrls = thumbPhotoUrls;		this.placeName = placeName;		this.createrUser = createrUser;		this.description = description;		this.picUrl = picUrl;		this.isLike = isLike;		this.guid = guid;		this.isNewOrHot = isNewOrHot;		this.forwardNum = forwardNum;
	}
	public String toString() {
		return "TourPic [likeNum = " + likeNum + ", commentNum = " + commentNum + ", createdTime = " + createdTime + ", distance = " + distance + ", weight = " + weight + ", likedList = " + likedList + ", shareUrl = " + shareUrl + ", thumbPicUrl = " + thumbPicUrl + ", coverWidth = " + coverWidth + ", commentList = " + commentList + ", coverHeight = " + coverHeight + ", photoUrls = " + photoUrls + ", type = " + type + ", shareTitle = " + shareTitle + ", companyList = " + companyList + ", thumbPhotoUrls = " + thumbPhotoUrls + ", placeName = " + placeName + ", createrUser = " + createrUser + ", description = " + description + ", picUrl = " + picUrl + ", isLike = " + isLike + ", guid = " + guid + ", isNewOrHot = " + isNewOrHot + ", forwardNum = " + forwardNum + "]";	}
}